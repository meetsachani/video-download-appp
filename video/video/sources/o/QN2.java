package o;

import java.io.IOException;
import java.io.OutputStream;
import java.io.Writer;
import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.charset.Charset;
import java.nio.charset.CharsetDecoder;
import java.nio.charset.CoderResult;
import java.nio.charset.CodingErrorAction;
import java.nio.charset.StandardCharsets;

/* loaded from: classes4.dex */
public class QN2 extends OutputStream {
    public static final int a1 = 8192;
    public final Writer X;
    public final CharsetDecoder Y;
    public final ByteBuffer Y0;
    public final boolean Z;
    public final CharBuffer Z0;

    /* loaded from: classes4.dex */
    public static class b extends AbstractC9396s3<QN2, b> {
        public CharsetDecoder l = P().newDecoder();
        public boolean m;

        @Override // o.XK0
        /* renamed from: l0 */
        public QN2 get() throws IOException {
            return new QN2(this);
        }

        @Override // o.AbstractC9396s3
        /* renamed from: m0 */
        public b e0(String str) {
            super.e0(str);
            this.l = P().newDecoder();
            return this;
        }

        @Override // o.AbstractC9396s3
        /* renamed from: n0 */
        public b f0(Charset charset) {
            super.f0(charset);
            this.l = P().newDecoder();
            return this;
        }

        public b o0(CharsetDecoder charsetDecoder) {
            if (charsetDecoder == null) {
                charsetDecoder = Q().newDecoder();
            }
            this.l = charsetDecoder;
            super.f0(charsetDecoder.charset());
            return this;
        }

        public b p0(boolean z) {
            this.m = z;
            return this;
        }
    }

    public static b a() {
        return new b();
    }

    public static void d(Charset charset) {
        boolean z;
        if (StandardCharsets.UTF_16.name().equals(charset.name())) {
            byte[] bytes = "vés".getBytes(charset);
            CharsetDecoder newDecoder = charset.newDecoder();
            ByteBuffer allocate = ByteBuffer.allocate(16);
            CharBuffer allocate2 = CharBuffer.allocate(3);
            int length = bytes.length;
            for (int i = 0; i < length; i++) {
                allocate.put(bytes[i]);
                allocate.flip();
                if (i == length - 1) {
                    z = true;
                } else {
                    z = false;
                }
                try {
                    newDecoder.decode(allocate, allocate2, z);
                    allocate.compact();
                } catch (IllegalArgumentException unused) {
                    throw new UnsupportedOperationException("UTF-16 requested when running on an IBM JDK with broken UTF-16 support. Please find a JDK that supports UTF-16 if you intend to use UF-16 with WriterOutputStream");
                }
            }
            allocate2.rewind();
            if ("vés".equals(allocate2.toString())) {
                return;
            }
            throw new UnsupportedOperationException("UTF-16 requested when running on an IBM JDK with broken UTF-16 support. Please find a JDK that supports UTF-16 if you intend to use UF-16 with WriterOutputStream");
        }
    }

    @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        h(true);
        f();
        this.X.close();
    }

    public final void f() throws IOException {
        if (this.Z0.position() > 0) {
            this.X.write(this.Z0.array(), 0, this.Z0.position());
            this.Z0.rewind();
        }
    }

    @Override // java.io.OutputStream, java.io.Flushable
    public void flush() throws IOException {
        f();
        this.X.flush();
    }

    public final void h(boolean z) throws IOException {
        CoderResult decode;
        this.Y0.flip();
        while (true) {
            decode = this.Y.decode(this.Y0, this.Z0, z);
            if (!decode.isOverflow()) {
                break;
            }
            f();
        }
        if (decode.isUnderflow()) {
            this.Y0.compact();
            return;
        }
        throw new IOException("Unexpected coder result");
    }

    @Override // java.io.OutputStream
    public void write(byte[] bArr) throws IOException {
        write(bArr, 0, bArr.length);
    }

    public QN2(b bVar) throws IOException {
        this(bVar.Y(), bVar.l, bVar.L(), bVar.m);
    }

    @Override // java.io.OutputStream
    public void write(byte[] bArr, int i, int i2) throws IOException {
        C7743lL0.q(bArr, i, i2);
        while (i2 > 0) {
            int min = Math.min(i2, this.Y0.remaining());
            this.Y0.put(bArr, i, min);
            h(false);
            i2 -= min;
            i += min;
        }
        if (this.Z) {
            f();
        }
    }

    @Deprecated
    public QN2(Writer writer) {
        this(writer, Charset.defaultCharset(), 8192, false);
    }

    @Deprecated
    public QN2(Writer writer, Charset charset) {
        this(writer, charset, 8192, false);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    @Deprecated
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public QN2(Writer writer, Charset charset, int i, boolean z) {
        this(writer, r3.onMalformedInput(r0).onUnmappableCharacter(r0).replaceWith("?"), i, z);
        CharsetDecoder newDecoder = IB.g(charset).newDecoder();
        CodingErrorAction codingErrorAction = CodingErrorAction.REPLACE;
    }

    @Override // java.io.OutputStream
    public void write(int i) throws IOException {
        write(new byte[]{(byte) i}, 0, 1);
    }

    @Deprecated
    public QN2(Writer writer, CharsetDecoder charsetDecoder) {
        this(writer, charsetDecoder, 8192, false);
    }

    @Deprecated
    public QN2(Writer writer, CharsetDecoder charsetDecoder, int i, boolean z) {
        this.Y0 = ByteBuffer.allocate(128);
        d(DB.a(charsetDecoder).charset());
        this.X = writer;
        this.Y = DB.a(charsetDecoder);
        this.Z = z;
        this.Z0 = CharBuffer.allocate(i);
    }

    @Deprecated
    public QN2(Writer writer, String str) {
        this(writer, str, 8192, false);
    }

    @Deprecated
    public QN2(Writer writer, String str, int i, boolean z) {
        this(writer, IB.e(str), i, z);
    }
}
