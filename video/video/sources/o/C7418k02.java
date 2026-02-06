package o;

import o.PT1;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* renamed from: o.k02  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C7418k02 {
    /* JADX WARN: Multi-variable type inference failed */
    public static final <T> void c(InterfaceC8396ny<? super T> interfaceC8396ny, T t) {
        AbstractC7762lQ abstractC7762lQ = (AbstractC7762lQ) interfaceC8396ny.getContext().f(AbstractC7762lQ.Y);
        if (abstractC7762lQ != null) {
            interfaceC8396ny.E(abstractC7762lQ, t);
            return;
        }
        PT1.a aVar = PT1.Y;
        interfaceC8396ny.q(PT1.b(t));
    }

    public static final void d(InterfaceC8396ny<?> interfaceC8396ny, Throwable th) {
        AbstractC7762lQ abstractC7762lQ = (AbstractC7762lQ) interfaceC8396ny.getContext().f(AbstractC7762lQ.Y);
        if (abstractC7762lQ != null) {
            interfaceC8396ny.f0(abstractC7762lQ, th);
            return;
        }
        PT1.a aVar = PT1.Y;
        interfaceC8396ny.q(PT1.b(RT1.a(th)));
    }

    @HK1
    @Nullable
    public static final <R> Object e(@NotNull HA0<? super XZ1<? super R>, C7458kA2> ha0, @NotNull HM<? super R> hm) {
        YZ1 yz1 = new YZ1(hm);
        try {
            ha0.invoke(yz1);
        } catch (Throwable th) {
            yz1.R(th);
        }
        Object Q = yz1.Q();
        if (Q == C7289jT0.l()) {
            MV.c(hm);
        }
        return Q;
    }

    @HK1
    public static final <R> Object f(HA0<? super XZ1<? super R>, C7458kA2> ha0, HM<? super R> hm) {
        UP0.e(0);
        YZ1 yz1 = new YZ1(hm);
        try {
            ha0.invoke(yz1);
        } catch (Throwable th) {
            yz1.R(th);
        }
        Object Q = yz1.Q();
        if (Q == C7289jT0.l()) {
            MV.c(hm);
        }
        UP0.e(1);
        return Q;
    }

    @HK1
    @Nullable
    public static final <R> Object g(@NotNull HA0<? super XZ1<? super R>, C7458kA2> ha0, @NotNull HM<? super R> hm) {
        C6682gy2 c6682gy2 = new C6682gy2(hm);
        try {
            ha0.invoke(c6682gy2);
        } catch (Throwable th) {
            c6682gy2.S(th);
        }
        Object T = c6682gy2.T();
        if (T == C7289jT0.l()) {
            MV.c(hm);
        }
        return T;
    }

    @HK1
    public static final <R> Object h(HA0<? super XZ1<? super R>, C7458kA2> ha0, HM<? super R> hm) {
        UP0.e(0);
        C6682gy2 c6682gy2 = new C6682gy2(hm);
        try {
            ha0.invoke(c6682gy2);
        } catch (Throwable th) {
            c6682gy2.S(th);
        }
        Object T = c6682gy2.T();
        if (T == C7289jT0.l()) {
            MV.c(hm);
        }
        UP0.e(1);
        return T;
    }
}
