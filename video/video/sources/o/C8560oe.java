package o;

import java.lang.reflect.Array;
import java.util.NoSuchElementException;

/* renamed from: o.oe  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C8560oe<E> implements MS1<E> {
    public final Object X;
    public final int Y;
    public int Y0;
    public final int Z;

    public C8560oe(Object obj) {
        this(obj, 0);
    }

    public void b(int i, int i2, String str) {
        if (i <= i2) {
            if (i >= 0) {
                return;
            }
            throw new ArrayIndexOutOfBoundsException("Attempt to make an ArrayIterator that " + str + "s before the start of the array. ");
        }
        throw new ArrayIndexOutOfBoundsException("Attempt to make an ArrayIterator that " + str + "s beyond the end of the array. ");
    }

    public Object c() {
        return this.X;
    }

    public int d() {
        return this.Z;
    }

    public int e() {
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
            Object obj = this.X;
            int i = this.Y0;
            this.Y0 = i + 1;
            return (E) Array.get(obj, i);
        }
        throw new NoSuchElementException();
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException("remove() method is not supported");
    }

    @Override // o.MS1
    public void reset() {
        this.Y0 = this.Y;
    }

    public C8560oe(Object obj, int i) {
        this(obj, i, Array.getLength(obj));
    }

    public C8560oe(Object obj, int i, int i2) {
        this.X = obj;
        this.Y = i;
        this.Z = i2;
        this.Y0 = i;
        int length = Array.getLength(obj);
        b(i, length, "start");
        b(i2, length, "end");
        if (i2 < i) {
            throw new IllegalArgumentException("End index must not be less than start index.");
        }
    }
}
