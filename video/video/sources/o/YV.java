package o;

import java.io.IOException;
import java.io.InputStream;
import org.jetbrains.annotations.NotNull;

@InterfaceC3147Hi0
/* loaded from: classes3.dex */
public final class YV extends InputStream {
    @NotNull
    public final InputStream X;
    @NotNull
    public final C4715Xk Y;
    public boolean Y0;
    public boolean Z;
    @NotNull
    public final byte[] Z0;
    @NotNull
    public final byte[] a1;
    @NotNull
    public final byte[] b1;
    public int c1;
    public int d1;

    public YV(@NotNull InputStream inputStream, @NotNull C4715Xk c4715Xk) {
        C6562gT0.p(inputStream, "input");
        C6562gT0.p(c4715Xk, "base64");
        this.X = inputStream;
        this.Y = c4715Xk;
        this.Z0 = new byte[1];
        this.a1 = new byte[1024];
        this.b1 = new byte[1024];
    }

    public final void a(byte[] bArr, int i, int i2) {
        byte[] bArr2 = this.b1;
        int i3 = this.c1;
        C4788Ye.v0(bArr2, bArr, i, i3, i3 + i2);
        this.c1 += i2;
        j();
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        if (!this.Z) {
            this.Z = true;
            this.X.close();
        }
    }

    public final int d(byte[] bArr, int i, int i2, int i3) {
        int i4 = this.d1;
        this.d1 = i4 + this.Y.o(this.a1, this.b1, i4, 0, i3);
        int min = Math.min(f(), i2 - i);
        a(bArr, i, min);
        k();
        return min;
    }

    public final int f() {
        return this.d1 - this.c1;
    }

    public final int h(int i) {
        this.a1[i] = C4715Xk.i;
        if ((i & 3) == 2) {
            int i2 = i();
            if (i2 >= 0) {
                this.a1[i + 1] = (byte) i2;
            }
            return i + 2;
        }
        return i + 1;
    }

    public final int i() {
        int read;
        if (!this.Y.F()) {
            return this.X.read();
        }
        do {
            read = this.X.read();
            if (read == -1) {
                break;
            }
        } while (!C4919Zk.g(read));
        return read;
    }

    public final void j() {
        if (this.c1 == this.d1) {
            this.c1 = 0;
            this.d1 = 0;
        }
    }

    public final void k() {
        byte[] bArr = this.b1;
        int length = bArr.length;
        int i = this.d1;
        if ((this.a1.length / 4) * 3 > length - i) {
            C4788Ye.v0(bArr, bArr, 0, this.c1, i);
            this.d1 -= this.c1;
            this.c1 = 0;
        }
    }

    @Override // java.io.InputStream
    public int read() {
        int i = this.c1;
        if (i < this.d1) {
            int i2 = this.b1[i] & 255;
            this.c1 = i + 1;
            j();
            return i2;
        }
        int read = read(this.Z0, 0, 1);
        if (read != -1) {
            if (read == 1) {
                return this.Z0[0] & 255;
            }
            throw new IllegalStateException("Unreachable");
        }
        return -1;
    }

    @Override // java.io.InputStream
    public int read(@NotNull byte[] bArr, int i, int i2) {
        int i3;
        boolean z;
        boolean z2;
        C6562gT0.p(bArr, "destination");
        if (i >= 0 && i2 >= 0 && (i3 = i + i2) <= bArr.length) {
            if (!this.Z) {
                if (this.Y0) {
                    return -1;
                }
                if (i2 == 0) {
                    return 0;
                }
                if (f() >= i2) {
                    a(bArr, i, i2);
                    return i2;
                }
                int f = (((i2 - f()) + 2) / 3) * 4;
                int i4 = i;
                while (true) {
                    z = this.Y0;
                    if (z || f <= 0) {
                        break;
                    }
                    int min = Math.min(this.a1.length, f);
                    int i5 = 0;
                    while (true) {
                        z2 = this.Y0;
                        if (z2 || i5 >= min) {
                            break;
                        }
                        int i6 = i();
                        if (i6 == -1) {
                            this.Y0 = true;
                        } else if (i6 != 61) {
                            this.a1[i5] = (byte) i6;
                            i5++;
                        } else {
                            i5 = h(i5);
                            this.Y0 = true;
                        }
                    }
                    if (!z2 && i5 != min) {
                        throw new IllegalStateException("Check failed.");
                    }
                    f -= i5;
                    i4 += d(bArr, i4, i3, i5);
                }
                if (i4 == i && z) {
                    return -1;
                }
                return i4 - i;
            }
            throw new IOException("The input stream is closed.");
        }
        throw new IndexOutOfBoundsException("offset: " + i + ", length: " + i2 + ", buffer size: " + bArr.length);
    }
}
