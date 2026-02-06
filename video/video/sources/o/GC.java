package o;

import java.io.IOException;
import java.util.Objects;

/* loaded from: classes4.dex */
public class GC extends AbstractC5224b1 {
    public long Y;
    public final byte[] Y0;
    public int Z = -1;
    public final long Z0;

    public GC(byte[] bArr, long j) {
        this.Y0 = f(bArr);
        if (bArr.length != 0) {
            this.Z0 = j;
            return;
        }
        throw new IllegalArgumentException("repeatContent is empty.");
    }

    public static byte[] f(byte[] bArr) {
        Objects.requireNonNull(bArr, "repeatContent");
        for (byte b : bArr) {
            if (b == -1) {
                throw new IllegalArgumentException("repeatContent contains the end-of-stream marker -1");
            }
        }
        return bArr;
    }

    @Override // java.io.InputStream
    public int available() throws IOException {
        if (isClosed()) {
            return 0;
        }
        long j = this.Z0;
        if (j > 2147483647L) {
            return Integer.MAX_VALUE;
        }
        return Math.max(Integer.MAX_VALUE, (int) j);
    }

    @Override // o.AbstractC5224b1, java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        super.close();
        this.Y = this.Z0;
    }

    @Override // java.io.InputStream
    public int read() {
        if (this.Z0 >= 0 || isClosed()) {
            long j = this.Y;
            if (j == this.Z0) {
                return -1;
            }
            this.Y = j + 1;
        }
        byte[] bArr = this.Y0;
        int length = (this.Z + 1) % bArr.length;
        this.Z = length;
        return bArr[length] & 255;
    }
}
