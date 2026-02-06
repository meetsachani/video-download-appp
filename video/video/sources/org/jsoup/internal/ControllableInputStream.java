package org.jsoup.internal;

import java.io.BufferedInputStream;
import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.SocketTimeoutException;
import java.nio.ByteBuffer;
import org.jsoup.Progress;
import org.jsoup.helper.Validate;

/* loaded from: classes4.dex */
public class ControllableInputStream extends FilterInputStream {
    public final SimpleBufferedInput X;
    public int Y;
    public long Y0;
    public long Z;
    public int Z0;
    public int a1;
    public boolean b1;
    public boolean c1;
    public Progress<?> d1;
    public Object e1;
    public int f1;
    public int g1;

    public ControllableInputStream(SimpleBufferedInput simpleBufferedInput, int i) {
        super(simpleBufferedInput);
        this.Y0 = 0L;
        this.c1 = true;
        this.f1 = -1;
        this.g1 = 0;
        Validate.j(i >= 0);
        this.X = simpleBufferedInput;
        this.Y = i;
        this.Z0 = i;
        this.a1 = -1;
        this.Z = System.nanoTime();
    }

    public static ByteBuffer m(InputStream inputStream, int i) throws IOException {
        boolean z;
        int i2;
        int min;
        boolean z2 = true;
        if (i >= 0) {
            z = true;
        } else {
            z = false;
        }
        Validate.k(z, "maxSize must be 0 (unlimited) or larger");
        Validate.q(inputStream);
        if (i <= 0) {
            z2 = false;
        }
        byte[] b = SimpleBufferedInput.b1.b();
        if (z2) {
            i2 = Math.min(i, 8192);
        } else {
            i2 = 8192;
        }
        ByteBuffer allocate = ByteBuffer.allocate(i2);
        while (true) {
            if (z2) {
                try {
                    min = Math.min(i, 8192);
                } catch (Throwable th) {
                    SimpleBufferedInput.b1.d(b);
                    throw th;
                }
            } else {
                min = 8192;
            }
            int read = inputStream.read(b, 0, min);
            if (read != -1) {
                if (allocate.remaining() < read) {
                    ByteBuffer allocate2 = ByteBuffer.allocate((int) Math.max(allocate.capacity() * 1.5d, allocate.capacity() + read));
                    allocate.flip();
                    allocate2.put(allocate);
                    allocate = allocate2;
                }
                allocate.put(b, 0, read);
                if (z2 && (i = i - read) <= 0) {
                    break;
                }
            } else {
                break;
            }
        }
        allocate.flip();
        SimpleBufferedInput.b1.d(b);
        return allocate;
    }

    public static ControllableInputStream o(InputStream inputStream, int i) {
        if (inputStream instanceof ControllableInputStream) {
            return (ControllableInputStream) inputStream;
        }
        return new ControllableInputStream(new SimpleBufferedInput(inputStream), i);
    }

    public static ControllableInputStream p(InputStream inputStream, int i, int i2) {
        return o(inputStream, i2);
    }

    public void a(boolean z) {
        this.c1 = z;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        if (this.c1) {
            super.close();
        }
    }

    public boolean d() {
        return this.X.d();
    }

    public final void f() {
        float f;
        if (this.d1 != null) {
            int i = this.f1;
            if (i > 0) {
                f = Math.min(100.0f, (this.g1 * 100.0f) / i);
            } else {
                f = 0.0f;
            }
            this.d1.a(this.g1, this.f1, f, this.e1);
            if (f == 100.0f) {
                this.d1 = null;
            }
        }
    }

    public final boolean h() {
        if (this.Y0 == 0 || System.nanoTime() - this.Z <= this.Y0) {
            return false;
        }
        return true;
    }

    public BufferedInputStream i() {
        return new BufferedInputStream(this.X);
    }

    public int j() {
        return this.Y;
    }

    public void k(int i) {
        this.Z0 += i - this.Y;
        this.Y = i;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public <ProgressContext> ControllableInputStream l(int i, Progress<ProgressContext> progress, ProgressContext progresscontext) {
        Validate.q(progress);
        Validate.q(progresscontext);
        this.f1 = i;
        this.d1 = progress;
        this.e1 = progresscontext;
        return this;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public void mark(int i) {
        super.mark(i);
        this.a1 = this.Y - this.Z0;
    }

    public ControllableInputStream n(long j, long j2) {
        this.Z = j;
        this.Y0 = j2 * 1000000;
        return this;
    }

    /* JADX WARN: Removed duplicated region for block: B:42:0x0035 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // java.io.FilterInputStream, java.io.InputStream
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public int read(byte[] bArr, int i, int i2) throws IOException {
        boolean z;
        int i3;
        if (this.g1 == 0) {
            f();
        }
        if (this.Y != 0) {
            z = true;
        } else {
            z = false;
        }
        if (this.b1 || (z && this.Z0 <= 0)) {
            return -1;
        }
        if (Thread.currentThread().isInterrupted()) {
            this.b1 = true;
            return -1;
        }
        if (z && i2 > (i3 = this.Z0)) {
            i2 = i3;
        }
        while (!h()) {
            try {
                int read = super.read(bArr, i, i2);
                if (read == -1) {
                    this.f1 = this.g1;
                } else {
                    this.Z0 -= read;
                    this.g1 += read;
                }
                f();
                return read;
            } catch (SocketTimeoutException e) {
                if (h() || this.Y0 == 0) {
                    throw e;
                }
                while (!h()) {
                }
                throw new SocketTimeoutException("Read timeout");
            }
        }
        throw new SocketTimeoutException("Read timeout");
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public void reset() throws IOException {
        super.reset();
        int i = this.Y;
        int i2 = this.a1;
        this.Z0 = i - i2;
        this.g1 = i2;
    }
}
