package o;

import java.io.DataOutputStream;
import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.SSLSocketFactory;
import o.C9700tI0;

/* loaded from: classes.dex */
public class II0 extends AbstractC7112il {
    public static final int c = 100;
    public final b a;
    public final SSLSocketFactory b;

    /* loaded from: classes.dex */
    public static class a extends FilterInputStream {
        public final HttpURLConnection X;

        public a(HttpURLConnection httpURLConnection) {
            super(II0.k(httpURLConnection));
            this.X = httpURLConnection;
        }

        @Override // java.io.FilterInputStream, java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
            super.close();
            this.X.disconnect();
        }
    }

    /* loaded from: classes.dex */
    public interface b extends ZC2 {
    }

    public II0() {
        this(null);
    }

    public static List<MG0> f(Map<String, List<String>> map) {
        ArrayList arrayList = new ArrayList(map.size());
        for (Map.Entry<String, List<String>> entry : map.entrySet()) {
            if (entry.getKey() != null) {
                for (String str : entry.getValue()) {
                    arrayList.add(new MG0(entry.getKey(), str));
                }
            }
        }
        return arrayList;
    }

    public static boolean j(int i, int i2) {
        if (i != 4) {
            if ((100 > i2 || i2 >= 200) && i2 != 204 && i2 != 304) {
                return true;
            }
            return false;
        }
        return false;
    }

    public static InputStream k(HttpURLConnection httpURLConnection) {
        try {
            return httpURLConnection.getInputStream();
        } catch (IOException unused) {
            return httpURLConnection.getErrorStream();
        }
    }

    @Override // o.AbstractC7112il
    public CI0 b(AbstractC5091aS1<?> abstractC5091aS1, Map<String, String> map) throws IOException, C4118Rh {
        String I = abstractC5091aS1.I();
        HashMap hashMap = new HashMap();
        hashMap.putAll(map);
        hashMap.putAll(abstractC5091aS1.u());
        b bVar = this.a;
        if (bVar != null) {
            String a2 = bVar.a(I);
            if (a2 != null) {
                I = a2;
            } else {
                throw new IOException("URL blocked by rewriter: " + I);
            }
        }
        HttpURLConnection l = l(new URL(I), abstractC5091aS1);
        try {
            for (String str : hashMap.keySet()) {
                l.setRequestProperty(str, (String) hashMap.get(str));
            }
            m(l, abstractC5091aS1);
            int responseCode = l.getResponseCode();
            if (responseCode != -1) {
                if (!j(abstractC5091aS1.v(), responseCode)) {
                    CI0 ci0 = new CI0(responseCode, f(l.getHeaderFields()));
                    l.disconnect();
                    return ci0;
                }
                return new CI0(responseCode, f(l.getHeaderFields()), l.getContentLength(), h(abstractC5091aS1, l));
            }
            throw new IOException("Could not retrieve response code from HttpUrlConnection.");
        } catch (Throwable th) {
            if (0 == 0) {
                l.disconnect();
            }
            throw th;
        }
    }

    public final void d(HttpURLConnection httpURLConnection, AbstractC5091aS1<?> abstractC5091aS1, byte[] bArr) throws IOException {
        httpURLConnection.setDoOutput(true);
        if (!httpURLConnection.getRequestProperties().containsKey("Content-Type")) {
            httpURLConnection.setRequestProperty("Content-Type", abstractC5091aS1.q());
        }
        DataOutputStream dataOutputStream = new DataOutputStream(i(abstractC5091aS1, httpURLConnection, bArr.length));
        dataOutputStream.write(bArr);
        dataOutputStream.close();
    }

    public final void e(HttpURLConnection httpURLConnection, AbstractC5091aS1<?> abstractC5091aS1) throws IOException, C4118Rh {
        byte[] p = abstractC5091aS1.p();
        if (p != null) {
            d(httpURLConnection, abstractC5091aS1, p);
        }
    }

    public HttpURLConnection g(URL url) throws IOException {
        HttpURLConnection httpURLConnection = (HttpURLConnection) url.openConnection();
        httpURLConnection.setInstanceFollowRedirects(HttpURLConnection.getFollowRedirects());
        return httpURLConnection;
    }

    public InputStream h(AbstractC5091aS1<?> abstractC5091aS1, HttpURLConnection httpURLConnection) {
        return new a(httpURLConnection);
    }

    public OutputStream i(AbstractC5091aS1<?> abstractC5091aS1, HttpURLConnection httpURLConnection, int i) throws IOException {
        return httpURLConnection.getOutputStream();
    }

    public final HttpURLConnection l(URL url, AbstractC5091aS1<?> abstractC5091aS1) throws IOException {
        SSLSocketFactory sSLSocketFactory;
        HttpURLConnection g = g(url);
        int G = abstractC5091aS1.G();
        g.setConnectTimeout(G);
        g.setReadTimeout(G);
        g.setUseCaches(false);
        g.setDoInput(true);
        if ("https".equals(url.getProtocol()) && (sSLSocketFactory = this.b) != null) {
            ((HttpsURLConnection) g).setSSLSocketFactory(sSLSocketFactory);
        }
        return g;
    }

    public void m(HttpURLConnection httpURLConnection, AbstractC5091aS1<?> abstractC5091aS1) throws IOException, C4118Rh {
        switch (abstractC5091aS1.v()) {
            case -1:
                byte[] y = abstractC5091aS1.y();
                if (y != null) {
                    httpURLConnection.setRequestMethod(Q32.j);
                    d(httpURLConnection, abstractC5091aS1, y);
                    return;
                }
                return;
            case 0:
                httpURLConnection.setRequestMethod("GET");
                return;
            case 1:
                httpURLConnection.setRequestMethod(Q32.j);
                e(httpURLConnection, abstractC5091aS1);
                return;
            case 2:
                httpURLConnection.setRequestMethod("PUT");
                e(httpURLConnection, abstractC5091aS1);
                return;
            case 3:
                httpURLConnection.setRequestMethod("DELETE");
                return;
            case 4:
                httpURLConnection.setRequestMethod("HEAD");
                return;
            case 5:
                httpURLConnection.setRequestMethod("OPTIONS");
                return;
            case 6:
                httpURLConnection.setRequestMethod("TRACE");
                return;
            case 7:
                httpURLConnection.setRequestMethod(C9700tI0.a.X);
                e(httpURLConnection, abstractC5091aS1);
                return;
            default:
                throw new IllegalStateException("Unknown method type.");
        }
    }

    public II0(b bVar) {
        this(bVar, null);
    }

    public II0(b bVar, SSLSocketFactory sSLSocketFactory) {
        this.a = bVar;
        this.b = sSLSocketFactory;
    }
}
