package okhttp3;

import java.io.IOException;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.Proxy;
import java.util.List;
import o.C3771Nr1;
import o.C6562gT0;
import o.C9516sY;
import o.InterfaceC7058iW0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes4.dex */
public abstract class EventListener {
    @NotNull
    public static final Companion Companion = new Companion(null);
    @InterfaceC7058iW0
    @NotNull
    public static final EventListener NONE = new EventListener() { // from class: okhttp3.EventListener$Companion$NONE$1
    };

    /* loaded from: classes4.dex */
    public static final class Companion {
        public /* synthetic */ Companion(C9516sY c9516sY) {
            this();
        }

        private Companion() {
        }
    }

    /* loaded from: classes4.dex */
    public interface Factory {
        @NotNull
        EventListener create(@NotNull Call call);
    }

    public void cacheConditionalHit(@NotNull Call call, @NotNull Response response) {
        C6562gT0.p(call, C3771Nr1.E0);
        C6562gT0.p(response, "cachedResponse");
    }

    public void cacheHit(@NotNull Call call, @NotNull Response response) {
        C6562gT0.p(call, C3771Nr1.E0);
        C6562gT0.p(response, "response");
    }

    public void cacheMiss(@NotNull Call call) {
        C6562gT0.p(call, C3771Nr1.E0);
    }

    public void callEnd(@NotNull Call call) {
        C6562gT0.p(call, C3771Nr1.E0);
    }

    public void callFailed(@NotNull Call call, @NotNull IOException iOException) {
        C6562gT0.p(call, C3771Nr1.E0);
        C6562gT0.p(iOException, "ioe");
    }

    public void callStart(@NotNull Call call) {
        C6562gT0.p(call, C3771Nr1.E0);
    }

    public void canceled(@NotNull Call call) {
        C6562gT0.p(call, C3771Nr1.E0);
    }

    public void connectEnd(@NotNull Call call, @NotNull InetSocketAddress inetSocketAddress, @NotNull Proxy proxy, @Nullable Protocol protocol) {
        C6562gT0.p(call, C3771Nr1.E0);
        C6562gT0.p(inetSocketAddress, "inetSocketAddress");
        C6562gT0.p(proxy, "proxy");
    }

    public void connectFailed(@NotNull Call call, @NotNull InetSocketAddress inetSocketAddress, @NotNull Proxy proxy, @Nullable Protocol protocol, @NotNull IOException iOException) {
        C6562gT0.p(call, C3771Nr1.E0);
        C6562gT0.p(inetSocketAddress, "inetSocketAddress");
        C6562gT0.p(proxy, "proxy");
        C6562gT0.p(iOException, "ioe");
    }

    public void connectStart(@NotNull Call call, @NotNull InetSocketAddress inetSocketAddress, @NotNull Proxy proxy) {
        C6562gT0.p(call, C3771Nr1.E0);
        C6562gT0.p(inetSocketAddress, "inetSocketAddress");
        C6562gT0.p(proxy, "proxy");
    }

    public void connectionAcquired(@NotNull Call call, @NotNull Connection connection) {
        C6562gT0.p(call, C3771Nr1.E0);
        C6562gT0.p(connection, "connection");
    }

    public void connectionReleased(@NotNull Call call, @NotNull Connection connection) {
        C6562gT0.p(call, C3771Nr1.E0);
        C6562gT0.p(connection, "connection");
    }

    public void dnsEnd(@NotNull Call call, @NotNull String str, @NotNull List<InetAddress> list) {
        C6562gT0.p(call, C3771Nr1.E0);
        C6562gT0.p(str, "domainName");
        C6562gT0.p(list, "inetAddressList");
    }

    public void dnsStart(@NotNull Call call, @NotNull String str) {
        C6562gT0.p(call, C3771Nr1.E0);
        C6562gT0.p(str, "domainName");
    }

    public void proxySelectEnd(@NotNull Call call, @NotNull HttpUrl httpUrl, @NotNull List<Proxy> list) {
        C6562gT0.p(call, C3771Nr1.E0);
        C6562gT0.p(httpUrl, "url");
        C6562gT0.p(list, "proxies");
    }

    public void proxySelectStart(@NotNull Call call, @NotNull HttpUrl httpUrl) {
        C6562gT0.p(call, C3771Nr1.E0);
        C6562gT0.p(httpUrl, "url");
    }

    public void requestBodyEnd(@NotNull Call call, long j) {
        C6562gT0.p(call, C3771Nr1.E0);
    }

    public void requestBodyStart(@NotNull Call call) {
        C6562gT0.p(call, C3771Nr1.E0);
    }

    public void requestFailed(@NotNull Call call, @NotNull IOException iOException) {
        C6562gT0.p(call, C3771Nr1.E0);
        C6562gT0.p(iOException, "ioe");
    }

    public void requestHeadersEnd(@NotNull Call call, @NotNull Request request) {
        C6562gT0.p(call, C3771Nr1.E0);
        C6562gT0.p(request, "request");
    }

    public void requestHeadersStart(@NotNull Call call) {
        C6562gT0.p(call, C3771Nr1.E0);
    }

    public void responseBodyEnd(@NotNull Call call, long j) {
        C6562gT0.p(call, C3771Nr1.E0);
    }

    public void responseBodyStart(@NotNull Call call) {
        C6562gT0.p(call, C3771Nr1.E0);
    }

    public void responseFailed(@NotNull Call call, @NotNull IOException iOException) {
        C6562gT0.p(call, C3771Nr1.E0);
        C6562gT0.p(iOException, "ioe");
    }

    public void responseHeadersEnd(@NotNull Call call, @NotNull Response response) {
        C6562gT0.p(call, C3771Nr1.E0);
        C6562gT0.p(response, "response");
    }

    public void responseHeadersStart(@NotNull Call call) {
        C6562gT0.p(call, C3771Nr1.E0);
    }

    public void satisfactionFailure(@NotNull Call call, @NotNull Response response) {
        C6562gT0.p(call, C3771Nr1.E0);
        C6562gT0.p(response, "response");
    }

    public void secureConnectEnd(@NotNull Call call, @Nullable Handshake handshake) {
        C6562gT0.p(call, C3771Nr1.E0);
    }

    public void secureConnectStart(@NotNull Call call) {
        C6562gT0.p(call, C3771Nr1.E0);
    }
}
