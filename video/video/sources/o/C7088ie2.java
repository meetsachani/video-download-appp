package o;

import java.io.ByteArrayOutputStream;
import java.io.Closeable;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.UnsupportedEncodingException;
import java.nio.charset.Charset;

/* renamed from: o.ie2  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C7088ie2 implements Closeable {
    public static final byte a1 = 13;
    public static final byte b1 = 10;
    public final InputStream X;
    public final Charset Y;
    public int Y0;
    public byte[] Z;
    public int Z0;

    /* renamed from: o.ie2$a */
    /* loaded from: classes.dex */
    public class a extends ByteArrayOutputStream {
        public a(int i) {
            super(i);
        }

        @Override // java.io.ByteArrayOutputStream
        public String toString() {
            int i = ((ByteArrayOutputStream) this).count;
            if (i > 0 && ((ByteArrayOutputStream) this).buf[i - 1] == 13) {
                i--;
            }
            try {
                return new String(((ByteArrayOutputStream) this).buf, 0, i, C7088ie2.this.Y.name());
            } catch (UnsupportedEncodingException e) {
                throw new AssertionError(e);
            }
        }
    }

    public C7088ie2(InputStream inputStream, Charset charset) {
        this(inputStream, 8192, charset);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        synchronized (this.X) {
            try {
                if (this.Z != null) {
                    this.Z = null;
                    this.X.close();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void d() throws IOException {
        InputStream inputStream = this.X;
        byte[] bArr = this.Z;
        int read = inputStream.read(bArr, 0, bArr.length);
        if (read != -1) {
            this.Y0 = 0;
            this.Z0 = read;
            return;
        }
        throw new EOFException();
    }

    public boolean f() {
        if (this.Z0 == -1) {
            return true;
        }
        return false;
    }

    public String h() throws IOException {
        int i;
        byte[] bArr;
        int i2;
        synchronized (this.X) {
            try {
                if (this.Z != null) {
                    if (this.Y0 >= this.Z0) {
                        d();
                    }
                    for (int i3 = this.Y0; i3 != this.Z0; i3++) {
                        byte[] bArr2 = this.Z;
                        if (bArr2[i3] == 10) {
                            int i4 = this.Y0;
                            if (i3 != i4) {
                                i2 = i3 - 1;
                                if (bArr2[i2] == 13) {
                                    String str = new String(bArr2, i4, i2 - i4, this.Y.name());
                                    this.Y0 = i3 + 1;
                                    return str;
                                }
                            }
                            i2 = i3;
                            String str2 = new String(bArr2, i4, i2 - i4, this.Y.name());
                            this.Y0 = i3 + 1;
                            return str2;
                        }
                    }
                    a aVar = new a((this.Z0 - this.Y0) + 80);
                    loop1: while (true) {
                        byte[] bArr3 = this.Z;
                        int i5 = this.Y0;
                        aVar.write(bArr3, i5, this.Z0 - i5);
                        this.Z0 = -1;
                        d();
                        i = this.Y0;
                        while (i != this.Z0) {
                            bArr = this.Z;
                            if (bArr[i] == 10) {
                                break loop1;
                            }
                            i++;
                        }
                    }
                    int i6 = this.Y0;
                    if (i != i6) {
                        aVar.write(bArr, i6, i - i6);
                    }
                    this.Y0 = i + 1;
                    return aVar.toString();
                }
                throw new IOException("LineReader is closed");
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public C7088ie2(InputStream inputStream, int i, Charset charset) {
        if (inputStream == null || charset == null) {
            throw null;
        }
        if (i >= 0) {
            if (charset.equals(UD2.a)) {
                this.X = inputStream;
                this.Y = charset;
                this.Z = new byte[i];
                return;
            }
            throw new IllegalArgumentException("Unsupported encoding");
        }
        throw new IllegalArgumentException("capacity <= 0");
    }
}
