package o;

/* loaded from: classes.dex */
public final class EE1 {
    public static final boolean a = false;

    /* loaded from: classes.dex */
    public interface a<T> {
        T a();

        boolean b(T t);

        void c(T[] tArr, int i);
    }

    /* loaded from: classes.dex */
    public static class b<T> implements a<T> {
        public final Object[] a;
        public int b;

        public b(int i) {
            if (i > 0) {
                this.a = new Object[i];
                return;
            }
            throw new IllegalArgumentException("The max pool size must be > 0");
        }

        @Override // o.EE1.a
        public T a() {
            int i = this.b;
            if (i <= 0) {
                return null;
            }
            int i2 = i - 1;
            Object[] objArr = this.a;
            T t = (T) objArr[i2];
            objArr[i2] = null;
            this.b = i - 1;
            return t;
        }

        @Override // o.EE1.a
        public boolean b(T t) {
            int i = this.b;
            Object[] objArr = this.a;
            if (i < objArr.length) {
                objArr[i] = t;
                this.b = i + 1;
                return true;
            }
            return false;
        }

        @Override // o.EE1.a
        public void c(T[] tArr, int i) {
            if (i > tArr.length) {
                i = tArr.length;
            }
            for (int i2 = 0; i2 < i; i2++) {
                T t = tArr[i2];
                int i3 = this.b;
                Object[] objArr = this.a;
                if (i3 < objArr.length) {
                    objArr[i3] = t;
                    this.b = i3 + 1;
                }
            }
        }

        public final boolean d(T t) {
            for (int i = 0; i < this.b; i++) {
                if (this.a[i] == t) {
                    return true;
                }
            }
            return false;
        }
    }
}
