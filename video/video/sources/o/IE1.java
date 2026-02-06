package o;

import android.view.View;
import android.widget.PopupWindow;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

/* loaded from: classes.dex */
public final class IE1 {
    public static final String a = "PopupWindowCompatApi21";
    public static Method b;
    public static boolean c;
    public static Method d;
    public static boolean e;
    public static Field f;
    public static boolean g;

    /* loaded from: classes.dex */
    public static class a {
        public static boolean a(PopupWindow popupWindow) {
            return popupWindow.getOverlapAnchor();
        }

        public static int b(PopupWindow popupWindow) {
            return popupWindow.getWindowLayoutType();
        }

        public static void c(PopupWindow popupWindow, boolean z) {
            popupWindow.setOverlapAnchor(z);
        }

        public static void d(PopupWindow popupWindow, int i) {
            popupWindow.setWindowLayoutType(i);
        }
    }

    public static boolean a(PopupWindow popupWindow) {
        return a.a(popupWindow);
    }

    public static int b(PopupWindow popupWindow) {
        return a.b(popupWindow);
    }

    public static void c(PopupWindow popupWindow, boolean z) {
        a.c(popupWindow, z);
    }

    public static void d(PopupWindow popupWindow, int i) {
        a.d(popupWindow, i);
    }

    @JR1(expression = "popup.showAsDropDown(anchor, xoff, yoff, gravity)")
    @Deprecated
    public static void e(PopupWindow popupWindow, View view, int i, int i2, int i3) {
        popupWindow.showAsDropDown(view, i, i2, i3);
    }
}
