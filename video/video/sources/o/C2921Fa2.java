package o;

import android.util.SparseLongArray;

/* renamed from: o.Fa2  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2921Fa2 {

    /* renamed from: o.Fa2$a */
    /* loaded from: classes.dex */
    public static final class a extends AbstractC8515oR0 {
        public int X;
        public final /* synthetic */ SparseLongArray Y;

        public a(SparseLongArray sparseLongArray) {
            this.Y = sparseLongArray;
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
            SparseLongArray sparseLongArray = this.Y;
            int i = this.X;
            this.X = i + 1;
            return sparseLongArray.keyAt(i);
        }
    }

    /* renamed from: o.Fa2$b */
    /* loaded from: classes.dex */
    public static final class b extends J41 {
        public int X;
        public final /* synthetic */ SparseLongArray Y;

        public b(SparseLongArray sparseLongArray) {
            this.Y = sparseLongArray;
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

        @Override // o.J41
        public long nextLong() {
            SparseLongArray sparseLongArray = this.Y;
            int i = this.X;
            this.X = i + 1;
            return sparseLongArray.valueAt(i);
        }
    }

    public static final boolean a(SparseLongArray sparseLongArray, int i) {
        if (sparseLongArray.indexOfKey(i) >= 0) {
            return true;
        }
        return false;
    }

    public static final boolean b(SparseLongArray sparseLongArray, int i) {
        if (sparseLongArray.indexOfKey(i) >= 0) {
            return true;
        }
        return false;
    }

    public static final boolean c(SparseLongArray sparseLongArray, long j) {
        if (sparseLongArray.indexOfValue(j) >= 0) {
            return true;
        }
        return false;
    }

    public static final void d(SparseLongArray sparseLongArray, VA0<? super Integer, ? super Long, C7458kA2> va0) {
        int size = sparseLongArray.size();
        for (int i = 0; i < size; i++) {
            va0.i(Integer.valueOf(sparseLongArray.keyAt(i)), Long.valueOf(sparseLongArray.valueAt(i)));
        }
    }

    public static final long e(SparseLongArray sparseLongArray, int i, long j) {
        return sparseLongArray.get(i, j);
    }

    public static final long f(SparseLongArray sparseLongArray, int i, FA0<Long> fa0) {
        int indexOfKey = sparseLongArray.indexOfKey(i);
        if (indexOfKey >= 0) {
            return sparseLongArray.valueAt(indexOfKey);
        }
        return fa0.invoke().longValue();
    }

    public static final int g(SparseLongArray sparseLongArray) {
        return sparseLongArray.size();
    }

    public static final boolean h(SparseLongArray sparseLongArray) {
        if (sparseLongArray.size() == 0) {
            return true;
        }
        return false;
    }

    public static final boolean i(SparseLongArray sparseLongArray) {
        if (sparseLongArray.size() != 0) {
            return true;
        }
        return false;
    }

    public static final AbstractC8515oR0 j(SparseLongArray sparseLongArray) {
        return new a(sparseLongArray);
    }

    public static final SparseLongArray k(SparseLongArray sparseLongArray, SparseLongArray sparseLongArray2) {
        SparseLongArray sparseLongArray3 = new SparseLongArray(sparseLongArray.size() + sparseLongArray2.size());
        l(sparseLongArray3, sparseLongArray);
        l(sparseLongArray3, sparseLongArray2);
        return sparseLongArray3;
    }

    public static final void l(SparseLongArray sparseLongArray, SparseLongArray sparseLongArray2) {
        int size = sparseLongArray2.size();
        for (int i = 0; i < size; i++) {
            sparseLongArray.put(sparseLongArray2.keyAt(i), sparseLongArray2.valueAt(i));
        }
    }

    public static final boolean m(SparseLongArray sparseLongArray, int i, long j) {
        int indexOfKey = sparseLongArray.indexOfKey(i);
        if (indexOfKey >= 0 && j == sparseLongArray.valueAt(indexOfKey)) {
            sparseLongArray.removeAt(indexOfKey);
            return true;
        }
        return false;
    }

    public static final void n(SparseLongArray sparseLongArray, int i, long j) {
        sparseLongArray.put(i, j);
    }

    public static final J41 o(SparseLongArray sparseLongArray) {
        return new b(sparseLongArray);
    }
}
