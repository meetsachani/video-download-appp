package o;

import android.content.Context;

/* renamed from: o.yY1  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C10979yY1 implements InterfaceC5884dk0<C10736xY1> {
    public final InterfaceC6272fK1<Context> a;
    public final InterfaceC6272fK1<String> b;
    public final InterfaceC6272fK1<Integer> c;

    public C10979yY1(InterfaceC6272fK1<Context> interfaceC6272fK1, InterfaceC6272fK1<String> interfaceC6272fK12, InterfaceC6272fK1<Integer> interfaceC6272fK13) {
        this.a = interfaceC6272fK1;
        this.b = interfaceC6272fK12;
        this.c = interfaceC6272fK13;
    }

    public static C10979yY1 a(InterfaceC6272fK1<Context> interfaceC6272fK1, InterfaceC6272fK1<String> interfaceC6272fK12, InterfaceC6272fK1<Integer> interfaceC6272fK13) {
        return new C10979yY1(interfaceC6272fK1, interfaceC6272fK12, interfaceC6272fK13);
    }

    public static C10736xY1 c(Context context, String str, int i) {
        return new C10736xY1(context, str, i);
    }

    @Override // o.InterfaceC6272fK1
    /* renamed from: b */
    public C10736xY1 get() {
        return c(this.a.get(), this.b.get(), this.c.get().intValue());
    }
}
