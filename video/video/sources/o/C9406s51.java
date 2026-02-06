package o;

import java.util.HashMap;
import java.util.Map;
import o.InterfaceC7583kh1;
import o.U52;

@Deprecated
/* renamed from: o.s51  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C9406s51 extends JN2 {
    public final int h1;
    public final Map<InterfaceC7583kh1.b, InterfaceC7583kh1.b> i1;
    public final Map<InterfaceC4410Ug1, InterfaceC7583kh1.b> j1;

    /* renamed from: o.s51$a */
    /* loaded from: classes2.dex */
    public static final class a extends AbstractC3696My0 {
        public a(AbstractC7373jp2 abstractC7373jp2) {
            super(abstractC7373jp2);
        }

        @Override // o.AbstractC3696My0, o.AbstractC7373jp2
        public int j(int i, int i2, boolean z) {
            int j = this.a1.j(i, i2, z);
            if (j == -1) {
                return f(z);
            }
            return j;
        }

        @Override // o.AbstractC3696My0, o.AbstractC7373jp2
        public int s(int i, int i2, boolean z) {
            int s = this.a1.s(i, i2, z);
            if (s == -1) {
                return h(z);
            }
            return s;
        }
    }

    /* renamed from: o.s51$b */
    /* loaded from: classes2.dex */
    public static final class b extends AbstractC8892q0 {
        public final AbstractC7373jp2 d1;
        public final int e1;
        public final int f1;
        public final int g1;

        public b(AbstractC7373jp2 abstractC7373jp2, int i) {
            super(false, new U52.b(i));
            this.d1 = abstractC7373jp2;
            int n = abstractC7373jp2.n();
            this.e1 = n;
            this.f1 = abstractC7373jp2.w();
            this.g1 = i;
            if (n > 0) {
                C9542sf.j(i <= Integer.MAX_VALUE / n, "LoopingMediaSource contains too many periods");
            }
        }

        @Override // o.AbstractC8892q0
        public int A(Object obj) {
            if (!(obj instanceof Integer)) {
                return -1;
            }
            return ((Integer) obj).intValue();
        }

        @Override // o.AbstractC8892q0
        public int B(int i) {
            return i / this.e1;
        }

        @Override // o.AbstractC8892q0
        public int C(int i) {
            return i / this.f1;
        }

        @Override // o.AbstractC8892q0
        public Object F(int i) {
            return Integer.valueOf(i);
        }

        @Override // o.AbstractC8892q0
        public int H(int i) {
            return i * this.e1;
        }

        @Override // o.AbstractC8892q0
        public int I(int i) {
            return i * this.f1;
        }

        @Override // o.AbstractC8892q0
        public AbstractC7373jp2 L(int i) {
            return this.d1;
        }

        @Override // o.AbstractC7373jp2
        public int n() {
            return this.e1 * this.g1;
        }

        @Override // o.AbstractC7373jp2
        public int w() {
            return this.f1 * this.g1;
        }
    }

    public C9406s51(InterfaceC7583kh1 interfaceC7583kh1) {
        this(interfaceC7583kh1, Integer.MAX_VALUE);
    }

    @Override // o.JN2
    @InterfaceC11300zs1
    public InterfaceC7583kh1.b F0(InterfaceC7583kh1.b bVar) {
        if (this.h1 != Integer.MAX_VALUE) {
            return this.i1.get(bVar);
        }
        return bVar;
    }

    @Override // o.JN2
    public void L0(AbstractC7373jp2 abstractC7373jp2) {
        AbstractC7373jp2 aVar;
        if (this.h1 != Integer.MAX_VALUE) {
            aVar = new b(abstractC7373jp2, this.h1);
        } else {
            aVar = new a(abstractC7373jp2);
        }
        p0(aVar);
    }

    @Override // o.JN2, o.InterfaceC7583kh1
    public boolean R() {
        return false;
    }

    @Override // o.JN2, o.InterfaceC7583kh1
    @InterfaceC11300zs1
    public AbstractC7373jp2 S() {
        K81 k81 = (K81) this.f1;
        if (this.h1 != Integer.MAX_VALUE) {
            return new b(k81.S0(), this.h1);
        }
        return new a(k81.S0());
    }

    @Override // o.JN2, o.InterfaceC7583kh1
    public InterfaceC4410Ug1 h(InterfaceC7583kh1.b bVar, InterfaceC10877y8 interfaceC10877y8, long j) {
        if (this.h1 == Integer.MAX_VALUE) {
            return this.f1.h(bVar, interfaceC10877y8, j);
        }
        InterfaceC7583kh1.b a2 = bVar.a(AbstractC8892q0.D(bVar.a));
        this.i1.put(a2, bVar);
        InterfaceC4410Ug1 h = this.f1.h(a2, interfaceC10877y8, j);
        this.j1.put(h, a2);
        return h;
    }

    @Override // o.JN2, o.InterfaceC7583kh1
    public void s(InterfaceC4410Ug1 interfaceC4410Ug1) {
        this.f1.s(interfaceC4410Ug1);
        InterfaceC7583kh1.b remove = this.j1.remove(interfaceC4410Ug1);
        if (remove != null) {
            this.i1.remove(remove);
        }
    }

    public C9406s51(InterfaceC7583kh1 interfaceC7583kh1, int i) {
        super(new K81(interfaceC7583kh1, false));
        C9542sf.a(i > 0);
        this.h1 = i;
        this.i1 = new HashMap();
        this.j1 = new HashMap();
    }
}
