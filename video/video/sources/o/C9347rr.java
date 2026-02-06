package o;

import android.util.SparseArray;
import java.io.IOException;
import java.util.List;
import o.InterfaceC10568wr2;
import o.InterfaceC6493gC;

@Deprecated
/* renamed from: o.rr  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C9347rr implements InterfaceC4518Vj0, InterfaceC6493gC {
    public static final InterfaceC6493gC.a e1 = new InterfaceC6493gC.a() { // from class: o.qr
        @Override // o.InterfaceC6493gC.a
        public final InterfaceC6493gC a(int i, C10833xx0 c10833xx0, boolean z, List list, InterfaceC10568wr2 interfaceC10568wr2, ND1 nd1) {
            return C9347rr.f(i, c10833xx0, z, list, interfaceC10568wr2, nd1);
        }
    };
    public static final KE1 f1 = new KE1();
    public final InterfaceC4324Tj0 X;
    public final int Y;
    public final SparseArray<a> Y0 = new SparseArray<>();
    public final C10833xx0 Z;
    public boolean Z0;
    @InterfaceC11300zs1
    public InterfaceC6493gC.b a1;
    public long b1;
    public KZ1 c1;
    public C10833xx0[] d1;

    /* renamed from: o.rr$a */
    /* loaded from: classes2.dex */
    public static final class a implements InterfaceC10568wr2 {
        public final int d;
        public final int e;
        @InterfaceC11300zs1
        public final C10833xx0 f;
        public final W70 g = new W70();
        public C10833xx0 h;
        public InterfaceC10568wr2 i;
        public long j;

        public a(int i, int i2, @InterfaceC11300zs1 C10833xx0 c10833xx0) {
            this.d = i;
            this.e = i2;
            this.f = c10833xx0;
        }

        @Override // o.InterfaceC10568wr2
        public void a(C10833xx0 c10833xx0) {
            C10833xx0 c10833xx02 = this.f;
            if (c10833xx02 != null) {
                c10833xx0 = c10833xx0.l(c10833xx02);
            }
            this.h = c10833xx0;
            ((InterfaceC10568wr2) TD2.o(this.i)).a(this.h);
        }

        @Override // o.InterfaceC10568wr2
        public void b(long j, int i, int i2, int i3, @InterfaceC11300zs1 InterfaceC10568wr2.a aVar) {
            long j2 = this.j;
            if (j2 != C10323vs.b && j >= j2) {
                this.i = this.g;
            }
            ((InterfaceC10568wr2) TD2.o(this.i)).b(j, i, i2, i3, aVar);
        }

        @Override // o.InterfaceC10568wr2
        public int d(CU cu, int i, boolean z, int i2) throws IOException {
            return ((InterfaceC10568wr2) TD2.o(this.i)).c(cu, i, z);
        }

        @Override // o.InterfaceC10568wr2
        public void f(C3012Fy1 c3012Fy1, int i, int i2) {
            ((InterfaceC10568wr2) TD2.o(this.i)).e(c3012Fy1, i);
        }

        public void g(@InterfaceC11300zs1 InterfaceC6493gC.b bVar, long j) {
            if (bVar == null) {
                this.i = this.g;
                return;
            }
            this.j = j;
            InterfaceC10568wr2 b = bVar.b(this.d, this.e);
            this.i = b;
            C10833xx0 c10833xx0 = this.h;
            if (c10833xx0 != null) {
                b.a(c10833xx0);
            }
        }
    }

    public C9347rr(InterfaceC4324Tj0 interfaceC4324Tj0, int i, C10833xx0 c10833xx0) {
        this.X = interfaceC4324Tj0;
        this.Y = i;
        this.Z = c10833xx0;
    }

    public static /* synthetic */ InterfaceC6493gC f(int i, C10833xx0 c10833xx0, boolean z, List list, InterfaceC10568wr2 interfaceC10568wr2, ND1 nd1) {
        int i2;
        InterfaceC4324Tj0 c3894Oz0;
        String str = c10833xx0.f1;
        if (C4128Rj1.s(str)) {
            return null;
        }
        if (C4128Rj1.r(str)) {
            c3894Oz0 = new C10997yd1(1);
        } else {
            if (z) {
                i2 = 4;
            } else {
                i2 = 0;
            }
            c3894Oz0 = new C3894Oz0(i2, null, null, list, interfaceC10568wr2);
        }
        return new C9347rr(c3894Oz0, i, c10833xx0);
    }

    @Override // o.InterfaceC6493gC
    public boolean a(InterfaceC4421Uj0 interfaceC4421Uj0) throws IOException {
        boolean z;
        int j = this.X.j(interfaceC4421Uj0, f1);
        if (j != 1) {
            z = true;
        } else {
            z = false;
        }
        C9542sf.i(z);
        if (j != 0) {
            return false;
        }
        return true;
    }

    @Override // o.InterfaceC4518Vj0
    public InterfaceC10568wr2 b(int i, int i2) {
        boolean z;
        C10833xx0 c10833xx0;
        a aVar = this.Y0.get(i);
        if (aVar == null) {
            if (this.d1 == null) {
                z = true;
            } else {
                z = false;
            }
            C9542sf.i(z);
            if (i2 == this.Y) {
                c10833xx0 = this.Z;
            } else {
                c10833xx0 = null;
            }
            aVar = new a(i, i2, c10833xx0);
            aVar.g(this.a1, this.b1);
            this.Y0.put(i, aVar);
        }
        return aVar;
    }

    @Override // o.InterfaceC6493gC
    public void c(@InterfaceC11300zs1 InterfaceC6493gC.b bVar, long j, long j2) {
        this.a1 = bVar;
        this.b1 = j2;
        if (!this.Z0) {
            this.X.b(this);
            if (j != C10323vs.b) {
                this.X.a(0L, j);
            }
            this.Z0 = true;
            return;
        }
        InterfaceC4324Tj0 interfaceC4324Tj0 = this.X;
        if (j == C10323vs.b) {
            j = 0;
        }
        interfaceC4324Tj0.a(0L, j);
        for (int i = 0; i < this.Y0.size(); i++) {
            this.Y0.valueAt(i).g(bVar, j2);
        }
    }

    @Override // o.InterfaceC6493gC
    @InterfaceC11300zs1
    public C6979iC d() {
        KZ1 kz1 = this.c1;
        if (kz1 instanceof C6979iC) {
            return (C6979iC) kz1;
        }
        return null;
    }

    @Override // o.InterfaceC6493gC
    @InterfaceC11300zs1
    public C10833xx0[] e() {
        return this.d1;
    }

    @Override // o.InterfaceC6493gC
    public void g() {
        this.X.g();
    }

    @Override // o.InterfaceC4518Vj0
    public void n() {
        C10833xx0[] c10833xx0Arr = new C10833xx0[this.Y0.size()];
        for (int i = 0; i < this.Y0.size(); i++) {
            c10833xx0Arr[i] = (C10833xx0) C9542sf.k(this.Y0.valueAt(i).h);
        }
        this.d1 = c10833xx0Arr;
    }

    @Override // o.InterfaceC4518Vj0
    public void p(KZ1 kz1) {
        this.c1 = kz1;
    }
}
