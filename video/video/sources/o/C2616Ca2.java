package o;

import android.util.SparseBooleanArray;

/* renamed from: o.Ca2  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2616Ca2 {

    /* renamed from: o.Ca2$a */
    /* loaded from: classes.dex */
    public static final class a extends AbstractC8515oR0 {
        public int X;
        public final /* synthetic */ SparseBooleanArray Y;

        public a(SparseBooleanArray sparseBooleanArray) {
            this.Y = sparseBooleanArray;
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
            SparseBooleanArray sparseBooleanArray = this.Y;
            int i = this.X;
            this.X = i + 1;
            return sparseBooleanArray.keyAt(i);
        }
    }

    /* renamed from: o.Ca2$b */
    /* loaded from: classes.dex */
    public static final class b extends AbstractC3659Mo {
        public int X;
        public final /* synthetic */ SparseBooleanArray Y;

        public b(SparseBooleanArray sparseBooleanArray) {
            this.Y = sparseBooleanArray;
        }

        @Override // o.AbstractC3659Mo
        public boolean c() {
            SparseBooleanArray sparseBooleanArray = this.Y;
            int i = this.X;
            this.X = i + 1;
            return sparseBooleanArray.valueAt(i);
        }

        public final int d() {
            return this.X;
        }

        public final void e(int i) {
            this.X = i;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            if (this.X < this.Y.size()) {
                return true;
            }
            return false;
        }
    }

    public static final boolean a(SparseBooleanArray sparseBooleanArray, int i) {
        if (sparseBooleanArray.indexOfKey(i) >= 0) {
            return true;
        }
        return false;
    }

    public static final boolean b(SparseBooleanArray sparseBooleanArray, int i) {
        if (sparseBooleanArray.indexOfKey(i) >= 0) {
            return true;
        }
        return false;
    }

    public static final boolean c(SparseBooleanArray sparseBooleanArray, boolean z) {
        if (sparseBooleanArray.indexOfValue(z) >= 0) {
            return true;
        }
        return false;
    }

    public static final void d(SparseBooleanArray sparseBooleanArray, VA0<? super Integer, ? super Boolean, C7458kA2> va0) {
        int size = sparseBooleanArray.size();
        for (int i = 0; i < size; i++) {
            va0.i(Integer.valueOf(sparseBooleanArray.keyAt(i)), Boolean.valueOf(sparseBooleanArray.valueAt(i)));
        }
    }

    public static final boolean e(SparseBooleanArray sparseBooleanArray, int i, boolean z) {
        return sparseBooleanArray.get(i, z);
    }

    public static final boolean f(SparseBooleanArray sparseBooleanArray, int i, FA0<Boolean> fa0) {
        int indexOfKey = sparseBooleanArray.indexOfKey(i);
        if (indexOfKey >= 0) {
            return sparseBooleanArray.valueAt(indexOfKey);
        }
        return fa0.invoke().booleanValue();
    }

    public static final int g(SparseBooleanArray sparseBooleanArray) {
        return sparseBooleanArray.size();
    }

    public static final boolean h(SparseBooleanArray sparseBooleanArray) {
        if (sparseBooleanArray.size() == 0) {
            return true;
        }
        return false;
    }

    public static final boolean i(SparseBooleanArray sparseBooleanArray) {
        if (sparseBooleanArray.size() != 0) {
            return true;
        }
        return false;
    }

    public static final AbstractC8515oR0 j(SparseBooleanArray sparseBooleanArray) {
        return new a(sparseBooleanArray);
    }

    public static final SparseBooleanArray k(SparseBooleanArray sparseBooleanArray, SparseBooleanArray sparseBooleanArray2) {
        SparseBooleanArray sparseBooleanArray3 = new SparseBooleanArray(sparseBooleanArray.size() + sparseBooleanArray2.size());
        l(sparseBooleanArray3, sparseBooleanArray);
        l(sparseBooleanArray3, sparseBooleanArray2);
        return sparseBooleanArray3;
    }

    public static final void l(SparseBooleanArray sparseBooleanArray, SparseBooleanArray sparseBooleanArray2) {
        int size = sparseBooleanArray2.size();
        for (int i = 0; i < size; i++) {
            sparseBooleanArray.put(sparseBooleanArray2.keyAt(i), sparseBooleanArray2.valueAt(i));
        }
    }

    public static final boolean m(SparseBooleanArray sparseBooleanArray, int i, boolean z) {
        int indexOfKey = sparseBooleanArray.indexOfKey(i);
        if (indexOfKey >= 0 && z == sparseBooleanArray.valueAt(indexOfKey)) {
            sparseBooleanArray.delete(i);
            return true;
        }
        return false;
    }

    public static final void n(SparseBooleanArray sparseBooleanArray, int i, boolean z) {
        sparseBooleanArray.put(i, z);
    }

    public static final AbstractC3659Mo o(SparseBooleanArray sparseBooleanArray) {
        return new b(sparseBooleanArray);
    }
}
