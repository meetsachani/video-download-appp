package okhttp3;

import java.net.URL;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import o.C4180Rx1;
import o.C6562gT0;
import o.C6566gU0;
import o.C8222nF;
import o.C8926q81;
import o.C9545sf2;
import o.C9700tI0;
import o.EnumC9879u20;
import o.IR1;
import o.InterfaceC8046mW0;
import o.InterfaceC8289nW0;
import o.InterfaceC8303na2;
import o.InterfaceC9150r20;
import o.Q32;
import okhttp3.Headers;
import okhttp3.HttpUrl;
import okhttp3.internal.Util;
import okhttp3.internal.http.HttpMethod;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@InterfaceC8303na2({"SMAP\nRequest.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Request.kt\nokhttp3/Request\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,298:1\n1864#2,3:299\n*S KotlinDebug\n*F\n+ 1 Request.kt\nokhttp3/Request\n*L\n119#1:299,3\n*E\n"})
/* loaded from: classes4.dex */
public final class Request {
    @Nullable
    private final RequestBody body;
    @NotNull
    private final Headers headers;
    @Nullable
    private CacheControl lazyCacheControl;
    @NotNull
    private final String method;
    @NotNull
    private final Map<Class<?>, Object> tags;
    @NotNull
    private final HttpUrl url;

    @InterfaceC8303na2({"SMAP\nRequest.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Request.kt\nokhttp3/Request$Builder\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,298:1\n1#2:299\n*E\n"})
    /* loaded from: classes4.dex */
    public static class Builder {
        @Nullable
        private RequestBody body;
        @NotNull
        private Headers.Builder headers;
        @NotNull
        private String method;
        @NotNull
        private Map<Class<?>, Object> tags;
        @Nullable
        private HttpUrl url;

        public Builder() {
            this.tags = new LinkedHashMap();
            this.method = "GET";
            this.headers = new Headers.Builder();
        }

        public static /* synthetic */ Builder delete$default(Builder builder, RequestBody requestBody, int i, Object obj) {
            if (obj == null) {
                if ((i & 1) != 0) {
                    requestBody = Util.EMPTY_REQUEST;
                }
                return builder.delete(requestBody);
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: delete");
        }

        @NotNull
        public Builder addHeader(@NotNull String str, @NotNull String str2) {
            C6562gT0.p(str, "name");
            C6562gT0.p(str2, "value");
            this.headers.add(str, str2);
            return this;
        }

        @NotNull
        public Request build() {
            HttpUrl httpUrl = this.url;
            if (httpUrl != null) {
                return new Request(httpUrl, this.method, this.headers.build(), this.body, Util.toImmutableMap(this.tags));
            }
            throw new IllegalStateException("url == null");
        }

        @NotNull
        public Builder cacheControl(@NotNull CacheControl cacheControl) {
            C6562gT0.p(cacheControl, "cacheControl");
            String cacheControl2 = cacheControl.toString();
            if (cacheControl2.length() == 0) {
                return removeHeader("Cache-Control");
            }
            return header("Cache-Control", cacheControl2);
        }

        @InterfaceC8289nW0
        @NotNull
        public final Builder delete() {
            return delete$default(this, null, 1, null);
        }

        @NotNull
        public Builder get() {
            return method("GET", null);
        }

        @Nullable
        public final RequestBody getBody$okhttp() {
            return this.body;
        }

        @NotNull
        public final Headers.Builder getHeaders$okhttp() {
            return this.headers;
        }

        @NotNull
        public final String getMethod$okhttp() {
            return this.method;
        }

        @NotNull
        public final Map<Class<?>, Object> getTags$okhttp() {
            return this.tags;
        }

        @Nullable
        public final HttpUrl getUrl$okhttp() {
            return this.url;
        }

        @NotNull
        public Builder head() {
            return method("HEAD", null);
        }

        @NotNull
        public Builder header(@NotNull String str, @NotNull String str2) {
            C6562gT0.p(str, "name");
            C6562gT0.p(str2, "value");
            this.headers.set(str, str2);
            return this;
        }

        @NotNull
        public Builder headers(@NotNull Headers headers) {
            C6562gT0.p(headers, "headers");
            this.headers = headers.newBuilder();
            return this;
        }

        @NotNull
        public Builder method(@NotNull String str, @Nullable RequestBody requestBody) {
            C6562gT0.p(str, "method");
            if (str.length() > 0) {
                if (requestBody == null) {
                    if (HttpMethod.requiresRequestBody(str)) {
                        throw new IllegalArgumentException(("method " + str + " must have a request body.").toString());
                    }
                } else if (!HttpMethod.permitsRequestBody(str)) {
                    throw new IllegalArgumentException(("method " + str + " must not have a request body.").toString());
                }
                this.method = str;
                this.body = requestBody;
                return this;
            }
            throw new IllegalArgumentException("method.isEmpty() == true");
        }

        @NotNull
        public Builder patch(@NotNull RequestBody requestBody) {
            C6562gT0.p(requestBody, "body");
            return method(C9700tI0.a.X, requestBody);
        }

        @NotNull
        public Builder post(@NotNull RequestBody requestBody) {
            C6562gT0.p(requestBody, "body");
            return method(Q32.j, requestBody);
        }

        @NotNull
        public Builder put(@NotNull RequestBody requestBody) {
            C6562gT0.p(requestBody, "body");
            return method("PUT", requestBody);
        }

        @NotNull
        public Builder removeHeader(@NotNull String str) {
            C6562gT0.p(str, "name");
            this.headers.removeAll(str);
            return this;
        }

        public final void setBody$okhttp(@Nullable RequestBody requestBody) {
            this.body = requestBody;
        }

        public final void setHeaders$okhttp(@NotNull Headers.Builder builder) {
            C6562gT0.p(builder, "<set-?>");
            this.headers = builder;
        }

        public final void setMethod$okhttp(@NotNull String str) {
            C6562gT0.p(str, "<set-?>");
            this.method = str;
        }

        public final void setTags$okhttp(@NotNull Map<Class<?>, Object> map) {
            C6562gT0.p(map, "<set-?>");
            this.tags = map;
        }

        public final void setUrl$okhttp(@Nullable HttpUrl httpUrl) {
            this.url = httpUrl;
        }

        @NotNull
        public Builder tag(@Nullable Object obj) {
            return tag(Object.class, obj);
        }

        @NotNull
        public Builder url(@NotNull HttpUrl httpUrl) {
            C6562gT0.p(httpUrl, "url");
            this.url = httpUrl;
            return this;
        }

        @InterfaceC8289nW0
        @NotNull
        public Builder delete(@Nullable RequestBody requestBody) {
            return method("DELETE", requestBody);
        }

        @NotNull
        public <T> Builder tag(@NotNull Class<? super T> cls, @Nullable T t) {
            C6562gT0.p(cls, "type");
            if (t == null) {
                this.tags.remove(cls);
                return this;
            }
            if (this.tags.isEmpty()) {
                this.tags = new LinkedHashMap();
            }
            Map<Class<?>, Object> map = this.tags;
            T cast = cls.cast(t);
            C6562gT0.m(cast);
            map.put(cls, cast);
            return this;
        }

        @NotNull
        public Builder url(@NotNull String str) {
            C6562gT0.p(str, "url");
            if (C9545sf2.H2(str, "ws:", true)) {
                StringBuilder sb = new StringBuilder();
                sb.append("http:");
                String substring = str.substring(3);
                C6562gT0.o(substring, "this as java.lang.String).substring(startIndex)");
                sb.append(substring);
                str = sb.toString();
            } else if (C9545sf2.H2(str, "wss:", true)) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append("https:");
                String substring2 = str.substring(4);
                C6562gT0.o(substring2, "this as java.lang.String).substring(startIndex)");
                sb2.append(substring2);
                str = sb2.toString();
            }
            return url(HttpUrl.Companion.get(str));
        }

        public Builder(@NotNull Request request) {
            Map<Class<?>, Object> J0;
            C6562gT0.p(request, "request");
            this.tags = new LinkedHashMap();
            this.url = request.url();
            this.method = request.method();
            this.body = request.body();
            if (request.getTags$okhttp().isEmpty()) {
                J0 = new LinkedHashMap<>();
            } else {
                J0 = C8926q81.J0(request.getTags$okhttp());
            }
            this.tags = J0;
            this.headers = request.headers().newBuilder();
        }

        @NotNull
        public Builder url(@NotNull URL url) {
            C6562gT0.p(url, "url");
            HttpUrl.Companion companion = HttpUrl.Companion;
            String url2 = url.toString();
            C6562gT0.o(url2, "url.toString()");
            return url(companion.get(url2));
        }
    }

    public Request(@NotNull HttpUrl httpUrl, @NotNull String str, @NotNull Headers headers, @Nullable RequestBody requestBody, @NotNull Map<Class<?>, ? extends Object> map) {
        C6562gT0.p(httpUrl, "url");
        C6562gT0.p(str, "method");
        C6562gT0.p(headers, "headers");
        C6562gT0.p(map, "tags");
        this.url = httpUrl;
        this.method = str;
        this.headers = headers;
        this.body = requestBody;
        this.tags = map;
    }

    @InterfaceC8046mW0(name = "-deprecated_body")
    @InterfaceC9150r20(level = EnumC9879u20.Y, message = "moved to val", replaceWith = @IR1(expression = "body", imports = {}))
    @Nullable
    /* renamed from: -deprecated_body  reason: not valid java name */
    public final RequestBody m130deprecated_body() {
        return this.body;
    }

    @InterfaceC8046mW0(name = "-deprecated_cacheControl")
    @InterfaceC9150r20(level = EnumC9879u20.Y, message = "moved to val", replaceWith = @IR1(expression = "cacheControl", imports = {}))
    @NotNull
    /* renamed from: -deprecated_cacheControl  reason: not valid java name */
    public final CacheControl m131deprecated_cacheControl() {
        return cacheControl();
    }

    @InterfaceC8046mW0(name = "-deprecated_headers")
    @InterfaceC9150r20(level = EnumC9879u20.Y, message = "moved to val", replaceWith = @IR1(expression = "headers", imports = {}))
    @NotNull
    /* renamed from: -deprecated_headers  reason: not valid java name */
    public final Headers m132deprecated_headers() {
        return this.headers;
    }

    @InterfaceC8046mW0(name = "-deprecated_method")
    @InterfaceC9150r20(level = EnumC9879u20.Y, message = "moved to val", replaceWith = @IR1(expression = "method", imports = {}))
    @NotNull
    /* renamed from: -deprecated_method  reason: not valid java name */
    public final String m133deprecated_method() {
        return this.method;
    }

    @InterfaceC8046mW0(name = "-deprecated_url")
    @InterfaceC9150r20(level = EnumC9879u20.Y, message = "moved to val", replaceWith = @IR1(expression = "url", imports = {}))
    @NotNull
    /* renamed from: -deprecated_url  reason: not valid java name */
    public final HttpUrl m134deprecated_url() {
        return this.url;
    }

    @InterfaceC8046mW0(name = "body")
    @Nullable
    public final RequestBody body() {
        return this.body;
    }

    @InterfaceC8046mW0(name = "cacheControl")
    @NotNull
    public final CacheControl cacheControl() {
        CacheControl cacheControl = this.lazyCacheControl;
        if (cacheControl == null) {
            CacheControl parse = CacheControl.Companion.parse(this.headers);
            this.lazyCacheControl = parse;
            return parse;
        }
        return cacheControl;
    }

    @NotNull
    public final Map<Class<?>, Object> getTags$okhttp() {
        return this.tags;
    }

    @Nullable
    public final String header(@NotNull String str) {
        C6562gT0.p(str, "name");
        return this.headers.get(str);
    }

    @InterfaceC8046mW0(name = "headers")
    @NotNull
    public final Headers headers() {
        return this.headers;
    }

    public final boolean isHttps() {
        return this.url.isHttps();
    }

    @InterfaceC8046mW0(name = "method")
    @NotNull
    public final String method() {
        return this.method;
    }

    @NotNull
    public final Builder newBuilder() {
        return new Builder(this);
    }

    @Nullable
    public final Object tag() {
        return tag(Object.class);
    }

    @NotNull
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Request{method=");
        sb.append(this.method);
        sb.append(", url=");
        sb.append(this.url);
        if (this.headers.size() != 0) {
            sb.append(", headers=[");
            int i = 0;
            for (C4180Rx1<? extends String, ? extends String> c4180Rx1 : this.headers) {
                int i2 = i + 1;
                if (i < 0) {
                    C8222nF.Z();
                }
                C4180Rx1<? extends String, ? extends String> c4180Rx12 = c4180Rx1;
                String a = c4180Rx12.a();
                String b = c4180Rx12.b();
                if (i > 0) {
                    sb.append(C6566gU0.h);
                }
                sb.append(a);
                sb.append(':');
                sb.append(b);
                i = i2;
            }
            sb.append(']');
        }
        if (!this.tags.isEmpty()) {
            sb.append(", tags=");
            sb.append(this.tags);
        }
        sb.append('}');
        String sb2 = sb.toString();
        C6562gT0.o(sb2, "StringBuilder().apply(builderAction).toString()");
        return sb2;
    }

    @InterfaceC8046mW0(name = "url")
    @NotNull
    public final HttpUrl url() {
        return this.url;
    }

    @NotNull
    public final List<String> headers(@NotNull String str) {
        C6562gT0.p(str, "name");
        return this.headers.values(str);
    }

    @Nullable
    public final <T> T tag(@NotNull Class<? extends T> cls) {
        C6562gT0.p(cls, "type");
        return cls.cast(this.tags.get(cls));
    }
}
