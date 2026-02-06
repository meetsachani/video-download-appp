package o;

import android.text.SpannableStringBuilder;
import java.util.Locale;

/* renamed from: o.Ym  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4820Ym {
    public static final InterfaceC10059um2 d;
    public static final char e = 8234;
    public static final char f = 8235;
    public static final char g = 8236;
    public static final char h = 8206;
    public static final char i = 8207;
    public static final String j;
    public static final String k;
    public static final String l = "";
    public static final int m = 2;
    public static final int n = 2;

    /* renamed from: o  reason: collision with root package name */
    public static final C4820Ym f674o;
    public static final C4820Ym p;
    public static final int q = -1;
    public static final int r = 0;
    public static final int s = 1;
    public final boolean a;
    public final int b;
    public final InterfaceC10059um2 c;

    /* renamed from: o.Ym$b */
    /* loaded from: classes.dex */
    public static class b {
        public static final int f = 1792;
        public static final byte[] g = new byte[f];
        public final CharSequence a;
        public final boolean b;
        public final int c;
        public int d;
        public char e;

        static {
            for (int i = 0; i < 1792; i++) {
                g[i] = Character.getDirectionality(i);
            }
        }

        public b(CharSequence charSequence, boolean z) {
            this.a = charSequence;
            this.b = z;
            this.c = charSequence.length();
        }

        public static byte c(char c) {
            if (c < 1792) {
                return g[c];
            }
            return Character.getDirectionality(c);
        }

        public byte a() {
            char charAt = this.a.charAt(this.d - 1);
            this.e = charAt;
            if (Character.isLowSurrogate(charAt)) {
                int codePointBefore = Character.codePointBefore(this.a, this.d);
                this.d -= Character.charCount(codePointBefore);
                return Character.getDirectionality(codePointBefore);
            }
            this.d--;
            byte c = c(this.e);
            if (this.b) {
                char c2 = this.e;
                if (c2 == '>') {
                    return h();
                }
                if (c2 == ';') {
                    return f();
                }
                return c;
            }
            return c;
        }

        public byte b() {
            char charAt = this.a.charAt(this.d);
            this.e = charAt;
            if (Character.isHighSurrogate(charAt)) {
                int codePointAt = Character.codePointAt(this.a, this.d);
                this.d += Character.charCount(codePointAt);
                return Character.getDirectionality(codePointAt);
            }
            this.d++;
            byte c = c(this.e);
            if (this.b) {
                char c2 = this.e;
                if (c2 == '<') {
                    return i();
                }
                if (c2 == '&') {
                    return g();
                }
                return c;
            }
            return c;
        }

        public int d() {
            this.d = 0;
            int i = 0;
            int i2 = 0;
            int i3 = 0;
            while (this.d < this.c && i == 0) {
                byte b = b();
                if (b != 0) {
                    if (b != 1 && b != 2) {
                        if (b != 9) {
                            switch (b) {
                                case 14:
                                case 15:
                                    i3++;
                                    i2 = -1;
                                    break;
                                case 16:
                                case 17:
                                    i3++;
                                    i2 = 1;
                                    break;
                                case 18:
                                    i3--;
                                    i2 = 0;
                                    break;
                            }
                        }
                    } else if (i3 == 0) {
                        return 1;
                    }
                } else if (i3 == 0) {
                    return -1;
                }
                i = i3;
            }
            if (i == 0) {
                return 0;
            }
            if (i2 != 0) {
                return i2;
            }
            while (this.d > 0) {
                switch (a()) {
                    case 14:
                    case 15:
                        if (i == i3) {
                            return -1;
                        }
                        break;
                    case 16:
                    case 17:
                        if (i == i3) {
                            return 1;
                        }
                        break;
                    case 18:
                        i3++;
                        continue;
                }
                i3--;
            }
            return 0;
        }

        public int e() {
            this.d = this.c;
            int i = 0;
            while (true) {
                int i2 = i;
                while (this.d > 0) {
                    byte a = a();
                    if (a != 0) {
                        if (a != 1 && a != 2) {
                            if (a != 9) {
                                switch (a) {
                                    case 14:
                                    case 15:
                                        if (i2 == i) {
                                            return -1;
                                        }
                                        i--;
                                        break;
                                    case 16:
                                    case 17:
                                        if (i2 == i) {
                                            return 1;
                                        }
                                        i--;
                                        break;
                                    case 18:
                                        i++;
                                        break;
                                    default:
                                        if (i2 != 0) {
                                            break;
                                        } else {
                                            break;
                                        }
                                }
                            } else {
                                continue;
                            }
                        } else if (i == 0) {
                            return 1;
                        } else {
                            if (i2 == 0) {
                                break;
                            }
                        }
                    } else if (i == 0) {
                        return -1;
                    } else {
                        if (i2 == 0) {
                            break;
                        }
                    }
                }
                return 0;
            }
        }

        public final byte f() {
            char charAt;
            int i = this.d;
            do {
                int i2 = this.d;
                if (i2 <= 0) {
                    break;
                }
                CharSequence charSequence = this.a;
                int i3 = i2 - 1;
                this.d = i3;
                charAt = charSequence.charAt(i3);
                this.e = charAt;
                if (charAt == '&') {
                    return C8077mf.n;
                }
            } while (charAt != ';');
            this.d = i;
            this.e = C10928yK2.l;
            return (byte) 13;
        }

        public final byte g() {
            char charAt;
            do {
                int i = this.d;
                if (i < this.c) {
                    CharSequence charSequence = this.a;
                    this.d = i + 1;
                    charAt = charSequence.charAt(i);
                    this.e = charAt;
                } else {
                    return C8077mf.n;
                }
            } while (charAt != ';');
            return C8077mf.n;
        }

        public final byte h() {
            char charAt;
            int i = this.d;
            while (true) {
                int i2 = this.d;
                if (i2 <= 0) {
                    break;
                }
                CharSequence charSequence = this.a;
                int i3 = i2 - 1;
                this.d = i3;
                char charAt2 = charSequence.charAt(i3);
                this.e = charAt2;
                if (charAt2 == '<') {
                    return C8077mf.n;
                }
                if (charAt2 == '>') {
                    break;
                } else if (charAt2 == '\"' || charAt2 == '\'') {
                    do {
                        int i4 = this.d;
                        if (i4 > 0) {
                            CharSequence charSequence2 = this.a;
                            int i5 = i4 - 1;
                            this.d = i5;
                            charAt = charSequence2.charAt(i5);
                            this.e = charAt;
                        }
                    } while (charAt != charAt2);
                }
            }
            this.d = i;
            this.e = '>';
            return (byte) 13;
        }

        public final byte i() {
            char charAt;
            int i = this.d;
            while (true) {
                int i2 = this.d;
                if (i2 < this.c) {
                    CharSequence charSequence = this.a;
                    this.d = i2 + 1;
                    char charAt2 = charSequence.charAt(i2);
                    this.e = charAt2;
                    if (charAt2 == '>') {
                        return C8077mf.n;
                    }
                    if (charAt2 == '\"' || charAt2 == '\'') {
                        do {
                            int i3 = this.d;
                            if (i3 < this.c) {
                                CharSequence charSequence2 = this.a;
                                this.d = i3 + 1;
                                charAt = charSequence2.charAt(i3);
                                this.e = charAt;
                            }
                        } while (charAt != charAt2);
                    }
                } else {
                    this.d = i;
                    this.e = '<';
                    return (byte) 13;
                }
            }
        }
    }

    static {
        InterfaceC10059um2 interfaceC10059um2 = C10302vm2.c;
        d = interfaceC10059um2;
        j = Character.toString(h);
        k = Character.toString(i);
        f674o = new C4820Ym(false, 2, interfaceC10059um2);
        p = new C4820Ym(true, 2, interfaceC10059um2);
    }

    public C4820Ym(boolean z, int i2, InterfaceC10059um2 interfaceC10059um2) {
        this.a = z;
        this.b = i2;
        this.c = interfaceC10059um2;
    }

    public static int a(CharSequence charSequence) {
        return new b(charSequence, false).d();
    }

    public static int b(CharSequence charSequence) {
        return new b(charSequence, false).e();
    }

    public static C4820Ym c() {
        return new a().a();
    }

    public static C4820Ym d(Locale locale) {
        return new a(locale).a();
    }

    public static C4820Ym e(boolean z) {
        return new a(z).a();
    }

    public static boolean j(Locale locale) {
        if (C4823Ym2.a(locale) == 1) {
            return true;
        }
        return false;
    }

    public boolean f() {
        if ((this.b & 2) != 0) {
            return true;
        }
        return false;
    }

    public boolean g(CharSequence charSequence) {
        return this.c.isRtl(charSequence, 0, charSequence.length());
    }

    public boolean h(String str) {
        return g(str);
    }

    public boolean i() {
        return this.a;
    }

    public final String k(CharSequence charSequence, InterfaceC10059um2 interfaceC10059um2) {
        boolean isRtl = interfaceC10059um2.isRtl(charSequence, 0, charSequence.length());
        if (!this.a && (isRtl || b(charSequence) == 1)) {
            return j;
        }
        if (this.a) {
            if (!isRtl || b(charSequence) == -1) {
                return k;
            }
            return "";
        }
        return "";
    }

    public final String l(CharSequence charSequence, InterfaceC10059um2 interfaceC10059um2) {
        boolean isRtl = interfaceC10059um2.isRtl(charSequence, 0, charSequence.length());
        if (!this.a && (isRtl || a(charSequence) == 1)) {
            return j;
        }
        if (this.a) {
            if (!isRtl || a(charSequence) == -1) {
                return k;
            }
            return "";
        }
        return "";
    }

    public CharSequence m(CharSequence charSequence) {
        return o(charSequence, this.c, true);
    }

    public CharSequence n(CharSequence charSequence, InterfaceC10059um2 interfaceC10059um2) {
        return o(charSequence, interfaceC10059um2, true);
    }

    public CharSequence o(CharSequence charSequence, InterfaceC10059um2 interfaceC10059um2, boolean z) {
        InterfaceC10059um2 interfaceC10059um22;
        char c;
        InterfaceC10059um2 interfaceC10059um23;
        if (charSequence == null) {
            return null;
        }
        boolean isRtl = interfaceC10059um2.isRtl(charSequence, 0, charSequence.length());
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        if (f() && z) {
            if (isRtl) {
                interfaceC10059um23 = C10302vm2.b;
            } else {
                interfaceC10059um23 = C10302vm2.a;
            }
            spannableStringBuilder.append((CharSequence) l(charSequence, interfaceC10059um23));
        }
        if (isRtl != this.a) {
            if (isRtl) {
                c = f;
            } else {
                c = e;
            }
            spannableStringBuilder.append(c);
            spannableStringBuilder.append(charSequence);
            spannableStringBuilder.append(g);
        } else {
            spannableStringBuilder.append(charSequence);
        }
        if (z) {
            if (isRtl) {
                interfaceC10059um22 = C10302vm2.b;
            } else {
                interfaceC10059um22 = C10302vm2.a;
            }
            spannableStringBuilder.append((CharSequence) k(charSequence, interfaceC10059um22));
        }
        return spannableStringBuilder;
    }

    public CharSequence p(CharSequence charSequence, boolean z) {
        return o(charSequence, this.c, z);
    }

    public String q(String str) {
        return s(str, this.c, true);
    }

    public String r(String str, InterfaceC10059um2 interfaceC10059um2) {
        return s(str, interfaceC10059um2, true);
    }

    public String s(String str, InterfaceC10059um2 interfaceC10059um2, boolean z) {
        if (str == null) {
            return null;
        }
        return o(str, interfaceC10059um2, z).toString();
    }

    public String t(String str, boolean z) {
        return s(str, this.c, z);
    }

    /* renamed from: o.Ym$a */
    /* loaded from: classes.dex */
    public static final class a {
        public boolean a;
        public int b;
        public InterfaceC10059um2 c;

        public a() {
            c(C4820Ym.j(Locale.getDefault()));
        }

        public static C4820Ym b(boolean z) {
            if (z) {
                return C4820Ym.p;
            }
            return C4820Ym.f674o;
        }

        public C4820Ym a() {
            if (this.b == 2 && this.c == C4820Ym.d) {
                return b(this.a);
            }
            return new C4820Ym(this.a, this.b, this.c);
        }

        public final void c(boolean z) {
            this.a = z;
            this.c = C4820Ym.d;
            this.b = 2;
        }

        public a d(InterfaceC10059um2 interfaceC10059um2) {
            this.c = interfaceC10059um2;
            return this;
        }

        public a e(boolean z) {
            if (z) {
                this.b |= 2;
                return this;
            }
            this.b &= -3;
            return this;
        }

        public a(boolean z) {
            c(z);
        }

        public a(Locale locale) {
            c(C4820Ym.j(locale));
        }
    }
}
