package o;

import java.util.AbstractList;
import java.util.Collection;
import java.util.Iterator;
import java.util.NoSuchElementException;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@InterfaceC8303na2({"SMAP\nArrayDeque.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ArrayDeque.kt\nkotlin/collections/ArrayDeque\n+ 2 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n*L\n1#1,660:1\n476#1,53:665\n476#1,53:718\n37#2:661\n36#2,3:662\n*S KotlinDebug\n*F\n+ 1 ArrayDeque.kt\nkotlin/collections/ArrayDeque\n*L\n471#1:665,53\n473#1:718,53\n46#1:661\n46#1:662,3\n*E\n"})
@InterfaceC6480g82(version = "1.4")
/* renamed from: o.ie  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C7085ie<E> extends AbstractC7666l2<E> {
    @NotNull
    public static final a Y0 = new a(null);
    @NotNull
    public static final Object[] Z0 = new Object[0];
    public static final int a1 = 10;
    public int X;
    @NotNull
    public Object[] Y;
    public int Z;

    /* renamed from: o.ie$a */
    /* loaded from: classes3.dex */
    public static final class a {
        public /* synthetic */ a(C9516sY c9516sY) {
            this();
        }

        public a() {
        }
    }

    public C7085ie(int i) {
        Object[] objArr;
        if (i == 0) {
            objArr = Z0;
        } else if (i > 0) {
            objArr = new Object[i];
        } else {
            throw new IllegalArgumentException("Illegal Capacity: " + i);
        }
        this.Y = objArr;
    }

    private final void j(int i) {
        if (i >= 0) {
            Object[] objArr = this.Y;
            if (i <= objArr.length) {
                return;
            }
            if (objArr == Z0) {
                this.Y = new Object[C5075aO1.u(i, 10)];
                return;
            } else {
                h(AbstractC8896q1.X.e(objArr.length, i));
                return;
            }
        }
        throw new IllegalStateException("Deque is too big.");
    }

    public final void B(@NotNull VA0<? super Integer, ? super Object[], C7458kA2> va0) {
        int i;
        int i2;
        C6562gT0.p(va0, "structure");
        int H = H(this.X + size());
        if (!isEmpty() && (i2 = this.X) >= H) {
            i = i2 - this.Y.length;
        } else {
            i = this.X;
        }
        va0.i(Integer.valueOf(i), toArray());
    }

    @Nullable
    public final E D() {
        if (isEmpty()) {
            return null;
        }
        return (E) this.Y[H(this.X + C8222nF.J(this))];
    }

    public final int F(int i) {
        if (i < 0) {
            return i + this.Y.length;
        }
        return i;
    }

    public final void G(int i, int i2) {
        if (i < i2) {
            C4788Ye.M1(this.Y, null, i, i2);
            return;
        }
        Object[] objArr = this.Y;
        C4788Ye.M1(objArr, null, i, objArr.length);
        C4788Ye.M1(this.Y, null, 0, i2);
    }

    public final int H(int i) {
        Object[] objArr = this.Y;
        if (i >= objArr.length) {
            return i - objArr.length;
        }
        return i;
    }

    public final void J() {
        ((AbstractList) this).modCount++;
    }

    @Nullable
    public final E K() {
        if (isEmpty()) {
            return null;
        }
        return removeFirst();
    }

    @Nullable
    public final E L() {
        if (isEmpty()) {
            return null;
        }
        return removeLast();
    }

    public final void M(int i, int i2) {
        int H = H(this.X + (i - 1));
        int H2 = H(this.X + (i2 - 1));
        while (i > 0) {
            int i3 = H + 1;
            int min = Math.min(i, Math.min(i3, H2 + 1));
            Object[] objArr = this.Y;
            int i4 = H2 - min;
            int i5 = H - min;
            C4788Ye.B0(objArr, objArr, i4 + 1, i5 + 1, i3);
            H = F(i5);
            H2 = F(i4);
            i -= min;
        }
    }

    public final void Q(int i, int i2) {
        int H = H(this.X + i2);
        int H2 = H(this.X + i);
        int size = size();
        while (true) {
            size -= i2;
            if (size > 0) {
                Object[] objArr = this.Y;
                i2 = Math.min(size, Math.min(objArr.length - H, objArr.length - H2));
                Object[] objArr2 = this.Y;
                int i3 = H + i2;
                C4788Ye.B0(objArr2, objArr2, H2, H, i3);
                H = H(i3);
                H2 = H(H2 + i2);
            } else {
                return;
            }
        }
    }

    public final void U(int i, int i2) {
        removeRange(i, i2);
    }

    @NotNull
    public final Object[] X() {
        return toArray();
    }

    @NotNull
    public final <T> T[] Y(@NotNull T[] tArr) {
        C6562gT0.p(tArr, "array");
        return (T[]) toArray(tArr);
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean add(E e) {
        addLast(e);
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean addAll(@NotNull Collection<? extends E> collection) {
        C6562gT0.p(collection, "elements");
        if (collection.isEmpty()) {
            return false;
        }
        J();
        j(size() + collection.size());
        f(H(this.X + size()), collection);
        return true;
    }

    public final void addFirst(E e) {
        J();
        j(size() + 1);
        int i = i(this.X);
        this.X = i;
        this.Y[i] = e;
        this.Z = size() + 1;
    }

    public final void addLast(E e) {
        J();
        j(size() + 1);
        this.Y[H(this.X + size())] = e;
        this.Z = size() + 1;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public void clear() {
        if (!isEmpty()) {
            J();
            G(this.X, H(this.X + size()));
        }
        this.X = 0;
        this.Z = 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean contains(Object obj) {
        if (indexOf(obj) != -1) {
            return true;
        }
        return false;
    }

    @Override // o.AbstractC7666l2
    public int d() {
        return this.Z;
    }

    @Override // o.AbstractC7666l2
    public E e(int i) {
        AbstractC8896q1.X.b(i, size());
        if (i == C8222nF.J(this)) {
            return removeLast();
        }
        if (i == 0) {
            return removeFirst();
        }
        J();
        int H = H(this.X + i);
        E e = (E) this.Y[H];
        if (i < (size() >> 1)) {
            int i2 = this.X;
            if (H >= i2) {
                Object[] objArr = this.Y;
                C4788Ye.B0(objArr, objArr, i2 + 1, i2, H);
            } else {
                Object[] objArr2 = this.Y;
                C4788Ye.B0(objArr2, objArr2, 1, 0, H);
                Object[] objArr3 = this.Y;
                objArr3[0] = objArr3[objArr3.length - 1];
                int i3 = this.X;
                C4788Ye.B0(objArr3, objArr3, i3 + 1, i3, objArr3.length - 1);
            }
            Object[] objArr4 = this.Y;
            int i4 = this.X;
            objArr4[i4] = null;
            this.X = p(i4);
        } else {
            int H2 = H(this.X + C8222nF.J(this));
            if (H <= H2) {
                Object[] objArr5 = this.Y;
                C4788Ye.B0(objArr5, objArr5, H, H + 1, H2 + 1);
            } else {
                Object[] objArr6 = this.Y;
                C4788Ye.B0(objArr6, objArr6, H, H + 1, objArr6.length);
                Object[] objArr7 = this.Y;
                objArr7[objArr7.length - 1] = objArr7[0];
                C4788Ye.B0(objArr7, objArr7, 0, 1, H2 + 1);
            }
            this.Y[H2] = null;
        }
        this.Z = size() - 1;
        return e;
    }

    public final void f(int i, Collection<? extends E> collection) {
        Iterator<? extends E> it = collection.iterator();
        int length = this.Y.length;
        while (i < length && it.hasNext()) {
            this.Y[i] = it.next();
            i++;
        }
        int i2 = this.X;
        for (int i3 = 0; i3 < i2 && it.hasNext(); i3++) {
            this.Y[i3] = it.next();
        }
        this.Z = size() + collection.size();
    }

    public final E first() {
        if (!isEmpty()) {
            return (E) this.Y[this.X];
        }
        throw new NoSuchElementException("ArrayDeque is empty.");
    }

    @Override // java.util.AbstractList, java.util.List
    public E get(int i) {
        AbstractC8896q1.X.b(i, size());
        return (E) this.Y[H(this.X + i)];
    }

    public final void h(int i) {
        Object[] objArr = new Object[i];
        Object[] objArr2 = this.Y;
        C4788Ye.B0(objArr2, objArr, 0, this.X, objArr2.length);
        Object[] objArr3 = this.Y;
        int length = objArr3.length;
        int i2 = this.X;
        C4788Ye.B0(objArr3, objArr, length - i2, 0, i2);
        this.X = 0;
        this.Y = objArr;
    }

    public final int i(int i) {
        if (i == 0) {
            return C7330jf.Fe(this.Y);
        }
        return i - 1;
    }

    @Override // java.util.AbstractList, java.util.List
    public int indexOf(Object obj) {
        int i;
        int H = H(this.X + size());
        int i2 = this.X;
        if (i2 < H) {
            while (i2 < H) {
                if (C6562gT0.g(obj, this.Y[i2])) {
                    i = this.X;
                } else {
                    i2++;
                }
            }
            return -1;
        } else if (i2 >= H) {
            int length = this.Y.length;
            while (true) {
                if (i2 < length) {
                    if (C6562gT0.g(obj, this.Y[i2])) {
                        i = this.X;
                        break;
                    }
                    i2++;
                } else {
                    for (int i3 = 0; i3 < H; i3++) {
                        if (C6562gT0.g(obj, this.Y[i3])) {
                            i2 = i3 + this.Y.length;
                            i = this.X;
                        }
                    }
                    return -1;
                }
            }
        } else {
            return -1;
        }
        return i2 - i;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean isEmpty() {
        if (size() == 0) {
            return true;
        }
        return false;
    }

    public final boolean k(HA0<? super E, Boolean> ha0) {
        int H;
        boolean z = false;
        z = false;
        z = false;
        if (!isEmpty() && this.Y.length != 0) {
            int H2 = H(this.X + size());
            int i = this.X;
            if (i < H2) {
                H = i;
                while (i < H2) {
                    Object obj = this.Y[i];
                    if (ha0.invoke(obj).booleanValue()) {
                        this.Y[H] = obj;
                        H++;
                    } else {
                        z = true;
                    }
                    i++;
                }
                C4788Ye.M1(this.Y, null, H, H2);
            } else {
                int length = this.Y.length;
                boolean z2 = false;
                int i2 = i;
                while (i < length) {
                    Object[] objArr = this.Y;
                    Object obj2 = objArr[i];
                    objArr[i] = null;
                    if (ha0.invoke(obj2).booleanValue()) {
                        this.Y[i2] = obj2;
                        i2++;
                    } else {
                        z2 = true;
                    }
                    i++;
                }
                H = H(i2);
                for (int i3 = 0; i3 < H2; i3++) {
                    Object[] objArr2 = this.Y;
                    Object obj3 = objArr2[i3];
                    objArr2[i3] = null;
                    if (ha0.invoke(obj3).booleanValue()) {
                        this.Y[H] = obj3;
                        H = p(H);
                    } else {
                        z2 = true;
                    }
                }
                z = z2;
            }
            if (z) {
                J();
                this.Z = F(H - this.X);
            }
        }
        return z;
    }

    @Nullable
    public final E l() {
        if (isEmpty()) {
            return null;
        }
        return (E) this.Y[this.X];
    }

    public final E last() {
        if (!isEmpty()) {
            return (E) this.Y[H(this.X + C8222nF.J(this))];
        }
        throw new NoSuchElementException("ArrayDeque is empty.");
    }

    @Override // java.util.AbstractList, java.util.List
    public int lastIndexOf(Object obj) {
        int Fe;
        int i;
        int H = H(this.X + size());
        int i2 = this.X;
        if (i2 < H) {
            Fe = H - 1;
            if (i2 <= Fe) {
                while (!C6562gT0.g(obj, this.Y[Fe])) {
                    if (Fe != i2) {
                        Fe--;
                    }
                }
                i = this.X;
                return Fe - i;
            }
            return -1;
        }
        if (i2 > H) {
            int i3 = H - 1;
            while (true) {
                if (-1 < i3) {
                    if (C6562gT0.g(obj, this.Y[i3])) {
                        Fe = i3 + this.Y.length;
                        i = this.X;
                        break;
                    }
                    i3--;
                } else {
                    Fe = C7330jf.Fe(this.Y);
                    int i4 = this.X;
                    if (i4 <= Fe) {
                        while (!C6562gT0.g(obj, this.Y[Fe])) {
                            if (Fe != i4) {
                                Fe--;
                            }
                        }
                        i = this.X;
                    }
                }
            }
        }
        return -1;
    }

    public final int p(int i) {
        if (i == C7330jf.Fe(this.Y)) {
            return 0;
        }
        return i + 1;
    }

    @XP0
    public final E r(int i) {
        return (E) this.Y[i];
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean remove(Object obj) {
        int indexOf = indexOf(obj);
        if (indexOf == -1) {
            return false;
        }
        remove(indexOf);
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean removeAll(@NotNull Collection<?> collection) {
        int H;
        C6562gT0.p(collection, "elements");
        boolean z = false;
        z = false;
        z = false;
        if (!isEmpty() && this.Y.length != 0) {
            int H2 = H(this.X + size());
            int i = this.X;
            if (i < H2) {
                H = i;
                while (i < H2) {
                    Object obj = this.Y[i];
                    if (!collection.contains(obj)) {
                        this.Y[H] = obj;
                        H++;
                    } else {
                        z = true;
                    }
                    i++;
                }
                C4788Ye.M1(this.Y, null, H, H2);
            } else {
                int length = this.Y.length;
                boolean z2 = false;
                int i2 = i;
                while (i < length) {
                    Object[] objArr = this.Y;
                    Object obj2 = objArr[i];
                    objArr[i] = null;
                    if (!collection.contains(obj2)) {
                        this.Y[i2] = obj2;
                        i2++;
                    } else {
                        z2 = true;
                    }
                    i++;
                }
                H = H(i2);
                for (int i3 = 0; i3 < H2; i3++) {
                    Object[] objArr2 = this.Y;
                    Object obj3 = objArr2[i3];
                    objArr2[i3] = null;
                    if (!collection.contains(obj3)) {
                        this.Y[H] = obj3;
                        H = p(H);
                    } else {
                        z2 = true;
                    }
                }
                z = z2;
            }
            if (z) {
                J();
                this.Z = F(H - this.X);
            }
        }
        return z;
    }

    public final E removeFirst() {
        if (!isEmpty()) {
            J();
            Object[] objArr = this.Y;
            int i = this.X;
            E e = (E) objArr[i];
            objArr[i] = null;
            this.X = p(i);
            this.Z = size() - 1;
            return e;
        }
        throw new NoSuchElementException("ArrayDeque is empty.");
    }

    public final E removeLast() {
        if (!isEmpty()) {
            J();
            int H = H(this.X + C8222nF.J(this));
            Object[] objArr = this.Y;
            E e = (E) objArr[H];
            objArr[H] = null;
            this.Z = size() - 1;
            return e;
        }
        throw new NoSuchElementException("ArrayDeque is empty.");
    }

    @Override // java.util.AbstractList
    public void removeRange(int i, int i2) {
        AbstractC8896q1.X.d(i, i2, size());
        int i3 = i2 - i;
        if (i3 == 0) {
            return;
        }
        if (i3 == size()) {
            clear();
        } else if (i3 == 1) {
            remove(i);
        } else {
            J();
            if (i < size() - i2) {
                M(i, i2);
                int H = H(this.X + i3);
                G(this.X, H);
                this.X = H;
            } else {
                Q(i, i2);
                int H2 = H(this.X + size());
                G(F(H2 - i3), H2);
            }
            this.Z = size() - i3;
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean retainAll(@NotNull Collection<?> collection) {
        int H;
        C6562gT0.p(collection, "elements");
        boolean z = false;
        z = false;
        z = false;
        if (!isEmpty() && this.Y.length != 0) {
            int H2 = H(this.X + size());
            int i = this.X;
            if (i < H2) {
                H = i;
                while (i < H2) {
                    Object obj = this.Y[i];
                    if (collection.contains(obj)) {
                        this.Y[H] = obj;
                        H++;
                    } else {
                        z = true;
                    }
                    i++;
                }
                C4788Ye.M1(this.Y, null, H, H2);
            } else {
                int length = this.Y.length;
                boolean z2 = false;
                int i2 = i;
                while (i < length) {
                    Object[] objArr = this.Y;
                    Object obj2 = objArr[i];
                    objArr[i] = null;
                    if (collection.contains(obj2)) {
                        this.Y[i2] = obj2;
                        i2++;
                    } else {
                        z2 = true;
                    }
                    i++;
                }
                H = H(i2);
                for (int i3 = 0; i3 < H2; i3++) {
                    Object[] objArr2 = this.Y;
                    Object obj3 = objArr2[i3];
                    objArr2[i3] = null;
                    if (collection.contains(obj3)) {
                        this.Y[H] = obj3;
                        H = p(H);
                    } else {
                        z2 = true;
                    }
                }
                z = z2;
            }
            if (z) {
                J();
                this.Z = F(H - this.X);
            }
        }
        return z;
    }

    @Override // o.AbstractC7666l2, java.util.AbstractList, java.util.List
    public E set(int i, E e) {
        AbstractC8896q1.X.b(i, size());
        int H = H(this.X + i);
        Object[] objArr = this.Y;
        E e2 = (E) objArr[H];
        objArr[H] = e;
        return e2;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    @NotNull
    public <T> T[] toArray(@NotNull T[] tArr) {
        C6562gT0.p(tArr, "array");
        if (tArr.length < size()) {
            tArr = (T[]) C4594We.a(tArr, size());
        }
        T[] tArr2 = tArr;
        int H = H(this.X + size());
        int i = this.X;
        if (i < H) {
            C4788Ye.K0(this.Y, tArr2, 0, i, H, 2, null);
        } else if (!isEmpty()) {
            Object[] objArr = this.Y;
            C4788Ye.B0(objArr, tArr2, 0, this.X, objArr.length);
            Object[] objArr2 = this.Y;
            C4788Ye.B0(objArr2, tArr2, objArr2.length - this.X, 0, H);
        }
        return (T[]) C7979mF.n(size(), tArr2);
    }

    @XP0
    public final int w(int i) {
        return H(this.X + i);
    }

    @Override // o.AbstractC7666l2, java.util.AbstractList, java.util.List
    public void add(int i, E e) {
        AbstractC8896q1.X.c(i, size());
        if (i == size()) {
            addLast(e);
        } else if (i == 0) {
            addFirst(e);
        } else {
            J();
            j(size() + 1);
            int H = H(this.X + i);
            if (i < ((size() + 1) >> 1)) {
                int i2 = i(H);
                int i3 = i(this.X);
                int i4 = this.X;
                if (i2 >= i4) {
                    Object[] objArr = this.Y;
                    objArr[i3] = objArr[i4];
                    C4788Ye.B0(objArr, objArr, i4, i4 + 1, i2 + 1);
                } else {
                    Object[] objArr2 = this.Y;
                    C4788Ye.B0(objArr2, objArr2, i4 - 1, i4, objArr2.length);
                    Object[] objArr3 = this.Y;
                    objArr3[objArr3.length - 1] = objArr3[0];
                    C4788Ye.B0(objArr3, objArr3, 0, 1, i2 + 1);
                }
                this.Y[i2] = e;
                this.X = i3;
            } else {
                int H2 = H(this.X + size());
                if (H < H2) {
                    Object[] objArr4 = this.Y;
                    C4788Ye.B0(objArr4, objArr4, H + 1, H, H2);
                } else {
                    Object[] objArr5 = this.Y;
                    C4788Ye.B0(objArr5, objArr5, 1, 0, H2);
                    Object[] objArr6 = this.Y;
                    objArr6[0] = objArr6[objArr6.length - 1];
                    C4788Ye.B0(objArr6, objArr6, H + 1, H, objArr6.length - 1);
                }
                this.Y[H] = e;
            }
            this.Z = size() + 1;
        }
    }

    @Override // java.util.AbstractList, java.util.List
    public boolean addAll(int i, @NotNull Collection<? extends E> collection) {
        C6562gT0.p(collection, "elements");
        AbstractC8896q1.X.c(i, size());
        if (collection.isEmpty()) {
            return false;
        }
        if (i == size()) {
            return addAll(collection);
        }
        J();
        j(size() + collection.size());
        int H = H(this.X + size());
        int H2 = H(this.X + i);
        int size = collection.size();
        if (i < ((size() + 1) >> 1)) {
            int i2 = this.X;
            int i3 = i2 - size;
            if (H2 < i2) {
                Object[] objArr = this.Y;
                C4788Ye.B0(objArr, objArr, i3, i2, objArr.length);
                if (size >= H2) {
                    Object[] objArr2 = this.Y;
                    C4788Ye.B0(objArr2, objArr2, objArr2.length - size, 0, H2);
                } else {
                    Object[] objArr3 = this.Y;
                    C4788Ye.B0(objArr3, objArr3, objArr3.length - size, 0, size);
                    Object[] objArr4 = this.Y;
                    C4788Ye.B0(objArr4, objArr4, 0, size, H2);
                }
            } else if (i3 >= 0) {
                Object[] objArr5 = this.Y;
                C4788Ye.B0(objArr5, objArr5, i3, i2, H2);
            } else {
                Object[] objArr6 = this.Y;
                i3 += objArr6.length;
                int i4 = H2 - i2;
                int length = objArr6.length - i3;
                if (length >= i4) {
                    C4788Ye.B0(objArr6, objArr6, i3, i2, H2);
                } else {
                    C4788Ye.B0(objArr6, objArr6, i3, i2, i2 + length);
                    Object[] objArr7 = this.Y;
                    C4788Ye.B0(objArr7, objArr7, 0, this.X + length, H2);
                }
            }
            this.X = i3;
            f(F(H2 - size), collection);
        } else {
            int i5 = H2 + size;
            if (H2 < H) {
                int i6 = size + H;
                Object[] objArr8 = this.Y;
                if (i6 <= objArr8.length) {
                    C4788Ye.B0(objArr8, objArr8, i5, H2, H);
                } else if (i5 >= objArr8.length) {
                    C4788Ye.B0(objArr8, objArr8, i5 - objArr8.length, H2, H);
                } else {
                    int length2 = H - (i6 - objArr8.length);
                    C4788Ye.B0(objArr8, objArr8, 0, length2, H);
                    Object[] objArr9 = this.Y;
                    C4788Ye.B0(objArr9, objArr9, i5, H2, length2);
                }
            } else {
                Object[] objArr10 = this.Y;
                C4788Ye.B0(objArr10, objArr10, size, 0, H);
                Object[] objArr11 = this.Y;
                if (i5 >= objArr11.length) {
                    C4788Ye.B0(objArr11, objArr11, i5 - objArr11.length, H2, objArr11.length);
                } else {
                    C4788Ye.B0(objArr11, objArr11, 0, objArr11.length - size, objArr11.length);
                    Object[] objArr12 = this.Y;
                    C4788Ye.B0(objArr12, objArr12, i5, H2, objArr12.length - size);
                }
            }
            f(H2, collection);
        }
        return true;
    }

    public C7085ie() {
        this.Y = Z0;
    }

    public C7085ie(@NotNull Collection<? extends E> collection) {
        C6562gT0.p(collection, "elements");
        Object[] array = collection.toArray(new Object[0]);
        this.Y = array;
        this.Z = array.length;
        if (array.length == 0) {
            this.Y = Z0;
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    @NotNull
    public Object[] toArray() {
        return toArray(new Object[size()]);
    }
}
