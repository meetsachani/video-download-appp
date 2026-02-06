package o;

import o.PT1;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class MM {

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* loaded from: classes3.dex */
    public static final class a<T> implements HM<T> {
        public final /* synthetic */ InterfaceC5809dQ X;
        public final /* synthetic */ HA0<PT1<? extends T>, C7458kA2> Y;

        /* JADX WARN: Multi-variable type inference failed */
        public a(InterfaceC5809dQ interfaceC5809dQ, HA0<? super PT1<? extends T>, C7458kA2> ha0) {
            this.X = interfaceC5809dQ;
            this.Y = ha0;
        }

        @Override // o.HM
        public InterfaceC5809dQ getContext() {
            return this.X;
        }

        @Override // o.HM
        public void q(Object obj) {
            this.Y.invoke(PT1.a(obj));
        }
    }

    @XP0
    @InterfaceC6480g82(version = "1.3")
    public static final <T> HM<T> a(InterfaceC5809dQ interfaceC5809dQ, HA0<? super PT1<? extends T>, C7458kA2> ha0) {
        C6562gT0.p(interfaceC5809dQ, "context");
        C6562gT0.p(ha0, "resumeWith");
        return new a(interfaceC5809dQ, ha0);
    }

    @InterfaceC6480g82(version = "1.3")
    @NotNull
    public static final <T> HM<C7458kA2> b(@NotNull HA0<? super HM<? super T>, ? extends Object> ha0, @NotNull HM<? super T> hm) {
        C6562gT0.p(ha0, "<this>");
        C6562gT0.p(hm, "completion");
        return new C9758tX1(C7048iT0.e(C7048iT0.b(ha0, hm)), C7289jT0.l());
    }

    @InterfaceC6480g82(version = "1.3")
    @NotNull
    public static final <R, T> HM<C7458kA2> c(@NotNull VA0<? super R, ? super HM<? super T>, ? extends Object> va0, R r, @NotNull HM<? super T> hm) {
        C6562gT0.p(va0, "<this>");
        C6562gT0.p(hm, "completion");
        return new C9758tX1(C7048iT0.e(C7048iT0.c(va0, r, hm)), C7289jT0.l());
    }

    public static final InterfaceC5809dQ d() {
        throw new C9592sr1("Implemented as intrinsic");
    }

    @XP0
    @InterfaceC6480g82(version = "1.3")
    public static final <T> void f(HM<? super T> hm, T t) {
        C6562gT0.p(hm, "<this>");
        PT1.a aVar = PT1.Y;
        hm.q(PT1.b(t));
    }

    @XP0
    @InterfaceC6480g82(version = "1.3")
    public static final <T> void g(HM<? super T> hm, Throwable th) {
        C6562gT0.p(hm, "<this>");
        C6562gT0.p(th, "exception");
        PT1.a aVar = PT1.Y;
        hm.q(PT1.b(RT1.a(th)));
    }

    @InterfaceC6480g82(version = "1.3")
    public static final <T> void h(@NotNull HA0<? super HM<? super T>, ? extends Object> ha0, @NotNull HM<? super T> hm) {
        C6562gT0.p(ha0, "<this>");
        C6562gT0.p(hm, "completion");
        HM e = C7048iT0.e(C7048iT0.b(ha0, hm));
        PT1.a aVar = PT1.Y;
        e.q(PT1.b(C7458kA2.a));
    }

    @InterfaceC6480g82(version = "1.3")
    public static final <R, T> void i(@NotNull VA0<? super R, ? super HM<? super T>, ? extends Object> va0, R r, @NotNull HM<? super T> hm) {
        C6562gT0.p(va0, "<this>");
        C6562gT0.p(hm, "completion");
        HM e = C7048iT0.e(C7048iT0.c(va0, r, hm));
        PT1.a aVar = PT1.Y;
        e.q(PT1.b(C7458kA2.a));
    }

    @XP0
    @InterfaceC6480g82(version = "1.3")
    public static final <T> Object j(HA0<? super HM<? super T>, C7458kA2> ha0, HM<? super T> hm) {
        UP0.e(0);
        C9758tX1 c9758tX1 = new C9758tX1(C7048iT0.e(hm));
        ha0.invoke(c9758tX1);
        Object a2 = c9758tX1.a();
        if (a2 == C7289jT0.l()) {
            MV.c(hm);
        }
        UP0.e(1);
        return a2;
    }

    @XP0
    @InterfaceC6480g82(version = "1.3")
    public static /* synthetic */ void e() {
    }
}
