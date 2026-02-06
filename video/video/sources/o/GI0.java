package o;

import android.text.TextUtils;
import android.util.Log;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.Map;
import o.InterfaceC9990uU;

/* loaded from: classes.dex */
public class GI0 implements InterfaceC9990uU<InputStream> {
    public static final String b1 = "HttpUrlFetcher";
    public static final int c1 = 5;
    public static final String d1 = "Location";
    public static final b e1 = new a();
    public static final int f1 = -1;
    public final C5519cE0 X;
    public final int Y;
    public HttpURLConnection Y0;
    public final b Z;
    public InputStream Z0;
    public volatile boolean a1;

    /* loaded from: classes.dex */
    public static class a implements b {
        @Override // o.GI0.b
        public HttpURLConnection a(URL url) throws IOException {
            return (HttpURLConnection) url.openConnection();
        }
    }

    /* loaded from: classes.dex */
    public interface b {
        HttpURLConnection a(URL url) throws IOException;
    }

    public GI0(C5519cE0 c5519cE0, int i) {
        this(c5519cE0, i, e1);
    }

    public static int f(HttpURLConnection httpURLConnection) {
        try {
            return httpURLConnection.getResponseCode();
        } catch (IOException e) {
            if (Log.isLoggable(b1, 3)) {
                Log.d(b1, "Failed to get a response code", e);
                return -1;
            }
            return -1;
        }
    }

    public static boolean h(int i) {
        if (i / 100 == 2) {
            return true;
        }
        return false;
    }

    public static boolean i(int i) {
        if (i / 100 == 3) {
            return true;
        }
        return false;
    }

    @Override // o.InterfaceC9990uU
    public Class<InputStream> a() {
        return InputStream.class;
    }

    @Override // o.InterfaceC9990uU
    public void b() {
        InputStream inputStream = this.Z0;
        if (inputStream != null) {
            try {
                inputStream.close();
            } catch (IOException unused) {
            }
        }
        HttpURLConnection httpURLConnection = this.Y0;
        if (httpURLConnection != null) {
            httpURLConnection.disconnect();
        }
        this.Y0 = null;
    }

    public final HttpURLConnection c(URL url, Map<String, String> map) throws C10675xI0 {
        try {
            HttpURLConnection a2 = this.Z.a(url);
            for (Map.Entry<String, String> entry : map.entrySet()) {
                a2.addRequestProperty(entry.getKey(), entry.getValue());
            }
            a2.setConnectTimeout(this.Y);
            a2.setReadTimeout(this.Y);
            a2.setUseCaches(false);
            a2.setDoInput(true);
            a2.setInstanceFollowRedirects(false);
            return a2;
        } catch (IOException e) {
            throw new C10675xI0("URL.openConnection threw", 0, e);
        }
    }

    @Override // o.InterfaceC9990uU
    public void cancel() {
        this.a1 = true;
    }

    @Override // o.InterfaceC9990uU
    public void d(EnumC10672xH1 enumC10672xH1, InterfaceC9990uU.a<? super InputStream> aVar) {
        long b2 = C5965e41.b();
        try {
            try {
                aVar.f(j(this.X.i(), 0, null, this.X.e()));
                if (Log.isLoggable(b1, 2)) {
                    Log.v(b1, "Finished http url fetcher fetch in " + C5965e41.a(b2));
                }
            } catch (IOException e) {
                if (Log.isLoggable(b1, 3)) {
                    Log.d(b1, "Failed to load data for url", e);
                }
                aVar.c(e);
                if (Log.isLoggable(b1, 2)) {
                    Log.v(b1, "Finished http url fetcher fetch in " + C5965e41.a(b2));
                }
            }
        } catch (Throwable th) {
            if (Log.isLoggable(b1, 2)) {
                Log.v(b1, "Finished http url fetcher fetch in " + C5965e41.a(b2));
            }
            throw th;
        }
    }

    @Override // o.InterfaceC9990uU
    public GU e() {
        return GU.REMOTE;
    }

    public final InputStream g(HttpURLConnection httpURLConnection) throws C10675xI0 {
        try {
            if (TextUtils.isEmpty(httpURLConnection.getContentEncoding())) {
                this.Z0 = ZL.d(httpURLConnection.getInputStream(), httpURLConnection.getContentLength());
            } else {
                if (Log.isLoggable(b1, 3)) {
                    Log.d(b1, "Got non empty content encoding: " + httpURLConnection.getContentEncoding());
                }
                this.Z0 = httpURLConnection.getInputStream();
            }
            return this.Z0;
        } catch (IOException e) {
            throw new C10675xI0("Failed to obtain InputStream", f(httpURLConnection), e);
        }
    }

    public final InputStream j(URL url, int i, URL url2, Map<String, String> map) throws C10675xI0 {
        if (i < 5) {
            if (url2 != null) {
                try {
                    if (url.toURI().equals(url2.toURI())) {
                        throw new C10675xI0("In re-direct loop", -1);
                    }
                } catch (URISyntaxException unused) {
                }
            }
            HttpURLConnection c = c(url, map);
            this.Y0 = c;
            try {
                c.connect();
                this.Z0 = this.Y0.getInputStream();
                if (this.a1) {
                    return null;
                }
                int f = f(this.Y0);
                if (h(f)) {
                    return g(this.Y0);
                }
                if (i(f)) {
                    String headerField = this.Y0.getHeaderField("Location");
                    if (!TextUtils.isEmpty(headerField)) {
                        try {
                            URL url3 = new URL(url, headerField);
                            b();
                            return j(url3, i + 1, url, map);
                        } catch (MalformedURLException e) {
                            throw new C10675xI0("Bad redirect url: " + headerField, f, e);
                        }
                    }
                    throw new C10675xI0("Received empty or null redirect url", f);
                } else if (f == -1) {
                    throw new C10675xI0(f);
                } else {
                    try {
                        throw new C10675xI0(this.Y0.getResponseMessage(), f);
                    } catch (IOException e2) {
                        throw new C10675xI0("Failed to get a response message", f, e2);
                    }
                }
            } catch (IOException e3) {
                throw new C10675xI0("Failed to connect or obtain data", f(this.Y0), e3);
            }
        }
        throw new C10675xI0("Too many (> 5) redirects!", -1);
    }

    public GI0(C5519cE0 c5519cE0, int i, b bVar) {
        this.X = c5519cE0;
        this.Y = i;
        this.Z = bVar;
    }
}
