package o;

import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Set;

/* renamed from: o.Ke  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3424Ke {
    public static final int a = 4;

    public static final <E> void a(C3228Ie<E> c3228Ie, C3228Ie<? extends E> c3228Ie2) {
        C6562gT0.p(c3228Ie, "<this>");
        C6562gT0.p(c3228Ie2, "array");
        int j = c3228Ie2.j();
        c3228Ie.e(c3228Ie.j() + j);
        if (c3228Ie.j() == 0) {
            if (j > 0) {
                C4788Ye.I0(c3228Ie2.h(), c3228Ie.h(), 0, 0, j, 6, null);
                C4788Ye.K0(c3228Ie2.f(), c3228Ie.f(), 0, 0, j, 6, null);
                if (c3228Ie.j() == 0) {
                    c3228Ie.w(j);
                    return;
                }
                throw new ConcurrentModificationException();
            }
            return;
        }
        for (int i = 0; i < j; i++) {
            c3228Ie.add(c3228Ie2.B(i));
        }
    }

    public static final <E> boolean b(C3228Ie<E> c3228Ie, Collection<? extends E> collection) {
        C6562gT0.p(c3228Ie, "<this>");
        C6562gT0.p(collection, "elements");
        c3228Ie.e(c3228Ie.j() + collection.size());
        boolean z = false;
        for (E e : collection) {
            z |= c3228Ie.add(e);
        }
        return z;
    }

    public static final <E> boolean c(C3228Ie<E> c3228Ie, E e) {
        int i;
        int n;
        C6562gT0.p(c3228Ie, "<this>");
        int j = c3228Ie.j();
        boolean z = false;
        if (e == null) {
            n = p(c3228Ie);
            i = 0;
        } else {
            int hashCode = e.hashCode();
            i = hashCode;
            n = n(c3228Ie, e, hashCode);
        }
        if (n >= 0) {
            return false;
        }
        int i2 = ~n;
        if (j >= c3228Ie.h().length) {
            int i3 = 8;
            if (j >= 8) {
                i3 = (j >> 1) + j;
            } else if (j < 4) {
                i3 = 4;
            }
            int[] h = c3228Ie.h();
            Object[] f = c3228Ie.f();
            d(c3228Ie, i3);
            if (j == c3228Ie.j()) {
                if (c3228Ie.h().length == 0) {
                    z = true;
                }
                if (!z) {
                    C4788Ye.I0(h, c3228Ie.h(), 0, 0, h.length, 6, null);
                    C4788Ye.K0(f, c3228Ie.f(), 0, 0, f.length, 6, null);
                }
            } else {
                throw new ConcurrentModificationException();
            }
        }
        if (i2 < j) {
            int i4 = i2 + 1;
            C4788Ye.z0(c3228Ie.h(), c3228Ie.h(), i4, i2, j);
            C4788Ye.B0(c3228Ie.f(), c3228Ie.f(), i4, i2, j);
        }
        if (j == c3228Ie.j() && i2 < c3228Ie.h().length) {
            c3228Ie.h()[i2] = i;
            c3228Ie.f()[i2] = e;
            c3228Ie.w(c3228Ie.j() + 1);
            return true;
        }
        throw new ConcurrentModificationException();
    }

    public static final <E> void d(C3228Ie<E> c3228Ie, int i) {
        C6562gT0.p(c3228Ie, "<this>");
        c3228Ie.r(new int[i]);
        c3228Ie.p(new Object[i]);
    }

    public static final <T> C3228Ie<T> e() {
        return new C3228Ie<>(0, 1, null);
    }

    public static final <T> C3228Ie<T> f(T... tArr) {
        C6562gT0.p(tArr, androidx.lifecycle.p.g);
        C3228Ie<T> c3228Ie = new C3228Ie<>(tArr.length);
        for (T t : tArr) {
            c3228Ie.add(t);
        }
        return c3228Ie;
    }

    public static final <E> int g(C3228Ie<E> c3228Ie, int i) {
        C6562gT0.p(c3228Ie, "<this>");
        try {
            return BL.a(c3228Ie.h(), c3228Ie.j(), i);
        } catch (IndexOutOfBoundsException unused) {
            throw new ConcurrentModificationException();
        }
    }

    public static final <E> void h(C3228Ie<E> c3228Ie) {
        C6562gT0.p(c3228Ie, "<this>");
        if (c3228Ie.j() != 0) {
            c3228Ie.r(BL.a);
            c3228Ie.p(BL.c);
            c3228Ie.w(0);
        }
        if (c3228Ie.j() == 0) {
            return;
        }
        throw new ConcurrentModificationException();
    }

    public static final <E> boolean i(C3228Ie<E> c3228Ie, Collection<? extends E> collection) {
        C6562gT0.p(c3228Ie, "<this>");
        C6562gT0.p(collection, "elements");
        for (E e : collection) {
            if (!c3228Ie.contains(e)) {
                return false;
            }
        }
        return true;
    }

    public static final <E> boolean j(C3228Ie<E> c3228Ie, E e) {
        C6562gT0.p(c3228Ie, "<this>");
        if (c3228Ie.indexOf(e) >= 0) {
            return true;
        }
        return false;
    }

    public static final <E> void k(C3228Ie<E> c3228Ie, int i) {
        C6562gT0.p(c3228Ie, "<this>");
        int j = c3228Ie.j();
        if (c3228Ie.h().length < i) {
            int[] h = c3228Ie.h();
            Object[] f = c3228Ie.f();
            d(c3228Ie, i);
            if (c3228Ie.j() > 0) {
                C4788Ye.I0(h, c3228Ie.h(), 0, 0, c3228Ie.j(), 6, null);
                C4788Ye.K0(f, c3228Ie.f(), 0, 0, c3228Ie.j(), 6, null);
            }
        }
        if (c3228Ie.j() == j) {
            return;
        }
        throw new ConcurrentModificationException();
    }

    public static final <E> boolean l(C3228Ie<E> c3228Ie, Object obj) {
        C6562gT0.p(c3228Ie, "<this>");
        if (c3228Ie == obj) {
            return true;
        }
        if (!(obj instanceof Set) || c3228Ie.size() != ((Set) obj).size()) {
            return false;
        }
        try {
            int j = c3228Ie.j();
            for (int i = 0; i < j; i++) {
                if (!((Set) obj).contains(c3228Ie.B(i))) {
                    return false;
                }
            }
            return true;
        } catch (ClassCastException | NullPointerException unused) {
            return false;
        }
    }

    public static final <E> int m(C3228Ie<E> c3228Ie) {
        C6562gT0.p(c3228Ie, "<this>");
        int[] h = c3228Ie.h();
        int j = c3228Ie.j();
        int i = 0;
        for (int i2 = 0; i2 < j; i2++) {
            i += h[i2];
        }
        return i;
    }

    public static final <E> int n(C3228Ie<E> c3228Ie, Object obj, int i) {
        C6562gT0.p(c3228Ie, "<this>");
        int j = c3228Ie.j();
        if (j == 0) {
            return -1;
        }
        int g = g(c3228Ie, i);
        if (g < 0 || C6562gT0.g(obj, c3228Ie.f()[g])) {
            return g;
        }
        int i2 = g + 1;
        while (i2 < j && c3228Ie.h()[i2] == i) {
            if (C6562gT0.g(obj, c3228Ie.f()[i2])) {
                return i2;
            }
            i2++;
        }
        for (int i3 = g - 1; i3 >= 0 && c3228Ie.h()[i3] == i; i3--) {
            if (C6562gT0.g(obj, c3228Ie.f()[i3])) {
                return i3;
            }
        }
        return ~i2;
    }

    public static final <E> int o(C3228Ie<E> c3228Ie, Object obj) {
        C6562gT0.p(c3228Ie, "<this>");
        if (obj == null) {
            return p(c3228Ie);
        }
        return n(c3228Ie, obj, obj.hashCode());
    }

    public static final <E> int p(C3228Ie<E> c3228Ie) {
        C6562gT0.p(c3228Ie, "<this>");
        return n(c3228Ie, null, 0);
    }

    public static final <E> boolean q(C3228Ie<E> c3228Ie) {
        C6562gT0.p(c3228Ie, "<this>");
        if (c3228Ie.j() <= 0) {
            return true;
        }
        return false;
    }

    public static final <E> boolean r(C3228Ie<E> c3228Ie, Collection<? extends E> collection) {
        C6562gT0.p(c3228Ie, "<this>");
        C6562gT0.p(collection, "elements");
        boolean z = false;
        for (E e : collection) {
            z |= c3228Ie.remove(e);
        }
        return z;
    }

    public static final <E> boolean s(C3228Ie<E> c3228Ie, C3228Ie<? extends E> c3228Ie2) {
        C6562gT0.p(c3228Ie, "<this>");
        C6562gT0.p(c3228Ie2, "array");
        int j = c3228Ie2.j();
        int j2 = c3228Ie.j();
        for (int i = 0; i < j; i++) {
            c3228Ie.remove(c3228Ie2.B(i));
        }
        if (j2 == c3228Ie.j()) {
            return false;
        }
        return true;
    }

    public static final <E> E t(C3228Ie<E> c3228Ie, int i) {
        int i2;
        Object[] objArr;
        C6562gT0.p(c3228Ie, "<this>");
        int j = c3228Ie.j();
        E e = (E) c3228Ie.f()[i];
        if (j <= 1) {
            c3228Ie.clear();
            return e;
        }
        int i3 = j - 1;
        int i4 = 8;
        if (c3228Ie.h().length > 8 && c3228Ie.j() < c3228Ie.h().length / 3) {
            if (c3228Ie.j() > 8) {
                i4 = c3228Ie.j() + (c3228Ie.j() >> 1);
            }
            int[] h = c3228Ie.h();
            Object[] f = c3228Ie.f();
            d(c3228Ie, i4);
            if (i > 0) {
                C4788Ye.I0(h, c3228Ie.h(), 0, 0, i, 6, null);
                objArr = f;
                C4788Ye.K0(objArr, c3228Ie.f(), 0, 0, i, 6, null);
                i2 = i;
            } else {
                i2 = i;
                objArr = f;
            }
            if (i2 < i3) {
                int i5 = i2 + 1;
                C4788Ye.z0(h, c3228Ie.h(), i2, i5, j);
                C4788Ye.B0(objArr, c3228Ie.f(), i2, i5, j);
            }
        } else {
            if (i < i3) {
                int i6 = i + 1;
                C4788Ye.z0(c3228Ie.h(), c3228Ie.h(), i, i6, j);
                C4788Ye.B0(c3228Ie.f(), c3228Ie.f(), i, i6, j);
            }
            c3228Ie.f()[i3] = null;
        }
        if (j == c3228Ie.j()) {
            c3228Ie.w(i3);
            return e;
        }
        throw new ConcurrentModificationException();
    }

    public static final <E> boolean u(C3228Ie<E> c3228Ie, E e) {
        C6562gT0.p(c3228Ie, "<this>");
        int indexOf = c3228Ie.indexOf(e);
        if (indexOf >= 0) {
            c3228Ie.l(indexOf);
            return true;
        }
        return false;
    }

    public static final <E> boolean v(C3228Ie<E> c3228Ie, Collection<? extends E> collection) {
        C6562gT0.p(c3228Ie, "<this>");
        C6562gT0.p(collection, "elements");
        boolean z = false;
        for (int j = c3228Ie.j() - 1; -1 < j; j--) {
            if (!C10662xF.Y1(collection, c3228Ie.f()[j])) {
                c3228Ie.l(j);
                z = true;
            }
        }
        return z;
    }

    public static final <E> String w(C3228Ie<E> c3228Ie) {
        C6562gT0.p(c3228Ie, "<this>");
        if (c3228Ie.isEmpty()) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(c3228Ie.j() * 14);
        sb.append('{');
        int j = c3228Ie.j();
        for (int i = 0; i < j; i++) {
            if (i > 0) {
                sb.append(C6566gU0.h);
            }
            E B = c3228Ie.B(i);
            if (B != c3228Ie) {
                sb.append(B);
            } else {
                sb.append("(this Set)");
            }
        }
        sb.append('}');
        String sb2 = sb.toString();
        C6562gT0.o(sb2, "StringBuilder(capacity).…builderAction).toString()");
        return sb2;
    }

    public static final <E> E x(C3228Ie<E> c3228Ie, int i) {
        C6562gT0.p(c3228Ie, "<this>");
        return (E) c3228Ie.f()[i];
    }
}
