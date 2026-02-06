package o;

import java.util.concurrent.Executor;

/* renamed from: o.eg0  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C6110eg0 implements InterfaceC5884dk0<Executor> {

    /* renamed from: o.eg0$a */
    /* loaded from: classes2.dex */
    public static final class a {
        public static final C6110eg0 a = new C6110eg0();
    }

    public static C6110eg0 a() {
        return a.a;
    }

    public static Executor b() {
        return (Executor) C10421wF1.c(AbstractC5868dg0.a(), "Cannot return null from a non-@Nullable @Provides method");
    }

    @Override // o.InterfaceC6272fK1
    /* renamed from: c */
    public Executor get() {
        return b();
    }
}
