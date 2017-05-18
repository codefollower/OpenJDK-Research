/*
 * Copyright (c) 2009, 2012, Oracle and/or its affiliates. All rights reserved.
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

/*
 * @test
 * @bug 6843127
 * @run main/othervm/timeout=300 BadKdc4
 * @summary krb5 should not try to access unavailable kdc too often
 */

import java.io.*;
import java.security.Security;

public class BadKdc4 {

    public static void main(String[] args)
            throws Exception {
        Security.setProperty("krb5.kdc.bad.policy", "");
        BadKdc.go(
            "121212222222(32){1,2}121212222222(32){1,2}",
            "121212222222(32){1,2}121212222222(32){1,2}",
            // refresh
            "121212222222(32){1,2}121212222222(32){1,2}",
            // k3 off k2 on
            "121212(22){1,2}121212(22){1,2}",
            // k1 on
            "(12){2,4}"
        );
    }
}
