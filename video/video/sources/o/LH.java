package o;

import java.util.concurrent.CompletableFuture;
import java.util.function.BiFunction;
import o.RU0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes4.dex */
public final class LH<T> extends AbstractC9384s0<T> implements BiFunction<T, Throwable, C7458kA2> {
    @NotNull
    public final CompletableFuture<T> Y0;

    public LH(@NotNull InterfaceC5809dQ interfaceC5809dQ, @NotNull CompletableFuture<T> completableFuture) {
        super(interfaceC5809dQ, true, true);
        this.Y0 = completableFuture;
    }

    @Override // o.AbstractC9384s0
    public void Q1(@NotNull Throwable th, boolean z) {
        this.Y0.completeExceptionally(th);
    }

    @Override // o.AbstractC9384s0
    public void R1(T t) {
        this.Y0.complete(t);
    }

    public void T1(@Nullable T t, @Nullable Throwable th) {
        RU0.a.b(this, null, 1, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.function.BiFunction
    public /* bridge */ /* synthetic */ C7458kA2 apply(Object obj, Throwable th) {
        T1(obj, th);
        return C7458kA2.a;
    }
}
