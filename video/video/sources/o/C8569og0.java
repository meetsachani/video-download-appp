package o;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import org.jetbrains.annotations.NotNull;

/* renamed from: o.og0  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C8569og0 {
    @NotNull
    public static final Executor b(@NotNull AbstractC7762lQ abstractC7762lQ) {
        AbstractC7335jg0 abstractC7335jg0;
        Executor b0;
        if (abstractC7762lQ instanceof AbstractC7335jg0) {
            abstractC7335jg0 = (AbstractC7335jg0) abstractC7762lQ;
        } else {
            abstractC7335jg0 = null;
        }
        if (abstractC7335jg0 != null && (b0 = abstractC7335jg0.b0()) != null) {
            return b0;
        }
        return new ExecutorC8666p40(abstractC7762lQ);
    }

    @InterfaceC8046mW0(name = "from")
    @NotNull
    public static final AbstractC7762lQ c(@NotNull Executor executor) {
        ExecutorC8666p40 executorC8666p40;
        AbstractC7762lQ abstractC7762lQ;
        if (executor instanceof ExecutorC8666p40) {
            executorC8666p40 = (ExecutorC8666p40) executor;
        } else {
            executorC8666p40 = null;
        }
        if (executorC8666p40 != null && (abstractC7762lQ = executorC8666p40.X) != null) {
            return abstractC7762lQ;
        }
        return new C7578kg0(executor);
    }

    @InterfaceC8046mW0(name = "from")
    @NotNull
    public static final AbstractC7335jg0 d(@NotNull ExecutorService executorService) {
        return new C7578kg0(executorService);
    }

    @InterfaceC2951Fi0
    public static /* synthetic */ void a() {
    }
}
