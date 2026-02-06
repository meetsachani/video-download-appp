package o;

import o.C10833xx0;
import o.Yu2;

@Deprecated
/* loaded from: classes2.dex */
public final class NL0 implements InterfaceC8545oa0 {
    public static final String g = "Id3Reader";
    public InterfaceC10568wr2 b;
    public boolean c;
    public int e;
    public int f;
    public final C3012Fy1 a = new C3012Fy1(10);
    public long d = C10323vs.b;

    @Override // o.InterfaceC8545oa0
    public void a(C3012Fy1 c3012Fy1) {
        C9542sf.k(this.b);
        if (!this.c) {
            return;
        }
        int a = c3012Fy1.a();
        int i = this.f;
        if (i < 10) {
            int min = Math.min(a, 10 - i);
            System.arraycopy(c3012Fy1.e(), c3012Fy1.f(), this.a.e(), this.f, min);
            if (this.f + min == 10) {
                this.a.Y(0);
                if (73 == this.a.L() && 68 == this.a.L() && 51 == this.a.L()) {
                    this.a.Z(3);
                    this.e = this.a.K() + 10;
                } else {
                    I31.n(g, "Discarding invalid ID3 tag");
                    this.c = false;
                    return;
                }
            }
        }
        int min2 = Math.min(a, this.e - this.f);
        this.b.e(c3012Fy1, min2);
        this.f += min2;
    }

    @Override // o.InterfaceC8545oa0
    public void b() {
        this.c = false;
        this.d = C10323vs.b;
    }

    @Override // o.InterfaceC8545oa0
    public void c() {
        int i;
        C9542sf.k(this.b);
        if (this.c && (i = this.e) != 0 && this.f == i) {
            long j = this.d;
            if (j != C10323vs.b) {
                this.b.b(j, 1, i, 0, null);
            }
            this.c = false;
        }
    }

    @Override // o.InterfaceC8545oa0
    public void d(InterfaceC4518Vj0 interfaceC4518Vj0, Yu2.e eVar) {
        eVar.a();
        InterfaceC10568wr2 b = interfaceC4518Vj0.b(eVar.c(), 5);
        this.b = b;
        b.a(new C10833xx0.b().U(eVar.b()).g0(C4128Rj1.w0).G());
    }

    @Override // o.InterfaceC8545oa0
    public void e(long j, int i) {
        if ((i & 4) == 0) {
            return;
        }
        this.c = true;
        if (j != C10323vs.b) {
            this.d = j;
        }
        this.e = 0;
        this.f = 0;
    }
}
