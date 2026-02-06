package org.jsoup.internal;

import java.io.IOException;
import java.io.InputStream;
import java.io.Reader;
import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.charset.Charset;
import java.nio.charset.CharsetDecoder;
import java.nio.charset.CoderResult;
import java.nio.charset.CodingErrorAction;
import org.jsoup.helper.Validate;

/* loaded from: classes4.dex */
public class SimpleStreamReader extends Reader {
    public static final /* synthetic */ boolean Y0 = false;
    public final InputStream X;
    public final CharsetDecoder Y;
    public ByteBuffer Z;

    public SimpleStreamReader(InputStream inputStream, Charset charset) {
        this.X = inputStream;
        CharsetDecoder newDecoder = charset.newDecoder();
        CodingErrorAction codingErrorAction = CodingErrorAction.REPLACE;
        this.Y = newDecoder.onMalformedInput(codingErrorAction).onUnmappableCharacter(codingErrorAction);
        ByteBuffer wrap = ByteBuffer.wrap(SimpleBufferedInput.b1.b());
        this.Z = wrap;
        wrap.flip();
    }

    public final int a() throws IOException {
        this.Z.compact();
        try {
            int position = this.Z.position();
            int read = this.X.read(this.Z.array(), this.Z.arrayOffset() + position, this.Z.limit() - position);
            if (read < 0) {
                return read;
            }
            if (read != 0) {
                this.Z.position(position + read);
                this.Z.flip();
                return this.Z.remaining();
            }
            throw new IOException("Underlying input stream returned zero bytes");
        } finally {
            this.Z.flip();
        }
    }

    @Override // java.io.Reader, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        ByteBuffer byteBuffer = this.Z;
        if (byteBuffer == null) {
            return;
        }
        SimpleBufferedInput.b1.d(byteBuffer.array());
        this.Z = null;
        this.X.close();
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x005b, code lost:
        r2.Y.reset();
     */
    @Override // java.io.Reader
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public int read(char[] cArr, int i, int i2) throws IOException {
        Validate.q(this.Z);
        CharBuffer wrap = CharBuffer.wrap(cArr, i, i2);
        if (wrap.position() != 0) {
            wrap = wrap.slice();
        }
        boolean z = false;
        while (true) {
            CoderResult decode = this.Y.decode(this.Z, wrap, z);
            if (decode.isUnderflow()) {
                if (z || !wrap.hasRemaining() || (wrap.position() > 0 && this.X.available() <= 0)) {
                    break;
                } else if (a() < 0) {
                    if (wrap.position() == 0 && !this.Z.hasRemaining()) {
                        z = true;
                        break;
                    }
                    z = true;
                } else {
                    continue;
                }
            } else if (decode.isOverflow()) {
                break;
            } else {
                decode.throwException();
            }
        }
        if (wrap.position() == 0) {
            if (!z) {
                return 0;
            }
            return -1;
        }
        return wrap.position();
    }
}
