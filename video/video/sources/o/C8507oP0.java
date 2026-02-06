package o;

import o.KZ1;

@Deprecated
/* renamed from: o.oP0  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C8507oP0 implements KZ1 {
    public final long[] d;
    public final long[] e;
    public final long f;
    public final boolean g;

    public C8507oP0(long[] jArr, long[] jArr2, long j) {
        boolean z;
        boolean z2;
        if (jArr.length == jArr2.length) {
            z = true;
        } else {
            z = false;
        }
        C9542sf.a(z);
        int length = jArr2.length;
        if (length > 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        this.g = z2;
        if (z2 && jArr2[0] > 0) {
            int i = length + 1;
            long[] jArr3 = new long[i];
            this.d = jArr3;
            long[] jArr4 = new long[i];
            this.e = jArr4;
            System.arraycopy(jArr, 0, jArr3, 1, length);
            System.arraycopy(jArr2, 0, jArr4, 1, length);
        } else {
            this.d = jArr;
            this.e = jArr2;
        }
        this.f = j;
    }

    @Override // o.KZ1
    public KZ1.a e(long j) {
        if (!this.g) {
            return new KZ1.a(MZ1.c);
        }
        int n = TD2.n(this.e, j, true, true);
        MZ1 mz1 = new MZ1(this.e[n], this.d[n]);
        if (mz1.a != j && n != this.e.length - 1) {
            int i = n + 1;
            return new KZ1.a(mz1, new MZ1(this.e[i], this.d[i]));
        }
        return new KZ1.a(mz1);
    }

    @Override // o.KZ1
    public boolean h() {
        return this.g;
    }

    @Override // o.KZ1
    public long i() {
        return this.f;
    }
}
