package o;

/* renamed from: o.jX1  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C7303jX1 implements InterfaceC5884dk0<C7062iX1> {
    public final InterfaceC6272fK1<ND> a;
    public final InterfaceC6272fK1<ND> b;
    public final InterfaceC6272fK1<AbstractC4304Te0> c;
    public final InterfaceC6272fK1<C10736xY1> d;
    public final InterfaceC6272fK1<String> e;

    public C7303jX1(InterfaceC6272fK1<ND> interfaceC6272fK1, InterfaceC6272fK1<ND> interfaceC6272fK12, InterfaceC6272fK1<AbstractC4304Te0> interfaceC6272fK13, InterfaceC6272fK1<C10736xY1> interfaceC6272fK14, InterfaceC6272fK1<String> interfaceC6272fK15) {
        this.a = interfaceC6272fK1;
        this.b = interfaceC6272fK12;
        this.c = interfaceC6272fK13;
        this.d = interfaceC6272fK14;
        this.e = interfaceC6272fK15;
    }

    public static C7303jX1 a(InterfaceC6272fK1<ND> interfaceC6272fK1, InterfaceC6272fK1<ND> interfaceC6272fK12, InterfaceC6272fK1<AbstractC4304Te0> interfaceC6272fK13, InterfaceC6272fK1<C10736xY1> interfaceC6272fK14, InterfaceC6272fK1<String> interfaceC6272fK15) {
        return new C7303jX1(interfaceC6272fK1, interfaceC6272fK12, interfaceC6272fK13, interfaceC6272fK14, interfaceC6272fK15);
    }

    public static C7062iX1 c(ND nd, ND nd2, Object obj, Object obj2, InterfaceC6272fK1<String> interfaceC6272fK1) {
        return new C7062iX1(nd, nd2, (AbstractC4304Te0) obj, (C10736xY1) obj2, interfaceC6272fK1);
    }

    @Override // o.InterfaceC6272fK1
    /* renamed from: b */
    public C7062iX1 get() {
        return c(this.a.get(), this.b.get(), this.c.get(), this.d.get(), this.e);
    }
}
