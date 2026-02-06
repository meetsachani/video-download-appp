package o;

import java.io.IOException;
import java.io.InputStream;

/* renamed from: o.kC2  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C7466kC2 extends InputStream {
    public volatile InputStream X;

    /* renamed from: o.kC2$a */
    /* loaded from: classes4.dex */
    public static class a extends AbstractC9396s3<C7466kC2, a> {
        @Override // o.XK0
        /* renamed from: j0 */
        public C7466kC2 get() throws IOException {
            return new C7466kC2(this);
        }
    }

    public C7466kC2(a aVar) throws IOException {
        this.X = aVar.S();
    }

    public static a a() {
        return new a();
    }

    @Override // java.io.InputStream
    public int available() throws IOException {
        return this.X.available();
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.X.close();
    }

    @Override // java.io.InputStream
    public void mark(int i) {
        this.X.mark(i);
    }

    @Override // java.io.InputStream
    public boolean markSupported() {
        return this.X.markSupported();
    }

    @Override // java.io.InputStream
    public int read() throws IOException {
        return this.X.read();
    }

    @Override // java.io.InputStream
    public void reset() throws IOException {
        this.X.reset();
    }

    @Override // java.io.InputStream
    public long skip(long j) throws IOException {
        return this.X.skip(j);
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr) throws IOException {
        return read(bArr, 0, bArr.length);
    }

    public C7466kC2(InputStream inputStream) {
        this.X = inputStream;
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr, int i, int i2) throws IOException {
        return this.X.read(bArr, i, i2);
    }
}
