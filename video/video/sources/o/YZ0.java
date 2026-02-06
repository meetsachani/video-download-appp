package o;

import java.io.BufferedReader;
import java.io.IOException;

/* loaded from: classes3.dex */
public class YZ0 {
    public final BufferedReader a;
    public final boolean b;

    public YZ0(BufferedReader bufferedReader, boolean z) {
        this.a = bufferedReader;
        this.b = z;
    }

    public String a() throws IOException {
        if (this.b) {
            return b();
        }
        return this.a.readLine();
    }

    public final String b() throws IOException {
        StringBuilder sb = new StringBuilder(1024);
        while (true) {
            int read = this.a.read();
            if (read <= -1 || read == 10) {
                break;
            }
            sb.append((char) read);
        }
        if (sb.length() > 0) {
            return sb.toString();
        }
        return null;
    }
}
