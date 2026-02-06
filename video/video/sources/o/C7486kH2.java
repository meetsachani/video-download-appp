package o;

import android.content.Context;
import android.content.res.Resources;
import android.os.Build;
import android.util.Log;
import android.util.TypedValue;
import android.view.InputDevice;
import android.view.ViewConfiguration;
import java.lang.reflect.Method;
import java.util.Objects;

/* renamed from: o.kH2  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C7486kH2 {
    public static final String a = "ViewConfigCompat";
    public static final int b = Integer.MAX_VALUE;
    public static final int c = Integer.MIN_VALUE;
    public static final int d = 0;
    public static final int e = -1;
    public static Method f;

    /* renamed from: o.kH2$a */
    /* loaded from: classes.dex */
    public static class a {
        public static float a(ViewConfiguration viewConfiguration) {
            return viewConfiguration.getScaledHorizontalScrollFactor();
        }

        public static float b(ViewConfiguration viewConfiguration) {
            return viewConfiguration.getScaledVerticalScrollFactor();
        }
    }

    /* renamed from: o.kH2$b */
    /* loaded from: classes.dex */
    public static class b {
        public static int a(ViewConfiguration viewConfiguration) {
            return viewConfiguration.getScaledHoverSlop();
        }

        public static boolean b(ViewConfiguration viewConfiguration) {
            return viewConfiguration.shouldShowMenuShortcutsWhenKeyboardPresent();
        }
    }

    /* renamed from: o.kH2$c */
    /* loaded from: classes.dex */
    public static class c {
        public static int a(ViewConfiguration viewConfiguration, int i, int i2, int i3) {
            return viewConfiguration.getScaledMaximumFlingVelocity(i, i2, i3);
        }

        public static int b(ViewConfiguration viewConfiguration, int i, int i2, int i3) {
            return viewConfiguration.getScaledMinimumFlingVelocity(i, i2, i3);
        }
    }

    static {
        if (Build.VERSION.SDK_INT == 25) {
            try {
                f = ViewConfiguration.class.getDeclaredMethod("getScaledScrollFactor", null);
            } catch (Exception unused) {
                Log.i(a, "Could not find method getScaledScrollFactor() on ViewConfiguration");
            }
        }
    }

    public static int a(Resources resources, int i, InterfaceC8575oh2<Integer> interfaceC8575oh2, int i2) {
        int dimensionPixelSize;
        if (i != -1) {
            if (i != 0 && (dimensionPixelSize = resources.getDimensionPixelSize(i)) >= 0) {
                return dimensionPixelSize;
            }
            return i2;
        }
        return interfaceC8575oh2.get().intValue();
    }

    public static float b(ViewConfiguration viewConfiguration, Context context) {
        Method method;
        if (Build.VERSION.SDK_INT >= 25 && (method = f) != null) {
            try {
                return ((Integer) method.invoke(viewConfiguration, null)).intValue();
            } catch (Exception unused) {
                Log.i(a, "Could not find method getScaledScrollFactor() on ViewConfiguration");
            }
        }
        TypedValue typedValue = new TypedValue();
        if (context.getTheme().resolveAttribute(16842829, typedValue, true)) {
            return typedValue.getDimension(context.getResources().getDisplayMetrics());
        }
        return 0.0f;
    }

    public static int c(Resources resources, String str, String str2) {
        return resources.getIdentifier(str, str2, "android");
    }

    public static int d(Resources resources, int i, int i2) {
        if (i == 4194304 && i2 == 26) {
            return c(resources, "config_viewMaxRotaryEncoderFlingVelocity", "dimen");
        }
        return -1;
    }

    public static int e(Resources resources, int i, int i2) {
        if (i == 4194304 && i2 == 26) {
            return c(resources, "config_viewMinRotaryEncoderFlingVelocity", "dimen");
        }
        return -1;
    }

    public static float f(ViewConfiguration viewConfiguration, Context context) {
        if (Build.VERSION.SDK_INT >= 26) {
            return a.a(viewConfiguration);
        }
        return b(viewConfiguration, context);
    }

    public static int g(ViewConfiguration viewConfiguration) {
        if (Build.VERSION.SDK_INT >= 28) {
            return b.a(viewConfiguration);
        }
        return viewConfiguration.getScaledTouchSlop() / 2;
    }

    public static int h(Context context, final ViewConfiguration viewConfiguration, int i, int i2, int i3) {
        if (Build.VERSION.SDK_INT >= 34) {
            return c.a(viewConfiguration, i, i2, i3);
        }
        if (!m(i, i2, i3)) {
            return Integer.MIN_VALUE;
        }
        Resources resources = context.getResources();
        int d2 = d(resources, i3, i2);
        Objects.requireNonNull(viewConfiguration);
        return a(resources, d2, new InterfaceC8575oh2() { // from class: o.iH2
            @Override // o.InterfaceC8575oh2
            public final Object get() {
                return Integer.valueOf(viewConfiguration.getScaledMaximumFlingVelocity());
            }
        }, Integer.MIN_VALUE);
    }

    public static int i(Context context, final ViewConfiguration viewConfiguration, int i, int i2, int i3) {
        if (Build.VERSION.SDK_INT >= 34) {
            return c.b(viewConfiguration, i, i2, i3);
        }
        if (!m(i, i2, i3)) {
            return Integer.MAX_VALUE;
        }
        Resources resources = context.getResources();
        int e2 = e(resources, i3, i2);
        Objects.requireNonNull(viewConfiguration);
        return a(resources, e2, new InterfaceC8575oh2() { // from class: o.jH2
            @Override // o.InterfaceC8575oh2
            public final Object get() {
                return Integer.valueOf(viewConfiguration.getScaledMinimumFlingVelocity());
            }
        }, Integer.MAX_VALUE);
    }

    @JR1(expression = "config.getScaledPagingTouchSlop()")
    @Deprecated
    public static int j(ViewConfiguration viewConfiguration) {
        return viewConfiguration.getScaledPagingTouchSlop();
    }

    public static float k(ViewConfiguration viewConfiguration, Context context) {
        if (Build.VERSION.SDK_INT >= 26) {
            return a.b(viewConfiguration);
        }
        return b(viewConfiguration, context);
    }

    @JR1(expression = "config.hasPermanentMenuKey()")
    @Deprecated
    public static boolean l(ViewConfiguration viewConfiguration) {
        return viewConfiguration.hasPermanentMenuKey();
    }

    public static boolean m(int i, int i2, int i3) {
        InputDevice device = InputDevice.getDevice(i);
        if (device != null && device.getMotionRange(i2, i3) != null) {
            return true;
        }
        return false;
    }

    public static boolean n(ViewConfiguration viewConfiguration, Context context) {
        if (Build.VERSION.SDK_INT >= 28) {
            return b.b(viewConfiguration);
        }
        Resources resources = context.getResources();
        int c2 = c(resources, "config_showMenuShortcutsWhenKeyboardPresent", com.facebook.a0.s);
        if (c2 != 0 && resources.getBoolean(c2)) {
            return true;
        }
        return false;
    }
}
