package o;

/* renamed from: o.l90  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C7695l90<T> implements InterfaceC10929yL<T> {
    public InterfaceC10929yL<T> X;

    public void a(InterfaceC10929yL<T> interfaceC10929yL) {
        this.X = interfaceC10929yL;
    }

    @Override // o.InterfaceC10929yL
    public void accept(T t) {
        C6562gT0.n(this.X, "Listener is not set.");
        this.X.accept(t);
    }
}
