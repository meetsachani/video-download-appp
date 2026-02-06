package o;

/* loaded from: classes2.dex */
public final class S10<T> implements InterfaceC5884dk0<T> {
    public InterfaceC6272fK1<T> a;

    public static <T> void b(InterfaceC6272fK1<T> interfaceC6272fK1, InterfaceC6272fK1<T> interfaceC6272fK12) {
        C10421wF1.b(interfaceC6272fK12);
        S10 s10 = (S10) interfaceC6272fK1;
        if (s10.a == null) {
            s10.a = interfaceC6272fK12;
            return;
        }
        throw new IllegalStateException();
    }

    public InterfaceC6272fK1<T> a() {
        return (InterfaceC6272fK1) C10421wF1.b(this.a);
    }

    @Deprecated
    public void c(InterfaceC6272fK1<T> interfaceC6272fK1) {
        b(this, interfaceC6272fK1);
    }

    @Override // o.InterfaceC6272fK1
    public T get() {
        InterfaceC6272fK1<T> interfaceC6272fK1 = this.a;
        if (interfaceC6272fK1 != null) {
            return interfaceC6272fK1.get();
        }
        throw new IllegalStateException();
    }
}
