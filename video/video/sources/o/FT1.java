package o;

import java.util.Objects;
import o.C9112qu1;
import okhttp3.Headers;
import okhttp3.Protocol;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.ResponseBody;

/* loaded from: classes4.dex */
public final class FT1<T> {
    public final Response a;
    @InterfaceC10571ws1
    public final T b;
    @InterfaceC10571ws1
    public final ResponseBody c;

    public FT1(Response response, @InterfaceC10571ws1 T t, @InterfaceC10571ws1 ResponseBody responseBody) {
        this.a = response;
        this.b = t;
        this.c = responseBody;
    }

    public static <T> FT1<T> c(int i, ResponseBody responseBody) {
        Objects.requireNonNull(responseBody, "body == null");
        if (i >= 400) {
            return d(responseBody, new Response.Builder().body(new C9112qu1.c(responseBody.contentType(), responseBody.contentLength())).code(i).message("Response.error()").protocol(Protocol.HTTP_1_1).request(new Request.Builder().url("http://localhost/").build()).build());
        }
        throw new IllegalArgumentException("code < 400: " + i);
    }

    public static <T> FT1<T> d(ResponseBody responseBody, Response response) {
        Objects.requireNonNull(responseBody, "body == null");
        Objects.requireNonNull(response, "rawResponse == null");
        if (!response.isSuccessful()) {
            return new FT1<>(response, null, responseBody);
        }
        throw new IllegalArgumentException("rawResponse should not be successful response");
    }

    public static <T> FT1<T> j(int i, @InterfaceC10571ws1 T t) {
        if (i >= 200 && i < 300) {
            return m(t, new Response.Builder().code(i).message("Response.success()").protocol(Protocol.HTTP_1_1).request(new Request.Builder().url("http://localhost/").build()).build());
        }
        throw new IllegalArgumentException("code < 200 or >= 300: " + i);
    }

    public static <T> FT1<T> k(@InterfaceC10571ws1 T t) {
        return m(t, new Response.Builder().code(200).message("OK").protocol(Protocol.HTTP_1_1).request(new Request.Builder().url("http://localhost/").build()).build());
    }

    public static <T> FT1<T> l(@InterfaceC10571ws1 T t, Headers headers) {
        Objects.requireNonNull(headers, "headers == null");
        return m(t, new Response.Builder().code(200).message("OK").protocol(Protocol.HTTP_1_1).headers(headers).request(new Request.Builder().url("http://localhost/").build()).build());
    }

    public static <T> FT1<T> m(@InterfaceC10571ws1 T t, Response response) {
        Objects.requireNonNull(response, "rawResponse == null");
        if (response.isSuccessful()) {
            return new FT1<>(response, t, null);
        }
        throw new IllegalArgumentException("rawResponse must be successful response");
    }

    @InterfaceC10571ws1
    public T a() {
        return this.b;
    }

    public int b() {
        return this.a.code();
    }

    @InterfaceC10571ws1
    public ResponseBody e() {
        return this.c;
    }

    public Headers f() {
        return this.a.headers();
    }

    public boolean g() {
        return this.a.isSuccessful();
    }

    public String h() {
        return this.a.message();
    }

    public Response i() {
        return this.a;
    }

    public String toString() {
        return this.a.toString();
    }
}
