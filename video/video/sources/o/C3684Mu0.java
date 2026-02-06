package o;

import java.io.IOException;
import java.util.Arrays;
import java.util.List;
import o.C3976Pu0;
import o.KL0;

@Deprecated
/* renamed from: o.Mu0  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3684Mu0 {
    public static final int a = 1716281667;
    public static final int b = 16382;
    public static final int c = 18;

    /* renamed from: o.Mu0$a */
    /* loaded from: classes2.dex */
    public static final class a {
        @InterfaceC11300zs1
        public C3976Pu0 a;

        public a(@InterfaceC11300zs1 C3976Pu0 c3976Pu0) {
            this.a = c3976Pu0;
        }
    }

    public static boolean a(InterfaceC4421Uj0 interfaceC4421Uj0) throws IOException {
        C3012Fy1 c3012Fy1 = new C3012Fy1(4);
        interfaceC4421Uj0.x(c3012Fy1.e(), 0, 4);
        if (c3012Fy1.N() != 1716281667) {
            return false;
        }
        return true;
    }

    public static int b(InterfaceC4421Uj0 interfaceC4421Uj0) throws IOException {
        interfaceC4421Uj0.i();
        C3012Fy1 c3012Fy1 = new C3012Fy1(2);
        interfaceC4421Uj0.x(c3012Fy1.e(), 0, 2);
        int R = c3012Fy1.R();
        if ((R >> 2) == 16382) {
            interfaceC4421Uj0.i();
            return R;
        }
        interfaceC4421Uj0.i();
        throw C3989Py1.a("First frame does not start with sync code.", null);
    }

    @InterfaceC11300zs1
    public static C4224Si1 c(InterfaceC4421Uj0 interfaceC4421Uj0, boolean z) throws IOException {
        KL0.a aVar;
        if (z) {
            aVar = null;
        } else {
            aVar = KL0.b;
        }
        C4224Si1 a2 = new ML0().a(interfaceC4421Uj0, aVar);
        if (a2 == null || a2.e() == 0) {
            return null;
        }
        return a2;
    }

    @InterfaceC11300zs1
    public static C4224Si1 d(InterfaceC4421Uj0 interfaceC4421Uj0, boolean z) throws IOException {
        interfaceC4421Uj0.i();
        long n = interfaceC4421Uj0.n();
        C4224Si1 c2 = c(interfaceC4421Uj0, z);
        interfaceC4421Uj0.t((int) (interfaceC4421Uj0.n() - n));
        return c2;
    }

    public static boolean e(InterfaceC4421Uj0 interfaceC4421Uj0, a aVar) throws IOException {
        interfaceC4421Uj0.i();
        C2903Ey1 c2903Ey1 = new C2903Ey1(new byte[4]);
        interfaceC4421Uj0.x(c2903Ey1.a, 0, 4);
        boolean g = c2903Ey1.g();
        int h = c2903Ey1.h(7);
        int h2 = c2903Ey1.h(24) + 4;
        if (h == 0) {
            aVar.a = h(interfaceC4421Uj0);
            return g;
        }
        C3976Pu0 c3976Pu0 = aVar.a;
        if (c3976Pu0 != null) {
            if (h == 3) {
                aVar.a = c3976Pu0.c(f(interfaceC4421Uj0, h2));
                return g;
            } else if (h == 4) {
                aVar.a = c3976Pu0.d(j(interfaceC4421Uj0, h2));
                return g;
            } else if (h == 6) {
                C3012Fy1 c3012Fy1 = new C3012Fy1(h2);
                interfaceC4421Uj0.readFully(c3012Fy1.e(), 0, h2);
                c3012Fy1.Z(4);
                aVar.a = c3976Pu0.b(AbstractC5317bO0.M(WC1.a(c3012Fy1)));
                return g;
            } else {
                interfaceC4421Uj0.t(h2);
                return g;
            }
        }
        throw new IllegalArgumentException();
    }

    public static C3976Pu0.a f(InterfaceC4421Uj0 interfaceC4421Uj0, int i) throws IOException {
        C3012Fy1 c3012Fy1 = new C3012Fy1(i);
        interfaceC4421Uj0.readFully(c3012Fy1.e(), 0, i);
        return g(c3012Fy1);
    }

    public static C3976Pu0.a g(C3012Fy1 c3012Fy1) {
        c3012Fy1.Z(1);
        int O = c3012Fy1.O();
        long f = c3012Fy1.f() + O;
        int i = O / 18;
        long[] jArr = new long[i];
        long[] jArr2 = new long[i];
        int i2 = 0;
        while (true) {
            if (i2 >= i) {
                break;
            }
            long E = c3012Fy1.E();
            if (E == -1) {
                jArr = Arrays.copyOf(jArr, i2);
                jArr2 = Arrays.copyOf(jArr2, i2);
                break;
            }
            jArr[i2] = E;
            jArr2[i2] = c3012Fy1.E();
            c3012Fy1.Z(2);
            i2++;
        }
        c3012Fy1.Z((int) (f - c3012Fy1.f()));
        return new C3976Pu0.a(jArr, jArr2);
    }

    public static C3976Pu0 h(InterfaceC4421Uj0 interfaceC4421Uj0) throws IOException {
        byte[] bArr = new byte[38];
        interfaceC4421Uj0.readFully(bArr, 0, 38);
        return new C3976Pu0(bArr, 4);
    }

    public static void i(InterfaceC4421Uj0 interfaceC4421Uj0) throws IOException {
        C3012Fy1 c3012Fy1 = new C3012Fy1(4);
        interfaceC4421Uj0.readFully(c3012Fy1.e(), 0, 4);
        if (c3012Fy1.N() == 1716281667) {
            return;
        }
        throw C3989Py1.a("Failed to read FLAC stream marker.", null);
    }

    public static List<String> j(InterfaceC4421Uj0 interfaceC4421Uj0, int i) throws IOException {
        C3012Fy1 c3012Fy1 = new C3012Fy1(i);
        interfaceC4421Uj0.readFully(c3012Fy1.e(), 0, i);
        c3012Fy1.Z(4);
        return Arrays.asList(C8241nJ2.i(c3012Fy1, false, false).b);
    }
}
