package o;

import java.io.IOException;
import java.util.List;
import java.util.Set;
import o.AbstractC5317bO0;
import o.InterfaceC4410Ug1;
import o.InterfaceC7583kh1;

@Deprecated
/* renamed from: o.it0  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class C7144it0 extends JN2 {
    public final AbstractC9481sO0<Integer> h1;

    /* renamed from: o.it0$a */
    /* loaded from: classes2.dex */
    public static final class a implements InterfaceC4410Ug1, InterfaceC4410Ug1.a {
        public final InterfaceC4410Ug1 X;
        public final AbstractC9481sO0<Integer> Y;
        @InterfaceC11300zs1
        public C10079ur2 Y0;
        @InterfaceC11300zs1
        public InterfaceC4410Ug1.a Z;

        public a(InterfaceC4410Ug1 interfaceC4410Ug1, AbstractC9481sO0<Integer> abstractC9481sO0) {
            this.X = interfaceC4410Ug1;
            this.Y = abstractC9481sO0;
        }

        @Override // o.InterfaceC4410Ug1, o.G02
        public boolean a() {
            return this.X.a();
        }

        @Override // o.G02.a
        /* renamed from: b */
        public void l(InterfaceC4410Ug1 interfaceC4410Ug1) {
            ((InterfaceC4410Ug1.a) C9542sf.g(this.Z)).l(this);
        }

        @Override // o.InterfaceC4410Ug1, o.G02
        public long c() {
            return this.X.c();
        }

        @Override // o.InterfaceC4410Ug1, o.G02
        public boolean d(long j) {
            return this.X.d(j);
        }

        @Override // o.InterfaceC4410Ug1
        public long e(long j, LZ1 lz1) {
            return this.X.e(j, lz1);
        }

        @Override // o.InterfaceC4410Ug1, o.G02
        public long f() {
            return this.X.f();
        }

        @Override // o.InterfaceC4410Ug1, o.G02
        public void g(long j) {
            this.X.g(j);
        }

        @Override // o.InterfaceC4410Ug1
        public List<C3031Gd2> h(List<InterfaceC6859hi0> list) {
            return this.X.h(list);
        }

        @Override // o.InterfaceC4410Ug1
        public long i(long j) {
            return this.X.i(j);
        }

        @Override // o.InterfaceC4410Ug1.a
        public void j(InterfaceC4410Ug1 interfaceC4410Ug1) {
            C10079ur2 q = interfaceC4410Ug1.q();
            AbstractC5317bO0.a r = AbstractC5317bO0.r();
            for (int i = 0; i < q.X; i++) {
                C9593sr2 b = q.b(i);
                if (this.Y.contains(Integer.valueOf(b.Z))) {
                    r.g(b);
                }
            }
            this.Y0 = new C10079ur2((C9593sr2[]) r.e().toArray(new C9593sr2[0]));
            ((InterfaceC4410Ug1.a) C9542sf.g(this.Z)).j(this);
        }

        @Override // o.InterfaceC4410Ug1
        public long k() {
            return this.X.k();
        }

        @Override // o.InterfaceC4410Ug1
        public void m() throws IOException {
            this.X.m();
        }

        @Override // o.InterfaceC4410Ug1
        public void o(InterfaceC4410Ug1.a aVar, long j) {
            this.Z = aVar;
            this.X.o(this, j);
        }

        @Override // o.InterfaceC4410Ug1
        public C10079ur2 q() {
            return (C10079ur2) C9542sf.g(this.Y0);
        }

        @Override // o.InterfaceC4410Ug1
        public void r(long j, boolean z) {
            this.X.r(j, z);
        }

        @Override // o.InterfaceC4410Ug1
        public long s(InterfaceC6859hi0[] interfaceC6859hi0Arr, boolean[] zArr, IX1[] ix1Arr, boolean[] zArr2, long j) {
            return this.X.s(interfaceC6859hi0Arr, zArr, ix1Arr, zArr2, j);
        }
    }

    public C7144it0(InterfaceC7583kh1 interfaceC7583kh1, int i) {
        this(interfaceC7583kh1, AbstractC9481sO0.Q(Integer.valueOf(i)));
    }

    @Override // o.JN2, o.InterfaceC7583kh1
    public InterfaceC4410Ug1 h(InterfaceC7583kh1.b bVar, InterfaceC10877y8 interfaceC10877y8, long j) {
        return new a(super.h(bVar, interfaceC10877y8, j), this.h1);
    }

    @Override // o.JN2, o.InterfaceC7583kh1
    public void s(InterfaceC4410Ug1 interfaceC4410Ug1) {
        super.s(((a) interfaceC4410Ug1).X);
    }

    public C7144it0(InterfaceC7583kh1 interfaceC7583kh1, Set<Integer> set) {
        super(interfaceC7583kh1);
        this.h1 = AbstractC9481sO0.G(set);
    }
}
