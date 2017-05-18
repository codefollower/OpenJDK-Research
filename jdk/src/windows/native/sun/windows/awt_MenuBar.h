/*
 * Copyright (c) 1996, 2011, Oracle and/or its affiliates. All rights reserved.
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

#ifndef AWT_MENUBAR_H
#define AWT_MENUBAR_H

#include "awt.h"
#include "awt_Menu.h"
#include <java_awt_MenuBar.h>
#include <sun_awt_windows_WMenuBarPeer.h>
#include <sun_awt_windows_WFramePeer.h>


class AwtFrame;


/************************************************************************
 * AwtMenuBar class
 */

class AwtMenuBar : public AwtMenu {
public:
    // id's for methods executed on toolkit thread
    enum MenuExecIds {
        MENUBAR_DELITEM = MENU_LAST+1
    };

    /* java.awt.MenuBar method ids */
    static jmethodID getMenuCountMID;
    static jmethodID getMenuMID;

    AwtMenuBar();
    virtual ~AwtMenuBar();

    virtual void Dispose();

    virtual LPCTSTR GetClassName();

    /* Create a new AwtMenuBar.  This must be run on the main thread. */
    static AwtMenuBar* Create(jobject self, jobject framePeer);

    virtual AwtMenuBar* GetMenuBar() { return this; }
    INLINE AwtFrame* GetFrame() { return m_frame; }

    virtual HWND GetOwnerHWnd();
    virtual void RedrawMenuBar();

    AwtMenuItem* GetItem(jobject target, long index);
    int CountItem(jobject menuBar);

    void SendDrawItem(AwtMenuItem* awtMenuItem,
                      DRAWITEMSTRUCT& drawInfo);
    void SendMeasureItem(AwtMenuItem* awtMenuItem,
                         HDC hDC, MEASUREITEMSTRUCT& measureInfo);
    void DrawItem(DRAWITEMSTRUCT& drawInfo);
    void MeasureItem(HDC hDC, MEASUREITEMSTRUCT& measureInfo);

    void AddItem(AwtMenuItem* item);
    void DeleteItem(UINT index);

    virtual LRESULT WinThreadExecProc(ExecuteArgs * args);

    // called on Toolkit thread
    static void _AddMenu(void *param);
protected:
    AwtFrame* m_frame;
};

#endif /* AWT_MENUBAR_H */
