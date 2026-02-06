package o;

/* loaded from: classes2.dex */
public final class Wt2 implements InterfaceC5884dk0<Ut2> {
    public final InterfaceC6272fK1<ND> a;
    public final InterfaceC6272fK1<ND> b;
    public final InterfaceC6272fK1<InterfaceC6081eY1> c;
    public final InterfaceC6272fK1<GC2> d;
    public final InterfaceC6272fK1<WM2> e;

    public Wt2(InterfaceC6272fK1<ND> interfaceC6272fK1, InterfaceC6272fK1<ND> interfaceC6272fK12, InterfaceC6272fK1<InterfaceC6081eY1> interfaceC6272fK13, InterfaceC6272fK1<GC2> interfaceC6272fK14, InterfaceC6272fK1<WM2> interfaceC6272fK15) {
        this.a = interfaceC6272fK1;
        this.b = interfaceC6272fK12;
        this.c = interfaceC6272fK13;
        this.d = interfaceC6272fK14;
        this.e = interfaceC6272fK15;
    }

    public static Wt2 a(InterfaceC6272fK1<ND> interfaceC6272fK1, InterfaceC6272fK1<ND> interfaceC6272fK12, InterfaceC6272fK1<InterfaceC6081eY1> interfaceC6272fK13, InterfaceC6272fK1<GC2> interfaceC6272fK14, InterfaceC6272fK1<WM2> interfaceC6272fK15) {
        return new Wt2(interfaceC6272fK1, interfaceC6272fK12, interfaceC6272fK13, interfaceC6272fK14, interfaceC6272fK15);
    }

    public static Ut2 c(ND nd, ND nd2, InterfaceC6081eY1 interfaceC6081eY1, GC2 gc2, WM2 wm2) {
        return new Ut2(nd, nd2, interfaceC6081eY1, gc2, wm2);
    }

    @Override // o.InterfaceC6272fK1
    /* renamed from: b */
    public Ut2 get() {
        return c(this.a.get(), this.b.get(), this.c.get(), this.d.get(), this.e.get());
    }
}
