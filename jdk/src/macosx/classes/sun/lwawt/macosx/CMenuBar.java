/*
 * Copyright (c) 2011, 2012, Oracle and/or its affiliates. All rights reserved.
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

package sun.lwawt.macosx;

import java.awt.Menu;
import java.awt.MenuBar;
import java.awt.peer.MenuBarPeer;

public class CMenuBar extends CMenuComponent implements MenuBarPeer {

    private int nextInsertionIndex = -1;

    public CMenuBar(MenuBar target) {
        super(target);
    }

    @Override
    protected long createModel() {
        return nativeCreateMenuBar();
    }

    @Override
    public void addHelpMenu(Menu m) {
        CMenu cMenu = (CMenu)m.getPeer();
        nativeSetHelpMenu(getModel(), cMenu.getModel());
    }

    public int getNextInsertionIndex() {
        return nextInsertionIndex;
    }

    // Used by ScreenMenuBar to add newly visible menus in the right spot.
    public void setNextInsertionIndex(int index) {
        nextInsertionIndex = index;
    }

    @Override
    public void addMenu(Menu m) {
        // Nothing to do here -- we added it when the menu was created.
    }

    @Override
    public void delMenu(int index) {
        nativeDelMenu(getModel(), index);
    }

    private native long nativeCreateMenuBar();
    private native void nativeSetHelpMenu(long menuBarPtr, long menuPtr);
    private native void nativeDelMenu(long menuBarPtr, int index);
}
