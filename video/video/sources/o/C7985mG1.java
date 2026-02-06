package o;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.regex.Pattern;

@InterfaceC10420wF0(emulated = true)
@InterfaceC8301na0
/* renamed from: o.mG1  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C7985mG1 {

    /* renamed from: o.mG1$b */
    /* loaded from: classes3.dex */
    public static class b<T> implements IF1<T>, Serializable {
        private static final long serialVersionUID = 0;
        public final List<? extends IF1<? super T>> X;

        @Override // o.IF1
        public boolean apply(@InterfaceC9863ty1 T t) {
            for (int i = 0; i < this.X.size(); i++) {
                if (!this.X.get(i).apply(t)) {
                    return false;
                }
            }
            return true;
        }

        @Override // o.IF1
        public boolean equals(@MB Object obj) {
            if (obj instanceof b) {
                return this.X.equals(((b) obj).X);
            }
            return false;
        }

        public int hashCode() {
            return this.X.hashCode() + 306654252;
        }

        public String toString() {
            return C7985mG1.w("and", this.X);
        }

        public b(List<? extends IF1<? super T>> list) {
            this.X = list;
        }
    }

    /* renamed from: o.mG1$c */
    /* loaded from: classes3.dex */
    public static class c<A, B> implements IF1<A>, Serializable {
        private static final long serialVersionUID = 0;
        public final IF1<B> X;
        public final YA0<A, ? extends B> Y;

        @Override // o.IF1
        public boolean apply(@InterfaceC9863ty1 A a) {
            return this.X.apply(this.Y.apply(a));
        }

        @Override // o.IF1
        public boolean equals(@MB Object obj) {
            if (obj instanceof c) {
                c cVar = (c) obj;
                if (this.Y.equals(cVar.Y) && this.X.equals(cVar.X)) {
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

        public c(IF1<B> if1, YA0<A, ? extends B> ya0) {
            this.X = (IF1) C10664xF1.E(if1);
            this.Y = (YA0) C10664xF1.E(ya0);
        }
    }

    @InterfaceC11149zF0
    /* renamed from: o.mG1$d */
    /* loaded from: classes3.dex */
    public static class d extends e {
        private static final long serialVersionUID = 0;

        public d(String str) {
            super(C7226jD1.b(str));
        }

        @Override // o.C7985mG1.e
        public String toString() {
            String e = this.X.e();
            StringBuilder sb = new StringBuilder(String.valueOf(e).length() + 28);
            sb.append("Predicates.containsPattern(");
            sb.append(e);
            sb.append(C9811tl1.d);
            return sb.toString();
        }
    }

    @InterfaceC11149zF0
    /* renamed from: o.mG1$e */
    /* loaded from: classes3.dex */
    public static class e implements IF1<CharSequence>, Serializable {
        private static final long serialVersionUID = 0;
        public final OG X;

        public e(OG og) {
            this.X = (OG) C10664xF1.E(og);
        }

        @Override // o.IF1
        /* renamed from: a */
        public boolean apply(CharSequence charSequence) {
            return this.X.d(charSequence).b();
        }

        @Override // o.IF1
        public boolean equals(@MB Object obj) {
            if (obj instanceof e) {
                e eVar = (e) obj;
                if (C2593Bt1.a(this.X.e(), eVar.X.e()) && this.X.b() == eVar.X.b()) {
                    return true;
                }
            }
            return false;
        }

        public int hashCode() {
            return C2593Bt1.b(this.X.e(), Integer.valueOf(this.X.b()));
        }

        public String toString() {
            String bVar = C3743Nk1.c(this.X).f("pattern", this.X.e()).d("pattern.flags", this.X.b()).toString();
            StringBuilder sb = new StringBuilder(String.valueOf(bVar).length() + 21);
            sb.append("Predicates.contains(");
            sb.append(bVar);
            sb.append(C9811tl1.d);
            return sb.toString();
        }
    }

    /* renamed from: o.mG1$f */
    /* loaded from: classes3.dex */
    public static class f<T> implements IF1<T>, Serializable {
        private static final long serialVersionUID = 0;
        public final Collection<?> X;

        @Override // o.IF1
        public boolean apply(@InterfaceC9863ty1 T t) {
            try {
                return this.X.contains(t);
            } catch (ClassCastException | NullPointerException unused) {
                return false;
            }
        }

        @Override // o.IF1
        public boolean equals(@MB Object obj) {
            if (obj instanceof f) {
                return this.X.equals(((f) obj).X);
            }
            return false;
        }

        public int hashCode() {
            return this.X.hashCode();
        }

        public String toString() {
            String valueOf = String.valueOf(this.X);
            StringBuilder sb = new StringBuilder(valueOf.length() + 15);
            sb.append("Predicates.in(");
            sb.append(valueOf);
            sb.append(C9811tl1.d);
            return sb.toString();
        }

        public f(Collection<?> collection) {
            this.X = (Collection) C10664xF1.E(collection);
        }
    }

    @InterfaceC11149zF0
    /* renamed from: o.mG1$g */
    /* loaded from: classes3.dex */
    public static class g<T> implements IF1<T>, Serializable {
        private static final long serialVersionUID = 0;
        public final Class<?> X;

        @Override // o.IF1
        public boolean apply(@InterfaceC9863ty1 T t) {
            return this.X.isInstance(t);
        }

        @Override // o.IF1
        public boolean equals(@MB Object obj) {
            if (!(obj instanceof g) || this.X != ((g) obj).X) {
                return false;
            }
            return true;
        }

        public int hashCode() {
            return this.X.hashCode();
        }

        public String toString() {
            String name = this.X.getName();
            StringBuilder sb = new StringBuilder(name.length() + 23);
            sb.append("Predicates.instanceOf(");
            sb.append(name);
            sb.append(C9811tl1.d);
            return sb.toString();
        }

        public g(Class<?> cls) {
            this.X = (Class) C10664xF1.E(cls);
        }
    }

    /* renamed from: o.mG1$h */
    /* loaded from: classes3.dex */
    public static class h implements IF1<Object>, Serializable {
        private static final long serialVersionUID = 0;
        public final Object X;

        @Override // o.IF1
        public boolean apply(@MB Object obj) {
            return this.X.equals(obj);
        }

        @Override // o.IF1
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
            StringBuilder sb = new StringBuilder(valueOf.length() + 20);
            sb.append("Predicates.equalTo(");
            sb.append(valueOf);
            sb.append(C9811tl1.d);
            return sb.toString();
        }

        public h(Object obj) {
            this.X = obj;
        }

        public <T> IF1<T> a() {
            return this;
        }
    }

    /* renamed from: o.mG1$i */
    /* loaded from: classes3.dex */
    public static class i<T> implements IF1<T>, Serializable {
        private static final long serialVersionUID = 0;
        public final IF1<T> X;

        public i(IF1<T> if1) {
            this.X = (IF1) C10664xF1.E(if1);
        }

        @Override // o.IF1
        public boolean apply(@InterfaceC9863ty1 T t) {
            return !this.X.apply(t);
        }

        @Override // o.IF1
        public boolean equals(@MB Object obj) {
            if (obj instanceof i) {
                return this.X.equals(((i) obj).X);
            }
            return false;
        }

        public int hashCode() {
            return ~this.X.hashCode();
        }

        public String toString() {
            String valueOf = String.valueOf(this.X);
            StringBuilder sb = new StringBuilder(valueOf.length() + 16);
            sb.append("Predicates.not(");
            sb.append(valueOf);
            sb.append(C9811tl1.d);
            return sb.toString();
        }
    }

    /* renamed from: o.mG1$k */
    /* loaded from: classes3.dex */
    public static class k<T> implements IF1<T>, Serializable {
        private static final long serialVersionUID = 0;
        public final List<? extends IF1<? super T>> X;

        @Override // o.IF1
        public boolean apply(@InterfaceC9863ty1 T t) {
            for (int i = 0; i < this.X.size(); i++) {
                if (this.X.get(i).apply(t)) {
                    return true;
                }
            }
            return false;
        }

        @Override // o.IF1
        public boolean equals(@MB Object obj) {
            if (obj instanceof k) {
                return this.X.equals(((k) obj).X);
            }
            return false;
        }

        public int hashCode() {
            return this.X.hashCode() + 87855567;
        }

        public String toString() {
            return C7985mG1.w("or", this.X);
        }

        public k(List<? extends IF1<? super T>> list) {
            this.X = list;
        }
    }

    @InterfaceC11149zF0
    /* renamed from: o.mG1$l */
    /* loaded from: classes3.dex */
    public static class l implements IF1<Class<?>>, Serializable {
        private static final long serialVersionUID = 0;
        public final Class<?> X;

        @Override // o.IF1
        /* renamed from: a */
        public boolean apply(Class<?> cls) {
            return this.X.isAssignableFrom(cls);
        }

        @Override // o.IF1
        public boolean equals(@MB Object obj) {
            if (!(obj instanceof l) || this.X != ((l) obj).X) {
                return false;
            }
            return true;
        }

        public int hashCode() {
            return this.X.hashCode();
        }

        public String toString() {
            String name = this.X.getName();
            StringBuilder sb = new StringBuilder(name.length() + 22);
            sb.append("Predicates.subtypeOf(");
            sb.append(name);
            sb.append(C9811tl1.d);
            return sb.toString();
        }

        public l(Class<?> cls) {
            this.X = (Class) C10664xF1.E(cls);
        }
    }

    @InterfaceC10420wF0(serializable = true)
    public static <T> IF1<T> b() {
        return j.Y.g();
    }

    @InterfaceC10420wF0(serializable = true)
    public static <T> IF1<T> c() {
        return j.X.g();
    }

    public static <T> IF1<T> d(Iterable<? extends IF1<? super T>> iterable) {
        return new b(k(iterable));
    }

    public static <T> IF1<T> e(IF1<? super T> if1, IF1<? super T> if12) {
        return new b(g((IF1) C10664xF1.E(if1), (IF1) C10664xF1.E(if12)));
    }

    @SafeVarargs
    public static <T> IF1<T> f(IF1<? super T>... if1Arr) {
        return new b(l(if1Arr));
    }

    public static <T> List<IF1<? super T>> g(IF1<? super T> if1, IF1<? super T> if12) {
        return Arrays.asList(if1, if12);
    }

    public static <A, B> IF1<A> h(IF1<B> if1, YA0<A, ? extends B> ya0) {
        return new c(if1, ya0);
    }

    @InterfaceC11149zF0("java.util.regex.Pattern")
    public static IF1<CharSequence> i(Pattern pattern) {
        return new e(new QU0(pattern));
    }

    @InterfaceC11149zF0
    public static IF1<CharSequence> j(String str) {
        return new d(str);
    }

    public static <T> List<T> k(Iterable<T> iterable) {
        ArrayList arrayList = new ArrayList();
        for (T t : iterable) {
            arrayList.add(C10664xF1.E(t));
        }
        return arrayList;
    }

    public static <T> List<T> l(T... tArr) {
        return k(Arrays.asList(tArr));
    }

    public static <T> IF1<T> m(@InterfaceC9863ty1 T t) {
        if (t == null) {
            return p();
        }
        return new h(t).a();
    }

    public static <T> IF1<T> n(Collection<? extends T> collection) {
        return new f(collection);
    }

    @InterfaceC11149zF0
    public static <T> IF1<T> o(Class<?> cls) {
        return new g(cls);
    }

    @InterfaceC10420wF0(serializable = true)
    public static <T> IF1<T> p() {
        return j.Z.g();
    }

    public static <T> IF1<T> q(IF1<T> if1) {
        return new i(if1);
    }

    @InterfaceC10420wF0(serializable = true)
    public static <T> IF1<T> r() {
        return j.Y0.g();
    }

    public static <T> IF1<T> s(Iterable<? extends IF1<? super T>> iterable) {
        return new k(k(iterable));
    }

    public static <T> IF1<T> t(IF1<? super T> if1, IF1<? super T> if12) {
        return new k(g((IF1) C10664xF1.E(if1), (IF1) C10664xF1.E(if12)));
    }

    @SafeVarargs
    public static <T> IF1<T> u(IF1<? super T>... if1Arr) {
        return new k(l(if1Arr));
    }

    @InterfaceC11149zF0
    @InterfaceC4238Sm
    public static IF1<Class<?>> v(Class<?> cls) {
        return new l(cls);
    }

    public static String w(String str, Iterable<?> iterable) {
        StringBuilder sb = new StringBuilder("Predicates.");
        sb.append(str);
        sb.append('(');
        boolean z = true;
        for (Object obj : iterable) {
            if (!z) {
                sb.append(',');
            }
            sb.append(obj);
            z = false;
        }
        sb.append(')');
        return sb.toString();
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* renamed from: o.mG1$j */
    /* loaded from: classes3.dex */
    public static abstract class j implements IF1<Object> {
        public static final j X = new a("ALWAYS_TRUE", 0);
        public static final j Y = new b("ALWAYS_FALSE", 1);
        public static final j Z = new c("IS_NULL", 2);
        public static final j Y0 = new d("NOT_NULL", 3);
        public static final /* synthetic */ j[] Z0 = e();

        /* renamed from: o.mG1$j$a */
        /* loaded from: classes3.dex */
        public enum a extends j {
            public a(String str, int i) {
                super(str, i);
            }

            @Override // o.IF1
            public boolean apply(@MB Object obj) {
                return true;
            }

            @Override // java.lang.Enum
            public String toString() {
                return "Predicates.alwaysTrue()";
            }
        }

        /* renamed from: o.mG1$j$b */
        /* loaded from: classes3.dex */
        public enum b extends j {
            public b(String str, int i) {
                super(str, i);
            }

            @Override // o.IF1
            public boolean apply(@MB Object obj) {
                return false;
            }

            @Override // java.lang.Enum
            public String toString() {
                return "Predicates.alwaysFalse()";
            }
        }

        /* renamed from: o.mG1$j$c */
        /* loaded from: classes3.dex */
        public enum c extends j {
            public c(String str, int i) {
                super(str, i);
            }

            @Override // o.IF1
            public boolean apply(@MB Object obj) {
                if (obj == null) {
                    return true;
                }
                return false;
            }

            @Override // java.lang.Enum
            public String toString() {
                return "Predicates.isNull()";
            }
        }

        /* renamed from: o.mG1$j$d */
        /* loaded from: classes3.dex */
        public enum d extends j {
            public d(String str, int i) {
                super(str, i);
            }

            @Override // o.IF1
            public boolean apply(@MB Object obj) {
                if (obj != null) {
                    return true;
                }
                return false;
            }

            @Override // java.lang.Enum
            public String toString() {
                return "Predicates.notNull()";
            }
        }

        public j(String str, int i) {
        }

        public static /* synthetic */ j[] e() {
            return new j[]{X, Y, Z, Y0};
        }

        public static j valueOf(String str) {
            return (j) Enum.valueOf(j.class, str);
        }

        public static j[] values() {
            return (j[]) Z0.clone();
        }

        public <T> IF1<T> g() {
            return this;
        }
    }
}
