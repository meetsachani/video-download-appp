package o;

import java.util.concurrent.CancellationException;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes3.dex */
public final class SU0 extends CancellationException implements RP<SU0> {
    @InterfaceC7058iW0
    @NotNull
    public final transient RU0 X;

    public SU0(@NotNull String str, @Nullable Throwable th, @NotNull RU0 ru0) {
        super(str);
        this.X = ru0;
        if (th != null) {
            initCause(th);
        }
    }

    @Override // o.RP
    @Nullable
    /* renamed from: b */
    public SU0 a() {
        return null;
    }

    public boolean equals(@Nullable Object obj) {
        if (obj != this) {
            if (obj instanceof SU0) {
                SU0 su0 = (SU0) obj;
                if (!C6562gT0.g(su0.getMessage(), getMessage()) || !C6562gT0.g(su0.X, this.X) || !C6562gT0.g(su0.getCause(), getCause())) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    @Override // java.lang.Throwable
    @NotNull
    public Throwable fillInStackTrace() {
        setStackTrace(new StackTraceElement[0]);
        return this;
    }

    public int hashCode() {
        int i;
        String message = getMessage();
        C6562gT0.m(message);
        int hashCode = ((message.hashCode() * 31) + this.X.hashCode()) * 31;
        Throwable cause = getCause();
        if (cause != null) {
            i = cause.hashCode();
        } else {
            i = 0;
        }
        return hashCode + i;
    }

    @Override // java.lang.Throwable
    @NotNull
    public String toString() {
        return super.toString() + "; job=" + this.X;
    }
}
