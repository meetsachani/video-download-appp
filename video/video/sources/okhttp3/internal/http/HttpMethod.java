package okhttp3.internal.http;

import o.C6562gT0;
import o.C9700tI0;
import o.InterfaceC9511sW0;
import o.Q32;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes4.dex */
public final class HttpMethod {
    @NotNull
    public static final HttpMethod INSTANCE = new HttpMethod();

    private HttpMethod() {
    }

    @InterfaceC9511sW0
    public static final boolean permitsRequestBody(@NotNull String str) {
        C6562gT0.p(str, "method");
        if (!C6562gT0.g(str, "GET") && !C6562gT0.g(str, "HEAD")) {
            return true;
        }
        return false;
    }

    @InterfaceC9511sW0
    public static final boolean requiresRequestBody(@NotNull String str) {
        C6562gT0.p(str, "method");
        if (!C6562gT0.g(str, Q32.j) && !C6562gT0.g(str, "PUT") && !C6562gT0.g(str, C9700tI0.a.X) && !C6562gT0.g(str, "PROPPATCH") && !C6562gT0.g(str, "REPORT")) {
            return false;
        }
        return true;
    }

    public final boolean invalidatesCache(@NotNull String str) {
        C6562gT0.p(str, "method");
        if (!C6562gT0.g(str, Q32.j) && !C6562gT0.g(str, C9700tI0.a.X) && !C6562gT0.g(str, "PUT") && !C6562gT0.g(str, "DELETE") && !C6562gT0.g(str, "MOVE")) {
            return false;
        }
        return true;
    }

    public final boolean redirectsToGet(@NotNull String str) {
        C6562gT0.p(str, "method");
        return !C6562gT0.g(str, "PROPFIND");
    }

    public final boolean redirectsWithBody(@NotNull String str) {
        C6562gT0.p(str, "method");
        return C6562gT0.g(str, "PROPFIND");
    }
}
