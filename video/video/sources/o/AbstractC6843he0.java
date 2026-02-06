package o;

import java.io.Serializable;

@InterfaceC10420wF0
@InterfaceC8301na0
/* renamed from: o.he0  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC6843he0<T> {

    /* renamed from: o.he0$b */
    /* loaded from: classes3.dex */
    public static final class b extends AbstractC6843he0<Object> implements Serializable {
        public static final b X = new b();
        private static final long serialVersionUID = 1;

        private Object readResolve() {
            return X;
        }

        @Override // o.AbstractC6843he0
        public boolean a(Object obj, Object obj2) {
            return obj.equals(obj2);
        }

        @Override // o.AbstractC6843he0
        public int b(Object obj) {
            return obj.hashCode();
        }
    }

    /* renamed from: o.he0$c */
    /* loaded from: classes3.dex */
    public static final class c<T> implements IF1<T>, Serializable {
        private static final long serialVersionUID = 0;
        public final AbstractC6843he0<T> X;
        @MB
        public final T Y;

        public c(AbstractC6843he0<T> abstractC6843he0, @MB T t) {
            this.X = (AbstractC6843he0) C10664xF1.E(abstractC6843he0);
            this.Y = t;
        }

        @Override // o.IF1
        public boolean apply(@MB T t) {
            return this.X.d(t, this.Y);
        }

        @Override // o.IF1
        public boolean equals(@MB Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof c) {
                c cVar = (c) obj;
                if (this.X.equals(cVar.X) && C2593Bt1.a(this.Y, cVar.Y)) {
                    return true;
                }
            }
            return false;
        }

        public int hashCode() {
            return C2593Bt1.b(this.X, this.Y);
        }

        public String toString() {
            String valueOf = String.valueOf(this.X);
            String valueOf2 = String.valueOf(this.Y);
            StringBuilder sb = new StringBuilder(valueOf.length() + 15 + valueOf2.length());
            sb.append(valueOf);
            sb.append(".equivalentTo(");
            sb.append(valueOf2);
            sb.append(C9811tl1.d);
            return sb.toString();
        }
    }

    /* renamed from: o.he0$d */
    /* loaded from: classes3.dex */
    public static final class d extends AbstractC6843he0<Object> implements Serializable {
        public static final d X = new d();
        private static final long serialVersionUID = 1;

        private Object readResolve() {
            return X;
        }

        @Override // o.AbstractC6843he0
        public boolean a(Object obj, Object obj2) {
            return false;
        }

        @Override // o.AbstractC6843he0
        public int b(Object obj) {
            return System.identityHashCode(obj);
        }
    }

    /* renamed from: o.he0$e */
    /* loaded from: classes3.dex */
    public static final class e<T> implements Serializable {
        private static final long serialVersionUID = 0;
        public final AbstractC6843he0<? super T> X;
        @InterfaceC9863ty1
        public final T Y;

        @InterfaceC9863ty1
        public T a() {
            return this.Y;
        }

        public boolean equals(@MB Object obj) {
            if (obj == this) {
                return true;
            }
            if (obj instanceof e) {
                e eVar = (e) obj;
                if (this.X.equals(eVar.X)) {
                    return this.X.d((T) this.Y, (T) eVar.Y);
                }
                return false;
            }
            return false;
        }

        public int hashCode() {
            return this.X.f((T) this.Y);
        }

        public String toString() {
            String valueOf = String.valueOf(this.X);
            String valueOf2 = String.valueOf(this.Y);
            StringBuilder sb = new StringBuilder(valueOf.length() + 7 + valueOf2.length());
            sb.append(valueOf);
            sb.append(".wrap(");
            sb.append(valueOf2);
            sb.append(C9811tl1.d);
            return sb.toString();
        }

        public e(AbstractC6843he0<? super T> abstractC6843he0, @InterfaceC9863ty1 T t) {
            this.X = (AbstractC6843he0) C10664xF1.E(abstractC6843he0);
            this.Y = t;
        }
    }

    public static AbstractC6843he0<Object> c() {
        return b.X;
    }

    public static AbstractC6843he0<Object> g() {
        return d.X;
    }

    @InterfaceC6919hx0
    public abstract boolean a(T t, T t2);

    @InterfaceC6919hx0
    public abstract int b(T t);

    public final boolean d(@MB T t, @MB T t2) {
        if (t == t2) {
            return true;
        }
        if (t != null && t2 != null) {
            return a(t, t2);
        }
        return false;
    }

    public final IF1<T> e(@MB T t) {
        return new c(this, t);
    }

    public final int f(@MB T t) {
        if (t == null) {
            return 0;
        }
        return b(t);
    }

    public final <F> AbstractC6843he0<F> h(YA0<? super F, ? extends T> ya0) {
        return new C8937qB0(ya0, this);
    }

    @InterfaceC10420wF0(serializable = true)
    public final <S extends T> AbstractC6843he0<Iterable<S>> i() {
        return new C4765Xx1(this);
    }

    public final <S extends T> e<S> j(@InterfaceC9863ty1 S s) {
        return new e<>(s);
    }
}
