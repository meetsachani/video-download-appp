package o;

import java.io.IOException;
import java.io.Reader;
import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.charset.Charset;
import java.nio.charset.CharsetEncoder;
import java.nio.charset.CoderResult;
import java.nio.charset.CodingErrorAction;
import java.util.function.Supplier;
import o.HO1;

/* loaded from: classes4.dex */
public class HO1 extends AbstractC5224b1 {
    public final Reader Y;
    public final CharBuffer Y0;
    public final CharsetEncoder Z;
    public final ByteBuffer Z0;
    public CoderResult a1;
    public boolean b1;

    /* loaded from: classes4.dex */
    public static class b extends AbstractC9396s3<HO1, b> {
        public CharsetEncoder l = HO1.m(P());

        @Override // o.XK0
        /* renamed from: l0 */
        public HO1 get() throws IOException {
            return new HO1(this);
        }

        public CharsetEncoder m0() {
            return this.l;
        }

        @Override // o.AbstractC9396s3
        /* renamed from: n0 */
        public b f0(Charset charset) {
            super.f0(charset);
            this.l = HO1.m(P());
            return this;
        }

        public b o0(CharsetEncoder charsetEncoder) {
            CharsetEncoder c = FB.c(charsetEncoder, new Supplier() { // from class: o.GO1
                @Override // java.util.function.Supplier
                public final Object get() {
                    CharsetEncoder m;
                    m = HO1.m(HO1.b.this.Q());
                    return m;
                }
            });
            this.l = c;
            super.f0(c.charset());
            return this;
        }
    }

    public static b h() {
        return new b();
    }

    public static int i(CharsetEncoder charsetEncoder, int i) {
        float l = l(charsetEncoder);
        if (i >= l) {
            return i;
        }
        throw new IllegalArgumentException(String.format("Buffer size %,d must be at least %s for a CharsetEncoder %s.", Integer.valueOf(i), Float.valueOf(l), charsetEncoder.charset().displayName()));
    }

    public static float l(CharsetEncoder charsetEncoder) {
        return charsetEncoder.maxBytesPerChar() * 2.0f;
    }

    public static CharsetEncoder m(Charset charset) {
        CharsetEncoder newEncoder = IB.g(charset).newEncoder();
        CodingErrorAction codingErrorAction = CodingErrorAction.REPLACE;
        return newEncoder.onMalformedInput(codingErrorAction).onUnmappableCharacter(codingErrorAction);
    }

    @Override // java.io.InputStream
    public int available() throws IOException {
        if (this.Z0.hasRemaining()) {
            return this.Z0.remaining();
        }
        return 0;
    }

    @Override // o.AbstractC5224b1, java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.Y.close();
        super.close();
    }

    public final void j() throws IOException {
        CoderResult coderResult;
        boolean z = this.b1;
        if (z) {
            return;
        }
        if (!z && ((coderResult = this.a1) == null || coderResult.isUnderflow())) {
            this.Y0.compact();
            int position = this.Y0.position();
            int read = this.Y.read(this.Y0.array(), position, this.Y0.remaining());
            if (read == -1) {
                this.b1 = true;
            } else {
                this.Y0.position(position + read);
            }
            this.Y0.flip();
        }
        this.Z0.compact();
        this.a1 = this.Z.encode(this.Y0, this.Z0, this.b1);
        if (this.b1) {
            this.a1 = this.Z.flush(this.Z0);
        }
        if (this.a1.isError()) {
            this.a1.throwException();
        }
        this.Z0.flip();
    }

    public CharsetEncoder k() {
        return this.Z;
    }

    @Override // java.io.InputStream
    public int read() throws IOException {
        a();
        while (!this.Z0.hasRemaining()) {
            j();
            if (this.b1 && !this.Z0.hasRemaining()) {
                return -1;
            }
        }
        return this.Z0.get() & 255;
    }

    public HO1(b bVar) throws IOException {
        this(bVar.X(), bVar.l, bVar.L());
    }

    @Deprecated
    public HO1(Reader reader) {
        this(reader, Charset.defaultCharset());
    }

    @Deprecated
    public HO1(Reader reader, Charset charset) {
        this(reader, charset, 8192);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    @Deprecated
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public HO1(Reader reader, Charset charset, int i) {
        this(reader, r3.onMalformedInput(r0).onUnmappableCharacter(r0), i);
        CharsetEncoder newEncoder = IB.g(charset).newEncoder();
        CodingErrorAction codingErrorAction = CodingErrorAction.REPLACE;
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr) throws IOException {
        return read(bArr, 0, bArr.length);
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr, int i, int i2) throws IOException {
        C7743lL0.q(bArr, i, i2);
        int i3 = 0;
        if (i2 == 0) {
            return 0;
        }
        while (i2 > 0) {
            if (this.Z0.hasRemaining()) {
                int min = Math.min(this.Z0.remaining(), i2);
                this.Z0.get(bArr, i, min);
                i += min;
                i2 -= min;
                i3 += min;
            } else if (this.b1) {
                break;
            } else {
                j();
            }
        }
        if (i3 == 0 && this.b1) {
            return -1;
        }
        return i3;
    }

    @Deprecated
    public HO1(Reader reader, CharsetEncoder charsetEncoder) {
        this(reader, charsetEncoder, 8192);
    }

    @Deprecated
    public HO1(Reader reader, CharsetEncoder charsetEncoder, int i) {
        this.Y = reader;
        CharsetEncoder b2 = FB.b(charsetEncoder);
        this.Z = b2;
        CharBuffer allocate = CharBuffer.allocate(i(b2, i));
        this.Y0 = allocate;
        allocate.flip();
        ByteBuffer allocate2 = ByteBuffer.allocate(128);
        this.Z0 = allocate2;
        allocate2.flip();
    }

    @Deprecated
    public HO1(Reader reader, String str) {
        this(reader, str, 8192);
    }

    @Deprecated
    public HO1(Reader reader, String str, int i) {
        this(reader, IB.e(str), i);
    }
}
