package o;

import org.jetbrains.annotations.Nullable;

@InterfaceC8046mW0(name = "AutoCloseableKt")
/* renamed from: o.Wh  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C4606Wh {

    /* renamed from: o.Wh$a */
    /* loaded from: classes3.dex */
    public static final class a implements AutoCloseable {
        public final /* synthetic */ FA0<C7458kA2> X;

        public a(FA0<C7458kA2> fa0) {
            this.X = fa0;
        }

        @Override // java.lang.AutoCloseable
        public final void close() {
            this.X.invoke();
        }
    }

    @XP0
    @InterfaceC6480g82(version = "2.0")
    public static final AutoCloseable a(FA0<C7458kA2> fa0) {
        C6562gT0.p(fa0, "closeAction");
        return new a(fa0);
    }

    @HK1
    @InterfaceC6480g82(version = "1.2")
    public static final void c(@Nullable AutoCloseable autoCloseable, @Nullable Throwable th) {
        if (autoCloseable != null) {
            if (th == null) {
                C2597Bu1.a(autoCloseable);
                return;
            }
            try {
                C2597Bu1.a(autoCloseable);
            } catch (Throwable th2) {
                C3917Pf0.a(th, th2);
            }
        }
    }

    @XP0
    @InterfaceC6480g82(version = "1.2")
    public static final <T extends AutoCloseable, R> R d(T t, HA0<? super T, ? extends R> ha0) {
        C6562gT0.p(ha0, "block");
        try {
            R invoke = ha0.invoke(t);
            UP0.d(1);
            c(t, null);
            UP0.c(1);
            return invoke;
        } finally {
        }
    }

    @InterfaceC6480g82(version = "2.0")
    public static /* synthetic */ void b() {
    }
}
