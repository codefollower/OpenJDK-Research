/*
 * Copyright (c) 1998, 2012, Oracle and/or its affiliates. All rights reserved.
 * DO NOT ALTER OR REMOVE COPYRIGHT NOTICES OR THIS FILE HEADER.
 *
 * This code is free software; you can redistribute it and/or modify it
 * under the terms of the GNU General Public License version 2 only, as
 * published by the Free Software Foundation.
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

/**
 *
 */

import java.io.File;
import java.rmi.Naming;
import java.rmi.NoSuchObjectException;
import java.rmi.NotBoundException;
import java.rmi.Remote;
import java.rmi.activation.Activatable;
import java.rmi.activation.ActivationID;
import java.rmi.activation.ActivationSystem;
import java.rmi.registry.LocateRegistry;

/**
 * Class of test utility/library methods related to Activatable
 * objects.
 */
public class ActivationLibrary {
    /** time safeDestroy should wait before failing on shutdown rmid */
    private static final int SAFE_WAIT_TIME;
    static {
        int slopFactor = 1;
        try {
            slopFactor = Integer.valueOf(
                TestLibrary.getExtraProperty("jcov.sleep.multiplier","1"));
        } catch (NumberFormatException ignore) {}
        SAFE_WAIT_TIME = 60000 * slopFactor;
    }

    private static final String SYSTEM_NAME =
        ActivationSystem.class.getName();

    private static void mesg(Object mesg) {
        System.err.println("ACTIVATION_LIBRARY: " + mesg.toString());
    }

    /**
     * Deactivate an activated Activatable
     */
    public static void deactivate(Remote remote,
                                  ActivationID id) {
        // We do as much as 50 deactivation trials, each separated by
        // at least 100 milliseconds sleep time (max sleep time of 5 secs).
        final long deactivateSleepTime = 100;
        for (int i = 0; i < 50; i ++) {
            try {
                if (Activatable.inactive(id) == true) {
                    mesg("inactive successful");
                    return;
                } else {
                    mesg("inactive trial failed. Sleeping " +
                         deactivateSleepTime +
                         " milliseconds before next trial");
                    Thread.sleep(deactivateSleepTime);
                }
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
                mesg("Thread interrupted while trying to deactivate activatable. Exiting deactivation");
                return;
            } catch (Exception e) {
                try {
                    // forcibly unexport the object
                    mesg("Unexpected exception. Have to forcibly unexport the object." +
                         " Exception was :");
                    e.printStackTrace();
                    Activatable.unexportObject(remote, true);
                } catch (NoSuchObjectException ex) {
                }
                return;
            }
        }

        mesg("unable to inactivate after several attempts");
        mesg("unexporting object forcibly instead");

        try {
            Activatable.unexportObject(remote, true);
        } catch (NoSuchObjectException e) {
        }
    }

    /**
     * Simple method call to see if rmid is running.
     *
     * This method intentionally avoids performing a lookup on the
     * activation system.
     */
    public static boolean rmidRunning(int port) {
        int allowedNotReady = 50;
        int connectionRefusedExceptions = 0;

        /* We wait as much as a total of 7.5 secs trying to see Rmid running.
         * We do this by pausing steps of 100 milliseconds (so up to 75 steps),
         * right after trying to lookup and find RMID running in the other vm.
         */
        final long rmidWaitingStepTime = 100;
        for (int i = 0; i <= 74; i++) {

            try {
                LocateRegistry.getRegistry(port).lookup(SYSTEM_NAME);
                mesg("Activation System available after " +
                     (i * rmidWaitingStepTime) + " milliseconds");
                return true;

            } catch (java.rmi.ConnectException e) {
                mesg("Remote connection refused after " +
                     (i * rmidWaitingStepTime) + " milliseconds");

                // ignore connect exceptions until we decide rmid is not up
                if ((connectionRefusedExceptions ++) >= allowedNotReady) {
                    return false;
                }

            } catch (java.rmi.NoSuchObjectException nsoe) {
                /* Activation System still unavailable.
                 * Ignore this since we are just waiting for its availibility.
                 * Just signal unavailibility.
                 */
                mesg("Activation System still unavailable after more than " +
                     (i * rmidWaitingStepTime) + " milliseconds");

            } catch (NotBoundException e) {
                return false;

            } catch (Exception e) {
                /* print out other types of exceptions as an FYI.
                 * test should not fail as rmid is likely to be in an
                 * undetermined state at this point.
                 */
                mesg("caught an exception trying to" +
                     " start rmid, last exception was: " +
                     e.getMessage());
                e.printStackTrace();
            }

            // Waiting for another 100 milliseconds.
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
                mesg("Thread interrupted while checking if Activation System is running. Exiting check");
                return false;
            }
        }
        return false;
    }

    /** cleanup after rmid */
    public static void rmidCleanup(RMID rmid) {
        if (rmid != null) {
            if (!ActivationLibrary.safeDestroy(rmid, SAFE_WAIT_TIME)) {
                TestLibrary.bomb("rmid not destroyed in: " +
                                 SAFE_WAIT_TIME +
                                 " milliseconds");
            }
        }
        RMID.removeLog();
    }

    /**
     * Invoke shutdown on rmid in a way that will not cause a test
     * to hang.
     *
     * @return whether or not shutdown completed succesfully in the
     *         timeAllowed
     */
    private static boolean safeDestroy(RMID rmid, long timeAllowed) {
        DestroyThread destroyThread = new DestroyThread(rmid);
        destroyThread.start();

        try {
            destroyThread.join(timeAllowed);
        } catch (InterruptedException ie) {
            Thread.currentThread().interrupt();
        }

        return destroyThread.shutdownSucceeded();
    }

    /**
     * Thread class to handle the destruction of rmid
     */
    private static class DestroyThread extends Thread {
        private final RMID rmid;
        private final int port;
        private boolean succeeded = false;

        DestroyThread(RMID rmid) {
            this.rmid = rmid;
            this.port = rmid.getPort();
            this.setDaemon(true);
        }

        public void run() {
            if (ActivationLibrary.rmidRunning(port)) {
                rmid.destroy();
                synchronized (this) {
                    // flag that the test was able to shutdown rmid
                    succeeded = true;
                }
                mesg("finished destroying rmid");
            } else {
                mesg("tried to shutdown when rmid was not running");
            }
        }

        public synchronized boolean shutdownSucceeded() {
            return succeeded;
        }
    }
}
