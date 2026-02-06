package o;

import java.util.Objects;

/* loaded from: classes.dex */
public interface LF1<T> {
    static /* synthetic */ boolean b(LF1 lf1, Object obj) {
        return lf1.a(obj);
    }

    static /* synthetic */ boolean c(LF1 lf1, LF1 lf12, Object obj) {
        return lf1.j(lf12, obj);
    }

    static <T> LF1<T> d(LF1<? super T> lf1) {
        Objects.requireNonNull(lf1);
        return (LF1<? super T>) lf1.negate();
    }

    static /* synthetic */ boolean f(LF1 lf1, LF1 lf12, Object obj) {
        return lf1.e(lf12, obj);
    }

    static /* synthetic */ boolean g(Object obj, Object obj2) {
        return obj.equals(obj2);
    }

    static /* synthetic */ boolean h(Object obj) {
        return Objects.isNull(obj);
    }

    static <T> LF1<T> isEqual(final Object obj) {
        if (obj == null) {
            return new LF1() { // from class: o.EF1
                @Override // o.LF1
                public final boolean test(Object obj2) {
                    return LF1.h(obj2);
                }
            };
        }
        return new LF1() { // from class: o.FF1
            @Override // o.LF1
            public final boolean test(Object obj2) {
                return LF1.g(obj, obj2);
            }
        };
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* synthetic */ default boolean a(Object obj) {
        return !test(obj);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* synthetic */ default boolean e(LF1 lf1, Object obj) {
        if (test(obj) && lf1.test(obj)) {
            return true;
        }
        return false;
    }

    default LF1<T> i(final LF1<? super T> lf1) {
        Objects.requireNonNull(lf1);
        return new LF1() { // from class: o.GF1
            @Override // o.LF1
            public final boolean test(Object obj) {
                return LF1.f(LF1.this, lf1, obj);
            }
        };
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* synthetic */ default boolean j(LF1 lf1, Object obj) {
        if (!test(obj) && !lf1.test(obj)) {
            return false;
        }
        return true;
    }

    default LF1<T> k(final LF1<? super T> lf1) {
        Objects.requireNonNull(lf1);
        return new LF1() { // from class: o.DF1
            @Override // o.LF1
            public final boolean test(Object obj) {
                return LF1.c(LF1.this, lf1, obj);
            }
        };
    }

    default LF1<T> negate() {
        return new LF1() { // from class: o.HF1
            @Override // o.LF1
            public final boolean test(Object obj) {
                return LF1.b(LF1.this, obj);
            }
        };
    }

    boolean test(T t);
}
