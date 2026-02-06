package o;

import java.io.EOFException;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.util.Arrays;

@Deprecated
/* loaded from: classes2.dex */
public final class WY implements InterfaceC4421Uj0 {
    public static final int i = 65536;
    public static final int j = 524288;
    public static final int k = 4096;
    public final CU c;
    public final long d;
    public long e;
    public int g;
    public int h;
    public byte[] f = new byte[65536];
    public final byte[] b = new byte[4096];

    static {
        C6361fi0.a("goog.exo.extractor");
    }

    public WY(CU cu, long j2, long j3) {
        this.c = cu;
        this.e = j2;
        this.d = j3;
    }

    public final int A(byte[] bArr, int i2, int i3, int i4, boolean z) throws IOException {
        if (!Thread.interrupted()) {
            int read = this.c.read(bArr, i2 + i4, i3 - i4);
            if (read == -1) {
                if (i4 == 0 && z) {
                    return -1;
                }
                throw new EOFException();
            }
            return i4 + read;
        }
        throw new InterruptedIOException();
    }

    public final int B(int i2) {
        int min = Math.min(this.h, i2);
        C(min);
        return min;
    }

    public final void C(int i2) {
        byte[] bArr;
        int i3 = this.h - i2;
        this.h = i3;
        this.g = 0;
        byte[] bArr2 = this.f;
        if (i3 < bArr2.length - 524288) {
            bArr = new byte[65536 + i3];
        } else {
            bArr = bArr2;
        }
        System.arraycopy(bArr2, i2, bArr, 0, i3);
        this.f = bArr;
    }

    @Override // o.InterfaceC4421Uj0
    public int c(int i2) throws IOException {
        int B = B(i2);
        if (B == 0) {
            byte[] bArr = this.b;
            B = A(bArr, 0, Math.min(i2, bArr.length), 0, true);
        }
        m(B);
        return B;
    }

    @Override // o.InterfaceC4421Uj0
    public boolean g(int i2, boolean z) throws IOException {
        int B = B(i2);
        while (B < i2 && B != -1) {
            B = A(this.b, -B, Math.min(i2, this.b.length + B), B, z);
        }
        m(B);
        if (B != -1) {
            return true;
        }
        return false;
    }

    @Override // o.InterfaceC4421Uj0
    public long getLength() {
        return this.d;
    }

    @Override // o.InterfaceC4421Uj0
    public long getPosition() {
        return this.e;
    }

    @Override // o.InterfaceC4421Uj0
    public boolean h(byte[] bArr, int i2, int i3, boolean z) throws IOException {
        if (!v(i3, z)) {
            return false;
        }
        System.arraycopy(this.f, this.g - i3, bArr, i2, i3);
        return true;
    }

    @Override // o.InterfaceC4421Uj0
    public void i() {
        this.g = 0;
    }

    @Override // o.InterfaceC4421Uj0
    public boolean j(byte[] bArr, int i2, int i3, boolean z) throws IOException {
        int z2 = z(bArr, i2, i3);
        while (z2 < i3 && z2 != -1) {
            z2 = A(bArr, i2, i3, z2, z);
        }
        m(z2);
        if (z2 != -1) {
            return true;
        }
        return false;
    }

    public final void m(int i2) {
        if (i2 != -1) {
            this.e += i2;
        }
    }

    @Override // o.InterfaceC4421Uj0
    public long n() {
        return this.e + this.g;
    }

    @Override // o.InterfaceC4421Uj0
    public void p(int i2) throws IOException {
        v(i2, false);
    }

    @Override // o.InterfaceC4421Uj0
    public <E extends Throwable> void q(long j2, E e) throws Throwable {
        boolean z;
        if (j2 >= 0) {
            z = true;
        } else {
            z = false;
        }
        C9542sf.a(z);
        this.e = j2;
        throw e;
    }

    @Override // o.InterfaceC4421Uj0
    public int r(byte[] bArr, int i2, int i3) throws IOException {
        WY wy;
        int min;
        y(i3);
        int i4 = this.h;
        int i5 = this.g;
        int i6 = i4 - i5;
        if (i6 == 0) {
            wy = this;
            min = wy.A(this.f, i5, i3, 0, true);
            if (min == -1) {
                return -1;
            }
            wy.h += min;
        } else {
            wy = this;
            min = Math.min(i3, i6);
        }
        System.arraycopy(wy.f, wy.g, bArr, i2, min);
        wy.g += min;
        return min;
    }

    @Override // o.InterfaceC4421Uj0, o.CU
    public int read(byte[] bArr, int i2, int i3) throws IOException {
        int z = z(bArr, i2, i3);
        if (z == 0) {
            z = A(bArr, i2, i3, 0, true);
        }
        m(z);
        return z;
    }

    @Override // o.InterfaceC4421Uj0
    public void readFully(byte[] bArr, int i2, int i3) throws IOException {
        j(bArr, i2, i3, false);
    }

    @Override // o.InterfaceC4421Uj0
    public void t(int i2) throws IOException {
        g(i2, false);
    }

    @Override // o.InterfaceC4421Uj0
    public boolean v(int i2, boolean z) throws IOException {
        y(i2);
        int i3 = this.h - this.g;
        while (i3 < i2) {
            int i4 = i2;
            boolean z2 = z;
            i3 = A(this.f, this.g, i4, i3, z2);
            if (i3 == -1) {
                return false;
            }
            this.h = this.g + i3;
            i2 = i4;
            z = z2;
        }
        this.g += i2;
        return true;
    }

    @Override // o.InterfaceC4421Uj0
    public void x(byte[] bArr, int i2, int i3) throws IOException {
        h(bArr, i2, i3, false);
    }

    public final void y(int i2) {
        int i3 = this.g + i2;
        byte[] bArr = this.f;
        if (i3 > bArr.length) {
            this.f = Arrays.copyOf(this.f, TD2.w(bArr.length * 2, 65536 + i3, i3 + 524288));
        }
    }

    public final int z(byte[] bArr, int i2, int i3) {
        int i4 = this.h;
        if (i4 == 0) {
            return 0;
        }
        int min = Math.min(i4, i3);
        System.arraycopy(this.f, 0, bArr, i2, min);
        C(min);
        return min;
    }
}
