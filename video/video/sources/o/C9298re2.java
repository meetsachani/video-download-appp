package o;

import com.google.firebase.sessions.settings.RemoteSettings;
import java.io.IOException;
import java.io.Writer;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import o.AbstractC4253Sp2;
import o.C4458Us1;
import o.C5574cS;

/* renamed from: o.re2  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C9298re2 {
    public static final AbstractC5991eB a;
    public static final AbstractC5991eB b;
    public static final AbstractC5991eB c;
    public static final AbstractC5991eB d;
    public static final AbstractC5991eB e;
    public static final AbstractC5991eB f;
    public static final AbstractC5991eB g;
    public static final AbstractC5991eB h;
    public static final AbstractC5991eB i;
    public static final AbstractC5991eB j;
    public static final AbstractC5991eB k;
    public static final AbstractC5991eB l;
    public static final AbstractC5991eB m;
    public static final AbstractC5991eB n;

    /* renamed from: o  reason: collision with root package name */
    public static final AbstractC5991eB f851o;
    public static final AbstractC5991eB p;
    public static final AbstractC5991eB q;

    /* renamed from: o.re2$b */
    /* loaded from: classes4.dex */
    public static final class b {
        public final StringBuilder a;
        public final AbstractC5991eB b;

        public b a(String str) {
            this.a.append(str);
            return this;
        }

        public b b(String str) {
            this.a.append(this.b.c(str));
            return this;
        }

        public String toString() {
            return this.a.toString();
        }

        public b(AbstractC5991eB abstractC5991eB) {
            this.a = new StringBuilder();
            this.b = abstractC5991eB;
        }
    }

    /* renamed from: o.re2$c */
    /* loaded from: classes4.dex */
    public static class c extends AbstractC5991eB {
        public static final char b = '\\';

        @Override // o.AbstractC5991eB
        public int b(CharSequence charSequence, int i, Writer writer) throws IOException {
            if (i == 0) {
                String charSequence2 = charSequence.toString();
                int i2 = 0;
                int i3 = 0;
                while (true) {
                    int indexOf = charSequence2.indexOf(92, i2);
                    if (indexOf == -1) {
                        break;
                    }
                    if (indexOf > i3) {
                        writer.write(charSequence2.substring(i3, indexOf));
                    }
                    i3 = indexOf + 1;
                    i2 = indexOf + 2;
                }
                if (i3 < charSequence2.length()) {
                    writer.write(charSequence2.substring(i3));
                }
                return Character.codePointCount(charSequence, 0, charSequence.length());
            }
            throw new IllegalStateException("XsiUnescaper should never reach the [1] index");
        }
    }

    static {
        HashMap hashMap = new HashMap();
        hashMap.put(AbstractC4253Sp2.b.x1, "\\\"");
        hashMap.put(C11298zs.h, "\\\\");
        C7680l51 c7680l51 = new C7680l51(Collections.unmodifiableMap(hashMap));
        Map<CharSequence, CharSequence> map = C10753xd0.i;
        a = new C6720h8(c7680l51, new C7680l51(map), FU0.o(32, 127));
        HashMap hashMap2 = new HashMap();
        hashMap2.put("'", "\\'");
        hashMap2.put(AbstractC4253Sp2.b.x1, "\\\"");
        hashMap2.put(C11298zs.h, "\\\\");
        hashMap2.put(RemoteSettings.i, "\\/");
        b = new C6720h8(new C7680l51(Collections.unmodifiableMap(hashMap2)), new C7680l51(map), FU0.o(32, 127));
        HashMap hashMap3 = new HashMap();
        hashMap3.put(AbstractC4253Sp2.b.x1, "\\\"");
        hashMap3.put(C11298zs.h, "\\\\");
        hashMap3.put(RemoteSettings.i, "\\/");
        c = new C6720h8(new C7680l51(Collections.unmodifiableMap(hashMap3)), new C7680l51(map), FU0.o(32, 126));
        HashMap hashMap4 = new HashMap();
        hashMap4.put("\u0000", "");
        hashMap4.put("\u0001", "");
        hashMap4.put("\u0002", "");
        hashMap4.put("\u0003", "");
        hashMap4.put("\u0004", "");
        hashMap4.put("\u0005", "");
        hashMap4.put("\u0006", "");
        hashMap4.put("\u0007", "");
        hashMap4.put("\b", "");
        hashMap4.put("\u000b", "");
        hashMap4.put("\f", "");
        hashMap4.put("\u000e", "");
        hashMap4.put("\u000f", "");
        hashMap4.put("\u0010", "");
        hashMap4.put("\u0011", "");
        hashMap4.put("\u0012", "");
        hashMap4.put("\u0013", "");
        hashMap4.put("\u0014", "");
        hashMap4.put("\u0015", "");
        hashMap4.put("\u0016", "");
        hashMap4.put("\u0017", "");
        hashMap4.put("\u0018", "");
        hashMap4.put("\u0019", "");
        hashMap4.put("\u001a", "");
        hashMap4.put("\u001b", "");
        hashMap4.put("\u001c", "");
        hashMap4.put("\u001d", "");
        hashMap4.put("\u001e", "");
        hashMap4.put("\u001f", "");
        hashMap4.put("\ufffe", "");
        hashMap4.put("\uffff", "");
        Map<CharSequence, CharSequence> map2 = C10753xd0.e;
        C7680l51 c7680l512 = new C7680l51(map2);
        Map<CharSequence, CharSequence> map3 = C10753xd0.g;
        d = new C6720h8(c7680l512, new C7680l51(map3), new C7680l51(Collections.unmodifiableMap(hashMap4)), C4164Rs1.i(127, C3503Kz.V), C4164Rs1.i(134, 159), new Zz2());
        HashMap hashMap5 = new HashMap();
        hashMap5.put("\u0000", "");
        hashMap5.put("\u000b", "&#11;");
        hashMap5.put("\f", "&#12;");
        hashMap5.put("\ufffe", "");
        hashMap5.put("\uffff", "");
        e = new C6720h8(new C7680l51(map2), new C7680l51(map3), new C7680l51(Collections.unmodifiableMap(hashMap5)), C4164Rs1.i(1, 8), C4164Rs1.i(14, 31), C4164Rs1.i(127, C3503Kz.V), C4164Rs1.i(134, 159), new Zz2());
        C7680l51 c7680l513 = new C7680l51(map2);
        Map<CharSequence, CharSequence> map4 = C10753xd0.a;
        f = new C6720h8(c7680l513, new C7680l51(map4));
        g = new C6720h8(new C7680l51(map2), new C7680l51(map4), new C7680l51(C10753xd0.c));
        h = new C5574cS.a();
        HashMap hashMap6 = new HashMap();
        hashMap6.put("|", "\\|");
        hashMap6.put("&", "\\&");
        hashMap6.put(";", "\\;");
        hashMap6.put("<", "\\<");
        hashMap6.put(">", "\\>");
        hashMap6.put(C9811tl1.c, "\\(");
        hashMap6.put(C9811tl1.d, "\\)");
        hashMap6.put("$", "\\$");
        hashMap6.put("`", "\\`");
        hashMap6.put(C11298zs.h, "\\\\");
        hashMap6.put(AbstractC4253Sp2.b.x1, "\\\"");
        hashMap6.put("'", "\\'");
        hashMap6.put(C4500Ve2.b, "\\ ");
        hashMap6.put("\t", "\\\t");
        hashMap6.put(VI0.D, "");
        hashMap6.put("\n", "");
        hashMap6.put("*", "\\*");
        hashMap6.put("?", "\\?");
        hashMap6.put(C6566gU0.f, "\\[");
        hashMap6.put("#", "\\#");
        hashMap6.put("~", "\\~");
        hashMap6.put("=", "\\=");
        hashMap6.put("%", "\\%");
        i = new C7680l51(Collections.unmodifiableMap(hashMap6));
        HashMap hashMap7 = new HashMap();
        hashMap7.put("\\\\", C11298zs.h);
        hashMap7.put("\\\"", AbstractC4253Sp2.b.x1);
        hashMap7.put("\\'", "'");
        hashMap7.put(C11298zs.h, "");
        C6720h8 c6720h8 = new C6720h8(new C3780Nt1(), new Xz2(), new C7680l51(C10753xd0.j), new C7680l51(Collections.unmodifiableMap(hashMap7)));
        j = c6720h8;
        k = c6720h8;
        l = c6720h8;
        Map<CharSequence, CharSequence> map5 = C10753xd0.f;
        C7680l51 c7680l514 = new C7680l51(map5);
        Map<CharSequence, CharSequence> map6 = C10753xd0.b;
        m = new C6720h8(c7680l514, new C7680l51(map6), new C4458Us1(new C4458Us1.a[0]));
        n = new C6720h8(new C7680l51(map5), new C7680l51(map6), new C7680l51(C10753xd0.d), new C4458Us1(new C4458Us1.a[0]));
        f851o = new C6720h8(new C7680l51(map5), new C7680l51(C10753xd0.h), new C4458Us1(new C4458Us1.a[0]));
        p = new C5574cS.b();
        q = new c();
    }

    public static b a(AbstractC5991eB abstractC5991eB) {
        return new b(abstractC5991eB);
    }

    public static final String b(String str) {
        return h.c(str);
    }

    public static final String c(String str) {
        return b.c(str);
    }

    public static final String d(String str) {
        return f.c(str);
    }

    public static final String e(String str) {
        return g.c(str);
    }

    public static final String f(String str) {
        return a.c(str);
    }

    public static final String g(String str) {
        return c.c(str);
    }

    public static final String h(String str) {
        return i.c(str);
    }

    public static String i(String str) {
        return d.c(str);
    }

    public static String j(String str) {
        return e.c(str);
    }

    public static final String k(String str) {
        return p.c(str);
    }

    public static final String l(String str) {
        return k.c(str);
    }

    public static final String m(String str) {
        return m.c(str);
    }

    public static final String n(String str) {
        return n.c(str);
    }

    public static final String o(String str) {
        return j.c(str);
    }

    public static final String p(String str) {
        return l.c(str);
    }

    public static final String q(String str) {
        return q.c(str);
    }

    public static final String r(String str) {
        return f851o.c(str);
    }
}
