package org.jsoup.internal;

import androidx.constraintlayout.widget.e;
import com.google.firebase.sessions.settings.RemoteSettings;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.function.BiConsumer;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.function.Supplier;
import java.util.regex.Pattern;
import java.util.stream.Collector;
import o.C4500Ve2;
import o.TD0;
import org.jsoup.helper.Validate;
import org.jsoup.internal.StringUtil;

/* loaded from: classes4.dex */
public final class StringUtil {
    public static final int e = 1024;
    public static final int f = 8192;
    public static final String[] a = {"", C4500Ve2.b, TD0.a.Y0, "   ", "    ", "     ", "      ", e.f.f25o, "        ", "         ", "          ", "           ", "            ", "             ", "              ", "               ", "                ", "                 ", "                  ", "                   ", "                    "};
    public static final Pattern b = Pattern.compile("^/(?>(?>\\.\\.?/)+)");
    public static final Pattern c = Pattern.compile("^[a-zA-Z][a-zA-Z0-9+-.]*:");
    public static final Pattern d = Pattern.compile("[\\x00-\\x1f]*");
    public static final SoftPool<StringBuilder> g = new SoftPool<>(new Supplier() { // from class: o.Re2
        @Override // java.util.function.Supplier
        public final Object get() {
            return StringUtil.c();
        }
    });

    /* loaded from: classes4.dex */
    public static class StringJoiner {
        public final String b;
        public StringBuilder a = StringUtil.e();
        public boolean c = true;

        public StringJoiner(String str) {
            this.b = str;
        }

        public StringJoiner a(Object obj) {
            Validate.q(this.a);
            if (!this.c) {
                this.a.append(this.b);
            }
            this.a.append(obj);
            this.c = false;
            return this;
        }

        public StringJoiner b(Object obj) {
            Validate.q(this.a);
            this.a.append(obj);
            return this;
        }

        public String c() {
            String x = StringUtil.x(this.a);
            this.a = null;
            return x;
        }
    }

    public static URL A(URL url, String str) throws MalformedURLException {
        String C = C(str);
        if (C.startsWith("?")) {
            C = url.getPath() + C;
        }
        URL url2 = new URL(url, C);
        String replaceFirst = b.matcher(url2.getFile()).replaceFirst(RemoteSettings.i);
        if (url2.getRef() != null) {
            replaceFirst = replaceFirst + "#" + url2.getRef();
        }
        return new URL(url2.getProtocol(), url2.getHost(), url2.getPort(), replaceFirst);
    }

    public static boolean B(String str) {
        if (str == null || str.length() == 0 || str.charAt(0) != '\n') {
            return false;
        }
        return true;
    }

    public static String C(String str) {
        return d.matcher(str).replaceAll("");
    }

    /*  JADX ERROR: NullPointerException in pass: MarkMethodsForInline
        java.lang.NullPointerException
        */
    public static /* synthetic */ org.jsoup.internal.StringUtil.StringJoiner a(org.jsoup.internal.StringUtil.StringJoiner r0, org.jsoup.internal.StringUtil.StringJoiner r1) {
        /*
            java.lang.String r1 = r1.c()
            r0.b(r1)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: org.jsoup.internal.StringUtil.a(org.jsoup.internal.StringUtil$StringJoiner, org.jsoup.internal.StringUtil$StringJoiner):org.jsoup.internal.StringUtil$StringJoiner");
    }

    public static /* synthetic */ StringJoiner b(String str) {
        return new StringJoiner(str);
    }

    public static /* synthetic */ StringBuilder c() {
        return new StringBuilder(1024);
    }

    public static void d(StringBuilder sb, String str, boolean z) {
        int length = str.length();
        int i = 0;
        boolean z2 = false;
        boolean z3 = false;
        while (i < length) {
            int codePointAt = str.codePointAt(i);
            if (h(codePointAt)) {
                if ((!z || z2) && !z3) {
                    sb.append(' ');
                    z3 = true;
                }
            } else if (!n(codePointAt)) {
                sb.appendCodePoint(codePointAt);
                z3 = false;
                z2 = true;
            }
            i += Character.charCount(codePointAt);
        }
    }

    public static StringBuilder e() {
        return g.b();
    }

    public static boolean f(String str, String... strArr) {
        for (String str2 : strArr) {
            if (str2.equals(str)) {
                return true;
            }
        }
        return false;
    }

    public static boolean g(String str, String[] strArr) {
        if (Arrays.binarySearch(strArr, str) >= 0) {
            return true;
        }
        return false;
    }

    public static boolean h(int i) {
        return i == 32 || i == 9 || i == 10 || i == 12 || i == 13 || i == 160;
    }

    public static boolean i(String str) {
        Validate.q(str);
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) > 127) {
                return false;
            }
        }
        return true;
    }

    public static boolean j(char c2) {
        if (c2 < 'a' || c2 > 'z') {
            return c2 >= 'A' && c2 <= 'Z';
        }
        return true;
    }

    public static boolean k(String str) {
        if (str != null && !str.isEmpty()) {
            int length = str.length();
            for (int i = 0; i < length; i++) {
                if (!p(str.codePointAt(i))) {
                    return false;
                }
            }
        }
        return true;
    }

    public static boolean l(char c2) {
        return c2 >= '0' && c2 <= '9';
    }

    public static boolean m(char c2) {
        if (!l(c2)) {
            if (c2 < 'a' || c2 > 'f') {
                if (c2 < 'A' || c2 > 'F') {
                    return false;
                }
                return true;
            }
            return true;
        }
        return true;
    }

    public static boolean n(int i) {
        return i == 8203 || i == 173;
    }

    public static boolean o(String str) {
        if (str == null || str.length() == 0) {
            return false;
        }
        int length = str.length();
        for (int i = 0; i < length; i++) {
            if (!l(str.charAt(i))) {
                return false;
            }
        }
        return true;
    }

    public static boolean p(int i) {
        return i == 32 || i == 9 || i == 10 || i == 12 || i == 13;
    }

    public static String q(Collection<?> collection, String str) {
        return r(collection.iterator(), str);
    }

    public static String r(Iterator<?> it, String str) {
        if (!it.hasNext()) {
            return "";
        }
        String obj = it.next().toString();
        if (!it.hasNext()) {
            return obj;
        }
        StringJoiner stringJoiner = new StringJoiner(str);
        stringJoiner.a(obj);
        while (it.hasNext()) {
            stringJoiner.a(it.next());
        }
        return stringJoiner.c();
    }

    public static String s(String[] strArr, String str) {
        return q(Arrays.asList(strArr), str);
    }

    public static Collector<CharSequence, ?, String> t(final String str) {
        return Collector.of(new Supplier() { // from class: o.Ne2
            @Override // java.util.function.Supplier
            public final Object get() {
                return StringUtil.b(str);
            }
        }, new BiConsumer() { // from class: o.Oe2
            @Override // java.util.function.BiConsumer
            public final void accept(Object obj, Object obj2) {
                ((StringUtil.StringJoiner) obj).a((CharSequence) obj2);
            }
        }, new BinaryOperator() { // from class: o.Pe2
            @Override // java.util.function.BiFunction
            public final Object apply(Object obj, Object obj2) {
                return StringUtil.a((StringUtil.StringJoiner) obj, (StringUtil.StringJoiner) obj2);
            }
        }, new Function() { // from class: o.Qe2
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return ((StringUtil.StringJoiner) obj).c();
            }
        }, new Collector.Characteristics[0]);
    }

    public static String u(String str) {
        StringBuilder e2 = e();
        d(e2, str, false);
        return x(e2);
    }

    public static String v(int i) {
        return w(i, 30);
    }

    public static String w(int i, int i2) {
        boolean z;
        boolean z2 = true;
        if (i >= 0) {
            z = true;
        } else {
            z = false;
        }
        Validate.k(z, "width must be >= 0");
        if (i2 < -1) {
            z2 = false;
        }
        Validate.j(z2);
        if (i2 != -1) {
            i = Math.min(i, i2);
        }
        String[] strArr = a;
        if (i < strArr.length) {
            return strArr[i];
        }
        char[] cArr = new char[i];
        for (int i3 = 0; i3 < i; i3++) {
            cArr[i3] = ' ';
        }
        return String.valueOf(cArr);
    }

    public static String x(StringBuilder sb) {
        Validate.q(sb);
        String sb2 = sb.toString();
        y(sb);
        return sb2;
    }

    public static void y(StringBuilder sb) {
        if (sb.length() <= 8192) {
            sb.delete(0, sb.length());
            g.d(sb);
        }
    }

    public static String z(String str, String str2) {
        String C = C(str);
        String C2 = C(str2);
        try {
            try {
                return A(new URL(C), C2).toExternalForm();
            } catch (MalformedURLException unused) {
                return new URL(C2).toExternalForm();
            }
        } catch (MalformedURLException unused2) {
            if (!c.matcher(C2).find()) {
                return "";
            }
            return C2;
        }
    }
}
