package o;

import android.content.Context;

/* renamed from: o.We0  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4595We0 implements InterfaceC5884dk0<String> {
    public final InterfaceC6272fK1<Context> a;

    public C4595We0(InterfaceC6272fK1<Context> interfaceC6272fK1) {
        this.a = interfaceC6272fK1;
    }

    public static C4595We0 a(InterfaceC6272fK1<Context> interfaceC6272fK1) {
        return new C4595We0(interfaceC6272fK1);
    }

    public static String c(Context context) {
        return (String) C10421wF1.c(AbstractC4401Ue0.d(context), "Cannot return null from a non-@Nullable @Provides method");
    }

    @Override // o.InterfaceC6272fK1
    /* renamed from: b */
    public String get() {
        return c(this.a.get());
    }
}
