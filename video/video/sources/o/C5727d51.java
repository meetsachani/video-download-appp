package o;

import android.util.LongSparseArray;
import java.util.Iterator;

/* renamed from: o.d51  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5727d51 {

    /* renamed from: o.d51$a */
    /* loaded from: classes.dex */
    public static final class a extends J41 {
        public int X;
        public final /* synthetic */ LongSparseArray<T> Y;

        public a(LongSparseArray<T> longSparseArray) {
            this.Y = longSparseArray;
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
            LongSparseArray<T> longSparseArray = this.Y;
            int i = this.X;
            this.X = i + 1;
            return longSparseArray.keyAt(i);
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* renamed from: o.d51$b */
    /* loaded from: classes.dex */
    public static final class b<T> implements Iterator<T>, GW0 {
        public int X;
        public final /* synthetic */ LongSparseArray<T> Y;

        public b(LongSparseArray<T> longSparseArray) {
            this.Y = longSparseArray;
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
            LongSparseArray<T> longSparseArray = this.Y;
            int i = this.X;
            this.X = i + 1;
            return longSparseArray.valueAt(i);
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public static final <T> boolean a(LongSparseArray<T> longSparseArray, long j) {
        if (longSparseArray.indexOfKey(j) >= 0) {
            return true;
        }
        return false;
    }

    public static final <T> boolean b(LongSparseArray<T> longSparseArray, long j) {
        if (longSparseArray.indexOfKey(j) >= 0) {
            return true;
        }
        return false;
    }

    public static final <T> boolean c(LongSparseArray<T> longSparseArray, T t) {
        if (longSparseArray.indexOfValue(t) >= 0) {
            return true;
        }
        return false;
    }

    public static final <T> void d(LongSparseArray<T> longSparseArray, VA0<? super Long, ? super T, C7458kA2> va0) {
        int size = longSparseArray.size();
        for (int i = 0; i < size; i++) {
            va0.i(Long.valueOf(longSparseArray.keyAt(i)), longSparseArray.valueAt(i));
        }
    }

    public static final <T> T e(LongSparseArray<T> longSparseArray, long j, T t) {
        T t2 = longSparseArray.get(j);
        if (t2 == null) {
            return t;
        }
        return t2;
    }

    public static final <T> T f(LongSparseArray<T> longSparseArray, long j, FA0<? extends T> fa0) {
        T t = longSparseArray.get(j);
        if (t == null) {
            return fa0.invoke();
        }
        return t;
    }

    public static final <T> int g(LongSparseArray<T> longSparseArray) {
        return longSparseArray.size();
    }

    public static final <T> boolean h(LongSparseArray<T> longSparseArray) {
        if (longSparseArray.size() == 0) {
            return true;
        }
        return false;
    }

    public static final <T> boolean i(LongSparseArray<T> longSparseArray) {
        if (longSparseArray.size() != 0) {
            return true;
        }
        return false;
    }

    public static final <T> J41 j(LongSparseArray<T> longSparseArray) {
        return new a(longSparseArray);
    }

    public static final <T> LongSparseArray<T> k(LongSparseArray<T> longSparseArray, LongSparseArray<T> longSparseArray2) {
        LongSparseArray<T> longSparseArray3 = new LongSparseArray<>(longSparseArray.size() + longSparseArray2.size());
        l(longSparseArray3, longSparseArray);
        l(longSparseArray3, longSparseArray2);
        return longSparseArray3;
    }

    public static final <T> void l(LongSparseArray<T> longSparseArray, LongSparseArray<T> longSparseArray2) {
        int size = longSparseArray2.size();
        for (int i = 0; i < size; i++) {
            longSparseArray.put(longSparseArray2.keyAt(i), longSparseArray2.valueAt(i));
        }
    }

    public static final <T> boolean m(LongSparseArray<T> longSparseArray, long j, T t) {
        int indexOfKey = longSparseArray.indexOfKey(j);
        if (indexOfKey >= 0 && C6562gT0.g(t, longSparseArray.valueAt(indexOfKey))) {
            longSparseArray.removeAt(indexOfKey);
            return true;
        }
        return false;
    }

    public static final <T> void n(LongSparseArray<T> longSparseArray, long j, T t) {
        longSparseArray.put(j, t);
    }

    public static final <T> Iterator<T> o(LongSparseArray<T> longSparseArray) {
        return new b(longSparseArray);
    }
}
