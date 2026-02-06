package org.jsoup.parser;

import org.jsoup.helper.Validate;
import org.jsoup.internal.StringUtil;
import org.jsoup.parser.CharacterReader;

/* loaded from: classes4.dex */
public class TokenQueue implements AutoCloseable {
    public static final char Y = '\\';
    public static final char Y0 = 0;
    public static final char Z = '-';
    public static final char Z0 = 65533;
    public static final char[] a1 = {'*', '|', '_', '-'};
    public static final char[] b1 = {'-', '_'};
    public final CharacterReader X;

    public TokenQueue(String str) {
        this.X = new CharacterReader(str);
    }

    public static boolean A(int i) {
        if (i != 0 && Character.isValidCodePoint(i) && !Character.isSurrogate((char) i)) {
            return true;
        }
        return false;
    }

    public static String P(String str) {
        char[] charArray;
        if (str.indexOf(92) == -1) {
            return str;
        }
        StringBuilder e = StringUtil.e();
        char c = 0;
        for (char c2 : str.toCharArray()) {
            if (c2 == '\\') {
                if (c == '\\') {
                    e.append(c2);
                    c = 0;
                }
            } else {
                e.append(c2);
            }
            c = c2;
        }
        return StringUtil.x(e);
    }

    public static void f(StringBuilder sb, char c) {
        sb.append('\\');
        sb.append(c);
    }

    public static void h(StringBuilder sb, char c) {
        sb.append('\\');
        sb.append(Integer.toHexString(c));
        sb.append(' ');
    }

    public static String t(String str) {
        if (str.isEmpty()) {
            return str;
        }
        StringBuilder e = StringUtil.e();
        TokenQueue tokenQueue = new TokenQueue(str);
        char s = tokenQueue.s();
        if (s == '-') {
            tokenQueue.d();
            if (tokenQueue.u()) {
                f(e, '-');
            } else {
                e.append('-');
                if (StringUtil.l(tokenQueue.s())) {
                    h(e, tokenQueue.j());
                }
            }
        } else if (StringUtil.l(s)) {
            h(e, tokenQueue.j());
        }
        while (!tokenQueue.u()) {
            char j = tokenQueue.j();
            if (j == 0) {
                e.append((char) 65533);
            } else if (j > 31 && j != 127) {
                if (v(j)) {
                    e.append(j);
                } else {
                    f(e, j);
                }
            } else {
                h(e, j);
            }
        }
        tokenQueue.close();
        return StringUtil.x(e);
    }

    public static boolean v(char c) {
        if (c != '-' && !StringUtil.l(c) && !x(c)) {
            return false;
        }
        return true;
    }

    public static boolean x(char c) {
        if (c != '_' && !StringUtil.j(c) && !z(c)) {
            return false;
        }
        return true;
    }

    public static boolean y(char c) {
        return c == '\n' || c == '\r' || c == '\f';
    }

    public static boolean z(char c) {
        return c >= 128;
    }

    public boolean C(char c) {
        if (this.X.c0(c)) {
            j();
            return true;
        }
        return false;
    }

    public boolean E(String str) {
        return this.X.b0(str);
    }

    public boolean F(char c) {
        return this.X.c0(c);
    }

    public boolean G(String str) {
        return this.X.l0(str);
    }

    public boolean H(char... cArr) {
        return this.X.g0(cArr);
    }

    public final boolean I(char... cArr) {
        if (!N() && !this.X.g0(cArr)) {
            return false;
        }
        return true;
    }

    public boolean M() {
        return StringUtil.p(this.X.P());
    }

    public boolean N() {
        return Character.isLetterOrDigit(this.X.P());
    }

    public String O() {
        return this.X.N();
    }

    @Override // java.lang.AutoCloseable
    public void close() {
        this.X.close();
    }

    public void d() {
        if (!u()) {
            this.X.n();
        }
    }

    public String i(char c, char c2) {
        StringBuilder e = StringUtil.e();
        this.X.Z();
        char c3 = 0;
        boolean z = false;
        boolean z2 = false;
        int i = 0;
        boolean z3 = false;
        while (!u()) {
            char j = j();
            if (c3 == '\\') {
                if (j == 'Q') {
                    z3 = true;
                } else if (j == 'E') {
                    z3 = false;
                }
                e.append(j);
            } else {
                if (j == '\'' && j != c && !z) {
                    z2 = !z2;
                } else if (j == '\"' && j != c && !z2) {
                    z = !z;
                }
                if (!z2 && !z && !z3) {
                    if (j == c) {
                        i++;
                        if (i > 1) {
                            e.append(j);
                        }
                    } else if (j == c2) {
                        i--;
                        if (i > 0) {
                            e.append(j);
                        }
                    } else {
                        e.append(j);
                    }
                } else {
                    e.append(j);
                }
            }
            if (i <= 0) {
                break;
            }
            c3 = j;
        }
        String x = StringUtil.x(e);
        if (i > 0) {
            this.X.A0();
            Validate.f("Did not find balanced marker at '" + x + "'");
        }
        return x;
    }

    public char j() {
        return this.X.s();
    }

    public void k(String str) {
        if (this.X.b0(str)) {
            return;
        }
        throw new IllegalStateException("Queue did not match expected sequence");
    }

    public final void l(StringBuilder sb) {
        if (u()) {
            sb.append((char) 65533);
            return;
        }
        char j = j();
        if (!StringUtil.m(j)) {
            sb.append(j);
            return;
        }
        this.X.D0();
        String C = this.X.C(new i(), 6);
        try {
            int parseInt = Integer.parseInt(C, 16);
            if (A(parseInt)) {
                sb.appendCodePoint(parseInt);
            } else {
                sb.append((char) 65533);
            }
            if (!u()) {
                char s = s();
                if (s == '\r') {
                    d();
                    if (!u() && s() == '\n') {
                        d();
                    }
                } else if (s == ' ' || s == '\t' || y(s)) {
                    d();
                }
            }
        } catch (NumberFormatException e) {
            throw new IllegalArgumentException("Invalid escape sequence: " + C, e);
        }
    }

    public String m() {
        if (!u()) {
            String A = this.X.A(new CharacterReader.CharPredicate() { // from class: org.jsoup.parser.j
                @Override // org.jsoup.parser.CharacterReader.CharPredicate
                public final boolean a(char c) {
                    boolean v;
                    v = TokenQueue.v(c);
                    return v;
                }
            });
            char s = s();
            if (s != '\\' && s != 0) {
                return A;
            }
            StringBuilder e = StringUtil.e();
            if (!A.isEmpty()) {
                e.append(A);
            }
            while (true) {
                if (!u()) {
                    char s2 = s();
                    if (v(s2)) {
                        e.append(j());
                    } else if (s2 == 0) {
                        d();
                        e.append((char) 65533);
                    } else if (s2 != '\\') {
                        break;
                    } else {
                        d();
                        if (!u() && y(s())) {
                            this.X.D0();
                            break;
                        }
                        l(e);
                    }
                } else {
                    break;
                }
            }
            return StringUtil.x(e);
        }
        throw new IllegalArgumentException("CSS identifier expected, but end of input found");
    }

    public String n() {
        return o(a1);
    }

    public final String o(char... cArr) {
        StringBuilder e = StringUtil.e();
        while (!u()) {
            char s = s();
            if (s == '\\') {
                d();
                if (u()) {
                    break;
                }
                e.append(j());
            } else if (!I(cArr)) {
                break;
            } else {
                e.append(s);
                d();
            }
        }
        return StringUtil.x(e);
    }

    public String p(String str) {
        return this.X.H(str);
    }

    public String q(String... strArr) {
        StringBuilder e = StringUtil.e();
        loop0: while (!u()) {
            for (String str : strArr) {
                if (this.X.l0(str)) {
                    break loop0;
                }
            }
            e.append(j());
        }
        return StringUtil.x(e);
    }

    public boolean r() {
        boolean z = false;
        while (M()) {
            d();
            z = true;
        }
        return z;
    }

    public char s() {
        return this.X.P();
    }

    public String toString() {
        return this.X.toString();
    }

    public boolean u() {
        return this.X.R();
    }
}
