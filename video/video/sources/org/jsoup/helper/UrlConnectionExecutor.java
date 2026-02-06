package org.jsoup.helper;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.Proxy;
import java.net.URLConnection;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.function.BiConsumer;
import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.SSLContext;
import org.jsoup.Connection;
import org.jsoup.helper.HttpConnection;
import org.jsoup.internal.Functions;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes4.dex */
public class UrlConnectionExecutor extends RequestExecutor {
    public HttpURLConnection c;

    public UrlConnectionExecutor(HttpConnection.Request request, HttpConnection.Response response) {
        super(request, response);
    }

    public static HttpURLConnection d(HttpConnection.Request request) throws IOException {
        URLConnection openConnection;
        Proxy A = request.A();
        if (A == null) {
            openConnection = request.x().openConnection();
        } else {
            openConnection = request.x().openConnection(A);
        }
        final HttpURLConnection httpURLConnection = (HttpURLConnection) openConnection;
        httpURLConnection.setRequestMethod(request.method().name());
        httpURLConnection.setInstanceFollowRedirects(false);
        httpURLConnection.setConnectTimeout(request.timeout());
        httpURLConnection.setReadTimeout(request.timeout() / 2);
        if (httpURLConnection instanceof HttpsURLConnection) {
            HttpsURLConnection httpsURLConnection = (HttpsURLConnection) httpURLConnection;
            SSLContext sSLContext = request.t;
            if (sSLContext != null) {
                httpsURLConnection.setSSLSocketFactory(sSLContext.getSocketFactory());
            } else if (request.z() != null) {
                httpsURLConnection.setSSLSocketFactory(request.z());
            }
        }
        RequestAuthenticator requestAuthenticator = request.v;
        if (requestAuthenticator != null) {
            AuthenticationHandler.d.a(requestAuthenticator, httpURLConnection);
        }
        if (request.method().g()) {
            httpURLConnection.setDoOutput(true);
        }
        CookieUtil.a(request, new BiConsumer() { // from class: o.TC2
            @Override // java.util.function.BiConsumer
            public final void accept(Object obj, Object obj2) {
                httpURLConnection.addRequestProperty((String) obj, (String) obj2);
            }
        });
        for (Map.Entry entry : request.S().entrySet()) {
            for (String str : (List) entry.getValue()) {
                httpURLConnection.addRequestProperty((String) entry.getKey(), str);
            }
        }
        return httpURLConnection;
    }

    public static LinkedHashMap<String, List<String>> e(HttpURLConnection httpURLConnection) {
        LinkedHashMap<String, List<String>> linkedHashMap = new LinkedHashMap<>();
        int i = 0;
        while (true) {
            String headerFieldKey = httpURLConnection.getHeaderFieldKey(i);
            String headerField = httpURLConnection.getHeaderField(i);
            if (headerFieldKey == null && headerField == null) {
                return linkedHashMap;
            }
            i++;
            if (headerFieldKey != null && headerField != null) {
                linkedHashMap.computeIfAbsent(headerFieldKey, Functions.f()).add(headerField);
            }
        }
    }

    @Override // org.jsoup.helper.RequestExecutor
    public HttpConnection.Response a() throws IOException {
        try {
            HttpURLConnection d = d(this.a);
            this.c = d;
            d.connect();
            if (this.c.getDoOutput()) {
                try {
                    OutputStream outputStream = this.c.getOutputStream();
                    HttpConnection.Response.s0(this.a, outputStream);
                    if (outputStream != null) {
                        outputStream.close();
                    }
                } catch (IOException e) {
                    this.c.disconnect();
                    throw e;
                }
            }
            HttpConnection.Response response = new HttpConnection.Response(this.a);
            response.j = this;
            response.b = Connection.Method.valueOf(this.c.getRequestMethod());
            response.a = this.c.getURL();
            response.f = this.c.getResponseCode();
            String responseMessage = this.c.getResponseMessage();
            response.g = responseMessage;
            if (responseMessage == null) {
                response.g = "";
            }
            response.l = this.c.getContentType();
            response.m = this.c.getContentLength();
            response.m0(e(this.c), this.b);
            return response;
        } catch (IOException e2) {
            c();
            throw e2;
        }
    }

    @Override // org.jsoup.helper.RequestExecutor
    public InputStream b() throws IOException {
        HttpURLConnection httpURLConnection = this.c;
        if (httpURLConnection != null) {
            if (httpURLConnection.getErrorStream() != null) {
                return this.c.getErrorStream();
            }
            return this.c.getInputStream();
        }
        throw new IllegalStateException("Not yet executed");
    }

    @Override // org.jsoup.helper.RequestExecutor
    public void c() {
        HttpURLConnection httpURLConnection = this.c;
        if (httpURLConnection != null) {
            httpURLConnection.disconnect();
            this.c = null;
        }
    }
}
