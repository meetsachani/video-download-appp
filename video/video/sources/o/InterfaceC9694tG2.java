package o;

/* renamed from: o.tG2  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public interface InterfaceC9694tG2 {

    /* renamed from: o.tG2$a */
    /* loaded from: classes.dex */
    public enum a {
        ACTIVE_STREAMING,
        ACTIVE_NON_STREAMING,
        INACTIVE
    }

    void a(C3051Gi2 c3051Gi2);

    default InterfaceC2789Dt1<AbstractC3242Ih1> b() {
        return C9464sK.f(null);
    }

    default void c(C3051Gi2 c3051Gi2, EnumC5905dp2 enumC5905dp2) {
        a(c3051Gi2);
    }

    default InterfaceC2789Dt1<AbstractC2824Ed2> d() {
        return AbstractC2824Ed2.e;
    }

    default InterfaceC7235jF2 f(InterfaceC6420fx interfaceC6420fx) {
        return InterfaceC7235jF2.a;
    }

    default void e(a aVar) {
    }
}
