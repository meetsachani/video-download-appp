package o;

import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;
import o.C9740tS0;

/* renamed from: o.Ho  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3170Ho extends H2<Boolean> implements C9740tS0.a, RandomAccess, InterfaceC7989mH1 {
    public static final C3170Ho Z0;
    public int Y0;
    public boolean[] Z;

    static {
        C3170Ho c3170Ho = new C3170Ho(new boolean[0], 0);
        Z0 = c3170Ho;
        c3170Ho.M0();
    }

    public C3170Ho() {
        this(new boolean[10], 0);
    }

    public static C3170Ho i() {
        return Z0;
    }

    @Override // o.C9740tS0.a
    public void C1(boolean z) {
        d();
        int i = this.Y0;
        boolean[] zArr = this.Z;
        if (i == zArr.length) {
            boolean[] zArr2 = new boolean[((i * 3) / 2) + 1];
            System.arraycopy(zArr, 0, zArr2, 0, i);
            this.Z = zArr2;
        }
        boolean[] zArr3 = this.Z;
        int i2 = this.Y0;
        this.Y0 = i2 + 1;
        zArr3[i2] = z;
    }

    @Override // o.C9740tS0.a
    public boolean Z(int i, boolean z) {
        d();
        j(i);
        boolean[] zArr = this.Z;
        boolean z2 = zArr[i];
        zArr[i] = z;
        return z2;
    }

    @Override // o.H2, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean addAll(Collection<? extends Boolean> collection) {
        d();
        C9740tS0.d(collection);
        if (!(collection instanceof C3170Ho)) {
            return super.addAll(collection);
        }
        C3170Ho c3170Ho = (C3170Ho) collection;
        int i = c3170Ho.Y0;
        if (i == 0) {
            return false;
        }
        int i2 = this.Y0;
        if (Integer.MAX_VALUE - i2 >= i) {
            int i3 = i2 + i;
            boolean[] zArr = this.Z;
            if (i3 > zArr.length) {
                this.Z = Arrays.copyOf(zArr, i3);
            }
            System.arraycopy(c3170Ho.Z, 0, this.Z, this.Y0, c3170Ho.Y0);
            this.Y0 = i3;
            ((AbstractList) this).modCount++;
            return true;
        }
        throw new OutOfMemoryError();
    }

    @Override // o.H2, java.util.AbstractList, java.util.List
    /* renamed from: e */
    public void add(int i, Boolean bool) {
        h(i, bool.booleanValue());
    }

    @Override // o.H2, java.util.AbstractList, java.util.Collection, java.util.List
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3170Ho)) {
            return super.equals(obj);
        }
        C3170Ho c3170Ho = (C3170Ho) obj;
        if (this.Y0 != c3170Ho.Y0) {
            return false;
        }
        boolean[] zArr = c3170Ho.Z;
        for (int i = 0; i < this.Y0; i++) {
            if (this.Z[i] != zArr[i]) {
                return false;
            }
        }
        return true;
    }

    @Override // o.H2, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    /* renamed from: f */
    public boolean add(Boolean bool) {
        C1(bool.booleanValue());
        return true;
    }

    @Override // o.C9740tS0.a
    public boolean getBoolean(int i) {
        j(i);
        return this.Z[i];
    }

    public final void h(int i, boolean z) {
        int i2;
        d();
        if (i >= 0 && i <= (i2 = this.Y0)) {
            boolean[] zArr = this.Z;
            if (i2 < zArr.length) {
                System.arraycopy(zArr, i, zArr, i + 1, i2 - i);
            } else {
                boolean[] zArr2 = new boolean[((i2 * 3) / 2) + 1];
                System.arraycopy(zArr, 0, zArr2, 0, i);
                System.arraycopy(this.Z, i, zArr2, i + 1, this.Y0 - i);
                this.Z = zArr2;
            }
            this.Z[i] = z;
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
            i = (i * 31) + C9740tS0.k(this.Z[i2]);
        }
        return i;
    }

    public final void j(int i) {
        if (i >= 0 && i < this.Y0) {
            return;
        }
        throw new IndexOutOfBoundsException(l(i));
    }

    @Override // java.util.AbstractList, java.util.List
    /* renamed from: k */
    public Boolean get(int i) {
        return Boolean.valueOf(getBoolean(i));
    }

    public final String l(int i) {
        return "Index:" + i + ", Size:" + this.Y0;
    }

    @Override // o.H2, java.util.AbstractList, java.util.List
    /* renamed from: p */
    public Boolean remove(int i) {
        int i2;
        d();
        j(i);
        boolean[] zArr = this.Z;
        boolean z = zArr[i];
        if (i < this.Y0 - 1) {
            System.arraycopy(zArr, i + 1, zArr, i, (i2 - i) - 1);
        }
        this.Y0--;
        ((AbstractList) this).modCount++;
        return Boolean.valueOf(z);
    }

    @Override // o.H2, java.util.AbstractList, java.util.List
    /* renamed from: r */
    public Boolean set(int i, Boolean bool) {
        return Boolean.valueOf(Z(i, bool.booleanValue()));
    }

    @Override // java.util.AbstractList
    public void removeRange(int i, int i2) {
        d();
        if (i2 >= i) {
            boolean[] zArr = this.Z;
            System.arraycopy(zArr, i2, zArr, i, this.Y0 - i2);
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

    public C3170Ho(boolean[] zArr, int i) {
        this.Z = zArr;
        this.Y0 = i;
    }

    @Override // o.C9740tS0.k, o.C9740tS0.i
    /* renamed from: o */
    public C9740tS0.k<Boolean> o2(int i) {
        if (i >= this.Y0) {
            return new C3170Ho(Arrays.copyOf(this.Z, i), this.Y0);
        }
        throw new IllegalArgumentException();
    }

    @Override // o.H2, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean remove(Object obj) {
        d();
        for (int i = 0; i < this.Y0; i++) {
            if (obj.equals(Boolean.valueOf(this.Z[i]))) {
                boolean[] zArr = this.Z;
                System.arraycopy(zArr, i + 1, zArr, i, (this.Y0 - i) - 1);
                this.Y0--;
                ((AbstractList) this).modCount++;
                return true;
            }
        }
        return false;
    }
}
