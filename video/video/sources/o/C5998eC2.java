package o;

import java.io.IOException;
import java.io.InputStream;

/* renamed from: o.eC2  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C5998eC2 extends C7466kC2 {
    public volatile byte[] Y;
    public int Y0;
    public int Z;
    public int Z0;
    public int a1;

    /* renamed from: o.eC2$b */
    /* loaded from: classes4.dex */
    public static class b extends AbstractC9396s3<C5998eC2, b> {
        @Override // o.XK0
        /* renamed from: j0 */
        public C5998eC2 get() throws IOException {
            return new C5998eC2(this);
        }
    }

    @Override // o.C7466kC2, java.io.InputStream
    public int available() throws IOException {
        InputStream inputStream = this.X;
        if (this.Y != null && inputStream != null) {
            return (this.Z - this.a1) + inputStream.available();
        }
        throw new IOException("Stream is closed");
    }

    @Override // o.C7466kC2, java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.Y = null;
        InputStream inputStream = this.X;
        this.X = null;
        if (inputStream != null) {
            inputStream.close();
        }
    }

    public final int d(InputStream inputStream, byte[] bArr) throws IOException {
        int i = this.Z0;
        if (i != -1) {
            int i2 = this.a1 - i;
            int i3 = this.Y0;
            if (i2 < i3) {
                if (i == 0 && i3 > bArr.length) {
                    int length = bArr.length * 2;
                    if (length <= i3) {
                        i3 = length;
                    }
                    byte[] bArr2 = new byte[i3];
                    System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
                    this.Y = bArr2;
                    bArr = bArr2;
                } else if (i > 0) {
                    System.arraycopy(bArr, i, bArr, 0, bArr.length - i);
                }
                int i4 = this.a1 - this.Z0;
                this.a1 = i4;
                this.Z0 = 0;
                this.Z = 0;
                int read = inputStream.read(bArr, i4, bArr.length - i4);
                int i5 = this.a1;
                if (read > 0) {
                    i5 += read;
                }
                this.Z = i5;
                return read;
            }
        }
        int read2 = inputStream.read(bArr);
        if (read2 > 0) {
            this.Z0 = -1;
            this.a1 = 0;
            this.Z = read2;
        }
        return read2;
    }

    public byte[] f() {
        return this.Y;
    }

    @Override // o.C7466kC2, java.io.InputStream
    public void mark(int i) {
        this.Y0 = i;
        this.Z0 = this.a1;
    }

    @Override // o.C7466kC2, java.io.InputStream
    public boolean markSupported() {
        return true;
    }

    @Override // o.C7466kC2, java.io.InputStream
    public int read() throws IOException {
        byte[] bArr = this.Y;
        InputStream inputStream = this.X;
        if (bArr != null && inputStream != null) {
            if (this.a1 < this.Z || d(inputStream, bArr) != -1) {
                if (bArr != this.Y && (bArr = this.Y) == null) {
                    throw new IOException("Stream is closed");
                }
                int i = this.Z;
                int i2 = this.a1;
                if (i - i2 > 0) {
                    this.a1 = i2 + 1;
                    return bArr[i2] & 255;
                }
                return -1;
            }
            return -1;
        }
        throw new IOException("Stream is closed");
    }

    @Override // o.C7466kC2, java.io.InputStream
    public void reset() throws IOException {
        if (this.Y != null) {
            int i = this.Z0;
            if (-1 != i) {
                this.a1 = i;
                return;
            }
            throw new IOException("Mark has been invalidated");
        }
        throw new IOException("Stream is closed");
    }

    @Override // o.C7466kC2, java.io.InputStream
    public long skip(long j) throws IOException {
        byte[] bArr = this.Y;
        InputStream inputStream = this.X;
        if (bArr != null) {
            if (j < 1) {
                return 0L;
            }
            if (inputStream != null) {
                int i = this.Z;
                int i2 = this.a1;
                if (i - i2 >= j) {
                    this.a1 = i2 + ((int) j);
                    return j;
                }
                int i3 = i - i2;
                this.a1 = i;
                if (this.Z0 != -1 && j <= this.Y0) {
                    if (d(inputStream, bArr) == -1) {
                        return i3;
                    }
                    int i4 = this.Z;
                    int i5 = this.a1;
                    if (i4 - i5 >= j - i3) {
                        this.a1 = i5 + (((int) j) - i3);
                        return j;
                    }
                    this.a1 = i4;
                    return i3 + (i4 - i5);
                }
                long j2 = i3;
                return j2 + inputStream.skip(j - j2);
            }
            throw new IOException("Stream is closed");
        }
        throw new IOException("Stream is closed");
    }

    public C5998eC2(b bVar) throws IOException {
        super(bVar.S());
        this.Z0 = -1;
        int L = bVar.L();
        if (L > 0) {
            this.Y = new byte[L];
            return;
        }
        throw new IllegalArgumentException("Size must be > 0");
    }

    @Override // o.C7466kC2, java.io.InputStream
    public int read(byte[] bArr, int i, int i2) throws IOException {
        int i3;
        int i4;
        C7743lL0.q(bArr, i, i2);
        if (i2 == 0) {
            return 0;
        }
        byte[] bArr2 = this.Y;
        if (bArr2 != null) {
            InputStream inputStream = this.X;
            if (inputStream != null) {
                int i5 = this.a1;
                int i6 = this.Z;
                if (i5 < i6) {
                    int i7 = i6 - i5 >= i2 ? i2 : i6 - i5;
                    System.arraycopy(bArr2, i5, bArr, i, i7);
                    this.a1 += i7;
                    if (i7 == i2 || inputStream.available() == 0) {
                        return i7;
                    }
                    i += i7;
                    i3 = i2 - i7;
                } else {
                    i3 = i2;
                }
                while (true) {
                    if (this.Z0 == -1 && i3 >= bArr2.length) {
                        i4 = inputStream.read(bArr, i, i3);
                        if (i4 == -1) {
                            if (i3 == i2) {
                                return -1;
                            }
                            return i2 - i3;
                        }
                    } else if (d(inputStream, bArr2) == -1) {
                        if (i3 == i2) {
                            return -1;
                        }
                        return i2 - i3;
                    } else if (bArr2 != this.Y && (bArr2 = this.Y) == null) {
                        throw new IOException("Stream is closed");
                    } else {
                        int i8 = this.Z;
                        int i9 = this.a1;
                        i4 = i8 - i9 >= i3 ? i3 : i8 - i9;
                        System.arraycopy(bArr2, i9, bArr, i, i4);
                        this.a1 += i4;
                    }
                    i3 -= i4;
                    if (i3 == 0) {
                        return i2;
                    }
                    if (inputStream.available() == 0) {
                        return i2 - i3;
                    }
                    i += i4;
                }
            } else {
                throw new IOException("Stream is closed");
            }
        } else {
            throw new IOException("Stream is closed");
        }
    }
}
