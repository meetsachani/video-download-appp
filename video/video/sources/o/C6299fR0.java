package o;

import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;
import o.C9740tS0;

/* renamed from: o.fR0  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C6299fR0 extends H2<Integer> implements C9740tS0.g, RandomAccess, InterfaceC7989mH1 {
    public static final C6299fR0 Z0;
    public int Y0;
    public int[] Z;

    static {
        C6299fR0 c6299fR0 = new C6299fR0(new int[0], 0);
        Z0 = c6299fR0;
        c6299fR0.M0();
    }

    public C6299fR0() {
        this(new int[10], 0);
    }

    public static C6299fR0 i() {
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

    @Override // o.C9740tS0.g
    public void H3(int i) {
        d();
        int i2 = this.Y0;
        int[] iArr = this.Z;
        if (i2 == iArr.length) {
            int[] iArr2 = new int[((i2 * 3) / 2) + 1];
            System.arraycopy(iArr, 0, iArr2, 0, i2);
            this.Z = iArr2;
        }
        int[] iArr3 = this.Z;
        int i3 = this.Y0;
        this.Y0 = i3 + 1;
        iArr3[i3] = i;
    }

    @Override // o.C9740tS0.g
    public int O(int i, int i2) {
        d();
        j(i);
        int[] iArr = this.Z;
        int i3 = iArr[i];
        iArr[i] = i2;
        return i3;
    }

    @Override // o.H2, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean addAll(Collection<? extends Integer> collection) {
        d();
        C9740tS0.d(collection);
        if (!(collection instanceof C6299fR0)) {
            return super.addAll(collection);
        }
        C6299fR0 c6299fR0 = (C6299fR0) collection;
        int i = c6299fR0.Y0;
        if (i == 0) {
            return false;
        }
        int i2 = this.Y0;
        if (Integer.MAX_VALUE - i2 >= i) {
            int i3 = i2 + i;
            int[] iArr = this.Z;
            if (i3 > iArr.length) {
                this.Z = Arrays.copyOf(iArr, i3);
            }
            System.arraycopy(c6299fR0.Z, 0, this.Z, this.Y0, c6299fR0.Y0);
            this.Y0 = i3;
            ((AbstractList) this).modCount++;
            return true;
        }
        throw new OutOfMemoryError();
    }

    @Override // o.H2, java.util.AbstractList, java.util.List
    /* renamed from: e */
    public void add(int i, Integer num) {
        h(i, num.intValue());
    }

    @Override // o.H2, java.util.AbstractList, java.util.Collection, java.util.List
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C6299fR0)) {
            return super.equals(obj);
        }
        C6299fR0 c6299fR0 = (C6299fR0) obj;
        if (this.Y0 != c6299fR0.Y0) {
            return false;
        }
        int[] iArr = c6299fR0.Z;
        for (int i = 0; i < this.Y0; i++) {
            if (this.Z[i] != iArr[i]) {
                return false;
            }
        }
        return true;
    }

    @Override // o.H2, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    /* renamed from: f */
    public boolean add(Integer num) {
        H3(num.intValue());
        return true;
    }

    @Override // o.C9740tS0.g
    public int getInt(int i) {
        j(i);
        return this.Z[i];
    }

    public final void h(int i, int i2) {
        int i3;
        d();
        if (i >= 0 && i <= (i3 = this.Y0)) {
            int[] iArr = this.Z;
            if (i3 < iArr.length) {
                System.arraycopy(iArr, i, iArr, i + 1, i3 - i);
            } else {
                int[] iArr2 = new int[((i3 * 3) / 2) + 1];
                System.arraycopy(iArr, 0, iArr2, 0, i);
                System.arraycopy(this.Z, i, iArr2, i + 1, this.Y0 - i);
                this.Z = iArr2;
            }
            this.Z[i] = i2;
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
            i = (i * 31) + this.Z[i2];
        }
        return i;
    }

    @Override // java.util.AbstractList, java.util.List
    /* renamed from: k */
    public Integer get(int i) {
        return Integer.valueOf(getInt(i));
    }

    @Override // o.H2, java.util.AbstractList, java.util.List
    /* renamed from: p */
    public Integer remove(int i) {
        int i2;
        d();
        j(i);
        int[] iArr = this.Z;
        int i3 = iArr[i];
        if (i < this.Y0 - 1) {
            System.arraycopy(iArr, i + 1, iArr, i, (i2 - i) - 1);
        }
        this.Y0--;
        ((AbstractList) this).modCount++;
        return Integer.valueOf(i3);
    }

    @Override // o.H2, java.util.AbstractList, java.util.List
    /* renamed from: r */
    public Integer set(int i, Integer num) {
        return Integer.valueOf(O(i, num.intValue()));
    }

    @Override // java.util.AbstractList
    public void removeRange(int i, int i2) {
        d();
        if (i2 >= i) {
            int[] iArr = this.Z;
            System.arraycopy(iArr, i2, iArr, i, this.Y0 - i2);
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

    public C6299fR0(int[] iArr, int i) {
        this.Z = iArr;
        this.Y0 = i;
    }

    @Override // o.C9740tS0.k, o.C9740tS0.i
    /* renamed from: o */
    public C9740tS0.k<Integer> o2(int i) {
        if (i >= this.Y0) {
            return new C6299fR0(Arrays.copyOf(this.Z, i), this.Y0);
        }
        throw new IllegalArgumentException();
    }

    @Override // o.H2, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean remove(Object obj) {
        d();
        for (int i = 0; i < this.Y0; i++) {
            if (obj.equals(Integer.valueOf(this.Z[i]))) {
                int[] iArr = this.Z;
                System.arraycopy(iArr, i + 1, iArr, i, (this.Y0 - i) - 1);
                this.Y0--;
                ((AbstractList) this).modCount++;
                return true;
            }
        }
        return false;
    }
}
