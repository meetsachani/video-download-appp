package o;

import android.app.UiModeManager;
import android.content.Context;
import android.graphics.Point;
import android.os.Build;
import android.text.TextUtils;
import android.view.Display;

/* renamed from: o.s40  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C9401s40 {
    public static final int a = 3840;
    public static final int b = 2160;

    /* renamed from: o.s40$a */
    /* loaded from: classes.dex */
    public static class a {
        public static b a(Context context, Display display) {
            Display.Mode mode = display.getMode();
            Point a = C9401s40.a(context, display);
            if (a != null && !d(mode, a)) {
                return new b(mode, a);
            }
            return new b(mode, true);
        }

        public static b[] b(Context context, Display display) {
            b bVar;
            Display.Mode[] supportedModes = display.getSupportedModes();
            b[] bVarArr = new b[supportedModes.length];
            Display.Mode mode = display.getMode();
            Point a = C9401s40.a(context, display);
            if (a != null && !d(mode, a)) {
                for (int i = 0; i < supportedModes.length; i++) {
                    if (e(supportedModes[i], mode)) {
                        bVar = new b(supportedModes[i], a);
                    } else {
                        bVar = new b(supportedModes[i], false);
                    }
                    bVarArr[i] = bVar;
                }
            } else {
                for (int i2 = 0; i2 < supportedModes.length; i2++) {
                    bVarArr[i2] = new b(supportedModes[i2], e(supportedModes[i2], mode));
                }
            }
            return bVarArr;
        }

        public static boolean c(Display display) {
            Display.Mode[] supportedModes;
            Display.Mode mode = display.getMode();
            for (Display.Mode mode2 : display.getSupportedModes()) {
                if (mode.getPhysicalHeight() < mode2.getPhysicalHeight() || mode.getPhysicalWidth() < mode2.getPhysicalWidth()) {
                    return false;
                }
            }
            return true;
        }

        public static boolean d(Display.Mode mode, Point point) {
            if (mode.getPhysicalWidth() != point.x || mode.getPhysicalHeight() != point.y) {
                if (mode.getPhysicalWidth() == point.y && mode.getPhysicalHeight() == point.x) {
                    return true;
                }
                return false;
            }
            return true;
        }

        public static boolean e(Display.Mode mode, Display.Mode mode2) {
            if (mode.getPhysicalWidth() == mode2.getPhysicalWidth() && mode.getPhysicalHeight() == mode2.getPhysicalHeight()) {
                return true;
            }
            return false;
        }
    }

    public static Point a(Context context, Display display) {
        Point j;
        if (Build.VERSION.SDK_INT < 28) {
            j = j("sys.display-size", display);
        } else {
            j = j("vendor.display-size", display);
        }
        if (j != null) {
            return j;
        }
        if (!g(context) || !f(display)) {
            return null;
        }
        return new Point(3840, 2160);
    }

    public static Point b(Context context, Display display) {
        Point a2 = a(context, display);
        if (a2 != null) {
            return a2;
        }
        Point point = new Point();
        display.getRealSize(point);
        return point;
    }

    public static b c(Context context, Display display) {
        return a.a(context, display);
    }

    public static b[] d(Context context, Display display) {
        return a.b(context, display);
    }

    public static String e(String str) {
        try {
            Class<?> cls = Class.forName("android.os.SystemProperties");
            return (String) cls.getMethod("get", String.class).invoke(cls, str);
        } catch (Exception unused) {
            return null;
        }
    }

    public static boolean f(Display display) {
        return a.c(display);
    }

    public static boolean g(Context context) {
        if (h(context) && "Sony".equals(Build.MANUFACTURER) && Build.MODEL.startsWith("BRAVIA") && context.getPackageManager().hasSystemFeature("com.sony.dtv.hardware.panel.qfhd")) {
            return true;
        }
        return false;
    }

    public static boolean h(Context context) {
        UiModeManager uiModeManager = (UiModeManager) context.getSystemService("uimode");
        if (uiModeManager != null && uiModeManager.getCurrentModeType() == 4) {
            return true;
        }
        return false;
    }

    public static Point i(String str) throws NumberFormatException {
        String[] split = str.trim().split("x", -1);
        if (split.length == 2) {
            int parseInt = Integer.parseInt(split[0]);
            int parseInt2 = Integer.parseInt(split[1]);
            if (parseInt > 0 && parseInt2 > 0) {
                return new Point(parseInt, parseInt2);
            }
        }
        throw new NumberFormatException();
    }

    public static Point j(String str, Display display) {
        if (display.getDisplayId() != 0) {
            return null;
        }
        String e = e(str);
        if (!TextUtils.isEmpty(e) && e != null) {
            try {
                return i(e);
            } catch (NumberFormatException unused) {
            }
        }
        return null;
    }

    /* renamed from: o.s40$b */
    /* loaded from: classes.dex */
    public static final class b {
        public final Display.Mode a;
        public final Point b;
        public final boolean c;

        /* renamed from: o.s40$b$a */
        /* loaded from: classes.dex */
        public static class a {
            public static int a(Display.Mode mode) {
                return mode.getPhysicalHeight();
            }

            public static int b(Display.Mode mode) {
                return mode.getPhysicalWidth();
            }
        }

        public b(Point point) {
            C10907yF1.m(point, "physicalSize == null");
            this.b = point;
            this.a = null;
            this.c = true;
        }

        public int a() {
            return this.b.y;
        }

        public int b() {
            return this.b.x;
        }

        @Deprecated
        public boolean c() {
            return this.c;
        }

        public Display.Mode d() {
            return this.a;
        }

        public b(Display.Mode mode, boolean z) {
            C10907yF1.m(mode, "mode == null, can't wrap a null reference");
            this.b = new Point(a.b(mode), a.a(mode));
            this.a = mode;
            this.c = z;
        }

        public b(Display.Mode mode, Point point) {
            C10907yF1.m(mode, "mode == null, can't wrap a null reference");
            C10907yF1.m(point, "physicalSize == null");
            this.b = point;
            this.a = mode;
            this.c = true;
        }
    }
}
