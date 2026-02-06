package o;

import android.content.Context;
import android.hardware.display.DisplayManager;
import android.os.Build;
import android.view.Display;
import java.util.Objects;

/* renamed from: o.x40  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C10619x40 {
    public static final String b = "android.hardware.display.category.ALL_INCLUDING_DISABLED";
    public static final int c = 1;
    public static final String d = "android.hardware.display.category.PRESENTATION";
    public static final String e = "android.hardware.display.category.BUILT_IN_DISPLAYS";
    public final Context a;

    public C10619x40(Context context) {
        this.a = context;
    }

    public static Display[] a(DisplayManager displayManager) {
        Display[] displays;
        if (Build.VERSION.SDK_INT >= 32) {
            displays = displayManager.getDisplays(b);
        } else {
            displays = displayManager.getDisplays();
        }
        Display[] displayArr = new Display[g(1, displays)];
        int i = 0;
        for (Display display : displays) {
            if (1 == f(display)) {
                displayArr[i] = display;
                i++;
            }
        }
        return displayArr;
    }

    public static C10619x40 e(Context context) {
        return new C10619x40(context);
    }

    public static int f(Display display) {
        try {
            Object invoke = Display.class.getMethod("getType", null).invoke(display, null);
            Objects.requireNonNull(invoke);
            return ((Integer) invoke).intValue();
        } catch (NoSuchMethodException unused) {
            return 0;
        } catch (Exception e2) {
            throw new RuntimeException(e2);
        }
    }

    public static int g(int i, Display[] displayArr) {
        int i2 = 0;
        for (Display display : displayArr) {
            if (i == f(display)) {
                i2++;
            }
        }
        return i2;
    }

    public Display b(int i) {
        return ((DisplayManager) this.a.getSystemService("display")).getDisplay(i);
    }

    public Display[] c() {
        return ((DisplayManager) this.a.getSystemService("display")).getDisplays();
    }

    public Display[] d(String str) {
        DisplayManager displayManager = (DisplayManager) this.a.getSystemService("display");
        if (e.equals(str)) {
            return a(displayManager);
        }
        return ((DisplayManager) this.a.getSystemService("display")).getDisplays(str);
    }
}
