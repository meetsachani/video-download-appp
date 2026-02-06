package o;

import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.charset.Charset;
import java.nio.charset.CharsetDecoder;
import java.nio.charset.CoderResult;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@InterfaceC8303na2({"SMAP\nConsole.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Console.kt\nkotlin/io/LineReader\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,299:1\n1#2:300\n*E\n"})
/* loaded from: classes3.dex */
public final class ZZ0 {
    @NotNull
    public static final ZZ0 a = new ZZ0();
    public static final int b = 32;
    public static CharsetDecoder c;
    public static boolean d;
    @NotNull
    public static final byte[] e;
    @NotNull
    public static final char[] f;
    @NotNull
    public static final ByteBuffer g;
    @NotNull
    public static final CharBuffer h;
    @NotNull
    public static final StringBuilder i;

    static {
        byte[] bArr = new byte[32];
        e = bArr;
        char[] cArr = new char[32];
        f = cArr;
        ByteBuffer wrap = ByteBuffer.wrap(bArr);
        C6562gT0.o(wrap, "wrap(...)");
        g = wrap;
        CharBuffer wrap2 = CharBuffer.wrap(cArr);
        C6562gT0.o(wrap2, "wrap(...)");
        h = wrap2;
        i = new StringBuilder();
    }

    public final int a() {
        ByteBuffer byteBuffer = g;
        byteBuffer.compact();
        int position = byteBuffer.position();
        byteBuffer.position(0);
        return position;
    }

    public final int b(boolean z) {
        while (true) {
            CharsetDecoder charsetDecoder = c;
            if (charsetDecoder == null) {
                C6562gT0.S("decoder");
                charsetDecoder = null;
            }
            ByteBuffer byteBuffer = g;
            CharBuffer charBuffer = h;
            CoderResult decode = charsetDecoder.decode(byteBuffer, charBuffer, z);
            C6562gT0.o(decode, "decode(...)");
            if (decode.isError()) {
                e();
                decode.throwException();
            }
            int position = charBuffer.position();
            if (!decode.isOverflow()) {
                return position;
            }
            StringBuilder sb = i;
            char[] cArr = f;
            int i2 = position - 1;
            sb.append(cArr, 0, i2);
            charBuffer.position(0);
            charBuffer.limit(32);
            charBuffer.put(cArr[i2]);
        }
    }

    public final int c(int i2, int i3) {
        ByteBuffer byteBuffer = g;
        byteBuffer.limit(i2);
        h.position(i3);
        int b2 = b(true);
        CharsetDecoder charsetDecoder = c;
        if (charsetDecoder == null) {
            C6562gT0.S("decoder");
            charsetDecoder = null;
        }
        charsetDecoder.reset();
        byteBuffer.position(0);
        return b2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0024, code lost:
        if (o.C6562gT0.g(r0.charset(), r11) == false) goto L62;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0078, code lost:
        if (r10 <= 0) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x007a, code lost:
        r0 = o.ZZ0.f;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0080, code lost:
        if (r0[r10 - 1] != '\n') goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0082, code lost:
        r1 = r10 - 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x0084, code lost:
        if (r1 <= 0) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x008c, code lost:
        if (r0[r10 - 2] != '\r') goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x008e, code lost:
        r10 = r10 - 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x0091, code lost:
        r10 = r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x0092, code lost:
        r0 = o.ZZ0.i;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x0098, code lost:
        if (r0.length() != 0) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x00a2, code lost:
        return new java.lang.String(o.ZZ0.f, 0, r10);
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x00a3, code lost:
        r0.append(o.ZZ0.f, 0, r10);
        r10 = r0.toString();
        o.C6562gT0.o(r10, "toString(...)");
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x00b5, code lost:
        if (r0.length() <= 32) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x00b7, code lost:
        f();
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x00ba, code lost:
        r0.setLength(0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x00be, code lost:
        return r10;
     */
    @Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final synchronized String d(@NotNull InputStream inputStream, @NotNull Charset charset) {
        int c2;
        try {
            C6562gT0.p(inputStream, "inputStream");
            C6562gT0.p(charset, C4317Th1.g);
            CharsetDecoder charsetDecoder = c;
            if (charsetDecoder != null) {
                if (charsetDecoder == null) {
                    C6562gT0.S("decoder");
                    charsetDecoder = null;
                }
            }
            g(charset);
            int i2 = 0;
            int i3 = 0;
            while (true) {
                int read = inputStream.read();
                if (read == -1) {
                    if (i.length() == 0 && i2 == 0 && i3 == 0) {
                        return null;
                    }
                    c2 = c(i2, i3);
                } else {
                    int i4 = i2 + 1;
                    e[i2] = (byte) read;
                    if (read != 10 && i4 != 32 && d) {
                        i2 = i4;
                    }
                    ByteBuffer byteBuffer = g;
                    byteBuffer.limit(i4);
                    h.position(i3);
                    i3 = b(false);
                    if (i3 > 0 && f[i3 - 1] == '\n') {
                        byteBuffer.position(0);
                        c2 = i3;
                        break;
                    }
                    i2 = a();
                }
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public final void e() {
        CharsetDecoder charsetDecoder = c;
        if (charsetDecoder == null) {
            C6562gT0.S("decoder");
            charsetDecoder = null;
        }
        charsetDecoder.reset();
        g.position(0);
        i.setLength(0);
    }

    public final void f() {
        StringBuilder sb = i;
        sb.setLength(32);
        sb.trimToSize();
    }

    public final void g(Charset charset) {
        CharsetDecoder newDecoder = charset.newDecoder();
        C6562gT0.o(newDecoder, "newDecoder(...)");
        c = newDecoder;
        ByteBuffer byteBuffer = g;
        byteBuffer.clear();
        CharBuffer charBuffer = h;
        charBuffer.clear();
        byteBuffer.put((byte) 10);
        byteBuffer.flip();
        CharsetDecoder charsetDecoder = c;
        if (charsetDecoder == null) {
            C6562gT0.S("decoder");
            charsetDecoder = null;
        }
        boolean z = false;
        charsetDecoder.decode(byteBuffer, charBuffer, false);
        if (charBuffer.position() == 1 && charBuffer.get(0) == '\n') {
            z = true;
        }
        d = z;
        e();
    }
}
