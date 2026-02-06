package org.jsoup.nodes;

import java.nio.charset.Charset;
import java.nio.charset.CharsetEncoder;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.function.Supplier;
import o.C10928yK2;
import o.GD2;
import o.OA;
import org.jsoup.helper.DataUtil;
import org.jsoup.helper.Validate;
import org.jsoup.internal.QuietAppendable;
import org.jsoup.internal.StringUtil;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Entities;
import org.jsoup.parser.CharacterReader;
import org.jsoup.parser.Parser;

/* loaded from: classes4.dex */
public class Entities {
    public static final int a = 1;
    public static final int b = 2;
    public static final int c = 4;
    public static final int d = 8;
    public static final int e = 16;
    public static final int f = -1;
    public static final String g = "";
    public static final int h = 36;
    public static final int k = 106;
    public static final char[] i = {',', C10928yK2.l};
    public static final HashMap<String, String> j = new HashMap<>();
    public static final ArrayList<String> l = new ArrayList<>(106);
    public static final ThreadLocal<char[]> m = new GD2(new Supplier() { // from class: o.sd0
        @Override // java.util.function.Supplier
        public final Object get() {
            return Entities.a();
        }
    });
    public static final ThreadLocal<CharsetEncoder> n = new ThreadLocal<>();

    /* renamed from: org.jsoup.nodes.Entities$1  reason: invalid class name */
    /* loaded from: classes4.dex */
    public static /* synthetic */ class AnonymousClass1 {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[CoreCharset.values().length];
            a = iArr;
            try {
                iArr[CoreCharset.ascii.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                a[CoreCharset.utf.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    /* loaded from: classes4.dex */
    public enum CoreCharset {
        ascii,
        utf,
        fallback;

        public static CoreCharset g(String str) {
            if (str.equals(OA.b)) {
                return ascii;
            }
            if (str.startsWith("UTF-")) {
                return utf;
            }
            return fallback;
        }
    }

    /* loaded from: classes4.dex */
    public enum EscapeMode {
        xhtml(EntitiesData.a, 4),
        base(EntitiesData.b, 106),
        extended(EntitiesData.c, 2125);
        
        public String[] X;
        public int[] Y;
        public String[] Y0;
        public int[] Z;

        static {
            Collections.addAll(Entities.l, r0.X);
            Entities.l.sort(new Comparator() { // from class: o.td0
                @Override // java.util.Comparator
                public final int compare(Object obj, Object obj2) {
                    return Entities.EscapeMode.e((String) obj, (String) obj2);
                }
            });
        }

        EscapeMode(String str, int i) {
            Entities.u(this, str, i);
        }

        public static /* synthetic */ int e(String str, String str2) {
            return str2.length() - str.length();
        }

        public int q(String str) {
            int binarySearch = Arrays.binarySearch(this.X, str);
            if (binarySearch >= 0) {
                return this.Y[binarySearch];
            }
            return -1;
        }

        public String r(int i) {
            int binarySearch = Arrays.binarySearch(this.Z, i);
            if (binarySearch >= 0) {
                String[] strArr = this.Y0;
                if (binarySearch < strArr.length - 1) {
                    int i2 = binarySearch + 1;
                    if (this.Z[i2] == i) {
                        return strArr[i2];
                    }
                }
                return strArr[binarySearch];
            }
            return "";
        }
    }

    private Entities() {
    }

    public static /* synthetic */ char[] a() {
        return new char[2];
    }

    public static void d(QuietAppendable quietAppendable, int i2, EscapeMode escapeMode) {
        if ((i2 & 2) != 0 && (i2 & 1) != 0) {
            if (escapeMode == EscapeMode.xhtml) {
                quietAppendable.b("&#x27;");
                return;
            } else {
                quietAppendable.b("&apos;");
                return;
            }
        }
        quietAppendable.a('\'');
    }

    public static void e(QuietAppendable quietAppendable, EscapeMode escapeMode, int i2) {
        String r = escapeMode.r(i2);
        if (!"".equals(r)) {
            quietAppendable.a('&').b(r).a(C10928yK2.l);
        } else {
            quietAppendable.b("&#x").b(Integer.toHexString(i2)).a(C10928yK2.l);
        }
    }

    public static void f(int i2, QuietAppendable quietAppendable, int i3, EscapeMode escapeMode, CoreCharset coreCharset, CharsetEncoder charsetEncoder) {
        if (EscapeMode.xhtml == escapeMode && !t(i2)) {
            return;
        }
        char c2 = (char) i2;
        if (i2 < 65536) {
            if (c2 != '\t' && c2 != '\n' && c2 != '\r') {
                if (c2 != '\"') {
                    if (c2 != '<') {
                        if (c2 != '>') {
                            if (c2 != 160) {
                                if (c2 != '&') {
                                    if (c2 != '\'') {
                                        if (c2 >= ' ' && h(coreCharset, c2, charsetEncoder)) {
                                            quietAppendable.a(c2);
                                            return;
                                        } else {
                                            e(quietAppendable, escapeMode, i2);
                                            return;
                                        }
                                    }
                                    d(quietAppendable, i3, escapeMode);
                                    return;
                                }
                                quietAppendable.b("&amp;");
                                return;
                            }
                            g(quietAppendable, escapeMode);
                            return;
                        }
                        quietAppendable.b("&gt;");
                        return;
                    }
                    quietAppendable.b("&lt;");
                    return;
                } else if ((i3 & 2) != 0) {
                    quietAppendable.b("&quot;");
                    return;
                } else {
                    quietAppendable.a(c2);
                    return;
                }
            }
            quietAppendable.a(c2);
        } else if (h(coreCharset, c2, charsetEncoder)) {
            char[] cArr = m.get();
            quietAppendable.c(cArr, 0, Character.toChars(i2, cArr, 0));
        } else {
            e(quietAppendable, escapeMode, i2);
        }
    }

    public static void g(QuietAppendable quietAppendable, EscapeMode escapeMode) {
        if (escapeMode != EscapeMode.xhtml) {
            quietAppendable.b("&nbsp;");
        } else {
            quietAppendable.b("&#xa0;");
        }
    }

    public static boolean h(CoreCharset coreCharset, char c2, CharsetEncoder charsetEncoder) {
        int i2 = AnonymousClass1.a[coreCharset.ordinal()];
        if (i2 != 1) {
            if (i2 != 2) {
                return charsetEncoder.canEncode(c2);
            }
            if (c2 >= 55296 && c2 < 57344) {
                return false;
            }
            return true;
        } else if (c2 >= 128) {
            return false;
        } else {
            return true;
        }
    }

    public static int i(String str, int[] iArr) {
        String str2 = j.get(str);
        if (str2 != null) {
            iArr[0] = str2.codePointAt(0);
            iArr[1] = str2.codePointAt(1);
            return 2;
        }
        int q = EscapeMode.extended.q(str);
        if (q == -1) {
            return 0;
        }
        iArr[0] = q;
        return 1;
    }

    public static void j(String str, QuietAppendable quietAppendable, EscapeMode escapeMode, Charset charset, int i2) {
        boolean z;
        QuietAppendable quietAppendable2;
        boolean z2;
        EscapeMode escapeMode2;
        boolean z3;
        int i3;
        CoreCharset g2 = CoreCharset.g(charset.name());
        CharsetEncoder k2 = k(charset);
        int length = str.length();
        boolean z4 = false;
        boolean z5 = false;
        boolean z6 = false;
        int i4 = 0;
        while (i4 < length) {
            boolean z7 = z4;
            int codePointAt = str.codePointAt(i4);
            if ((i2 & 4) != 0) {
                z = true;
                if (StringUtil.p(codePointAt)) {
                    if (((i2 & 8) != 0 && !z5) || z6) {
                        z = z5;
                        quietAppendable2 = quietAppendable;
                        z2 = z7;
                    } else if ((i2 & 16) != 0) {
                        boolean z8 = z5;
                        quietAppendable2 = quietAppendable;
                        z2 = true;
                        z = z8;
                    } else {
                        quietAppendable.a(' ');
                        boolean z9 = z5;
                        quietAppendable2 = quietAppendable;
                        z2 = z7;
                        escapeMode2 = escapeMode;
                        z3 = true;
                        z = z9;
                        i3 = i2;
                        i4 += Character.charCount(codePointAt);
                        z4 = z2;
                        quietAppendable = quietAppendable2;
                        i2 = i3;
                        z5 = z;
                        z6 = z3;
                        escapeMode = escapeMode2;
                    }
                    escapeMode2 = escapeMode;
                    z3 = z6;
                    i3 = i2;
                    i4 += Character.charCount(codePointAt);
                    z4 = z2;
                    quietAppendable = quietAppendable2;
                    i2 = i3;
                    z5 = z;
                    z6 = z3;
                    escapeMode = escapeMode2;
                } else if (z7) {
                    quietAppendable.a(' ');
                    quietAppendable2 = quietAppendable;
                    escapeMode2 = escapeMode;
                    i3 = i2;
                    z2 = false;
                    z3 = false;
                } else {
                    quietAppendable2 = quietAppendable;
                    i3 = i2;
                    z2 = z7;
                    escapeMode2 = escapeMode;
                    z3 = false;
                }
            } else {
                z = z5;
                quietAppendable2 = quietAppendable;
                z2 = z7;
                escapeMode2 = escapeMode;
                z3 = z6;
                i3 = i2;
            }
            f(codePointAt, quietAppendable2, i3, escapeMode2, g2, k2);
            i4 += Character.charCount(codePointAt);
            z4 = z2;
            quietAppendable = quietAppendable2;
            i2 = i3;
            z5 = z;
            z6 = z3;
            escapeMode = escapeMode2;
        }
    }

    public static CharsetEncoder k(Charset charset) {
        ThreadLocal<CharsetEncoder> threadLocal = n;
        CharsetEncoder charsetEncoder = threadLocal.get();
        if (charsetEncoder != null && charsetEncoder.charset().equals(charset)) {
            return charsetEncoder;
        }
        CharsetEncoder newEncoder = charset.newEncoder();
        threadLocal.set(newEncoder);
        return newEncoder;
    }

    public static String l(String str) {
        return o(str, EscapeMode.base, DataUtil.b);
    }

    public static String m(String str, Document.OutputSettings outputSettings) {
        return o(str, outputSettings.g(), outputSettings.b());
    }

    public static void n(QuietAppendable quietAppendable, String str, Document.OutputSettings outputSettings, int i2) {
        j(str, quietAppendable, outputSettings.g(), outputSettings.b(), i2);
    }

    public static String o(String str, EscapeMode escapeMode, Charset charset) {
        if (str == null) {
            return "";
        }
        StringBuilder e2 = StringUtil.e();
        j(str, QuietAppendable.d(e2), escapeMode, charset, 3);
        return StringUtil.x(e2);
    }

    public static String p(String str) {
        Iterator<String> it = l.iterator();
        while (it.hasNext()) {
            String next = it.next();
            if (str.startsWith(next)) {
                return next;
            }
        }
        return "";
    }

    public static String q(String str) {
        String str2 = j.get(str);
        if (str2 != null) {
            return str2;
        }
        int q = EscapeMode.extended.q(str);
        if (q != -1) {
            return new String(new int[]{q}, 0, 1);
        }
        return "";
    }

    public static boolean r(String str) {
        if (EscapeMode.base.q(str) != -1) {
            return true;
        }
        return false;
    }

    public static boolean s(String str) {
        if (EscapeMode.extended.q(str) != -1) {
            return true;
        }
        return false;
    }

    public static boolean t(int i2) {
        if (i2 == 9 || i2 == 10 || i2 == 13) {
            return true;
        }
        if (i2 < 32 || i2 > 55295) {
            if (i2 < 57344 || i2 > 65533) {
                return i2 >= 65536 && i2 <= 1114111;
            }
            return true;
        }
        return true;
    }

    public static void u(EscapeMode escapeMode, String str, int i2) {
        int i3;
        escapeMode.X = new String[i2];
        escapeMode.Y = new int[i2];
        escapeMode.Z = new int[i2];
        escapeMode.Y0 = new String[i2];
        CharacterReader characterReader = new CharacterReader(str);
        boolean z = false;
        int i4 = 0;
        while (!characterReader.R()) {
            try {
                String G = characterReader.G('=');
                characterReader.n();
                int parseInt = Integer.parseInt(characterReader.I(i), 36);
                char P = characterReader.P();
                characterReader.n();
                if (P == ',') {
                    i3 = Integer.parseInt(characterReader.G(C10928yK2.l), 36);
                    characterReader.n();
                } else {
                    i3 = -1;
                }
                int parseInt2 = Integer.parseInt(characterReader.G('&'), 36);
                characterReader.n();
                escapeMode.X[i4] = G;
                escapeMode.Y[i4] = parseInt;
                escapeMode.Z[parseInt2] = parseInt;
                escapeMode.Y0[parseInt2] = G;
                if (i3 != -1) {
                    j.put(G, new String(new int[]{parseInt, i3}, 0, 2));
                }
                i4++;
            } catch (Throwable th) {
                try {
                    characterReader.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        }
        if (i4 == i2) {
            z = true;
        }
        Validate.k(z, "Unexpected count of entities loaded");
        characterReader.close();
    }

    public static String v(String str) {
        return w(str, false);
    }

    public static String w(String str, boolean z) {
        return Parser.y(str, z);
    }
}
