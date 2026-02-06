package o;

import com.google.firebase.sessions.settings.RemoteSettings;
import java.io.IOException;
import java.io.Writer;
import o.AbstractC4253Sp2;
import o.C4361Ts1;

@Deprecated
/* renamed from: o.qe2  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C9049qe2 {
    public static final AbstractC6234fB a = new C7923m51(new String[]{AbstractC4253Sp2.b.x1, "\\\""}, new String[]{C11298zs.h, "\\\\"}).e(new C7923m51(C10996yd0.i())).e(GU0.o(32, 127));
    public static final AbstractC6234fB b = new C6963i8(new C7923m51(new String[]{"'", "\\'"}, new String[]{AbstractC4253Sp2.b.x1, "\\\""}, new String[]{C11298zs.h, "\\\\"}, new String[]{RemoteSettings.i, "\\/"}), new C7923m51(C10996yd0.i()), GU0.o(32, 127));
    public static final AbstractC6234fB c = new C6963i8(new C7923m51(new String[]{AbstractC4253Sp2.b.x1, "\\\""}, new String[]{C11298zs.h, "\\\\"}, new String[]{RemoteSettings.i, "\\/"}), new C7923m51(C10996yd0.i()), GU0.o(32, 127));
    @Deprecated
    public static final AbstractC6234fB d = new C6963i8(new C7923m51(C10996yd0.c()), new C7923m51(C10996yd0.a()));
    public static final AbstractC6234fB e = new C6963i8(new C7923m51(C10996yd0.c()), new C7923m51(C10996yd0.a()), new C7923m51(new String[]{"\u0000", ""}, new String[]{"\u0001", ""}, new String[]{"\u0002", ""}, new String[]{"\u0003", ""}, new String[]{"\u0004", ""}, new String[]{"\u0005", ""}, new String[]{"\u0006", ""}, new String[]{"\u0007", ""}, new String[]{"\b", ""}, new String[]{"\u000b", ""}, new String[]{"\f", ""}, new String[]{"\u000e", ""}, new String[]{"\u000f", ""}, new String[]{"\u0010", ""}, new String[]{"\u0011", ""}, new String[]{"\u0012", ""}, new String[]{"\u0013", ""}, new String[]{"\u0014", ""}, new String[]{"\u0015", ""}, new String[]{"\u0016", ""}, new String[]{"\u0017", ""}, new String[]{"\u0018", ""}, new String[]{"\u0019", ""}, new String[]{"\u001a", ""}, new String[]{"\u001b", ""}, new String[]{"\u001c", ""}, new String[]{"\u001d", ""}, new String[]{"\u001e", ""}, new String[]{"\u001f", ""}, new String[]{"\ufffe", ""}, new String[]{"\uffff", ""}), C4264Ss1.i(127, C3503Kz.V), C4264Ss1.i(134, 159), new C5020aA2());
    public static final AbstractC6234fB f = new C6963i8(new C7923m51(C10996yd0.c()), new C7923m51(C10996yd0.a()), new C7923m51(new String[]{"\u0000", ""}, new String[]{"\u000b", "&#11;"}, new String[]{"\f", "&#12;"}, new String[]{"\ufffe", ""}, new String[]{"\uffff", ""}), C4264Ss1.i(1, 8), C4264Ss1.i(14, 31), C4264Ss1.i(127, C3503Kz.V), C4264Ss1.i(134, 159), new C5020aA2());
    public static final AbstractC6234fB g = new C6963i8(new C7923m51(C10996yd0.c()), new C7923m51(C10996yd0.g()));
    public static final AbstractC6234fB h = new C6963i8(new C7923m51(C10996yd0.c()), new C7923m51(C10996yd0.g()), new C7923m51(C10996yd0.e()));
    public static final AbstractC6234fB i = new a();
    public static final AbstractC6234fB j;
    public static final AbstractC6234fB k;
    public static final AbstractC6234fB l;
    public static final AbstractC6234fB m;
    public static final AbstractC6234fB n;

    /* renamed from: o  reason: collision with root package name */
    public static final AbstractC6234fB f839o;
    public static final AbstractC6234fB p;

    /* renamed from: o.qe2$a */
    /* loaded from: classes4.dex */
    public static class a extends AbstractC6234fB {
        public static final char b = ',';
        public static final char c = '\"';
        public static final String d = String.valueOf('\"');
        public static final char[] e = {',', '\"', C8206nB.d, '\n'};

        @Override // o.AbstractC6234fB
        public int b(CharSequence charSequence, int i, Writer writer) throws IOException {
            if (i == 0) {
                if (C4500Ve2.C(charSequence.toString(), e)) {
                    writer.write(charSequence.toString());
                } else {
                    writer.write(34);
                    String charSequence2 = charSequence.toString();
                    String str = d;
                    writer.write(C4500Ve2.f2(charSequence2, str, str + str));
                    writer.write(34);
                }
                return Character.codePointCount(charSequence, 0, charSequence.length());
            }
            throw new IllegalStateException("CsvEscaper should never reach the [1] index");
        }
    }

    /* renamed from: o.qe2$b */
    /* loaded from: classes4.dex */
    public static class b extends AbstractC6234fB {
        public static final char b = ',';
        public static final char c = '\"';
        public static final String d = String.valueOf('\"');
        public static final char[] e = {',', '\"', C8206nB.d, '\n'};

        @Override // o.AbstractC6234fB
        public int b(CharSequence charSequence, int i, Writer writer) throws IOException {
            if (i == 0) {
                if (charSequence.charAt(0) == '\"' && charSequence.charAt(charSequence.length() - 1) == '\"') {
                    String charSequence2 = charSequence.subSequence(1, charSequence.length() - 1).toString();
                    if (C4500Ve2.w(charSequence2, e)) {
                        StringBuilder sb = new StringBuilder();
                        String str = d;
                        sb.append(str);
                        sb.append(str);
                        writer.write(C4500Ve2.f2(charSequence2, sb.toString(), str));
                    } else {
                        writer.write(charSequence.toString());
                    }
                    return Character.codePointCount(charSequence, 0, charSequence.length());
                }
                writer.write(charSequence.toString());
                return Character.codePointCount(charSequence, 0, charSequence.length());
            }
            throw new IllegalStateException("CsvUnescaper should never reach the [1] index");
        }
    }

    static {
        C6963i8 c6963i8 = new C6963i8(new C3877Ot1(), new Yz2(), new C7923m51(C10996yd0.j()), new C7923m51(new String[]{"\\\\", C11298zs.h}, new String[]{"\\\"", AbstractC4253Sp2.b.x1}, new String[]{"\\'", "'"}, new String[]{C11298zs.h, ""}));
        j = c6963i8;
        k = c6963i8;
        l = c6963i8;
        m = new C6963i8(new C7923m51(C10996yd0.d()), new C7923m51(C10996yd0.h()), new C4361Ts1(new C4361Ts1.a[0]));
        n = new C6963i8(new C7923m51(C10996yd0.d()), new C7923m51(C10996yd0.h()), new C7923m51(C10996yd0.f()), new C4361Ts1(new C4361Ts1.a[0]));
        f839o = new C6963i8(new C7923m51(C10996yd0.d()), new C7923m51(C10996yd0.b()), new C4361Ts1(new C4361Ts1.a[0]));
        p = new b();
    }

    public static final String a(String str) {
        return i.c(str);
    }

    public static final String b(String str) {
        return b.c(str);
    }

    public static final String c(String str) {
        return g.c(str);
    }

    public static final String d(String str) {
        return h.c(str);
    }

    public static final String e(String str) {
        return a.c(str);
    }

    public static final String f(String str) {
        return c.c(str);
    }

    @Deprecated
    public static final String g(String str) {
        return d.c(str);
    }

    public static String h(String str) {
        return e.c(str);
    }

    public static String i(String str) {
        return f.c(str);
    }

    public static final String j(String str) {
        return p.c(str);
    }

    public static final String k(String str) {
        return k.c(str);
    }

    public static final String l(String str) {
        return m.c(str);
    }

    public static final String m(String str) {
        return n.c(str);
    }

    public static final String n(String str) {
        return j.c(str);
    }

    public static final String o(String str) {
        return l.c(str);
    }

    public static final String p(String str) {
        return f839o.c(str);
    }
}
