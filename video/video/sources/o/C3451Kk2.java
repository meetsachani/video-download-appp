package o;

import java.io.File;

/* renamed from: o.Kk2  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C3451Kk2 {
    public static final HU0 A;
    public static final boolean A0;
    public static final String B;
    public static final boolean B0;
    public static final String C;
    public static final boolean C0;
    public static final String D;
    public static final boolean D0;
    public static final String E;
    public static final boolean E0;
    public static final String F;
    public static final boolean F0;
    public static final String G;
    public static final boolean G0;
    public static final String H;
    public static final boolean H0;
    public static final String I;
    public static final boolean I0;
    public static final String J;
    public static final boolean J0;
    public static final String K;
    public static final boolean K0;
    public static final String L;
    public static final boolean L0;
    @Deprecated
    public static final String M;
    public static final boolean M0;
    public static final String N;
    public static final boolean N0;
    public static final String O;
    public static final boolean O0;
    public static final String P;
    public static final boolean P0;
    @Deprecated
    public static final String Q;
    public static final boolean Q0;
    public static final String R;
    public static final boolean R0;
    public static final String S;
    public static final boolean S0;
    public static final String T;
    public static final boolean T0;
    public static final String U;
    public static final boolean U0;
    public static final String V;
    public static final boolean V0;
    public static final String W;
    public static final boolean W0;
    public static final boolean X;
    public static final boolean X0;
    public static final boolean Y;
    public static final boolean Y0;
    public static final boolean Z;
    public static final boolean Z0;
    public static final String a = "Windows";
    public static final boolean a0;
    public static final boolean a1;
    public static final String b = "user.home";
    public static final boolean b0;
    public static final boolean b1;
    public static final String c = "user.name";
    public static final boolean c0;
    public static final boolean c1;
    public static final String d = "user.dir";
    public static final boolean d0;
    public static final boolean d1;
    public static final boolean e0;
    public static final boolean e1;
    @Deprecated
    public static final boolean f0;
    public static final boolean f1;
    public static final boolean g0;
    public static final boolean g1;
    public static final boolean h0;
    public static final boolean i0;
    public static final boolean j0;
    public static final boolean k0;
    public static final boolean l0;
    public static final boolean m0;
    public static final boolean n0;
    public static final boolean o0;
    public static final boolean p0;
    public static final boolean q0;
    public static final boolean r0;
    public static final boolean s0;
    public static final boolean t0;
    public static final boolean u0;
    public static final boolean v0;
    public static final boolean w0;
    public static final boolean x0;
    public static final boolean y0;
    public static final String z;
    public static final boolean z0;
    public static final String g = h("awt.toolkit");
    public static final String h = h("file.encoding");
    @Deprecated
    public static final String i = h("file.separator");
    public static final String j = h("java.awt.fonts");
    public static final String k = h("java.awt.graphicsenv");
    public static final String l = h("java.awt.headless");
    public static final String m = h("java.awt.printerjob");
    public static final String n = h("java.class.path");

    /* renamed from: o  reason: collision with root package name */
    public static final String f521o = h("java.class.version");
    public static final String p = h("java.compiler");
    public static final String q = h("java.endorsed.dirs");
    public static final String r = h("java.ext.dirs");
    public static final String f = "java.home";
    public static final String s = h(f);
    public static final String e = "java.io.tmpdir";
    public static final String t = h(e);
    public static final String u = h("java.library.path");
    public static final String v = h("java.runtime.name");
    public static final String w = h("java.runtime.version");
    public static final String x = h("java.specification.name");
    public static final String y = h("java.specification.vendor");

    static {
        boolean z2;
        String h2 = h("java.specification.version");
        z = h2;
        A = HU0.h(h2);
        B = h("java.util.prefs.PreferencesFactory");
        C = h("java.vendor");
        D = h("java.vendor.url");
        E = h("java.version");
        F = h("java.vm.info");
        G = h("java.vm.name");
        H = h("java.vm.specification.name");
        I = h("java.vm.specification.vendor");
        J = h("java.vm.specification.version");
        K = h("java.vm.vendor");
        L = h("java.vm.version");
        M = h("line.separator");
        N = h("os.arch");
        O = h("os.name");
        P = h("os.version");
        Q = h("path.separator");
        String str = "user.country";
        if (h("user.country") == null) {
            str = "user.region";
        }
        R = h(str);
        S = h(d);
        T = h(b);
        U = h("user.language");
        V = h(c);
        W = h("user.timezone");
        X = e("1.1");
        Y = e("1.2");
        Z = e("1.3");
        a0 = e("1.4");
        b0 = e("1.5");
        c0 = e("1.6");
        d0 = e("1.7");
        e0 = e("1.8");
        f0 = e("9");
        g0 = e("9");
        h0 = e("10");
        i0 = e("11");
        j0 = e("12");
        k0 = e("13");
        l0 = e("14");
        m0 = e("15");
        boolean g2 = g("AIX");
        n0 = g2;
        boolean g3 = g("HP-UX");
        o0 = g3;
        p0 = g("OS/400");
        boolean g4 = g("Irix");
        q0 = g4;
        boolean z3 = true;
        if (!g("Linux") && !g("LINUX")) {
            z2 = false;
        } else {
            z2 = true;
        }
        r0 = z2;
        s0 = g("Mac");
        boolean g5 = g("Mac OS X");
        t0 = g5;
        u0 = f("Mac OS X", "10.0");
        v0 = f("Mac OS X", "10.1");
        w0 = f("Mac OS X", "10.2");
        x0 = f("Mac OS X", "10.3");
        y0 = f("Mac OS X", "10.4");
        z0 = f("Mac OS X", "10.5");
        A0 = f("Mac OS X", "10.6");
        B0 = f("Mac OS X", "10.7");
        C0 = f("Mac OS X", "10.8");
        D0 = f("Mac OS X", "10.9");
        E0 = f("Mac OS X", "10.10");
        F0 = f("Mac OS X", "10.11");
        G0 = f("Mac OS X", "10.12");
        H0 = f("Mac OS X", "10.13");
        I0 = f("Mac OS X", "10.14");
        J0 = f("Mac OS X", "10.15");
        K0 = f("Mac OS X", "10.16");
        boolean g6 = g("FreeBSD");
        L0 = g6;
        boolean g7 = g("OpenBSD");
        M0 = g7;
        boolean g8 = g("NetBSD");
        N0 = g8;
        O0 = g("OS/2");
        boolean g9 = g("Solaris");
        P0 = g9;
        boolean g10 = g("SunOS");
        Q0 = g10;
        if (!g2 && !g3 && !g4 && !z2 && !g5 && !g9 && !g10 && !g6 && !g7 && !g8) {
            z3 = false;
        }
        R0 = z3;
        S0 = g("Windows");
        T0 = g("Windows 2000");
        U0 = g("Windows 2003");
        V0 = g("Windows Server 2008");
        W0 = g("Windows Server 2012");
        X0 = g("Windows 95");
        Y0 = g("Windows 98");
        Z0 = g("Windows Me");
        a1 = g("Windows NT");
        b1 = g("Windows XP");
        c1 = g("Windows Vista");
        d1 = g("Windows 7");
        e1 = g("Windows 8");
        f1 = g("Windows 10");
        g1 = g("z/OS");
    }

    public static String a(String str, String str2) {
        try {
            String str3 = System.getenv(str);
            if (str3 == null) {
                return str2;
            }
            return str3;
        } catch (SecurityException unused) {
            return str2;
        }
    }

    public static String b() {
        String str;
        if (S0) {
            str = "COMPUTERNAME";
        } else {
            str = "HOSTNAME";
        }
        return System.getenv(str);
    }

    public static File c() {
        return new File(System.getProperty(f));
    }

    public static File d() {
        return new File(System.getProperty(e));
    }

    public static boolean e(String str) {
        return p(z, str);
    }

    public static boolean f(String str, String str2) {
        return q(O, P, str, str2);
    }

    public static boolean g(String str) {
        return r(O, str);
    }

    public static String h(String str) {
        try {
            return System.getProperty(str);
        } catch (SecurityException unused) {
            return null;
        }
    }

    public static File i() {
        return new File(System.getProperty(d));
    }

    public static File j() {
        return new File(System.getProperty(b));
    }

    public static String k() {
        return System.getProperty(c);
    }

    public static String l(String str) {
        return System.getProperty(c, str);
    }

    public static boolean m() {
        return Boolean.TRUE.toString().equals(l);
    }

    public static boolean n(HU0 hu0) {
        return A.e(hu0);
    }

    public static boolean o(HU0 hu0) {
        return A.g(hu0);
    }

    public static boolean p(String str, String str2) {
        if (str == null) {
            return false;
        }
        return str.startsWith(str2);
    }

    public static boolean q(String str, String str2, String str3, String str4) {
        if (str == null || str2 == null || !r(str, str3) || !s(str2, str4)) {
            return false;
        }
        return true;
    }

    public static boolean r(String str, String str2) {
        if (str == null) {
            return false;
        }
        return str.startsWith(str2);
    }

    public static boolean s(String str, String str2) {
        if (C4500Ve2.I0(str)) {
            return false;
        }
        String[] split = str2.split("\\.");
        String[] split2 = str.split("\\.");
        for (int i2 = 0; i2 < Math.min(split.length, split2.length); i2++) {
            if (!split[i2].equals(split2[i2])) {
                return false;
            }
        }
        return true;
    }
}
