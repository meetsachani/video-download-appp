package o;

import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.Set;

/* renamed from: o.Ie  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3228Ie<E> implements Collection<E>, Set<E>, HW0, RW0 {
    public int[] X;
    public Object[] Y;
    public int Z;

    /* renamed from: o.Ie$a */
    /* loaded from: classes.dex */
    public final class a extends AbstractC7516kP0<E> {
        public a() {
            super(C3228Ie.this.j());
        }

        @Override // o.AbstractC7516kP0
        public E b(int i) {
            return C3228Ie.this.B(i);
        }

        @Override // o.AbstractC7516kP0
        public void c(int i) {
            C3228Ie.this.l(i);
        }
    }

    public C3228Ie() {
        this(0, 1, null);
    }

    public final E B(int i) {
        return (E) f()[i];
    }

    @Override // java.util.Collection, java.util.Set
    public boolean add(E e) {
        int i;
        int n;
        int j = j();
        boolean z = false;
        if (e == null) {
            n = C3424Ke.p(this);
            i = 0;
        } else {
            int hashCode = e.hashCode();
            i = hashCode;
            n = C3424Ke.n(this, e, hashCode);
        }
        if (n >= 0) {
            return false;
        }
        int i2 = ~n;
        if (j >= h().length) {
            int i3 = 8;
            if (j >= 8) {
                i3 = (j >> 1) + j;
            } else if (j < 4) {
                i3 = 4;
            }
            int[] h = h();
            Object[] f = f();
            C3424Ke.d(this, i3);
            if (j == j()) {
                if (h().length == 0) {
                    z = true;
                }
                if (!z) {
                    C4788Ye.I0(h, h(), 0, 0, h.length, 6, null);
                    C4788Ye.K0(f, f(), 0, 0, f.length, 6, null);
                }
            } else {
                throw new ConcurrentModificationException();
            }
        }
        if (i2 < j) {
            int i4 = i2 + 1;
            C4788Ye.z0(h(), h(), i4, i2, j);
            C4788Ye.B0(f(), f(), i4, i2, j);
        }
        if (j == j() && i2 < h().length) {
            h()[i2] = i;
            f()[i2] = e;
            w(j() + 1);
            return true;
        }
        throw new ConcurrentModificationException();
    }

    @Override // java.util.Collection, java.util.Set
    public boolean addAll(Collection<? extends E> collection) {
        C6562gT0.p(collection, "elements");
        e(j() + collection.size());
        boolean z = false;
        for (E e : collection) {
            z |= add(e);
        }
        return z;
    }

    @Override // java.util.Collection, java.util.Set
    public void clear() {
        if (j() != 0) {
            r(BL.a);
            p(BL.c);
            w(0);
        }
        if (j() == 0) {
            return;
        }
        throw new ConcurrentModificationException();
    }

    @Override // java.util.Collection, java.util.Set
    public boolean contains(Object obj) {
        if (indexOf(obj) >= 0) {
            return true;
        }
        return false;
    }

    @Override // java.util.Collection, java.util.Set
    public boolean containsAll(Collection<? extends Object> collection) {
        C6562gT0.p(collection, "elements");
        for (Object obj : collection) {
            if (!contains(obj)) {
                return false;
            }
        }
        return true;
    }

    public final void d(C3228Ie<? extends E> c3228Ie) {
        C6562gT0.p(c3228Ie, "array");
        int j = c3228Ie.j();
        e(j() + j);
        if (j() == 0) {
            if (j > 0) {
                C4788Ye.I0(c3228Ie.h(), h(), 0, 0, j, 6, null);
                C4788Ye.K0(c3228Ie.f(), f(), 0, 0, j, 6, null);
                if (j() == 0) {
                    w(j);
                    return;
                }
                throw new ConcurrentModificationException();
            }
            return;
        }
        for (int i = 0; i < j; i++) {
            add(c3228Ie.B(i));
        }
    }

    public final void e(int i) {
        int j = j();
        if (h().length < i) {
            int[] h = h();
            Object[] f = f();
            C3424Ke.d(this, i);
            if (j() > 0) {
                C4788Ye.I0(h, h(), 0, 0, j(), 6, null);
                C4788Ye.K0(f, f(), 0, 0, j(), 6, null);
            }
        }
        if (j() == j) {
            return;
        }
        throw new ConcurrentModificationException();
    }

    @Override // java.util.Collection, java.util.Set
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Set) || size() != ((Set) obj).size()) {
            return false;
        }
        try {
            int j = j();
            for (int i = 0; i < j; i++) {
                if (!((Set) obj).contains(B(i))) {
                    return false;
                }
            }
            return true;
        } catch (ClassCastException | NullPointerException unused) {
            return false;
        }
    }

    public final Object[] f() {
        return this.Y;
    }

    public final int[] h() {
        return this.X;
    }

    @Override // java.util.Collection, java.util.Set
    public int hashCode() {
        int[] h = h();
        int j = j();
        int i = 0;
        for (int i2 = 0; i2 < j; i2++) {
            i += h[i2];
        }
        return i;
    }

    public int i() {
        return this.Z;
    }

    public final int indexOf(Object obj) {
        if (obj == null) {
            return C3424Ke.p(this);
        }
        return C3424Ke.n(this, obj, obj.hashCode());
    }

    @Override // java.util.Collection, java.util.Set
    public boolean isEmpty() {
        if (j() <= 0) {
            return true;
        }
        return false;
    }

    @Override // java.util.Collection, java.lang.Iterable, java.util.Set
    public Iterator<E> iterator() {
        return new a();
    }

    public final int j() {
        return this.Z;
    }

    public final boolean k(C3228Ie<? extends E> c3228Ie) {
        C6562gT0.p(c3228Ie, "array");
        int j = c3228Ie.j();
        int j2 = j();
        for (int i = 0; i < j; i++) {
            remove(c3228Ie.B(i));
        }
        if (j2 == j()) {
            return false;
        }
        return true;
    }

    public final E l(int i) {
        int i2;
        Object[] objArr;
        int j = j();
        E e = (E) f()[i];
        if (j <= 1) {
            clear();
            return e;
        }
        int i3 = j - 1;
        int i4 = 8;
        if (h().length > 8 && j() < h().length / 3) {
            if (j() > 8) {
                i4 = j() + (j() >> 1);
            }
            int[] h = h();
            Object[] f = f();
            C3424Ke.d(this, i4);
            if (i > 0) {
                C4788Ye.I0(h, h(), 0, 0, i, 6, null);
                objArr = f;
                C4788Ye.K0(objArr, f(), 0, 0, i, 6, null);
                i2 = i;
            } else {
                i2 = i;
                objArr = f;
            }
            if (i2 < i3) {
                int i5 = i2 + 1;
                C4788Ye.z0(h, h(), i2, i5, j);
                C4788Ye.B0(objArr, f(), i2, i5, j);
            }
        } else {
            if (i < i3) {
                int i6 = i + 1;
                C4788Ye.z0(h(), h(), i, i6, j);
                C4788Ye.B0(f(), f(), i, i6, j);
            }
            f()[i3] = null;
        }
        if (j == j()) {
            w(i3);
            return e;
        }
        throw new ConcurrentModificationException();
    }

    public final void p(Object[] objArr) {
        C6562gT0.p(objArr, "<set-?>");
        this.Y = objArr;
    }

    public final void r(int[] iArr) {
        C6562gT0.p(iArr, "<set-?>");
        this.X = iArr;
    }

    @Override // java.util.Collection, java.util.Set
    public boolean remove(Object obj) {
        int indexOf = indexOf(obj);
        if (indexOf >= 0) {
            l(indexOf);
            return true;
        }
        return false;
    }

    @Override // java.util.Collection, java.util.Set
    public boolean removeAll(Collection<? extends Object> collection) {
        C6562gT0.p(collection, "elements");
        boolean z = false;
        for (Object obj : collection) {
            z |= remove(obj);
        }
        return z;
    }

    @Override // java.util.Collection, java.util.Set
    public boolean retainAll(Collection<? extends Object> collection) {
        C6562gT0.p(collection, "elements");
        boolean z = false;
        for (int j = j() - 1; -1 < j; j--) {
            if (!C10662xF.Y1(collection, f()[j])) {
                l(j);
                z = true;
            }
        }
        return z;
    }

    @Override // java.util.Collection, java.util.Set
    public final /* bridge */ int size() {
        return i();
    }

    @Override // java.util.Collection, java.util.Set
    public final Object[] toArray() {
        return C4788Ye.l1(this.Y, 0, this.Z);
    }

    public String toString() {
        if (isEmpty()) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(j() * 14);
        sb.append('{');
        int j = j();
        for (int i = 0; i < j; i++) {
            if (i > 0) {
                sb.append(C6566gU0.h);
            }
            E B = B(i);
            if (B != this) {
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

    public final void w(int i) {
        this.Z = i;
    }

    public C3228Ie(int i) {
        this.X = BL.a;
        this.Y = BL.c;
        if (i > 0) {
            C3424Ke.d(this, i);
        }
    }

    @Override // java.util.Collection, java.util.Set
    public final <T> T[] toArray(T[] tArr) {
        C6562gT0.p(tArr, "array");
        T[] tArr2 = (T[]) C3326Je.a(tArr, this.Z);
        C4788Ye.B0(this.Y, tArr2, 0, 0, this.Z);
        C6562gT0.o(tArr2, "result");
        return tArr2;
    }

    public /* synthetic */ C3228Ie(int i, int i2, C9516sY c9516sY) {
        this((i2 & 1) != 0 ? 0 : i);
    }

    public C3228Ie(C3228Ie<? extends E> c3228Ie) {
        this(0);
        if (c3228Ie != null) {
            d(c3228Ie);
        }
    }

    public C3228Ie(Collection<? extends E> collection) {
        this(0);
        if (collection != null) {
            addAll(collection);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C3228Ie(E[] eArr) {
        this(0);
        if (eArr != null) {
            Iterator a2 = C9046qe.a(eArr);
            while (a2.hasNext()) {
                add(a2.next());
            }
        }
    }
}
