package o;

import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;
import o.C9740tS0;

/* loaded from: classes.dex */
public final class X40 extends H2<Double> implements C9740tS0.b, RandomAccess, InterfaceC7989mH1 {
    public static final X40 Z0;
    public int Y0;
    public double[] Z;

    static {
        X40 x40 = new X40(new double[0], 0);
        Z0 = x40;
        x40.M0();
    }

    public X40() {
        this(new double[10], 0);
    }

    public static X40 i() {
        return Z0;
    }

    private void j(int i) {
        if (i >= 0 && i < this.Y0) {
            return;
        }
        throw new IndexOutOfBoundsException(l(i));
    }

    private String l(int i) {
        return "Index:" + i + ", Size:" + this.Y0;
    }

    @Override // o.H2, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean addAll(Collection<? extends Double> collection) {
        d();
        C9740tS0.d(collection);
        if (!(collection instanceof X40)) {
            return super.addAll(collection);
        }
        X40 x40 = (X40) collection;
        int i = x40.Y0;
        if (i == 0) {
            return false;
        }
        int i2 = this.Y0;
        if (Integer.MAX_VALUE - i2 >= i) {
            int i3 = i2 + i;
            double[] dArr = this.Z;
            if (i3 > dArr.length) {
                this.Z = Arrays.copyOf(dArr, i3);
            }
            System.arraycopy(x40.Z, 0, this.Z, this.Y0, x40.Y0);
            this.Y0 = i3;
            ((AbstractList) this).modCount++;
            return true;
        }
        throw new OutOfMemoryError();
    }

    @Override // o.H2, java.util.AbstractList, java.util.List
    /* renamed from: e */
    public void add(int i, Double d) {
        h(i, d.doubleValue());
    }

    @Override // o.H2, java.util.AbstractList, java.util.Collection, java.util.List
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof X40)) {
            return super.equals(obj);
        }
        X40 x40 = (X40) obj;
        if (this.Y0 != x40.Y0) {
            return false;
        }
        double[] dArr = x40.Z;
        for (int i = 0; i < this.Y0; i++) {
            if (Double.doubleToLongBits(this.Z[i]) != Double.doubleToLongBits(dArr[i])) {
                return false;
            }
        }
        return true;
    }

    @Override // o.H2, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    /* renamed from: f */
    public boolean add(Double d) {
        v4(d.doubleValue());
        return true;
    }

    @Override // o.C9740tS0.b
    public double getDouble(int i) {
        j(i);
        return this.Z[i];
    }

    public final void h(int i, double d) {
        int i2;
        d();
        if (i >= 0 && i <= (i2 = this.Y0)) {
            double[] dArr = this.Z;
            if (i2 < dArr.length) {
                System.arraycopy(dArr, i, dArr, i + 1, i2 - i);
            } else {
                double[] dArr2 = new double[((i2 * 3) / 2) + 1];
                System.arraycopy(dArr, 0, dArr2, 0, i);
                System.arraycopy(this.Z, i, dArr2, i + 1, this.Y0 - i);
                this.Z = dArr2;
            }
            this.Z[i] = d;
            this.Y0++;
            ((AbstractList) this).modCount++;
            return;
        }
        throw new IndexOutOfBoundsException(l(i));
    }

    @Override // o.H2, java.util.AbstractList, java.util.Collection, java.util.List
    public int hashCode() {
        int i = 1;
        for (int i2 = 0; i2 < this.Y0; i2++) {
            i = (i * 31) + C9740tS0.s(Double.doubleToLongBits(this.Z[i2]));
        }
        return i;
    }

    @Override // o.C9740tS0.b
    public double i0(int i, double d) {
        d();
        j(i);
        double[] dArr = this.Z;
        double d2 = dArr[i];
        dArr[i] = d;
        return d2;
    }

    @Override // java.util.AbstractList, java.util.List
    /* renamed from: k */
    public Double get(int i) {
        return Double.valueOf(getDouble(i));
    }

    @Override // o.H2, java.util.AbstractList, java.util.List
    /* renamed from: p */
    public Double remove(int i) {
        int i2;
        d();
        j(i);
        double[] dArr = this.Z;
        double d = dArr[i];
        if (i < this.Y0 - 1) {
            System.arraycopy(dArr, i + 1, dArr, i, (i2 - i) - 1);
        }
        this.Y0--;
        ((AbstractList) this).modCount++;
        return Double.valueOf(d);
    }

    @Override // o.H2, java.util.AbstractList, java.util.List
    /* renamed from: r */
    public Double set(int i, Double d) {
        return Double.valueOf(i0(i, d.doubleValue()));
    }

    @Override // java.util.AbstractList
    public void removeRange(int i, int i2) {
        d();
        if (i2 >= i) {
            double[] dArr = this.Z;
            System.arraycopy(dArr, i2, dArr, i, this.Y0 - i2);
            this.Y0 -= i2 - i;
            ((AbstractList) this).modCount++;
            return;
        }
        throw new IndexOutOfBoundsException("toIndex < fromIndex");
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public int size() {
        return this.Y0;
    }

    @Override // o.C9740tS0.b
    public void v4(double d) {
        d();
        int i = this.Y0;
        double[] dArr = this.Z;
        if (i == dArr.length) {
            double[] dArr2 = new double[((i * 3) / 2) + 1];
            System.arraycopy(dArr, 0, dArr2, 0, i);
            this.Z = dArr2;
        }
        double[] dArr3 = this.Z;
        int i2 = this.Y0;
        this.Y0 = i2 + 1;
        dArr3[i2] = d;
    }

    public X40(double[] dArr, int i) {
        this.Z = dArr;
        this.Y0 = i;
    }

    @Override // o.C9740tS0.k, o.C9740tS0.i
    /* renamed from: o */
    public C9740tS0.k<Double> o2(int i) {
        if (i >= this.Y0) {
            return new X40(Arrays.copyOf(this.Z, i), this.Y0);
        }
        throw new IllegalArgumentException();
    }

    @Override // o.H2, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean remove(Object obj) {
        d();
        for (int i = 0; i < this.Y0; i++) {
            if (obj.equals(Double.valueOf(this.Z[i]))) {
                double[] dArr = this.Z;
                System.arraycopy(dArr, i + 1, dArr, i, (this.Y0 - i) - 1);
                this.Y0--;
                ((AbstractList) this).modCount++;
                return true;
            }
        }
        return false;
    }
}
