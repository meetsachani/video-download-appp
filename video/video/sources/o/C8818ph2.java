package o;

import java.io.Serializable;
import java.util.Objects;
import java.util.concurrent.TimeUnit;

@InterfaceC10420wF0
@InterfaceC8301na0
/* renamed from: o.ph2 */
/* loaded from: classes3.dex */
public final class C8818ph2 {

    @InterfaceC5299bJ2
    /* renamed from: o.ph2$a */
    /* loaded from: classes3.dex */
    public static class a<T> implements InterfaceC8331nh2<T>, Serializable {
        private static final long serialVersionUID = 0;
        public final InterfaceC8331nh2<T> X;
        public final long Y;
        public volatile transient long Y0;
        @MB
        public volatile transient T Z;

        public a(InterfaceC8331nh2<T> interfaceC8331nh2, long j, TimeUnit timeUnit) {
            boolean z;
            this.X = (InterfaceC8331nh2) C10664xF1.E(interfaceC8331nh2);
            this.Y = timeUnit.toNanos(j);
            if (j > 0) {
                z = true;
            } else {
                z = false;
            }
            C10664xF1.t(z, "duration (%s %s) must be > 0", j, timeUnit);
        }

        @Override // o.InterfaceC8331nh2
        @InterfaceC9863ty1
        public T get() {
            long j = this.Y0;
            long l = C7226jD1.l();
            if (j == 0 || l - j >= 0) {
                synchronized (this) {
                    try {
                        if (j == this.Y0) {
                            T t = this.X.get();
                            this.Z = t;
                            long j2 = l + this.Y;
                            if (j2 == 0) {
                                j2 = 1;
                            }
                            this.Y0 = j2;
                            return t;
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }
            return (T) C2687Cs1.a(this.Z);
        }

        public String toString() {
            String valueOf = String.valueOf(this.X);
            long j = this.Y;
            StringBuilder sb = new StringBuilder(valueOf.length() + 62);
            sb.append("Suppliers.memoizeWithExpiration(");
            sb.append(valueOf);
            sb.append(C6566gU0.h);
            sb.append(j);
            sb.append(", NANOS)");
            return sb.toString();
        }
    }

    @InterfaceC5299bJ2
    /* renamed from: o.ph2$b */
    /* loaded from: classes3.dex */
    public static class b<T> implements InterfaceC8331nh2<T>, Serializable {
        private static final long serialVersionUID = 0;
        public final InterfaceC8331nh2<T> X;
        public volatile transient boolean Y;
        @MB
        public transient T Z;

        public b(InterfaceC8331nh2<T> interfaceC8331nh2) {
            this.X = (InterfaceC8331nh2) C10664xF1.E(interfaceC8331nh2);
        }

        @Override // o.InterfaceC8331nh2
        @InterfaceC9863ty1
        public T get() {
            if (!this.Y) {
                synchronized (this) {
                    try {
                        if (!this.Y) {
                            T t = this.X.get();
                            this.Z = t;
                            this.Y = true;
                            return t;
                        }
                    } finally {
                    }
                }
            }
            return (T) C2687Cs1.a(this.Z);
        }

        public String toString() {
            Object obj;
            if (this.Y) {
                String valueOf = String.valueOf(this.Z);
                StringBuilder sb = new StringBuilder(valueOf.length() + 25);
                sb.append("<supplier that returned ");
                sb.append(valueOf);
                sb.append(">");
                obj = sb.toString();
            } else {
                obj = this.X;
            }
            String valueOf2 = String.valueOf(obj);
            StringBuilder sb2 = new StringBuilder(valueOf2.length() + 19);
            sb2.append("Suppliers.memoize(");
            sb2.append(valueOf2);
            sb2.append(C9811tl1.d);
            return sb2.toString();
        }
    }

    @InterfaceC5299bJ2
    /* renamed from: o.ph2$c */
    /* loaded from: classes3.dex */
    public static class c<T> implements InterfaceC8331nh2<T> {
        @MB
        public volatile InterfaceC8331nh2<T> X;
        public volatile boolean Y;
        @MB
        public T Z;

        public c(InterfaceC8331nh2<T> interfaceC8331nh2) {
            this.X = (InterfaceC8331nh2) C10664xF1.E(interfaceC8331nh2);
        }

        @Override // o.InterfaceC8331nh2
        @InterfaceC9863ty1
        public T get() {
            if (!this.Y) {
                synchronized (this) {
                    try {
                        if (!this.Y) {
                            InterfaceC8331nh2<T> interfaceC8331nh2 = this.X;
                            Objects.requireNonNull(interfaceC8331nh2);
                            T t = interfaceC8331nh2.get();
                            this.Z = t;
                            this.Y = true;
                            this.X = null;
                            return t;
                        }
                    } finally {
                    }
                }
            }
            return (T) C2687Cs1.a(this.Z);
        }

        public String toString() {
            Object obj = this.X;
            if (obj == null) {
                String valueOf = String.valueOf(this.Z);
                StringBuilder sb = new StringBuilder(valueOf.length() + 25);
                sb.append("<supplier that returned ");
                sb.append(valueOf);
                sb.append(">");
                obj = sb.toString();
            }
            String valueOf2 = String.valueOf(obj);
            StringBuilder sb2 = new StringBuilder(valueOf2.length() + 19);
            sb2.append("Suppliers.memoize(");
            sb2.append(valueOf2);
            sb2.append(C9811tl1.d);
            return sb2.toString();
        }
    }

    /* renamed from: o.ph2$d */
    /* loaded from: classes3.dex */
    public static class d<F, T> implements InterfaceC8331nh2<T>, Serializable {
        private static final long serialVersionUID = 0;
        public final YA0<? super F, T> X;
        public final InterfaceC8331nh2<F> Y;

        public d(YA0<? super F, T> ya0, InterfaceC8331nh2<F> interfaceC8331nh2) {
            this.X = (YA0) C10664xF1.E(ya0);
            this.Y = (InterfaceC8331nh2) C10664xF1.E(interfaceC8331nh2);
        }

        public boolean equals(@MB Object obj) {
            if (obj instanceof d) {
                d dVar = (d) obj;
                if (this.X.equals(dVar.X) && this.Y.equals(dVar.Y)) {
                    return true;
                }
            }
            return false;
        }

        @Override // o.InterfaceC8331nh2
        @InterfaceC9863ty1
        public T get() {
            return this.X.apply((F) this.Y.get());
        }

        public int hashCode() {
            return C2593Bt1.b(this.X, this.Y);
        }

        public String toString() {
            String valueOf = String.valueOf(this.X);
            String valueOf2 = String.valueOf(this.Y);
            StringBuilder sb = new StringBuilder(valueOf.length() + 21 + valueOf2.length());
            sb.append("Suppliers.compose(");
            sb.append(valueOf);
            sb.append(C6566gU0.h);
            sb.append(valueOf2);
            sb.append(C9811tl1.d);
            return sb.toString();
        }
    }

    /* renamed from: o.ph2$e */
    /* loaded from: classes3.dex */
    public interface e<T> extends YA0<InterfaceC8331nh2<T>, T> {
    }

    /* renamed from: o.ph2$f */
    /* loaded from: classes3.dex */
    public enum f implements e<Object> {
        INSTANCE;

        @Override // o.YA0
        @MB
        /* renamed from: g */
        public Object apply(InterfaceC8331nh2<Object> interfaceC8331nh2) {
            return interfaceC8331nh2.get();
        }

        @Override // java.lang.Enum
        public String toString() {
            return "Suppliers.supplierFunction()";
        }
    }

    /* renamed from: o.ph2$g */
    /* loaded from: classes3.dex */
    public static class g<T> implements InterfaceC8331nh2<T>, Serializable {
        private static final long serialVersionUID = 0;
        @InterfaceC9863ty1
        public final T X;

        public g(@InterfaceC9863ty1 T t) {
            this.X = t;
        }

        public boolean equals(@MB Object obj) {
            if (obj instanceof g) {
                return C2593Bt1.a(this.X, ((g) obj).X);
            }
            return false;
        }

        @Override // o.InterfaceC8331nh2
        @InterfaceC9863ty1
        public T get() {
            return this.X;
        }

        public int hashCode() {
            return C2593Bt1.b(this.X);
        }

        public String toString() {
            String valueOf = String.valueOf(this.X);
            StringBuilder sb = new StringBuilder(valueOf.length() + 22);
            sb.append("Suppliers.ofInstance(");
            sb.append(valueOf);
            sb.append(C9811tl1.d);
            return sb.toString();
        }
    }

    /* renamed from: o.ph2$h */
    /* loaded from: classes3.dex */
    public static class h<T> implements InterfaceC8331nh2<T>, Serializable {
        private static final long serialVersionUID = 0;
        public final InterfaceC8331nh2<T> X;

        public h(InterfaceC8331nh2<T> interfaceC8331nh2) {
            this.X = (InterfaceC8331nh2) C10664xF1.E(interfaceC8331nh2);
        }

        @Override // o.InterfaceC8331nh2
        @InterfaceC9863ty1
        public T get() {
            T t;
            synchronized (this.X) {
                t = this.X.get();
            }
            return t;
        }

        public String toString() {
            String valueOf = String.valueOf(this.X);
            StringBuilder sb = new StringBuilder(valueOf.length() + 32);
            sb.append("Suppliers.synchronizedSupplier(");
            sb.append(valueOf);
            sb.append(C9811tl1.d);
            return sb.toString();
        }
    }

    public static <F, T> InterfaceC8331nh2<T> a(YA0<? super F, T> ya0, InterfaceC8331nh2<F> interfaceC8331nh2) {
        return new d(ya0, interfaceC8331nh2);
    }

    public static <T> InterfaceC8331nh2<T> b(InterfaceC8331nh2<T> interfaceC8331nh2) {
        if (!(interfaceC8331nh2 instanceof c)) {
            if (interfaceC8331nh2 instanceof b) {
                return interfaceC8331nh2;
            }
            if (interfaceC8331nh2 instanceof Serializable) {
                return new b(interfaceC8331nh2);
            }
            return new c(interfaceC8331nh2);
        }
        return interfaceC8331nh2;
    }

    public static <T> InterfaceC8331nh2<T> c(InterfaceC8331nh2<T> interfaceC8331nh2, long j, TimeUnit timeUnit) {
        return new a(interfaceC8331nh2, j, timeUnit);
    }

    public static <T> InterfaceC8331nh2<T> d(@InterfaceC9863ty1 T t) {
        return new g(t);
    }

    public static <T> YA0<InterfaceC8331nh2<T>, T> e() {
        return f.INSTANCE;
    }

    public static <T> InterfaceC8331nh2<T> f(InterfaceC8331nh2<T> interfaceC8331nh2) {
        return new h(interfaceC8331nh2);
    }
}
