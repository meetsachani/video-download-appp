package o;

import java.io.IOException;
import java.io.OutputStream;

/* renamed from: o.Zl2  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C4926Zl2 extends C9952uK1 {
    public OutputStream X;

    public C4926Zl2(OutputStream outputStream, OutputStream outputStream2) {
        super(outputStream);
        this.X = outputStream2;
    }

    @Override // o.C9952uK1, java.io.FilterOutputStream, java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        try {
            super.close();
        } finally {
            this.X.close();
        }
    }

    @Override // o.C9952uK1, java.io.FilterOutputStream, java.io.OutputStream, java.io.Flushable
    public void flush() throws IOException {
        super.flush();
        this.X.flush();
    }

    @Override // o.C9952uK1, java.io.FilterOutputStream, java.io.OutputStream
    public synchronized void write(byte[] bArr) throws IOException {
        super.write(bArr);
        this.X.write(bArr);
    }

    @Override // o.C9952uK1, java.io.FilterOutputStream, java.io.OutputStream
    public synchronized void write(byte[] bArr, int i, int i2) throws IOException {
        super.write(bArr, i, i2);
        this.X.write(bArr, i, i2);
    }

    @Override // o.C9952uK1, java.io.FilterOutputStream, java.io.OutputStream
    public synchronized void write(int i) throws IOException {
        super.write(i);
        this.X.write(i);
    }
}
