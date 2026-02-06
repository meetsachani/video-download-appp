package okhttp3.internal.connection;

import java.io.IOException;
import o.C3917Pf0;
import o.C6562gT0;
import o.W12;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes4.dex */
public final class RouteException extends RuntimeException {
    @NotNull
    private final IOException firstConnectException;
    @NotNull
    private IOException lastConnectException;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RouteException(@NotNull IOException iOException) {
        super(iOException);
        C6562gT0.p(iOException, "firstConnectException");
        this.firstConnectException = iOException;
        this.lastConnectException = iOException;
    }

    public final void addConnectException(@NotNull IOException iOException) {
        C6562gT0.p(iOException, W12.i);
        C3917Pf0.a(this.firstConnectException, iOException);
        this.lastConnectException = iOException;
    }

    @NotNull
    public final IOException getFirstConnectException() {
        return this.firstConnectException;
    }

    @NotNull
    public final IOException getLastConnectException() {
        return this.lastConnectException;
    }
}
