package o;

import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;
import o.C9740tS0;

/* renamed from: o.fv0  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C6413fv0 extends H2<Float> implements C9740tS0.f, RandomAccess, InterfaceC7989mH1 {
    public static final C6413fv0 Z0;
    public int Y0;
    public float[] Z;

    static {
        C6413fv0 c6413fv0 = new C6413fv0(new float[0], 0);
        Z0 = c6413fv0;
        c6413fv0.M0();
    }

    public C6413fv0() {
        this(new float[10], 0);
    }

    public static C6413fv0 i() {
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

    @Override // o.C9740tS0.f
    public void D0(float f) {
        d();
        int i = this.Y0;
        float[] fArr = this.Z;
        if (i == fArr.length) {
            float[] fArr2 = new float[((i * 3) / 2) + 1];
            System.arraycopy(fArr, 0, fArr2, 0, i);
            this.Z = fArr2;
        }
        float[] fArr3 = this.Z;
        int i2 = this.Y0;
        this.Y0 = i2 + 1;
        fArr3[i2] = f;
    }

    @Override // o.C9740tS0.f
    public float T(int i, float f) {
        d();
        j(i);
        float[] fArr = this.Z;
        float f2 = fArr[i];
        fArr[i] = f;
        return f2;
    }

    @Override // o.H2, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean addAll(Collection<? extends Float> collection) {
        d();
        C9740tS0.d(collection);
        if (!(collection instanceof C6413fv0)) {
            return super.addAll(collection);
        }
        C6413fv0 c6413fv0 = (C6413fv0) collection;
        int i = c6413fv0.Y0;
        if (i == 0) {
            return false;
        }
        int i2 = this.Y0;
        if (Integer.MAX_VALUE - i2 >= i) {
            int i3 = i2 + i;
            float[] fArr = this.Z;
            if (i3 > fArr.length) {
                this.Z = Arrays.copyOf(fArr, i3);
            }
            System.arraycopy(c6413fv0.Z, 0, this.Z, this.Y0, c6413fv0.Y0);
            this.Y0 = i3;
            ((AbstractList) this).modCount++;
            return true;
        }
        throw new OutOfMemoryError();
    }

    @Override // o.H2, java.util.AbstractList, java.util.List
    /* renamed from: e */
    public void add(int i, Float f) {
        h(i, f.floatValue());
    }

    @Override // o.H2, java.util.AbstractList, java.util.Collection, java.util.List
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C6413fv0)) {
            return super.equals(obj);
        }
        C6413fv0 c6413fv0 = (C6413fv0) obj;
        if (this.Y0 != c6413fv0.Y0) {
            return false;
        }
        float[] fArr = c6413fv0.Z;
        for (int i = 0; i < this.Y0; i++) {
            if (Float.floatToIntBits(this.Z[i]) != Float.floatToIntBits(fArr[i])) {
                return false;
            }
        }
        return true;
    }

    @Override // o.H2, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    /* renamed from: f */
    public boolean add(Float f) {
        D0(f.floatValue());
        return true;
    }

    @Override // o.C9740tS0.f
    public float getFloat(int i) {
        j(i);
        return this.Z[i];
    }

    public final void h(int i, float f) {
        int i2;
        d();
        if (i >= 0 && i <= (i2 = this.Y0)) {
            float[] fArr = this.Z;
            if (i2 < fArr.length) {
                System.arraycopy(fArr, i, fArr, i + 1, i2 - i);
            } else {
                float[] fArr2 = new float[((i2 * 3) / 2) + 1];
                System.arraycopy(fArr, 0, fArr2, 0, i);
                System.arraycopy(this.Z, i, fArr2, i + 1, this.Y0 - i);
                this.Z = fArr2;
            }
            this.Z[i] = f;
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
            i = (i * 31) + Float.floatToIntBits(this.Z[i2]);
        }
        return i;
    }

    @Override // java.util.AbstractList, java.util.List
    /* renamed from: k */
    public Float get(int i) {
        return Float.valueOf(getFloat(i));
    }

    @Override // o.H2, java.util.AbstractList, java.util.List
    /* renamed from: p */
    public Float remove(int i) {
        int i2;
        d();
        j(i);
        float[] fArr = this.Z;
        float f = fArr[i];
        if (i < this.Y0 - 1) {
            System.arraycopy(fArr, i + 1, fArr, i, (i2 - i) - 1);
        }
        this.Y0--;
        ((AbstractList) this).modCount++;
        return Float.valueOf(f);
    }

    @Override // o.H2, java.util.AbstractList, java.util.List
    /* renamed from: r */
    public Float set(int i, Float f) {
        return Float.valueOf(T(i, f.floatValue()));
    }

    @Override // java.util.AbstractList
    public void removeRange(int i, int i2) {
        d();
        if (i2 >= i) {
            float[] fArr = this.Z;
            System.arraycopy(fArr, i2, fArr, i, this.Y0 - i2);
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

    public C6413fv0(float[] fArr, int i) {
        this.Z = fArr;
        this.Y0 = i;
    }

    @Override // o.C9740tS0.k, o.C9740tS0.i
    /* renamed from: o */
    public C9740tS0.k<Float> o2(int i) {
        if (i >= this.Y0) {
            return new C6413fv0(Arrays.copyOf(this.Z, i), this.Y0);
        }
        throw new IllegalArgumentException();
    }

    @Override // o.H2, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean remove(Object obj) {
        d();
        for (int i = 0; i < this.Y0; i++) {
            if (obj.equals(Float.valueOf(this.Z[i]))) {
                float[] fArr = this.Z;
                System.arraycopy(fArr, i + 1, fArr, i, (this.Y0 - i) - 1);
                this.Y0--;
                ((AbstractList) this).modCount++;
                return true;
            }
        }
        return false;
    }
}
