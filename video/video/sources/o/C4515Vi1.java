package o;

import android.content.Context;

/* renamed from: o.Vi1  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4515Vi1 implements InterfaceC5884dk0<C4418Ui1> {
    public final InterfaceC6272fK1<Context> a;
    public final InterfaceC6272fK1<C6055eR> b;

    public C4515Vi1(InterfaceC6272fK1<Context> interfaceC6272fK1, InterfaceC6272fK1<C6055eR> interfaceC6272fK12) {
        this.a = interfaceC6272fK1;
        this.b = interfaceC6272fK12;
    }

    public static C4515Vi1 a(InterfaceC6272fK1<Context> interfaceC6272fK1, InterfaceC6272fK1<C6055eR> interfaceC6272fK12) {
        return new C4515Vi1(interfaceC6272fK1, interfaceC6272fK12);
    }

    public static C4418Ui1 c(Context context, Object obj) {
        return new C4418Ui1(context, (C6055eR) obj);
    }

    @Override // o.InterfaceC6272fK1
    /* renamed from: b */
    public C4418Ui1 get() {
        return c(this.a.get(), this.b.get());
    }
}
