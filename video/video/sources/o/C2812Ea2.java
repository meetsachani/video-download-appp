package o;

import android.util.SparseIntArray;

/* renamed from: o.Ea2  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2812Ea2 {

    /* renamed from: o.Ea2$a */
    /* loaded from: classes.dex */
    public static final class a extends AbstractC8515oR0 {
        public int X;
        public final /* synthetic */ SparseIntArray Y;

        public a(SparseIntArray sparseIntArray) {
            this.Y = sparseIntArray;
        }

        public final int b() {
            return this.X;
        }

        public final void c(int i) {
            this.X = i;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            if (this.X < this.Y.size()) {
                return true;
            }
            return false;
        }

        @Override // o.AbstractC8515oR0
        public int nextInt() {
            SparseIntArray sparseIntArray = this.Y;
            int i = this.X;
            this.X = i + 1;
            return sparseIntArray.keyAt(i);
        }
    }

    /* renamed from: o.Ea2$b */
    /* loaded from: classes.dex */
    public static final class b extends AbstractC8515oR0 {
        public int X;
        public final /* synthetic */ SparseIntArray Y;

        public b(SparseIntArray sparseIntArray) {
            this.Y = sparseIntArray;
        }

        public final int b() {
            return this.X;
        }

        public final void c(int i) {
            this.X = i;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            if (this.X < this.Y.size()) {
                return true;
            }
            return false;
        }

        @Override // o.AbstractC8515oR0
        public int nextInt() {
            SparseIntArray sparseIntArray = this.Y;
            int i = this.X;
            this.X = i + 1;
            return sparseIntArray.valueAt(i);
        }
    }

    public static final boolean a(SparseIntArray sparseIntArray, int i) {
        if (sparseIntArray.indexOfKey(i) >= 0) {
            return true;
        }
        return false;
    }

    public static final boolean b(SparseIntArray sparseIntArray, int i) {
        if (sparseIntArray.indexOfKey(i) >= 0) {
            return true;
        }
        return false;
    }

    public static final boolean c(SparseIntArray sparseIntArray, int i) {
        if (sparseIntArray.indexOfValue(i) >= 0) {
            return true;
        }
        return false;
    }

    public static final void d(SparseIntArray sparseIntArray, VA0<? super Integer, ? super Integer, C7458kA2> va0) {
        int size = sparseIntArray.size();
        for (int i = 0; i < size; i++) {
            va0.i(Integer.valueOf(sparseIntArray.keyAt(i)), Integer.valueOf(sparseIntArray.valueAt(i)));
        }
    }

    public static final int e(SparseIntArray sparseIntArray, int i, int i2) {
        return sparseIntArray.get(i, i2);
    }

    public static final int f(SparseIntArray sparseIntArray, int i, FA0<Integer> fa0) {
        int indexOfKey = sparseIntArray.indexOfKey(i);
        if (indexOfKey >= 0) {
            return sparseIntArray.valueAt(indexOfKey);
        }
        return fa0.invoke().intValue();
    }

    public static final int g(SparseIntArray sparseIntArray) {
        return sparseIntArray.size();
    }

    public static final boolean h(SparseIntArray sparseIntArray) {
        if (sparseIntArray.size() == 0) {
            return true;
        }
        return false;
    }

    public static final boolean i(SparseIntArray sparseIntArray) {
        if (sparseIntArray.size() != 0) {
            return true;
        }
        return false;
    }

    public static final AbstractC8515oR0 j(SparseIntArray sparseIntArray) {
        return new a(sparseIntArray);
    }

    public static final SparseIntArray k(SparseIntArray sparseIntArray, SparseIntArray sparseIntArray2) {
        SparseIntArray sparseIntArray3 = new SparseIntArray(sparseIntArray.size() + sparseIntArray2.size());
        l(sparseIntArray3, sparseIntArray);
        l(sparseIntArray3, sparseIntArray2);
        return sparseIntArray3;
    }

    public static final void l(SparseIntArray sparseIntArray, SparseIntArray sparseIntArray2) {
        int size = sparseIntArray2.size();
        for (int i = 0; i < size; i++) {
            sparseIntArray.put(sparseIntArray2.keyAt(i), sparseIntArray2.valueAt(i));
        }
    }

    public static final boolean m(SparseIntArray sparseIntArray, int i, int i2) {
        int indexOfKey = sparseIntArray.indexOfKey(i);
        if (indexOfKey >= 0 && i2 == sparseIntArray.valueAt(indexOfKey)) {
            sparseIntArray.removeAt(indexOfKey);
            return true;
        }
        return false;
    }

    public static final void n(SparseIntArray sparseIntArray, int i, int i2) {
        sparseIntArray.put(i, i2);
    }

    public static final AbstractC8515oR0 o(SparseIntArray sparseIntArray) {
        return new b(sparseIntArray);
    }
}
