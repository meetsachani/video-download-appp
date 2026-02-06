package o;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

/* loaded from: classes.dex */
public class GP1 extends FilterInputStream {
    public volatile byte[] X;
    public int Y;
    public int Y0;
    public int Z;
    public int Z0;
    public final InterfaceC2727De a1;

    /* loaded from: classes.dex */
    public static class a extends IOException {
        private static final long serialVersionUID = -4338378848813561757L;

        public a(String str) {
            super(str);
        }
    }

    public GP1(InputStream inputStream, InterfaceC2727De interfaceC2727De) {
        this(inputStream, interfaceC2727De, 65536);
    }

    public static IOException f() throws IOException {
        throw new IOException("BufferedInputStream is closed");
    }

    public final int a(InputStream inputStream, byte[] bArr) throws IOException {
        int i = this.Y0;
        if (i != -1) {
            int i2 = this.Z0 - i;
            int i3 = this.Z;
            if (i2 < i3) {
                if (i == 0 && i3 > bArr.length && this.Y == bArr.length) {
                    int length = bArr.length * 2;
                    if (length <= i3) {
                        i3 = length;
                    }
                    byte[] bArr2 = (byte[]) this.a1.c(i3, byte[].class);
                    System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
                    this.X = bArr2;
                    this.a1.put(bArr);
                    bArr = bArr2;
                } else if (i > 0) {
                    System.arraycopy(bArr, i, bArr, 0, bArr.length - i);
                }
                int i4 = this.Z0 - this.Y0;
                this.Z0 = i4;
                this.Y0 = 0;
                this.Y = 0;
                int read = inputStream.read(bArr, i4, bArr.length - i4);
                int i5 = this.Z0;
                if (read > 0) {
                    i5 += read;
                }
                this.Y = i5;
                return read;
            }
        }
        int read2 = inputStream.read(bArr);
        if (read2 > 0) {
            this.Y0 = -1;
            this.Z0 = 0;
            this.Y = read2;
        }
        return read2;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public synchronized int available() throws IOException {
        InputStream inputStream;
        inputStream = ((FilterInputStream) this).in;
        if (this.X != null && inputStream != null) {
        } else {
            throw f();
        }
        return (this.Y - this.Z0) + inputStream.available();
    }

    @Override // java.io.FilterInputStream, java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        if (this.X != null) {
            this.a1.put(this.X);
            this.X = null;
        }
        InputStream inputStream = ((FilterInputStream) this).in;
        ((FilterInputStream) this).in = null;
        if (inputStream != null) {
            inputStream.close();
        }
    }

    public synchronized void d() {
        this.Z = this.X.length;
    }

    public synchronized void g() {
        if (this.X != null) {
            this.a1.put(this.X);
            this.X = null;
        }
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public synchronized void mark(int i) {
        this.Z = Math.max(this.Z, i);
        this.Y0 = this.Z0;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public boolean markSupported() {
        return true;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public synchronized int read() throws IOException {
        byte[] bArr = this.X;
        InputStream inputStream = ((FilterInputStream) this).in;
        if (bArr != null && inputStream != null) {
            if (this.Z0 < this.Y || a(inputStream, bArr) != -1) {
                if (bArr != this.X && (bArr = this.X) == null) {
                    throw f();
                }
                int i = this.Y;
                int i2 = this.Z0;
                if (i - i2 > 0) {
                    this.Z0 = i2 + 1;
                    return bArr[i2] & 255;
                }
                return -1;
            }
            return -1;
        }
        throw f();
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public synchronized void reset() throws IOException {
        if (this.X != null) {
            int i = this.Y0;
            if (-1 != i) {
                this.Z0 = i;
            } else {
                throw new a("Mark has been invalidated, pos: " + this.Z0 + " markLimit: " + this.Z);
            }
        } else {
            throw new IOException("Stream is closed");
        }
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public synchronized long skip(long j) throws IOException {
        if (j < 1) {
            return 0L;
        }
        byte[] bArr = this.X;
        if (bArr != null) {
            InputStream inputStream = ((FilterInputStream) this).in;
            if (inputStream != null) {
                int i = this.Y;
                int i2 = this.Z0;
                if (i - i2 >= j) {
                    this.Z0 = (int) (i2 + j);
                    return j;
                }
                long j2 = i - i2;
                this.Z0 = i;
                if (this.Y0 != -1 && j <= this.Z) {
                    if (a(inputStream, bArr) == -1) {
                        return j2;
                    }
                    int i3 = this.Y;
                    int i4 = this.Z0;
                    if (i3 - i4 >= j - j2) {
                        this.Z0 = (int) ((i4 + j) - j2);
                        return j;
                    }
                    long j3 = (j2 + i3) - i4;
                    this.Z0 = i3;
                    return j3;
                }
                long skip = inputStream.skip(j - j2);
                if (skip > 0) {
                    this.Y0 = -1;
                }
                return j2 + skip;
            }
            throw f();
        }
        throw f();
    }

    public GP1(InputStream inputStream, InterfaceC2727De interfaceC2727De, int i) {
        super(inputStream);
        this.Y0 = -1;
        this.a1 = interfaceC2727De;
        this.X = (byte[]) interfaceC2727De.c(i, byte[].class);
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public synchronized int read(byte[] bArr, int i, int i2) throws IOException {
        int i3;
        int i4;
        byte[] bArr2 = this.X;
        if (bArr2 == null) {
            throw f();
        }
        if (i2 == 0) {
            return 0;
        }
        InputStream inputStream = ((FilterInputStream) this).in;
        if (inputStream != null) {
            int i5 = this.Z0;
            int i6 = this.Y;
            if (i5 < i6) {
                int i7 = i6 - i5 >= i2 ? i2 : i6 - i5;
                System.arraycopy(bArr2, i5, bArr, i, i7);
                this.Z0 += i7;
                if (i7 == i2 || inputStream.available() == 0) {
                    return i7;
                }
                i += i7;
                i3 = i2 - i7;
            } else {
                i3 = i2;
            }
            while (true) {
                if (this.Y0 == -1 && i3 >= bArr2.length) {
                    i4 = inputStream.read(bArr, i, i3);
                    if (i4 == -1) {
                        return i3 != i2 ? i2 - i3 : -1;
                    }
                } else if (a(inputStream, bArr2) == -1) {
                    return i3 != i2 ? i2 - i3 : -1;
                } else {
                    if (bArr2 != this.X && (bArr2 = this.X) == null) {
                        throw f();
                    }
                    int i8 = this.Y;
                    int i9 = this.Z0;
                    i4 = i8 - i9 >= i3 ? i3 : i8 - i9;
                    System.arraycopy(bArr2, i9, bArr, i, i4);
                    this.Z0 += i4;
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
            throw f();
        }
    }
}
