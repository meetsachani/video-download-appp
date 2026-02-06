package o;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* renamed from: o.Ys1  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C4846Ys1 implements Iterator, NS1 {
    public Object[] X;
    public int Y;
    public int Y0;
    public int Z;

    public C4846Ys1() {
        this.X = null;
        this.Y = 0;
        this.Z = 0;
        this.Y0 = 0;
    }

    public Object[] b() {
        return this.X;
    }

    public int c() {
        return this.Z;
    }

    public int d() {
        return this.Y;
    }

    public void e(Object[] objArr) {
        if (this.X == null) {
            this.X = objArr;
            this.Y = 0;
            this.Z = objArr.length;
            this.Y0 = 0;
            return;
        }
        throw new IllegalStateException("The array to iterate over has already been set");
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        if (this.Y0 < this.Z) {
            return true;
        }
        return false;
    }

    @Override // java.util.Iterator
    public Object next() {
        if (hasNext()) {
            Object[] objArr = this.X;
            int i = this.Y0;
            this.Y0 = i + 1;
            return objArr[i];
        }
        throw new NoSuchElementException();
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException("remove() method is not supported for an ObjectArrayIterator");
    }

    @Override // o.NS1
    public void reset() {
        this.Y0 = this.Y;
    }

    public C4846Ys1(Object[] objArr) {
        this(objArr, 0, objArr.length);
    }

    public C4846Ys1(Object[] objArr, int i) {
        this(objArr, i, objArr.length);
    }

    public C4846Ys1(Object[] objArr, int i, int i2) {
        this.X = null;
        this.Y = 0;
        this.Z = 0;
        this.Y0 = 0;
        if (i >= 0) {
            if (i2 <= objArr.length) {
                if (i > objArr.length) {
                    throw new ArrayIndexOutOfBoundsException("Start index must not be greater than the array length");
                }
                if (i2 >= i) {
                    this.X = objArr;
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
