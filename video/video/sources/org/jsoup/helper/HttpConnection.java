package org.jsoup.helper;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.UncheckedIOException;
import java.net.CookieManager;
import java.net.CookieStore;
import java.net.InetSocketAddress;
import java.net.MalformedURLException;
import java.net.Proxy;
import java.net.URL;
import java.net.URLEncoder;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.nio.charset.IllegalCharsetNameException;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.locks.ReentrantLock;
import java.util.regex.Pattern;
import java.util.zip.GZIPInputStream;
import java.util.zip.Inflater;
import java.util.zip.InflaterInputStream;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocketFactory;
import o.AI0;
import o.AbstractC4253Sp2;
import o.C2638Cg0;
import o.C4317Th1;
import o.C6566gU0;
import o.VI0;
import org.jsoup.Connection;
import org.jsoup.HttpStatusException;
import org.jsoup.Progress;
import org.jsoup.UnsupportedMimeTypeException;
import org.jsoup.helper.DataUtil;
import org.jsoup.internal.ControllableInputStream;
import org.jsoup.internal.Normalizer;
import org.jsoup.internal.StringUtil;
import org.jsoup.nodes.Document;
import org.jsoup.parser.Parser;
import org.jsoup.parser.StreamParser;

/* loaded from: classes4.dex */
public class HttpConnection implements Connection {
    public static final String e = "Content-Encoding";
    public static final String f = "Mozilla/5.0 (Macintosh; Intel Mac OS X 10_15_7) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/137.0.0.0 Safari/537.36";
    public static final String g = "User-Agent";
    public static final String h = "Content-Type";
    public static final String i = "multipart/form-data";
    public static final String j = "application/x-www-form-urlencoded";
    public static final int k = 307;
    public static final String l = "application/octet-stream";
    public static final Charset m = Charset.forName("ISO-8859-1");
    public Request a;
    public Connection.Response b;
    public Object c;
    public RequestAuthenticator d;

    /* loaded from: classes4.dex */
    public static class KeyVal implements Connection.KeyVal {
        public String a;
        public String b;
        public InputStream c;
        public String d;

        public KeyVal(String str, String str2) {
            Validate.p(str, "key");
            Validate.s(str2, "value");
            this.a = str;
            this.b = str2;
        }

        public static KeyVal g(String str, String str2) {
            return new KeyVal(str, str2);
        }

        public static KeyVal h(String str, String str2, InputStream inputStream) {
            return new KeyVal(str, str2).e(inputStream);
        }

        @Override // org.jsoup.Connection.KeyVal
        public String D() {
            return this.d;
        }

        @Override // org.jsoup.Connection.KeyVal
        public Connection.KeyVal a(String str) {
            Validate.n(str);
            this.d = str;
            return this;
        }

        @Override // org.jsoup.Connection.KeyVal
        public String c() {
            return this.a;
        }

        @Override // org.jsoup.Connection.KeyVal
        public boolean f() {
            if (this.c != null) {
                return true;
            }
            return false;
        }

        @Override // org.jsoup.Connection.KeyVal
        /* renamed from: i */
        public KeyVal e(InputStream inputStream) {
            Validate.s(this.b, "inputStream");
            this.c = inputStream;
            return this;
        }

        @Override // org.jsoup.Connection.KeyVal
        /* renamed from: j */
        public KeyVal b(String str) {
            Validate.p(str, "key");
            this.a = str;
            return this;
        }

        @Override // org.jsoup.Connection.KeyVal
        /* renamed from: k */
        public KeyVal d(String str) {
            Validate.s(str, "value");
            this.b = str;
            return this;
        }

        @Override // org.jsoup.Connection.KeyVal
        public InputStream s0() {
            return this.c;
        }

        public String toString() {
            return this.a + "=" + this.b;
        }

        @Override // org.jsoup.Connection.KeyVal
        public String value() {
            return this.b;
        }
    }

    public static Connection Q(String str) {
        HttpConnection httpConnection = new HttpConnection();
        httpConnection.B(str);
        return httpConnection;
    }

    public static Connection R(URL url) {
        HttpConnection httpConnection = new HttpConnection();
        httpConnection.l(url);
        return httpConnection;
    }

    public static String S(String str) {
        return str.replace(AbstractC4253Sp2.b.x1, "%22");
    }

    public static boolean T(Connection.Request request) {
        for (Connection.KeyVal keyVal : request.h()) {
            if (keyVal.f()) {
                return true;
            }
        }
        return false;
    }

    @Override // org.jsoup.Connection
    public Connection A(Connection.Request request) {
        this.a = (Request) request;
        return this;
    }

    @Override // org.jsoup.Connection
    public Connection B(String str) {
        Validate.p(str, "url");
        try {
            this.a.l(new URL(str));
            return this;
        } catch (MalformedURLException e2) {
            throw new IllegalArgumentException(String.format("The supplied URL, '%s', is malformed. Make sure it is an absolute URL, and starts with 'http://' or 'https://'. See https://jsoup.org/cookbook/extracting-data/working-with-urls", str), e2);
        }
    }

    @Override // org.jsoup.Connection
    public Connection.Response C() {
        Connection.Response response = this.b;
        if (response != null) {
            return response;
        }
        throw new IllegalArgumentException("You must execute the request before getting a response.");
    }

    @Override // org.jsoup.Connection
    public Connection D(CookieStore cookieStore) {
        this.a.u = new CookieManager(cookieStore, null);
        return this;
    }

    @Override // org.jsoup.Connection
    public Connection E(Progress<Connection.Response> progress) {
        this.a.w = progress;
        return this;
    }

    @Override // org.jsoup.Connection
    public CookieStore F() {
        return this.a.u.getCookieStore();
    }

    @Override // org.jsoup.Connection
    public Connection G(String str) {
        Validate.s(str, "referrer");
        this.a.m(AI0.J, str);
        return this;
    }

    @Override // org.jsoup.Connection
    public Connection H(Map<String, String> map) {
        Validate.s(map, "cookies");
        for (Map.Entry<String, String> entry : map.entrySet()) {
            this.a.c(entry.getKey(), entry.getValue());
        }
        return this;
    }

    @Override // org.jsoup.Connection
    public Connection I(String str, String str2, InputStream inputStream) {
        this.a.B(KeyVal.h(str, str2, inputStream));
        return this;
    }

    @Override // org.jsoup.Connection
    public Connection J(Connection.Response response) {
        this.b = response;
        return this;
    }

    @Override // org.jsoup.Connection
    public Connection K(String... strArr) {
        boolean z;
        Validate.s(strArr, "keyvals");
        if (strArr.length % 2 == 0) {
            z = true;
        } else {
            z = false;
        }
        Validate.k(z, "Must supply an even number of key value pairs");
        for (int i2 = 0; i2 < strArr.length; i2 += 2) {
            String str = strArr[i2];
            String str2 = strArr[i2 + 1];
            Validate.o(str, "Data key must not be empty");
            Validate.r(str2, "Data value must not be null");
            this.a.B(KeyVal.g(str, str2));
        }
        return this;
    }

    @Override // org.jsoup.Connection
    public Connection.KeyVal M(String str) {
        Validate.p(str, "key");
        for (Connection.KeyVal keyVal : request().h()) {
            if (keyVal.c().equals(str)) {
                return keyVal;
            }
        }
        return null;
    }

    @Override // org.jsoup.Connection
    public Connection N(Map<String, String> map) {
        Validate.s(map, "data");
        for (Map.Entry<String, String> entry : map.entrySet()) {
            this.a.B(KeyVal.g(entry.getKey(), entry.getValue()));
        }
        return this;
    }

    @Override // org.jsoup.Connection
    public Connection a(boolean z) {
        this.a.a(z);
        return this;
    }

    @Override // org.jsoup.Connection
    public Connection b(String str) {
        this.a.b(str);
        return this;
    }

    @Override // org.jsoup.Connection
    public Connection c(String str, String str2) {
        this.a.c(str, str2);
        return this;
    }

    @Override // org.jsoup.Connection
    public Connection d(int i2) {
        this.a.d(i2);
        return this;
    }

    @Override // org.jsoup.Connection
    public Connection e(RequestAuthenticator requestAuthenticator) {
        this.a.e(requestAuthenticator);
        return this;
    }

    @Override // org.jsoup.Connection
    public Connection.Response execute() throws IOException {
        Response g0 = Response.g0(this.a);
        this.b = g0;
        return g0;
    }

    @Override // org.jsoup.Connection
    public Connection f(SSLSocketFactory sSLSocketFactory) {
        this.a.f(sSLSocketFactory);
        return this;
    }

    @Override // org.jsoup.Connection
    public Connection g(String str) {
        this.a.g(str);
        return this;
    }

    @Override // org.jsoup.Connection
    public Document get() throws IOException {
        this.a.n(Connection.Method.GET);
        execute();
        Validate.q(this.b);
        return this.b.H();
    }

    @Override // org.jsoup.Connection
    public Connection h(Collection<Connection.KeyVal> collection) {
        Validate.s(collection, "data");
        for (Connection.KeyVal keyVal : collection) {
            this.a.B(keyVal);
        }
        return this;
    }

    @Override // org.jsoup.Connection
    public Connection i(Proxy proxy) {
        this.a.i(proxy);
        return this;
    }

    @Override // org.jsoup.Connection
    public Connection j(SSLContext sSLContext) {
        this.a.j(sSLContext);
        return this;
    }

    @Override // org.jsoup.Connection
    public Connection k(Parser parser) {
        this.a.k(parser);
        return this;
    }

    @Override // org.jsoup.Connection
    public Connection l(URL url) {
        this.a.l(url);
        return this;
    }

    @Override // org.jsoup.Connection
    public Connection m(String str, String str2) {
        this.a.m(str, str2);
        return this;
    }

    @Override // org.jsoup.Connection
    public Connection n(Connection.Method method) {
        this.a.n(method);
        return this;
    }

    @Override // org.jsoup.Connection
    public Connection o(InputStream inputStream) {
        this.a.o(inputStream);
        return this;
    }

    @Override // org.jsoup.Connection
    public Connection p(String str, int i2) {
        this.a.p(str, i2);
        return this;
    }

    @Override // org.jsoup.Connection
    public Connection q(int i2) {
        this.a.q(i2);
        return this;
    }

    @Override // org.jsoup.Connection
    public Connection r(boolean z) {
        this.a.r(z);
        return this;
    }

    @Override // org.jsoup.Connection
    public Connection.Request request() {
        return this.a;
    }

    @Override // org.jsoup.Connection
    public Connection s(boolean z) {
        this.a.s(z);
        return this;
    }

    @Override // org.jsoup.Connection
    public Connection t(Map<String, String> map) {
        Validate.s(map, "headers");
        for (Map.Entry<String, String> entry : map.entrySet()) {
            this.a.m(entry.getKey(), entry.getValue());
        }
        return this;
    }

    @Override // org.jsoup.Connection
    public Connection u(String str, String str2, InputStream inputStream, String str3) {
        this.a.B(KeyVal.h(str, str2, inputStream).a(str3));
        return this;
    }

    @Override // org.jsoup.Connection
    public Connection v() {
        return new HttpConnection(this.a);
    }

    @Override // org.jsoup.Connection
    public Connection w(String str, String str2) {
        this.a.B(KeyVal.g(str, str2));
        return this;
    }

    @Override // org.jsoup.Connection
    public Document x() throws IOException {
        this.a.n(Connection.Method.POST);
        execute();
        Validate.q(this.b);
        return this.b.H();
    }

    @Override // org.jsoup.Connection
    public Connection z(String str) {
        Validate.s(str, "userAgent");
        this.a.m("User-Agent", str);
        return this;
    }

    /* loaded from: classes4.dex */
    public static abstract class Base<T extends Connection.Base<T>> implements Connection.Base<T> {
        public static final URL e;
        public URL a;
        public Connection.Method b;
        public Map<String, List<String>> c;
        public Map<String, String> d;

        static {
            try {
                e = new URL("http://undefined/");
            } catch (MalformedURLException e2) {
                throw new IllegalStateException(e2);
            }
        }

        @Override // org.jsoup.Connection.Base
        public Map<String, String> C() {
            return this.d;
        }

        @Override // org.jsoup.Connection.Base
        public String E(String str) {
            Validate.p(str, "name");
            return this.d.get(str);
        }

        @Override // org.jsoup.Connection.Base
        public boolean J(String str) {
            Validate.p(str, "name");
            return this.d.containsKey(str);
        }

        @Override // org.jsoup.Connection.Base
        public T K(String str) {
            Validate.p(str, "name");
            Map.Entry<String, List<String>> e0 = e0(str);
            if (e0 != null) {
                this.c.remove(e0.getKey());
            }
            return this;
        }

        @Override // org.jsoup.Connection.Base
        public String L(String str) {
            Validate.s(str, "name");
            List<String> d0 = d0(str);
            if (!d0.isEmpty()) {
                return StringUtil.q(d0, C6566gU0.h);
            }
            return null;
        }

        @Override // org.jsoup.Connection.Base
        public boolean M(String str) {
            Validate.p(str, "name");
            return !d0(str).isEmpty();
        }

        @Override // org.jsoup.Connection.Base
        public T P(String str) {
            Validate.p(str, "name");
            this.d.remove(str);
            return this;
        }

        @Override // org.jsoup.Connection.Base
        public List<String> R(String str) {
            Validate.p(str, "name");
            return d0(str);
        }

        @Override // org.jsoup.Connection.Base
        public Map<String, List<String>> S() {
            return this.c;
        }

        @Override // org.jsoup.Connection.Base
        public Map<String, String> W() {
            LinkedHashMap linkedHashMap = new LinkedHashMap(this.c.size());
            for (Map.Entry<String, List<String>> entry : this.c.entrySet()) {
                String key = entry.getKey();
                List<String> value = entry.getValue();
                if (!value.isEmpty()) {
                    linkedHashMap.put(key, value.get(0));
                }
            }
            return linkedHashMap;
        }

        @Override // org.jsoup.Connection.Base
        public T addHeader(String str, String str2) {
            Validate.p(str, "name");
            if (str2 == null) {
                str2 = "";
            }
            List<String> R = R(str);
            if (R.isEmpty()) {
                R = new ArrayList<>();
                this.c.put(str, R);
            }
            R.add(str2);
            return this;
        }

        @Override // org.jsoup.Connection.Base
        public T c(String str, String str2) {
            Validate.p(str, "name");
            Validate.s(str2, "value");
            this.d.put(str, str2);
            return this;
        }

        public final List<String> d0(String str) {
            Validate.q(str);
            for (Map.Entry<String, List<String>> entry : this.c.entrySet()) {
                if (str.equalsIgnoreCase(entry.getKey())) {
                    return entry.getValue();
                }
            }
            return Collections.EMPTY_LIST;
        }

        public final Map.Entry<String, List<String>> e0(String str) {
            String a = Normalizer.a(str);
            for (Map.Entry<String, List<String>> entry : this.c.entrySet()) {
                if (Normalizer.a(entry.getKey()).equals(a)) {
                    return entry;
                }
            }
            return null;
        }

        @Override // org.jsoup.Connection.Base
        public T l(URL url) {
            Validate.s(url, "url");
            this.a = new UrlBuilder(url).c();
            return this;
        }

        @Override // org.jsoup.Connection.Base
        public T m(String str, String str2) {
            Validate.p(str, "name");
            K(str);
            addHeader(str, str2);
            return this;
        }

        @Override // org.jsoup.Connection.Base
        public Connection.Method method() {
            return this.b;
        }

        @Override // org.jsoup.Connection.Base
        public T n(Connection.Method method) {
            Validate.s(method, "method");
            this.b = method;
            return this;
        }

        @Override // org.jsoup.Connection.Base
        public URL x() {
            URL url = this.a;
            if (url != e) {
                return url;
            }
            throw new IllegalArgumentException("URL not set. Make sure to call #url(...) before executing the request.");
        }

        @Override // org.jsoup.Connection.Base
        public boolean y(String str, String str2) {
            Validate.n(str);
            Validate.n(str2);
            for (String str3 : R(str)) {
                if (str2.equalsIgnoreCase(str3)) {
                    return true;
                }
            }
            return false;
        }

        private Base() {
            this.a = e;
            this.b = Connection.Method.GET;
            this.c = new LinkedHashMap();
            this.d = new LinkedHashMap();
        }

        public Base(Base<T> base) {
            this.a = e;
            this.b = Connection.Method.GET;
            this.a = base.a;
            this.b = base.b;
            this.c = new LinkedHashMap();
            for (Map.Entry<String, List<String>> entry : base.c.entrySet()) {
                this.c.put(entry.getKey(), new ArrayList(entry.getValue()));
            }
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            this.d = linkedHashMap;
            linkedHashMap.putAll(base.d);
        }
    }

    public HttpConnection() {
        Request request = new Request();
        this.a = request;
        request.f = this;
    }

    public HttpConnection(Request request) {
        this.a = new Request(request);
    }

    public HttpConnection(Request request, Response response) {
        this.a = request;
        this.b = response;
    }

    /* loaded from: classes4.dex */
    public static class Response extends Base<Connection.Response> implements Connection.Response {
        public static final int r = 20;
        public static final String s = "Location";
        public static final Pattern t = Pattern.compile("(\\w+)/\\w*\\+?xml.*");
        public int f;
        public String g;
        public ByteBuffer h;
        public ControllableInputStream i;
        public RequestExecutor j;
        public String k;
        public String l;
        public int m;
        public boolean n;

        /* renamed from: o  reason: collision with root package name */
        public boolean f932o;
        public int p;
        public final Request q;

        public Response() {
            super();
            this.n = false;
            this.f932o = false;
            this.p = 0;
            this.f = 400;
            this.g = "Request not made";
            this.q = new Request();
            this.l = null;
        }

        public static Response g0(Request request) throws IOException {
            return h0(request, null);
        }

        /* JADX WARN: Code restructure failed: missing block: B:64:0x0143, code lost:
            if (org.jsoup.helper.HttpConnection.Response.t.matcher(r1).matches() == false) goto L60;
         */
        /* JADX WARN: Code restructure failed: missing block: B:66:0x0149, code lost:
            if (r8.q != false) goto L60;
         */
        /* JADX WARN: Code restructure failed: missing block: B:67:0x014b, code lost:
            r8.o0(org.jsoup.parser.Parser.z());
         */
        /* JADX WARN: Removed duplicated region for block: B:81:0x01a7 A[Catch: all -> 0x00b3, IOException -> 0x00b6, TryCatch #0 {all -> 0x00b3, blocks: (B:23:0x0088, B:24:0x008c, B:26:0x0092, B:28:0x0098, B:30:0x009e, B:35:0x00ba, B:37:0x00c9, B:39:0x00d2, B:40:0x00d6, B:45:0x00f6, B:51:0x0106, B:53:0x010c, B:55:0x0112, B:57:0x011a, B:60:0x0127, B:61:0x0136, B:63:0x0139, B:65:0x0145, B:67:0x014b, B:68:0x0152, B:70:0x015e, B:72:0x0166, B:74:0x0172, B:79:0x018c, B:81:0x01a7, B:76:0x0179, B:78:0x0181, B:82:0x01b3, B:49:0x0100, B:88:0x01cc, B:89:0x01dd, B:92:0x01e1, B:93:0x01e4), top: B:98:0x0088 }] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public static Response h0(Request request, Response response) throws IOException {
            boolean z;
            Response a;
            InputStream inflaterInputStream;
            Validate.k(request.x.tryLock(), "Multiple threads were detected trying to execute the same request concurrently. Make sure to use Connection#newRequest() and do not share an executing request between threads.");
            Validate.s(request, "req");
            URL x = request.x();
            Validate.r(x, "URL must be specified to connect");
            String protocol = x.getProtocol();
            if (!protocol.equals("http") && !protocol.equals("https")) {
                throw new MalformedURLException("Only http & https protocols supported");
            }
            boolean g = request.method().g();
            if (request.l != null) {
                z = true;
            } else {
                z = false;
            }
            if (!g) {
                Validate.i(z, "Cannot set a request body for HTTP method " + request.method());
            }
            if (!request.h().isEmpty() && (!g || z)) {
                q0(request);
            } else if (g) {
                r0(request);
            }
            long nanoTime = System.nanoTime();
            RequestExecutor a2 = RequestDispatch.a(request, response);
            Response response2 = null;
            try {
                try {
                    a = a2.a();
                } catch (IOException e) {
                    e = e;
                }
                try {
                    if (a.M("Location") && request.G()) {
                        if (a.f != 307) {
                            request.n(Connection.Method.GET);
                            request.h().clear();
                            request.b(null);
                            request.K("Content-Type");
                        }
                        String L = a.L("Location");
                        Validate.q(L);
                        if (L.startsWith("http:/") && L.charAt(6) != '/') {
                            L = L.substring(6);
                        }
                        request.l(StringUtil.A(request.x(), L));
                        Response h0 = h0(request, a);
                        request.x.unlock();
                        if (request.v != null) {
                            AuthenticationHandler.d.remove();
                        }
                        return h0;
                    }
                    int i = a.f;
                    if ((i >= 200 && i < 400) || request.t()) {
                        String D = a.D();
                        if (D != null && !request.O() && !D.startsWith("text/") && !t.matcher(D).matches()) {
                            throw new UnsupportedMimeTypeException("Unhandled content type. Must be text/*, */xml, or */*+xml", D, request.x().toString());
                        }
                        a.k = DataUtil.e(a.l);
                        if (a.m != 0 && request.method() != Connection.Method.HEAD) {
                            InputStream b = a2.b();
                            if (a.y("Content-Encoding", "gzip")) {
                                inflaterInputStream = new GZIPInputStream(b);
                            } else {
                                if (a.y("Content-Encoding", "deflate")) {
                                    inflaterInputStream = new InflaterInputStream(b, new Inflater(true));
                                }
                                a.i = ControllableInputStream.p(b, 8192, request.Z()).n(nanoTime, request.timeout());
                                if (request.w != null) {
                                    a.i.l(a.m, request.w, a);
                                }
                            }
                            b = inflaterInputStream;
                            a.i = ControllableInputStream.p(b, 8192, request.Z()).n(nanoTime, request.timeout());
                            if (request.w != null) {
                            }
                        } else {
                            a.h = DataUtil.d();
                        }
                        request.x.unlock();
                        if (request.v != null) {
                            AuthenticationHandler.d.remove();
                        }
                        a.n = true;
                        return a;
                    }
                    throw new HttpStatusException("HTTP error fetching URL", a.f, request.x().toString());
                } catch (IOException e2) {
                    e = e2;
                    response2 = a;
                    if (response2 != null) {
                        response2.p0();
                    }
                    throw e;
                }
            } catch (Throwable th) {
                request.x.unlock();
                if (request.v != null) {
                    AuthenticationHandler.d.remove();
                }
                throw th;
            }
        }

        public static String i0(String str) {
            if (str == null) {
                return str;
            }
            if (StandardCharsets.ISO_8859_1.newEncoder().canEncode(str)) {
                byte[] bytes = str.getBytes(HttpConnection.m);
                if (k0(bytes)) {
                    return new String(bytes, DataUtil.b);
                }
                return str;
            }
            return str;
        }

        public static void j0(Request request, BufferedWriter bufferedWriter, OutputStream outputStream) throws IOException {
            Collection<Connection.KeyVal> h = request.h();
            String str = request.m;
            if (str != null) {
                for (Connection.KeyVal keyVal : h) {
                    bufferedWriter.write("--");
                    bufferedWriter.write(str);
                    bufferedWriter.write(VI0.D);
                    bufferedWriter.write("Content-Disposition: form-data; name=\"");
                    bufferedWriter.write(HttpConnection.S(keyVal.c()));
                    bufferedWriter.write(AbstractC4253Sp2.b.x1);
                    InputStream s0 = keyVal.s0();
                    if (s0 != null) {
                        bufferedWriter.write("; filename=\"");
                        bufferedWriter.write(HttpConnection.S(keyVal.value()));
                        bufferedWriter.write("\"\r\nContent-Type: ");
                        String D = keyVal.D();
                        if (D == null) {
                            D = HttpConnection.l;
                        }
                        bufferedWriter.write(D);
                        bufferedWriter.write("\r\n\r\n");
                        bufferedWriter.flush();
                        DataUtil.a(s0, outputStream);
                        outputStream.flush();
                    } else {
                        bufferedWriter.write("\r\n\r\n");
                        bufferedWriter.write(keyVal.value());
                    }
                    bufferedWriter.write(VI0.D);
                }
                bufferedWriter.write("--");
                bufferedWriter.write(str);
                bufferedWriter.write("--");
            } else if (request.l != null) {
                if (request.l instanceof String) {
                    bufferedWriter.write((String) request.l);
                } else if (request.l instanceof InputStream) {
                    DataUtil.a((InputStream) request.l, outputStream);
                    outputStream.flush();
                } else {
                    throw new IllegalStateException();
                }
            } else {
                boolean z = true;
                for (Connection.KeyVal keyVal2 : h) {
                    if (!z) {
                        bufferedWriter.append('&');
                    } else {
                        z = false;
                    }
                    bufferedWriter.write(URLEncoder.encode(keyVal2.c(), request.u()));
                    bufferedWriter.write(61);
                    bufferedWriter.write(URLEncoder.encode(keyVal2.value(), request.u()));
                }
            }
        }

        public static boolean k0(byte[] bArr) {
            int i;
            int i2 = 3;
            if (bArr.length < 3 || (bArr[0] & 255) != 239 || (bArr[1] & 255) != 187 || (bArr[2] & 255) != 191) {
                i2 = 0;
            }
            int length = bArr.length;
            boolean z = false;
            while (i2 < length) {
                byte b = bArr[i2];
                if ((b & 128) != 0) {
                    if ((b & 224) == 192) {
                        i = i2 + 1;
                    } else if ((b & 240) == 224) {
                        i = i2 + 2;
                    } else if ((b & 248) != 240) {
                        return false;
                    } else {
                        i = i2 + 3;
                    }
                    if (i >= bArr.length) {
                        return false;
                    }
                    while (i2 < i) {
                        i2++;
                        if ((bArr[i2] & C2638Cg0.o7) != 128) {
                            return false;
                        }
                    }
                    z = true;
                }
                i2++;
            }
            return z;
        }

        public static void q0(Connection.Request request) throws IOException {
            UrlBuilder urlBuilder = new UrlBuilder(request.x());
            for (Connection.KeyVal keyVal : request.h()) {
                Validate.i(keyVal.f(), "InputStream data not supported in URL query string.");
                urlBuilder.a(keyVal);
            }
            request.l(urlBuilder.c());
            request.h().clear();
        }

        public static void r0(Request request) {
            String l;
            String L = request.L("Content-Type");
            if (L != null) {
                if (L.contains("multipart/form-data") && !L.contains("boundary")) {
                    l = DataUtil.l();
                    request.m("Content-Type", "multipart/form-data; boundary=" + l);
                }
                l = null;
            } else if (HttpConnection.T(request)) {
                l = DataUtil.l();
                request.m("Content-Type", "multipart/form-data; boundary=" + l);
            } else {
                request.m("Content-Type", "application/x-www-form-urlencoded; charset=" + request.u());
                l = null;
            }
            request.m = l;
        }

        public static void s0(Request request, OutputStream outputStream) throws IOException {
            OutputStreamWriter outputStreamWriter = new OutputStreamWriter(outputStream, request.u());
            try {
                BufferedWriter bufferedWriter = new BufferedWriter(outputStreamWriter);
                j0(request, bufferedWriter, outputStream);
                bufferedWriter.close();
                outputStreamWriter.close();
            } catch (Throwable th) {
                try {
                    outputStreamWriter.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        }

        @Override // org.jsoup.helper.HttpConnection.Base, org.jsoup.Connection.Base
        public /* bridge */ /* synthetic */ Map C() {
            return super.C();
        }

        @Override // org.jsoup.Connection.Response
        public String D() {
            return this.l;
        }

        @Override // org.jsoup.helper.HttpConnection.Base, org.jsoup.Connection.Base
        public /* bridge */ /* synthetic */ String E(String str) {
            return super.E(str);
        }

        @Override // org.jsoup.Connection.Response
        public StreamParser F() throws IOException {
            ControllableInputStream l0 = l0();
            String externalForm = this.a.toExternalForm();
            DataUtil.CharsetDoc b = DataUtil.b(l0, this.k, externalForm, this.q.c0());
            StreamParser streamParser = new StreamParser(this.q.c0());
            streamParser.m(new BufferedReader(new InputStreamReader(l0, b.a)), externalForm);
            streamParser.j().W4(new HttpConnection(this.q, this));
            this.k = b.a.name();
            return streamParser;
        }

        @Override // org.jsoup.Connection.Response
        public Document H() throws IOException {
            Document o2 = DataUtil.o(l0(), this.k, this.a.toExternalForm(), this.q.c0());
            o2.W4(new HttpConnection(this.q, this));
            this.k = o2.j5().b().name();
            p0();
            return o2;
        }

        @Override // org.jsoup.Connection.Response
        public String I() throws IOException {
            w();
            return body();
        }

        @Override // org.jsoup.helper.HttpConnection.Base, org.jsoup.Connection.Base
        public /* bridge */ /* synthetic */ boolean J(String str) {
            return super.J(str);
        }

        /* JADX WARN: Type inference failed for: r1v1, types: [org.jsoup.Connection$Response, org.jsoup.Connection$Base] */
        @Override // org.jsoup.helper.HttpConnection.Base, org.jsoup.Connection.Base
        public /* bridge */ /* synthetic */ Connection.Response K(String str) {
            return super.K(str);
        }

        @Override // org.jsoup.helper.HttpConnection.Base, org.jsoup.Connection.Base
        public /* bridge */ /* synthetic */ String L(String str) {
            return super.L(str);
        }

        @Override // org.jsoup.helper.HttpConnection.Base, org.jsoup.Connection.Base
        public /* bridge */ /* synthetic */ boolean M(String str) {
            return super.M(str);
        }

        @Override // org.jsoup.Connection.Response
        public String N() {
            return this.k;
        }

        /* JADX WARN: Type inference failed for: r1v1, types: [org.jsoup.Connection$Response, org.jsoup.Connection$Base] */
        @Override // org.jsoup.helper.HttpConnection.Base, org.jsoup.Connection.Base
        public /* bridge */ /* synthetic */ Connection.Response P(String str) {
            return super.P(str);
        }

        @Override // org.jsoup.helper.HttpConnection.Base, org.jsoup.Connection.Base
        public /* bridge */ /* synthetic */ List R(String str) {
            return super.R(str);
        }

        @Override // org.jsoup.helper.HttpConnection.Base, org.jsoup.Connection.Base
        public /* bridge */ /* synthetic */ Map S() {
            return super.S();
        }

        @Override // org.jsoup.Connection.Response
        public Connection.Response U() {
            o0();
            return this;
        }

        @Override // org.jsoup.helper.HttpConnection.Base, org.jsoup.Connection.Base
        public /* bridge */ /* synthetic */ Map W() {
            return super.W();
        }

        @Override // org.jsoup.Connection.Response
        public int X() {
            return this.f;
        }

        @Override // org.jsoup.Connection.Response
        public String a0() {
            return this.g;
        }

        /* JADX WARN: Type inference failed for: r1v1, types: [org.jsoup.Connection$Response, org.jsoup.Connection$Base] */
        @Override // org.jsoup.helper.HttpConnection.Base, org.jsoup.Connection.Base
        public /* bridge */ /* synthetic */ Connection.Response addHeader(String str, String str2) {
            return super.addHeader(str, str2);
        }

        @Override // org.jsoup.Connection.Response
        public byte[] b0() {
            o0();
            Validate.q(this.h);
            Validate.j(this.h.hasArray());
            byte[] array = this.h.array();
            int arrayOffset = this.h.arrayOffset();
            int limit = this.h.limit();
            if (arrayOffset == 0 && limit == array.length) {
                return array;
            }
            byte[] bArr = new byte[limit];
            System.arraycopy(array, arrayOffset, bArr, 0, limit);
            return bArr;
        }

        @Override // org.jsoup.Connection.Response
        public String body() {
            Charset forName;
            o0();
            Validate.q(this.h);
            String str = this.k;
            if (str == null) {
                forName = DataUtil.b;
            } else {
                forName = Charset.forName(str);
            }
            String charBuffer = forName.decode(this.h).toString();
            this.h.rewind();
            return charBuffer;
        }

        /* JADX WARN: Type inference failed for: r1v1, types: [org.jsoup.Connection$Response, org.jsoup.Connection$Base] */
        @Override // org.jsoup.helper.HttpConnection.Base, org.jsoup.Connection.Base
        public /* bridge */ /* synthetic */ Connection.Response c(String str, String str2) {
            return super.c(str, str2);
        }

        @Override // org.jsoup.Connection.Response
        /* renamed from: f0 */
        public Response Q(String str) {
            this.k = str;
            return this;
        }

        /* JADX WARN: Type inference failed for: r1v1, types: [org.jsoup.Connection$Response, org.jsoup.Connection$Base] */
        @Override // org.jsoup.helper.HttpConnection.Base, org.jsoup.Connection.Base
        public /* bridge */ /* synthetic */ Connection.Response l(URL url) {
            return super.l(url);
        }

        public final ControllableInputStream l0() {
            Validate.k(this.n, "Request must be executed (with .execute(), .get(), or .post() before parsing response");
            ControllableInputStream controllableInputStream = this.i;
            if (this.h != null) {
                controllableInputStream = ControllableInputStream.o(new ByteArrayInputStream(this.h.array(), 0, this.h.limit()), 0);
                this.f932o = false;
            }
            Validate.i(this.f932o, "Input stream already read and parsed, cannot re-read.");
            Validate.q(controllableInputStream);
            this.f932o = true;
            return controllableInputStream;
        }

        /* JADX WARN: Type inference failed for: r1v1, types: [org.jsoup.Connection$Response, org.jsoup.Connection$Base] */
        @Override // org.jsoup.helper.HttpConnection.Base, org.jsoup.Connection.Base
        public /* bridge */ /* synthetic */ Connection.Response m(String str, String str2) {
            return super.m(str, str2);
        }

        public void m0(Map<String, List<String>> map, Response response) throws IOException {
            n0(map);
            CookieUtil.e(this.q, this, this.a, map);
            if (response != null) {
                for (Map.Entry entry : response.C().entrySet()) {
                    if (!J((String) entry.getKey())) {
                        c((String) entry.getKey(), (String) entry.getValue());
                    }
                }
                response.p0();
                int i = response.p + 1;
                this.p = i;
                if (i >= 20) {
                    throw new IOException(String.format("Too many redirects occurred trying to load URL %s", response.x()));
                }
            }
        }

        @Override // org.jsoup.helper.HttpConnection.Base, org.jsoup.Connection.Base
        public /* bridge */ /* synthetic */ Connection.Method method() {
            return super.method();
        }

        /* JADX WARN: Type inference failed for: r1v1, types: [org.jsoup.Connection$Response, org.jsoup.Connection$Base] */
        @Override // org.jsoup.helper.HttpConnection.Base, org.jsoup.Connection.Base
        public /* bridge */ /* synthetic */ Connection.Response n(Connection.Method method) {
            return super.n(method);
        }

        public void n0(Map<String, List<String>> map) {
            for (Map.Entry<String, List<String>> entry : map.entrySet()) {
                String key = entry.getKey();
                if (key != null) {
                    for (String str : entry.getValue()) {
                        addHeader(key, i0(str));
                    }
                }
            }
        }

        public final void o0() {
            try {
                w();
            } catch (IOException e) {
                throw new UncheckedIOException(e);
            }
        }

        public final void p0() {
            ControllableInputStream controllableInputStream = this.i;
            if (controllableInputStream != null) {
                try {
                    controllableInputStream.close();
                } catch (IOException unused) {
                } catch (Throwable th) {
                    this.i = null;
                    throw th;
                }
                this.i = null;
            }
            RequestExecutor requestExecutor = this.j;
            if (requestExecutor != null) {
                requestExecutor.c();
            }
        }

        @Override // org.jsoup.Connection.Response
        public BufferedInputStream v() {
            Validate.k(this.n, "Request must be executed (with .execute(), .get(), or .post() before getting response body");
            if (this.h != null) {
                return new BufferedInputStream(new ByteArrayInputStream(this.h.array(), 0, this.h.limit()), 8192);
            }
            Validate.i(this.f932o, "Request has already been read");
            Validate.q(this.i);
            this.f932o = true;
            return this.i.i();
        }

        @Override // org.jsoup.Connection.Response
        public Connection.Response w() throws IOException {
            Validate.k(this.n, "Request must be executed (with .execute(), .get(), or .post() before getting response body");
            if (this.i != null && this.h == null) {
                Validate.i(this.f932o, "Request has already been read (with .parse())");
                try {
                    this.h = DataUtil.p(this.i, this.q.Z());
                    return this;
                } finally {
                    this.f932o = true;
                    p0();
                }
            }
            return this;
        }

        @Override // org.jsoup.helper.HttpConnection.Base, org.jsoup.Connection.Base
        public /* bridge */ /* synthetic */ URL x() {
            return super.x();
        }

        @Override // org.jsoup.helper.HttpConnection.Base, org.jsoup.Connection.Base
        public /* bridge */ /* synthetic */ boolean y(String str, String str2) {
            return super.y(str, str2);
        }

        public Response(Request request) {
            super();
            this.g = "";
            this.n = false;
            this.f932o = false;
            this.p = 0;
            this.q = request;
        }
    }

    /* loaded from: classes4.dex */
    public static class Request extends Base<Connection.Request> implements Connection.Request {
        public HttpConnection f;
        public Proxy g;
        public int h;
        public int i;
        public boolean j;
        public final Collection<Connection.KeyVal> k;
        public Object l;
        public String m;
        public boolean n;

        /* renamed from: o  reason: collision with root package name */
        public boolean f931o;
        public Parser p;
        public boolean q;
        public String r;
        public SSLSocketFactory s;
        public SSLContext t;
        public CookieManager u;
        public RequestAuthenticator v;
        public Progress<Connection.Response> w;
        public final ReentrantLock x;

        static {
            System.setProperty("sun.net.http.allowRestrictedHeaders", "true");
        }

        public Request() {
            super();
            this.l = null;
            this.n = false;
            this.f931o = false;
            this.q = false;
            this.r = DataUtil.c;
            this.x = new ReentrantLock();
            this.h = 30000;
            this.i = 2097152;
            this.j = true;
            this.k = new ArrayList();
            this.b = Connection.Method.GET;
            addHeader("Accept-Encoding", "gzip");
            addHeader("User-Agent", HttpConnection.f);
            this.p = Parser.f();
            this.u = new CookieManager();
        }

        @Override // org.jsoup.Connection.Request
        public Proxy A() {
            return this.g;
        }

        @Override // org.jsoup.helper.HttpConnection.Base, org.jsoup.Connection.Base
        public /* bridge */ /* synthetic */ Map C() {
            return super.C();
        }

        @Override // org.jsoup.helper.HttpConnection.Base, org.jsoup.Connection.Base
        public /* bridge */ /* synthetic */ String E(String str) {
            return super.E(str);
        }

        @Override // org.jsoup.Connection.Request
        public boolean G() {
            return this.j;
        }

        @Override // org.jsoup.helper.HttpConnection.Base, org.jsoup.Connection.Base
        public /* bridge */ /* synthetic */ boolean J(String str) {
            return super.J(str);
        }

        /* JADX WARN: Type inference failed for: r1v1, types: [org.jsoup.Connection$Base, org.jsoup.Connection$Request] */
        @Override // org.jsoup.helper.HttpConnection.Base, org.jsoup.Connection.Base
        public /* bridge */ /* synthetic */ Connection.Request K(String str) {
            return super.K(str);
        }

        @Override // org.jsoup.helper.HttpConnection.Base, org.jsoup.Connection.Base
        public /* bridge */ /* synthetic */ String L(String str) {
            return super.L(str);
        }

        @Override // org.jsoup.helper.HttpConnection.Base, org.jsoup.Connection.Base
        public /* bridge */ /* synthetic */ boolean M(String str) {
            return super.M(str);
        }

        @Override // org.jsoup.Connection.Request
        public boolean O() {
            return this.f931o;
        }

        /* JADX WARN: Type inference failed for: r1v1, types: [org.jsoup.Connection$Base, org.jsoup.Connection$Request] */
        @Override // org.jsoup.helper.HttpConnection.Base, org.jsoup.Connection.Base
        public /* bridge */ /* synthetic */ Connection.Request P(String str) {
            return super.P(str);
        }

        @Override // org.jsoup.helper.HttpConnection.Base, org.jsoup.Connection.Base
        public /* bridge */ /* synthetic */ List R(String str) {
            return super.R(str);
        }

        @Override // org.jsoup.helper.HttpConnection.Base, org.jsoup.Connection.Base
        public /* bridge */ /* synthetic */ Map S() {
            return super.S();
        }

        @Override // org.jsoup.Connection.Request
        public SSLContext T() {
            return this.t;
        }

        @Override // org.jsoup.Connection.Request
        public RequestAuthenticator V() {
            return this.v;
        }

        @Override // org.jsoup.helper.HttpConnection.Base, org.jsoup.Connection.Base
        public /* bridge */ /* synthetic */ Map W() {
            return super.W();
        }

        @Override // org.jsoup.Connection.Request
        public String Y() {
            Object obj = this.l;
            if (obj instanceof String) {
                return (String) obj;
            }
            return null;
        }

        @Override // org.jsoup.Connection.Request
        public int Z() {
            return this.i;
        }

        @Override // org.jsoup.Connection.Request
        public Connection.Request a(boolean z) {
            this.j = z;
            return this;
        }

        /* JADX WARN: Type inference failed for: r1v1, types: [org.jsoup.Connection$Base, org.jsoup.Connection$Request] */
        @Override // org.jsoup.helper.HttpConnection.Base, org.jsoup.Connection.Base
        public /* bridge */ /* synthetic */ Connection.Request addHeader(String str, String str2) {
            return super.addHeader(str, str2);
        }

        @Override // org.jsoup.Connection.Request
        public Connection.Request b(String str) {
            this.l = str;
            return this;
        }

        /* JADX WARN: Type inference failed for: r1v1, types: [org.jsoup.Connection$Base, org.jsoup.Connection$Request] */
        @Override // org.jsoup.helper.HttpConnection.Base, org.jsoup.Connection.Base
        public /* bridge */ /* synthetic */ Connection.Request c(String str, String str2) {
            return super.c(str, str2);
        }

        @Override // org.jsoup.Connection.Request
        public Parser c0() {
            return this.p;
        }

        @Override // org.jsoup.Connection.Request
        public Connection.Request e(RequestAuthenticator requestAuthenticator) {
            this.v = requestAuthenticator;
            return this;
        }

        @Override // org.jsoup.Connection.Request
        public void f(SSLSocketFactory sSLSocketFactory) {
            this.s = sSLSocketFactory;
        }

        @Override // org.jsoup.Connection.Request
        public Connection.Request g(String str) {
            Validate.s(str, C4317Th1.g);
            if (Charset.isSupported(str)) {
                this.r = str;
                return this;
            }
            throw new IllegalCharsetNameException(str);
        }

        @Override // org.jsoup.Connection.Request
        public Collection<Connection.KeyVal> h() {
            return this.k;
        }

        @Override // org.jsoup.Connection.Request
        public Connection.Request j(SSLContext sSLContext) {
            this.t = sSLContext;
            return this;
        }

        /* JADX WARN: Type inference failed for: r1v1, types: [org.jsoup.Connection$Base, org.jsoup.Connection$Request] */
        @Override // org.jsoup.helper.HttpConnection.Base, org.jsoup.Connection.Base
        public /* bridge */ /* synthetic */ Connection.Request l(URL url) {
            return super.l(url);
        }

        /* JADX WARN: Type inference failed for: r1v1, types: [org.jsoup.Connection$Base, org.jsoup.Connection$Request] */
        @Override // org.jsoup.helper.HttpConnection.Base, org.jsoup.Connection.Base
        public /* bridge */ /* synthetic */ Connection.Request m(String str, String str2) {
            return super.m(str, str2);
        }

        public CookieManager m0() {
            return this.u;
        }

        @Override // org.jsoup.helper.HttpConnection.Base, org.jsoup.Connection.Base
        public /* bridge */ /* synthetic */ Connection.Method method() {
            return super.method();
        }

        /* JADX WARN: Type inference failed for: r1v1, types: [org.jsoup.Connection$Base, org.jsoup.Connection$Request] */
        @Override // org.jsoup.helper.HttpConnection.Base, org.jsoup.Connection.Base
        public /* bridge */ /* synthetic */ Connection.Request n(Connection.Method method) {
            return super.n(method);
        }

        @Override // org.jsoup.Connection.Request
        /* renamed from: n0 */
        public Request B(Connection.KeyVal keyVal) {
            Validate.s(keyVal, "keyval");
            this.k.add(keyVal);
            return this;
        }

        @Override // org.jsoup.Connection.Request
        public Connection.Request o(InputStream inputStream) {
            this.l = inputStream;
            return this;
        }

        @Override // org.jsoup.Connection.Request
        /* renamed from: o0 */
        public Request k(Parser parser) {
            this.p = parser;
            this.q = true;
            return this;
        }

        @Override // org.jsoup.Connection.Request
        /* renamed from: p0 */
        public Request p(String str, int i) {
            this.g = new Proxy(Proxy.Type.HTTP, InetSocketAddress.createUnresolved(str, i));
            return this;
        }

        @Override // org.jsoup.Connection.Request
        public Connection.Request q(int i) {
            boolean z;
            if (i >= 0) {
                z = true;
            } else {
                z = false;
            }
            Validate.k(z, "maxSize must be 0 (unlimited) or larger");
            this.i = i;
            return this;
        }

        @Override // org.jsoup.Connection.Request
        /* renamed from: q0 */
        public Request i(Proxy proxy) {
            this.g = proxy;
            return this;
        }

        @Override // org.jsoup.Connection.Request
        public Connection.Request r(boolean z) {
            this.n = z;
            return this;
        }

        @Override // org.jsoup.Connection.Request
        /* renamed from: r0 */
        public Request d(int i) {
            boolean z;
            if (i >= 0) {
                z = true;
            } else {
                z = false;
            }
            Validate.k(z, "Timeout milliseconds must be 0 (infinite) or greater");
            this.h = i;
            return this;
        }

        @Override // org.jsoup.Connection.Request
        public Connection.Request s(boolean z) {
            this.f931o = z;
            return this;
        }

        @Override // org.jsoup.Connection.Request
        public boolean t() {
            return this.n;
        }

        @Override // org.jsoup.Connection.Request
        public int timeout() {
            return this.h;
        }

        @Override // org.jsoup.Connection.Request
        public String u() {
            return this.r;
        }

        @Override // org.jsoup.helper.HttpConnection.Base, org.jsoup.Connection.Base
        public /* bridge */ /* synthetic */ URL x() {
            return super.x();
        }

        @Override // org.jsoup.helper.HttpConnection.Base, org.jsoup.Connection.Base
        public /* bridge */ /* synthetic */ boolean y(String str, String str2) {
            return super.y(str, str2);
        }

        @Override // org.jsoup.Connection.Request
        public SSLSocketFactory z() {
            return this.s;
        }

        public Request(Request request) {
            super(request);
            this.l = null;
            this.n = false;
            this.f931o = false;
            this.q = false;
            this.r = DataUtil.c;
            this.x = new ReentrantLock();
            this.f = request.f;
            this.g = request.g;
            this.r = request.r;
            this.h = request.h;
            this.i = request.i;
            this.j = request.j;
            this.k = new ArrayList();
            this.n = request.n;
            this.f931o = request.f931o;
            this.p = request.p.i();
            this.q = request.q;
            this.s = request.s;
            this.t = request.t;
            this.u = request.u;
            this.v = request.v;
            this.w = request.w;
        }
    }
}
