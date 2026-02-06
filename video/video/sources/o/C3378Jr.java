package o;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.ClosedChannelException;
import java.nio.channels.SeekableByteChannel;
import java.util.Arrays;
import java.util.Objects;
import java.util.concurrent.locks.ReentrantLock;

/* renamed from: o.Jr  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C3378Jr implements SeekableByteChannel {
    public static final int a1 = 1073741823;
    public byte[] X;
    public volatile boolean Y;
    public int Y0;
    public int Z;
    public final ReentrantLock Z0;

    public C3378Jr() {
        this(8192);
    }

    public static C3378Jr k(byte[] bArr) {
        Objects.requireNonNull(bArr, "bytes");
        return new C3378Jr(bArr);
    }

    public byte[] a() {
        return this.X;
    }

    @Override // java.nio.channels.Channel, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.Y = true;
    }

    public final void d() throws ClosedChannelException {
        if (isOpen()) {
            return;
        }
        throw new ClosedChannelException();
    }

    public final int f(long j, String str) {
        if (j >= 0 && j <= 2147483639) {
            return (int) j;
        }
        throw new IllegalArgumentException(String.format("%s must be in range [0..%,d]: %,d", str, 2147483639, Long.valueOf(j)));
    }

    public long h() {
        return this.Y0;
    }

    public final void i(int i) {
        int length = this.X.length;
        if (length == 0) {
            length = 1;
        }
        if (i < 1073741823) {
            while (length < i) {
                length <<= 1;
            }
            i = length;
        }
        this.X = Arrays.copyOf(this.X, i);
    }

    @Override // java.nio.channels.Channel
    public boolean isOpen() {
        return !this.Y;
    }

    public byte[] j() {
        return Arrays.copyOf(this.X, this.Y0);
    }

    @Override // java.nio.channels.SeekableByteChannel
    public long position() throws ClosedChannelException {
        d();
        this.Z0.lock();
        try {
            return this.Z;
        } finally {
            this.Z0.unlock();
        }
    }

    @Override // java.nio.channels.SeekableByteChannel, java.nio.channels.ReadableByteChannel
    public int read(ByteBuffer byteBuffer) throws IOException {
        d();
        this.Z0.lock();
        try {
            int remaining = byteBuffer.remaining();
            int i = this.Y0;
            int i2 = this.Z;
            int i3 = i - i2;
            if (i3 <= 0) {
                this.Z0.unlock();
                return -1;
            }
            if (remaining > i3) {
                remaining = i3;
            }
            byteBuffer.put(this.X, i2, remaining);
            this.Z += remaining;
            return remaining;
        } finally {
            this.Z0.unlock();
        }
    }

    @Override // java.nio.channels.SeekableByteChannel
    public long size() throws ClosedChannelException {
        d();
        this.Z0.lock();
        try {
            return this.Y0;
        } finally {
            this.Z0.unlock();
        }
    }

    @Override // java.nio.channels.SeekableByteChannel
    public SeekableByteChannel truncate(long j) throws ClosedChannelException {
        d();
        int f = f(j, "truncate()");
        this.Z0.lock();
        try {
            if (this.Y0 > f) {
                this.Y0 = f;
            }
            if (this.Z > f) {
                this.Z = f;
            }
            this.Z0.unlock();
            return this;
        } catch (Throwable th) {
            this.Z0.unlock();
            throw th;
        }
    }

    @Override // java.nio.channels.SeekableByteChannel, java.nio.channels.WritableByteChannel
    public int write(ByteBuffer byteBuffer) throws IOException {
        d();
        this.Z0.lock();
        try {
            int remaining = byteBuffer.remaining();
            if (remaining > Math.max(0, this.Y0 - this.Z)) {
                int i = this.Z + remaining;
                if (i >= 0 && i <= 2147483639) {
                    i(i);
                } else {
                    throw new OutOfMemoryError("required array size " + C3182Hr.a(i) + " too large");
                }
            }
            byteBuffer.get(this.X, this.Z, remaining);
            int i2 = this.Z + remaining;
            this.Z = i2;
            if (this.Y0 < i2) {
                this.Y0 = i2;
            }
            this.Z0.unlock();
            return remaining;
        } catch (Throwable th) {
            this.Z0.unlock();
            throw th;
        }
    }

    public C3378Jr(byte[] bArr) {
        this.Z0 = new ReentrantLock();
        this.X = bArr;
        this.Z = 0;
        this.Y0 = bArr.length;
    }

    @Override // java.nio.channels.SeekableByteChannel
    public SeekableByteChannel position(long j) throws IOException {
        d();
        int f = f(j, "position()");
        this.Z0.lock();
        try {
            this.Z = f;
            return this;
        } finally {
            this.Z0.unlock();
        }
    }

    public C3378Jr(int i) {
        this.Z0 = new ReentrantLock();
        if (i >= 0) {
            this.X = new byte[i];
            this.Z = 0;
            this.Y0 = 0;
            return;
        }
        throw new IllegalArgumentException("Size must be non-negative");
    }
}
