package o;

import java.util.NoSuchElementException;

/* renamed from: o.Xs1  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C4749Xs1<E> implements MS1<E> {
    public final E[] X;
    public final int Y;
    public int Y0;
    public final int Z;

    public C4749Xs1(E... eArr) {
        this(eArr, 0, eArr.length);
    }

    public E[] b() {
        return this.X;
    }

    public int c() {
        return this.Z;
    }

    public int d() {
        return this.Y;
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        if (this.Y0 < this.Z) {
            return true;
        }
        return false;
    }

    @Override // java.util.Iterator
    public E next() {
        if (hasNext()) {
            E[] eArr = this.X;
            int i = this.Y0;
            this.Y0 = i + 1;
            return eArr[i];
        }
        throw new NoSuchElementException();
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException("remove() method is not supported for an ObjectArrayIterator");
    }

    @Override // o.MS1
    public void reset() {
        this.Y0 = this.Y;
    }

    public C4749Xs1(E[] eArr, int i) {
        this(eArr, i, eArr.length);
    }

    public C4749Xs1(E[] eArr, int i, int i2) {
        this.Y0 = 0;
        if (i >= 0) {
            if (i2 <= eArr.length) {
                if (i > eArr.length) {
                    throw new ArrayIndexOutOfBoundsException("Start index must not be greater than the array length");
                }
                if (i2 >= i) {
                    this.X = eArr;
                    this.Y = i;
                    this.Z = i2;
                    this.Y0 = i;
                    return;
                }
                throw new IllegalArgumentException("End index must not be less than start index");
            }
            throw new ArrayIndexOutOfBoundsException("End index must not be greater than the array length");
        }
        throw new ArrayIndexOutOfBoundsException("Start index must not be less than zero");
    }
}
