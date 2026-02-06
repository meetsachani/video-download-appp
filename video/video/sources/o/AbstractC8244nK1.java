package o;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

/* renamed from: o.nK1  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC8244nK1 extends FilterInputStream {
    public volatile boolean X;
    public final XJ0 Y;

    /* renamed from: o.nK1$a */
    /* loaded from: classes4.dex */
    public static abstract class a<T, B extends AbstractC9396s3<T, B>> extends AbstractC9396s3<T, B> {
        public XJ0 l;

        public XJ0 j0() {
            return this.l;
        }

        public B k0(XJ0 xj0) {
            this.l = xj0;
            return (B) c();
        }
    }

    public AbstractC8244nK1(a<?, ?> aVar) throws IOException {
        this(aVar.S(), aVar);
    }

    public void a(int i) throws IOException {
        this.Y.accept(i);
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public int available() throws IOException {
        if (((FilterInputStream) this).in != null && !isClosed()) {
            try {
                return ((FilterInputStream) this).in.available();
            } catch (IOException e) {
                h(e);
                return 0;
            }
        }
        return 0;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        C7743lL0.w(((FilterInputStream) this).in, new EJ0() { // from class: o.mK1
            @Override // o.EJ0
            public final void accept(Object obj) {
                AbstractC8244nK1.this.h((IOException) obj);
            }
        });
        this.X = true;
    }

    public void f() throws IOException {
        YP0.a(!isClosed());
    }

    public AbstractC8244nK1 i(InputStream inputStream) {
        ((FilterInputStream) this).in = inputStream;
        return this;
    }

    public boolean isClosed() {
        return this.X;
    }

    public InputStream j() {
        return ((FilterInputStream) this).in;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public synchronized void mark(int i) {
        if (((FilterInputStream) this).in != null) {
            ((FilterInputStream) this).in.mark(i);
        }
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public boolean markSupported() {
        if (((FilterInputStream) this).in != null && ((FilterInputStream) this).in.markSupported()) {
            return true;
        }
        return false;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public int read() throws IOException {
        int i = 1;
        try {
            d(1);
            int read = ((FilterInputStream) this).in.read();
            if (read == -1) {
                i = -1;
            }
            a(i);
            return read;
        } catch (IOException e) {
            h(e);
            return -1;
        }
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public synchronized void reset() throws IOException {
        try {
            ((FilterInputStream) this).in.reset();
        } catch (IOException e) {
            h(e);
        }
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public long skip(long j) throws IOException {
        try {
            return ((FilterInputStream) this).in.skip(j);
        } catch (IOException e) {
            h(e);
            return 0L;
        }
    }

    public AbstractC8244nK1(InputStream inputStream) {
        super(inputStream);
        this.Y = XJ0.a;
    }

    public AbstractC8244nK1(InputStream inputStream, a<?, ?> aVar) {
        super(inputStream);
        this.Y = aVar.j0() != null ? aVar.j0() : XJ0.a;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public int read(byte[] bArr) throws IOException {
        try {
            d(C7743lL0.s0(bArr));
            int read = ((FilterInputStream) this).in.read(bArr);
            a(read);
            return read;
        } catch (IOException e) {
            h(e);
            return -1;
        }
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public int read(byte[] bArr, int i, int i2) throws IOException {
        try {
            d(i2);
            int read = ((FilterInputStream) this).in.read(bArr, i, i2);
            a(read);
            return read;
        } catch (IOException e) {
            h(e);
            return -1;
        }
    }

    public void d(int i) throws IOException {
    }

    public void h(IOException iOException) throws IOException {
        throw iOException;
    }
}
