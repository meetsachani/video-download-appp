package o;

/* loaded from: classes4.dex */
public abstract class TY0<T> implements InterfaceC9217rJ<T> {
    public static final Object b = new Object();
    public volatile T a = (T) b;

    public abstract T a() throws C8725pJ;

    @Override // o.InterfaceC9217rJ
    public T get() throws C8725pJ {
        T t;
        T t2 = this.a;
        Object obj = b;
        if (t2 == obj) {
            synchronized (this) {
                try {
                    t = this.a;
                    if (t == obj) {
                        t = a();
                        this.a = t;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            return t;
        }
        return t2;
    }
}
