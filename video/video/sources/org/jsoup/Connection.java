package org.jsoup;

import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.CookieStore;
import java.net.Proxy;
import java.net.URL;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocketFactory;
import org.jsoup.helper.RequestAuthenticator;
import org.jsoup.nodes.Document;
import org.jsoup.parser.Parser;
import org.jsoup.parser.StreamParser;

/* loaded from: classes4.dex */
public interface Connection {

    /* loaded from: classes4.dex */
    public interface Base<T extends Base<T>> {
        Map<String, String> C();

        String E(String str);

        boolean J(String str);

        T K(String str);

        String L(String str);

        boolean M(String str);

        T P(String str);

        List<String> R(String str);

        Map<String, List<String>> S();

        Map<String, String> W();

        T addHeader(String str, String str2);

        T c(String str, String str2);

        T l(URL url);

        T m(String str, String str2);

        Method method();

        T n(Method method);

        URL x();

        boolean y(String str, String str2);
    }

    /* loaded from: classes4.dex */
    public interface KeyVal {
        String D();

        KeyVal a(String str);

        KeyVal b(String str);

        String c();

        KeyVal d(String str);

        KeyVal e(InputStream inputStream);

        boolean f();

        InputStream s0();

        String value();
    }

    /* loaded from: classes4.dex */
    public enum Method {
        GET(false),
        POST(true),
        PUT(true),
        DELETE(true),
        PATCH(true),
        HEAD(false),
        OPTIONS(false),
        TRACE(false);
        
        public final boolean X;

        Method(boolean z) {
            this.X = z;
        }

        public final boolean g() {
            return this.X;
        }
    }

    /* loaded from: classes4.dex */
    public interface Request extends Base<Request> {
        Proxy A();

        Request B(KeyVal keyVal);

        boolean G();

        boolean O();

        default SSLContext T() {
            throw new UnsupportedOperationException();
        }

        default RequestAuthenticator V() {
            throw new UnsupportedOperationException();
        }

        String Y();

        int Z();

        Request a(boolean z);

        Request b(String str);

        Parser c0();

        Request d(int i);

        default Request e(RequestAuthenticator requestAuthenticator) {
            throw new UnsupportedOperationException();
        }

        @Deprecated
        void f(SSLSocketFactory sSLSocketFactory);

        Request g(String str);

        Collection<KeyVal> h();

        Request i(Proxy proxy);

        default Request j(SSLContext sSLContext) {
            throw new UnsupportedOperationException();
        }

        Request k(Parser parser);

        default Request o(InputStream inputStream) {
            throw new UnsupportedOperationException();
        }

        Request p(String str, int i);

        Request q(int i);

        Request r(boolean z);

        Request s(boolean z);

        boolean t();

        int timeout();

        String u();

        SSLSocketFactory z();
    }

    /* loaded from: classes4.dex */
    public interface Response extends Base<Response> {
        String D();

        default StreamParser F() throws IOException {
            throw new UnsupportedOperationException();
        }

        Document H() throws IOException;

        default String I() throws IOException {
            throw new UnsupportedOperationException();
        }

        String N();

        Response Q(String str);

        @Deprecated
        Response U();

        int X();

        String a0();

        byte[] b0();

        String body();

        BufferedInputStream v();

        default Response w() throws IOException {
            throw new UnsupportedOperationException();
        }
    }

    Connection A(Request request);

    Connection B(String str);

    Response C();

    Connection D(CookieStore cookieStore);

    default Connection E(Progress<Response> progress) {
        throw new UnsupportedOperationException();
    }

    CookieStore F();

    Connection G(String str);

    Connection H(Map<String, String> map);

    Connection I(String str, String str2, InputStream inputStream);

    Connection J(Response response);

    Connection K(String... strArr);

    default Connection L(String str) {
        return v().B(str);
    }

    KeyVal M(String str);

    Connection N(Map<String, String> map);

    Connection a(boolean z);

    Connection b(String str);

    Connection c(String str, String str2);

    Connection d(int i);

    default Connection e(RequestAuthenticator requestAuthenticator) {
        throw new UnsupportedOperationException();
    }

    Response execute() throws IOException;

    @Deprecated
    Connection f(SSLSocketFactory sSLSocketFactory);

    Connection g(String str);

    Document get() throws IOException;

    Connection h(Collection<KeyVal> collection);

    Connection i(Proxy proxy);

    default Connection j(SSLContext sSLContext) {
        throw new UnsupportedOperationException();
    }

    Connection k(Parser parser);

    Connection l(URL url);

    Connection m(String str, String str2);

    Connection n(Method method);

    default Connection o(InputStream inputStream) {
        throw new UnsupportedOperationException();
    }

    Connection p(String str, int i);

    Connection q(int i);

    Connection r(boolean z);

    Request request();

    Connection s(boolean z);

    Connection t(Map<String, String> map);

    Connection u(String str, String str2, InputStream inputStream, String str3);

    Connection v();

    Connection w(String str, String str2);

    Document x() throws IOException;

    default Connection y(URL url) {
        return v().l(url);
    }

    Connection z(String str);
}
