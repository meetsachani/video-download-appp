package o;

import o.KZ1;

@Deprecated
/* renamed from: o.pP0  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C8750pP0 implements NZ1 {
    @InterfaceC5056aJ2
    public static final long h = 100000;
    public final long d;
    public final C11106z41 e;
    public final C11106z41 f;
    public long g;

    public C8750pP0(long j, long j2, long j3) {
        this.g = j;
        this.d = j3;
        C11106z41 c11106z41 = new C11106z41();
        this.e = c11106z41;
        C11106z41 c11106z412 = new C11106z41();
        this.f = c11106z412;
        c11106z41.a(0L);
        c11106z412.a(j2);
    }

    public boolean a(long j) {
        C11106z41 c11106z41 = this.e;
        if (j - c11106z41.b(c11106z41.c() - 1) < 100000) {
            return true;
        }
        return false;
    }

    public void b(long j, long j2) {
        if (a(j)) {
            return;
        }
        this.e.a(j);
        this.f.a(j2);
    }

    @Override // o.NZ1
    public long c(long j) {
        return this.e.b(TD2.l(this.f, j, true, true));
    }

    public void d(long j) {
        this.g = j;
    }

    @Override // o.KZ1
    public KZ1.a e(long j) {
        int l = TD2.l(this.e, j, true, true);
        MZ1 mz1 = new MZ1(this.e.b(l), this.f.b(l));
        if (mz1.a != j && l != this.e.c() - 1) {
            int i = l + 1;
            return new KZ1.a(mz1, new MZ1(this.e.b(i), this.f.b(i)));
        }
        return new KZ1.a(mz1);
    }

    @Override // o.NZ1
    public long f() {
        return this.d;
    }

    @Override // o.KZ1
    public boolean h() {
        return true;
    }

    @Override // o.KZ1
    public long i() {
        return this.g;
    }
}
