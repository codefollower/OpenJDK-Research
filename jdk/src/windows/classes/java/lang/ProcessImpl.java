/*
 * Copyright (c) 1995, 2013, Oracle and/or its affiliates. All rights reserved.
 * DO NOT ALTER OR REMOVE COPYRIGHT NOTICES OR THIS FILE HEADER.
 *
 * This code is free software; you can redistribute it and/or modify it
 * under the terms of the GNU General Public License version 2 only, as
 * published by the Free Software Foundation.  Oracle designates this
 * particular file as subject to the "Classpath" exception as provided
 * by Oracle in the LICENSE file that accompanied this code.
 *
 * This code is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or
 * FITNESS FOR A PARTICULAR PURPOSE.  See the GNU General Public License
 * version 2 for more details (a copy is included in the LICENSE file that
 * accompanied this code).
 *
 * You should have received a copy of the GNU General Public License version
 * 2 along with this work; if not, write to the Free Software Foundation,
 * Inc., 51 Franklin St, Fifth Floor, Boston, MA 02110-1301 USA.
 *
 * Please contact Oracle, 500 Oracle Parkway, Redwood Shores, CA 94065 USA
 * or visit www.oracle.com if you need additional information or have any
 * questions.
 */

package java.lang;

import java.io.IOException;
import java.io.File;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileDescriptor;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.lang.ProcessBuilder.Redirect;
import java.security.AccessController;
import java.security.PrivilegedAction;
import java.util.ArrayList;
import java.util.concurrent.TimeUnit;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* This class is for the exclusive use of ProcessBuilder.start() to
 * create new processes.
 *
 * @author Martin Buchholz
 * @since   1.5
 */

final class ProcessImpl extends Process {
    private static final sun.misc.JavaIOFileDescriptorAccess fdAccess
        = sun.misc.SharedSecrets.getJavaIOFileDescriptorAccess();

    /**
     * Open a file for writing. If {@code append} is {@code true} then the file
     * is opened for atomic append directly and a FileOutputStream constructed
     * with the resulting handle. This is because a FileOutputStream created
     * to append to a file does not open the file in a manner that guarantees
     * that writes by the child process will be atomic.
     */
    private static FileOutputStream newFileOutputStream(File f, boolean append)
        throws IOException
    {
        if (append) {
            String path = f.getPath();
            SecurityManager sm = System.getSecurityManager();
            if (sm != null)
                sm.checkWrite(path);
            long handle = openForAtomicAppend(path);
            final FileDescriptor fd = new FileDescriptor();
            fdAccess.setHandle(fd, handle);
            return AccessController.doPrivileged(
                new PrivilegedAction<FileOutputStream>() {
                    public FileOutputStream run() {
                        return new FileOutputStream(fd);
                    }
                }
            );
        } else {
            return new FileOutputStream(f);
        }
    }

    // System-dependent portion of ProcessBuilder.start()
    static Process start(String cmdarray[],
                         java.util.Map<String,String> environment,
                         String dir,
                         ProcessBuilder.Redirect[] redirects,
                         boolean redirectErrorStream)
        throws IOException
    {
        String envblock = ProcessEnvironment.toEnvironmentBlock(environment);

        FileInputStream  f0 = null;
        FileOutputStream f1 = null;
        FileOutputStream f2 = null;

        try {
            long[] stdHandles;
            if (redirects == null) {
                stdHandles = new long[] { -1L, -1L, -1L };
            } else {
                stdHandles = new long[3];

                if (redirects[0] == Redirect.PIPE)
                    stdHandles[0] = -1L;
                else if (redirects[0] == Redirect.INHERIT)
                    stdHandles[0] = fdAccess.getHandle(FileDescriptor.in);
                else {
                    f0 = new FileInputStream(redirects[0].file());
                    stdHandles[0] = fdAccess.getHandle(f0.getFD());
                }

                if (redirects[1] == Redirect.PIPE)
                    stdHandles[1] = -1L;
                else if (redirects[1] == Redirect.INHERIT)
                    stdHandles[1] = fdAccess.getHandle(FileDescriptor.out);
                else {
                    f1 = newFileOutputStream(redirects[1].file(),
                                             redirects[1].append());
                    stdHandles[1] = fdAccess.getHandle(f1.getFD());
                }

                if (redirects[2] == Redirect.PIPE)
                    stdHandles[2] = -1L;
                else if (redirects[2] == Redirect.INHERIT)
                    stdHandles[2] = fdAccess.getHandle(FileDescriptor.err);
                else {
                    f2 = newFileOutputStream(redirects[2].file(),
                                             redirects[2].append());
                    stdHandles[2] = fdAccess.getHandle(f2.getFD());
                }
            }

            return new ProcessImpl(cmdarray, envblock, dir,
                                   stdHandles, redirectErrorStream);
        } finally {
            // In theory, close() can throw IOException
            // (although it is rather unlikely to happen here)
            try { if (f0 != null) f0.close(); }
            finally {
                try { if (f1 != null) f1.close(); }
                finally { if (f2 != null) f2.close(); }
            }
        }

    }

    private static class LazyPattern {
        // Escape-support version:
        //    "(\")((?:\\\\\\1|.)+?)\\1|([^\\s\"]+)";
        private static final Pattern PATTERN =
            Pattern.compile("[^\\s\"]+|\"[^\"]*\"");
    };

    /* Parses the command string parameter into the executable name and
     * program arguments.
     *
     * The command string is broken into tokens. The token separator is a space
     * or quota character. The space inside quotation is not a token separator.
     * There are no escape sequences.
     */
    private static String[] getTokensFromCommand(String command) {
        ArrayList<String> matchList = new ArrayList<>(8);
        Matcher regexMatcher = LazyPattern.PATTERN.matcher(command);
        while (regexMatcher.find())
            matchList.add(regexMatcher.group());
        return matchList.toArray(new String[matchList.size()]);
    }

    private static final int VERIFICATION_CMD_BAT = 0;
    private static final int VERIFICATION_WIN32 = 1;
    private static final int VERIFICATION_LEGACY = 2;
    private static final char ESCAPE_VERIFICATION[][] = {
        // We guarantee the only command file execution for implicit [cmd.exe] run.
        //    http://technet.microsoft.com/en-us/library/bb490954.aspx
        {' ', '\t', '<', '>', '&', '|', '^'},

        {' ', '\t', '<', '>'},
        {' ', '\t'}
    };

    private static String createCommandLine(int verificationType,
                                     final String executablePath,
                                     final String cmd[])
    {
        StringBuilder cmdbuf = new StringBuilder(80);

        cmdbuf.append(executablePath);

        for (int i = 1; i < cmd.length; ++i) {
            cmdbuf.append(' ');
            String s = cmd[i];
            if (needsEscaping(verificationType, s)) {
                cmdbuf.append('"').append(s);

                // The code protects the [java.exe] and console command line
                // parser, that interprets the [\"] combination as an escape
                // sequence for the ["] char.
                //     http://msdn.microsoft.com/en-us/library/17w5ykft.aspx
                //
                // If the argument is an FS path, doubling of the tail [\]
                // char is not a problem for non-console applications.
                //
                // The [\"] sequence is not an escape sequence for the [cmd.exe]
                // command line parser. The case of the [""] tail escape
                // sequence could not be realized due to the argument validation
                // procedure.
                if ((verificationType != VERIFICATION_CMD_BAT) && s.endsWith("\\")) {
                    cmdbuf.append('\\');
                }
                cmdbuf.append('"');
            } else {
                cmdbuf.append(s);
            }
        }
        return cmdbuf.toString();
    }

    private static boolean isQuoted(boolean noQuotesInside, String arg,
            String errorMessage) {
        int lastPos = arg.length() - 1;
        if (lastPos >=1 && arg.charAt(0) == '"' && arg.charAt(lastPos) == '"') {
            // The argument has already been quoted.
            if (noQuotesInside) {
                if (arg.indexOf('"', 1) != lastPos) {
                    // There is ["] inside.
                    throw new IllegalArgumentException(errorMessage);
                }
            }
            return true;
        }
        if (noQuotesInside) {
            if (arg.indexOf('"') >= 0) {
                // There is ["] inside.
                throw new IllegalArgumentException(errorMessage);
            }
        }
        return false;
    }

    private static boolean needsEscaping(int verificationType, String arg) {
        // Switch off MS heuristic for internal ["].
        // Please, use the explicit [cmd.exe] call
        // if you need the internal ["].
        //    Example: "cmd.exe", "/C", "Extended_MS_Syntax"

        // For [.exe] or [.com] file the unpaired/internal ["]
        // in the argument is not a problem.
        boolean argIsQuoted = isQuoted(
            (verificationType == VERIFICATION_CMD_BAT),
            arg, "Argument has embedded quote, use the explicit CMD.EXE call.");

        if (!argIsQuoted) {
            char testEscape[] = ESCAPE_VERIFICATION[verificationType];
            for (int i = 0; i < testEscape.length; ++i) {
                if (arg.indexOf(testEscape[i]) >= 0) {
                    return true;
                }
            }
        }
        return false;
    }

    private static String getExecutablePath(String path)
        throws IOException
    {
        boolean pathIsQuoted = isQuoted(true, path,
                "Executable name has embedded quote, split the arguments");

        // Win32 CreateProcess requires path to be normalized
        File fileToRun = new File(pathIsQuoted
            ? path.substring(1, path.length() - 1)
            : path);

        // From the [CreateProcess] function documentation:
        //
        // "If the file name does not contain an extension, .exe is appended.
        // Therefore, if the file name extension is .com, this parameter
        // must include the .com extension. If the file name ends in
        // a period (.) with no extension, or if the file name contains a path,
        // .exe is not appended."
        //
        // "If the file name !does not contain a directory path!,
        // the system searches for the executable file in the following
        // sequence:..."
        //
        // In practice ANY non-existent path is extended by [.exe] extension
        // in the [CreateProcess] funcion with the only exception:
        // the path ends by (.)

        return fileToRun.getPath();
    }


    private boolean isShellFile(String executablePath) {
        String upPath = executablePath.toUpperCase();
        return (upPath.endsWith(".CMD") || upPath.endsWith(".BAT"));
    }

    private String quoteString(String arg) {
        StringBuilder argbuf = new StringBuilder(arg.length() + 2);
        return argbuf.append('"').append(arg).append('"').toString();
    }


    private long handle = 0;
    private OutputStream stdin_stream;
    private InputStream stdout_stream;
    private InputStream stderr_stream;

    private ProcessImpl(String cmd[],
                        final String envblock,
                        final String path,
                        final long[] stdHandles,
                        final boolean redirectErrorStream)
        throws IOException
    {
        String cmdstr;
        SecurityManager security = System.getSecurityManager();
        boolean allowAmbiguousCommands = false;
        if (security == null) {
            allowAmbiguousCommands = true;
            String value = System.getProperty("jdk.lang.Process.allowAmbiguousCommands");
            if (value != null)
                allowAmbiguousCommands = !"false".equalsIgnoreCase(value);
        }
        if (allowAmbiguousCommands) {
            // Legacy mode.

            // Normalize path if possible.
            String executablePath = new File(cmd[0]).getPath();

            // No worry about internal, unpaired ["], and redirection/piping.
            if (needsEscaping(VERIFICATION_LEGACY, executablePath) )
                executablePath = quoteString(executablePath);

            cmdstr = createCommandLine(
                //legacy mode doesn't worry about extended verification
                VERIFICATION_LEGACY,
                executablePath,
                cmd);
        } else {
            String executablePath;
            try {
                executablePath = getExecutablePath(cmd[0]);
            } catch (IllegalArgumentException e) {
                // Workaround for the calls like
                // Runtime.getRuntime().exec("\"C:\\Program Files\\foo\" bar")

                // No chance to avoid CMD/BAT injection, except to do the work
                // right from the beginning. Otherwise we have too many corner
                // cases from
                //    Runtime.getRuntime().exec(String[] cmd [, ...])
                // calls with internal ["] and escape sequences.

                // Restore original command line.
                StringBuilder join = new StringBuilder();
                // terminal space in command line is ok
                for (String s : cmd)
                    join.append(s).append(' ');

                // Parse the command line again.
                cmd = getTokensFromCommand(join.toString());
                executablePath = getExecutablePath(cmd[0]);

                // Check new executable name once more
                if (security != null)
                    security.checkExec(executablePath);
            }

            // Quotation protects from interpretation of the [path] argument as
            // start of longer path with spaces. Quotation has no influence to
            // [.exe] extension heuristic.
            cmdstr = createCommandLine(
                    // We need the extended verification procedure for CMD files.
                    isShellFile(executablePath)
                        ? VERIFICATION_CMD_BAT
                        : VERIFICATION_WIN32,
                    quoteString(executablePath),
                    cmd);
        }

        handle = create(cmdstr, envblock, path,
                        stdHandles, redirectErrorStream);

        java.security.AccessController.doPrivileged(
        new java.security.PrivilegedAction<Void>() {
        public Void run() {
            if (stdHandles[0] == -1L)
                stdin_stream = ProcessBuilder.NullOutputStream.INSTANCE;
            else {
                FileDescriptor stdin_fd = new FileDescriptor();
                fdAccess.setHandle(stdin_fd, stdHandles[0]);
                stdin_stream = new BufferedOutputStream(
                    new FileOutputStream(stdin_fd));
            }

            if (stdHandles[1] == -1L)
                stdout_stream = ProcessBuilder.NullInputStream.INSTANCE;
            else {
                FileDescriptor stdout_fd = new FileDescriptor();
                fdAccess.setHandle(stdout_fd, stdHandles[1]);
                stdout_stream = new BufferedInputStream(
                    new FileInputStream(stdout_fd));
            }

            if (stdHandles[2] == -1L)
                stderr_stream = ProcessBuilder.NullInputStream.INSTANCE;
            else {
                FileDescriptor stderr_fd = new FileDescriptor();
                fdAccess.setHandle(stderr_fd, stdHandles[2]);
                stderr_stream = new FileInputStream(stderr_fd);
            }

            return null; }});
    }

    public OutputStream getOutputStream() {
        return stdin_stream;
    }

    public InputStream getInputStream() {
        return stdout_stream;
    }

    public InputStream getErrorStream() {
        return stderr_stream;
    }

    protected void finalize() {
        closeHandle(handle);
    }

    private static final int STILL_ACTIVE = getStillActive();
    private static native int getStillActive();

    public int exitValue() {
        int exitCode = getExitCodeProcess(handle);
        if (exitCode == STILL_ACTIVE)
            throw new IllegalThreadStateException("process has not exited");
        return exitCode;
    }
    private static native int getExitCodeProcess(long handle);

    public int waitFor() throws InterruptedException {
        waitForInterruptibly(handle);
        if (Thread.interrupted())
            throw new InterruptedException();
        return exitValue();
    }

    private static native void waitForInterruptibly(long handle);

    @Override
    public boolean waitFor(long timeout, TimeUnit unit)
        throws InterruptedException
    {
        if (getExitCodeProcess(handle) != STILL_ACTIVE) return true;
        if (timeout <= 0) return false;

        long msTimeout = unit.toMillis(timeout);

        waitForTimeoutInterruptibly(handle, msTimeout);
        if (Thread.interrupted())
            throw new InterruptedException();
        return (getExitCodeProcess(handle) != STILL_ACTIVE);
    }

    private static native void waitForTimeoutInterruptibly(
        long handle, long timeout);

    public void destroy() { terminateProcess(handle); }

    @Override
    public Process destroyForcibly() {
        destroy();
        return this;
    }

    private static native void terminateProcess(long handle);

    @Override
    public boolean isAlive() {
        return isProcessAlive(handle);
    }

    private static native boolean isProcessAlive(long handle);

    /**
     * Create a process using the win32 function CreateProcess.
     * The method is synchronized due to MS kb315939 problem.
     * All native handles should restore the inherit flag at the end of call.
     *
     * @param cmdstr the Windows command line
     * @param envblock NUL-separated, double-NUL-terminated list of
     *        environment strings in VAR=VALUE form
     * @param dir the working directory of the process, or null if
     *        inheriting the current directory from the parent process
     * @param stdHandles array of windows HANDLEs.  Indexes 0, 1, and
     *        2 correspond to standard input, standard output and
     *        standard error, respectively.  On input, a value of -1
     *        means to create a pipe to connect child and parent
     *        processes.  On output, a value which is not -1 is the
     *        parent pipe handle corresponding to the pipe which has
     *        been created.  An element of this array is -1 on input
     *        if and only if it is <em>not</em> -1 on output.
     * @param redirectErrorStream redirectErrorStream attribute
     * @return the native subprocess HANDLE returned by CreateProcess
     */
    private static synchronized native long create(String cmdstr,
                                      String envblock,
                                      String dir,
                                      long[] stdHandles,
                                      boolean redirectErrorStream)
        throws IOException;

    /**
     * Opens a file for atomic append. The file is created if it doesn't
     * already exist.
     *
     * @param file the file to open or create
     * @return the native HANDLE
     */
    private static native long openForAtomicAppend(String path)
        throws IOException;

    private static native boolean closeHandle(long handle);
}
