package o;

import o.InterfaceC5809dQ;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@HK1
/* renamed from: o.Bn2  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C2570Bn2 implements InterfaceC5809dQ.c<C11281zn2<?>> {
    @NotNull
    public final ThreadLocal<?> X;

    public C2570Bn2(@NotNull ThreadLocal<?> threadLocal) {
        this.X = threadLocal;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ C2570Bn2 c(C2570Bn2 c2570Bn2, ThreadLocal threadLocal, int i, Object obj) {
        if ((i & 1) != 0) {
            threadLocal = c2570Bn2.X;
        }
        return c2570Bn2.b(threadLocal);
    }

    public final ThreadLocal<?> a() {
        return this.X;
    }

    @NotNull
    public final C2570Bn2 b(@NotNull ThreadLocal<?> threadLocal) {
        return new C2570Bn2(threadLocal);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof C2570Bn2) && C6562gT0.g(this.X, ((C2570Bn2) obj).X)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return this.X.hashCode();
    }

    @NotNull
    public String toString() {
        return "ThreadLocalKey(threadLocal=" + this.X + ')';
    }
}
