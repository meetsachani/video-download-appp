package o;

/* renamed from: o.Qo2  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4052Qo2 implements InterfaceC5884dk0<ND> {

    /* renamed from: o.Qo2$a */
    /* loaded from: classes2.dex */
    public static final class a {
        public static final C4052Qo2 a = new C4052Qo2();
    }

    public static C4052Qo2 a() {
        return a.a;
    }

    public static ND b() {
        return (ND) C10421wF1.c(AbstractC3955Po2.a(), "Cannot return null from a non-@Nullable @Provides method");
    }

    @Override // o.InterfaceC6272fK1
    /* renamed from: c */
    public ND get() {
        return b();
    }
}
