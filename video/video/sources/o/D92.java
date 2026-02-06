package o;

import java.io.IOException;
import java.net.Socket;
import java.net.SocketTimeoutException;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes4.dex */
public final class D92 extends C3526Lf {
    @NotNull
    public final Socket a;

    public D92(@NotNull Socket socket) {
        C6562gT0.p(socket, "socket");
        this.a = socket;
    }

    @Override // o.C3526Lf
    @NotNull
    public IOException newTimeoutException(@Nullable IOException iOException) {
        SocketTimeoutException socketTimeoutException = new SocketTimeoutException("timeout");
        if (iOException != null) {
            socketTimeoutException.initCause(iOException);
        }
        return socketTimeoutException;
    }

    @Override // o.C3526Lf
    public void timedOut() {
        Logger logger;
        Logger logger2;
        try {
            this.a.close();
        } catch (AssertionError e) {
            if (C9604su1.l(e)) {
                logger2 = C9847tu1.a;
                Level level = Level.WARNING;
                logger2.log(level, "Failed to close timed out socket " + this.a, (Throwable) e);
                return;
            }
            throw e;
        } catch (Exception e2) {
            logger = C9847tu1.a;
            Level level2 = Level.WARNING;
            logger.log(level2, "Failed to close timed out socket " + this.a, (Throwable) e2);
        }
    }
}
