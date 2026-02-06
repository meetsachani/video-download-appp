package o;

import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.charset.CharacterCodingException;
import java.nio.charset.Charset;
import java.nio.charset.CharsetDecoder;
import java.nio.charset.CharsetEncoder;
import java.nio.charset.CoderResult;
import java.nio.charset.StandardCharsets;
import java.util.function.Supplier;

/* loaded from: classes.dex */
public class HD2 extends CD2 {
    public static final ThreadLocal<a> b = new GD2(new Supplier() { // from class: o.FD2
        @Override // java.util.function.Supplier
        public final Object get() {
            return HD2.f();
        }
    });

    /* loaded from: classes.dex */
    public static class a {
        public final CharsetEncoder a;
        public final CharsetDecoder b;
        public CharSequence c = null;
        public ByteBuffer d = null;

        public a() {
            Charset charset = StandardCharsets.UTF_8;
            this.a = charset.newEncoder();
            this.b = charset.newDecoder();
        }
    }

    public static /* synthetic */ a f() {
        return new a();
    }

    @Override // o.CD2
    public String a(ByteBuffer byteBuffer, int i, int i2) {
        CharsetDecoder charsetDecoder = b.get().b;
        charsetDecoder.reset();
        ByteBuffer duplicate = byteBuffer.duplicate();
        duplicate.position(i);
        duplicate.limit(i + i2);
        try {
            return charsetDecoder.decode(duplicate).toString();
        } catch (CharacterCodingException e) {
            throw new IllegalArgumentException("Bad encoding", e);
        }
    }

    @Override // o.CD2
    public void b(CharSequence charSequence, ByteBuffer byteBuffer) {
        a aVar = b.get();
        if (aVar.c != charSequence) {
            c(charSequence);
        }
        byteBuffer.put(aVar.d);
    }

    @Override // o.CD2
    public int c(CharSequence charSequence) {
        CharBuffer wrap;
        a aVar = b.get();
        int length = (int) (charSequence.length() * aVar.a.maxBytesPerChar());
        ByteBuffer byteBuffer = aVar.d;
        if (byteBuffer == null || byteBuffer.capacity() < length) {
            aVar.d = ByteBuffer.allocate(Math.max(128, length));
        }
        aVar.d.clear();
        aVar.c = charSequence;
        if (charSequence instanceof CharBuffer) {
            wrap = (CharBuffer) charSequence;
        } else {
            wrap = CharBuffer.wrap(charSequence);
        }
        CoderResult encode = aVar.a.encode(wrap, aVar.d, true);
        if (encode.isError()) {
            try {
                encode.throwException();
            } catch (CharacterCodingException e) {
                throw new IllegalArgumentException("bad character encoding", e);
            }
        }
        aVar.d.flip();
        return aVar.d.remaining();
    }
}
