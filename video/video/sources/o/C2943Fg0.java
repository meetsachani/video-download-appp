package o;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

/* renamed from: o.Fg0  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2943Fg0 extends FilterInputStream {
    public static final byte[] Y0;
    public static final int Z = 2;
    public static final int Z0;
    public static final int a1;
    public final byte X;
    public int Y;

    static {
        byte[] bArr = {-1, C2638Cg0.C7, 0, 28, 69, QC1.w, 105, 102, 0, 0, 77, 77, 0, 0, 0, 0, 0, 8, 0, 1, 1, C8077mf.u, 0, 2, 0, 0, 0, 1, 0};
        Y0 = bArr;
        int length = bArr.length;
        Z0 = length;
        a1 = length + 2;
    }

    public C2943Fg0(InputStream inputStream, int i) {
        super(inputStream);
        if (i >= -1 && i <= 8) {
            this.X = (byte) i;
            return;
        }
        throw new IllegalArgumentException("Cannot add invalid orientation: " + i);
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public void mark(int i) {
        throw new UnsupportedOperationException();
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public boolean markSupported() {
        return false;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public int read() throws IOException {
        int read;
        int i;
        int i2 = this.Y;
        if (i2 < 2 || i2 > (i = a1)) {
            read = super.read();
        } else if (i2 == i) {
            read = this.X;
        } else {
            read = Y0[i2 - 2] & 255;
        }
        if (read != -1) {
            this.Y++;
        }
        return read;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public void reset() throws IOException {
        throw new UnsupportedOperationException();
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public long skip(long j) throws IOException {
        long skip = super.skip(j);
        if (skip > 0) {
            this.Y = (int) (this.Y + skip);
        }
        return skip;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public int read(byte[] bArr, int i, int i2) throws IOException {
        int i3;
        int i4 = this.Y;
        int i5 = a1;
        if (i4 > i5) {
            i3 = super.read(bArr, i, i2);
        } else if (i4 == i5) {
            bArr[i] = this.X;
            i3 = 1;
        } else if (i4 < 2) {
            i3 = super.read(bArr, i, 2 - i4);
        } else {
            int min = Math.min(i5 - i4, i2);
            System.arraycopy(Y0, this.Y - 2, bArr, i, min);
            i3 = min;
        }
        if (i3 > 0) {
            this.Y += i3;
        }
        return i3;
    }
}
