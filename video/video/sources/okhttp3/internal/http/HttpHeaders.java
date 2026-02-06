package okhttp3.internal.http;

import java.io.EOFException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import o.AI0;
import o.C4715Xk;
import o.C5422bq;
import o.C6562gT0;
import o.C8859ps;
import o.C8926q81;
import o.C9545sf2;
import o.EnumC9879u20;
import o.IR1;
import o.InterfaceC8046mW0;
import o.InterfaceC9150r20;
import okhttp3.Challenge;
import okhttp3.Cookie;
import okhttp3.CookieJar;
import okhttp3.Headers;
import okhttp3.HttpUrl;
import okhttp3.Response;
import okhttp3.internal.Util;
import okhttp3.internal.platform.Platform;
import org.jetbrains.annotations.NotNull;

@InterfaceC8046mW0(name = "HttpHeaders")
/* loaded from: classes4.dex */
public final class HttpHeaders {
    @NotNull
    private static final C8859ps QUOTED_STRING_DELIMITERS;
    @NotNull
    private static final C8859ps TOKEN_DELIMITERS;

    static {
        C8859ps.a aVar = C8859ps.Y0;
        QUOTED_STRING_DELIMITERS = aVar.l("\"\\");
        TOKEN_DELIMITERS = aVar.l("\t ,=");
    }

    @InterfaceC9150r20(level = EnumC9879u20.Y, message = "No longer supported", replaceWith = @IR1(expression = "response.promisesBody()", imports = {}))
    public static final boolean hasBody(@NotNull Response response) {
        C6562gT0.p(response, "response");
        return promisesBody(response);
    }

    @NotNull
    public static final List<Challenge> parseChallenges(@NotNull Headers headers, @NotNull String str) {
        C6562gT0.p(headers, "<this>");
        C6562gT0.p(str, "headerName");
        ArrayList arrayList = new ArrayList();
        int size = headers.size();
        for (int i = 0; i < size; i++) {
            if (C9545sf2.c2(str, headers.name(i), true)) {
                try {
                    readChallengeHeader(new C5422bq().K1(headers.value(i)), arrayList);
                } catch (EOFException e) {
                    Platform.Companion.get().log("Unable to parse challenge", 5, e);
                }
            }
        }
        return arrayList;
    }

    public static final boolean promisesBody(@NotNull Response response) {
        C6562gT0.p(response, "<this>");
        if (C6562gT0.g(response.request().method(), "HEAD")) {
            return false;
        }
        int code = response.code();
        if (((code >= 100 && code < 200) || code == 204 || code == 304) && Util.headersContentLength(response) == -1 && !C9545sf2.c2("chunked", Response.header$default(response, AI0.K0, null, 2, null), true)) {
            return false;
        }
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:58:0x00bc, code lost:
        continue;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x00bc, code lost:
        continue;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final void readChallengeHeader(C5422bq c5422bq, List<Challenge> list) throws EOFException {
        String readToken;
        int skipAll;
        String readToken2;
        while (true) {
            String str = null;
            while (true) {
                if (str == null) {
                    skipCommasAndWhitespace(c5422bq);
                    str = readToken(c5422bq);
                    if (str == null) {
                        return;
                    }
                }
                boolean skipCommasAndWhitespace = skipCommasAndWhitespace(c5422bq);
                readToken = readToken(c5422bq);
                if (readToken == null) {
                    if (c5422bq.M3()) {
                        list.add(new Challenge(str, C8926q81.z()));
                        return;
                    }
                    return;
                }
                skipAll = Util.skipAll(c5422bq, C4715Xk.i);
                boolean skipCommasAndWhitespace2 = skipCommasAndWhitespace(c5422bq);
                if (skipCommasAndWhitespace || (!skipCommasAndWhitespace2 && !c5422bq.M3())) {
                    LinkedHashMap linkedHashMap = new LinkedHashMap();
                    int skipAll2 = skipAll + Util.skipAll(c5422bq, C4715Xk.i);
                    while (true) {
                        if (readToken == null) {
                            readToken = readToken(c5422bq);
                            if (!skipCommasAndWhitespace(c5422bq)) {
                                skipAll2 = Util.skipAll(c5422bq, C4715Xk.i);
                            }
                        }
                        if (skipAll2 != 0) {
                            if (skipAll2 <= 1 && !skipCommasAndWhitespace(c5422bq)) {
                                if (startsWith(c5422bq, (byte) 34)) {
                                    readToken2 = readQuotedString(c5422bq);
                                } else {
                                    readToken2 = readToken(c5422bq);
                                }
                                if (readToken2 != null && ((String) linkedHashMap.put(readToken, readToken2)) == null) {
                                    if (!skipCommasAndWhitespace(c5422bq) && !c5422bq.M3()) {
                                        return;
                                    }
                                    readToken = null;
                                } else {
                                    return;
                                }
                            } else {
                                return;
                            }
                        }
                    }
                    list.add(new Challenge(str, linkedHashMap));
                    str = readToken;
                }
            }
            Map singletonMap = Collections.singletonMap(null, readToken + C9545sf2.v2("=", skipAll));
            C6562gT0.o(singletonMap, "singletonMap<String, Str…ek + \"=\".repeat(eqCount))");
            list.add(new Challenge(str, singletonMap));
        }
    }

    private static final String readQuotedString(C5422bq c5422bq) throws EOFException {
        if (c5422bq.readByte() == 34) {
            C5422bq c5422bq2 = new C5422bq();
            while (true) {
                long P4 = c5422bq.P4(QUOTED_STRING_DELIMITERS);
                if (P4 == -1) {
                    return null;
                }
                if (c5422bq.x(P4) == 34) {
                    c5422bq2.write(c5422bq, P4);
                    c5422bq.readByte();
                    return c5422bq2.Y4();
                } else if (c5422bq.size() == P4 + 1) {
                    return null;
                } else {
                    c5422bq2.write(c5422bq, P4);
                    c5422bq.readByte();
                    c5422bq2.write(c5422bq, 1L);
                }
            }
        } else {
            throw new IllegalArgumentException("Failed requirement.");
        }
    }

    private static final String readToken(C5422bq c5422bq) {
        long P4 = c5422bq.P4(TOKEN_DELIMITERS);
        if (P4 == -1) {
            P4 = c5422bq.size();
        }
        if (P4 != 0) {
            return c5422bq.e3(P4);
        }
        return null;
    }

    public static final void receiveHeaders(@NotNull CookieJar cookieJar, @NotNull HttpUrl httpUrl, @NotNull Headers headers) {
        C6562gT0.p(cookieJar, "<this>");
        C6562gT0.p(httpUrl, "url");
        C6562gT0.p(headers, "headers");
        if (cookieJar != CookieJar.NO_COOKIES) {
            List<Cookie> parseAll = Cookie.Companion.parseAll(httpUrl, headers);
            if (parseAll.isEmpty()) {
                return;
            }
            cookieJar.saveFromResponse(httpUrl, parseAll);
        }
    }

    private static final boolean skipCommasAndWhitespace(C5422bq c5422bq) {
        boolean z = false;
        while (!c5422bq.M3()) {
            byte x = c5422bq.x(0L);
            if (x == 44) {
                c5422bq.readByte();
                z = true;
            } else if (x != 32 && x != 9) {
                break;
            } else {
                c5422bq.readByte();
            }
        }
        return z;
    }

    private static final boolean startsWith(C5422bq c5422bq, byte b) {
        if (!c5422bq.M3() && c5422bq.x(0L) == b) {
            return true;
        }
        return false;
    }
}
