package o;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

@InterfaceC7797la0
@InterfaceC11149zF0
@InterfaceC4238Sm
/* loaded from: classes3.dex */
public final class KQ extends FilterInputStream {
    public long X;
    public long Y;

    public KQ(InputStream inputStream) {
        super((InputStream) C10664xF1.E(inputStream));
        this.Y = -1L;
    }

    public long a() {
        return this.X;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public synchronized void mark(int i) {
        ((FilterInputStream) this).in.mark(i);
        this.Y = this.X;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public int read() throws IOException {
        int read = ((FilterInputStream) this).in.read();
        if (read != -1) {
            this.X++;
        }
        return read;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public synchronized void reset() throws IOException {
        if (((FilterInputStream) this).in.markSupported()) {
            if (this.Y != -1) {
                ((FilterInputStream) this).in.reset();
                this.X = this.Y;
            } else {
                throw new IOException("Mark not set");
            }
        } else {
            throw new IOException("Mark not supported");
        }
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public long skip(long j) throws IOException {
        long skip = ((FilterInputStream) this).in.skip(j);
        this.X += skip;
        return skip;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public int read(byte[] bArr, int i, int i2) throws IOException {
        int read = ((FilterInputStream) this).in.read(bArr, i, i2);
        if (read != -1) {
            this.X += read;
        }
        return read;
    }
}
