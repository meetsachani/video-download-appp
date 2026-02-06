package o;

import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.nio.charset.UnsupportedCharsetException;
import java.util.Collections;
import java.util.SortedMap;
import java.util.TreeMap;
import java.util.function.Predicate;

/* loaded from: classes4.dex */
public class IB {
    public static final SortedMap<String, Charset> a;
    @Deprecated
    public static final Charset b;
    @Deprecated
    public static final Charset c;
    @Deprecated
    public static final Charset d;
    @Deprecated
    public static final Charset e;
    @Deprecated
    public static final Charset f;
    @Deprecated
    public static final Charset g;

    static {
        TreeMap treeMap = new TreeMap(String.CASE_INSENSITIVE_ORDER);
        Charset charset = StandardCharsets.ISO_8859_1;
        treeMap.put(charset.name(), charset);
        Charset charset2 = StandardCharsets.US_ASCII;
        treeMap.put(charset2.name(), charset2);
        Charset charset3 = StandardCharsets.UTF_16;
        treeMap.put(charset3.name(), charset3);
        Charset charset4 = StandardCharsets.UTF_16BE;
        treeMap.put(charset4.name(), charset4);
        Charset charset5 = StandardCharsets.UTF_16LE;
        treeMap.put(charset5.name(), charset5);
        Charset charset6 = StandardCharsets.UTF_8;
        treeMap.put(charset6.name(), charset6);
        a = Collections.unmodifiableSortedMap(treeMap);
        b = charset;
        c = charset2;
        d = charset3;
        e = charset4;
        f = charset5;
        g = charset6;
    }

    public static boolean a(Charset charset, final String str) {
        if (str != null) {
            if (charset.name().equalsIgnoreCase(str) || charset.aliases().stream().anyMatch(new Predicate() { // from class: o.GB
                @Override // java.util.function.Predicate
                public final boolean test(Object obj) {
                    return str.equalsIgnoreCase((String) obj);
                }
            })) {
                return true;
            }
            return false;
        }
        return false;
    }

    public static boolean b(Charset charset) {
        return c(g(charset).name());
    }

    public static boolean c(String str) {
        return a(StandardCharsets.UTF_8, str);
    }

    public static SortedMap<String, Charset> d() {
        return a;
    }

    public static Charset e(String str) throws UnsupportedCharsetException {
        return f(str, Charset.defaultCharset());
    }

    public static Charset f(String str, Charset charset) throws UnsupportedCharsetException {
        if (str == null) {
            return charset;
        }
        return Charset.forName(str);
    }

    public static Charset g(Charset charset) {
        if (charset == null) {
            return Charset.defaultCharset();
        }
        return charset;
    }

    public static Charset h(Charset charset, Charset charset2) {
        if (charset == null) {
            return charset2;
        }
        return charset;
    }

    public static Charset i(String str, Charset charset) {
        try {
            return e(str);
        } catch (RuntimeException unused) {
            return g(charset);
        }
    }
}
