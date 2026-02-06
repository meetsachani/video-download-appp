package androidx.recyclerview.widget;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import o.C6376fm;
import o.InterfaceC6439g11;

/* loaded from: classes.dex */
public class z<T> {
    public static final int j = -1;
    public static final int k = 10;
    public static final int l = 10;
    public static final int m = 1;
    public static final int n = 2;

    /* renamed from: o  reason: collision with root package name */
    public static final int f62o = 4;
    public T[] a;
    public T[] b;
    public int c;
    public int d;
    public int e;
    public b f;
    public a g;
    public int h;
    public final Class<T> i;

    /* loaded from: classes.dex */
    public static class a<T2> extends b<T2> {
        public final b<T2> X;
        public final C6376fm Y;

        public a(b<T2> bVar) {
            this.X = bVar;
            this.Y = new C6376fm(bVar);
        }

        @Override // o.InterfaceC6439g11
        public void a(int i, int i2) {
            this.Y.a(i, i2);
        }

        @Override // o.InterfaceC6439g11
        public void b(int i, int i2) {
            this.Y.b(i, i2);
        }

        @Override // androidx.recyclerview.widget.z.b, o.InterfaceC6439g11
        public void c(int i, int i2, Object obj) {
            this.Y.c(i, i2, obj);
        }

        @Override // androidx.recyclerview.widget.z.b, java.util.Comparator
        public int compare(T2 t2, T2 t22) {
            return this.X.compare(t2, t22);
        }

        @Override // o.InterfaceC6439g11
        public void d(int i, int i2) {
            this.Y.d(i, i2);
        }

        @Override // androidx.recyclerview.widget.z.b
        public boolean e(T2 t2, T2 t22) {
            return this.X.e(t2, t22);
        }

        @Override // androidx.recyclerview.widget.z.b
        public boolean f(T2 t2, T2 t22) {
            return this.X.f(t2, t22);
        }

        @Override // androidx.recyclerview.widget.z.b
        public Object g(T2 t2, T2 t22) {
            return this.X.g(t2, t22);
        }

        @Override // androidx.recyclerview.widget.z.b
        public void h(int i, int i2) {
            this.Y.c(i, i2, null);
        }

        public void i() {
            this.Y.e();
        }
    }

    /* loaded from: classes.dex */
    public static abstract class b<T2> implements Comparator<T2>, InterfaceC6439g11 {
        public void c(int i, int i2, Object obj) {
            h(i, i2);
        }

        @Override // java.util.Comparator
        public abstract int compare(T2 t2, T2 t22);

        public abstract boolean e(T2 t2, T2 t22);

        public abstract boolean f(T2 t2, T2 t22);

        public Object g(T2 t2, T2 t22) {
            return null;
        }

        public abstract void h(int i, int i2);
    }

    public z(Class<T> cls, b<T> bVar) {
        this(cls, bVar, 10);
    }

    public final void A(T[] tArr) {
        boolean z = this.f instanceof a;
        if (!z) {
            h();
        }
        this.c = 0;
        this.d = this.h;
        this.b = this.a;
        this.e = 0;
        int D = D(tArr);
        this.a = (T[]) ((Object[]) Array.newInstance((Class<?>) this.i, D));
        while (true) {
            int i = this.e;
            if (i >= D && this.c >= this.d) {
                break;
            }
            int i2 = this.c;
            int i3 = this.d;
            if (i2 >= i3) {
                int i4 = D - i;
                System.arraycopy(tArr, i, this.a, i, i4);
                this.e += i4;
                this.h += i4;
                this.f.a(i, i4);
                break;
            } else if (i >= D) {
                int i5 = i3 - i2;
                this.h -= i5;
                this.f.b(i, i5);
                break;
            } else {
                T t = this.b[i2];
                T t2 = tArr[i];
                int compare = this.f.compare(t, t2);
                if (compare < 0) {
                    B();
                } else if (compare > 0) {
                    z(t2);
                } else if (!this.f.f(t, t2)) {
                    B();
                    z(t2);
                } else {
                    T[] tArr2 = this.a;
                    int i6 = this.e;
                    tArr2[i6] = t2;
                    this.c++;
                    this.e = i6 + 1;
                    if (!this.f.e(t, t2)) {
                        b bVar = this.f;
                        bVar.c(this.e - 1, 1, bVar.g(t, t2));
                    }
                }
            }
        }
        this.b = null;
        if (!z) {
            k();
        }
    }

    public final void B() {
        this.h--;
        this.c++;
        this.f.b(this.e, 1);
    }

    public int C() {
        return this.h;
    }

    public final int D(T[] tArr) {
        if (tArr.length == 0) {
            return 0;
        }
        Arrays.sort(tArr, this.f);
        int i = 0;
        int i2 = 1;
        for (int i3 = 1; i3 < tArr.length; i3++) {
            T t = tArr[i3];
            if (this.f.compare(tArr[i], t) == 0) {
                int m2 = m(t, tArr, i, i2);
                if (m2 != -1) {
                    tArr[m2] = t;
                } else {
                    if (i2 != i3) {
                        tArr[i2] = t;
                    }
                    i2++;
                }
            } else {
                if (i2 != i3) {
                    tArr[i2] = t;
                }
                i = i2;
                i2++;
            }
        }
        return i2;
    }

    public final void E() {
        if (this.b == null) {
            return;
        }
        throw new IllegalStateException("Data cannot be mutated in the middle of a batch update operation such as addAll or replaceAll.");
    }

    public void F(int i, T t) {
        boolean z;
        E();
        T n2 = n(i);
        if (n2 != t && this.f.e(n2, t)) {
            z = false;
        } else {
            z = true;
        }
        if (n2 != t && this.f.compare(n2, t) == 0) {
            this.a[i] = t;
            if (z) {
                b bVar = this.f;
                bVar.c(i, 1, bVar.g(n2, t));
                return;
            }
            return;
        }
        if (z) {
            b bVar2 = this.f;
            bVar2.c(i, 1, bVar2.g(n2, t));
        }
        v(i, false);
        int b2 = b(t, false);
        if (i != b2) {
            this.f.d(i, b2);
        }
    }

    public int a(T t) {
        E();
        return b(t, true);
    }

    public final int b(T t, boolean z) {
        int l2 = l(t, this.a, 0, this.h, 1);
        if (l2 == -1) {
            l2 = 0;
        } else if (l2 < this.h) {
            T t2 = this.a[l2];
            if (this.f.f(t2, t)) {
                if (this.f.e(t2, t)) {
                    this.a[l2] = t;
                    return l2;
                }
                this.a[l2] = t;
                b bVar = this.f;
                bVar.c(l2, 1, bVar.g(t2, t));
                return l2;
            }
        }
        g(l2, t);
        if (z) {
            this.f.a(l2, 1);
        }
        return l2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void c(Collection<T> collection) {
        e(collection.toArray((Object[]) Array.newInstance((Class<?>) this.i, collection.size())), true);
    }

    public void d(T... tArr) {
        e(tArr, false);
    }

    public void e(T[] tArr, boolean z) {
        E();
        if (tArr.length == 0) {
            return;
        }
        if (z) {
            f(tArr);
        } else {
            f(j(tArr));
        }
    }

    public final void f(T[] tArr) {
        if (tArr.length < 1) {
            return;
        }
        int D = D(tArr);
        if (this.h == 0) {
            this.a = tArr;
            this.h = D;
            this.f.a(0, D);
            return;
        }
        q(tArr, D);
    }

    public final void g(int i, T t) {
        int i2 = this.h;
        if (i <= i2) {
            T[] tArr = this.a;
            if (i2 == tArr.length) {
                T[] tArr2 = (T[]) ((Object[]) Array.newInstance((Class<?>) this.i, tArr.length + 10));
                System.arraycopy(this.a, 0, tArr2, 0, i);
                tArr2[i] = t;
                System.arraycopy(this.a, i, tArr2, i + 1, this.h - i);
                this.a = tArr2;
            } else {
                System.arraycopy(tArr, i, tArr, i + 1, i2 - i);
                this.a[i] = t;
            }
            this.h++;
            return;
        }
        throw new IndexOutOfBoundsException("cannot add item to " + i + " because size is " + this.h);
    }

    public void h() {
        E();
        b bVar = this.f;
        if (bVar instanceof a) {
            return;
        }
        if (this.g == null) {
            this.g = new a(bVar);
        }
        this.f = this.g;
    }

    public void i() {
        E();
        int i = this.h;
        if (i == 0) {
            return;
        }
        Arrays.fill(this.a, 0, i, (Object) null);
        this.h = 0;
        this.f.b(0, i);
    }

    public final T[] j(T[] tArr) {
        T[] tArr2 = (T[]) ((Object[]) Array.newInstance((Class<?>) this.i, tArr.length));
        System.arraycopy(tArr, 0, tArr2, 0, tArr.length);
        return tArr2;
    }

    public void k() {
        E();
        b bVar = this.f;
        if (bVar instanceof a) {
            ((a) bVar).i();
        }
        b bVar2 = this.f;
        a aVar = this.g;
        if (bVar2 == aVar) {
            this.f = aVar.X;
        }
    }

    public final int l(T t, T[] tArr, int i, int i2, int i3) {
        while (i < i2) {
            int i4 = (i + i2) / 2;
            T t2 = tArr[i4];
            int compare = this.f.compare(t2, t);
            if (compare < 0) {
                i = i4 + 1;
            } else if (compare == 0) {
                if (!this.f.f(t2, t)) {
                    int p = p(t, i4, i, i2);
                    if (i3 != 1 || p != -1) {
                        return p;
                    }
                }
                return i4;
            } else {
                i2 = i4;
            }
        }
        if (i3 != 1) {
            return -1;
        }
        return i;
    }

    public final int m(T t, T[] tArr, int i, int i2) {
        while (i < i2) {
            if (this.f.f(tArr[i], t)) {
                return i;
            }
            i++;
        }
        return -1;
    }

    public T n(int i) throws IndexOutOfBoundsException {
        int i2;
        if (i < this.h && i >= 0) {
            T[] tArr = this.b;
            if (tArr != null && i >= (i2 = this.e)) {
                return tArr[(i - i2) + this.c];
            }
            return this.a[i];
        }
        throw new IndexOutOfBoundsException("Asked to get item at " + i + " but size is " + this.h);
    }

    public int o(T t) {
        if (this.b != null) {
            int l2 = l(t, this.a, 0, this.e, 4);
            if (l2 != -1) {
                return l2;
            }
            int l3 = l(t, this.b, this.c, this.d, 4);
            if (l3 == -1) {
                return -1;
            }
            return (l3 - this.c) + this.e;
        }
        return l(t, this.a, 0, this.h, 4);
    }

    public final int p(T t, int i, int i2, int i3) {
        T t2;
        for (int i4 = i - 1; i4 >= i2; i4--) {
            T t3 = this.a[i4];
            if (this.f.compare(t3, t) != 0) {
                break;
            } else if (this.f.f(t3, t)) {
                return i4;
            }
        }
        do {
            i++;
            if (i < i3) {
                t2 = this.a[i];
                if (this.f.compare(t2, t) != 0) {
                    return -1;
                }
            } else {
                return -1;
            }
        } while (!this.f.f(t2, t));
        return i;
    }

    public final void q(T[] tArr, int i) {
        boolean z = this.f instanceof a;
        if (!z) {
            h();
        }
        this.b = this.a;
        int i2 = 0;
        this.c = 0;
        int i3 = this.h;
        this.d = i3;
        this.a = (T[]) ((Object[]) Array.newInstance((Class<?>) this.i, i3 + i + 10));
        this.e = 0;
        while (true) {
            int i4 = this.c;
            int i5 = this.d;
            if (i4 >= i5 && i2 >= i) {
                break;
            } else if (i4 == i5) {
                int i6 = i - i2;
                System.arraycopy(tArr, i2, this.a, this.e, i6);
                int i7 = this.e + i6;
                this.e = i7;
                this.h += i6;
                this.f.a(i7 - i6, i6);
                break;
            } else if (i2 == i) {
                int i8 = i5 - i4;
                System.arraycopy(this.b, i4, this.a, this.e, i8);
                this.e += i8;
                break;
            } else {
                T t = this.b[i4];
                T t2 = tArr[i2];
                int compare = this.f.compare(t, t2);
                if (compare > 0) {
                    T[] tArr2 = this.a;
                    int i9 = this.e;
                    this.e = i9 + 1;
                    tArr2[i9] = t2;
                    this.h++;
                    i2++;
                    this.f.a(i9, 1);
                } else if (compare == 0 && this.f.f(t, t2)) {
                    T[] tArr3 = this.a;
                    int i10 = this.e;
                    this.e = i10 + 1;
                    tArr3[i10] = t2;
                    i2++;
                    this.c++;
                    if (!this.f.e(t, t2)) {
                        b bVar = this.f;
                        bVar.c(this.e - 1, 1, bVar.g(t, t2));
                    }
                } else {
                    T[] tArr4 = this.a;
                    int i11 = this.e;
                    this.e = i11 + 1;
                    tArr4[i11] = t;
                    this.c++;
                }
            }
        }
        this.b = null;
        if (!z) {
            k();
        }
    }

    public void r(int i) {
        E();
        T n2 = n(i);
        v(i, false);
        int b2 = b(n2, false);
        if (i != b2) {
            this.f.d(i, b2);
        }
    }

    public boolean s(T t) {
        E();
        return t(t, true);
    }

    public final boolean t(T t, boolean z) {
        int l2 = l(t, this.a, 0, this.h, 2);
        if (l2 == -1) {
            return false;
        }
        v(l2, z);
        return true;
    }

    public T u(int i) {
        E();
        T n2 = n(i);
        v(i, true);
        return n2;
    }

    public final void v(int i, boolean z) {
        T[] tArr = this.a;
        System.arraycopy(tArr, i + 1, tArr, i, (this.h - i) - 1);
        int i2 = this.h - 1;
        this.h = i2;
        this.a[i2] = null;
        if (z) {
            this.f.b(i, 1);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void w(Collection<T> collection) {
        y(collection.toArray((Object[]) Array.newInstance((Class<?>) this.i, collection.size())), true);
    }

    public void x(T... tArr) {
        y(tArr, false);
    }

    public void y(T[] tArr, boolean z) {
        E();
        if (z) {
            A(tArr);
        } else {
            A(j(tArr));
        }
    }

    public final void z(T t) {
        T[] tArr = this.a;
        int i = this.e;
        tArr[i] = t;
        this.e = i + 1;
        this.h++;
        this.f.a(i, 1);
    }

    public z(Class<T> cls, b<T> bVar, int i) {
        this.i = cls;
        this.a = (T[]) ((Object[]) Array.newInstance((Class<?>) cls, i));
        this.f = bVar;
        this.h = 0;
    }
}
