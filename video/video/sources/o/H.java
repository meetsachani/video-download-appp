package o;

import java.util.concurrent.CancellationException;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes4.dex */
public final class H extends CancellationException {
    @InterfaceC7058iW0
    @NotNull
    public final transient Object X;

    public H(@NotNull Object obj) {
        super("Flow was aborted, no more elements needed");
        this.X = obj;
    }

    @Override // java.lang.Throwable
    @NotNull
    public Throwable fillInStackTrace() {
        setStackTrace(new StackTraceElement[0]);
        return this;
    }
}
