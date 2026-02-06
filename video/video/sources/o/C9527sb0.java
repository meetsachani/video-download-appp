package o;

import java.io.IOException;
import java.io.OutputStream;
import org.jetbrains.annotations.NotNull;

@InterfaceC3147Hi0
/* renamed from: o.sb0  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C9527sb0 extends OutputStream {
    @NotNull
    public final OutputStream X;
    @NotNull
    public final C4715Xk Y;
    public int Y0;
    public boolean Z;
    @NotNull
    public final byte[] Z0;
    @NotNull
    public final byte[] a1;
    public int b1;

    public C9527sb0(@NotNull OutputStream outputStream, @NotNull C4715Xk c4715Xk) {
        int i;
        C6562gT0.p(outputStream, "output");
        C6562gT0.p(c4715Xk, "base64");
        this.X = outputStream;
        this.Y = c4715Xk;
        if (c4715Xk.F()) {
            i = 76;
        } else {
            i = -1;
        }
        this.Y0 = i;
        this.Z0 = new byte[1024];
        this.a1 = new byte[3];
    }

    public final void a() {
        if (!this.Z) {
            return;
        }
        throw new IOException("The output stream is closed.");
    }

    @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        if (!this.Z) {
            this.Z = true;
            if (this.b1 != 0) {
                f();
            }
            this.X.close();
        }
    }

    public final int d(byte[] bArr, int i, int i2) {
        int min = Math.min(3 - this.b1, i2 - i);
        C4788Ye.v0(bArr, this.a1, this.b1, i, i + min);
        int i3 = this.b1 + min;
        this.b1 = i3;
        if (i3 == 3) {
            f();
        }
        return min;
    }

    public final void f() {
        if (h(this.a1, 0, this.b1) == 4) {
            this.b1 = 0;
            return;
        }
        throw new IllegalStateException("Check failed.");
    }

    @Override // java.io.OutputStream, java.io.Flushable
    public void flush() {
        a();
        this.X.flush();
    }

    public final int h(byte[] bArr, int i, int i2) {
        int u = this.Y.u(bArr, this.Z0, 0, i, i2);
        if (this.Y0 == 0) {
            this.X.write(C4715Xk.d.L());
            this.Y0 = 76;
            if (u > 76) {
                throw new IllegalStateException("Check failed.");
            }
        }
        this.X.write(this.Z0, 0, u);
        this.Y0 -= u;
        return u;
    }

    @Override // java.io.OutputStream
    public void write(int i) {
        a();
        byte[] bArr = this.a1;
        int i2 = this.b1;
        int i3 = i2 + 1;
        this.b1 = i3;
        bArr[i2] = (byte) i;
        if (i3 == 3) {
            f();
        }
    }

    @Override // java.io.OutputStream
    public void write(@NotNull byte[] bArr, int i, int i2) {
        int i3;
        C6562gT0.p(bArr, "source");
        a();
        if (i < 0 || i2 < 0 || (i3 = i + i2) > bArr.length) {
            throw new IndexOutOfBoundsException("offset: " + i + ", length: " + i2 + ", source size: " + bArr.length);
        } else if (i2 == 0) {
        } else {
            int i4 = this.b1;
            if (i4 < 3) {
                if (i4 != 0) {
                    i += d(bArr, i, i3);
                    if (this.b1 != 0) {
                        return;
                    }
                }
                while (i + 3 <= i3) {
                    int min = Math.min((this.Y.F() ? this.Y0 : this.Z0.length) / 4, (i3 - i) / 3);
                    int i5 = (min * 3) + i;
                    if (h(bArr, i, i5) != min * 4) {
                        throw new IllegalStateException("Check failed.");
                    }
                    i = i5;
                }
                C4788Ye.v0(bArr, this.a1, 0, i, i3);
                this.b1 = i3 - i;
                return;
            }
            throw new IllegalStateException("Check failed.");
        }
    }
}
