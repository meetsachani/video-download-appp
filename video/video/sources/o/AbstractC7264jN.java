package o;

import java.io.Serializable;
import java.util.Iterator;

@InterfaceC10420wF0
@InterfaceC8301na0
/* renamed from: o.jN  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC7264jN<A, B> implements YA0<A, B> {
    public final boolean X;
    @MB
    @SY0
    @InterfaceC7537kU1
    public transient AbstractC7264jN<B, A> Y;

    /* renamed from: o.jN$a */
    /* loaded from: classes3.dex */
    public class a implements Iterable<B> {
        public final /* synthetic */ Iterable X;

        /* renamed from: o.jN$a$a  reason: collision with other inner class name */
        /* loaded from: classes3.dex */
        public class C0293a implements Iterator<B> {
            public final Iterator<? extends A> X;

            public C0293a() {
                this.X = a.this.X.iterator();
            }

            @Override // java.util.Iterator
            public boolean hasNext() {
                return this.X.hasNext();
            }

            @Override // java.util.Iterator
            @MB
            public B next() {
                return (B) AbstractC7264jN.this.b(this.X.next());
            }

            @Override // java.util.Iterator
            public void remove() {
                this.X.remove();
            }
        }

        public a(Iterable iterable) {
            this.X = iterable;
        }

        @Override // java.lang.Iterable
        public Iterator<B> iterator() {
            return new C0293a();
        }
    }

    /* renamed from: o.jN$b */
    /* loaded from: classes3.dex */
    public static final class b<A, B, C> extends AbstractC7264jN<A, C> implements Serializable {
        private static final long serialVersionUID = 0;
        public final AbstractC7264jN<B, C> Y0;
        public final AbstractC7264jN<A, B> Z;

        public b(AbstractC7264jN<A, B> abstractC7264jN, AbstractC7264jN<B, C> abstractC7264jN2) {
            this.Z = abstractC7264jN;
            this.Y0 = abstractC7264jN2;
        }

        @Override // o.AbstractC7264jN
        @MB
        public A d(@MB C c) {
            return this.Z.d(this.Y0.d(c));
        }

        @Override // o.AbstractC7264jN
        @MB
        public C e(@MB A a) {
            return this.Y0.e(this.Z.e(a));
        }

        @Override // o.AbstractC7264jN, o.YA0
        public boolean equals(@MB Object obj) {
            if (obj instanceof b) {
                b bVar = (b) obj;
                if (this.Z.equals(bVar.Z) && this.Y0.equals(bVar.Y0)) {
                    return true;
                }
            }
            return false;
        }

        @Override // o.AbstractC7264jN
        public A g(C c) {
            throw new AssertionError();
        }

        @Override // o.AbstractC7264jN
        public C h(A a) {
            throw new AssertionError();
        }

        public int hashCode() {
            return (this.Z.hashCode() * 31) + this.Y0.hashCode();
        }

        public String toString() {
            String valueOf = String.valueOf(this.Z);
            String valueOf2 = String.valueOf(this.Y0);
            StringBuilder sb = new StringBuilder(valueOf.length() + 10 + valueOf2.length());
            sb.append(valueOf);
            sb.append(".andThen(");
            sb.append(valueOf2);
            sb.append(C9811tl1.d);
            return sb.toString();
        }
    }

    /* renamed from: o.jN$c */
    /* loaded from: classes3.dex */
    public static final class c<A, B> extends AbstractC7264jN<A, B> implements Serializable {
        public final YA0<? super B, ? extends A> Y0;
        public final YA0<? super A, ? extends B> Z;

        public /* synthetic */ c(YA0 ya0, YA0 ya02, a aVar) {
            this(ya0, ya02);
        }

        @Override // o.AbstractC7264jN, o.YA0
        public boolean equals(@MB Object obj) {
            if (obj instanceof c) {
                c cVar = (c) obj;
                if (this.Z.equals(cVar.Z) && this.Y0.equals(cVar.Y0)) {
                    return true;
                }
            }
            return false;
        }

        @Override // o.AbstractC7264jN
        public A g(B b) {
            return this.Y0.apply(b);
        }

        @Override // o.AbstractC7264jN
        public B h(A a) {
            return this.Z.apply(a);
        }

        public int hashCode() {
            return (this.Z.hashCode() * 31) + this.Y0.hashCode();
        }

        public String toString() {
            String valueOf = String.valueOf(this.Z);
            String valueOf2 = String.valueOf(this.Y0);
            StringBuilder sb = new StringBuilder(valueOf.length() + 18 + valueOf2.length());
            sb.append("Converter.from(");
            sb.append(valueOf);
            sb.append(C6566gU0.h);
            sb.append(valueOf2);
            sb.append(C9811tl1.d);
            return sb.toString();
        }

        public c(YA0<? super A, ? extends B> ya0, YA0<? super B, ? extends A> ya02) {
            this.Z = (YA0) C10664xF1.E(ya0);
            this.Y0 = (YA0) C10664xF1.E(ya02);
        }
    }

    /* renamed from: o.jN$e */
    /* loaded from: classes3.dex */
    public static final class e<A, B> extends AbstractC7264jN<B, A> implements Serializable {
        private static final long serialVersionUID = 0;
        public final AbstractC7264jN<A, B> Z;

        public e(AbstractC7264jN<A, B> abstractC7264jN) {
            this.Z = abstractC7264jN;
        }

        @Override // o.AbstractC7264jN
        @MB
        public B d(@MB A a) {
            return this.Z.e(a);
        }

        @Override // o.AbstractC7264jN
        @MB
        public A e(@MB B b) {
            return this.Z.d(b);
        }

        @Override // o.AbstractC7264jN, o.YA0
        public boolean equals(@MB Object obj) {
            if (obj instanceof e) {
                return this.Z.equals(((e) obj).Z);
            }
            return false;
        }

        @Override // o.AbstractC7264jN
        public B g(A a) {
            throw new AssertionError();
        }

        @Override // o.AbstractC7264jN
        public A h(B b) {
            throw new AssertionError();
        }

        public int hashCode() {
            return ~this.Z.hashCode();
        }

        @Override // o.AbstractC7264jN
        public AbstractC7264jN<A, B> k() {
            return this.Z;
        }

        public String toString() {
            String valueOf = String.valueOf(this.Z);
            StringBuilder sb = new StringBuilder(valueOf.length() + 10);
            sb.append(valueOf);
            sb.append(".reverse()");
            return sb.toString();
        }
    }

    public AbstractC7264jN() {
        this(true);
    }

    public static <A, B> AbstractC7264jN<A, B> i(YA0<? super A, ? extends B> ya0, YA0<? super B, ? extends A> ya02) {
        return new c(ya0, ya02, null);
    }

    public static <T> AbstractC7264jN<T, T> j() {
        return d.Z;
    }

    public final <C> AbstractC7264jN<A, C> a(AbstractC7264jN<B, C> abstractC7264jN) {
        return f(abstractC7264jN);
    }

    @Override // o.YA0
    @InterfaceC6181ey
    @MB
    @Deprecated
    @VP0(replacement = "this.convert(a)")
    public final B apply(@MB A a2) {
        return b(a2);
    }

    @InterfaceC6181ey
    @MB
    public final B b(@MB A a2) {
        return e(a2);
    }

    @InterfaceC6181ey
    public Iterable<B> c(Iterable<? extends A> iterable) {
        C10664xF1.F(iterable, "fromIterable");
        return new a(iterable);
    }

    @MB
    public A d(@MB B b2) {
        if (this.X) {
            if (b2 == null) {
                return null;
            }
            return (A) C10664xF1.E(g(b2));
        }
        return m(b2);
    }

    @MB
    public B e(@MB A a2) {
        if (this.X) {
            if (a2 == null) {
                return null;
            }
            return (B) C10664xF1.E(h(a2));
        }
        return n(a2);
    }

    @Override // o.YA0
    public boolean equals(@MB Object obj) {
        return super.equals(obj);
    }

    public <C> AbstractC7264jN<A, C> f(AbstractC7264jN<B, C> abstractC7264jN) {
        return new b(this, (AbstractC7264jN) C10664xF1.E(abstractC7264jN));
    }

    @InterfaceC6919hx0
    public abstract A g(B b2);

    @InterfaceC6919hx0
    public abstract B h(A a2);

    @QB
    public AbstractC7264jN<B, A> k() {
        AbstractC7264jN<B, A> abstractC7264jN = this.Y;
        if (abstractC7264jN == null) {
            e eVar = new e(this);
            this.Y = eVar;
            return eVar;
        }
        return abstractC7264jN;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @MB
    public final A m(@MB B b2) {
        return (A) g(C2687Cs1.a(b2));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @MB
    public final B n(@MB A a2) {
        return (B) h(C2687Cs1.a(a2));
    }

    public AbstractC7264jN(boolean z) {
        this.X = z;
    }

    /* renamed from: o.jN$d */
    /* loaded from: classes3.dex */
    public static final class d<T> extends AbstractC7264jN<T, T> implements Serializable {
        public static final d<?> Z = new d<>();
        private static final long serialVersionUID = 0;

        private Object readResolve() {
            return Z;
        }

        @Override // o.AbstractC7264jN
        public <S> AbstractC7264jN<T, S> f(AbstractC7264jN<T, S> abstractC7264jN) {
            return (AbstractC7264jN) C10664xF1.F(abstractC7264jN, "otherConverter");
        }

        public String toString() {
            return "Converter.identity()";
        }

        @Override // o.AbstractC7264jN
        /* renamed from: o */
        public d<T> k() {
            return this;
        }

        @Override // o.AbstractC7264jN
        public T g(T t) {
            return t;
        }

        @Override // o.AbstractC7264jN
        public T h(T t) {
            return t;
        }
    }
}
