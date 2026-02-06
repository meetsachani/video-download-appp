package o;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

/* renamed from: o.u81  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C9904u81 extends FilterInputStream {
    public static final int Y = Integer.MIN_VALUE;
    public static final int Z = -1;
    public int X;

    public C9904u81(InputStream inputStream) {
        super(inputStream);
        this.X = Integer.MIN_VALUE;
    }

    public final long a(long j) {
        int i = this.X;
        if (i == 0) {
            return -1L;
        }
        if (i != Integer.MIN_VALUE && j > i) {
            return i;
        }
        return j;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public int available() throws IOException {
        int i = this.X;
        if (i == Integer.MIN_VALUE) {
            return super.available();
        }
        return Math.min(i, super.available());
    }

    public final void d(long j) {
        int i = this.X;
        if (i != Integer.MIN_VALUE && j != -1) {
            this.X = (int) (i - j);
        }
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public synchronized void mark(int i) {
        super.mark(i);
        this.X = i;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public int read() throws IOException {
        if (a(1L) == -1) {
            return -1;
        }
        int read = super.read();
        d(1L);
        return read;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public synchronized void reset() throws IOException {
        super.reset();
        this.X = Integer.MIN_VALUE;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public long skip(long j) throws IOException {
        long a = a(j);
        if (a == -1) {
            return 0L;
        }
        long skip = super.skip(a);
        d(skip);
        return skip;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public int read(byte[] bArr, int i, int i2) throws IOException {
        int a = (int) a(i2);
        if (a == -1) {
            return -1;
        }
        int read = super.read(bArr, i, a);
        d(read);
        return read;
    }
}
