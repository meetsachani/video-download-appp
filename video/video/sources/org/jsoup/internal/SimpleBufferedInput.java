package org.jsoup.internal;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.function.Supplier;
import org.jsoup.helper.Validate;

/* loaded from: classes4.dex */
class SimpleBufferedInput extends FilterInputStream {
    public static final int a1 = 8192;
    public static final SoftPool<byte[]> b1 = new SoftPool<>(new Supplier() { // from class: org.jsoup.internal.d
        @Override // java.util.function.Supplier
        public final Object get() {
            return SimpleBufferedInput.a();
        }
    });
    public byte[] X;
    public int Y;
    public int Y0;
    public int Z;
    public boolean Z0;

    public SimpleBufferedInput(InputStream inputStream) {
        super(inputStream);
        this.Y0 = -1;
        this.Z0 = false;
        if (inputStream == null) {
            this.Z0 = true;
        }
    }

    public static /* synthetic */ byte[] a() {
        return new byte[8192];
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public int available() throws IOException {
        if (this.X != null) {
            int i = this.Z;
            int i2 = this.Y;
            if (i - i2 > 0) {
                return i - i2;
            }
        }
        if (this.Z0) {
            return 0;
        }
        return ((FilterInputStream) this).in.available();
    }

    @Override // java.io.FilterInputStream, java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        if (((FilterInputStream) this).in != null) {
            super.close();
        }
        byte[] bArr = this.X;
        if (bArr == null) {
            return;
        }
        b1.d(bArr);
        this.X = null;
    }

    public boolean d() {
        return this.Z0;
    }

    public final void f(int i) throws IOException {
        if (i == -1) {
            this.Z0 = true;
            super.close();
        }
    }

    public final void h() throws IOException {
        if (this.Z0) {
            return;
        }
        if (this.X == null) {
            this.X = b1.b();
        }
        int i = this.Y0;
        if (i < 0) {
            this.Y = 0;
        } else {
            int i2 = this.Y;
            if (i2 >= 8192) {
                if (i > 0) {
                    int i3 = i2 - i;
                    byte[] bArr = this.X;
                    System.arraycopy(bArr, i, bArr, 0, i3);
                    this.Y = i3;
                    this.Y0 = 0;
                } else {
                    this.Y0 = -1;
                    this.Y = 0;
                }
            }
        }
        this.Z = this.Y;
        InputStream inputStream = ((FilterInputStream) this).in;
        byte[] bArr2 = this.X;
        int i4 = this.Y;
        int read = inputStream.read(bArr2, i4, bArr2.length - i4);
        if (read > 0) {
            this.Z = this.Y + read;
            while (this.X.length - this.Z > 0 && ((FilterInputStream) this).in.available() >= 1) {
                InputStream inputStream2 = ((FilterInputStream) this).in;
                byte[] bArr3 = this.X;
                int i5 = this.Z;
                read = inputStream2.read(bArr3, i5, bArr3.length - i5);
                if (read <= 0) {
                    break;
                }
                this.Z += read;
            }
        }
        f(read);
    }

    public byte[] i() {
        Validate.q(this.X);
        return this.X;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public void mark(int i) {
        if (i <= 8192) {
            this.Y0 = this.Y;
            return;
        }
        throw new IllegalArgumentException("Read-ahead limit is greater than buffer size");
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public int read() throws IOException {
        if (this.Y >= this.Z) {
            h();
            if (this.Y >= this.Z) {
                return -1;
            }
        }
        byte[] i = i();
        int i2 = this.Y;
        this.Y = i2 + 1;
        return i[i2] & 255;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public void reset() throws IOException {
        int i = this.Y0;
        if (i >= 0) {
            this.Y = i;
            return;
        }
        throw new IOException("Resetting to invalid mark");
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public int read(byte[] bArr, int i, int i2) throws IOException {
        Validate.q(bArr);
        if (i < 0 || i2 < 0 || i2 > bArr.length - i) {
            throw new IndexOutOfBoundsException();
        }
        if (i2 == 0) {
            return 0;
        }
        int i3 = this.Z - this.Y;
        if (i3 <= 0) {
            if (!this.Z0 && this.Y0 < 0) {
                int read = ((FilterInputStream) this).in.read(bArr, i, i2);
                f(read);
                return read;
            }
            h();
            i3 = this.Z - this.Y;
        }
        int min = Math.min(i3, i2);
        if (min <= 0) {
            return -1;
        }
        System.arraycopy(i(), this.Y, bArr, i, min);
        this.Y += min;
        return min;
    }
}
