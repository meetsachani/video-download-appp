package o;

import java.util.Collections;
import java.util.List;
import o.C10833xx0;
import o.Yu2;

@Deprecated
/* renamed from: o.x80  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C10635x80 implements InterfaceC8545oa0 {
    public final List<Yu2.a> a;
    public final InterfaceC10568wr2[] b;
    public boolean c;
    public int d;
    public int e;
    public long f = C10323vs.b;

    public C10635x80(List<Yu2.a> list) {
        this.a = list;
        this.b = new InterfaceC10568wr2[list.size()];
    }

    @Override // o.InterfaceC8545oa0
    public void a(C3012Fy1 c3012Fy1) {
        InterfaceC10568wr2[] interfaceC10568wr2Arr;
        if (this.c) {
            if (this.d != 2 || f(c3012Fy1, 32)) {
                if (this.d != 1 || f(c3012Fy1, 0)) {
                    int f = c3012Fy1.f();
                    int a = c3012Fy1.a();
                    for (InterfaceC10568wr2 interfaceC10568wr2 : this.b) {
                        c3012Fy1.Y(f);
                        interfaceC10568wr2.e(c3012Fy1, a);
                    }
                    this.e += a;
                }
            }
        }
    }

    @Override // o.InterfaceC8545oa0
    public void b() {
        this.c = false;
        this.f = C10323vs.b;
    }

    @Override // o.InterfaceC8545oa0
    public void c() {
        if (this.c) {
            if (this.f != C10323vs.b) {
                for (InterfaceC10568wr2 interfaceC10568wr2 : this.b) {
                    interfaceC10568wr2.b(this.f, 1, this.e, 0, null);
                }
            }
            this.c = false;
        }
    }

    @Override // o.InterfaceC8545oa0
    public void d(InterfaceC4518Vj0 interfaceC4518Vj0, Yu2.e eVar) {
        for (int i = 0; i < this.b.length; i++) {
            Yu2.a aVar = this.a.get(i);
            eVar.a();
            InterfaceC10568wr2 b = interfaceC4518Vj0.b(eVar.c(), 3);
            b.a(new C10833xx0.b().U(eVar.b()).g0(C4128Rj1.K0).V(Collections.singletonList(aVar.c)).X(aVar.a).G());
            this.b[i] = b;
        }
    }

    @Override // o.InterfaceC8545oa0
    public void e(long j, int i) {
        if ((i & 4) == 0) {
            return;
        }
        this.c = true;
        if (j != C10323vs.b) {
            this.f = j;
        }
        this.e = 0;
        this.d = 2;
    }

    public final boolean f(C3012Fy1 c3012Fy1, int i) {
        if (c3012Fy1.a() == 0) {
            return false;
        }
        if (c3012Fy1.L() != i) {
            this.c = false;
        }
        this.d--;
        return this.c;
    }
}
