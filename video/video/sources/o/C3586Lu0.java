package o;

import java.io.IOException;

@Deprecated
/* renamed from: o.Lu0  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3586Lu0 {

    /* renamed from: o.Lu0$a */
    /* loaded from: classes2.dex */
    public static final class a {
        public long a;
    }

    public static boolean a(C3012Fy1 c3012Fy1, C3976Pu0 c3976Pu0, int i) {
        int j = j(c3012Fy1, i);
        if (j != -1 && j <= c3976Pu0.b) {
            return true;
        }
        return false;
    }

    public static boolean b(C3012Fy1 c3012Fy1, int i) {
        if (c3012Fy1.L() == TD2.A(c3012Fy1.e(), i, c3012Fy1.f() - 1, 0)) {
            return true;
        }
        return false;
    }

    public static boolean c(C3012Fy1 c3012Fy1, C3976Pu0 c3976Pu0, boolean z, a aVar) {
        try {
            long S = c3012Fy1.S();
            if (!z) {
                S *= c3976Pu0.b;
            }
            aVar.a = S;
            return true;
        } catch (NumberFormatException unused) {
            return false;
        }
    }

    public static boolean d(C3012Fy1 c3012Fy1, C3976Pu0 c3976Pu0, int i, a aVar) {
        boolean z;
        boolean z2;
        int f = c3012Fy1.f();
        long N = c3012Fy1.N();
        long j = N >>> 16;
        if (j != i) {
            return false;
        }
        if ((j & 1) == 1) {
            z = true;
        } else {
            z = false;
        }
        int i2 = (int) ((N >> 12) & 15);
        int i3 = (int) ((N >> 8) & 15);
        int i4 = (int) ((N >> 4) & 15);
        int i5 = (int) ((N >> 1) & 7);
        if ((N & 1) == 1) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (!g(i4, c3976Pu0) || !f(i5, c3976Pu0) || z2 || !c(c3012Fy1, c3976Pu0, z, aVar) || !a(c3012Fy1, c3976Pu0, i2) || !e(c3012Fy1, c3976Pu0, i3) || !b(c3012Fy1, f)) {
            return false;
        }
        return true;
    }

    public static boolean e(C3012Fy1 c3012Fy1, C3976Pu0 c3976Pu0, int i) {
        int i2 = c3976Pu0.e;
        if (i == 0) {
            return true;
        }
        if (i <= 11) {
            if (i == c3976Pu0.f) {
                return true;
            }
            return false;
        } else if (i == 12) {
            if (c3012Fy1.L() * 1000 == i2) {
                return true;
            }
            return false;
        } else {
            if (i <= 14) {
                int R = c3012Fy1.R();
                if (i == 14) {
                    R *= 10;
                }
                if (R == i2) {
                    return true;
                }
            }
            return false;
        }
    }

    public static boolean f(int i, C3976Pu0 c3976Pu0) {
        if (i == 0 || i == c3976Pu0.i) {
            return true;
        }
        return false;
    }

    public static boolean g(int i, C3976Pu0 c3976Pu0) {
        if (i <= 7) {
            if (i != c3976Pu0.g - 1) {
                return false;
            }
            return true;
        } else if (i > 10 || c3976Pu0.g != 2) {
            return false;
        } else {
            return true;
        }
    }

    public static boolean h(InterfaceC4421Uj0 interfaceC4421Uj0, C3976Pu0 c3976Pu0, int i, a aVar) throws IOException {
        long n = interfaceC4421Uj0.n();
        byte[] bArr = new byte[2];
        interfaceC4421Uj0.x(bArr, 0, 2);
        if ((((bArr[0] & 255) << 8) | (bArr[1] & 255)) != i) {
            interfaceC4421Uj0.i();
            interfaceC4421Uj0.p((int) (n - interfaceC4421Uj0.getPosition()));
            return false;
        }
        C3012Fy1 c3012Fy1 = new C3012Fy1(16);
        System.arraycopy(bArr, 0, c3012Fy1.e(), 0, 2);
        c3012Fy1.X(C4615Wj0.c(interfaceC4421Uj0, c3012Fy1.e(), 2, 14));
        interfaceC4421Uj0.i();
        interfaceC4421Uj0.p((int) (n - interfaceC4421Uj0.getPosition()));
        return d(c3012Fy1, c3976Pu0, i, aVar);
    }

    public static long i(InterfaceC4421Uj0 interfaceC4421Uj0, C3976Pu0 c3976Pu0) throws IOException {
        int i;
        interfaceC4421Uj0.i();
        boolean z = true;
        interfaceC4421Uj0.p(1);
        byte[] bArr = new byte[1];
        interfaceC4421Uj0.x(bArr, 0, 1);
        if ((bArr[0] & 1) != 1) {
            z = false;
        }
        interfaceC4421Uj0.p(2);
        if (z) {
            i = 7;
        } else {
            i = 6;
        }
        C3012Fy1 c3012Fy1 = new C3012Fy1(i);
        c3012Fy1.X(C4615Wj0.c(interfaceC4421Uj0, c3012Fy1.e(), 0, i));
        interfaceC4421Uj0.i();
        a aVar = new a();
        if (c(c3012Fy1, c3976Pu0, z, aVar)) {
            return aVar.a;
        }
        throw C3989Py1.a(null, null);
    }

    public static int j(C3012Fy1 c3012Fy1, int i) {
        switch (i) {
            case 1:
                return CK1.x;
            case 2:
            case 3:
            case 4:
            case 5:
                return C3062Gl1.m << (i - 2);
            case 6:
                return c3012Fy1.L() + 1;
            case 7:
                return c3012Fy1.R() + 1;
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 15:
                return 256 << (i - 8);
            default:
                return -1;
        }
    }
}
