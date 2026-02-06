package o;

import android.content.Context;

/* renamed from: o.fR  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C6298fR implements InterfaceC5884dk0<C6055eR> {
    public final InterfaceC6272fK1<Context> a;
    public final InterfaceC6272fK1<ND> b;
    public final InterfaceC6272fK1<ND> c;

    public C6298fR(InterfaceC6272fK1<Context> interfaceC6272fK1, InterfaceC6272fK1<ND> interfaceC6272fK12, InterfaceC6272fK1<ND> interfaceC6272fK13) {
        this.a = interfaceC6272fK1;
        this.b = interfaceC6272fK12;
        this.c = interfaceC6272fK13;
    }

    public static C6298fR a(InterfaceC6272fK1<Context> interfaceC6272fK1, InterfaceC6272fK1<ND> interfaceC6272fK12, InterfaceC6272fK1<ND> interfaceC6272fK13) {
        return new C6298fR(interfaceC6272fK1, interfaceC6272fK12, interfaceC6272fK13);
    }

    public static C6055eR c(Context context, ND nd, ND nd2) {
        return new C6055eR(context, nd, nd2);
    }

    @Override // o.InterfaceC6272fK1
    /* renamed from: b */
    public C6055eR get() {
        return c(this.a.get(), this.b.get(), this.c.get());
    }
}
