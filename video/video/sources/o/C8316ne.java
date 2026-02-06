package o;

import java.lang.reflect.Array;
import java.util.NoSuchElementException;

/* renamed from: o.ne  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C8316ne implements NS1 {
    public Object X;
    public int Y;
    public int Y0;
    public int Z;

    public C8316ne() {
        this.Y = 0;
        this.Z = 0;
        this.Y0 = 0;
    }

    public void b(int i, String str) {
        if (i <= this.Z) {
            if (i >= 0) {
                return;
            }
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("Attempt to make an ArrayIterator that ");
            stringBuffer.append(str);
            stringBuffer.append("s before the start of the array. ");
            throw new ArrayIndexOutOfBoundsException(stringBuffer.toString());
        }
        StringBuffer stringBuffer2 = new StringBuffer();
        stringBuffer2.append("Attempt to make an ArrayIterator that ");
        stringBuffer2.append(str);
        stringBuffer2.append("s beyond the end of the array. ");
        throw new ArrayIndexOutOfBoundsException(stringBuffer2.toString());
    }

    public Object c() {
        return this.X;
    }

    public void d(Object obj) {
        this.Z = Array.getLength(obj);
        this.Y = 0;
        this.X = obj;
        this.Y0 = 0;
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
            Object obj = this.X;
            int i = this.Y0;
            this.Y0 = i + 1;
            return Array.get(obj, i);
        }
        throw new NoSuchElementException();
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException("remove() method is not supported");
    }

    @Override // o.NS1
    public void reset() {
        this.Y0 = this.Y;
    }

    public C8316ne(Object obj) {
        this.Y = 0;
        this.Z = 0;
        this.Y0 = 0;
        d(obj);
    }

    public C8316ne(Object obj, int i) {
        this.Y = 0;
        this.Z = 0;
        this.Y0 = 0;
        d(obj);
        b(i, "start");
        this.Y = i;
        this.Y0 = i;
    }

    public C8316ne(Object obj, int i, int i2) {
        this.Y = 0;
        this.Z = 0;
        this.Y0 = 0;
        d(obj);
        b(i, "start");
        b(i2, "end");
        if (i2 >= i) {
            this.Y = i;
            this.Z = i2;
            this.Y0 = i;
            return;
        }
        throw new IllegalArgumentException("End index must not be less than start index.");
    }
}
