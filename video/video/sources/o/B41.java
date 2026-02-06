package o;

import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;
import o.C9740tS0;

/* loaded from: classes.dex */
public final class B41 extends H2<Long> implements C9740tS0.i, RandomAccess, InterfaceC7989mH1 {
    public static final B41 Z0;
    public int Y0;
    public long[] Z;

    static {
        B41 b41 = new B41(new long[0], 0);
        Z0 = b41;
        b41.M0();
    }

    public B41() {
        this(new long[10], 0);
    }

    public static B41 i() {
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
    public boolean addAll(Collection<? extends Long> collection) {
        d();
        C9740tS0.d(collection);
        if (!(collection instanceof B41)) {
            return super.addAll(collection);
        }
        B41 b41 = (B41) collection;
        int i = b41.Y0;
        if (i == 0) {
            return false;
        }
        int i2 = this.Y0;
        if (Integer.MAX_VALUE - i2 >= i) {
            int i3 = i2 + i;
            long[] jArr = this.Z;
            if (i3 > jArr.length) {
                this.Z = Arrays.copyOf(jArr, i3);
            }
            System.arraycopy(b41.Z, 0, this.Z, this.Y0, b41.Y0);
            this.Y0 = i3;
            ((AbstractList) this).modCount++;
            return true;
        }
        throw new OutOfMemoryError();
    }

    @Override // o.H2, java.util.AbstractList, java.util.List
    /* renamed from: e */
    public void add(int i, Long l) {
        h(i, l.longValue());
    }

    @Override // o.H2, java.util.AbstractList, java.util.Collection, java.util.List
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof B41)) {
            return super.equals(obj);
        }
        B41 b41 = (B41) obj;
        if (this.Y0 != b41.Y0) {
            return false;
        }
        long[] jArr = b41.Z;
        for (int i = 0; i < this.Y0; i++) {
            if (this.Z[i] != jArr[i]) {
                return false;
            }
        }
        return true;
    }

    @Override // o.H2, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    /* renamed from: f */
    public boolean add(Long l) {
        i4(l.longValue());
        return true;
    }

    @Override // o.C9740tS0.i
    public long getLong(int i) {
        j(i);
        return this.Z[i];
    }

    public final void h(int i, long j) {
        int i2;
        d();
        if (i >= 0 && i <= (i2 = this.Y0)) {
            long[] jArr = this.Z;
            if (i2 < jArr.length) {
                System.arraycopy(jArr, i, jArr, i + 1, i2 - i);
            } else {
                long[] jArr2 = new long[((i2 * 3) / 2) + 1];
                System.arraycopy(jArr, 0, jArr2, 0, i);
                System.arraycopy(this.Z, i, jArr2, i + 1, this.Y0 - i);
                this.Z = jArr2;
            }
            this.Z[i] = j;
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
            i = (i * 31) + C9740tS0.s(this.Z[i2]);
        }
        return i;
    }

    @Override // o.C9740tS0.i
    public void i4(long j) {
        d();
        int i = this.Y0;
        long[] jArr = this.Z;
        if (i == jArr.length) {
            long[] jArr2 = new long[((i * 3) / 2) + 1];
            System.arraycopy(jArr, 0, jArr2, 0, i);
            this.Z = jArr2;
        }
        long[] jArr3 = this.Z;
        int i2 = this.Y0;
        this.Y0 = i2 + 1;
        jArr3[i2] = j;
    }

    @Override // java.util.AbstractList, java.util.List
    /* renamed from: k */
    public Long get(int i) {
        return Long.valueOf(getLong(i));
    }

    @Override // o.H2, java.util.AbstractList, java.util.List
    /* renamed from: p */
    public Long remove(int i) {
        int i2;
        d();
        j(i);
        long[] jArr = this.Z;
        long j = jArr[i];
        if (i < this.Y0 - 1) {
            System.arraycopy(jArr, i + 1, jArr, i, (i2 - i) - 1);
        }
        this.Y0--;
        ((AbstractList) this).modCount++;
        return Long.valueOf(j);
    }

    @Override // o.C9740tS0.i
    public long q0(int i, long j) {
        d();
        j(i);
        long[] jArr = this.Z;
        long j2 = jArr[i];
        jArr[i] = j;
        return j2;
    }

    @Override // o.H2, java.util.AbstractList, java.util.List
    /* renamed from: r */
    public Long set(int i, Long l) {
        return Long.valueOf(q0(i, l.longValue()));
    }

    @Override // java.util.AbstractList
    public void removeRange(int i, int i2) {
        d();
        if (i2 >= i) {
            long[] jArr = this.Z;
            System.arraycopy(jArr, i2, jArr, i, this.Y0 - i2);
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

    public B41(long[] jArr, int i) {
        this.Z = jArr;
        this.Y0 = i;
    }

    @Override // o.C9740tS0.k, o.C9740tS0.i
    /* renamed from: o */
    public C9740tS0.k<Long> o2(int i) {
        if (i >= this.Y0) {
            return new B41(Arrays.copyOf(this.Z, i), this.Y0);
        }
        throw new IllegalArgumentException();
    }

    @Override // o.H2, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean remove(Object obj) {
        d();
        for (int i = 0; i < this.Y0; i++) {
            if (obj.equals(Long.valueOf(this.Z[i]))) {
                long[] jArr = this.Z;
                System.arraycopy(jArr, i + 1, jArr, i, (this.Y0 - i) - 1);
                this.Y0--;
                ((AbstractList) this).modCount++;
                return true;
            }
        }
        return false;
    }
}
