package o;

import java.util.concurrent.Executor;

/* renamed from: o.w00  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C10360w00 implements InterfaceC5884dk0<C10114v00> {
    public final InterfaceC6272fK1<Executor> a;
    public final InterfaceC6272fK1<InterfaceC9562sk> b;
    public final InterfaceC6272fK1<InterfaceC8257nN2> c;
    public final InterfaceC6272fK1<InterfaceC4207Se0> d;
    public final InterfaceC6272fK1<InterfaceC8826pj2> e;

    public C10360w00(InterfaceC6272fK1<Executor> interfaceC6272fK1, InterfaceC6272fK1<InterfaceC9562sk> interfaceC6272fK12, InterfaceC6272fK1<InterfaceC8257nN2> interfaceC6272fK13, InterfaceC6272fK1<InterfaceC4207Se0> interfaceC6272fK14, InterfaceC6272fK1<InterfaceC8826pj2> interfaceC6272fK15) {
        this.a = interfaceC6272fK1;
        this.b = interfaceC6272fK12;
        this.c = interfaceC6272fK13;
        this.d = interfaceC6272fK14;
        this.e = interfaceC6272fK15;
    }

    public static C10360w00 a(InterfaceC6272fK1<Executor> interfaceC6272fK1, InterfaceC6272fK1<InterfaceC9562sk> interfaceC6272fK12, InterfaceC6272fK1<InterfaceC8257nN2> interfaceC6272fK13, InterfaceC6272fK1<InterfaceC4207Se0> interfaceC6272fK14, InterfaceC6272fK1<InterfaceC8826pj2> interfaceC6272fK15) {
        return new C10360w00(interfaceC6272fK1, interfaceC6272fK12, interfaceC6272fK13, interfaceC6272fK14, interfaceC6272fK15);
    }

    public static C10114v00 c(Executor executor, InterfaceC9562sk interfaceC9562sk, InterfaceC8257nN2 interfaceC8257nN2, InterfaceC4207Se0 interfaceC4207Se0, InterfaceC8826pj2 interfaceC8826pj2) {
        return new C10114v00(executor, interfaceC9562sk, interfaceC8257nN2, interfaceC4207Se0, interfaceC8826pj2);
    }

    @Override // o.InterfaceC6272fK1
    /* renamed from: b */
    public C10114v00 get() {
        return c(this.a.get(), this.b.get(), this.c.get(), this.d.get(), this.e.get());
    }
}
