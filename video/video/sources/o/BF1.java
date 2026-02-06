package o;

@InterfaceC8303na2({"SMAP\nPreconditions.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Preconditions.kt\nkotlin/PreconditionsKt__PreconditionsKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,146:1\n1#2:147\n*E\n"})
/* loaded from: classes3.dex */
public class BF1 extends AF1 {
    @XP0
    public static final void c(boolean z) {
        if (z) {
            return;
        }
        throw new IllegalStateException("Check failed.");
    }

    @XP0
    public static final void d(boolean z, FA0<? extends Object> fa0) {
        C6562gT0.p(fa0, "lazyMessage");
        if (z) {
            return;
        }
        throw new IllegalStateException(fa0.invoke().toString());
    }

    @XP0
    public static final <T> T e(T t) {
        if (t != null) {
            return t;
        }
        throw new IllegalStateException("Required value was null.");
    }

    @XP0
    public static final <T> T f(T t, FA0<? extends Object> fa0) {
        C6562gT0.p(fa0, "lazyMessage");
        if (t != null) {
            return t;
        }
        throw new IllegalStateException(fa0.invoke().toString());
    }

    @XP0
    public static final Void g(Object obj) {
        C6562gT0.p(obj, "message");
        throw new IllegalStateException(obj.toString());
    }

    @XP0
    public static final void h(boolean z) {
        if (z) {
            return;
        }
        throw new IllegalArgumentException("Failed requirement.");
    }

    @XP0
    public static final void i(boolean z, FA0<? extends Object> fa0) {
        C6562gT0.p(fa0, "lazyMessage");
        if (z) {
            return;
        }
        throw new IllegalArgumentException(fa0.invoke().toString());
    }

    @XP0
    public static final <T> T j(T t) {
        if (t != null) {
            return t;
        }
        throw new IllegalArgumentException("Required value was null.");
    }

    @XP0
    public static final <T> T k(T t, FA0<? extends Object> fa0) {
        C6562gT0.p(fa0, "lazyMessage");
        if (t != null) {
            return t;
        }
        throw new IllegalArgumentException(fa0.invoke().toString());
    }
}
