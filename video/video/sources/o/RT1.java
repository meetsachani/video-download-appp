package o;

import o.PT1;
import org.jetbrains.annotations.NotNull;

@InterfaceC8303na2({"SMAP\nResult.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Result.kt\nkotlin/ResultKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,340:1\n1#2:341\n*E\n"})
/* loaded from: classes3.dex */
public final class RT1 {
    @HK1
    @InterfaceC6480g82(version = "1.3")
    @NotNull
    public static final Object a(@NotNull Throwable th) {
        C6562gT0.p(th, "exception");
        return new PT1.b(th);
    }

    @XP0
    @InterfaceC6480g82(version = "1.3")
    public static final <R, T> R b(Object obj, HA0<? super T, ? extends R> ha0, HA0<? super Throwable, ? extends R> ha02) {
        C6562gT0.p(ha0, "onSuccess");
        C6562gT0.p(ha02, "onFailure");
        Throwable e = PT1.e(obj);
        if (e == null) {
            return ha0.invoke(obj);
        }
        return ha02.invoke(e);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @XP0
    @InterfaceC6480g82(version = "1.3")
    public static final <R, T extends R> R c(Object obj, R r) {
        if (PT1.i(obj)) {
            return r;
        }
        return obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @XP0
    @InterfaceC6480g82(version = "1.3")
    public static final <R, T extends R> R d(Object obj, HA0<? super Throwable, ? extends R> ha0) {
        C6562gT0.p(ha0, "onFailure");
        Throwable e = PT1.e(obj);
        if (e == null) {
            return obj;
        }
        return ha0.invoke(e);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @XP0
    @InterfaceC6480g82(version = "1.3")
    public static final <T> T e(Object obj) {
        n(obj);
        return obj;
    }

    @XP0
    @InterfaceC6480g82(version = "1.3")
    public static final <R, T> Object f(Object obj, HA0<? super T, ? extends R> ha0) {
        C6562gT0.p(ha0, "transform");
        if (PT1.j(obj)) {
            PT1.a aVar = PT1.Y;
            return PT1.b(ha0.invoke(obj));
        }
        return PT1.b(obj);
    }

    @XP0
    @InterfaceC6480g82(version = "1.3")
    public static final <R, T> Object g(Object obj, HA0<? super T, ? extends R> ha0) {
        C6562gT0.p(ha0, "transform");
        if (PT1.j(obj)) {
            try {
                PT1.a aVar = PT1.Y;
                return PT1.b(ha0.invoke(obj));
            } catch (Throwable th) {
                PT1.a aVar2 = PT1.Y;
                return PT1.b(a(th));
            }
        }
        return PT1.b(obj);
    }

    @XP0
    @InterfaceC6480g82(version = "1.3")
    public static final <T> Object h(Object obj, HA0<? super Throwable, C7458kA2> ha0) {
        C6562gT0.p(ha0, "action");
        Throwable e = PT1.e(obj);
        if (e != null) {
            ha0.invoke(e);
        }
        return obj;
    }

    @XP0
    @InterfaceC6480g82(version = "1.3")
    public static final <T> Object i(Object obj, HA0<? super T, C7458kA2> ha0) {
        C6562gT0.p(ha0, "action");
        if (PT1.j(obj)) {
            ha0.invoke(obj);
        }
        return obj;
    }

    @XP0
    @InterfaceC6480g82(version = "1.3")
    public static final <R, T extends R> Object j(Object obj, HA0<? super Throwable, ? extends R> ha0) {
        C6562gT0.p(ha0, "transform");
        Throwable e = PT1.e(obj);
        if (e == null) {
            return obj;
        }
        PT1.a aVar = PT1.Y;
        return PT1.b(ha0.invoke(e));
    }

    @XP0
    @InterfaceC6480g82(version = "1.3")
    public static final <R, T extends R> Object k(Object obj, HA0<? super Throwable, ? extends R> ha0) {
        C6562gT0.p(ha0, "transform");
        Throwable e = PT1.e(obj);
        if (e == null) {
            return obj;
        }
        try {
            PT1.a aVar = PT1.Y;
            return PT1.b(ha0.invoke(e));
        } catch (Throwable th) {
            PT1.a aVar2 = PT1.Y;
            return PT1.b(a(th));
        }
    }

    @XP0
    @InterfaceC6480g82(version = "1.3")
    public static final <T, R> Object l(T t, HA0<? super T, ? extends R> ha0) {
        C6562gT0.p(ha0, "block");
        try {
            PT1.a aVar = PT1.Y;
            return PT1.b(ha0.invoke(t));
        } catch (Throwable th) {
            PT1.a aVar2 = PT1.Y;
            return PT1.b(a(th));
        }
    }

    @XP0
    @InterfaceC6480g82(version = "1.3")
    public static final <R> Object m(FA0<? extends R> fa0) {
        C6562gT0.p(fa0, "block");
        try {
            PT1.a aVar = PT1.Y;
            return PT1.b(fa0.invoke());
        } catch (Throwable th) {
            PT1.a aVar2 = PT1.Y;
            return PT1.b(a(th));
        }
    }

    @HK1
    @InterfaceC6480g82(version = "1.3")
    public static final void n(@NotNull Object obj) {
        if (!(obj instanceof PT1.b)) {
            return;
        }
        throw ((PT1.b) obj).X;
    }
}
