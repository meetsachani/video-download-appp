package o;

import java.util.AbstractCollection;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;

/* renamed from: o.pp  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C8847pp extends AbstractCollection implements InterfaceC5664cq, InterfaceC7856lp {
    public final Object[] X;
    public int Y;
    public boolean Y0;
    public int Z;
    public final int Z0;

    public C8847pp() {
        this(32);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean add(Object obj) {
        if (obj != null) {
            if (!this.Y0) {
                Object[] objArr = this.X;
                int i = this.Z;
                int i2 = i + 1;
                this.Z = i2;
                objArr[i] = obj;
                if (i2 >= this.Z0) {
                    this.Z = 0;
                }
                if (this.Z == this.Y) {
                    this.Y0 = true;
                }
                return true;
            }
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("The buffer cannot hold more than ");
            stringBuffer.append(this.Z0);
            stringBuffer.append(" objects.");
            throw new C7374jq(stringBuffer.toString());
        }
        throw new NullPointerException("Attempted to add null object to buffer");
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public void clear() {
        this.Y0 = false;
        this.Y = 0;
        this.Z = 0;
        Arrays.fill(this.X, (Object) null);
    }

    @Override // o.InterfaceC5664cq
    public Object get() {
        if (!isEmpty()) {
            return this.X[this.Y];
        }
        throw new C7860lq("The buffer is already empty");
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean isEmpty() {
        if (size() == 0) {
            return true;
        }
        return false;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public Iterator iterator() {
        return new C8360np(this);
    }

    @Override // o.InterfaceC7856lp
    public int q() {
        return this.Z0;
    }

    public final int r(int i) {
        int i2 = i - 1;
        if (i2 < 0) {
            return this.Z0 - 1;
        }
        return i2;
    }

    @Override // o.InterfaceC5664cq
    public Object remove() {
        if (!isEmpty()) {
            Object[] objArr = this.X;
            int i = this.Y;
            Object obj = objArr[i];
            if (obj != null) {
                int i2 = i + 1;
                this.Y = i2;
                objArr[i] = null;
                if (i2 >= this.Z0) {
                    this.Y = 0;
                }
                this.Y0 = false;
            }
            return obj;
        }
        throw new C7860lq("The buffer is already empty");
    }

    @Override // o.InterfaceC7856lp
    public boolean s() {
        if (size() == this.Z0) {
            return true;
        }
        return false;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public int size() {
        int i = this.Z;
        int i2 = this.Y;
        if (i < i2) {
            return (this.Z0 - i2) + i;
        }
        if (i == i2) {
            if (this.Y0) {
                return this.Z0;
            }
            return 0;
        }
        return i - i2;
    }

    public final int w(int i) {
        int i2 = i + 1;
        if (i2 >= this.Z0) {
            return 0;
        }
        return i2;
    }

    public C8847pp(int i) {
        this.Y = 0;
        this.Z = 0;
        this.Y0 = false;
        if (i > 0) {
            Object[] objArr = new Object[i];
            this.X = objArr;
            this.Z0 = objArr.length;
            return;
        }
        throw new IllegalArgumentException("The size must be greater than 0");
    }

    public C8847pp(Collection collection) {
        this(collection.size());
        addAll(collection);
    }
}
