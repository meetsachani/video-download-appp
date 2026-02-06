package o;

import java.util.List;

/* renamed from: o.nt1  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C8378nt1 {
    public static final Object[] a = new Object[0];
    public static final AbstractC8135mt1<Object> b = new C11280zn1(0);

    public static final void d(List<?> list, int i) {
        int size = list.size();
        if (i >= 0 && i < size) {
            return;
        }
        throw new IndexOutOfBoundsException("Index " + i + " is out of bounds. The list has " + size + " elements.");
    }

    public static final void e(List<?> list, int i, int i2) {
        int size = list.size();
        if (i <= i2) {
            if (i >= 0) {
                if (i2 <= size) {
                    return;
                }
                throw new IndexOutOfBoundsException("toIndex (" + i2 + ") is more than than the list size (" + size + ')');
            }
            throw new IndexOutOfBoundsException("fromIndex (" + i + ") is less than 0.");
        }
        throw new IllegalArgumentException("Indices are out of order. fromIndex (" + i + ") is greater than toIndex (" + i2 + ").");
    }

    public static final <E> AbstractC8135mt1<E> f() {
        AbstractC8135mt1<E> abstractC8135mt1 = (AbstractC8135mt1<E>) b;
        C6562gT0.n(abstractC8135mt1, "null cannot be cast to non-null type androidx.collection.ObjectList<E of androidx.collection.ObjectListKt.emptyObjectList>");
        return abstractC8135mt1;
    }

    public static final <E> C11280zn1<E> g() {
        return new C11280zn1<>(0, 1, null);
    }

    public static final <E> C11280zn1<E> h(E e) {
        C11280zn1<E> c11280zn1 = new C11280zn1<>(1);
        c11280zn1.Z(e);
        return c11280zn1;
    }

    public static final <E> C11280zn1<E> i(E e, E e2) {
        C11280zn1<E> c11280zn1 = new C11280zn1<>(2);
        c11280zn1.Z(e);
        c11280zn1.Z(e2);
        return c11280zn1;
    }

    public static final <E> C11280zn1<E> j(E e, E e2, E e3) {
        C11280zn1<E> c11280zn1 = new C11280zn1<>(3);
        c11280zn1.Z(e);
        c11280zn1.Z(e2);
        c11280zn1.Z(e3);
        return c11280zn1;
    }

    public static final <E> C11280zn1<E> k(E... eArr) {
        C6562gT0.p(eArr, "elements");
        C11280zn1<E> c11280zn1 = new C11280zn1<>(eArr.length);
        c11280zn1.A0(eArr);
        return c11280zn1;
    }

    public static final <E> AbstractC8135mt1<E> l() {
        AbstractC8135mt1<E> abstractC8135mt1 = (AbstractC8135mt1<E>) b;
        C6562gT0.n(abstractC8135mt1, "null cannot be cast to non-null type androidx.collection.ObjectList<E of androidx.collection.ObjectListKt.objectListOf>");
        return abstractC8135mt1;
    }

    public static final <E> AbstractC8135mt1<E> m(E e) {
        return h(e);
    }

    public static final <E> AbstractC8135mt1<E> n(E e, E e2) {
        return i(e, e2);
    }

    public static final <E> AbstractC8135mt1<E> o(E e, E e2, E e3) {
        return j(e, e2, e3);
    }

    public static final <E> AbstractC8135mt1<E> p(E... eArr) {
        C6562gT0.p(eArr, "elements");
        C11280zn1 c11280zn1 = new C11280zn1(eArr.length);
        c11280zn1.A0(eArr);
        return c11280zn1;
    }
}
