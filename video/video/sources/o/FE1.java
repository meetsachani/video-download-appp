package o;

/* loaded from: classes.dex */
public final class FE1 {

    /* loaded from: classes.dex */
    public interface a<T> {
        T a();

        boolean b(T t);
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

        @Override // o.FE1.a
        public T a() {
            int i = this.b;
            if (i <= 0) {
                return null;
            }
            int i2 = i - 1;
            T t = (T) this.a[i2];
            C6562gT0.n(t, "null cannot be cast to non-null type T of androidx.core.util.Pools.SimplePool");
            this.a[i2] = null;
            this.b--;
            return t;
        }

        @Override // o.FE1.a
        public boolean b(T t) {
            C6562gT0.p(t, "instance");
            if (!c(t)) {
                int i = this.b;
                Object[] objArr = this.a;
                if (i < objArr.length) {
                    objArr[i] = t;
                    this.b = i + 1;
                    return true;
                }
                return false;
            }
            throw new IllegalStateException("Already in the pool!");
        }

        public final boolean c(T t) {
            int i = this.b;
            for (int i2 = 0; i2 < i; i2++) {
                if (this.a[i2] == t) {
                    return true;
                }
            }
            return false;
        }
    }

    /* loaded from: classes.dex */
    public static class c<T> extends b<T> {
        public final Object c;

        public c(int i) {
            super(i);
            this.c = new Object();
        }

        @Override // o.FE1.b, o.FE1.a
        public T a() {
            T t;
            synchronized (this.c) {
                t = (T) super.a();
            }
            return t;
        }

        @Override // o.FE1.b, o.FE1.a
        public boolean b(T t) {
            boolean b;
            C6562gT0.p(t, "instance");
            synchronized (this.c) {
                b = super.b(t);
            }
            return b;
        }
    }
}
