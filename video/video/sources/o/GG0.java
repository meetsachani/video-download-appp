package o;

import java.io.FilterOutputStream;
import java.io.IOException;
import java.io.OutputStream;

@InterfaceC7311ja0
@InterfaceC4238Sm
/* loaded from: classes3.dex */
public final class GG0 extends FilterOutputStream {
    public final CG0 X;

    public GG0(InterfaceC9449sG0 interfaceC9449sG0, OutputStream outputStream) {
        super((OutputStream) C10664xF1.E(outputStream));
        this.X = (CG0) C10664xF1.E(interfaceC9449sG0.g());
    }

    public AbstractC8471oG0 a() {
        return this.X.o();
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        ((FilterOutputStream) this).out.close();
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream
    public void write(int i) throws IOException {
        this.X.i((byte) i);
        ((FilterOutputStream) this).out.write(i);
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream
    public void write(byte[] bArr, int i, int i2) throws IOException {
        this.X.k(bArr, i, i2);
        ((FilterOutputStream) this).out.write(bArr, i, i2);
    }
}
