package o;

import java.io.IOException;

@Deprecated
/* loaded from: classes2.dex */
public final class JE2 {
    public static final int d = 0;
    public static final int e = 1;
    public static final long[] f = {128, 64, 32, 16, 8, 4, 2, 1};
    public final byte[] a = new byte[8];
    public int b;
    public int c;

    public static long a(byte[] bArr, int i, boolean z) {
        long j = bArr[0] & 255;
        if (z) {
            j &= ~f[i - 1];
        }
        for (int i2 = 1; i2 < i; i2++) {
            j = (j << 8) | (bArr[i2] & 255);
        }
        return j;
    }

    public static int c(int i) {
        int i2 = 0;
        while (true) {
            long[] jArr = f;
            if (i2 < jArr.length) {
                if ((jArr[i2] & i) != 0) {
                    return i2 + 1;
                }
                i2++;
            } else {
                return -1;
            }
        }
    }

    public int b() {
        return this.c;
    }

    public long d(InterfaceC4421Uj0 interfaceC4421Uj0, boolean z, boolean z2, int i) throws IOException {
        if (this.b == 0) {
            if (!interfaceC4421Uj0.j(this.a, 0, 1, z)) {
                return -1L;
            }
            int c = c(this.a[0] & 255);
            this.c = c;
            if (c != -1) {
                this.b = 1;
            } else {
                throw new IllegalStateException("No valid varint length mask found");
            }
        }
        int i2 = this.c;
        if (i2 > i) {
            this.b = 0;
            return -2L;
        }
        if (i2 != 1) {
            interfaceC4421Uj0.readFully(this.a, 1, i2 - 1);
        }
        this.b = 0;
        return a(this.a, this.c, z2);
    }

    public void e() {
        this.b = 0;
        this.c = 0;
    }
}
