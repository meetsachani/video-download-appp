package o;

import java.nio.charset.Charset;
import java.nio.charset.IllegalCharsetNameException;

@Deprecated
/* loaded from: classes4.dex */
public class OA {
    public static final String a = "ISO-8859-1";
    public static final String b = "US-ASCII";
    public static final String c = "UTF-16";
    public static final String d = "UTF-16BE";
    public static final String e = "UTF-16LE";
    public static final String f = "UTF-8";

    @Deprecated
    public static boolean a(String str) {
        if (str == null) {
            return false;
        }
        try {
            return Charset.isSupported(str);
        } catch (IllegalCharsetNameException unused) {
            return false;
        }
    }
}
