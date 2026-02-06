package okhttp3;

import o.C8859ps;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes4.dex */
public interface WebSocket {

    /* loaded from: classes4.dex */
    public interface Factory {
        @NotNull
        WebSocket newWebSocket(@NotNull Request request, @NotNull WebSocketListener webSocketListener);
    }

    void cancel();

    boolean close(int i, @Nullable String str);

    long queueSize();

    @NotNull
    Request request();

    boolean send(@NotNull String str);

    boolean send(@NotNull C8859ps c8859ps);
}
