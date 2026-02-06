package o;

import java.io.ByteArrayOutputStream;
import java.io.IOException;

/* loaded from: classes.dex */
public class AE1 extends ByteArrayOutputStream {
    public static final int Y = 256;
    public final C3084Gr X;

    public AE1(C3084Gr c3084Gr) {
        this(c3084Gr, 256);
    }

    public final void a(int i) {
        int i2 = ((ByteArrayOutputStream) this).count;
        if (i2 + i <= ((ByteArrayOutputStream) this).buf.length) {
            return;
        }
        byte[] a = this.X.a((i2 + i) * 2);
        System.arraycopy(((ByteArrayOutputStream) this).buf, 0, a, 0, ((ByteArrayOutputStream) this).count);
        this.X.b(((ByteArrayOutputStream) this).buf);
        ((ByteArrayOutputStream) this).buf = a;
    }

    @Override // java.io.ByteArrayOutputStream, java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.X.b(((ByteArrayOutputStream) this).buf);
        ((ByteArrayOutputStream) this).buf = null;
        super.close();
    }

    public void finalize() {
        this.X.b(((ByteArrayOutputStream) this).buf);
    }

    @Override // java.io.ByteArrayOutputStream, java.io.OutputStream
    public synchronized void write(byte[] bArr, int i, int i2) {
        a(i2);
        super.write(bArr, i, i2);
    }

    public AE1(C3084Gr c3084Gr, int i) {
        this.X = c3084Gr;
        ((ByteArrayOutputStream) this).buf = c3084Gr.a(Math.max(i, 256));
    }

    @Override // java.io.ByteArrayOutputStream, java.io.OutputStream
    public synchronized void write(int i) {
        a(1);
        super.write(i);
    }
}
