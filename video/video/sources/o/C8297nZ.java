package o;

import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;

/* renamed from: o.nZ  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C8297nZ implements InterfaceC9457sI0 {
    public URLConnection X;

    @Override // o.InterfaceC9457sI0
    public int E0() throws IOException {
        URLConnection uRLConnection = this.X;
        if (uRLConnection instanceof HttpURLConnection) {
            return ((HttpURLConnection) uRLConnection).getResponseCode();
        }
        return 0;
    }

    @Override // o.InterfaceC9457sI0
    public InputStream G0() {
        URLConnection uRLConnection = this.X;
        if (uRLConnection instanceof HttpURLConnection) {
            return ((HttpURLConnection) uRLConnection).getErrorStream();
        }
        return null;
    }

    @Override // o.InterfaceC9457sI0
    public void H0(C5730d60 c5730d60) throws IOException {
        URLConnection openConnection = new URL(c5730d60.E()).openConnection();
        this.X = openConnection;
        openConnection.setReadTimeout(c5730d60.y());
        this.X.setConnectTimeout(c5730d60.o());
        this.X.addRequestProperty("Range", String.format(Locale.ENGLISH, "bytes=%d-", Long.valueOf(c5730d60.s())));
        this.X.addRequestProperty("User-Agent", c5730d60.F());
        b(c5730d60);
        this.X.connect();
    }

    @Override // o.InterfaceC9457sI0
    public InputStream P3() throws IOException {
        return this.X.getInputStream();
    }

    @Override // o.InterfaceC9457sI0
    public Map<String, List<String>> T1() {
        return this.X.getHeaderFields();
    }

    @Override // o.InterfaceC9457sI0
    public String Z0(String str) {
        return this.X.getHeaderField(str);
    }

    public final void b(C5730d60 c5730d60) {
        HashMap<String, List<String>> v = c5730d60.v();
        if (v != null) {
            for (Map.Entry<String, List<String>> entry : v.entrySet()) {
                String key = entry.getKey();
                List<String> value = entry.getValue();
                if (value != null) {
                    for (String str : value) {
                        this.X.addRequestProperty(key, str);
                    }
                }
            }
        }
    }

    @Override // o.InterfaceC9457sI0
    public long getContentLength() {
        try {
            return Long.parseLong(this.X.getHeaderField("Content-Length"));
        } catch (NumberFormatException unused) {
            return -1L;
        }
    }

    @Override // o.InterfaceC9457sI0
    public InterfaceC9457sI0 clone() {
        return new C8297nZ();
    }

    @Override // o.InterfaceC9457sI0
    public void close() {
    }
}
