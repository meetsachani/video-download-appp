package o;

import java.io.IOException;
import java.io.InputStream;
import java.util.Iterator;

@InterfaceC7797la0
@InterfaceC11149zF0
/* renamed from: o.Tl1  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C4333Tl1 extends InputStream {
    public Iterator<? extends AbstractC7625ks> X;
    @MB
    public InputStream Y;

    public C4333Tl1(Iterator<? extends AbstractC7625ks> it) throws IOException {
        this.X = (Iterator) C10664xF1.E(it);
        a();
    }

    public final void a() throws IOException {
        close();
        if (this.X.hasNext()) {
            this.Y = this.X.next().m();
        }
    }

    @Override // java.io.InputStream
    public int available() throws IOException {
        InputStream inputStream = this.Y;
        if (inputStream == null) {
            return 0;
        }
        return inputStream.available();
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        InputStream inputStream = this.Y;
        if (inputStream != null) {
            try {
                inputStream.close();
            } finally {
                this.Y = null;
            }
        }
    }

    @Override // java.io.InputStream
    public boolean markSupported() {
        return false;
    }

    @Override // java.io.InputStream
    public int read() throws IOException {
        while (true) {
            InputStream inputStream = this.Y;
            if (inputStream == null) {
                return -1;
            }
            int read = inputStream.read();
            if (read != -1) {
                return read;
            }
            a();
        }
    }

    @Override // java.io.InputStream
    public long skip(long j) throws IOException {
        InputStream inputStream = this.Y;
        if (inputStream == null || j <= 0) {
            return 0L;
        }
        long skip = inputStream.skip(j);
        if (skip != 0) {
            return skip;
        }
        if (read() == -1) {
            return 0L;
        }
        return this.Y.skip(j - 1) + 1;
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr, int i, int i2) throws IOException {
        C10664xF1.E(bArr);
        while (true) {
            InputStream inputStream = this.Y;
            if (inputStream == null) {
                return -1;
            }
            int read = inputStream.read(bArr, i, i2);
            if (read != -1) {
                return read;
            }
            a();
        }
    }
}
