package o;

/* renamed from: o.Mb2  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public class C3610Mb2 {
    @XP0
    public static final Void a() {
        throw new C9592sr1(null, 1, null);
    }

    @XP0
    public static final Void b(String str) {
        C6562gT0.p(str, SQ0.n);
        throw new C9592sr1("An operation is not implemented: " + str);
    }

    @XP0
    @InterfaceC6480g82(version = "1.1")
    public static final <T> T c(T t, HA0<? super T, C7458kA2> ha0) {
        C6562gT0.p(ha0, "block");
        ha0.invoke(t);
        return t;
    }

    @XP0
    public static final <T> T d(T t, HA0<? super T, C7458kA2> ha0) {
        C6562gT0.p(ha0, "block");
        ha0.invoke(t);
        return t;
    }

    @XP0
    public static final <T, R> R e(T t, HA0<? super T, ? extends R> ha0) {
        C6562gT0.p(ha0, "block");
        return ha0.invoke(t);
    }

    @XP0
    public static final void f(int i, HA0<? super Integer, C7458kA2> ha0) {
        C6562gT0.p(ha0, "action");
        for (int i2 = 0; i2 < i; i2++) {
            ha0.invoke(Integer.valueOf(i2));
        }
    }

    @XP0
    public static final <T, R> R g(T t, HA0<? super T, ? extends R> ha0) {
        C6562gT0.p(ha0, "block");
        return ha0.invoke(t);
    }

    @XP0
    public static final <R> R h(FA0<? extends R> fa0) {
        C6562gT0.p(fa0, "block");
        return fa0.invoke();
    }

    @XP0
    @InterfaceC6480g82(version = "1.1")
    public static final <T> T i(T t, HA0<? super T, Boolean> ha0) {
        C6562gT0.p(ha0, "predicate");
        if (ha0.invoke(t).booleanValue()) {
            return t;
        }
        return null;
    }

    @XP0
    @InterfaceC6480g82(version = "1.1")
    public static final <T> T j(T t, HA0<? super T, Boolean> ha0) {
        C6562gT0.p(ha0, "predicate");
        if (!ha0.invoke(t).booleanValue()) {
            return t;
        }
        return null;
    }

    @XP0
    public static final <T, R> R k(T t, HA0<? super T, ? extends R> ha0) {
        C6562gT0.p(ha0, "block");
        return ha0.invoke(t);
    }
}
