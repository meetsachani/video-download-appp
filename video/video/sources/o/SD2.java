package o;

import android.graphics.Bitmap;
import android.os.Handler;
import android.os.Looper;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Queue;

/* loaded from: classes.dex */
public final class SD2 {
    public static final int a = 31;
    public static final int b = 17;
    public static final char[] c = C10671xH0.a.toCharArray();
    public static final char[] d = new char[64];
    public static volatile Handler e;

    /* loaded from: classes.dex */
    public static /* synthetic */ class a {
        public static final /* synthetic */ int[] a;

        static {
            Bitmap.Config config;
            int[] iArr = new int[Bitmap.Config.values().length];
            a = iArr;
            try {
                iArr[Bitmap.Config.ALPHA_8.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                a[Bitmap.Config.RGB_565.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                a[Bitmap.Config.ARGB_4444.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                int[] iArr2 = a;
                config = Bitmap.Config.RGBA_F16;
                iArr2[config.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                a[Bitmap.Config.ARGB_8888.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    public static void A(Runnable runnable) {
        m().removeCallbacks(runnable);
    }

    public static String B(byte[] bArr) {
        String f;
        char[] cArr = d;
        synchronized (cArr) {
            f = f(bArr, cArr);
        }
        return f;
    }

    public static void a() {
        if (u()) {
            return;
        }
        throw new IllegalArgumentException("You must call this method on a background thread");
    }

    public static void b() {
        if (v()) {
            return;
        }
        throw new IllegalArgumentException("You must call this method on the main thread");
    }

    public static boolean c(AbstractC2962Fl<?> abstractC2962Fl, AbstractC2962Fl<?> abstractC2962Fl2) {
        if (abstractC2962Fl == null) {
            if (abstractC2962Fl2 == null) {
                return true;
            }
            return false;
        }
        return abstractC2962Fl.b0(abstractC2962Fl2);
    }

    public static boolean d(Object obj, Object obj2) {
        if (obj == null) {
            if (obj2 == null) {
                return true;
            }
            return false;
        } else if (obj instanceof InterfaceC7110ik1) {
            return ((InterfaceC7110ik1) obj).a(obj2);
        } else {
            return obj.equals(obj2);
        }
    }

    public static boolean e(Object obj, Object obj2) {
        if (obj == null) {
            if (obj2 == null) {
                return true;
            }
            return false;
        }
        return obj.equals(obj2);
    }

    public static String f(byte[] bArr, char[] cArr) {
        for (int i = 0; i < bArr.length; i++) {
            byte b2 = bArr[i];
            int i2 = i * 2;
            char[] cArr2 = c;
            cArr[i2] = cArr2[(b2 & 255) >>> 4];
            cArr[i2 + 1] = cArr2[b2 & C8077mf.q];
        }
        return new String(cArr);
    }

    public static <T> Queue<T> g(int i) {
        return new ArrayDeque(i);
    }

    public static int h(int i, int i2, Bitmap.Config config) {
        return i * i2 * j(config);
    }

    public static int i(Bitmap bitmap) {
        if (!bitmap.isRecycled()) {
            try {
                return bitmap.getAllocationByteCount();
            } catch (NullPointerException unused) {
                return bitmap.getHeight() * bitmap.getRowBytes();
            }
        }
        throw new IllegalStateException("Cannot obtain size for recycled Bitmap: " + bitmap + C6566gU0.f + bitmap.getWidth() + "x" + bitmap.getHeight() + "] " + bitmap.getConfig());
    }

    public static int j(Bitmap.Config config) {
        if (config == null) {
            config = Bitmap.Config.ARGB_8888;
        }
        int i = a.a[config.ordinal()];
        int i2 = 1;
        if (i != 1) {
            i2 = 2;
            if (i != 2 && i != 3) {
                if (i != 4) {
                    return 4;
                }
                return 8;
            }
        }
        return i2;
    }

    @Deprecated
    public static int k(Bitmap bitmap) {
        return i(bitmap);
    }

    public static <T> List<T> l(Collection<T> collection) {
        ArrayList arrayList = new ArrayList(collection.size());
        for (T t : collection) {
            if (t != null) {
                arrayList.add(t);
            }
        }
        return arrayList;
    }

    public static Handler m() {
        if (e == null) {
            synchronized (SD2.class) {
                try {
                    if (e == null) {
                        e = new Handler(Looper.getMainLooper());
                    }
                } finally {
                }
            }
        }
        return e;
    }

    public static int n(float f) {
        return o(f, 17);
    }

    public static int o(float f, int i) {
        return q(Float.floatToIntBits(f), i);
    }

    public static int p(int i) {
        return q(i, 17);
    }

    public static int q(int i, int i2) {
        return (i2 * 31) + i;
    }

    public static int r(Object obj, int i) {
        int hashCode;
        if (obj == null) {
            hashCode = 0;
        } else {
            hashCode = obj.hashCode();
        }
        return q(hashCode, i);
    }

    public static int s(boolean z) {
        return t(z, 17);
    }

    public static int t(boolean z, int i) {
        return q(z ? 1 : 0, i);
    }

    public static boolean u() {
        return !v();
    }

    public static boolean v() {
        if (Looper.myLooper() == Looper.getMainLooper()) {
            return true;
        }
        return false;
    }

    public static boolean w(int i) {
        if (i <= 0 && i != Integer.MIN_VALUE) {
            return false;
        }
        return true;
    }

    public static boolean x(int i, int i2) {
        if (w(i) && w(i2)) {
            return true;
        }
        return false;
    }

    public static void y(Runnable runnable) {
        m().postAtFrontOfQueue(runnable);
    }

    public static void z(Runnable runnable) {
        m().post(runnable);
    }
}
