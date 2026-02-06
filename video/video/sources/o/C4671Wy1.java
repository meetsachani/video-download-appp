package o;

import o.C10833xx0;
import o.Yu2;

@Deprecated
/* renamed from: o.Wy1  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4671Wy1 implements HZ1 {
    public C10833xx0 a;
    public C10071up2 b;
    public InterfaceC10568wr2 c;

    public C4671Wy1(String str) {
        this.a = new C10833xx0.b().g0(str).G();
    }

    @Override // o.HZ1
    public void a(C3012Fy1 c3012Fy1) {
        b();
        long d = this.b.d();
        long e = this.b.e();
        if (d != C10323vs.b && e != C10323vs.b) {
            C10833xx0 c10833xx0 = this.a;
            if (e != c10833xx0.k1) {
                C10833xx0 G = c10833xx0.b().k0(e).G();
                this.a = G;
                this.c.a(G);
            }
            int a = c3012Fy1.a();
            this.c.e(c3012Fy1, a);
            this.c.b(d, 1, a, 0, null);
        }
    }

    @InterfaceC8557od0({"timestampAdjuster", "output"})
    public final void b() {
        C9542sf.k(this.b);
        TD2.o(this.c);
    }

    @Override // o.HZ1
    public void c(C10071up2 c10071up2, InterfaceC4518Vj0 interfaceC4518Vj0, Yu2.e eVar) {
        this.b = c10071up2;
        eVar.a();
        InterfaceC10568wr2 b = interfaceC4518Vj0.b(eVar.c(), 5);
        this.c = b;
        b.a(this.a);
    }
}
