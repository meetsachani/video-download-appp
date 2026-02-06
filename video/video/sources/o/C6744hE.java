package o;

import java.io.IOException;
import java.io.OutputStream;

/* renamed from: o.hE  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C6744hE extends OutputStream {
    public static final C6744hE X;
    @Deprecated
    public static final C6744hE Y;

    static {
        C6744hE c6744hE = new C6744hE();
        X = c6744hE;
        Y = c6744hE;
    }

    @Override // java.io.OutputStream, java.io.Flushable
    public void flush() throws IOException {
        throw new IOException("flush() failed: stream is closed");
    }

    @Override // java.io.OutputStream
    public void write(byte[] bArr, int i, int i2) throws IOException {
        C7743lL0.q(bArr, i, i2);
        throw new IOException("write(byte[], int, int) failed: stream is closed");
    }

    @Override // java.io.OutputStream
    public void write(int i) throws IOException {
        throw new IOException("write(int) failed: stream is closed");
    }
}
