package o;

import java.nio.charset.Charset;

/* loaded from: classes4.dex */
public class JB {
    public static Charset a(String str) {
        if (str == null) {
            return Charset.defaultCharset();
        }
        return Charset.forName(str);
    }

    public static Charset b(Charset charset) {
        if (charset == null) {
            return Charset.defaultCharset();
        }
        return charset;
    }

    public static String c(String str) {
        if (str == null) {
            return Charset.defaultCharset().name();
        }
        return str;
    }
}
