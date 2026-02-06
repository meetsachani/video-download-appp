package o;

import o.C3976Pu0;
import o.KZ1;

@Deprecated
/* renamed from: o.Ou0  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3879Ou0 implements KZ1 {
    public final C3976Pu0 d;
    public final long e;

    public C3879Ou0(C3976Pu0 c3976Pu0, long j) {
        this.d = c3976Pu0;
        this.e = j;
    }

    public final MZ1 a(long j, long j2) {
        return new MZ1((j * 1000000) / this.d.e, this.e + j2);
    }

    @Override // o.KZ1
    public KZ1.a e(long j) {
        long j2;
        C9542sf.k(this.d.k);
        C3976Pu0 c3976Pu0 = this.d;
        C3976Pu0.a aVar = c3976Pu0.k;
        long[] jArr = aVar.a;
        long[] jArr2 = aVar.b;
        int n = TD2.n(jArr, c3976Pu0.l(j), true, false);
        long j3 = 0;
        if (n == -1) {
            j2 = 0;
        } else {
            j2 = jArr[n];
        }
        if (n != -1) {
            j3 = jArr2[n];
        }
        MZ1 a = a(j2, j3);
        if (a.a != j && n != jArr.length - 1) {
            int i = n + 1;
            return new KZ1.a(a, a(jArr[i], jArr2[i]));
        }
        return new KZ1.a(a);
    }

    @Override // o.KZ1
    public boolean h() {
        return true;
    }

    @Override // o.KZ1
    public long i() {
        return this.d.h();
    }
}
