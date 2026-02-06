package o;

import java.io.IOException;
import o.InterfaceC6493gC;

@Deprecated
/* loaded from: classes2.dex */
public class CL extends AbstractC9809tl {

    /* renamed from: o  reason: collision with root package name */
    public final int f427o;
    public final long p;
    public final InterfaceC6493gC q;
    public long r;
    public volatile boolean s;
    public boolean t;

    public CL(FU fu, OU ou, C10833xx0 c10833xx0, int i, @InterfaceC11300zs1 Object obj, long j, long j2, long j3, long j4, long j5, int i2, long j6, InterfaceC6493gC interfaceC6493gC) {
        super(fu, ou, c10833xx0, i, obj, j, j2, j3, j4, j5);
        this.f427o = i2;
        this.p = j6;
        this.q = interfaceC6493gC;
    }

    @Override // o.R11.e
    public final void a() throws IOException {
        long j;
        if (this.r == 0) {
            C10295vl j2 = j();
            j2.c(this.p);
            InterfaceC6493gC interfaceC6493gC = this.q;
            InterfaceC6493gC.b l = l(j2);
            long j3 = this.k;
            long j4 = C10323vs.b;
            if (j3 == C10323vs.b) {
                j = -9223372036854775807L;
            } else {
                j = j3 - this.p;
            }
            long j5 = this.l;
            if (j5 != C10323vs.b) {
                j4 = j5 - this.p;
            }
            interfaceC6493gC.c(l, j, j4);
        }
        try {
            OU e = this.b.e(this.r);
            C4004Qc2 c4004Qc2 = this.i;
            WY wy = new WY(c4004Qc2, e.g, c4004Qc2.a(e));
            while (!this.s && this.q.a(wy)) {
            }
            this.r = wy.getPosition() - this.b.g;
            NU.a(this.i);
            this.t = !this.s;
        } catch (Throwable th) {
            NU.a(this.i);
            throw th;
        }
    }

    @Override // o.R11.e
    public final void c() {
        this.s = true;
    }

    @Override // o.AbstractC2533Be1
    public long g() {
        return this.j + this.f427o;
    }

    @Override // o.AbstractC2533Be1
    public boolean h() {
        return this.t;
    }

    public InterfaceC6493gC.b l(C10295vl c10295vl) {
        return c10295vl;
    }
}
