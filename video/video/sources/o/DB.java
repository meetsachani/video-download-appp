package o;

import java.nio.charset.Charset;
import java.nio.charset.CharsetDecoder;

/* loaded from: classes4.dex */
public final class DB {
    public static CharsetDecoder a(CharsetDecoder charsetDecoder) {
        if (charsetDecoder != null) {
            return charsetDecoder;
        }
        return Charset.defaultCharset().newDecoder();
    }
}
