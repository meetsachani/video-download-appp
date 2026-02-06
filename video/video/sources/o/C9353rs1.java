package o;

import java.io.EOFException;
import java.io.IOException;
import java.io.Reader;

/* renamed from: o.rs1  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C9353rs1 extends Reader {
    public static final C9353rs1 c1 = new C9353rs1();
    public final long X;
    public final boolean Y;
    public long Y0;
    public final boolean Z;
    public long Z0;
    public long a1;
    public boolean b1;

    public C9353rs1() {
        this(0L, true, false);
    }

    public final int a() throws EOFException {
        this.b1 = true;
        if (!this.Y) {
            return -1;
        }
        throw new EOFException();
    }

    @Override // java.io.Reader, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.b1 = false;
        this.Y0 = 0L;
        this.Z0 = -1L;
    }

    public long d() {
        return this.Y0;
    }

    public long f() {
        return this.X;
    }

    public int h() {
        return 0;
    }

    @Override // java.io.Reader
    public synchronized void mark(int i) {
        if (this.Z) {
            this.Z0 = this.Y0;
            this.a1 = i;
        } else {
            throw C5756dC2.a();
        }
    }

    @Override // java.io.Reader
    public boolean markSupported() {
        return this.Z;
    }

    @Override // java.io.Reader
    public int read() throws IOException {
        if (!this.b1) {
            long j = this.Y0;
            if (j == this.X) {
                return a();
            }
            this.Y0 = j + 1;
            return h();
        }
        throw new IOException("Read after end of file");
    }

    @Override // java.io.Reader
    public synchronized void reset() throws IOException {
        if (this.Z) {
            long j = this.Z0;
            if (j >= 0) {
                if (this.Y0 <= this.a1 + j) {
                    this.Y0 = j;
                    this.b1 = false;
                } else {
                    throw new IOException("Marked position [" + this.Z0 + "] is no longer valid - passed the read limit [" + this.a1 + C6566gU0.g);
                }
            } else {
                throw new IOException("No position has been marked");
            }
        } else {
            throw C5756dC2.c();
        }
    }

    @Override // java.io.Reader
    public long skip(long j) throws IOException {
        if (!this.b1) {
            long j2 = this.Y0;
            long j3 = this.X;
            if (j2 == j3) {
                return a();
            }
            long j4 = j2 + j;
            this.Y0 = j4;
            if (j4 > j3) {
                long j5 = j - (j4 - j3);
                this.Y0 = j3;
                return j5;
            }
            return j;
        }
        throw new IOException("Skip after end of file");
    }

    public C9353rs1(long j) {
        this(j, true, false);
    }

    public C9353rs1(long j, boolean z, boolean z2) {
        this.Z0 = -1L;
        this.X = j;
        this.Z = z;
        this.Y = z2;
    }

    @Override // java.io.Reader
    public int read(char[] cArr) throws IOException {
        return read(cArr, 0, cArr.length);
    }

    @Override // java.io.Reader
    public int read(char[] cArr, int i, int i2) throws IOException {
        C7743lL0.r(cArr, i, i2);
        if (i2 == 0) {
            return 0;
        }
        if (!this.b1) {
            long j = this.Y0;
            long j2 = this.X;
            if (j == j2) {
                return a();
            }
            long j3 = j + i2;
            this.Y0 = j3;
            if (j3 > j2) {
                i2 -= (int) (j3 - j2);
                this.Y0 = j2;
            }
            i(cArr, i, i2);
            return i2;
        }
        throw new IOException("Read after end of file");
    }

    public void i(char[] cArr, int i, int i2) {
    }
}
