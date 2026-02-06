package o;

import java.util.concurrent.Executor;

/* loaded from: classes2.dex */
public final class XM2 implements InterfaceC5884dk0<WM2> {
    public final InterfaceC6272fK1<Executor> a;
    public final InterfaceC6272fK1<InterfaceC4207Se0> b;
    public final InterfaceC6272fK1<InterfaceC8257nN2> c;
    public final InterfaceC6272fK1<InterfaceC8826pj2> d;

    public XM2(InterfaceC6272fK1<Executor> interfaceC6272fK1, InterfaceC6272fK1<InterfaceC4207Se0> interfaceC6272fK12, InterfaceC6272fK1<InterfaceC8257nN2> interfaceC6272fK13, InterfaceC6272fK1<InterfaceC8826pj2> interfaceC6272fK14) {
        this.a = interfaceC6272fK1;
        this.b = interfaceC6272fK12;
        this.c = interfaceC6272fK13;
        this.d = interfaceC6272fK14;
    }

    public static XM2 a(InterfaceC6272fK1<Executor> interfaceC6272fK1, InterfaceC6272fK1<InterfaceC4207Se0> interfaceC6272fK12, InterfaceC6272fK1<InterfaceC8257nN2> interfaceC6272fK13, InterfaceC6272fK1<InterfaceC8826pj2> interfaceC6272fK14) {
        return new XM2(interfaceC6272fK1, interfaceC6272fK12, interfaceC6272fK13, interfaceC6272fK14);
    }

    public static WM2 c(Executor executor, InterfaceC4207Se0 interfaceC4207Se0, InterfaceC8257nN2 interfaceC8257nN2, InterfaceC8826pj2 interfaceC8826pj2) {
        return new WM2(executor, interfaceC4207Se0, interfaceC8257nN2, interfaceC8826pj2);
    }

    @Override // o.InterfaceC6272fK1
    /* renamed from: b */
    public WM2 get() {
        return c(this.a.get(), this.b.get(), this.c.get(), this.d.get());
    }
}
