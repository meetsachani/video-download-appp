package o;

import java.io.FilterOutputStream;
import java.io.IOException;
import java.io.OutputStream;

@InterfaceC7797la0
@InterfaceC11149zF0
/* loaded from: classes3.dex */
public final class MQ extends FilterOutputStream {
    public long X;

    public MQ(OutputStream outputStream) {
        super((OutputStream) C10664xF1.E(outputStream));
    }

    public long a() {
        return this.X;
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        ((FilterOutputStream) this).out.close();
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream
    public void write(byte[] bArr, int i, int i2) throws IOException {
        ((FilterOutputStream) this).out.write(bArr, i, i2);
        this.X += i2;
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream
    public void write(int i) throws IOException {
        ((FilterOutputStream) this).out.write(i);
        this.X++;
    }
}
