package o;

/* loaded from: classes.dex */
public final class ZD0 {

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* loaded from: classes.dex */
    public class a<T> implements b<T> {
        public volatile T a;
        public final /* synthetic */ b b;

        public a(b bVar) {
            this.b = bVar;
        }

        @Override // o.ZD0.b
        public T get() {
            if (this.a == null) {
                synchronized (this) {
                    try {
                        if (this.a == null) {
                            this.a = (T) C10175vF1.e(this.b.get());
                        }
                    } finally {
                    }
                }
            }
            return this.a;
        }
    }

    /* loaded from: classes.dex */
    public interface b<T> {
        T get();
    }

    public static <T> b<T> a(b<T> bVar) {
        return new a(bVar);
    }
}
