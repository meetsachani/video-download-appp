package o;

import java.io.IOException;
import java.io.Reader;

/* renamed from: o.lC2  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC7709lC2 extends Reader {
    public static final int Z = 8192;
    public boolean X;
    public char[] Y;

    public void a() throws IOException {
        YP0.a(!isClosed());
    }

    @Override // java.io.Reader, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.X = true;
    }

    public void d(boolean z) {
        this.X = z;
    }

    public boolean isClosed() {
        return this.X;
    }

    @Override // java.io.Reader
    public long skip(long j) throws IOException {
        int read;
        if (j >= 0) {
            int min = (int) Math.min(j, 8192L);
            char[] cArr = this.Y;
            if (cArr == null || cArr.length < min) {
                this.Y = new char[min];
            }
            long j2 = j;
            while (j2 > 0 && (read = read(this.Y, 0, (int) Math.min(j2, min))) != -1) {
                j2 -= read;
            }
            return j - j2;
        }
        throw new IllegalArgumentException("skip value < 0");
    }
}
