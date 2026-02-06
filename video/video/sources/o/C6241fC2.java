package o;

import java.io.IOException;
import java.io.Reader;

/* renamed from: o.fC2  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C6241fC2 extends AbstractC7709lC2 {
    public static final char e1 = 0;
    public final Reader Y0;
    public char[] Z0;
    public int a1;
    public int b1;
    public int c1;
    public int d1;

    public C6241fC2(Reader reader) {
        this(reader, 8192);
    }

    @Override // o.AbstractC7709lC2, java.io.Reader, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        if (!isClosed()) {
            this.Y0.close();
            this.Z0 = null;
            super.close();
        }
    }

    public final void f() throws IOException {
        if (this.a1 != this.b1 || h() != -1) {
            char[] cArr = this.Z0;
            int i = this.a1;
            if (cArr[i] == '\n') {
                this.a1 = i + 1;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x004a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int h() throws IOException {
        int read;
        int i = this.c1;
        if (i != -1) {
            int i2 = this.a1 - i;
            int i3 = this.d1;
            if (i2 < i3) {
                if (i == 0) {
                    char[] cArr = this.Z0;
                    if (i3 > cArr.length) {
                        int length = cArr.length * 2;
                        if (length <= i3) {
                            i3 = length;
                        }
                        char[] cArr2 = new char[i3];
                        System.arraycopy(cArr, 0, cArr2, 0, cArr.length);
                        this.Z0 = cArr2;
                        Reader reader = this.Y0;
                        char[] cArr3 = this.Z0;
                        int i4 = this.a1;
                        read = reader.read(cArr3, i4, cArr3.length - i4);
                        if (read != -1) {
                            this.b1 += read;
                        }
                        return read;
                    }
                }
                if (i > 0) {
                    char[] cArr4 = this.Z0;
                    System.arraycopy(cArr4, i, cArr4, 0, cArr4.length - i);
                    int i5 = this.a1;
                    int i6 = this.c1;
                    this.a1 = i5 - i6;
                    this.b1 -= i6;
                    this.c1 = 0;
                }
                Reader reader2 = this.Y0;
                char[] cArr32 = this.Z0;
                int i42 = this.a1;
                read = reader2.read(cArr32, i42, cArr32.length - i42);
                if (read != -1) {
                }
                return read;
            }
        }
        Reader reader3 = this.Y0;
        char[] cArr5 = this.Z0;
        int read2 = reader3.read(cArr5, 0, cArr5.length);
        if (read2 > 0) {
            this.c1 = -1;
            this.a1 = 0;
            this.b1 = read2;
        }
        return read2;
    }

    public int i() throws IOException {
        mark(1);
        int read = read();
        reset();
        return read;
    }

    public int j(char[] cArr) throws IOException {
        int length = cArr.length;
        mark(length);
        int read = read(cArr, 0, length);
        reset();
        return read;
    }

    /* JADX WARN: Code restructure failed: missing block: B:61:0x00c8, code lost:
        if (r1 != 0) goto L61;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x00ca, code lost:
        r6 = r9.Z0;
        r8 = r9.a1;
        r0.append(r6, r8, r7 - r8);
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x00d3, code lost:
        r6 = r9.Z0;
        r8 = r9.a1;
        r0.append(r6, r8, (r7 - r8) - 1);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public String k() throws IOException {
        a();
        if (this.a1 == this.b1 && h() == -1) {
            return null;
        }
        for (int i = this.a1; i < this.b1; i++) {
            char[] cArr = this.Z0;
            char c = cArr[i];
            if (c <= '\r') {
                if (c == '\n') {
                    int i2 = this.a1;
                    String str = new String(cArr, i2, i - i2);
                    this.a1 = i + 1;
                    return str;
                } else if (c == '\r') {
                    int i3 = this.a1;
                    String str2 = new String(cArr, i3, i - i3);
                    int i4 = i + 1;
                    this.a1 = i4;
                    if (i4 < this.b1 || h() != -1) {
                        char[] cArr2 = this.Z0;
                        int i5 = this.a1;
                        if (cArr2[i5] == '\n') {
                            this.a1 = i5 + 1;
                        }
                    }
                    return str2;
                }
            }
        }
        StringBuilder sb = new StringBuilder(80);
        char[] cArr3 = this.Z0;
        int i6 = this.a1;
        sb.append(cArr3, i6, this.b1 - i6);
        char c2 = 0;
        while (true) {
            this.a1 = this.b1;
            if (c2 == '\n') {
                return sb.toString();
            }
            if (h() == -1) {
                if (sb.length() <= 0 && c2 == 0) {
                    return null;
                }
                return sb.toString();
            }
            int i7 = this.a1;
            while (true) {
                int i8 = this.b1;
                if (i7 >= i8) {
                    break;
                }
                char[] cArr4 = this.Z0;
                char c3 = cArr4[i7];
                if (c2 != 0) {
                    if (c2 == '\r' && c3 == '\n') {
                        int i9 = this.a1;
                        if (i7 > i9) {
                            sb.append(cArr4, i9, (i7 - i9) - 1);
                        }
                        this.a1 = i7 + 1;
                    } else {
                        int i10 = this.a1;
                        if (i7 > i10) {
                            sb.append(cArr4, i10, (i7 - i10) - 1);
                        }
                        this.a1 = i7;
                    }
                    return sb.toString();
                }
                if (c3 == '\n' || c3 == '\r') {
                    c2 = c3;
                }
                i7++;
            }
        }
    }

    @Override // java.io.Reader
    public void mark(int i) throws IOException {
        if (i >= 0) {
            a();
            this.d1 = i;
            this.c1 = this.a1;
            return;
        }
        throw new IllegalArgumentException();
    }

    @Override // java.io.Reader
    public boolean markSupported() {
        return true;
    }

    @Override // java.io.Reader
    public int read() throws IOException {
        a();
        if (this.a1 < this.b1 || h() != -1) {
            char[] cArr = this.Z0;
            int i = this.a1;
            this.a1 = i + 1;
            return cArr[i];
        }
        return -1;
    }

    @Override // java.io.Reader
    public boolean ready() throws IOException {
        a();
        if (this.b1 - this.a1 <= 0 && !this.Y0.ready()) {
            return false;
        }
        return true;
    }

    @Override // java.io.Reader
    public void reset() throws IOException {
        a();
        int i = this.c1;
        if (i != -1) {
            this.a1 = i;
            return;
        }
        throw new IOException("mark == -1");
    }

    @Override // o.AbstractC7709lC2, java.io.Reader
    public long skip(long j) throws IOException {
        if (j >= 0) {
            a();
            if (j < 1) {
                return 0L;
            }
            int i = this.b1;
            int i2 = this.a1;
            if (i - i2 >= j) {
                this.a1 = i2 + Math.toIntExact(j);
                return j;
            }
            long j2 = i - i2;
            this.a1 = i;
            while (j2 < j) {
                if (h() == -1) {
                    return j2;
                }
                int i3 = this.b1;
                int i4 = this.a1;
                long j3 = j - j2;
                if (i3 - i4 >= j3) {
                    this.a1 = i4 + Math.toIntExact(j3);
                    return j;
                }
                j2 += i3 - i4;
                this.a1 = i3;
            }
            return j;
        }
        throw new IllegalArgumentException();
    }

    public C6241fC2(Reader reader, int i) {
        this.c1 = -1;
        this.d1 = -1;
        if (i > 0) {
            this.Y0 = reader;
            this.Z0 = new char[i];
            return;
        }
        throw new IllegalArgumentException("size <= 0");
    }

    @Override // java.io.Reader
    public int read(char[] cArr, int i, int i2) throws IOException {
        a();
        C7743lL0.r(cArr, i, i2);
        if (i2 == 0) {
            return 0;
        }
        int i3 = i2;
        while (true) {
            if (i3 <= 0) {
                break;
            }
            int i4 = this.b1;
            int i5 = this.a1;
            int i6 = i4 - i5;
            if (i6 > 0) {
                if (i6 >= i3) {
                    i6 = i3;
                }
                System.arraycopy(this.Z0, i5, cArr, i, i6);
                this.a1 += i6;
                i += i6;
                i3 -= i6;
            }
            if (i3 == 0 || (i3 < i2 && !this.Y0.ready())) {
                break;
            }
            int i7 = this.c1;
            if ((i7 == -1 || this.a1 - i7 >= this.d1) && i3 >= this.Z0.length) {
                int read = this.Y0.read(cArr, i, i3);
                if (read > 0) {
                    i3 -= read;
                    this.c1 = -1;
                }
            } else if (h() == -1) {
                break;
            }
        }
        int i8 = i2 - i3;
        if (i8 > 0 || i8 == i2) {
            return i8;
        }
        return -1;
    }
}
