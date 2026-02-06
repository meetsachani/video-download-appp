package o;

import android.os.Looper;
import o.AbstractC7373jp2;
import o.C8322nf1;
import o.C8727pJ1;
import o.C8970qJ1;
import o.FU;
import o.InterfaceC7493kJ1;
import o.InterfaceC7583kh1;

@Deprecated
/* renamed from: o.qJ1  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C8970qJ1 extends AbstractC10541wl implements C8727pJ1.b {
    public static final int o1 = 1048576;
    public final C8322nf1 c1;
    public final C8322nf1.h d1;
    public final FU.a e1;
    public final InterfaceC7493kJ1.a f1;
    public final InterfaceC9170r70 g1;
    public final M11 h1;
    public final int i1;
    public boolean j1;
    public long k1;
    public boolean l1;
    public boolean m1;
    @InterfaceC11300zs1
    public InterfaceC4261Sr2 n1;

    /* renamed from: o.qJ1$a */
    /* loaded from: classes2.dex */
    public class a extends AbstractC3696My0 {
        public a(AbstractC7373jp2 abstractC7373jp2) {
            super(abstractC7373jp2);
        }

        @Override // o.AbstractC3696My0, o.AbstractC7373jp2
        public AbstractC7373jp2.b l(int i, AbstractC7373jp2.b bVar, boolean z) {
            super.l(i, bVar, z);
            bVar.a1 = true;
            return bVar;
        }

        @Override // o.AbstractC3696My0, o.AbstractC7373jp2
        public AbstractC7373jp2.d v(int i, AbstractC7373jp2.d dVar, long j) {
            super.v(i, dVar, j);
            dVar.g1 = true;
            return dVar;
        }
    }

    /* renamed from: o.qJ1$b */
    /* loaded from: classes2.dex */
    public static final class b implements InterfaceC9552sh1 {
        public final FU.a c;
        public InterfaceC7493kJ1.a d;
        public InterfaceC9656t70 e;
        public M11 f;
        public int g;

        public b(FU.a aVar) {
            this(aVar, new ZY());
        }

        public static /* synthetic */ InterfaceC7493kJ1 f(InterfaceC4809Yj0 interfaceC4809Yj0, ND1 nd1) {
            return new C9590sr(interfaceC4809Yj0);
        }

        @Override // o.InterfaceC7583kh1.a
        public int[] b() {
            return new int[]{4};
        }

        @Override // o.InterfaceC7583kh1.a
        /* renamed from: g */
        public C8970qJ1 e(C8322nf1 c8322nf1) {
            C9542sf.g(c8322nf1.Y);
            return new C8970qJ1(c8322nf1, this.c, this.d, this.e.a(c8322nf1), this.f, this.g, null);
        }

        @InterfaceC6181ey
        public b h(int i) {
            this.g = i;
            return this;
        }

        @Override // o.InterfaceC7583kh1.a
        @InterfaceC6181ey
        /* renamed from: i */
        public b d(InterfaceC9656t70 interfaceC9656t70) {
            this.e = (InterfaceC9656t70) C9542sf.h(interfaceC9656t70, "MediaSource.Factory#setDrmSessionManagerProvider no longer handles null by instantiating a new DefaultDrmSessionManagerProvider. Explicitly construct and pass an instance in order to retain the old behavior.");
            return this;
        }

        @Override // o.InterfaceC7583kh1.a
        @InterfaceC6181ey
        /* renamed from: j */
        public b a(M11 m11) {
            this.f = (M11) C9542sf.h(m11, "MediaSource.Factory#setLoadErrorHandlingPolicy no longer handles null by instantiating a new DefaultLoadErrorHandlingPolicy. Explicitly construct and pass an instance in order to retain the old behavior.");
            return this;
        }

        public b(FU.a aVar, final InterfaceC4809Yj0 interfaceC4809Yj0) {
            this(aVar, new InterfaceC7493kJ1.a() { // from class: o.rJ1
                @Override // o.InterfaceC7493kJ1.a
                public final InterfaceC7493kJ1 a(ND1 nd1) {
                    return C8970qJ1.b.f(InterfaceC4809Yj0.this, nd1);
                }
            });
        }

        public b(FU.a aVar, InterfaceC7493kJ1.a aVar2) {
            this(aVar, aVar2, new OY(), new C11223zZ(), 1048576);
        }

        public b(FU.a aVar, InterfaceC7493kJ1.a aVar2, InterfaceC9656t70 interfaceC9656t70, M11 m11, int i) {
            this.c = aVar;
            this.d = aVar2;
            this.e = interfaceC9656t70;
            this.f = m11;
            this.g = i;
        }
    }

    public /* synthetic */ C8970qJ1(C8322nf1 c8322nf1, FU.a aVar, InterfaceC7493kJ1.a aVar2, InterfaceC9170r70 interfaceC9170r70, M11 m11, int i, a aVar3) {
        this(c8322nf1, aVar, aVar2, interfaceC9170r70, m11, i);
    }

    @Override // o.C8727pJ1.b
    public void O(long j, boolean z, boolean z2) {
        if (j == C10323vs.b) {
            j = this.k1;
        }
        if (!this.j1 && this.k1 == j && this.l1 == z && this.m1 == z2) {
            return;
        }
        this.k1 = j;
        this.l1 = z;
        this.m1 = z2;
        this.j1 = false;
        r0();
    }

    @Override // o.InterfaceC7583kh1
    public InterfaceC4410Ug1 h(InterfaceC7583kh1.b bVar, InterfaceC10877y8 interfaceC10877y8, long j) {
        FU a2 = this.e1.a();
        InterfaceC4261Sr2 interfaceC4261Sr2 = this.n1;
        if (interfaceC4261Sr2 != null) {
            a2.s(interfaceC4261Sr2);
        }
        return new C8727pJ1(this.d1.X, a2, this.f1.a(i0()), this.g1, Y(bVar), this.h1, b0(bVar), this, interfaceC10877y8, this.d1.a1, this.i1);
    }

    @Override // o.InterfaceC7583kh1
    public C8322nf1 k() {
        return this.c1;
    }

    @Override // o.AbstractC10541wl
    public void k0(@InterfaceC11300zs1 InterfaceC4261Sr2 interfaceC4261Sr2) {
        this.n1 = interfaceC4261Sr2;
        this.g1.e((Looper) C9542sf.g(Looper.myLooper()), i0());
        this.g1.m0();
        r0();
    }

    @Override // o.AbstractC10541wl
    public void q0() {
        this.g1.g();
    }

    public final void r0() {
        AbstractC7373jp2 c9419s82 = new C9419s82(this.k1, this.l1, false, this.m1, (Object) null, this.c1);
        if (this.j1) {
            c9419s82 = new a(c9419s82);
        }
        p0(c9419s82);
    }

    @Override // o.InterfaceC7583kh1
    public void s(InterfaceC4410Ug1 interfaceC4410Ug1) {
        ((C8727pJ1) interfaceC4410Ug1).d0();
    }

    public C8970qJ1(C8322nf1 c8322nf1, FU.a aVar, InterfaceC7493kJ1.a aVar2, InterfaceC9170r70 interfaceC9170r70, M11 m11, int i) {
        this.d1 = (C8322nf1.h) C9542sf.g(c8322nf1.Y);
        this.c1 = c8322nf1;
        this.e1 = aVar;
        this.f1 = aVar2;
        this.g1 = interfaceC9170r70;
        this.h1 = m11;
        this.i1 = i;
        this.j1 = true;
        this.k1 = C10323vs.b;
    }

    @Override // o.InterfaceC7583kh1
    public void Q() {
    }
}
