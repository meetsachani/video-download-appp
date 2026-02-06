package o;

/* loaded from: classes2.dex */
public final class Y40<T> implements InterfaceC6272fK1<T>, FY0<T> {
    public static final Object c = new Object();
    public static final /* synthetic */ boolean d = false;
    public volatile InterfaceC6272fK1<T> a;
    public volatile Object b = c;

    public Y40(InterfaceC6272fK1<T> interfaceC6272fK1) {
        this.a = interfaceC6272fK1;
    }

    public static <P extends InterfaceC6272fK1<T>, T> FY0<T> a(P p) {
        if (p instanceof FY0) {
            return (FY0) p;
        }
        return new Y40((InterfaceC6272fK1) C10421wF1.b(p));
    }

    public static <P extends InterfaceC6272fK1<T>, T> InterfaceC6272fK1<T> b(P p) {
        C10421wF1.b(p);
        if (p instanceof Y40) {
            return p;
        }
        return new Y40(p);
    }

    public static Object c(Object obj, Object obj2) {
        if (obj != c && !(obj instanceof C5149ai1)) {
            if (obj == obj2) {
                return obj2;
            }
            throw new IllegalStateException("Scoped provider was invoked recursively returning different results: " + obj + " & " + obj2 + ". This is likely due to a circular dependency.");
        }
        return obj2;
    }

    @Override // o.InterfaceC6272fK1
    public T get() {
        T t;
        T t2 = (T) this.b;
        Object obj = c;
        if (t2 == obj) {
            synchronized (this) {
                try {
                    t = (T) this.b;
                    if (t == obj) {
                        t = this.a.get();
                        this.b = c(this.b, t);
                        this.a = null;
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
