package o;

/* renamed from: o.Ye0  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4789Ye0 implements InterfaceC5884dk0<AbstractC4304Te0> {

    /* renamed from: o.Ye0$a */
    /* loaded from: classes2.dex */
    public static final class a {
        public static final C4789Ye0 a = new C4789Ye0();
    }

    public static C4789Ye0 a() {
        return a.a;
    }

    public static AbstractC4304Te0 c() {
        return (AbstractC4304Te0) C10421wF1.c(AbstractC4401Ue0.f(), "Cannot return null from a non-@Nullable @Provides method");
    }

    @Override // o.InterfaceC6272fK1
    /* renamed from: b */
    public AbstractC4304Te0 get() {
        return c();
    }
}
