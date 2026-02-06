package o;

import java.io.IOException;
import java.io.InputStream;
import java.util.Queue;

/* renamed from: o.rf0  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C9300rf0 extends InputStream {
    public static final Queue<C9300rf0> Z = SD2.g(0);
    public InputStream X;
    public IOException Y;

    public static void a() {
        synchronized (Z) {
            while (true) {
                try {
                    Queue<C9300rf0> queue = Z;
                    if (!queue.isEmpty()) {
                        queue.remove();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    public static C9300rf0 d(InputStream inputStream) {
        C9300rf0 poll;
        Queue<C9300rf0> queue = Z;
        synchronized (queue) {
            poll = queue.poll();
        }
        if (poll == null) {
            poll = new C9300rf0();
        }
        poll.f(inputStream);
        return poll;
    }

    public IOException Y0() {
        return this.Y;
    }

    @Override // java.io.InputStream
    public int available() throws IOException {
        return this.X.available();
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.X.close();
    }

    public void f(InputStream inputStream) {
        this.X = inputStream;
    }

    public void g() {
        this.Y = null;
        this.X = null;
        Queue<C9300rf0> queue = Z;
        synchronized (queue) {
            queue.offer(this);
        }
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
        try {
            return this.X.read();
        } catch (IOException e) {
            this.Y = e;
            throw e;
        }
    }

    @Override // java.io.InputStream
    public synchronized void reset() throws IOException {
        this.X.reset();
    }

    @Override // java.io.InputStream
    public long skip(long j) throws IOException {
        try {
            return this.X.skip(j);
        } catch (IOException e) {
            this.Y = e;
            throw e;
        }
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr) throws IOException {
        try {
            return this.X.read(bArr);
        } catch (IOException e) {
            this.Y = e;
            throw e;
        }
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr, int i, int i2) throws IOException {
        try {
            return this.X.read(bArr, i, i2);
        } catch (IOException e) {
            this.Y = e;
            throw e;
        }
    }
}
