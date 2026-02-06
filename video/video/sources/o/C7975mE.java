package o;

import java.io.IOException;
import java.io.Writer;
import java.util.Arrays;

/* renamed from: o.mE  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C7975mE extends Writer {
    public static final C7975mE X;
    @Deprecated
    public static final C7975mE Y;

    static {
        C7975mE c7975mE = new C7975mE();
        X = c7975mE;
        Y = c7975mE;
    }

    @Override // java.io.Writer, java.io.Flushable
    public void flush() throws IOException {
        throw new IOException("flush() failed: stream is closed");
    }

    @Override // java.io.Writer
    public void write(char[] cArr, int i, int i2) throws IOException {
        throw new IOException(String.format("write(%s, %d, %d) failed: stream is closed", Arrays.toString(cArr), Integer.valueOf(i), Integer.valueOf(i2)));
    }

    @Override // java.io.Writer, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
    }
}
