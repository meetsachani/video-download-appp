package o;

import java.util.Comparator;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* renamed from: o.zH */
/* loaded from: classes3.dex */
public class C11156zH {

    /* renamed from: o.zH$a */
    /* loaded from: classes3.dex */
    public static final class a<T> implements Comparator {
        public final /* synthetic */ HA0<T, Comparable<?>> X;

        /* JADX WARN: Multi-variable type inference failed */
        public a(HA0<? super T, ? extends Comparable<?>> ha0) {
            this.X = ha0;
        }

        @Override // java.util.Comparator
        public final int compare(T t, T t2) {
            HA0<T, Comparable<?>> ha0 = this.X;
            return C11156zH.l(ha0.invoke(t), ha0.invoke(t2));
        }
    }

    /* renamed from: o.zH$b */
    /* loaded from: classes3.dex */
    public static final class b<T> implements Comparator {
        public final /* synthetic */ Comparator<? super K> X;
        public final /* synthetic */ HA0<T, K> Y;

        /* JADX WARN: Multi-variable type inference failed */
        public b(Comparator<? super K> comparator, HA0<? super T, ? extends K> ha0) {
            this.X = comparator;
            this.Y = ha0;
        }

        @Override // java.util.Comparator
        public final int compare(T t, T t2) {
            Comparator<? super K> comparator = this.X;
            HA0<T, K> ha0 = this.Y;
            return comparator.compare(ha0.invoke(t), ha0.invoke(t2));
        }
    }

    /* renamed from: o.zH$c */
    /* loaded from: classes3.dex */
    public static final class c<T> implements Comparator {
        public final /* synthetic */ HA0<T, Comparable<?>> X;

        /* JADX WARN: Multi-variable type inference failed */
        public c(HA0<? super T, ? extends Comparable<?>> ha0) {
            this.X = ha0;
        }

        @Override // java.util.Comparator
        public final int compare(T t, T t2) {
            HA0<T, Comparable<?>> ha0 = this.X;
            return C11156zH.l(ha0.invoke(t2), ha0.invoke(t));
        }
    }

    /* renamed from: o.zH$d */
    /* loaded from: classes3.dex */
    public static final class d<T> implements Comparator {
        public final /* synthetic */ Comparator<? super K> X;
        public final /* synthetic */ HA0<T, K> Y;

        /* JADX WARN: Multi-variable type inference failed */
        public d(Comparator<? super K> comparator, HA0<? super T, ? extends K> ha0) {
            this.X = comparator;
            this.Y = ha0;
        }

        @Override // java.util.Comparator
        public final int compare(T t, T t2) {
            Comparator<? super K> comparator = this.X;
            HA0<T, K> ha0 = this.Y;
            return comparator.compare(ha0.invoke(t2), ha0.invoke(t));
        }
    }

    /* renamed from: o.zH$e */
    /* loaded from: classes3.dex */
    public static final class e<T> implements Comparator {
        public final /* synthetic */ Comparator<T> X;
        public final /* synthetic */ HA0<T, Comparable<?>> Y;

        /* JADX WARN: Multi-variable type inference failed */
        public e(Comparator<T> comparator, HA0<? super T, ? extends Comparable<?>> ha0) {
            this.X = comparator;
            this.Y = ha0;
        }

        @Override // java.util.Comparator
        public final int compare(T t, T t2) {
            int compare = this.X.compare(t, t2);
            if (compare != 0) {
                return compare;
            }
            HA0<T, Comparable<?>> ha0 = this.Y;
            return C11156zH.l(ha0.invoke(t), ha0.invoke(t2));
        }
    }

    /* renamed from: o.zH$f */
    /* loaded from: classes3.dex */
    public static final class f<T> implements Comparator {
        public final /* synthetic */ Comparator<T> X;
        public final /* synthetic */ Comparator<? super K> Y;
        public final /* synthetic */ HA0<T, K> Z;

        /* JADX WARN: Multi-variable type inference failed */
        public f(Comparator<T> comparator, Comparator<? super K> comparator2, HA0<? super T, ? extends K> ha0) {
            this.X = comparator;
            this.Y = comparator2;
            this.Z = ha0;
        }

        @Override // java.util.Comparator
        public final int compare(T t, T t2) {
            int compare = this.X.compare(t, t2);
            if (compare != 0) {
                return compare;
            }
            Comparator<? super K> comparator = this.Y;
            HA0<T, K> ha0 = this.Z;
            return comparator.compare(ha0.invoke(t), ha0.invoke(t2));
        }
    }

    /* renamed from: o.zH$g */
    /* loaded from: classes3.dex */
    public static final class g<T> implements Comparator {
        public final /* synthetic */ Comparator<T> X;
        public final /* synthetic */ HA0<T, Comparable<?>> Y;

        /* JADX WARN: Multi-variable type inference failed */
        public g(Comparator<T> comparator, HA0<? super T, ? extends Comparable<?>> ha0) {
            this.X = comparator;
            this.Y = ha0;
        }

        @Override // java.util.Comparator
        public final int compare(T t, T t2) {
            int compare = this.X.compare(t, t2);
            if (compare != 0) {
                return compare;
            }
            HA0<T, Comparable<?>> ha0 = this.Y;
            return C11156zH.l(ha0.invoke(t2), ha0.invoke(t));
        }
    }

    /* renamed from: o.zH$h */
    /* loaded from: classes3.dex */
    public static final class h<T> implements Comparator {
        public final /* synthetic */ Comparator<T> X;
        public final /* synthetic */ Comparator<? super K> Y;
        public final /* synthetic */ HA0<T, K> Z;

        /* JADX WARN: Multi-variable type inference failed */
        public h(Comparator<T> comparator, Comparator<? super K> comparator2, HA0<? super T, ? extends K> ha0) {
            this.X = comparator;
            this.Y = comparator2;
            this.Z = ha0;
        }

        @Override // java.util.Comparator
        public final int compare(T t, T t2) {
            int compare = this.X.compare(t, t2);
            if (compare != 0) {
                return compare;
            }
            Comparator<? super K> comparator = this.Y;
            HA0<T, K> ha0 = this.Z;
            return comparator.compare(ha0.invoke(t2), ha0.invoke(t));
        }
    }

    /* renamed from: o.zH$i */
    /* loaded from: classes3.dex */
    public static final class i<T> implements Comparator {
        public final /* synthetic */ Comparator<T> X;
        public final /* synthetic */ VA0<T, T, Integer> Y;

        /* JADX WARN: Multi-variable type inference failed */
        public i(Comparator<T> comparator, VA0<? super T, ? super T, Integer> va0) {
            this.X = comparator;
            this.Y = va0;
        }

        @Override // java.util.Comparator
        public final int compare(T t, T t2) {
            int compare = this.X.compare(t, t2);
            if (compare != 0) {
                return compare;
            }
            return this.Y.i(t, t2).intValue();
        }
    }

    public static final int A(Comparator comparator, Comparator comparator2, Object obj, Object obj2) {
        int compare = comparator.compare(obj, obj2);
        if (compare != 0) {
            return compare;
        }
        return comparator2.compare(obj, obj2);
    }

    @XP0
    public static final <T, K> Comparator<T> B(Comparator<T> comparator, Comparator<? super K> comparator2, HA0<? super T, ? extends K> ha0) {
        C6562gT0.p(comparator, "<this>");
        C6562gT0.p(comparator2, "comparator");
        C6562gT0.p(ha0, "selector");
        return new f(comparator, comparator2, ha0);
    }

    @XP0
    public static final <T> Comparator<T> C(Comparator<T> comparator, HA0<? super T, ? extends Comparable<?>> ha0) {
        C6562gT0.p(comparator, "<this>");
        C6562gT0.p(ha0, "selector");
        return new e(comparator, ha0);
    }

    @XP0
    public static final <T, K> Comparator<T> D(Comparator<T> comparator, Comparator<? super K> comparator2, HA0<? super T, ? extends K> ha0) {
        C6562gT0.p(comparator, "<this>");
        C6562gT0.p(comparator2, "comparator");
        C6562gT0.p(ha0, "selector");
        return new h(comparator, comparator2, ha0);
    }

    @XP0
    public static final <T> Comparator<T> E(Comparator<T> comparator, HA0<? super T, ? extends Comparable<?>> ha0) {
        C6562gT0.p(comparator, "<this>");
        C6562gT0.p(ha0, "selector");
        return new g(comparator, ha0);
    }

    @XP0
    public static final <T> Comparator<T> F(Comparator<T> comparator, VA0<? super T, ? super T, Integer> va0) {
        C6562gT0.p(comparator, "<this>");
        C6562gT0.p(va0, "comparison");
        return new i(comparator, va0);
    }

    @NotNull
    public static final <T> Comparator<T> G(@NotNull final Comparator<T> comparator, @NotNull final Comparator<? super T> comparator2) {
        C6562gT0.p(comparator, "<this>");
        C6562gT0.p(comparator2, "comparator");
        return new Comparator() { // from class: o.vH
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return C11156zH.b(comparator, comparator2, obj, obj2);
            }
        };
    }

    public static final int H(Comparator comparator, Comparator comparator2, Object obj, Object obj2) {
        int compare = comparator.compare(obj, obj2);
        if (compare != 0) {
            return compare;
        }
        return comparator2.compare(obj2, obj);
    }

    public static /* synthetic */ int a(Comparator comparator, Object obj, Object obj2) {
        return w(comparator, obj, obj2);
    }

    public static /* synthetic */ int b(Comparator comparator, Comparator comparator2, Object obj, Object obj2) {
        return H(comparator, comparator2, obj, obj2);
    }

    public static /* synthetic */ int c(HA0[] ha0Arr, Object obj, Object obj2) {
        return i(ha0Arr, obj, obj2);
    }

    public static /* synthetic */ int d(Comparator comparator, Comparator comparator2, Object obj, Object obj2) {
        return A(comparator, comparator2, obj, obj2);
    }

    public static /* synthetic */ int e(Comparator comparator, Object obj, Object obj2) {
        return t(comparator, obj, obj2);
    }

    @XP0
    public static final <T, K> Comparator<T> f(Comparator<? super K> comparator, HA0<? super T, ? extends K> ha0) {
        C6562gT0.p(comparator, "comparator");
        C6562gT0.p(ha0, "selector");
        return new b(comparator, ha0);
    }

    @XP0
    public static final <T> Comparator<T> g(HA0<? super T, ? extends Comparable<?>> ha0) {
        C6562gT0.p(ha0, "selector");
        return new a(ha0);
    }

    @NotNull
    public static final <T> Comparator<T> h(@NotNull final HA0<? super T, ? extends Comparable<?>>... ha0Arr) {
        C6562gT0.p(ha0Arr, "selectors");
        if (ha0Arr.length > 0) {
            return new Comparator() { // from class: o.xH
                @Override // java.util.Comparator
                public final int compare(Object obj, Object obj2) {
                    return C11156zH.c(ha0Arr, obj, obj2);
                }
            };
        }
        throw new IllegalArgumentException("Failed requirement.");
    }

    public static final int i(HA0[] ha0Arr, Object obj, Object obj2) {
        return p(obj, obj2, ha0Arr);
    }

    @XP0
    public static final <T, K> Comparator<T> j(Comparator<? super K> comparator, HA0<? super T, ? extends K> ha0) {
        C6562gT0.p(comparator, "comparator");
        C6562gT0.p(ha0, "selector");
        return new d(comparator, ha0);
    }

    @XP0
    public static final <T> Comparator<T> k(HA0<? super T, ? extends Comparable<?>> ha0) {
        C6562gT0.p(ha0, "selector");
        return new c(ha0);
    }

    public static <T extends Comparable<?>> int l(@Nullable T t, @Nullable T t2) {
        if (t == t2) {
            return 0;
        }
        if (t == null) {
            return -1;
        }
        if (t2 == null) {
            return 1;
        }
        return t.compareTo(t2);
    }

    @XP0
    public static final <T, K> int m(T t, T t2, Comparator<? super K> comparator, HA0<? super T, ? extends K> ha0) {
        C6562gT0.p(comparator, "comparator");
        C6562gT0.p(ha0, "selector");
        return comparator.compare((K) ha0.invoke(t), (K) ha0.invoke(t2));
    }

    @XP0
    public static final <T> int n(T t, T t2, HA0<? super T, ? extends Comparable<?>> ha0) {
        C6562gT0.p(ha0, "selector");
        return l(ha0.invoke(t), ha0.invoke(t2));
    }

    public static final <T> int o(T t, T t2, @NotNull HA0<? super T, ? extends Comparable<?>>... ha0Arr) {
        C6562gT0.p(ha0Arr, "selectors");
        if (ha0Arr.length > 0) {
            return p(t, t2, ha0Arr);
        }
        throw new IllegalArgumentException("Failed requirement.");
    }

    public static final <T> int p(T t, T t2, HA0<? super T, ? extends Comparable<?>>[] ha0Arr) {
        for (HA0<? super T, ? extends Comparable<?>> ha0 : ha0Arr) {
            int l = l(ha0.invoke(t), ha0.invoke(t2));
            if (l != 0) {
                return l;
            }
        }
        return 0;
    }

    @NotNull
    public static <T extends Comparable<? super T>> Comparator<T> q() {
        C2573Bo1 c2573Bo1 = C2573Bo1.X;
        C6562gT0.n(c2573Bo1, "null cannot be cast to non-null type java.util.Comparator<T of kotlin.comparisons.ComparisonsKt__ComparisonsKt.naturalOrder>");
        return c2573Bo1;
    }

    @XP0
    public static final <T extends Comparable<? super T>> Comparator<T> r() {
        return s(q());
    }

    @NotNull
    public static final <T> Comparator<T> s(@NotNull final Comparator<? super T> comparator) {
        C6562gT0.p(comparator, "comparator");
        return new Comparator() { // from class: o.yH
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return C11156zH.e(comparator, obj, obj2);
            }
        };
    }

    public static final int t(Comparator comparator, Object obj, Object obj2) {
        if (obj == obj2) {
            return 0;
        }
        if (obj == null) {
            return -1;
        }
        if (obj2 == null) {
            return 1;
        }
        return comparator.compare(obj, obj2);
    }

    @XP0
    public static final <T extends Comparable<? super T>> Comparator<T> u() {
        return v(q());
    }

    @NotNull
    public static final <T> Comparator<T> v(@NotNull final Comparator<? super T> comparator) {
        C6562gT0.p(comparator, "comparator");
        return new Comparator() { // from class: o.uH
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return C11156zH.a(comparator, obj, obj2);
            }
        };
    }

    public static final int w(Comparator comparator, Object obj, Object obj2) {
        if (obj == obj2) {
            return 0;
        }
        if (obj == null) {
            return 1;
        }
        if (obj2 == null) {
            return -1;
        }
        return comparator.compare(obj, obj2);
    }

    @NotNull
    public static <T extends Comparable<? super T>> Comparator<T> x() {
        FU1 fu1 = FU1.X;
        C6562gT0.n(fu1, "null cannot be cast to non-null type java.util.Comparator<T of kotlin.comparisons.ComparisonsKt__ComparisonsKt.reverseOrder>");
        return fu1;
    }

    @NotNull
    public static final <T> Comparator<T> y(@NotNull Comparator<T> comparator) {
        C6562gT0.p(comparator, "<this>");
        if (comparator instanceof HU1) {
            return ((HU1) comparator).a();
        }
        C2573Bo1 c2573Bo1 = C2573Bo1.X;
        if (C6562gT0.g(comparator, c2573Bo1)) {
            FU1 fu1 = FU1.X;
            C6562gT0.n(fu1, "null cannot be cast to non-null type java.util.Comparator<T of kotlin.comparisons.ComparisonsKt__ComparisonsKt.reversed>");
            return fu1;
        } else if (C6562gT0.g(comparator, FU1.X)) {
            C6562gT0.n(c2573Bo1, "null cannot be cast to non-null type java.util.Comparator<T of kotlin.comparisons.ComparisonsKt__ComparisonsKt.reversed>");
            return c2573Bo1;
        } else {
            return new HU1(comparator);
        }
    }

    @NotNull
    public static final <T> Comparator<T> z(@NotNull final Comparator<T> comparator, @NotNull final Comparator<? super T> comparator2) {
        C6562gT0.p(comparator, "<this>");
        C6562gT0.p(comparator2, "comparator");
        return new Comparator() { // from class: o.wH
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return C11156zH.d(comparator, comparator2, obj, obj2);
            }
        };
    }
}
