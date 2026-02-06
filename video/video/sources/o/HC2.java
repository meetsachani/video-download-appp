package o;

import android.content.Context;
import java.util.concurrent.Executor;

/* loaded from: classes2.dex */
public final class HC2 implements InterfaceC5884dk0<GC2> {
    public final InterfaceC6272fK1<Context> a;
    public final InterfaceC6272fK1<InterfaceC9562sk> b;
    public final InterfaceC6272fK1<InterfaceC4207Se0> c;
    public final InterfaceC6272fK1<InterfaceC8257nN2> d;
    public final InterfaceC6272fK1<Executor> e;
    public final InterfaceC6272fK1<InterfaceC8826pj2> f;
    public final InterfaceC6272fK1<ND> g;
    public final InterfaceC6272fK1<ND> h;
    public final InterfaceC6272fK1<GD> i;

    public HC2(InterfaceC6272fK1<Context> interfaceC6272fK1, InterfaceC6272fK1<InterfaceC9562sk> interfaceC6272fK12, InterfaceC6272fK1<InterfaceC4207Se0> interfaceC6272fK13, InterfaceC6272fK1<InterfaceC8257nN2> interfaceC6272fK14, InterfaceC6272fK1<Executor> interfaceC6272fK15, InterfaceC6272fK1<InterfaceC8826pj2> interfaceC6272fK16, InterfaceC6272fK1<ND> interfaceC6272fK17, InterfaceC6272fK1<ND> interfaceC6272fK18, InterfaceC6272fK1<GD> interfaceC6272fK19) {
        this.a = interfaceC6272fK1;
        this.b = interfaceC6272fK12;
        this.c = interfaceC6272fK13;
        this.d = interfaceC6272fK14;
        this.e = interfaceC6272fK15;
        this.f = interfaceC6272fK16;
        this.g = interfaceC6272fK17;
        this.h = interfaceC6272fK18;
        this.i = interfaceC6272fK19;
    }

    public static HC2 a(InterfaceC6272fK1<Context> interfaceC6272fK1, InterfaceC6272fK1<InterfaceC9562sk> interfaceC6272fK12, InterfaceC6272fK1<InterfaceC4207Se0> interfaceC6272fK13, InterfaceC6272fK1<InterfaceC8257nN2> interfaceC6272fK14, InterfaceC6272fK1<Executor> interfaceC6272fK15, InterfaceC6272fK1<InterfaceC8826pj2> interfaceC6272fK16, InterfaceC6272fK1<ND> interfaceC6272fK17, InterfaceC6272fK1<ND> interfaceC6272fK18, InterfaceC6272fK1<GD> interfaceC6272fK19) {
        return new HC2(interfaceC6272fK1, interfaceC6272fK12, interfaceC6272fK13, interfaceC6272fK14, interfaceC6272fK15, interfaceC6272fK16, interfaceC6272fK17, interfaceC6272fK18, interfaceC6272fK19);
    }

    public static GC2 c(Context context, InterfaceC9562sk interfaceC9562sk, InterfaceC4207Se0 interfaceC4207Se0, InterfaceC8257nN2 interfaceC8257nN2, Executor executor, InterfaceC8826pj2 interfaceC8826pj2, ND nd, ND nd2, GD gd) {
        return new GC2(context, interfaceC9562sk, interfaceC4207Se0, interfaceC8257nN2, executor, interfaceC8826pj2, nd, nd2, gd);
    }

    @Override // o.InterfaceC6272fK1
    /* renamed from: b */
    public GC2 get() {
        return c(this.a.get(), this.b.get(), this.c.get(), this.d.get(), this.e.get(), this.f.get(), this.g.get(), this.h.get(), this.i.get());
    }
}
