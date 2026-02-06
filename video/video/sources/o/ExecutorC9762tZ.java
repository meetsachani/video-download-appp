package o;

import java.util.concurrent.Executor;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* renamed from: o.tZ  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class ExecutorC9762tZ extends AbstractC7335jg0 implements Executor {
    @NotNull
    public static final ExecutorC9762tZ Y0 = new ExecutorC9762tZ();
    @NotNull
    public static final AbstractC7762lQ Z0;

    static {
        int e;
        OA2 oa2 = OA2.Z;
        e = C3059Gk2.e(C9158r40.a, C5075aO1.u(64, C2852Ek2.a()), 0, 0, 12, null);
        Z0 = AbstractC7762lQ.Z(oa2, e, null, 2, null);
    }

    @Override // o.AbstractC7762lQ
    public void I(@NotNull InterfaceC5809dQ interfaceC5809dQ, @NotNull Runnable runnable) {
        Z0.I(interfaceC5809dQ, runnable);
    }

    @Override // o.AbstractC7762lQ
    @InterfaceC10472wS0
    public void R(@NotNull InterfaceC5809dQ interfaceC5809dQ, @NotNull Runnable runnable) {
        Z0.R(interfaceC5809dQ, runnable);
    }

    @Override // o.AbstractC7762lQ
    @NotNull
    public AbstractC7762lQ W(int i, @Nullable String str) {
        return OA2.Z.W(i, str);
    }

    @Override // o.AbstractC7335jg0, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        throw new IllegalStateException("Cannot be invoked on Dispatchers.IO");
    }

    @Override // java.util.concurrent.Executor
    public void execute(@NotNull Runnable runnable) {
        I(C3897Pa0.X, runnable);
    }

    @Override // o.AbstractC7762lQ
    @NotNull
    public String toString() {
        return "Dispatchers.IO";
    }

    @Override // o.AbstractC7335jg0
    @NotNull
    public Executor b0() {
        return this;
    }
}
