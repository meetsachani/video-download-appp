package o;

import o.KZ1;

@Deprecated
/* renamed from: o.mK  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class C7999mK implements KZ1 {
    public final long d;
    public final long e;
    public final int f;
    public final long g;
    public final int h;
    public final long i;
    public final boolean j;

    public C7999mK(long j, long j2, int i, int i2) {
        this(j, j2, i, i2, false);
    }

    public static long d(long j, long j2, int i) {
        return (Math.max(0L, j - j2) * 8000000) / i;
    }

    public final long a(long j) {
        int i = this.f;
        long j2 = (((j * this.h) / 8000000) / i) * i;
        long j3 = this.g;
        if (j3 != -1) {
            j2 = Math.min(j2, j3 - i);
        }
        return this.e + Math.max(j2, 0L);
    }

    public long b(long j) {
        return d(j, this.e, this.h);
    }

    @Override // o.KZ1
    public KZ1.a e(long j) {
        if (this.g == -1 && !this.j) {
            return new KZ1.a(new MZ1(0L, this.e));
        }
        long a = a(j);
        long b = b(a);
        MZ1 mz1 = new MZ1(b, a);
        if (this.g != -1 && b < j) {
            int i = this.f;
            if (i + a < this.d) {
                long j2 = a + i;
                return new KZ1.a(mz1, new MZ1(b(j2), j2));
            }
        }
        return new KZ1.a(mz1);
    }

    @Override // o.KZ1
    public boolean h() {
        if (this.g == -1 && !this.j) {
            return false;
        }
        return true;
    }

    @Override // o.KZ1
    public long i() {
        return this.i;
    }

    public C7999mK(long j, long j2, int i, int i2, boolean z) {
        this.d = j;
        this.e = j2;
        this.f = i2 == -1 ? 1 : i2;
        this.h = i;
        this.j = z;
        if (j == -1) {
            this.g = -1L;
            this.i = C10323vs.b;
            return;
        }
        this.g = j - j2;
        this.i = d(j, j2, i);
    }
}
