package o;

import android.location.Location;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;
import java.util.Locale;

/* renamed from: o.zg0  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C11251zg0 {
    public static final long c = -1;
    public static final String d = "zg0";
    public static final String h = "K";
    public static final String i = "M";
    public static final String j = "N";
    public final C2638Cg0 a;
    public boolean b = false;
    public static final ThreadLocal<SimpleDateFormat> e = new a();
    public static final ThreadLocal<SimpleDateFormat> f = new b();
    public static final ThreadLocal<SimpleDateFormat> g = new c();
    public static final List<String> k = o();
    public static final List<String> l = Arrays.asList(C2638Cg0.x, C2638Cg0.y, C2638Cg0.f0, C2638Cg0.g0, C2638Cg0.A, C2638Cg0.N, C2638Cg0.O, C2638Cg0.e2, C2638Cg0.f2, C2638Cg0.g2);

    /* renamed from: o.zg0$a */
    /* loaded from: classes.dex */
    public class a extends ThreadLocal<SimpleDateFormat> {
        @Override // java.lang.ThreadLocal
        /* renamed from: a */
        public SimpleDateFormat initialValue() {
            return new SimpleDateFormat("yyyy:MM:dd", Locale.US);
        }
    }

    /* renamed from: o.zg0$b */
    /* loaded from: classes.dex */
    public class b extends ThreadLocal<SimpleDateFormat> {
        @Override // java.lang.ThreadLocal
        /* renamed from: a */
        public SimpleDateFormat initialValue() {
            return new SimpleDateFormat("HH:mm:ss", Locale.US);
        }
    }

    /* renamed from: o.zg0$c */
    /* loaded from: classes.dex */
    public class c extends ThreadLocal<SimpleDateFormat> {
        @Override // java.lang.ThreadLocal
        /* renamed from: a */
        public SimpleDateFormat initialValue() {
            return new SimpleDateFormat("yyyy:MM:dd HH:mm:ss", Locale.US);
        }
    }

    /* renamed from: o.zg0$d */
    /* loaded from: classes.dex */
    public static final class d {

        /* renamed from: o.zg0$d$a */
        /* loaded from: classes.dex */
        public static final class a {
            public final double a;

            public a(double d) {
                this.a = d;
            }

            public double a() {
                return this.a / 2.23694d;
            }
        }

        public static a a(double d) {
            return new a(d * 0.621371d);
        }

        public static a b(double d) {
            return new a(d * 1.15078d);
        }

        public static a c(double d) {
            return new a(d);
        }
    }

    public C11251zg0(C2638Cg0 c2638Cg0) {
        this.a = c2638Cg0;
    }

    public static Date d(String str) throws ParseException {
        return e.get().parse(str);
    }

    public static Date e(String str) throws ParseException {
        return g.get().parse(str);
    }

    public static Date f(String str) throws ParseException {
        return f.get().parse(str);
    }

    public static String g(long j2) {
        return g.get().format(new Date(j2));
    }

    public static C11251zg0 i(File file) throws IOException {
        return j(file.toString());
    }

    public static C11251zg0 j(String str) throws IOException {
        return new C11251zg0(new C2638Cg0(str));
    }

    public static C11251zg0 k(androidx.camera.core.g gVar) throws IOException {
        ByteBuffer B = gVar.f3()[0].B();
        B.rewind();
        byte[] bArr = new byte[B.capacity()];
        B.get(bArr);
        return l(new ByteArrayInputStream(bArr));
    }

    public static C11251zg0 l(InputStream inputStream) throws IOException {
        return new C11251zg0(new C2638Cg0(inputStream));
    }

    public static List<String> o() {
        return Arrays.asList(C2638Cg0.x, C2638Cg0.y, C2638Cg0.z, C2638Cg0.A, C2638Cg0.B, C2638Cg0.C, C2638Cg0.D, C2638Cg0.E, C2638Cg0.F, C2638Cg0.G, C2638Cg0.H, C2638Cg0.I, C2638Cg0.J, C2638Cg0.K, C2638Cg0.L, C2638Cg0.M, C2638Cg0.N, C2638Cg0.O, C2638Cg0.P, C2638Cg0.Q, C2638Cg0.R, C2638Cg0.S, C2638Cg0.T, C2638Cg0.U, C2638Cg0.V, C2638Cg0.W, C2638Cg0.X, C2638Cg0.Y, C2638Cg0.Z, C2638Cg0.a0, C2638Cg0.b0, C2638Cg0.c0, C2638Cg0.d0, C2638Cg0.e0, C2638Cg0.f0, C2638Cg0.g0, C2638Cg0.h0, C2638Cg0.i0, C2638Cg0.j0, C2638Cg0.k0, C2638Cg0.l0, C2638Cg0.m0, C2638Cg0.n0, C2638Cg0.o0, C2638Cg0.p0, C2638Cg0.q0, C2638Cg0.r0, C2638Cg0.s0, C2638Cg0.t0, C2638Cg0.u0, C2638Cg0.v0, C2638Cg0.w0, C2638Cg0.x0, C2638Cg0.z0, C2638Cg0.A0, C2638Cg0.B0, C2638Cg0.C0, C2638Cg0.D0, C2638Cg0.E0, C2638Cg0.F0, C2638Cg0.G0, C2638Cg0.H0, C2638Cg0.I0, C2638Cg0.J0, C2638Cg0.K0, C2638Cg0.L0, C2638Cg0.M0, C2638Cg0.N0, C2638Cg0.O0, C2638Cg0.P0, C2638Cg0.Q0, C2638Cg0.R0, C2638Cg0.S0, C2638Cg0.T0, C2638Cg0.U0, C2638Cg0.V0, C2638Cg0.W0, C2638Cg0.X0, C2638Cg0.Y0, C2638Cg0.Z0, C2638Cg0.a1, C2638Cg0.b1, C2638Cg0.c1, C2638Cg0.d1, C2638Cg0.e1, C2638Cg0.f1, C2638Cg0.g1, C2638Cg0.h1, C2638Cg0.i1, C2638Cg0.j1, C2638Cg0.k1, C2638Cg0.l1, C2638Cg0.m1, C2638Cg0.n1, C2638Cg0.o1, C2638Cg0.p1, "CameraOwnerName", C2638Cg0.s1, C2638Cg0.t1, C2638Cg0.u1, C2638Cg0.v1, C2638Cg0.w1, C2638Cg0.x1, C2638Cg0.y1, C2638Cg0.z1, C2638Cg0.A1, C2638Cg0.B1, C2638Cg0.C1, C2638Cg0.D1, C2638Cg0.E1, C2638Cg0.F1, C2638Cg0.G1, C2638Cg0.H1, C2638Cg0.I1, C2638Cg0.J1, C2638Cg0.K1, C2638Cg0.L1, C2638Cg0.M1, C2638Cg0.N1, C2638Cg0.O1, C2638Cg0.P1, C2638Cg0.Q1, C2638Cg0.R1, C2638Cg0.S1, C2638Cg0.T1, C2638Cg0.U1, C2638Cg0.V1, C2638Cg0.W1, C2638Cg0.X1, C2638Cg0.Y1, C2638Cg0.Z1, C2638Cg0.a2, C2638Cg0.b2, C2638Cg0.c2, C2638Cg0.d2, C2638Cg0.e2, C2638Cg0.f2, C2638Cg0.g2, C2638Cg0.h2, C2638Cg0.i2, C2638Cg0.j2, C2638Cg0.k2, C2638Cg0.l2, C2638Cg0.m2, C2638Cg0.n2, C2638Cg0.o2, C2638Cg0.p2, C2638Cg0.q2, C2638Cg0.r2, C2638Cg0.s2, C2638Cg0.t2, C2638Cg0.u2, C2638Cg0.v2);
    }

    public final long A(String str) {
        if (str == null) {
            return -1L;
        }
        try {
            return e(str).getTime();
        } catch (ParseException unused) {
            return -1L;
        }
    }

    public final long B(String str, String str2) {
        if (str == null && str2 == null) {
            return -1L;
        }
        if (str2 == null) {
            try {
                return d(str).getTime();
            } catch (ParseException unused) {
                return -1L;
            }
        } else if (str == null) {
            try {
                return f(str2).getTime();
            } catch (ParseException unused2) {
                return -1L;
            }
        } else {
            return A(str + C4500Ve2.b + str2);
        }
    }

    public void C() {
        this.a.v0(C2638Cg0.Y1, null);
        this.a.v0(C2638Cg0.z1, null);
        this.a.v0(C2638Cg0.y1, null);
        this.a.v0(C2638Cg0.B1, null);
        this.a.v0(C2638Cg0.A1, null);
        this.a.v0(C2638Cg0.D1, null);
        this.a.v0(C2638Cg0.C1, null);
        this.a.v0(C2638Cg0.K1, null);
        this.a.v0(C2638Cg0.J1, null);
        this.a.v0(C2638Cg0.a2, null);
        this.a.v0(C2638Cg0.E1, null);
    }

    public void D() {
        this.a.v0(C2638Cg0.U, null);
        this.a.v0(C2638Cg0.m0, null);
        this.a.v0(C2638Cg0.n0, null);
        this.a.v0(C2638Cg0.r0, null);
        this.a.v0(C2638Cg0.s0, null);
        this.a.v0(C2638Cg0.t0, null);
        this.b = true;
    }

    public void E(int i2) {
        if (i2 % 90 != 0) {
            C7433k41.p(d, String.format(Locale.US, "Can only rotate in right angles (eg. 0, 90, 180, 270). %d is unsupported.", Integer.valueOf(i2)));
            this.a.v0(C2638Cg0.C, String.valueOf(0));
            return;
        }
        int i3 = i2 % 360;
        int u = u();
        while (i3 < 0) {
            i3 += 90;
            switch (u) {
                case 2:
                    u = 5;
                    break;
                case 3:
                case 8:
                    u = 6;
                    break;
                case 4:
                    u = 7;
                    break;
                case 5:
                    u = 4;
                    break;
                case 6:
                    u = 1;
                    break;
                case 7:
                    u = 2;
                    break;
                default:
                    u = 8;
                    break;
            }
        }
        while (i3 > 0) {
            i3 -= 90;
            switch (u) {
                case 2:
                    u = 7;
                    break;
                case 3:
                    u = 8;
                    break;
                case 4:
                    u = 5;
                    break;
                case 5:
                    u = 2;
                    break;
                case 6:
                    u = 3;
                    break;
                case 7:
                    u = 4;
                    break;
                case 8:
                    u = 1;
                    break;
                default:
                    u = 6;
                    break;
            }
        }
        this.a.v0(C2638Cg0.C, String.valueOf(u));
    }

    public void F() throws IOException {
        if (!this.b) {
            a();
        }
        this.a.q0();
    }

    public void G(String str) {
        this.a.v0(C2638Cg0.V, str);
    }

    public void H(int i2) {
        this.a.v0(C2638Cg0.C, String.valueOf(i2));
    }

    public final void a() {
        long currentTimeMillis = System.currentTimeMillis();
        String g2 = g(currentTimeMillis);
        this.a.v0(C2638Cg0.U, g2);
        try {
            this.a.v0(C2638Cg0.r0, Long.toString(currentTimeMillis - e(g2).getTime()));
        } catch (ParseException unused) {
        }
    }

    public void b(Location location) {
        this.a.x0(location);
    }

    public void c() {
        long currentTimeMillis = System.currentTimeMillis();
        String g2 = g(currentTimeMillis);
        this.a.v0(C2638Cg0.m0, g2);
        this.a.v0(C2638Cg0.n0, g2);
        try {
            String l2 = Long.toString(currentTimeMillis - e(g2).getTime());
            this.a.v0(C2638Cg0.s0, l2);
            this.a.v0(C2638Cg0.t0, l2);
        } catch (ParseException unused) {
        }
        this.b = false;
    }

    public void h(C11251zg0 c11251zg0) {
        ArrayList<String> arrayList = new ArrayList(k);
        arrayList.removeAll(l);
        for (String str : arrayList) {
            String i2 = this.a.i(str);
            String i3 = c11251zg0.a.i(str);
            if (i2 != null && !i2.equals(i3)) {
                c11251zg0.a.v0(str, i2);
            }
        }
    }

    public void m() {
        int i2;
        switch (u()) {
            case 2:
                i2 = 1;
                break;
            case 3:
                i2 = 4;
                break;
            case 4:
                i2 = 3;
                break;
            case 5:
                i2 = 6;
                break;
            case 6:
                i2 = 5;
                break;
            case 7:
                i2 = 8;
                break;
            case 8:
                i2 = 7;
                break;
            default:
                i2 = 2;
                break;
        }
        this.a.v0(C2638Cg0.C, String.valueOf(i2));
    }

    public void n() {
        int i2;
        switch (u()) {
            case 2:
                i2 = 3;
                break;
            case 3:
                i2 = 2;
                break;
            case 4:
                i2 = 1;
                break;
            case 5:
                i2 = 8;
                break;
            case 6:
                i2 = 7;
                break;
            case 7:
                i2 = 6;
                break;
            case 8:
                i2 = 5;
                break;
            default:
                i2 = 4;
                break;
        }
        this.a.v0(C2638Cg0.C, String.valueOf(i2));
    }

    public String p() {
        return this.a.i(C2638Cg0.V);
    }

    public C2638Cg0 q() {
        return this.a;
    }

    public int r() {
        return this.a.l(C2638Cg0.y, 0);
    }

    public long s() {
        long A = A(this.a.i(C2638Cg0.U));
        if (A == -1) {
            return -1L;
        }
        String i2 = this.a.i(C2638Cg0.r0);
        if (i2 != null) {
            try {
                long parseLong = Long.parseLong(i2);
                while (parseLong > 1000) {
                    parseLong /= 10;
                }
                return A + parseLong;
            } catch (NumberFormatException unused) {
                return A;
            }
        }
        return A;
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00a9  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Location t() {
        char c2;
        double a2;
        String i2 = this.a.i(C2638Cg0.Y1);
        double[] v = this.a.v();
        double h2 = this.a.h(0.0d);
        double k2 = this.a.k(C2638Cg0.K1, 0.0d);
        String i3 = this.a.i(C2638Cg0.J1);
        if (i3 == null) {
            i3 = "K";
        }
        long B = B(this.a.i(C2638Cg0.a2), this.a.i(C2638Cg0.E1));
        if (v == null) {
            return null;
        }
        if (i2 == null) {
            i2 = d;
        }
        Location location = new Location(i2);
        location.setLatitude(v[0]);
        location.setLongitude(v[1]);
        if (h2 != 0.0d) {
            location.setAltitude(h2);
        }
        if (k2 != 0.0d) {
            int hashCode = i3.hashCode();
            if (hashCode != 75) {
                if (hashCode != 77) {
                    if (hashCode == 78 && i3.equals("N")) {
                        c2 = 1;
                        if (c2 == 0) {
                            if (c2 != 1) {
                                a2 = d.a(k2).a();
                            } else {
                                a2 = d.b(k2).a();
                            }
                        } else {
                            a2 = d.c(k2).a();
                        }
                        location.setSpeed((float) a2);
                    }
                    c2 = 65535;
                    if (c2 == 0) {
                    }
                    location.setSpeed((float) a2);
                } else {
                    if (i3.equals("M")) {
                        c2 = 0;
                        if (c2 == 0) {
                        }
                        location.setSpeed((float) a2);
                    }
                    c2 = 65535;
                    if (c2 == 0) {
                    }
                    location.setSpeed((float) a2);
                }
            } else {
                if (i3.equals("K")) {
                    c2 = 2;
                    if (c2 == 0) {
                    }
                    location.setSpeed((float) a2);
                }
                c2 = 65535;
                if (c2 == 0) {
                }
                location.setSpeed((float) a2);
            }
        }
        if (B != -1) {
            location.setTime(B);
        }
        return location;
    }

    public String toString() {
        return String.format(Locale.ENGLISH, "Exif{width=%s, height=%s, rotation=%d, isFlippedVertically=%s, isFlippedHorizontally=%s, location=%s, timestamp=%s, description=%s}", Integer.valueOf(x()), Integer.valueOf(r()), Integer.valueOf(v()), Boolean.valueOf(z()), Boolean.valueOf(y()), t(), Long.valueOf(w()), p());
    }

    public int u() {
        return this.a.l(C2638Cg0.C, 0);
    }

    public int v() {
        switch (u()) {
            case 3:
            case 4:
                return 180;
            case 5:
                return C4731Xo.d1;
            case 6:
            case 7:
                return 90;
            case 8:
                return C4731Xo.d1;
            default:
                return 0;
        }
    }

    public long w() {
        long A = A(this.a.i(C2638Cg0.m0));
        if (A == -1) {
            return -1L;
        }
        String i2 = this.a.i(C2638Cg0.s0);
        if (i2 != null) {
            try {
                long parseLong = Long.parseLong(i2);
                while (parseLong > 1000) {
                    parseLong /= 10;
                }
                return A + parseLong;
            } catch (NumberFormatException unused) {
                return A;
            }
        }
        return A;
    }

    public int x() {
        return this.a.l(C2638Cg0.x, 0);
    }

    public boolean y() {
        if (u() != 2) {
            return false;
        }
        return true;
    }

    public boolean z() {
        int u = u();
        if (u == 4 || u == 5 || u == 7) {
            return true;
        }
        return false;
    }
}
