package o;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/* renamed from: o.Yl2  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C4819Yl2 extends AbstractC8244nK1 {
    public final boolean Y0;
    public final OutputStream Z;

    public C4819Yl2(InputStream inputStream, OutputStream outputStream) {
        this(inputStream, outputStream, false);
    }

    @Override // o.AbstractC8244nK1, java.io.FilterInputStream, java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        try {
            super.close();
        } finally {
            if (this.Y0) {
                this.Z.close();
            }
        }
    }

    @Override // o.AbstractC8244nK1, java.io.FilterInputStream, java.io.InputStream
    public int read() throws IOException {
        int read = super.read();
        if (read != -1) {
            this.Z.write(read);
        }
        return read;
    }

    public C4819Yl2(InputStream inputStream, OutputStream outputStream, boolean z) {
        super(inputStream);
        this.Z = outputStream;
        this.Y0 = z;
    }

    @Override // o.AbstractC8244nK1, java.io.FilterInputStream, java.io.InputStream
    public int read(byte[] bArr) throws IOException {
        int read = super.read(bArr);
        if (read != -1) {
            this.Z.write(bArr, 0, read);
        }
        return read;
    }

    @Override // o.AbstractC8244nK1, java.io.FilterInputStream, java.io.InputStream
    public int read(byte[] bArr, int i, int i2) throws IOException {
        int read = super.read(bArr, i, i2);
        if (read != -1) {
            this.Z.write(bArr, i, read);
        }
        return read;
    }
}
