package o;

import java.io.IOException;
import o.InterfaceC6493gC;

@Deprecated
/* loaded from: classes2.dex */
public final class EP0 extends AbstractC6238fC {
    public final InterfaceC6493gC j;
    public InterfaceC6493gC.b k;
    public long l;
    public volatile boolean m;

    public EP0(FU fu, OU ou, C10833xx0 c10833xx0, int i, @InterfaceC11300zs1 Object obj, InterfaceC6493gC interfaceC6493gC) {
        super(fu, ou, 2, c10833xx0, i, obj, C10323vs.b, C10323vs.b);
        this.j = interfaceC6493gC;
    }

    @Override // o.R11.e
    public void a() throws IOException {
        if (this.l == 0) {
            this.j.c(this.k, C10323vs.b, C10323vs.b);
        }
        try {
            OU e = this.b.e(this.l);
            C4004Qc2 c4004Qc2 = this.i;
            WY wy = new WY(c4004Qc2, e.g, c4004Qc2.a(e));
            while (!this.m && this.j.a(wy)) {
            }
            this.l = wy.getPosition() - this.b.g;
        } finally {
            NU.a(this.i);
        }
    }

    @Override // o.R11.e
    public void c() {
        this.m = true;
    }

    public void g(InterfaceC6493gC.b bVar) {
        this.k = bVar;
    }
}
