package o;

import android.util.Log;
import android.view.View;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;

/* loaded from: classes.dex */
public final class TH2 {
    public static final String a = "ViewParentCompat";
    public static int[] b;

    /* loaded from: classes.dex */
    public static class a {
        public static boolean a(ViewParent viewParent, View view, float f, float f2, boolean z) {
            return viewParent.onNestedFling(view, f, f2, z);
        }

        public static boolean b(ViewParent viewParent, View view, float f, float f2) {
            return viewParent.onNestedPreFling(view, f, f2);
        }

        public static void c(ViewParent viewParent, View view, int i, int i2, int[] iArr) {
            viewParent.onNestedPreScroll(view, i, i2, iArr);
        }

        public static void d(ViewParent viewParent, View view, int i, int i2, int i3, int i4) {
            viewParent.onNestedScroll(view, i, i2, i3, i4);
        }

        public static void e(ViewParent viewParent, View view, View view2, int i) {
            viewParent.onNestedScrollAccepted(view, view2, i);
        }

        public static boolean f(ViewParent viewParent, View view, View view2, int i) {
            return viewParent.onStartNestedScroll(view, view2, i);
        }

        public static void g(ViewParent viewParent, View view) {
            viewParent.onStopNestedScroll(view);
        }
    }

    public static int[] a() {
        int[] iArr = b;
        if (iArr == null) {
            b = new int[2];
        } else {
            iArr[0] = 0;
            iArr[1] = 0;
        }
        return b;
    }

    @JR1(expression = "parent.notifySubtreeAccessibilityStateChanged(child, source, changeType)")
    @Deprecated
    public static void b(ViewParent viewParent, View view, View view2, int i) {
        viewParent.notifySubtreeAccessibilityStateChanged(view, view2, i);
    }

    public static boolean c(ViewParent viewParent, View view, float f, float f2, boolean z) {
        try {
            return a.a(viewParent, view, f, f2, z);
        } catch (AbstractMethodError e) {
            Log.e(a, "ViewParent " + viewParent + " does not implement interface method onNestedFling", e);
            return false;
        }
    }

    public static boolean d(ViewParent viewParent, View view, float f, float f2) {
        try {
            return a.b(viewParent, view, f, f2);
        } catch (AbstractMethodError e) {
            Log.e(a, "ViewParent " + viewParent + " does not implement interface method onNestedPreFling", e);
            return false;
        }
    }

    public static void e(ViewParent viewParent, View view, int i, int i2, int[] iArr) {
        f(viewParent, view, i, i2, iArr, 0);
    }

    public static void f(ViewParent viewParent, View view, int i, int i2, int[] iArr, int i3) {
        if (viewParent instanceof InterfaceC9827tp1) {
            ((InterfaceC9827tp1) viewParent).p(view, i, i2, iArr, i3);
        } else if (i3 == 0) {
            try {
                a.c(viewParent, view, i, i2, iArr);
            } catch (AbstractMethodError e) {
                Log.e(a, "ViewParent " + viewParent + " does not implement interface method onNestedPreScroll", e);
            }
        }
    }

    public static void g(ViewParent viewParent, View view, int i, int i2, int i3, int i4) {
        i(viewParent, view, i, i2, i3, i4, 0, a());
    }

    public static void h(ViewParent viewParent, View view, int i, int i2, int i3, int i4, int i5) {
        i(viewParent, view, i, i2, i3, i4, i5, a());
    }

    public static void i(ViewParent viewParent, View view, int i, int i2, int i3, int i4, int i5, int[] iArr) {
        if (viewParent instanceof InterfaceC10070up1) {
            ((InterfaceC10070up1) viewParent).s(view, i, i2, i3, i4, i5, iArr);
            return;
        }
        iArr[0] = iArr[0] + i3;
        iArr[1] = iArr[1] + i4;
        if (viewParent instanceof InterfaceC9827tp1) {
            ((InterfaceC9827tp1) viewParent).t(view, i, i2, i3, i4, i5);
        } else if (i5 == 0) {
            try {
                a.d(viewParent, view, i, i2, i3, i4);
            } catch (AbstractMethodError e) {
                Log.e(a, "ViewParent " + viewParent + " does not implement interface method onNestedScroll", e);
            }
        }
    }

    public static void j(ViewParent viewParent, View view, View view2, int i) {
        k(viewParent, view, view2, i, 0);
    }

    public static void k(ViewParent viewParent, View view, View view2, int i, int i2) {
        if (viewParent instanceof InterfaceC9827tp1) {
            ((InterfaceC9827tp1) viewParent).n(view, view2, i, i2);
        } else if (i2 == 0) {
            try {
                a.e(viewParent, view, view2, i);
            } catch (AbstractMethodError e) {
                Log.e(a, "ViewParent " + viewParent + " does not implement interface method onNestedScrollAccepted", e);
            }
        }
    }

    public static boolean l(ViewParent viewParent, View view, View view2, int i) {
        return m(viewParent, view, view2, i, 0);
    }

    public static boolean m(ViewParent viewParent, View view, View view2, int i, int i2) {
        if (viewParent instanceof InterfaceC9827tp1) {
            return ((InterfaceC9827tp1) viewParent).u(view, view2, i, i2);
        }
        if (i2 == 0) {
            try {
                return a.f(viewParent, view, view2, i);
            } catch (AbstractMethodError e) {
                Log.e(a, "ViewParent " + viewParent + " does not implement interface method onStartNestedScroll", e);
                return false;
            }
        }
        return false;
    }

    public static void n(ViewParent viewParent, View view) {
        o(viewParent, view, 0);
    }

    public static void o(ViewParent viewParent, View view, int i) {
        if (viewParent instanceof InterfaceC9827tp1) {
            ((InterfaceC9827tp1) viewParent).o(view, i);
        } else if (i == 0) {
            try {
                a.g(viewParent, view);
            } catch (AbstractMethodError e) {
                Log.e(a, "ViewParent " + viewParent + " does not implement interface method onStopNestedScroll", e);
            }
        }
    }

    @JR1(expression = "parent.requestSendAccessibilityEvent(child, event)")
    @Deprecated
    public static boolean p(ViewParent viewParent, View view, AccessibilityEvent accessibilityEvent) {
        return viewParent.requestSendAccessibilityEvent(view, accessibilityEvent);
    }
}
