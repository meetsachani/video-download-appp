package o;

import java.util.function.Predicate;

/* renamed from: o.gH */
/* loaded from: classes4.dex */
public class C6513gH {

    /* renamed from: o.gH$b */
    /* loaded from: classes4.dex */
    public static class b<A extends Comparable<A>> {
        public final A a;

        public boolean a(A a, A a2) {
            if (!c(a, a2) && !c(a2, a)) {
                return false;
            }
            return true;
        }

        public boolean b(A a, A a2) {
            if (!d(a, a2) && !d(a2, a)) {
                return false;
            }
            return true;
        }

        public final boolean c(A a, A a2) {
            if (g(a) && i(a2)) {
                return true;
            }
            return false;
        }

        public final boolean d(A a, A a2) {
            if (f(a) && h(a2)) {
                return true;
            }
            return false;
        }

        public boolean e(A a) {
            if (this.a.compareTo(a) == 0) {
                return true;
            }
            return false;
        }

        public boolean f(A a) {
            if (this.a.compareTo(a) > 0) {
                return true;
            }
            return false;
        }

        public boolean g(A a) {
            if (this.a.compareTo(a) >= 0) {
                return true;
            }
            return false;
        }

        public boolean h(A a) {
            if (this.a.compareTo(a) < 0) {
                return true;
            }
            return false;
        }

        public boolean i(A a) {
            if (this.a.compareTo(a) <= 0) {
                return true;
            }
            return false;
        }

        public b(A a) {
            this.a = a;
        }
    }

    public static /* synthetic */ boolean a(Comparable comparable, Comparable comparable2) {
        return k(comparable2).g(comparable);
    }

    public static /* synthetic */ boolean b(Comparable comparable, Comparable comparable2, Comparable comparable3) {
        return k(comparable3).b(comparable, comparable2);
    }

    public static /* synthetic */ boolean c(Comparable comparable, Comparable comparable2, Comparable comparable3) {
        return k(comparable3).a(comparable, comparable2);
    }

    public static /* synthetic */ boolean d(Comparable comparable, Comparable comparable2) {
        return k(comparable2).f(comparable);
    }

    public static /* synthetic */ boolean e(Comparable comparable, Comparable comparable2) {
        return k(comparable2).h(comparable);
    }

    public static /* synthetic */ boolean f(Comparable comparable, Comparable comparable2) {
        return k(comparable2).i(comparable);
    }

    public static <A extends Comparable<A>> Predicate<A> g(final A a2, final A a3) {
        return new Predicate() { // from class: o.cH
            @Override // java.util.function.Predicate
            public final boolean test(Object obj) {
                return C6513gH.c(a2, a3, (Comparable) obj);
            }
        };
    }

    public static <A extends Comparable<A>> Predicate<A> h(final A a2, final A a3) {
        return new Predicate() { // from class: o.dH
            @Override // java.util.function.Predicate
            public final boolean test(Object obj) {
                return C6513gH.b(a2, a3, (Comparable) obj);
            }
        };
    }

    public static <A extends Comparable<A>> Predicate<A> i(final A a2) {
        return new Predicate() { // from class: o.aH
            @Override // java.util.function.Predicate
            public final boolean test(Object obj) {
                return C6513gH.a(a2, (Comparable) obj);
            }
        };
    }

    public static <A extends Comparable<A>> Predicate<A> j(final A a2) {
        return new Predicate() { // from class: o.bH
            @Override // java.util.function.Predicate
            public final boolean test(Object obj) {
                return C6513gH.d(a2, (Comparable) obj);
            }
        };
    }

    public static <A extends Comparable<A>> b<A> k(A a2) {
        return new b<>(a2);
    }

    public static <A extends Comparable<A>> Predicate<A> l(final A a2) {
        return new Predicate() { // from class: o.fH
            @Override // java.util.function.Predicate
            public final boolean test(Object obj) {
                return C6513gH.f(a2, (Comparable) obj);
            }
        };
    }

    public static <A extends Comparable<A>> Predicate<A> m(final A a2) {
        return new Predicate() { // from class: o.eH
            @Override // java.util.function.Predicate
            public final boolean test(Object obj) {
                return C6513gH.e(a2, (Comparable) obj);
            }
        };
    }
}
