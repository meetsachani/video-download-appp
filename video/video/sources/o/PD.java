package o;

/* loaded from: classes4.dex */
public class PD<T> implements InterfaceC3287Is2<T, T> {
    public static final InterfaceC3287Is2 X = new PD();

    public static <T> InterfaceC3287Is2<T, T> b() {
        return X;
    }

    @Override // o.InterfaceC3287Is2
    public T a(T t) {
        if (t == null) {
            return null;
        }
        return (T) C6029eK1.a(t).a();
    }
}
