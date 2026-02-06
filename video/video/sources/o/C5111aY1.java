package o;

/* renamed from: o.aY1  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5111aY1 {
    public static final C3853On1<Object> a = new C3853On1<>(0);

    public static final <E> ZX1<E> a() {
        C3853On1<Object> c3853On1 = a;
        C6562gT0.n(c3853On1, "null cannot be cast to non-null type androidx.collection.ScatterSet<E of androidx.collection.ScatterSetKt.emptyScatterSet>");
        return c3853On1;
    }

    public static final <E> C3853On1<E> b() {
        return new C3853On1<>(0, 1, null);
    }

    public static final <E> C3853On1<E> c(E e) {
        C3853On1<E> c3853On1 = new C3853On1<>(1);
        c3853On1.X(e);
        return c3853On1;
    }

    public static final <E> C3853On1<E> d(E e, E e2) {
        C3853On1<E> c3853On1 = new C3853On1<>(2);
        c3853On1.X(e);
        c3853On1.X(e2);
        return c3853On1;
    }

    public static final <E> C3853On1<E> e(E e, E e2, E e3) {
        C3853On1<E> c3853On1 = new C3853On1<>(3);
        c3853On1.X(e);
        c3853On1.X(e2);
        c3853On1.X(e3);
        return c3853On1;
    }

    public static final <E> C3853On1<E> f(E... eArr) {
        C6562gT0.p(eArr, "elements");
        C3853On1<E> c3853On1 = new C3853On1<>(eArr.length);
        c3853On1.b0(eArr);
        return c3853On1;
    }

    public static final <E> ZX1<E> g() {
        C3853On1<Object> c3853On1 = a;
        C6562gT0.n(c3853On1, "null cannot be cast to non-null type androidx.collection.ScatterSet<E of androidx.collection.ScatterSetKt.scatterSetOf>");
        return c3853On1;
    }

    public static final <E> ZX1<E> h(E e) {
        return c(e);
    }

    public static final <E> ZX1<E> i(E e, E e2) {
        return d(e, e2);
    }

    public static final <E> ZX1<E> j(E e, E e2, E e3) {
        return e(e, e2, e3);
    }

    public static final <E> ZX1<E> k(E... eArr) {
        C6562gT0.p(eArr, "elements");
        C3853On1 c3853On1 = new C3853On1(eArr.length);
        c3853On1.b0(eArr);
        return c3853On1;
    }
}
