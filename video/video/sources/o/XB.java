package o;

import java.util.concurrent.CancellationException;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes4.dex */
public final class XB extends CancellationException {
    public XB() {
        super("Child of the scoped flow was cancelled");
    }

    @Override // java.lang.Throwable
    @NotNull
    public Throwable fillInStackTrace() {
        setStackTrace(new StackTraceElement[0]);
        return this;
    }
}
