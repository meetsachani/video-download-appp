package o;

import android.net.Uri;
import o.C10833xx0;
import o.C8322nf1;
import o.FU;
import o.InterfaceC7583kh1;
import o.OU;

@Deprecated
/* renamed from: o.x82  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C10637x82 extends AbstractC10541wl {
    public final OU c1;
    public final FU.a d1;
    public final C10833xx0 e1;
    public final long f1;
    public final M11 g1;
    public final boolean h1;
    public final AbstractC7373jp2 i1;
    public final C8322nf1 j1;
    @InterfaceC11300zs1
    public InterfaceC4261Sr2 k1;

    /* renamed from: o.x82$b */
    /* loaded from: classes2.dex */
    public static final class b {
        public final FU.a a;
        public M11 b = new C11223zZ();
        public boolean c = true;
        @InterfaceC11300zs1
        public Object d;
        @InterfaceC11300zs1
        public String e;

        public b(FU.a aVar) {
            this.a = (FU.a) C9542sf.g(aVar);
        }

        public C10637x82 a(C8322nf1.k kVar, long j) {
            return new C10637x82(this.e, kVar, this.a, j, this.b, this.c, this.d);
        }

        @InterfaceC6181ey
        public b b(@InterfaceC11300zs1 M11 m11) {
            if (m11 == null) {
                m11 = new C11223zZ();
            }
            this.b = m11;
            return this;
        }

        @InterfaceC6181ey
        public b c(@InterfaceC11300zs1 Object obj) {
            this.d = obj;
            return this;
        }

        @InterfaceC6181ey
        @Deprecated
        public b d(@InterfaceC11300zs1 String str) {
            this.e = str;
            return this;
        }

        @InterfaceC6181ey
        public b e(boolean z) {
            this.c = z;
            return this;
        }
    }

    @Override // o.InterfaceC7583kh1
    public InterfaceC4410Ug1 h(InterfaceC7583kh1.b bVar, InterfaceC10877y8 interfaceC10877y8, long j) {
        return new C10394w82(this.c1, this.d1, this.k1, this.e1, this.f1, this.g1, b0(bVar), this.h1);
    }

    @Override // o.InterfaceC7583kh1
    public C8322nf1 k() {
        return this.j1;
    }

    @Override // o.AbstractC10541wl
    public void k0(@InterfaceC11300zs1 InterfaceC4261Sr2 interfaceC4261Sr2) {
        this.k1 = interfaceC4261Sr2;
        p0(this.i1);
    }

    @Override // o.InterfaceC7583kh1
    public void s(InterfaceC4410Ug1 interfaceC4410Ug1) {
        ((C10394w82) interfaceC4410Ug1).p();
    }

    public C10637x82(@InterfaceC11300zs1 String str, C8322nf1.k kVar, FU.a aVar, long j, M11 m11, boolean z, @InterfaceC11300zs1 Object obj) {
        this.d1 = aVar;
        this.f1 = j;
        this.g1 = m11;
        this.h1 = z;
        C8322nf1 a2 = new C8322nf1.c().L(Uri.EMPTY).D(kVar.X.toString()).I(AbstractC5317bO0.M(kVar)).K(obj).a();
        this.j1 = a2;
        C10833xx0.b W = new C10833xx0.b().g0((String) C3743Nk1.a(kVar.Y, C4128Rj1.p0)).X(kVar.Z).i0(kVar.Y0).e0(kVar.Z0).W(kVar.a1);
        String str2 = kVar.b1;
        this.e1 = W.U(str2 != null ? str2 : str).G();
        this.c1 = new OU.b().j(kVar.X).c(1).a();
        this.i1 = new C9419s82(j, true, false, false, (Object) null, a2);
    }

    @Override // o.InterfaceC7583kh1
    public void Q() {
    }

    @Override // o.AbstractC10541wl
    public void q0() {
    }
}
