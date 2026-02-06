package o;

import java.util.AbstractList;
import java.util.Arrays;
import java.util.RandomAccess;

/* loaded from: classes.dex */
public final class YJ1<E> extends H2<E> implements RandomAccess {
    public static final YJ1<Object> Z0;
    public int Y0;
    public E[] Z;

    static {
        YJ1<Object> yj1 = new YJ1<>(new Object[0], 0);
        Z0 = yj1;
        yj1.M0();
    }

    public YJ1() {
        this(new Object[10], 0);
    }

    public static <E> E[] e(int i) {
        return (E[]) new Object[i];
    }

    public static <E> YJ1<E> f() {
        return (YJ1<E>) Z0;
    }

    private void h(int i) {
        if (i >= 0 && i < this.Y0) {
            return;
        }
        throw new IndexOutOfBoundsException(i(i));
    }

    private String i(int i) {
        return "Index:" + i + ", Size:" + this.Y0;
    }

    @Override // o.H2, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean add(E e) {
        d();
        int i = this.Y0;
        E[] eArr = this.Z;
        if (i == eArr.length) {
            this.Z = (E[]) Arrays.copyOf(eArr, ((i * 3) / 2) + 1);
        }
        E[] eArr2 = this.Z;
        int i2 = this.Y0;
        this.Y0 = i2 + 1;
        eArr2[i2] = e;
        ((AbstractList) this).modCount++;
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public E get(int i) {
        h(i);
        return this.Z[i];
    }

    @Override // o.C9740tS0.k, o.C9740tS0.i
    /* renamed from: j */
    public YJ1<E> o(int i) {
        if (i >= this.Y0) {
            return new YJ1<>(Arrays.copyOf(this.Z, i), this.Y0);
        }
        throw new IllegalArgumentException();
    }

    @Override // o.H2, java.util.AbstractList, java.util.List
    public E remove(int i) {
        int i2;
        d();
        h(i);
        E[] eArr = this.Z;
        E e = eArr[i];
        if (i < this.Y0 - 1) {
            System.arraycopy(eArr, i + 1, eArr, i, (i2 - i) - 1);
        }
        this.Y0--;
        ((AbstractList) this).modCount++;
        return e;
    }

    @Override // o.H2, java.util.AbstractList, java.util.List
    public E set(int i, E e) {
        d();
        h(i);
        E[] eArr = this.Z;
        E e2 = eArr[i];
        eArr[i] = e;
        ((AbstractList) this).modCount++;
        return e2;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public int size() {
        return this.Y0;
    }

    public YJ1(E[] eArr, int i) {
        this.Z = eArr;
        this.Y0 = i;
    }

    @Override // o.H2, java.util.AbstractList, java.util.List
    public void add(int i, E e) {
        int i2;
        d();
        if (i >= 0 && i <= (i2 = this.Y0)) {
            E[] eArr = this.Z;
            if (i2 < eArr.length) {
                System.arraycopy(eArr, i, eArr, i + 1, i2 - i);
            } else {
                E[] eArr2 = (E[]) e(((i2 * 3) / 2) + 1);
                System.arraycopy(this.Z, 0, eArr2, 0, i);
                System.arraycopy(this.Z, i, eArr2, i + 1, this.Y0 - i);
                this.Z = eArr2;
            }
            this.Z[i] = e;
            this.Y0++;
            ((AbstractList) this).modCount++;
            return;
        }
        throw new IndexOutOfBoundsException(i(i));
    }
}
