package o;

import java.io.IOException;
import java.io.InputStream;

@Deprecated
/* loaded from: classes2.dex */
public final class MU extends InputStream {
    public final FU X;
    public final OU Y;
    public long a1;
    public boolean Y0 = false;
    public boolean Z0 = false;
    public final byte[] Z = new byte[1];

    public MU(FU fu, OU ou) {
        this.X = fu;
        this.Y = ou;
    }

    public long a() {
        return this.a1;
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        if (!this.Z0) {
            this.X.close();
            this.Z0 = true;
        }
    }

    public final void d() throws IOException {
        if (!this.Y0) {
            this.X.a(this.Y);
            this.Y0 = true;
        }
    }

    public void f() throws IOException {
        d();
    }

    @Override // java.io.InputStream
    public int read() throws IOException {
        if (read(this.Z) == -1) {
            return -1;
        }
        return this.Z[0] & 255;
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr) throws IOException {
        return read(bArr, 0, bArr.length);
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr, int i, int i2) throws IOException {
        C9542sf.i(!this.Z0);
        d();
        int read = this.X.read(bArr, i, i2);
        if (read == -1) {
            return -1;
        }
        this.a1 += read;
        return read;
    }
}
