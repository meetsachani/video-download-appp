package okhttp3.internal.http;

import java.net.Proxy;
import o.C6562gT0;
import okhttp3.HttpUrl;
import okhttp3.Request;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes4.dex */
public final class RequestLine {
    @NotNull
    public static final RequestLine INSTANCE = new RequestLine();

    private RequestLine() {
    }

    private final boolean includeAuthorityInRequestLine(Request request, Proxy.Type type) {
        if (!request.isHttps() && type == Proxy.Type.HTTP) {
            return true;
        }
        return false;
    }

    @NotNull
    public final String get(@NotNull Request request, @NotNull Proxy.Type type) {
        C6562gT0.p(request, "request");
        C6562gT0.p(type, "proxyType");
        StringBuilder sb = new StringBuilder();
        sb.append(request.method());
        sb.append(' ');
        RequestLine requestLine = INSTANCE;
        if (requestLine.includeAuthorityInRequestLine(request, type)) {
            sb.append(request.url());
        } else {
            sb.append(requestLine.requestPath(request.url()));
        }
        sb.append(" HTTP/1.1");
        String sb2 = sb.toString();
        C6562gT0.o(sb2, "StringBuilder().apply(builderAction).toString()");
        return sb2;
    }

    @NotNull
    public final String requestPath(@NotNull HttpUrl httpUrl) {
        C6562gT0.p(httpUrl, "url");
        String encodedPath = httpUrl.encodedPath();
        String encodedQuery = httpUrl.encodedQuery();
        if (encodedQuery != null) {
            return encodedPath + '?' + encodedQuery;
        }
        return encodedPath;
    }
}
