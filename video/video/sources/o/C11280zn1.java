package o;

import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

/* renamed from: o.zn1  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C11280zn1<E> extends AbstractC8135mt1<E> {
    public b<E> c;

    /* renamed from: o.zn1$a */
    /* loaded from: classes.dex */
    public static final class a<T> implements ListIterator<T>, LW0 {
        public final List<T> X;
        public int Y;

        public a(List<T> list, int i) {
            C6562gT0.p(list, "list");
            this.X = list;
            this.Y = i - 1;
        }

        @Override // java.util.ListIterator
        public void add(T t) {
            List<T> list = this.X;
            int i = this.Y + 1;
            this.Y = i;
            list.add(i, t);
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public boolean hasNext() {
            if (this.Y < this.X.size() - 1) {
                return true;
            }
            return false;
        }

        @Override // java.util.ListIterator
        public boolean hasPrevious() {
            if (this.Y >= 0) {
                return true;
            }
            return false;
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public T next() {
            List<T> list = this.X;
            int i = this.Y + 1;
            this.Y = i;
            return list.get(i);
        }

        @Override // java.util.ListIterator
        public int nextIndex() {
            return this.Y + 1;
        }

        @Override // java.util.ListIterator
        public T previous() {
            List<T> list = this.X;
            int i = this.Y;
            this.Y = i - 1;
            return list.get(i);
        }

        @Override // java.util.ListIterator
        public int previousIndex() {
            return this.Y;
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public void remove() {
            this.X.remove(this.Y);
            this.Y--;
        }

        @Override // java.util.ListIterator
        public void set(T t) {
            this.X.set(this.Y, t);
        }
    }

    /* renamed from: o.zn1$b */
    /* loaded from: classes.dex */
    public static final class b<T> implements List<T>, KW0 {
        public final C11280zn1<T> X;

        public b(C11280zn1<T> c11280zn1) {
            C6562gT0.p(c11280zn1, "objectList");
            this.X = c11280zn1;
        }

        @Override // java.util.List, java.util.Collection
        public boolean add(T t) {
            return this.X.Z(t);
        }

        @Override // java.util.List
        public boolean addAll(int i, Collection<? extends T> collection) {
            C6562gT0.p(collection, "elements");
            return this.X.a0(i, collection);
        }

        @Override // java.util.List, java.util.Collection
        public void clear() {
            this.X.k0();
        }

        @Override // java.util.List, java.util.Collection
        public boolean contains(Object obj) {
            return this.X.d(obj);
        }

        @Override // java.util.List, java.util.Collection
        public boolean containsAll(Collection<? extends Object> collection) {
            C6562gT0.p(collection, "elements");
            return this.X.e(collection);
        }

        public int d() {
            return this.X.C();
        }

        public T e(int i) {
            C8378nt1.d(this, i);
            return this.X.I0(i);
        }

        @Override // java.util.List
        public T get(int i) {
            C8378nt1.d(this, i);
            return this.X.y(i);
        }

        @Override // java.util.List
        public int indexOf(Object obj) {
            return this.X.E(obj);
        }

        @Override // java.util.List, java.util.Collection
        public boolean isEmpty() {
            return this.X.H();
        }

        @Override // java.util.List, java.util.Collection, java.lang.Iterable
        public Iterator<T> iterator() {
            return new a(this, 0);
        }

        @Override // java.util.List
        public int lastIndexOf(Object obj) {
            return this.X.T(obj);
        }

        @Override // java.util.List
        public ListIterator<T> listIterator() {
            return new a(this, 0);
        }

        @Override // java.util.List
        public final /* bridge */ T remove(int i) {
            return e(i);
        }

        @Override // java.util.List, java.util.Collection
        public boolean removeAll(Collection<? extends Object> collection) {
            C6562gT0.p(collection, "elements");
            return this.X.C0(collection);
        }

        @Override // java.util.List, java.util.Collection
        public boolean retainAll(Collection<? extends Object> collection) {
            C6562gT0.p(collection, "elements");
            return this.X.M0(collection);
        }

        @Override // java.util.List
        public T set(int i, T t) {
            C8378nt1.d(this, i);
            return this.X.Q0(i, t);
        }

        @Override // java.util.List, java.util.Collection
        public final /* bridge */ int size() {
            return d();
        }

        @Override // java.util.List
        public List<T> subList(int i, int i2) {
            C8378nt1.e(this, i, i2);
            return new c(this, i, i2);
        }

        @Override // java.util.List, java.util.Collection
        public Object[] toArray() {
            return C6250fF.a(this);
        }

        @Override // java.util.List
        public void add(int i, T t) {
            this.X.Y(i, t);
        }

        @Override // java.util.List, java.util.Collection
        public boolean addAll(Collection<? extends T> collection) {
            C6562gT0.p(collection, "elements");
            return this.X.d0(collection);
        }

        @Override // java.util.List
        public ListIterator<T> listIterator(int i) {
            return new a(this, i);
        }

        @Override // java.util.List, java.util.Collection
        public boolean remove(Object obj) {
            return this.X.B0(obj);
        }

        @Override // java.util.List, java.util.Collection
        public <T> T[] toArray(T[] tArr) {
            C6562gT0.p(tArr, "array");
            return (T[]) C6250fF.b(this, tArr);
        }
    }

    /* renamed from: o.zn1$c */
    /* loaded from: classes.dex */
    public static final class c<T> implements List<T>, KW0 {
        public final List<T> X;
        public final int Y;
        public int Z;

        public c(List<T> list, int i, int i2) {
            C6562gT0.p(list, "list");
            this.X = list;
            this.Y = i;
            this.Z = i2;
        }

        @Override // java.util.List, java.util.Collection
        public boolean add(T t) {
            List<T> list = this.X;
            int i = this.Z;
            this.Z = i + 1;
            list.add(i, t);
            return true;
        }

        @Override // java.util.List
        public boolean addAll(int i, Collection<? extends T> collection) {
            C6562gT0.p(collection, "elements");
            this.X.addAll(i + this.Y, collection);
            this.Z += collection.size();
            return collection.size() > 0;
        }

        @Override // java.util.List, java.util.Collection
        public void clear() {
            int i = this.Z - 1;
            int i2 = this.Y;
            if (i2 <= i) {
                while (true) {
                    this.X.remove(i);
                    if (i == i2) {
                        break;
                    }
                    i--;
                }
            }
            this.Z = this.Y;
        }

        @Override // java.util.List, java.util.Collection
        public boolean contains(Object obj) {
            int i = this.Z;
            for (int i2 = this.Y; i2 < i; i2++) {
                if (C6562gT0.g(this.X.get(i2), obj)) {
                    return true;
                }
            }
            return false;
        }

        @Override // java.util.List, java.util.Collection
        public boolean containsAll(Collection<? extends Object> collection) {
            C6562gT0.p(collection, "elements");
            Iterator<T> it = collection.iterator();
            while (it.hasNext()) {
                if (!contains(it.next())) {
                    return false;
                }
            }
            return true;
        }

        public int d() {
            return this.Z - this.Y;
        }

        public T e(int i) {
            C8378nt1.d(this, i);
            this.Z--;
            return this.X.remove(i + this.Y);
        }

        @Override // java.util.List
        public T get(int i) {
            C8378nt1.d(this, i);
            return this.X.get(i + this.Y);
        }

        @Override // java.util.List
        public int indexOf(Object obj) {
            int i = this.Z;
            for (int i2 = this.Y; i2 < i; i2++) {
                if (C6562gT0.g(this.X.get(i2), obj)) {
                    return i2 - this.Y;
                }
            }
            return -1;
        }

        @Override // java.util.List, java.util.Collection
        public boolean isEmpty() {
            if (this.Z == this.Y) {
                return true;
            }
            return false;
        }

        @Override // java.util.List, java.util.Collection, java.lang.Iterable
        public Iterator<T> iterator() {
            return new a(this, 0);
        }

        @Override // java.util.List
        public int lastIndexOf(Object obj) {
            int i = this.Z - 1;
            int i2 = this.Y;
            if (i2 <= i) {
                while (!C6562gT0.g(this.X.get(i), obj)) {
                    if (i != i2) {
                        i--;
                    } else {
                        return -1;
                    }
                }
                return i - this.Y;
            }
            return -1;
        }

        @Override // java.util.List
        public ListIterator<T> listIterator() {
            return new a(this, 0);
        }

        @Override // java.util.List
        public final /* bridge */ T remove(int i) {
            return e(i);
        }

        @Override // java.util.List, java.util.Collection
        public boolean removeAll(Collection<? extends Object> collection) {
            C6562gT0.p(collection, "elements");
            int i = this.Z;
            Iterator<T> it = collection.iterator();
            while (it.hasNext()) {
                remove(it.next());
            }
            if (i != this.Z) {
                return true;
            }
            return false;
        }

        @Override // java.util.List, java.util.Collection
        public boolean retainAll(Collection<? extends Object> collection) {
            C6562gT0.p(collection, "elements");
            int i = this.Z;
            int i2 = i - 1;
            int i3 = this.Y;
            if (i3 <= i2) {
                while (true) {
                    if (!collection.contains(this.X.get(i2))) {
                        this.X.remove(i2);
                        this.Z--;
                    }
                    if (i2 == i3) {
                        break;
                    }
                    i2--;
                }
            }
            if (i != this.Z) {
                return true;
            }
            return false;
        }

        @Override // java.util.List
        public T set(int i, T t) {
            C8378nt1.d(this, i);
            return this.X.set(i + this.Y, t);
        }

        @Override // java.util.List, java.util.Collection
        public final /* bridge */ int size() {
            return d();
        }

        @Override // java.util.List
        public List<T> subList(int i, int i2) {
            C8378nt1.e(this, i, i2);
            return new c(this, i, i2);
        }

        @Override // java.util.List, java.util.Collection
        public Object[] toArray() {
            return C6250fF.a(this);
        }

        @Override // java.util.List
        public void add(int i, T t) {
            this.X.add(i + this.Y, t);
            this.Z++;
        }

        @Override // java.util.List
        public ListIterator<T> listIterator(int i) {
            return new a(this, i);
        }

        @Override // java.util.List, java.util.Collection
        public boolean remove(Object obj) {
            int i = this.Z;
            for (int i2 = this.Y; i2 < i; i2++) {
                if (C6562gT0.g(this.X.get(i2), obj)) {
                    this.X.remove(i2);
                    this.Z--;
                    return true;
                }
            }
            return false;
        }

        @Override // java.util.List, java.util.Collection
        public <T> T[] toArray(T[] tArr) {
            C6562gT0.p(tArr, "array");
            return (T[]) C6250fF.b(this, tArr);
        }

        @Override // java.util.List, java.util.Collection
        public boolean addAll(Collection<? extends T> collection) {
            C6562gT0.p(collection, "elements");
            this.X.addAll(this.Z, collection);
            this.Z += collection.size();
            return collection.size() > 0;
        }
    }

    public C11280zn1() {
        this(0, 1, null);
    }

    public static /* synthetic */ void S0(C11280zn1 c11280zn1, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = c11280zn1.b;
        }
        c11280zn1.R0(i);
    }

    public final void A0(E[] eArr) {
        C6562gT0.p(eArr, "elements");
        if (eArr.length == 0) {
            return;
        }
        l0(this.b + eArr.length);
        C4788Ye.K0(eArr, this.a, this.b, 0, 0, 12, null);
        this.b += eArr.length;
    }

    public final boolean B0(E e) {
        int E = E(e);
        if (E >= 0) {
            I0(E);
            return true;
        }
        return false;
    }

    public final boolean C0(Iterable<? extends E> iterable) {
        C6562gT0.p(iterable, "elements");
        int i = this.b;
        n0(iterable);
        if (i != this.b) {
            return true;
        }
        return false;
    }

    public final boolean D0(List<? extends E> list) {
        C6562gT0.p(list, "elements");
        int i = this.b;
        p0(list);
        if (i != this.b) {
            return true;
        }
        return false;
    }

    public final boolean E0(AbstractC8135mt1<E> abstractC8135mt1) {
        C6562gT0.p(abstractC8135mt1, "elements");
        int i = this.b;
        q0(abstractC8135mt1);
        if (i != this.b) {
            return true;
        }
        return false;
    }

    public final boolean F0(ZX1<E> zx1) {
        C6562gT0.p(zx1, "elements");
        int i = this.b;
        r0(zx1);
        if (i != this.b) {
            return true;
        }
        return false;
    }

    public final boolean G0(B02<? extends E> b02) {
        C6562gT0.p(b02, "elements");
        int i = this.b;
        s0(b02);
        if (i != this.b) {
            return true;
        }
        return false;
    }

    public final boolean H0(E[] eArr) {
        C6562gT0.p(eArr, "elements");
        int i = this.b;
        for (E e : eArr) {
            B0(e);
        }
        if (i == this.b) {
            return false;
        }
        return true;
    }

    public final E I0(int i) {
        int i2;
        if (i >= 0 && i < (i2 = this.b)) {
            Object[] objArr = this.a;
            E e = (E) objArr[i];
            if (i != i2 - 1) {
                C4788Ye.B0(objArr, objArr, i, i + 1, i2);
            }
            int i3 = this.b - 1;
            this.b = i3;
            objArr[i3] = null;
            return e;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Index ");
        sb.append(i);
        sb.append(" must be in 0..");
        sb.append(this.b - 1);
        throw new IndexOutOfBoundsException(sb.toString());
    }

    public final void J0(HA0<? super E, Boolean> ha0) {
        C6562gT0.p(ha0, "predicate");
        int i = this.b;
        Object[] objArr = this.a;
        int i2 = 0;
        C11197zR0 W1 = C5075aO1.W1(0, i);
        int j = W1.j();
        int k = W1.k();
        if (j <= k) {
            while (true) {
                objArr[j - i2] = objArr[j];
                if (ha0.invoke(objArr[j]).booleanValue()) {
                    i2++;
                }
                if (j == k) {
                    break;
                }
                j++;
            }
        }
        C4788Ye.M1(objArr, null, i - i2, i);
        this.b -= i2;
    }

    public final void K0(int i, int i2) {
        int i3;
        if (i >= 0 && i <= (i3 = this.b) && i2 >= 0 && i2 <= i3) {
            if (i2 >= i) {
                if (i2 != i) {
                    if (i2 < i3) {
                        Object[] objArr = this.a;
                        C4788Ye.B0(objArr, objArr, i, i2, i3);
                    }
                    int i4 = this.b;
                    int i5 = i4 - (i2 - i);
                    C4788Ye.M1(this.a, null, i5, i4);
                    this.b = i5;
                    return;
                }
                return;
            }
            throw new IllegalArgumentException("Start (" + i + ") is more than end (" + i2 + ')');
        }
        throw new IndexOutOfBoundsException("Start (" + i + ") and end (" + i2 + ") must be in 0.." + this.b);
    }

    public final boolean L0(Iterable<? extends E> iterable) {
        C6562gT0.p(iterable, "elements");
        int i = this.b;
        Object[] objArr = this.a;
        for (int i2 = i - 1; -1 < i2; i2--) {
            if (!C10662xF.Y1(iterable, objArr[i2])) {
                I0(i2);
            }
        }
        if (i != this.b) {
            return true;
        }
        return false;
    }

    public final boolean M0(Collection<? extends E> collection) {
        C6562gT0.p(collection, "elements");
        int i = this.b;
        Object[] objArr = this.a;
        for (int i2 = i - 1; -1 < i2; i2--) {
            if (!collection.contains(objArr[i2])) {
                I0(i2);
            }
        }
        if (i != this.b) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean N0(AbstractC8135mt1<E> abstractC8135mt1) {
        C6562gT0.p(abstractC8135mt1, "elements");
        int i = this.b;
        Object[] objArr = this.a;
        for (int i2 = i - 1; -1 < i2; i2--) {
            if (!abstractC8135mt1.d(objArr[i2])) {
                I0(i2);
            }
        }
        if (i != this.b) {
            return true;
        }
        return false;
    }

    public final boolean O0(B02<? extends E> b02) {
        C6562gT0.p(b02, "elements");
        int i = this.b;
        Object[] objArr = this.a;
        for (int i2 = i - 1; -1 < i2; i2--) {
            if (!C6695h12.B0(b02, objArr[i2])) {
                I0(i2);
            }
        }
        if (i != this.b) {
            return true;
        }
        return false;
    }

    public final boolean P0(E[] eArr) {
        C6562gT0.p(eArr, "elements");
        int i = this.b;
        Object[] objArr = this.a;
        for (int i2 = i - 1; -1 < i2; i2--) {
            if (C7330jf.Sf(eArr, objArr[i2]) < 0) {
                I0(i2);
            }
        }
        if (i != this.b) {
            return true;
        }
        return false;
    }

    public final E Q0(int i, E e) {
        if (i >= 0 && i < this.b) {
            Object[] objArr = this.a;
            E e2 = (E) objArr[i];
            objArr[i] = e;
            return e2;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("set index ");
        sb.append(i);
        sb.append(" must be between 0 .. ");
        sb.append(this.b - 1);
        throw new IndexOutOfBoundsException(sb.toString());
    }

    public final void R0(int i) {
        int max = Math.max(i, this.b);
        Object[] objArr = this.a;
        if (objArr.length > max) {
            Object[] copyOf = Arrays.copyOf(objArr, max);
            C6562gT0.o(copyOf, "copyOf(this, newSize)");
            this.a = copyOf;
        }
    }

    public final void Y(int i, E e) {
        int i2;
        if (i >= 0 && i <= (i2 = this.b)) {
            l0(i2 + 1);
            Object[] objArr = this.a;
            int i3 = this.b;
            if (i != i3) {
                C4788Ye.B0(objArr, objArr, i + 1, i, i3);
            }
            objArr[i] = e;
            this.b++;
            return;
        }
        throw new IndexOutOfBoundsException("Index " + i + " must be in 0.." + this.b);
    }

    public final boolean Z(E e) {
        l0(this.b + 1);
        Object[] objArr = this.a;
        int i = this.b;
        objArr[i] = e;
        this.b = i + 1;
        return true;
    }

    public final boolean a0(int i, Collection<? extends E> collection) {
        C6562gT0.p(collection, "elements");
        if (i >= 0 && i <= this.b) {
            int i2 = 0;
            if (collection.isEmpty()) {
                return false;
            }
            l0(this.b + collection.size());
            Object[] objArr = this.a;
            if (i != this.b) {
                C4788Ye.B0(objArr, objArr, collection.size() + i, i, this.b);
            }
            for (Object obj : collection) {
                int i3 = i2 + 1;
                if (i2 < 0) {
                    C8222nF.Z();
                }
                objArr[i2 + i] = obj;
                i2 = i3;
            }
            this.b += collection.size();
            return true;
        }
        throw new IndexOutOfBoundsException("Index " + i + " must be in 0.." + this.b);
    }

    public final boolean b0(int i, AbstractC8135mt1<E> abstractC8135mt1) {
        C6562gT0.p(abstractC8135mt1, "elements");
        if (i >= 0 && i <= this.b) {
            if (abstractC8135mt1.H()) {
                return false;
            }
            l0(this.b + abstractC8135mt1.b);
            Object[] objArr = this.a;
            int i2 = this.b;
            if (i != i2) {
                C4788Ye.B0(objArr, objArr, abstractC8135mt1.b + i, i, i2);
            }
            C4788Ye.B0(abstractC8135mt1.a, objArr, i, 0, abstractC8135mt1.b);
            this.b += abstractC8135mt1.b;
            return true;
        }
        throw new IndexOutOfBoundsException("Index " + i + " must be in 0.." + this.b);
    }

    @Override // o.AbstractC8135mt1
    public List<E> c() {
        return j0();
    }

    public final boolean c0(int i, E[] eArr) {
        int i2;
        C6562gT0.p(eArr, "elements");
        if (i >= 0 && i <= (i2 = this.b)) {
            if (eArr.length == 0) {
                return false;
            }
            l0(i2 + eArr.length);
            Object[] objArr = this.a;
            int i3 = this.b;
            if (i != i3) {
                C4788Ye.B0(objArr, objArr, eArr.length + i, i, i3);
            }
            C4788Ye.K0(eArr, objArr, i, 0, 0, 12, null);
            this.b += eArr.length;
            return true;
        }
        throw new IndexOutOfBoundsException("Index " + i + " must be in 0.." + this.b);
    }

    public final boolean d0(Iterable<? extends E> iterable) {
        C6562gT0.p(iterable, "elements");
        int i = this.b;
        u0(iterable);
        if (i != this.b) {
            return true;
        }
        return false;
    }

    public final boolean e0(List<? extends E> list) {
        C6562gT0.p(list, "elements");
        int i = this.b;
        w0(list);
        if (i != this.b) {
            return true;
        }
        return false;
    }

    public final boolean f0(AbstractC8135mt1<E> abstractC8135mt1) {
        C6562gT0.p(abstractC8135mt1, "elements");
        int i = this.b;
        x0(abstractC8135mt1);
        if (i != this.b) {
            return true;
        }
        return false;
    }

    public final boolean g0(ZX1<E> zx1) {
        C6562gT0.p(zx1, "elements");
        int i = this.b;
        y0(zx1);
        if (i != this.b) {
            return true;
        }
        return false;
    }

    public final boolean h0(B02<? extends E> b02) {
        C6562gT0.p(b02, "elements");
        int i = this.b;
        z0(b02);
        if (i != this.b) {
            return true;
        }
        return false;
    }

    public final boolean i0(E[] eArr) {
        C6562gT0.p(eArr, "elements");
        int i = this.b;
        A0(eArr);
        if (i != this.b) {
            return true;
        }
        return false;
    }

    public final List<E> j0() {
        b<E> bVar = this.c;
        if (bVar != null) {
            return bVar;
        }
        b<E> bVar2 = new b<>(this);
        this.c = bVar2;
        return bVar2;
    }

    public final void k0() {
        C4788Ye.M1(this.a, null, 0, this.b);
        this.b = 0;
    }

    public final void l0(int i) {
        Object[] objArr = this.a;
        if (objArr.length < i) {
            Object[] copyOf = Arrays.copyOf(objArr, Math.max(i, (objArr.length * 3) / 2));
            C6562gT0.o(copyOf, "copyOf(this, newSize)");
            this.a = copyOf;
        }
    }

    public final int m0() {
        return this.a.length;
    }

    public final void n0(Iterable<? extends E> iterable) {
        C6562gT0.p(iterable, "elements");
        for (E e : iterable) {
            B0(e);
        }
    }

    public final void o0(E e) {
        B0(e);
    }

    public final void p0(List<? extends E> list) {
        C6562gT0.p(list, "elements");
        int size = list.size();
        for (int i = 0; i < size; i++) {
            B0(list.get(i));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void q0(AbstractC8135mt1<E> abstractC8135mt1) {
        C6562gT0.p(abstractC8135mt1, "elements");
        Object[] objArr = abstractC8135mt1.a;
        int i = abstractC8135mt1.b;
        for (int i2 = 0; i2 < i; i2++) {
            B0(objArr[i2]);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void r0(ZX1<E> zx1) {
        C6562gT0.p(zx1, "elements");
        Object[] objArr = zx1.b;
        long[] jArr = zx1.a;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i = 0;
            while (true) {
                long j = jArr[i];
                if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i2 = 8 - ((~(i - length)) >>> 31);
                    for (int i3 = 0; i3 < i2; i3++) {
                        if ((255 & j) < 128) {
                            B0(objArr[(i << 3) + i3]);
                        }
                        j >>= 8;
                    }
                    if (i2 != 8) {
                        return;
                    }
                }
                if (i != length) {
                    i++;
                } else {
                    return;
                }
            }
        }
    }

    public final void s0(B02<? extends E> b02) {
        C6562gT0.p(b02, "elements");
        for (E e : b02) {
            B0(e);
        }
    }

    public final void t0(E[] eArr) {
        C6562gT0.p(eArr, "elements");
        for (E e : eArr) {
            B0(e);
        }
    }

    public final void u0(Iterable<? extends E> iterable) {
        C6562gT0.p(iterable, "elements");
        for (E e : iterable) {
            Z(e);
        }
    }

    public final void v0(E e) {
        Z(e);
    }

    public final void w0(List<? extends E> list) {
        C6562gT0.p(list, "elements");
        if (list.isEmpty()) {
            return;
        }
        int i = this.b;
        l0(list.size() + i);
        Object[] objArr = this.a;
        int size = list.size();
        for (int i2 = 0; i2 < size; i2++) {
            objArr[i2 + i] = list.get(i2);
        }
        this.b += list.size();
    }

    public final void x0(AbstractC8135mt1<E> abstractC8135mt1) {
        C6562gT0.p(abstractC8135mt1, "elements");
        if (abstractC8135mt1.H()) {
            return;
        }
        l0(this.b + abstractC8135mt1.b);
        C4788Ye.B0(abstractC8135mt1.a, this.a, this.b, 0, abstractC8135mt1.b);
        this.b += abstractC8135mt1.b;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void y0(ZX1<E> zx1) {
        C6562gT0.p(zx1, "elements");
        if (!zx1.r()) {
            l0(this.b + zx1.q());
            Object[] objArr = zx1.b;
            long[] jArr = zx1.a;
            int length = jArr.length - 2;
            if (length >= 0) {
                int i = 0;
                while (true) {
                    long j = jArr[i];
                    if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                        int i2 = 8 - ((~(i - length)) >>> 31);
                        for (int i3 = 0; i3 < i2; i3++) {
                            if ((255 & j) < 128) {
                                Z(objArr[(i << 3) + i3]);
                            }
                            j >>= 8;
                        }
                        if (i2 != 8) {
                            return;
                        }
                    }
                    if (i != length) {
                        i++;
                    } else {
                        return;
                    }
                }
            }
        }
    }

    public final void z0(B02<? extends E> b02) {
        C6562gT0.p(b02, "elements");
        for (E e : b02) {
            Z(e);
        }
    }

    public /* synthetic */ C11280zn1(int i, int i2, C9516sY c9516sY) {
        this((i2 & 1) != 0 ? 16 : i);
    }

    public C11280zn1(int i) {
        super(i, null);
    }
}
