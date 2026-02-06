package o;

import java.io.Serializable;
import java.util.AbstractCollection;
import java.util.Comparator;
import java.util.Iterator;

/* renamed from: o.zH1  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C11158zH1 extends AbstractCollection implements InterfaceC5664cq, Serializable {
    public static final int Z0 = 13;
    private static final long serialVersionUID = 6891186490470027896L;
    public Object[] X;
    public int Y;
    public Comparator Y0;
    public boolean Z;

    public C11158zH1() {
        this(13, true, null);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean add(Object obj) {
        if (h()) {
            e();
        }
        if (this.Z) {
            r(obj);
            return true;
        }
        l(obj);
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public void clear() {
        this.X = new Object[this.X.length];
        this.Y = 0;
    }

    public Comparator comparator() {
        return this.Y0;
    }

    public int d(Object obj, Object obj2) {
        Comparator comparator = this.Y0;
        if (comparator != null) {
            return comparator.compare(obj, obj2);
        }
        return ((Comparable) obj).compareTo(obj2);
    }

    public void e() {
        Object[] objArr = this.X;
        Object[] objArr2 = new Object[objArr.length * 2];
        System.arraycopy(objArr, 0, objArr2, 0, objArr.length);
        this.X = objArr2;
    }

    public boolean f() {
        return this.Z;
    }

    @Override // o.InterfaceC5664cq
    public Object get() {
        if (!isEmpty()) {
            return this.X[1];
        }
        throw new C7860lq();
    }

    public boolean h() {
        if (this.X.length == this.Y + 1) {
            return true;
        }
        return false;
    }

    public void i(int i) {
        Object obj = this.X[i];
        while (true) {
            int i2 = i * 2;
            int i3 = this.Y;
            if (i2 > i3) {
                break;
            }
            if (i2 != i3) {
                Object[] objArr = this.X;
                int i4 = i2 + 1;
                if (d(objArr[i4], objArr[i2]) > 0) {
                    i2 = i4;
                }
            }
            if (d(this.X[i2], obj) <= 0) {
                break;
            }
            Object[] objArr2 = this.X;
            objArr2[i] = objArr2[i2];
            i = i2;
        }
        this.X[i] = obj;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public Iterator iterator() {
        return new C10915yH1(this);
    }

    public void j(int i) {
        Object obj = this.X[i];
        while (true) {
            int i2 = i * 2;
            int i3 = this.Y;
            if (i2 > i3) {
                break;
            }
            if (i2 != i3) {
                Object[] objArr = this.X;
                int i4 = i2 + 1;
                if (d(objArr[i4], objArr[i2]) < 0) {
                    i2 = i4;
                }
            }
            if (d(this.X[i2], obj) >= 0) {
                break;
            }
            Object[] objArr2 = this.X;
            objArr2[i] = objArr2[i2];
            i = i2;
        }
        this.X[i] = obj;
    }

    public void k(int i) {
        Object obj = this.X[i];
        while (i > 1) {
            int i2 = i / 2;
            if (d(obj, this.X[i2]) <= 0) {
                break;
            }
            Object[] objArr = this.X;
            objArr[i] = objArr[i2];
            i = i2;
        }
        this.X[i] = obj;
    }

    public void l(Object obj) {
        Object[] objArr = this.X;
        int i = this.Y + 1;
        this.Y = i;
        objArr[i] = obj;
        k(i);
    }

    public void p(int i) {
        Object obj = this.X[i];
        while (i > 1) {
            int i2 = i / 2;
            if (d(obj, this.X[i2]) >= 0) {
                break;
            }
            Object[] objArr = this.X;
            objArr[i] = objArr[i2];
            i = i2;
        }
        this.X[i] = obj;
    }

    public void r(Object obj) {
        Object[] objArr = this.X;
        int i = this.Y + 1;
        this.Y = i;
        objArr[i] = obj;
        p(i);
    }

    @Override // o.InterfaceC5664cq
    public Object remove() {
        Object obj = get();
        Object[] objArr = this.X;
        int i = this.Y;
        int i2 = i - 1;
        this.Y = i2;
        objArr[1] = objArr[i];
        objArr[i] = null;
        if (i2 != 0) {
            if (this.Z) {
                j(1);
                return obj;
            }
            i(1);
        }
        return obj;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public int size() {
        return this.Y;
    }

    @Override // java.util.AbstractCollection
    public String toString() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("[ ");
        for (int i = 1; i < this.Y + 1; i++) {
            if (i != 1) {
                stringBuffer.append(C6566gU0.h);
            }
            stringBuffer.append(this.X[i]);
        }
        stringBuffer.append(" ]");
        return stringBuffer.toString();
    }

    public C11158zH1(Comparator comparator) {
        this(13, true, comparator);
    }

    public C11158zH1(boolean z) {
        this(13, z, null);
    }

    public C11158zH1(boolean z, Comparator comparator) {
        this(13, z, comparator);
    }

    public C11158zH1(int i) {
        this(i, true, null);
    }

    public C11158zH1(int i, Comparator comparator) {
        this(i, true, comparator);
    }

    public C11158zH1(int i, boolean z) {
        this(i, z, null);
    }

    public C11158zH1(int i, boolean z, Comparator comparator) {
        if (i > 0) {
            this.Z = z;
            this.X = new Object[i + 1];
            this.Y0 = comparator;
            return;
        }
        throw new IllegalArgumentException("invalid capacity");
    }
}
