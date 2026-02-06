package o;

import android.os.Build;
import android.view.View;
import android.view.Window;
import o.C4820Ym;

/* renamed from: o.mL2  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C8006mL2 {
    public static final int a = 8;
    public static final int b = 9;
    public static final int c = 10;

    /* renamed from: o.mL2$a */
    /* loaded from: classes.dex */
    public static class a {
        public static void a(Window window, boolean z) {
            int i;
            View decorView = window.getDecorView();
            int systemUiVisibility = decorView.getSystemUiVisibility();
            if (z) {
                i = systemUiVisibility & (-1793);
            } else {
                i = systemUiVisibility | C4820Ym.b.f;
            }
            decorView.setSystemUiVisibility(i);
        }
    }

    /* renamed from: o.mL2$b */
    /* loaded from: classes.dex */
    public static class b {
        public static <T> T a(Window window, int i) {
            return (T) window.requireViewById(i);
        }
    }

    /* renamed from: o.mL2$c */
    /* loaded from: classes.dex */
    public static class c {
        public static void a(Window window, boolean z) {
            int i;
            View decorView = window.getDecorView();
            int systemUiVisibility = decorView.getSystemUiVisibility();
            if (z) {
                i = systemUiVisibility & (-257);
            } else {
                i = systemUiVisibility | 256;
            }
            decorView.setSystemUiVisibility(i);
            window.setDecorFitsSystemWindows(z);
        }
    }

    /* renamed from: o.mL2$d */
    /* loaded from: classes.dex */
    public static class d {
        public static void a(Window window, boolean z) {
            window.setDecorFitsSystemWindows(z);
        }
    }

    public static C10450wM2 a(Window window, View view) {
        return new C10450wM2(window, view);
    }

    public static <T extends View> T b(Window window, int i) {
        if (Build.VERSION.SDK_INT >= 28) {
            return (T) b.a(window, i);
        }
        T t = (T) window.findViewById(i);
        if (t != null) {
            return t;
        }
        throw new IllegalArgumentException("ID does not reference a View inside this Window");
    }

    public static void c(Window window, boolean z) {
        int i = Build.VERSION.SDK_INT;
        if (i >= 35) {
            d.a(window, z);
        } else if (i >= 30) {
            c.a(window, z);
        } else {
            a.a(window, z);
        }
    }
}
