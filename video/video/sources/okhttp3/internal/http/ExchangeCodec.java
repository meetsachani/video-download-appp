package okhttp3.internal.http;

import java.io.IOException;
import o.InterfaceC7072ia2;
import o.J82;
import okhttp3.Headers;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.internal.connection.RealConnection;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes4.dex */
public interface ExchangeCodec {
    @NotNull
    public static final Companion Companion = Companion.$$INSTANCE;
    public static final int DISCARD_STREAM_TIMEOUT_MILLIS = 100;

    /* loaded from: classes4.dex */
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();
        public static final int DISCARD_STREAM_TIMEOUT_MILLIS = 100;

        private Companion() {
        }
    }

    void cancel();

    @NotNull
    J82 createRequestBody(@NotNull Request request, long j) throws IOException;

    void finishRequest() throws IOException;

    void flushRequest() throws IOException;

    @NotNull
    RealConnection getConnection();

    @NotNull
    InterfaceC7072ia2 openResponseBodySource(@NotNull Response response) throws IOException;

    @Nullable
    Response.Builder readResponseHeaders(boolean z) throws IOException;

    long reportedContentLength(@NotNull Response response) throws IOException;

    @NotNull
    Headers trailers() throws IOException;

    void writeRequestHeaders(@NotNull Request request) throws IOException;
}
