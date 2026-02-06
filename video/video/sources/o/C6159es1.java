package o;

import java.io.EOFException;
import java.io.IOException;

/* renamed from: o.es1  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C6159es1 extends AbstractC5224b1 {
    @Deprecated
    public static final C6159es1 c1 = new C6159es1();
    public final long Y;
    public long Y0;
    public long Z;
    public long Z0;
    public final boolean a1;
    public final boolean b1;

    public C6159es1() {
        this(0L, true, false);
    }

    @Override // java.io.InputStream
    public int available() {
        if (isClosed()) {
            return 0;
        }
        long j = this.Y - this.Z;
        if (j <= 0) {
            return 0;
        }
        if (j > 2147483647L) {
            return Integer.MAX_VALUE;
        }
        return (int) j;
    }

    @Override // o.AbstractC5224b1, java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        super.close();
        this.Y0 = -1L;
    }

    public final void f(String str) throws EOFException {
        if (!this.a1) {
            return;
        }
        throw new EOFException(str);
    }

    public long h() {
        return this.Z;
    }

    public long i() {
        return this.Y;
    }

    public final int j() throws IOException {
        f("handleEof()");
        return -1;
    }

    public C6159es1 k() {
        d(false);
        this.Z = 0L;
        this.Y0 = -1L;
        this.Z0 = 0L;
        return this;
    }

    public int l() {
        return 0;
    }

    @Override // java.io.InputStream
    public synchronized void mark(int i) {
        if (this.b1) {
            this.Y0 = this.Z;
            this.Z0 = i;
        } else {
            throw C5756dC2.a();
        }
    }

    @Override // java.io.InputStream
    public boolean markSupported() {
        return this.b1;
    }

    @Override // java.io.InputStream
    public int read() throws IOException {
        a();
        long j = this.Z;
        if (j == this.Y) {
            return j();
        }
        this.Z = j + 1;
        return l();
    }

    @Override // java.io.InputStream
    public synchronized void reset() throws IOException {
        if (this.b1) {
            long j = this.Y0;
            if (j >= 0) {
                if (this.Z <= this.Z0 + j) {
                    this.Z = j;
                    d(false);
                } else {
                    throw new IOException("Marked position [" + this.Y0 + "] is no longer valid - passed the read limit [" + this.Z0 + C6566gU0.g);
                }
            } else {
                throw new IOException("No position has been marked");
            }
        } else {
            throw C5756dC2.c();
        }
    }

    @Override // java.io.InputStream
    public long skip(long j) throws IOException {
        if (isClosed()) {
            f("skip(long)");
            return -1L;
        }
        long j2 = this.Z;
        long j3 = this.Y;
        if (j2 == j3) {
            return j();
        }
        long j4 = j2 + j;
        this.Z = j4;
        if (j4 > j3) {
            long j5 = j - (j4 - j3);
            this.Z = j3;
            return j5;
        }
        return j;
    }

    public C6159es1(long j) {
        this(j, true, false);
    }

    public C6159es1(long j, boolean z, boolean z2) {
        this.Y0 = -1L;
        this.Y = j;
        this.b1 = z;
        this.a1 = z2;
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr) throws IOException {
        return read(bArr, 0, bArr.length);
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr, int i, int i2) throws IOException {
        C7743lL0.q(bArr, i, i2);
        if (i2 == 0) {
            return 0;
        }
        a();
        long j = this.Z;
        long j2 = this.Y;
        if (j == j2) {
            return j();
        }
        long j3 = j + i2;
        this.Z = j3;
        if (j3 > j2) {
            i2 -= (int) (j3 - j2);
            this.Z = j2;
        }
        m(bArr, i, i2);
        return i2;
    }

    public void m(byte[] bArr, int i, int i2) {
    }
}
