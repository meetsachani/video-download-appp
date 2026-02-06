package o;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

@InterfaceC7311ja0
@InterfaceC4238Sm
/* loaded from: classes3.dex */
public final class FG0 extends FilterInputStream {
    public final CG0 X;

    public FG0(InterfaceC9449sG0 interfaceC9449sG0, InputStream inputStream) {
        super((InputStream) C10664xF1.E(inputStream));
        this.X = (CG0) C10664xF1.E(interfaceC9449sG0.g());
    }

    public AbstractC8471oG0 a() {
        return this.X.o();
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public boolean markSupported() {
        return false;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    @InterfaceC6181ey
    public int read() throws IOException {
        int read = ((FilterInputStream) this).in.read();
        if (read != -1) {
            this.X.i((byte) read);
        }
        return read;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public void reset() throws IOException {
        throw new IOException("reset not supported");
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    @InterfaceC6181ey
    public int read(byte[] bArr, int i, int i2) throws IOException {
        int read = ((FilterInputStream) this).in.read(bArr, i, i2);
        if (read != -1) {
            this.X.k(bArr, i, read);
        }
        return read;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public void mark(int i) {
    }
}
