package o;

import java.io.Serializable;
import java.util.Map;

@InterfaceC10420wF0
@InterfaceC8301na0
/* loaded from: classes3.dex */
public final class MB0 {

    /* loaded from: classes3.dex */
    public static class b<E> implements YA0<Object, E>, Serializable {
        private static final long serialVersionUID = 0;
        @InterfaceC9863ty1
        public final E X;

        public b(@InterfaceC9863ty1 E e) {
            this.X = e;
        }

        @Override // o.YA0
        @InterfaceC9863ty1
        public E apply(@MB Object obj) {
            return this.X;
        }

        @Override // o.YA0
        public boolean equals(@MB Object obj) {
            if (obj instanceof b) {
                return C2593Bt1.a(this.X, ((b) obj).X);
            }
            return false;
        }

        public int hashCode() {
            E e = this.X;
            if (e == null) {
                return 0;
            }
            return e.hashCode();
        }

        public String toString() {
            String valueOf = String.valueOf(this.X);
            StringBuilder sb = new StringBuilder(valueOf.length() + 20);
            sb.append("Functions.constant(");
            sb.append(valueOf);
            sb.append(C9811tl1.d);
            return sb.toString();
        }
    }

    /* loaded from: classes3.dex */
    public static class c<K, V> implements YA0<K, V>, Serializable {
        private static final long serialVersionUID = 0;
        public final Map<K, ? extends V> X;
        @InterfaceC9863ty1
        public final V Y;

        public c(Map<K, ? extends V> map, @InterfaceC9863ty1 V v) {
            this.X = (Map) C10664xF1.E(map);
            this.Y = v;
        }

        @Override // o.YA0
        @InterfaceC9863ty1
        public V apply(@InterfaceC9863ty1 K k) {
            V v = this.X.get(k);
            if (v == null && !this.X.containsKey(k)) {
                return this.Y;
            }
            return (V) C2687Cs1.a(v);
        }

        @Override // o.YA0
        public boolean equals(@MB Object obj) {
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
            StringBuilder sb = new StringBuilder(valueOf.length() + 33 + valueOf2.length());
            sb.append("Functions.forMap(");
            sb.append(valueOf);
            sb.append(", defaultValue=");
            sb.append(valueOf2);
            sb.append(C9811tl1.d);
            return sb.toString();
        }
    }

    /* loaded from: classes3.dex */
    public static class d<A, B, C> implements YA0<A, C>, Serializable {
        private static final long serialVersionUID = 0;
        public final YA0<B, C> X;
        public final YA0<A, ? extends B> Y;

        public d(YA0<B, C> ya0, YA0<A, ? extends B> ya02) {
            this.X = (YA0) C10664xF1.E(ya0);
            this.Y = (YA0) C10664xF1.E(ya02);
        }

        @Override // o.YA0
        @InterfaceC9863ty1
        public C apply(@InterfaceC9863ty1 A a) {
            return this.X.apply(this.Y.apply(a));
        }

        @Override // o.YA0
        public boolean equals(@MB Object obj) {
            if (obj instanceof d) {
                d dVar = (d) obj;
                if (this.Y.equals(dVar.Y) && this.X.equals(dVar.X)) {
                    return true;
                }
            }
            return false;
        }

        public int hashCode() {
            return this.Y.hashCode() ^ this.X.hashCode();
        }

        public String toString() {
            String valueOf = String.valueOf(this.X);
            String valueOf2 = String.valueOf(this.Y);
            StringBuilder sb = new StringBuilder(valueOf.length() + 2 + valueOf2.length());
            sb.append(valueOf);
            sb.append(C9811tl1.c);
            sb.append(valueOf2);
            sb.append(C9811tl1.d);
            return sb.toString();
        }
    }

    /* loaded from: classes3.dex */
    public static class e<K, V> implements YA0<K, V>, Serializable {
        private static final long serialVersionUID = 0;
        public final Map<K, V> X;

        public e(Map<K, V> map) {
            this.X = (Map) C10664xF1.E(map);
        }

        @Override // o.YA0
        @InterfaceC9863ty1
        public V apply(@InterfaceC9863ty1 K k) {
            boolean z;
            V v = this.X.get(k);
            if (v == null && !this.X.containsKey(k)) {
                z = false;
            } else {
                z = true;
            }
            C10664xF1.u(z, "Key '%s' not present in map", k);
            return (V) C2687Cs1.a(v);
        }

        @Override // o.YA0
        public boolean equals(@MB Object obj) {
            if (obj instanceof e) {
                return this.X.equals(((e) obj).X);
            }
            return false;
        }

        public int hashCode() {
            return this.X.hashCode();
        }

        public String toString() {
            String valueOf = String.valueOf(this.X);
            StringBuilder sb = new StringBuilder(valueOf.length() + 18);
            sb.append("Functions.forMap(");
            sb.append(valueOf);
            sb.append(C9811tl1.d);
            return sb.toString();
        }
    }

    /* loaded from: classes3.dex */
    public static class g<T> implements YA0<T, Boolean>, Serializable {
        private static final long serialVersionUID = 0;
        public final IF1<T> X;

        @Override // o.YA0
        /* renamed from: a */
        public Boolean apply(@InterfaceC9863ty1 T t) {
            return Boolean.valueOf(this.X.apply(t));
        }

        @Override // o.YA0
        public boolean equals(@MB Object obj) {
            if (obj instanceof g) {
                return this.X.equals(((g) obj).X);
            }
            return false;
        }

        public int hashCode() {
            return this.X.hashCode();
        }

        public String toString() {
            String valueOf = String.valueOf(this.X);
            StringBuilder sb = new StringBuilder(valueOf.length() + 24);
            sb.append("Functions.forPredicate(");
            sb.append(valueOf);
            sb.append(C9811tl1.d);
            return sb.toString();
        }

        public g(IF1<T> if1) {
            this.X = (IF1) C10664xF1.E(if1);
        }
    }

    /* loaded from: classes3.dex */
    public static class h<F, T> implements YA0<F, T>, Serializable {
        private static final long serialVersionUID = 0;
        public final InterfaceC8331nh2<T> X;

        @Override // o.YA0
        @InterfaceC9863ty1
        public T apply(@InterfaceC9863ty1 F f) {
            return this.X.get();
        }

        @Override // o.YA0
        public boolean equals(@MB Object obj) {
            if (obj instanceof h) {
                return this.X.equals(((h) obj).X);
            }
            return false;
        }

        public int hashCode() {
            return this.X.hashCode();
        }

        public String toString() {
            String valueOf = String.valueOf(this.X);
            StringBuilder sb = new StringBuilder(valueOf.length() + 23);
            sb.append("Functions.forSupplier(");
            sb.append(valueOf);
            sb.append(C9811tl1.d);
            return sb.toString();
        }

        public h(InterfaceC8331nh2<T> interfaceC8331nh2) {
            this.X = (InterfaceC8331nh2) C10664xF1.E(interfaceC8331nh2);
        }
    }

    /* loaded from: classes3.dex */
    public enum i implements YA0<Object, String> {
        INSTANCE;

        @Override // o.YA0
        /* renamed from: g */
        public String apply(Object obj) {
            C10664xF1.E(obj);
            return obj.toString();
        }

        @Override // java.lang.Enum
        public String toString() {
            return "Functions.toStringFunction()";
        }
    }

    public static <A, B, C> YA0<A, C> a(YA0<B, C> ya0, YA0<A, ? extends B> ya02) {
        return new d(ya0, ya02);
    }

    public static <E> YA0<Object, E> b(@InterfaceC9863ty1 E e2) {
        return new b(e2);
    }

    public static <K, V> YA0<K, V> c(Map<K, V> map) {
        return new e(map);
    }

    public static <K, V> YA0<K, V> d(Map<K, ? extends V> map, @InterfaceC9863ty1 V v) {
        return new c(map, v);
    }

    public static <T> YA0<T, Boolean> e(IF1<T> if1) {
        return new g(if1);
    }

    public static <F, T> YA0<F, T> f(InterfaceC8331nh2<T> interfaceC8331nh2) {
        return new h(interfaceC8331nh2);
    }

    public static <E> YA0<E, E> g() {
        return f.INSTANCE;
    }

    public static YA0<Object, String> h() {
        return i.INSTANCE;
    }

    /* loaded from: classes3.dex */
    public enum f implements YA0<Object, Object> {
        INSTANCE;

        @Override // java.lang.Enum
        public String toString() {
            return "Functions.identity()";
        }

        @Override // o.YA0
        @MB
        public Object apply(@MB Object obj) {
            return obj;
        }
    }
}
