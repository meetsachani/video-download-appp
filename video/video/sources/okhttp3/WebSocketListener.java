package okhttp3;

import o.C6562gT0;
import o.C8859ps;
import o.SQ0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes4.dex */
public abstract class WebSocketListener {
    public void onClosed(@NotNull WebSocket webSocket, int i, @NotNull String str) {
        C6562gT0.p(webSocket, "webSocket");
        C6562gT0.p(str, SQ0.n);
    }

    public void onClosing(@NotNull WebSocket webSocket, int i, @NotNull String str) {
        C6562gT0.p(webSocket, "webSocket");
        C6562gT0.p(str, SQ0.n);
    }

    public void onFailure(@NotNull WebSocket webSocket, @NotNull Throwable th, @Nullable Response response) {
        C6562gT0.p(webSocket, "webSocket");
        C6562gT0.p(th, "t");
    }

    public void onMessage(@NotNull WebSocket webSocket, @NotNull String str) {
        C6562gT0.p(webSocket, "webSocket");
        C6562gT0.p(str, "text");
    }

    public void onOpen(@NotNull WebSocket webSocket, @NotNull Response response) {
        C6562gT0.p(webSocket, "webSocket");
        C6562gT0.p(response, "response");
    }

    public void onMessage(@NotNull WebSocket webSocket, @NotNull C8859ps c8859ps) {
        C6562gT0.p(webSocket, "webSocket");
        C6562gT0.p(c8859ps, "bytes");
    }
}
