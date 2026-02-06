package o;

import java.util.AbstractCollection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* renamed from: o.ln  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C7848ln extends AbstractCollection implements EH1, InterfaceC5664cq {
    public static final int Z0 = 13;
    public int X;
    public Object[] Y;
    public Comparator Y0;
    public boolean Z;

    public C7848ln() {
        this(13, true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int f(Object obj, Object obj2) {
        Comparator comparator = this.Y0;
        if (comparator != null) {
            return comparator.compare(obj, obj2);
        }
        return ((Comparable) obj).compareTo(obj2);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean add(Object obj) {
        d(obj);
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, o.EH1
    public void clear() {
        this.Y = new Object[this.Y.length];
        this.X = 0;
    }

    @Override // o.EH1
    public void d(Object obj) {
        if (s()) {
            h();
        }
        if (this.Z) {
            r(obj);
        } else {
            l(obj);
        }
    }

    @Override // o.InterfaceC5664cq
    public Object get() {
        try {
            return peek();
        } catch (NoSuchElementException unused) {
            throw new C7860lq();
        }
    }

    public void h() {
        Object[] objArr = this.Y;
        Object[] objArr2 = new Object[objArr.length * 2];
        System.arraycopy(objArr, 0, objArr2, 0, objArr.length);
        this.Y = objArr2;
    }

    public void i(int i) {
        Object obj = this.Y[i];
        while (true) {
            int i2 = i * 2;
            int i3 = this.X;
            if (i2 > i3) {
                break;
            }
            if (i2 != i3) {
                Object[] objArr = this.Y;
                int i4 = i2 + 1;
                if (f(objArr[i4], objArr[i2]) > 0) {
                    i2 = i4;
                }
            }
            if (f(this.Y[i2], obj) <= 0) {
                break;
            }
            Object[] objArr2 = this.Y;
            objArr2[i] = objArr2[i2];
            i = i2;
        }
        this.Y[i] = obj;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, o.EH1
    public boolean isEmpty() {
        if (this.X == 0) {
            return true;
        }
        return false;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public Iterator iterator() {
        return new C7605kn(this);
    }

    public void j(int i) {
        Object obj = this.Y[i];
        while (true) {
            int i2 = i * 2;
            int i3 = this.X;
            if (i2 > i3) {
                break;
            }
            if (i2 != i3) {
                Object[] objArr = this.Y;
                int i4 = i2 + 1;
                if (f(objArr[i4], objArr[i2]) < 0) {
                    i2 = i4;
                }
            }
            if (f(this.Y[i2], obj) >= 0) {
                break;
            }
            Object[] objArr2 = this.Y;
            objArr2[i] = objArr2[i2];
            i = i2;
        }
        this.Y[i] = obj;
    }

    public void k(int i) {
        Object obj = this.Y[i];
        while (i > 1) {
            int i2 = i / 2;
            if (f(obj, this.Y[i2]) <= 0) {
                break;
            }
            Object[] objArr = this.Y;
            objArr[i] = objArr[i2];
            i = i2;
        }
        this.Y[i] = obj;
    }

    public void l(Object obj) {
        Object[] objArr = this.Y;
        int i = this.X + 1;
        this.X = i;
        objArr[i] = obj;
        k(i);
    }

    public void p(int i) {
        Object obj = this.Y[i];
        while (i > 1) {
            int i2 = i / 2;
            if (f(obj, this.Y[i2]) >= 0) {
                break;
            }
            Object[] objArr = this.Y;
            objArr[i] = objArr[i2];
            i = i2;
        }
        this.Y[i] = obj;
    }

    @Override // o.EH1
    public Object peek() throws NoSuchElementException {
        if (!isEmpty()) {
            return this.Y[1];
        }
        throw new NoSuchElementException();
    }

    @Override // o.EH1
    public Object pop() throws NoSuchElementException {
        Object peek = peek();
        Object[] objArr = this.Y;
        int i = this.X;
        int i2 = i - 1;
        this.X = i2;
        objArr[1] = objArr[i];
        objArr[i] = null;
        if (i2 != 0) {
            if (this.Z) {
                j(1);
                return peek;
            }
            i(1);
        }
        return peek;
    }

    public void r(Object obj) {
        Object[] objArr = this.Y;
        int i = this.X + 1;
        this.X = i;
        objArr[i] = obj;
        p(i);
    }

    @Override // o.InterfaceC5664cq
    public Object remove() {
        try {
            return pop();
        } catch (NoSuchElementException unused) {
            throw new C7860lq();
        }
    }

    public boolean s() {
        if (this.Y.length == this.X + 1) {
            return true;
        }
        return false;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public int size() {
        return this.X;
    }

    @Override // java.util.AbstractCollection
    public String toString() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("[ ");
        for (int i = 1; i < this.X + 1; i++) {
            if (i != 1) {
                stringBuffer.append(C6566gU0.h);
            }
            stringBuffer.append(this.Y[i]);
        }
        stringBuffer.append(" ]");
        return stringBuffer.toString();
    }

    public C7848ln(Comparator comparator) {
        this();
        this.Y0 = comparator;
    }

    public C7848ln(int i) {
        this(i, true);
    }

    public C7848ln(int i, Comparator comparator) {
        this(i);
        this.Y0 = comparator;
    }

    public C7848ln(boolean z) {
        this(13, z);
    }

    public C7848ln(boolean z, Comparator comparator) {
        this(z);
        this.Y0 = comparator;
    }

    public C7848ln(int i, boolean z) {
        if (i > 0) {
            this.Z = z;
            this.Y = new Object[i + 1];
            return;
        }
        throw new IllegalArgumentException("invalid capacity");
    }

    public C7848ln(int i, boolean z, Comparator comparator) {
        this(i, z);
        this.Y0 = comparator;
    }
}
