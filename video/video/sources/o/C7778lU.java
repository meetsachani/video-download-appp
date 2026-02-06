package o;

@Deprecated
/* renamed from: o.lU  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C7778lU implements InterfaceC7292jU {
    public final C6979iC b;
    public final long c;

    public C7778lU(C6979iC c6979iC, long j) {
        this.b = c6979iC;
        this.c = j;
    }

    @Override // o.InterfaceC7292jU
    public long c(long j) {
        return this.b.h[(int) j] - this.c;
    }

    @Override // o.InterfaceC7292jU
    public long d(long j, long j2) {
        return this.b.g[(int) j];
    }

    @Override // o.InterfaceC7292jU
    public long e(long j, long j2) {
        return 0L;
    }

    @Override // o.InterfaceC7292jU
    public long f(long j, long j2) {
        return C10323vs.b;
    }

    @Override // o.InterfaceC7292jU
    public XN1 g(long j) {
        C6979iC c6979iC = this.b;
        int i = (int) j;
        return new XN1(null, c6979iC.f[i], c6979iC.e[i]);
    }

    @Override // o.InterfaceC7292jU
    public long h(long j, long j2) {
        return this.b.a(j + this.c);
    }

    @Override // o.InterfaceC7292jU
    public long i(long j) {
        return this.b.d;
    }

    @Override // o.InterfaceC7292jU
    public boolean j() {
        return true;
    }

    @Override // o.InterfaceC7292jU
    public long k() {
        return 0L;
    }

    @Override // o.InterfaceC7292jU
    public long l(long j, long j2) {
        return this.b.d;
    }
}
