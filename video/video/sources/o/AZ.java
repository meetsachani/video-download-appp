package o;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;

/* loaded from: classes.dex */
public class AZ implements InterfaceC9167r61 {
    public final HttpURLConnection X;

    public AZ(HttpURLConnection httpURLConnection) {
        this.X = httpURLConnection;
    }

    @Override // o.InterfaceC9167r61
    public String D() {
        return this.X.getContentType();
    }

    @Override // o.InterfaceC9167r61
    public InputStream Y1() throws IOException {
        return this.X.getInputStream();
    }

    public final String a(HttpURLConnection httpURLConnection) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(httpURLConnection.getErrorStream()));
        StringBuilder sb = new StringBuilder();
        while (true) {
            try {
                String readLine = bufferedReader.readLine();
                if (readLine != null) {
                    sb.append(readLine);
                    sb.append('\n');
                } else {
                    try {
                        break;
                    } catch (Exception unused) {
                    }
                }
            } catch (Throwable th) {
                try {
                    bufferedReader.close();
                } catch (Exception unused2) {
                }
                throw th;
            }
        }
        bufferedReader.close();
        return sb.toString();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.X.disconnect();
    }

    @Override // o.InterfaceC9167r61
    public boolean isSuccessful() {
        try {
            if (this.X.getResponseCode() / 100 != 2) {
                return false;
            }
            return true;
        } catch (IOException unused) {
            return false;
        }
    }

    @Override // o.InterfaceC9167r61
    public String s4() {
        try {
            if (isSuccessful()) {
                return null;
            }
            return "Unable to fetch " + this.X.getURL() + ". Failed with " + this.X.getResponseCode() + "\n" + a(this.X);
        } catch (IOException | NullPointerException e) {
            C7190j41.f("get error failed ", e);
            return e.getMessage();
        }
    }
}
