package o;

import android.content.Context;

/* renamed from: o.pY1  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C8783pY1 implements InterfaceC5884dk0<InterfaceC8257nN2> {
    public final InterfaceC6272fK1<Context> a;
    public final InterfaceC6272fK1<InterfaceC4207Se0> b;
    public final InterfaceC6272fK1<AbstractC6822hY1> c;
    public final InterfaceC6272fK1<ND> d;

    public C8783pY1(InterfaceC6272fK1<Context> interfaceC6272fK1, InterfaceC6272fK1<InterfaceC4207Se0> interfaceC6272fK12, InterfaceC6272fK1<AbstractC6822hY1> interfaceC6272fK13, InterfaceC6272fK1<ND> interfaceC6272fK14) {
        this.a = interfaceC6272fK1;
        this.b = interfaceC6272fK12;
        this.c = interfaceC6272fK13;
        this.d = interfaceC6272fK14;
    }

    public static C8783pY1 a(InterfaceC6272fK1<Context> interfaceC6272fK1, InterfaceC6272fK1<InterfaceC4207Se0> interfaceC6272fK12, InterfaceC6272fK1<AbstractC6822hY1> interfaceC6272fK13, InterfaceC6272fK1<ND> interfaceC6272fK14) {
        return new C8783pY1(interfaceC6272fK1, interfaceC6272fK12, interfaceC6272fK13, interfaceC6272fK14);
    }

    public static InterfaceC8257nN2 c(Context context, InterfaceC4207Se0 interfaceC4207Se0, AbstractC6822hY1 abstractC6822hY1, ND nd) {
        return (InterfaceC8257nN2) C10421wF1.c(AbstractC8540oY1.b(context, interfaceC4207Se0, abstractC6822hY1, nd), "Cannot return null from a non-@Nullable @Provides method");
    }

    @Override // o.InterfaceC6272fK1
    /* renamed from: b */
    public InterfaceC8257nN2 get() {
        return c(this.a.get(), this.b.get(), this.c.get(), this.d.get());
    }
}
