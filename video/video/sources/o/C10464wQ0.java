package o;

/* renamed from: o.wQ0  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C10464wQ0<T> implements InterfaceC5884dk0<T>, FY0<T> {
    public static final C10464wQ0<Object> b = new C10464wQ0<>(null);
    public final T a;

    public C10464wQ0(T t) {
        this.a = t;
    }

    public static <T> InterfaceC5884dk0<T> a(T t) {
        return new C10464wQ0(C10421wF1.c(t, "instance cannot be null"));
    }

    public static <T> InterfaceC5884dk0<T> b(T t) {
        if (t == null) {
            return c();
        }
        return new C10464wQ0(t);
    }

    public static <T> C10464wQ0<T> c() {
        return (C10464wQ0<T>) b;
    }

    @Override // o.InterfaceC6272fK1
    public T get() {
        return this.a;
    }
}
