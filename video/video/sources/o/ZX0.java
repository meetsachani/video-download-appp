package o;

import android.content.Context;
import java.io.File;

/* loaded from: classes.dex */
public class ZX0 {
    public static boolean a = false;
    public static final String b = "LOTTIE";
    public static boolean c = false;
    public static boolean d = true;
    public static boolean e = false;
    public static B61 g;
    public static A61 h;
    public static volatile C3078Gp1 i;
    public static volatile C2479Ap1 j;
    public static ThreadLocal<M61> k;
    public static EnumC3623Mf f = EnumC3623Mf.AUTOMATIC;
    public static JP1 l = new C3157Hk2();

    public static /* synthetic */ File a(Context context) {
        return new File(context.getCacheDir(), "lottie_network_cache");
    }

    public static void b(String str) {
        if (!c) {
            return;
        }
        g().a(str);
    }

    public static float c(String str) {
        if (!c) {
            return 0.0f;
        }
        return g().b(str);
    }

    public static EnumC3623Mf d() {
        return f;
    }

    public static boolean e() {
        return e;
    }

    public static JP1 f() {
        return l;
    }

    public static M61 g() {
        M61 m61 = k.get();
        if (m61 == null) {
            M61 m612 = new M61();
            k.set(m612);
            return m612;
        }
        return m61;
    }

    public static boolean h() {
        return c;
    }

    public static C2479Ap1 i(Context context) {
        C2479Ap1 c2479Ap1;
        if (!d) {
            return null;
        }
        final Context applicationContext = context.getApplicationContext();
        C2479Ap1 c2479Ap12 = j;
        if (c2479Ap12 == null) {
            synchronized (C2479Ap1.class) {
                try {
                    c2479Ap1 = j;
                    if (c2479Ap1 == null) {
                        A61 a61 = h;
                        if (a61 == null) {
                            a61 = new A61() { // from class: o.YX0
                                @Override // o.A61
                                public final File a() {
                                    return ZX0.a(applicationContext);
                                }
                            };
                        }
                        c2479Ap1 = new C2479Ap1(a61);
                        j = c2479Ap1;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            return c2479Ap1;
        }
        return c2479Ap12;
    }

    public static C3078Gp1 j(Context context) {
        C3078Gp1 c3078Gp1;
        C3078Gp1 c3078Gp12 = i;
        if (c3078Gp12 == null) {
            synchronized (C3078Gp1.class) {
                try {
                    c3078Gp1 = i;
                    if (c3078Gp1 == null) {
                        C2479Ap1 i2 = i(context);
                        B61 b61 = g;
                        if (b61 == null) {
                            b61 = new BZ();
                        }
                        c3078Gp1 = new C3078Gp1(i2, b61);
                        i = c3078Gp1;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            return c3078Gp1;
        }
        return c3078Gp12;
    }

    public static void k(A61 a61) {
        A61 a612 = h;
        if (a612 != null || a61 != null) {
            if (a612 != null && a612.equals(a61)) {
                return;
            }
            h = a61;
            j = null;
        }
    }

    public static void l(EnumC3623Mf enumC3623Mf) {
        f = enumC3623Mf;
    }

    public static void m(boolean z) {
        e = z;
    }

    public static void n(B61 b61) {
        B61 b612 = g;
        if (b612 != null || b61 != null) {
            if (b612 != null && b612.equals(b61)) {
                return;
            }
            g = b61;
            i = null;
        }
    }

    public static void o(boolean z) {
        d = z;
    }

    public static void p(JP1 jp1) {
        l = jp1;
    }

    public static void q(boolean z) {
        if (c != z) {
            c = z;
            if (z && k == null) {
                k = new ThreadLocal<>();
            }
        }
    }
}
