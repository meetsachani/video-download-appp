package o;

import o.KZ1;

@Deprecated
/* loaded from: classes2.dex */
public final class EJ2 implements KZ1 {
    public final CJ2 d;
    public final int e;
    public final long f;
    public final long g;
    public final long h;

    public EJ2(CJ2 cj2, int i, long j, long j2) {
        this.d = cj2;
        this.e = i;
        this.f = j;
        long j3 = (j2 - j) / cj2.e;
        this.g = j3;
        this.h = a(j3);
    }

    public final long a(long j) {
        return TD2.C1(j * this.e, 1000000L, this.d.c);
    }

    @Override // o.KZ1
    public KZ1.a e(long j) {
        long x = TD2.x((this.d.c * j) / (this.e * 1000000), 0L, this.g - 1);
        long j2 = this.f + (this.d.e * x);
        long a = a(x);
        MZ1 mz1 = new MZ1(a, j2);
        if (a < j && x != this.g - 1) {
            long j3 = x + 1;
            return new KZ1.a(mz1, new MZ1(a(j3), this.f + (this.d.e * j3)));
        }
        return new KZ1.a(mz1);
    }

    @Override // o.KZ1
    public boolean h() {
        return true;
    }

    @Override // o.KZ1
    public long i() {
        return this.h;
    }
}
