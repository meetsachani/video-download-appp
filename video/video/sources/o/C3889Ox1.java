package o;

import android.graphics.BlendMode;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.os.Build;
import o.C8843po;

/* renamed from: o.Ox1  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3889Ox1 {
    public static final String a = "\udfffd";
    public static final String b = "m";
    public static final ThreadLocal<C4377Tx1<Rect, Rect>> c = new ThreadLocal<>();

    /* renamed from: o.Ox1$a */
    /* loaded from: classes.dex */
    public static class a {
        public static boolean a(Paint paint, String str) {
            return paint.hasGlyph(str);
        }
    }

    /* renamed from: o.Ox1$b */
    /* loaded from: classes.dex */
    public static class b {
        public static void a(Paint paint, Object obj) {
            paint.setBlendMode((BlendMode) obj);
        }
    }

    public static boolean a(Paint paint, String str) {
        return a.a(paint, str);
    }

    public static C4377Tx1<Rect, Rect> b() {
        ThreadLocal<C4377Tx1<Rect, Rect>> threadLocal = c;
        C4377Tx1<Rect, Rect> c4377Tx1 = threadLocal.get();
        if (c4377Tx1 == null) {
            C4377Tx1<Rect, Rect> c4377Tx12 = new C4377Tx1<>(new Rect(), new Rect());
            threadLocal.set(c4377Tx12);
            return c4377Tx12;
        }
        c4377Tx1.a.setEmpty();
        c4377Tx1.b.setEmpty();
        return c4377Tx1;
    }

    public static boolean c(Paint paint, EnumC8600oo enumC8600oo) {
        PorterDuffXfermode porterDuffXfermode = null;
        Object obj = null;
        if (Build.VERSION.SDK_INT >= 29) {
            if (enumC8600oo != null) {
                obj = C8843po.b.a(enumC8600oo);
            }
            b.a(paint, obj);
            return true;
        } else if (enumC8600oo != null) {
            PorterDuff.Mode a2 = C8843po.a(enumC8600oo);
            if (a2 != null) {
                porterDuffXfermode = new PorterDuffXfermode(a2);
            }
            paint.setXfermode(porterDuffXfermode);
            if (a2 != null) {
                return true;
            }
            return false;
        } else {
            paint.setXfermode(null);
            return true;
        }
    }
}
