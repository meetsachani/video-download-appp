package o;

import o.C3062Gl1;
import o.KZ1;

@Deprecated
/* loaded from: classes2.dex */
public final class KE2 implements NZ1 {
    public static final String h = "VbriSeeker";
    public final long[] d;
    public final long[] e;
    public final long f;
    public final long g;

    public KE2(long[] jArr, long[] jArr2, long j, long j2) {
        this.d = jArr;
        this.e = jArr2;
        this.f = j;
        this.g = j2;
    }

    @InterfaceC11300zs1
    public static KE2 a(long j, long j2, C3062Gl1.a aVar, C3012Fy1 c3012Fy1) {
        int i;
        int L;
        c3012Fy1.Z(10);
        int s = c3012Fy1.s();
        KE2 ke2 = null;
        if (s <= 0) {
            return null;
        }
        int i2 = aVar.d;
        long j3 = s;
        if (i2 >= 32000) {
            i = 1152;
        } else {
            i = C3062Gl1.m;
        }
        long C1 = TD2.C1(j3, i * 1000000, i2);
        int R = c3012Fy1.R();
        int R2 = c3012Fy1.R();
        int R3 = c3012Fy1.R();
        int i3 = 2;
        c3012Fy1.Z(2);
        long j4 = j2 + aVar.c;
        long[] jArr = new long[R];
        long[] jArr2 = new long[R];
        int i4 = 0;
        long j5 = j2;
        while (i4 < R) {
            KE2 ke22 = ke2;
            int i5 = R2;
            long[] jArr3 = jArr;
            jArr3[i4] = (i4 * C1) / R;
            jArr2[i4] = Math.max(j5, j4);
            if (R3 != 1) {
                if (R3 != i3) {
                    if (R3 != 3) {
                        if (R3 != 4) {
                            return ke22;
                        }
                        L = c3012Fy1.P();
                    } else {
                        L = c3012Fy1.O();
                    }
                } else {
                    L = c3012Fy1.R();
                }
            } else {
                L = c3012Fy1.L();
            }
            j5 += L * i5;
            i4++;
            ke2 = ke22;
            R2 = i5;
            jArr = jArr3;
            j4 = j4;
            i3 = 2;
        }
        long[] jArr4 = jArr;
        if (j != -1 && j != j5) {
            I31.n(h, "VBRI data size mismatch: " + j + C6566gU0.h + j5);
        }
        return new KE2(jArr4, jArr2, C1, j5);
    }

    @Override // o.NZ1
    public long c(long j) {
        return this.d[TD2.n(this.e, j, true, true)];
    }

    @Override // o.KZ1
    public KZ1.a e(long j) {
        int n = TD2.n(this.d, j, true, true);
        MZ1 mz1 = new MZ1(this.d[n], this.e[n]);
        if (mz1.a < j && n != this.d.length - 1) {
            int i = n + 1;
            return new KZ1.a(mz1, new MZ1(this.d[i], this.e[i]));
        }
        return new KZ1.a(mz1);
    }

    @Override // o.NZ1
    public long f() {
        return this.g;
    }

    @Override // o.KZ1
    public boolean h() {
        return true;
    }

    @Override // o.KZ1
    public long i() {
        return this.f;
    }
}
