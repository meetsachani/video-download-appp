package o;

import android.util.SparseArray;
import java.util.Iterator;

/* renamed from: o.Aa2  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2420Aa2 {

    /* renamed from: o.Aa2$a */
    /* loaded from: classes.dex */
    public static final class a extends AbstractC8515oR0 {
        public int X;
        public final /* synthetic */ SparseArray<T> Y;

        public a(SparseArray<T> sparseArray) {
            this.Y = sparseArray;
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
            SparseArray<T> sparseArray = this.Y;
            int i = this.X;
            this.X = i + 1;
            return sparseArray.keyAt(i);
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* renamed from: o.Aa2$b */
    /* loaded from: classes.dex */
    public static final class b<T> implements Iterator<T>, GW0 {
        public int X;
        public final /* synthetic */ SparseArray<T> Y;

        public b(SparseArray<T> sparseArray) {
            this.Y = sparseArray;
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

        @Override // java.util.Iterator
        public T next() {
            SparseArray<T> sparseArray = this.Y;
            int i = this.X;
            this.X = i + 1;
            return sparseArray.valueAt(i);
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public static final <T> boolean a(SparseArray<T> sparseArray, int i) {
        if (sparseArray.indexOfKey(i) >= 0) {
            return true;
        }
        return false;
    }

    public static final <T> boolean b(SparseArray<T> sparseArray, int i) {
        if (sparseArray.indexOfKey(i) >= 0) {
            return true;
        }
        return false;
    }

    public static final <T> boolean c(SparseArray<T> sparseArray, T t) {
        if (sparseArray.indexOfValue(t) >= 0) {
            return true;
        }
        return false;
    }

    public static final <T> void d(SparseArray<T> sparseArray, VA0<? super Integer, ? super T, C7458kA2> va0) {
        int size = sparseArray.size();
        for (int i = 0; i < size; i++) {
            va0.i(Integer.valueOf(sparseArray.keyAt(i)), sparseArray.valueAt(i));
        }
    }

    public static final <T> T e(SparseArray<T> sparseArray, int i, T t) {
        T t2 = sparseArray.get(i);
        if (t2 == null) {
            return t;
        }
        return t2;
    }

    public static final <T> T f(SparseArray<T> sparseArray, int i, FA0<? extends T> fa0) {
        T t = sparseArray.get(i);
        if (t == null) {
            return fa0.invoke();
        }
        return t;
    }

    public static final <T> int g(SparseArray<T> sparseArray) {
        return sparseArray.size();
    }

    public static final <T> boolean h(SparseArray<T> sparseArray) {
        if (sparseArray.size() == 0) {
            return true;
        }
        return false;
    }

    public static final <T> boolean i(SparseArray<T> sparseArray) {
        if (sparseArray.size() != 0) {
            return true;
        }
        return false;
    }

    public static final <T> AbstractC8515oR0 j(SparseArray<T> sparseArray) {
        return new a(sparseArray);
    }

    public static final <T> SparseArray<T> k(SparseArray<T> sparseArray, SparseArray<T> sparseArray2) {
        SparseArray<T> sparseArray3 = new SparseArray<>(sparseArray.size() + sparseArray2.size());
        l(sparseArray3, sparseArray);
        l(sparseArray3, sparseArray2);
        return sparseArray3;
    }

    public static final <T> void l(SparseArray<T> sparseArray, SparseArray<T> sparseArray2) {
        int size = sparseArray2.size();
        for (int i = 0; i < size; i++) {
            sparseArray.put(sparseArray2.keyAt(i), sparseArray2.valueAt(i));
        }
    }

    public static final <T> boolean m(SparseArray<T> sparseArray, int i, T t) {
        int indexOfKey = sparseArray.indexOfKey(i);
        if (indexOfKey >= 0 && C6562gT0.g(t, sparseArray.valueAt(indexOfKey))) {
            sparseArray.removeAt(indexOfKey);
            return true;
        }
        return false;
    }

    public static final <T> void n(SparseArray<T> sparseArray, int i, T t) {
        sparseArray.put(i, t);
    }

    public static final <T> Iterator<T> o(SparseArray<T> sparseArray) {
        return new b(sparseArray);
    }
}
