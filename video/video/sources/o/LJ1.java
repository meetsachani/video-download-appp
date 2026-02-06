package o;

/* loaded from: classes3.dex */
public final class LJ1 {
    @XP0
    @InterfaceC6480g82(version = "1.4")
    public static final <V> V a(UW0<? extends V> uw0, Object obj, TW0<?> tw0) {
        C6562gT0.p(uw0, "<this>");
        C6562gT0.p(tw0, "property");
        return uw0.get();
    }

    @XP0
    @InterfaceC6480g82(version = "1.4")
    public static final <T, V> V b(VW0<T, ? extends V> vw0, T t, TW0<?> tw0) {
        C6562gT0.p(vw0, "<this>");
        C6562gT0.p(tw0, "property");
        return vw0.get(t);
    }

    @XP0
    @InterfaceC6480g82(version = "1.4")
    public static final <V> void c(OW0<V> ow0, Object obj, TW0<?> tw0, V v) {
        C6562gT0.p(ow0, "<this>");
        C6562gT0.p(tw0, "property");
        ow0.set(v);
    }

    @XP0
    @InterfaceC6480g82(version = "1.4")
    public static final <T, V> void d(PW0<T, V> pw0, T t, TW0<?> tw0, V v) {
        C6562gT0.p(pw0, "<this>");
        C6562gT0.p(tw0, "property");
        pw0.z(t, v);
    }
}
