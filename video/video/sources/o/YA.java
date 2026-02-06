package o;

import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.charset.CharacterCodingException;
import java.nio.charset.Charset;
import java.nio.charset.CharsetEncoder;
import java.nio.charset.CoderResult;
import java.nio.charset.CodingErrorAction;
import java.util.function.Supplier;
import o.YA;

/* loaded from: classes4.dex */
public class YA extends InputStream {
    public static final int a1 = -1;
    public final ByteBuffer X;
    public int Y;
    public int Y0;
    public final CharBuffer Z;
    public final CharsetEncoder Z0;

    /* loaded from: classes4.dex */
    public static class b extends AbstractC9396s3<YA, b> {
        public CharsetEncoder l = YA.j(P());

        public static /* synthetic */ YA j0(b bVar) {
            bVar.getClass();
            return new YA(bVar);
        }

        @Override // o.XK0
        /* renamed from: m0 */
        public YA get() {
            return (YA) C8643oy2.j(new XK0() { // from class: o.aB
                @Override // o.XK0
                public final Object get() {
                    return YA.b.j0(YA.b.this);
                }
            });
        }

        public CharsetEncoder n0() {
            return this.l;
        }

        @Override // o.AbstractC9396s3
        /* renamed from: o0 */
        public b f0(Charset charset) {
            super.f0(charset);
            this.l = YA.j(P());
            return this;
        }

        public b p0(CharsetEncoder charsetEncoder) {
            CharsetEncoder c = FB.c(charsetEncoder, new Supplier() { // from class: o.ZA
                @Override // java.util.function.Supplier
                public final Object get() {
                    CharsetEncoder j;
                    j = YA.j(YA.b.this.Q());
                    return j;
                }
            });
            this.l = c;
            super.f0(c.charset());
            return this;
        }
    }

    public static b f() {
        return new b();
    }

    public static CharsetEncoder j(Charset charset) {
        CharsetEncoder newEncoder = IB.g(charset).newEncoder();
        CodingErrorAction codingErrorAction = CodingErrorAction.REPLACE;
        return newEncoder.onMalformedInput(codingErrorAction).onUnmappableCharacter(codingErrorAction);
    }

    @Override // java.io.InputStream
    public int available() throws IOException {
        return this.X.remaining();
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        ByteBuffer byteBuffer = this.X;
        byteBuffer.position(byteBuffer.limit());
    }

    public final void h() throws CharacterCodingException {
        this.X.compact();
        CoderResult encode = this.Z0.encode(this.Z, this.X, true);
        if (encode.isError()) {
            encode.throwException();
        }
        this.X.flip();
    }

    public CharsetEncoder i() {
        return this.Z0;
    }

    @Override // java.io.InputStream
    public synchronized void mark(int i) {
        this.Y0 = this.Z.position();
        this.Y = this.X.position();
        this.Z.mark();
        this.X.mark();
    }

    @Override // java.io.InputStream
    public boolean markSupported() {
        return true;
    }

    @Override // java.io.InputStream
    public int read() throws IOException {
        while (!this.X.hasRemaining()) {
            h();
            if (!this.X.hasRemaining() && !this.Z.hasRemaining()) {
                return -1;
            }
        }
        return this.X.get() & 255;
    }

    @Override // java.io.InputStream
    public synchronized void reset() throws IOException {
        try {
            if (this.Y0 != -1) {
                if (this.Z.position() != 0) {
                    this.Z0.reset();
                    this.Z.rewind();
                    this.X.rewind();
                    this.X.limit(0);
                    while (this.Z.position() < this.Y0) {
                        this.X.rewind();
                        this.X.limit(0);
                        h();
                    }
                }
                if (this.Z.position() == this.Y0) {
                    this.X.position(this.Y);
                    this.Y0 = -1;
                    this.Y = -1;
                } else {
                    throw new IllegalStateException("Unexpected CharBuffer position: actual=" + this.Z.position() + " expected=" + this.Y0);
                }
            }
            mark(0);
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // java.io.InputStream
    public long skip(long j) throws IOException {
        long j2 = 0;
        while (j > 0 && available() > 0) {
            read();
            j--;
            j2++;
        }
        return j2;
    }

    public YA(final b bVar) {
        this.Z0 = bVar.l;
        ByteBuffer allocate = ByteBuffer.allocate(HO1.i(bVar.l, bVar.L()));
        this.X = allocate;
        allocate.flip();
        this.Z = CharBuffer.wrap((CharSequence) C8643oy2.j(new XK0() { // from class: o.XA
            @Override // o.XK0
            public final Object get() {
                CharSequence O;
                O = YA.b.this.O();
                return O;
            }
        }));
        this.Y0 = -1;
        this.Y = -1;
        try {
            h();
        } catch (CharacterCodingException unused) {
            this.X.clear();
            this.X.flip();
            this.Z.rewind();
        }
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
        if (this.X.hasRemaining() || this.Z.hasRemaining()) {
            while (i2 > 0) {
                if (this.X.hasRemaining()) {
                    int min = Math.min(this.X.remaining(), i2);
                    this.X.get(bArr, i, min);
                    i += min;
                    i2 -= min;
                    i3 += min;
                } else {
                    h();
                    if (!this.X.hasRemaining() && !this.Z.hasRemaining()) {
                        break;
                    }
                }
            }
            if (i3 != 0 || this.Z.hasRemaining()) {
                return i3;
            }
            return -1;
        }
        return -1;
    }

    @Deprecated
    public YA(CharSequence charSequence, Charset charset) {
        this(charSequence, charset, 8192);
    }

    @Deprecated
    public YA(CharSequence charSequence, Charset charset, int i) {
        this(((b) f().w(charSequence)).f0(charset).Z(i));
    }

    @Deprecated
    public YA(CharSequence charSequence, String str) {
        this(charSequence, str, 8192);
    }

    @Deprecated
    public YA(CharSequence charSequence, String str, int i) {
        this(charSequence, IB.e(str), i);
    }
}
