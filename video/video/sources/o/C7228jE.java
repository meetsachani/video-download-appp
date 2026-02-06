package o;

import java.io.IOException;
import java.io.Reader;

/* renamed from: o.jE  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C7228jE extends Reader {
    public static final C7228jE X;
    @Deprecated
    public static final C7228jE Y;

    static {
        C7228jE c7228jE = new C7228jE();
        X = c7228jE;
        Y = c7228jE;
    }

    @Override // java.io.Reader
    public int read(char[] cArr, int i, int i2) {
        C7743lL0.r(cArr, i, i2);
        if (i2 == 0) {
            return 0;
        }
        return -1;
    }

    @Override // java.io.Reader, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
    }
}
