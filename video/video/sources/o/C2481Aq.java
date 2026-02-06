package o;

import java.io.IOException;
import java.io.OutputStream;

/* renamed from: o.Aq  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2481Aq extends OutputStream {
    public final OutputStream X;
    public byte[] Y;
    public int Y0;
    public InterfaceC2727De Z;

    public C2481Aq(OutputStream outputStream, InterfaceC2727De interfaceC2727De) {
        this(outputStream, interfaceC2727De, 65536);
    }

    public final void a() throws IOException {
        int i = this.Y0;
        if (i > 0) {
            this.X.write(this.Y, 0, i);
            this.Y0 = 0;
        }
    }

    @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        try {
            flush();
            this.X.close();
            g();
        } catch (Throwable th) {
            this.X.close();
            throw th;
        }
    }

    public final void d() throws IOException {
        if (this.Y0 == this.Y.length) {
            a();
        }
    }

    @Override // java.io.OutputStream, java.io.Flushable
    public void flush() throws IOException {
        a();
        this.X.flush();
    }

    public final void g() {
        byte[] bArr = this.Y;
        if (bArr != null) {
            this.Z.put(bArr);
            this.Y = null;
        }
    }

    @Override // java.io.OutputStream
    public void write(int i) throws IOException {
        byte[] bArr = this.Y;
        int i2 = this.Y0;
        this.Y0 = i2 + 1;
        bArr[i2] = (byte) i;
        d();
    }

    public C2481Aq(OutputStream outputStream, InterfaceC2727De interfaceC2727De, int i) {
        this.X = outputStream;
        this.Z = interfaceC2727De;
        this.Y = (byte[]) interfaceC2727De.c(i, byte[].class);
    }

    @Override // java.io.OutputStream
    public void write(byte[] bArr) throws IOException {
        write(bArr, 0, bArr.length);
    }

    @Override // java.io.OutputStream
    public void write(byte[] bArr, int i, int i2) throws IOException {
        int i3 = 0;
        do {
            int i4 = i2 - i3;
            int i5 = i + i3;
            int i6 = this.Y0;
            if (i6 == 0 && i4 >= this.Y.length) {
                this.X.write(bArr, i5, i4);
                return;
            }
            int min = Math.min(i4, this.Y.length - i6);
            System.arraycopy(bArr, i5, this.Y, this.Y0, min);
            this.Y0 += min;
            i3 += min;
            d();
        } while (i3 < i2);
    }
}
