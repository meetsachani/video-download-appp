package o;

import android.os.Build;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowInsets;
import android.view.accessibility.AccessibilityEvent;
import o.HL1;

/* renamed from: o.oH2  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C8477oH2 {
    public static final int a = 0;
    public static final int b = 1;
    public static final WindowInsets c = RL2.c.K();
    public static boolean d = false;

    /* renamed from: o.oH2$a */
    /* loaded from: classes.dex */
    public static class a {
        public static int a(ViewGroup viewGroup) {
            return viewGroup.getNestedScrollAxes();
        }

        public static boolean b(ViewGroup viewGroup) {
            return viewGroup.isTransitionGroup();
        }

        public static void c(ViewGroup viewGroup, boolean z) {
            viewGroup.setTransitionGroup(z);
        }
    }

    public static /* synthetic */ WindowInsets a(WindowInsets[] windowInsetsArr, View.OnApplyWindowInsetsListener onApplyWindowInsetsListener, View view, WindowInsets windowInsets) {
        WindowInsets onApplyWindowInsets;
        if (onApplyWindowInsetsListener != null) {
            onApplyWindowInsets = onApplyWindowInsetsListener.onApplyWindowInsets(view, windowInsets);
        } else {
            onApplyWindowInsets = view.onApplyWindowInsets(windowInsets);
        }
        windowInsetsArr[0] = onApplyWindowInsets;
        return c;
    }

    public static /* synthetic */ WindowInsets b(View view, WindowInsets windowInsets) {
        c(view, windowInsets);
        return c;
    }

    public static WindowInsets c(View view, WindowInsets windowInsets) {
        final View.OnApplyWindowInsetsListener onApplyWindowInsetsListener;
        Object tag = view.getTag(HL1.e.k0);
        Object tag2 = view.getTag(HL1.e.t0);
        if (tag instanceof View.OnApplyWindowInsetsListener) {
            onApplyWindowInsetsListener = (View.OnApplyWindowInsetsListener) tag;
        } else if (tag2 instanceof View.OnApplyWindowInsetsListener) {
            onApplyWindowInsetsListener = (View.OnApplyWindowInsetsListener) tag2;
        } else {
            onApplyWindowInsetsListener = null;
        }
        final WindowInsets[] windowInsetsArr = new WindowInsets[1];
        view.setOnApplyWindowInsetsListener(new View.OnApplyWindowInsetsListener() { // from class: o.mH2
            @Override // android.view.View.OnApplyWindowInsetsListener
            public final WindowInsets onApplyWindowInsets(View view2, WindowInsets windowInsets2) {
                return C8477oH2.a(windowInsetsArr, onApplyWindowInsetsListener, view2, windowInsets2);
            }
        });
        view.dispatchApplyWindowInsets(windowInsets);
        Object tag3 = view.getTag(HL1.e.tag_compat_insets_dispatch);
        if (tag3 instanceof View.OnApplyWindowInsetsListener) {
            onApplyWindowInsetsListener = (View.OnApplyWindowInsetsListener) tag3;
        }
        view.setOnApplyWindowInsetsListener(onApplyWindowInsetsListener);
        WindowInsets windowInsets2 = windowInsetsArr[0];
        if (windowInsets2 != null && !windowInsets2.isConsumed() && (view instanceof ViewGroup)) {
            ViewGroup viewGroup = (ViewGroup) view;
            int childCount = viewGroup.getChildCount();
            for (int i = 0; i < childCount; i++) {
                c(viewGroup.getChildAt(i), windowInsetsArr[0]);
            }
        }
        return windowInsetsArr[0];
    }

    @JR1(expression = "group.getLayoutMode()")
    @Deprecated
    public static int d(ViewGroup viewGroup) {
        return viewGroup.getLayoutMode();
    }

    public static int e(ViewGroup viewGroup) {
        return a.a(viewGroup);
    }

    public static void f(View view) {
        if (Build.VERSION.SDK_INT >= 30) {
            return;
        }
        View.OnApplyWindowInsetsListener onApplyWindowInsetsListener = new View.OnApplyWindowInsetsListener() { // from class: o.nH2
            @Override // android.view.View.OnApplyWindowInsetsListener
            public final WindowInsets onApplyWindowInsets(View view2, WindowInsets windowInsets) {
                return C8477oH2.b(view2, windowInsets);
            }
        };
        view.setTag(HL1.e.tag_compat_insets_dispatch, onApplyWindowInsetsListener);
        view.setOnApplyWindowInsetsListener(onApplyWindowInsetsListener);
        d = true;
    }

    public static boolean g(ViewGroup viewGroup) {
        return a.b(viewGroup);
    }

    @JR1(expression = "group.onRequestSendAccessibilityEvent(child, event)")
    @Deprecated
    public static boolean h(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
        return viewGroup.onRequestSendAccessibilityEvent(view, accessibilityEvent);
    }

    @JR1(expression = "group.setLayoutMode(mode)")
    @Deprecated
    public static void i(ViewGroup viewGroup, int i) {
        viewGroup.setLayoutMode(i);
    }

    @JR1(expression = "group.setMotionEventSplittingEnabled(split)")
    @Deprecated
    public static void j(ViewGroup viewGroup, boolean z) {
        viewGroup.setMotionEventSplittingEnabled(z);
    }

    public static void k(ViewGroup viewGroup, boolean z) {
        a.c(viewGroup, z);
    }
}
