package o;

import java.util.Iterator;

@NN0(containerOf = {"N"})
@InterfaceC7070ia0
@InterfaceC4238Sm
/* renamed from: o.Rc0  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC4099Rc0<N> implements Iterable<N> {
    public final N X;
    public final N Y;

    /* renamed from: o.Rc0$b */
    /* loaded from: classes3.dex */
    public static final class b<N> extends AbstractC4099Rc0<N> {
        @Override // o.AbstractC4099Rc0
        public boolean e() {
            return true;
        }

        @Override // o.AbstractC4099Rc0
        public boolean equals(@MB Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof AbstractC4099Rc0)) {
                return false;
            }
            AbstractC4099Rc0 abstractC4099Rc0 = (AbstractC4099Rc0) obj;
            if (e() == abstractC4099Rc0.e() && p().equals(abstractC4099Rc0.p()) && r().equals(abstractC4099Rc0.r())) {
                return true;
            }
            return false;
        }

        @Override // o.AbstractC4099Rc0
        public int hashCode() {
            return C2593Bt1.b(p(), r());
        }

        @Override // o.AbstractC4099Rc0, java.lang.Iterable
        public /* bridge */ /* synthetic */ Iterator iterator() {
            return super.iterator();
        }

        @Override // o.AbstractC4099Rc0
        public N p() {
            return h();
        }

        @Override // o.AbstractC4099Rc0
        public N r() {
            return i();
        }

        public String toString() {
            String valueOf = String.valueOf(p());
            String valueOf2 = String.valueOf(r());
            StringBuilder sb = new StringBuilder(valueOf.length() + 6 + valueOf2.length());
            sb.append("<");
            sb.append(valueOf);
            sb.append(B8.d);
            sb.append(valueOf2);
            sb.append(">");
            return sb.toString();
        }

        public b(N n, N n2) {
            super(n, n2);
        }
    }

    /* renamed from: o.Rc0$c */
    /* loaded from: classes3.dex */
    public static final class c<N> extends AbstractC4099Rc0<N> {
        @Override // o.AbstractC4099Rc0
        public boolean e() {
            return false;
        }

        @Override // o.AbstractC4099Rc0
        public boolean equals(@MB Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof AbstractC4099Rc0)) {
                return false;
            }
            AbstractC4099Rc0 abstractC4099Rc0 = (AbstractC4099Rc0) obj;
            if (e() != abstractC4099Rc0.e()) {
                return false;
            }
            if (h().equals(abstractC4099Rc0.h())) {
                return i().equals(abstractC4099Rc0.i());
            }
            if (h().equals(abstractC4099Rc0.i()) && i().equals(abstractC4099Rc0.h())) {
                return true;
            }
            return false;
        }

        @Override // o.AbstractC4099Rc0
        public int hashCode() {
            return h().hashCode() + i().hashCode();
        }

        @Override // o.AbstractC4099Rc0, java.lang.Iterable
        public /* bridge */ /* synthetic */ Iterator iterator() {
            return super.iterator();
        }

        @Override // o.AbstractC4099Rc0
        public N p() {
            throw new UnsupportedOperationException(GE0.l);
        }

        @Override // o.AbstractC4099Rc0
        public N r() {
            throw new UnsupportedOperationException(GE0.l);
        }

        public String toString() {
            String valueOf = String.valueOf(h());
            String valueOf2 = String.valueOf(i());
            StringBuilder sb = new StringBuilder(valueOf.length() + 4 + valueOf2.length());
            sb.append(C6566gU0.f);
            sb.append(valueOf);
            sb.append(C6566gU0.h);
            sb.append(valueOf2);
            sb.append(C6566gU0.g);
            return sb.toString();
        }

        public c(N n, N n2) {
            super(n, n2);
        }
    }

    public static <N> AbstractC4099Rc0<N> j(DE0<?> de0, N n, N n2) {
        if (de0.f()) {
            return l(n, n2);
        }
        return w(n, n2);
    }

    public static <N> AbstractC4099Rc0<N> k(InterfaceC10802xp1<?, ?> interfaceC10802xp1, N n, N n2) {
        if (interfaceC10802xp1.f()) {
            return l(n, n2);
        }
        return w(n, n2);
    }

    public static <N> AbstractC4099Rc0<N> l(N n, N n2) {
        return new b(n, n2);
    }

    public static <N> AbstractC4099Rc0<N> w(N n, N n2) {
        return new c(n2, n);
    }

    public final N d(N n) {
        if (n.equals(this.X)) {
            return this.Y;
        }
        if (n.equals(this.Y)) {
            return this.X;
        }
        String valueOf = String.valueOf(this);
        String valueOf2 = String.valueOf(n);
        StringBuilder sb = new StringBuilder(valueOf.length() + 36 + valueOf2.length());
        sb.append("EndpointPair ");
        sb.append(valueOf);
        sb.append(" does not contain node ");
        sb.append(valueOf2);
        throw new IllegalArgumentException(sb.toString());
    }

    public abstract boolean e();

    public abstract boolean equals(@MB Object obj);

    @Override // java.lang.Iterable
    /* renamed from: f */
    public final AbstractC6237fB2<N> iterator() {
        return C7052iU0.B(this.X, this.Y);
    }

    public final N h() {
        return this.X;
    }

    public abstract int hashCode();

    public final N i() {
        return this.Y;
    }

    public abstract N p();

    public abstract N r();

    public AbstractC4099Rc0(N n, N n2) {
        this.X = (N) C10664xF1.E(n);
        this.Y = (N) C10664xF1.E(n2);
    }
}
