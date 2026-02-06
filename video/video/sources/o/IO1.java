package o;

import java.io.IOException;
import java.io.InputStream;
import java.io.Reader;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.charset.Charset;
import java.nio.charset.CharsetEncoder;
import java.nio.charset.CoderResult;
import java.nio.charset.CodingErrorAction;
import java.util.Arrays;

@InterfaceC7797la0
@InterfaceC11149zF0
/* loaded from: classes3.dex */
public final class IO1 extends InputStream {
    public final Reader X;
    public final CharsetEncoder Y;
    public CharBuffer Y0;
    public final byte[] Z;
    public ByteBuffer Z0;
    public boolean a1;
    public boolean b1;
    public boolean c1;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public IO1(Reader reader, Charset charset, int i) {
        this(reader, r3.onMalformedInput(r0).onUnmappableCharacter(r0), i);
        CharsetEncoder newEncoder = charset.newEncoder();
        CodingErrorAction codingErrorAction = CodingErrorAction.REPLACE;
    }

    public static int a(Buffer buffer) {
        return buffer.capacity() - buffer.limit();
    }

    public static CharBuffer f(CharBuffer charBuffer) {
        CharBuffer wrap = CharBuffer.wrap(Arrays.copyOf(charBuffer.array(), charBuffer.capacity() * 2));
        C10723xU0.e(wrap, charBuffer.position());
        C10723xU0.c(wrap, charBuffer.limit());
        return wrap;
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.X.close();
    }

    public final int d(byte[] bArr, int i, int i2) {
        int min = Math.min(i2, this.Z0.remaining());
        this.Z0.get(bArr, i, min);
        return min;
    }

    public final void h() throws IOException {
        if (a(this.Y0) == 0) {
            if (this.Y0.position() > 0) {
                C10723xU0.b(this.Y0.compact());
            } else {
                this.Y0 = f(this.Y0);
            }
        }
        int limit = this.Y0.limit();
        int read = this.X.read(this.Y0.array(), limit, a(this.Y0));
        if (read == -1) {
            this.a1 = true;
        } else {
            C10723xU0.c(this.Y0, limit + read);
        }
    }

    public final void i(boolean z) {
        C10723xU0.b(this.Z0);
        if (z && this.Z0.remaining() == 0) {
            this.Z0 = ByteBuffer.allocate(this.Z0.capacity() * 2);
        } else {
            this.b1 = true;
        }
    }

    @Override // java.io.InputStream
    public int read() throws IOException {
        if (read(this.Z) == 1) {
            return WB2.p(this.Z[0]);
        }
        return -1;
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0029, code lost:
        if (r2 <= 0) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x002b, code lost:
        return r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x002c, code lost:
        return -1;
     */
    @Override // java.io.InputStream
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public int read(byte[] bArr, int i, int i2) throws IOException {
        CoderResult encode;
        C10664xF1.f0(i, i + i2, bArr.length);
        if (i2 == 0) {
            return 0;
        }
        boolean z = this.a1;
        int i3 = 0;
        while (true) {
            if (this.b1) {
                i3 += d(bArr, i + i3, i2 - i3);
                if (i3 == i2 || this.c1) {
                    break;
                }
                this.b1 = false;
                C10723xU0.a(this.Z0);
            }
            while (true) {
                if (this.c1) {
                    encode = CoderResult.UNDERFLOW;
                } else if (z) {
                    encode = this.Y.flush(this.Z0);
                } else {
                    encode = this.Y.encode(this.Y0, this.Z0, this.a1);
                }
                if (encode.isOverflow()) {
                    i(true);
                    break;
                } else if (encode.isUnderflow()) {
                    if (z) {
                        this.c1 = true;
                        i(false);
                        break;
                    } else if (this.a1) {
                        z = true;
                    } else {
                        h();
                    }
                } else if (encode.isError()) {
                    encode.throwException();
                    return 0;
                }
            }
        }
    }

    public IO1(Reader reader, CharsetEncoder charsetEncoder, int i) {
        this.Z = new byte[1];
        this.X = (Reader) C10664xF1.E(reader);
        this.Y = (CharsetEncoder) C10664xF1.E(charsetEncoder);
        C10664xF1.k(i > 0, "bufferSize must be positive: %s", i);
        charsetEncoder.reset();
        CharBuffer allocate = CharBuffer.allocate(i);
        this.Y0 = allocate;
        C10723xU0.b(allocate);
        this.Z0 = ByteBuffer.allocate(i);
    }
}
