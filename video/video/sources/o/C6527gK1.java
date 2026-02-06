package o;

/* renamed from: o.gK1  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C6527gK1<T> implements InterfaceC6272fK1<FY0<T>> {
    public static final /* synthetic */ boolean b = false;
    public final InterfaceC6272fK1<T> a;

    public C6527gK1(InterfaceC6272fK1<T> interfaceC6272fK1) {
        this.a = interfaceC6272fK1;
    }

    public static <T> InterfaceC6272fK1<FY0<T>> a(InterfaceC6272fK1<T> interfaceC6272fK1) {
        return new C6527gK1((InterfaceC6272fK1) C10421wF1.b(interfaceC6272fK1));
    }

    @Override // o.InterfaceC6272fK1
    /* renamed from: b */
    public FY0<T> get() {
        return Y40.a(this.a);
    }
}
