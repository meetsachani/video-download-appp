package o;

import java.io.IOException;

@Deprecated
/* loaded from: classes2.dex */
public final class AK1 {
    public static final String i = "PsDurationReader";
    public static final int j = 20000;
    public boolean c;
    public boolean d;
    public boolean e;
    public final C10071up2 a = new C10071up2(0);
    public long f = C10323vs.b;
    public long g = C10323vs.b;
    public long h = C10323vs.b;
    public final C3012Fy1 b = new C3012Fy1();

    public static boolean a(byte[] bArr) {
        if ((bArr[0] & 196) != 68 || (bArr[2] & 4) != 4 || (bArr[4] & 4) != 4 || (bArr[5] & 1) != 1 || (bArr[8] & 3) != 3) {
            return false;
        }
        return true;
    }

    public static long l(C3012Fy1 c3012Fy1) {
        int f = c3012Fy1.f();
        if (c3012Fy1.a() < 9) {
            return C10323vs.b;
        }
        byte[] bArr = new byte[9];
        c3012Fy1.n(bArr, 0, 9);
        c3012Fy1.Y(f);
        if (!a(bArr)) {
            return C10323vs.b;
        }
        return m(bArr);
    }

    public static long m(byte[] bArr) {
        byte b = bArr[0];
        byte b2 = bArr[2];
        return (((b & 56) >> 3) << 30) | ((b & 3) << 28) | ((bArr[1] & 255) << 20) | (((b2 & 248) >> 3) << 15) | ((b2 & 3) << 13) | ((bArr[3] & 255) << 5) | ((bArr[4] & 248) >> 3);
    }

    public final int b(InterfaceC4421Uj0 interfaceC4421Uj0) {
        this.b.V(TD2.f);
        this.c = true;
        interfaceC4421Uj0.i();
        return 0;
    }

    public long c() {
        return this.h;
    }

    public C10071up2 d() {
        return this.a;
    }

    public boolean e() {
        return this.c;
    }

    public final int f(byte[] bArr, int i2) {
        return (bArr[i2 + 3] & 255) | ((bArr[i2] & 255) << 24) | ((bArr[i2 + 1] & 255) << 16) | ((bArr[i2 + 2] & 255) << 8);
    }

    public int g(InterfaceC4421Uj0 interfaceC4421Uj0, KE1 ke1) throws IOException {
        if (!this.e) {
            return j(interfaceC4421Uj0, ke1);
        }
        if (this.g == C10323vs.b) {
            return b(interfaceC4421Uj0);
        }
        if (!this.d) {
            return h(interfaceC4421Uj0, ke1);
        }
        long j2 = this.f;
        if (j2 == C10323vs.b) {
            return b(interfaceC4421Uj0);
        }
        long b = this.a.b(this.g) - this.a.b(j2);
        this.h = b;
        if (b < 0) {
            I31.n(i, "Invalid duration: " + this.h + ". Using TIME_UNSET instead.");
            this.h = C10323vs.b;
        }
        return b(interfaceC4421Uj0);
    }

    public final int h(InterfaceC4421Uj0 interfaceC4421Uj0, KE1 ke1) throws IOException {
        int min = (int) Math.min(20000L, interfaceC4421Uj0.getLength());
        long j2 = 0;
        if (interfaceC4421Uj0.getPosition() != j2) {
            ke1.a = j2;
            return 1;
        }
        this.b.U(min);
        interfaceC4421Uj0.i();
        interfaceC4421Uj0.x(this.b.e(), 0, min);
        this.f = i(this.b);
        this.d = true;
        return 0;
    }

    public final long i(C3012Fy1 c3012Fy1) {
        int g = c3012Fy1.g();
        for (int f = c3012Fy1.f(); f < g - 3; f++) {
            if (f(c3012Fy1.e(), f) == 442) {
                c3012Fy1.Y(f + 4);
                long l = l(c3012Fy1);
                if (l != C10323vs.b) {
                    return l;
                }
            }
        }
        return C10323vs.b;
    }

    public final int j(InterfaceC4421Uj0 interfaceC4421Uj0, KE1 ke1) throws IOException {
        long length = interfaceC4421Uj0.getLength();
        int min = (int) Math.min(20000L, length);
        long j2 = length - min;
        if (interfaceC4421Uj0.getPosition() != j2) {
            ke1.a = j2;
            return 1;
        }
        this.b.U(min);
        interfaceC4421Uj0.i();
        interfaceC4421Uj0.x(this.b.e(), 0, min);
        this.g = k(this.b);
        this.e = true;
        return 0;
    }

    public final long k(C3012Fy1 c3012Fy1) {
        int f = c3012Fy1.f();
        for (int g = c3012Fy1.g() - 4; g >= f; g--) {
            if (f(c3012Fy1.e(), g) == 442) {
                c3012Fy1.Y(g + 4);
                long l = l(c3012Fy1);
                if (l != C10323vs.b) {
                    return l;
                }
            }
        }
        return C10323vs.b;
    }
}
