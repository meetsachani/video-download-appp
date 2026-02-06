package o;

import com.google.firebase.sessions.settings.RemoteSettings;
import java.io.Serializable;
import java.lang.Comparable;
import java.util.NoSuchElementException;

@InterfaceC10420wF0
@InterfaceC6329fa0
/* loaded from: classes3.dex */
public abstract class PT<C extends Comparable> implements Comparable<PT<C>>, Serializable {
    private static final long serialVersionUID = 0;
    public final C X;

    /* loaded from: classes3.dex */
    public static /* synthetic */ class a {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[EnumC6886hp.values().length];
            a = iArr;
            try {
                iArr[EnumC6886hp.CLOSED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                a[EnumC6886hp.OPEN.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    /* loaded from: classes3.dex */
    public static final class b extends PT<Comparable<?>> {
        public static final b Y = new b();
        private static final long serialVersionUID = 0;

        public b() {
            super("");
        }

        private Object readResolve() {
            return Y;
        }

        @Override // o.PT
        public int hashCode() {
            return System.identityHashCode(this);
        }

        @Override // o.PT, java.lang.Comparable
        /* renamed from: l */
        public int compareTo(PT<Comparable<?>> pt) {
            if (pt == this) {
                return 0;
            }
            return 1;
        }

        @Override // o.PT
        public void m(StringBuilder sb) {
            throw new AssertionError();
        }

        @Override // o.PT
        public void n(StringBuilder sb) {
            sb.append("+∞)");
        }

        @Override // o.PT
        public Comparable<?> o() {
            throw new IllegalStateException("range unbounded on this side");
        }

        @Override // o.PT
        public Comparable<?> p(W30<Comparable<?>> w30) {
            return w30.e();
        }

        @Override // o.PT
        public boolean q(Comparable<?> comparable) {
            return false;
        }

        @Override // o.PT
        public Comparable<?> r(W30<Comparable<?>> w30) {
            throw new AssertionError();
        }

        @Override // o.PT
        public EnumC6886hp s() {
            throw new AssertionError("this statement should be unreachable");
        }

        @Override // o.PT
        public EnumC6886hp t() {
            throw new IllegalStateException();
        }

        public String toString() {
            return "+∞";
        }

        @Override // o.PT
        public PT<Comparable<?>> u(EnumC6886hp enumC6886hp, W30<Comparable<?>> w30) {
            throw new AssertionError("this statement should be unreachable");
        }

        @Override // o.PT
        public PT<Comparable<?>> v(EnumC6886hp enumC6886hp, W30<Comparable<?>> w30) {
            throw new IllegalStateException();
        }
    }

    /* loaded from: classes3.dex */
    public static final class c<C extends Comparable> extends PT<C> {
        private static final long serialVersionUID = 0;

        public c(C c) {
            super((Comparable) C10664xF1.E(c));
        }

        @Override // o.PT, java.lang.Comparable
        public /* bridge */ /* synthetic */ int compareTo(Object obj) {
            return super.compareTo((PT) obj);
        }

        @Override // o.PT
        public int hashCode() {
            return ~this.X.hashCode();
        }

        @Override // o.PT
        public PT<C> j(W30<C> w30) {
            C r = r(w30);
            if (r != null) {
                return PT.i(r);
            }
            return PT.e();
        }

        @Override // o.PT
        public void m(StringBuilder sb) {
            sb.append('(');
            sb.append(this.X);
        }

        @Override // o.PT
        public void n(StringBuilder sb) {
            sb.append(this.X);
            sb.append(']');
        }

        @Override // o.PT
        public C p(W30<C> w30) {
            return this.X;
        }

        @Override // o.PT
        public boolean q(C c) {
            if (PN1.h(this.X, c) < 0) {
                return true;
            }
            return false;
        }

        @Override // o.PT
        @MB
        public C r(W30<C> w30) {
            return w30.g(this.X);
        }

        @Override // o.PT
        public EnumC6886hp s() {
            return EnumC6886hp.OPEN;
        }

        @Override // o.PT
        public EnumC6886hp t() {
            return EnumC6886hp.CLOSED;
        }

        public String toString() {
            String valueOf = String.valueOf(this.X);
            StringBuilder sb = new StringBuilder(valueOf.length() + 2);
            sb.append(RemoteSettings.i);
            sb.append(valueOf);
            sb.append(C11298zs.h);
            return sb.toString();
        }

        @Override // o.PT
        public PT<C> u(EnumC6886hp enumC6886hp, W30<C> w30) {
            int i = a.a[enumC6886hp.ordinal()];
            if (i != 1) {
                if (i == 2) {
                    return this;
                }
                throw new AssertionError();
            }
            C g = w30.g(this.X);
            if (g == null) {
                return PT.h();
            }
            return PT.i(g);
        }

        @Override // o.PT
        public PT<C> v(EnumC6886hp enumC6886hp, W30<C> w30) {
            int i = a.a[enumC6886hp.ordinal()];
            if (i != 1) {
                if (i == 2) {
                    C g = w30.g(this.X);
                    if (g == null) {
                        return PT.e();
                    }
                    return PT.i(g);
                }
                throw new AssertionError();
            }
            return this;
        }
    }

    /* loaded from: classes3.dex */
    public static final class d extends PT<Comparable<?>> {
        public static final d Y = new d();
        private static final long serialVersionUID = 0;

        public d() {
            super("");
        }

        private Object readResolve() {
            return Y;
        }

        @Override // o.PT
        public int hashCode() {
            return System.identityHashCode(this);
        }

        @Override // o.PT
        public PT<Comparable<?>> j(W30<Comparable<?>> w30) {
            try {
                return PT.i(w30.f());
            } catch (NoSuchElementException unused) {
                return this;
            }
        }

        @Override // o.PT, java.lang.Comparable
        /* renamed from: l */
        public int compareTo(PT<Comparable<?>> pt) {
            if (pt == this) {
                return 0;
            }
            return -1;
        }

        @Override // o.PT
        public void m(StringBuilder sb) {
            sb.append("(-∞");
        }

        @Override // o.PT
        public void n(StringBuilder sb) {
            throw new AssertionError();
        }

        @Override // o.PT
        public Comparable<?> o() {
            throw new IllegalStateException("range unbounded on this side");
        }

        @Override // o.PT
        public Comparable<?> p(W30<Comparable<?>> w30) {
            throw new AssertionError();
        }

        @Override // o.PT
        public boolean q(Comparable<?> comparable) {
            return true;
        }

        @Override // o.PT
        public Comparable<?> r(W30<Comparable<?>> w30) {
            return w30.f();
        }

        @Override // o.PT
        public EnumC6886hp s() {
            throw new IllegalStateException();
        }

        @Override // o.PT
        public EnumC6886hp t() {
            throw new AssertionError("this statement should be unreachable");
        }

        public String toString() {
            return "-∞";
        }

        @Override // o.PT
        public PT<Comparable<?>> u(EnumC6886hp enumC6886hp, W30<Comparable<?>> w30) {
            throw new IllegalStateException();
        }

        @Override // o.PT
        public PT<Comparable<?>> v(EnumC6886hp enumC6886hp, W30<Comparable<?>> w30) {
            throw new AssertionError("this statement should be unreachable");
        }
    }

    /* loaded from: classes3.dex */
    public static final class e<C extends Comparable> extends PT<C> {
        private static final long serialVersionUID = 0;

        public e(C c) {
            super((Comparable) C10664xF1.E(c));
        }

        @Override // o.PT, java.lang.Comparable
        public /* bridge */ /* synthetic */ int compareTo(Object obj) {
            return super.compareTo((PT) obj);
        }

        @Override // o.PT
        public int hashCode() {
            return this.X.hashCode();
        }

        @Override // o.PT
        public void m(StringBuilder sb) {
            sb.append('[');
            sb.append(this.X);
        }

        @Override // o.PT
        public void n(StringBuilder sb) {
            sb.append(this.X);
            sb.append(')');
        }

        @Override // o.PT
        @MB
        public C p(W30<C> w30) {
            return w30.i(this.X);
        }

        @Override // o.PT
        public boolean q(C c) {
            if (PN1.h(this.X, c) <= 0) {
                return true;
            }
            return false;
        }

        @Override // o.PT
        public C r(W30<C> w30) {
            return this.X;
        }

        @Override // o.PT
        public EnumC6886hp s() {
            return EnumC6886hp.CLOSED;
        }

        @Override // o.PT
        public EnumC6886hp t() {
            return EnumC6886hp.OPEN;
        }

        public String toString() {
            String valueOf = String.valueOf(this.X);
            StringBuilder sb = new StringBuilder(valueOf.length() + 2);
            sb.append(C11298zs.h);
            sb.append(valueOf);
            sb.append(RemoteSettings.i);
            return sb.toString();
        }

        @Override // o.PT
        public PT<C> u(EnumC6886hp enumC6886hp, W30<C> w30) {
            int i = a.a[enumC6886hp.ordinal()];
            if (i != 1) {
                if (i == 2) {
                    C i2 = w30.i(this.X);
                    if (i2 == null) {
                        return PT.h();
                    }
                    return new c(i2);
                }
                throw new AssertionError();
            }
            return this;
        }

        @Override // o.PT
        public PT<C> v(EnumC6886hp enumC6886hp, W30<C> w30) {
            int i = a.a[enumC6886hp.ordinal()];
            if (i != 1) {
                if (i == 2) {
                    return this;
                }
                throw new AssertionError();
            }
            C i2 = w30.i(this.X);
            if (i2 == null) {
                return PT.e();
            }
            return new c(i2);
        }
    }

    public PT(C c2) {
        this.X = c2;
    }

    public static <C extends Comparable> PT<C> e() {
        return b.Y;
    }

    public static <C extends Comparable> PT<C> g(C c2) {
        return new c(c2);
    }

    public static <C extends Comparable> PT<C> h() {
        return d.Y;
    }

    public static <C extends Comparable> PT<C> i(C c2) {
        return new e(c2);
    }

    public boolean equals(@MB Object obj) {
        if (obj instanceof PT) {
            try {
                if (compareTo((PT) obj) == 0) {
                    return true;
                }
            } catch (ClassCastException unused) {
            }
        }
        return false;
    }

    public abstract int hashCode();

    @Override // java.lang.Comparable
    /* renamed from: l */
    public int compareTo(PT<C> pt) {
        if (pt == h()) {
            return 1;
        }
        if (pt == e()) {
            return -1;
        }
        int h = PN1.h(this.X, pt.X);
        if (h != 0) {
            return h;
        }
        return C4049Qo.d(this instanceof c, pt instanceof c);
    }

    public abstract void m(StringBuilder sb);

    public abstract void n(StringBuilder sb);

    public C o() {
        return this.X;
    }

    @MB
    public abstract C p(W30<C> w30);

    public abstract boolean q(C c2);

    @MB
    public abstract C r(W30<C> w30);

    public abstract EnumC6886hp s();

    public abstract EnumC6886hp t();

    public abstract PT<C> u(EnumC6886hp enumC6886hp, W30<C> w30);

    public abstract PT<C> v(EnumC6886hp enumC6886hp, W30<C> w30);

    public PT<C> j(W30<C> w30) {
        return this;
    }
}
