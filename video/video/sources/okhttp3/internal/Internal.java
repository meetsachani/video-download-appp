package okhttp3.internal;

import javax.net.ssl.SSLSocket;
import o.C6562gT0;
import o.InterfaceC8046mW0;
import okhttp3.Cache;
import okhttp3.ConnectionSpec;
import okhttp3.Cookie;
import okhttp3.Headers;
import okhttp3.HttpUrl;
import okhttp3.Request;
import okhttp3.Response;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@InterfaceC8046mW0(name = "Internal")
/* loaded from: classes4.dex */
public final class Internal {
    @NotNull
    public static final Headers.Builder addHeaderLenient(@NotNull Headers.Builder builder, @NotNull String str) {
        C6562gT0.p(builder, "builder");
        C6562gT0.p(str, "line");
        return builder.addLenient$okhttp(str);
    }

    public static final void applyConnectionSpec(@NotNull ConnectionSpec connectionSpec, @NotNull SSLSocket sSLSocket, boolean z) {
        C6562gT0.p(connectionSpec, "connectionSpec");
        C6562gT0.p(sSLSocket, "sslSocket");
        connectionSpec.apply$okhttp(sSLSocket, z);
    }

    @Nullable
    public static final Response cacheGet(@NotNull Cache cache, @NotNull Request request) {
        C6562gT0.p(cache, "cache");
        C6562gT0.p(request, "request");
        return cache.get$okhttp(request);
    }

    @NotNull
    public static final String cookieToString(@NotNull Cookie cookie, boolean z) {
        C6562gT0.p(cookie, "cookie");
        return cookie.toString$okhttp(z);
    }

    @Nullable
    public static final Cookie parseCookie(long j, @NotNull HttpUrl httpUrl, @NotNull String str) {
        C6562gT0.p(httpUrl, "url");
        C6562gT0.p(str, "setCookie");
        return Cookie.Companion.parse$okhttp(j, httpUrl, str);
    }

    @NotNull
    public static final Headers.Builder addHeaderLenient(@NotNull Headers.Builder builder, @NotNull String str, @NotNull String str2) {
        C6562gT0.p(builder, "builder");
        C6562gT0.p(str, "name");
        C6562gT0.p(str2, "value");
        return builder.addLenient$okhttp(str, str2);
    }
}
