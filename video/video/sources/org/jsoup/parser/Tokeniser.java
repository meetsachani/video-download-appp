package org.jsoup.parser;

import java.util.Arrays;
import o.C10928yK2;
import o.C3503Kz;
import o.C8206nB;
import org.jsoup.helper.Validate;
import org.jsoup.internal.StringUtil;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Entities;
import org.jsoup.parser.Token;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes4.dex */
public final class Tokeniser {
    public static final char u = 65533;
    public static final char[] v;
    public static final int w = 128;
    public static final int[] x;
    public static final /* synthetic */ boolean y = false;
    public final CharacterReader a;
    public final ParseErrorList b;
    public final Document.OutputSettings.Syntax g;
    public final Token.StartTag h;
    public final Token.EndTag i;
    public Token.Tag j;
    public final Token.XmlDecl n;

    /* renamed from: o  reason: collision with root package name */
    public String f936o;
    public String p;
    public int q;
    public TokeniserState c = TokeniserState.Data;
    public Token d = null;
    public boolean e = false;
    public final TokenData f = new TokenData();
    public final Token.Character k = new Token.Character();
    public final Token.Doctype l = new Token.Doctype();
    public final Token.Comment m = new Token.Comment();
    public int r = 0;
    public final int[] s = new int[1];
    public final int[] t = new int[2];

    static {
        char[] cArr = {'\t', '\n', C8206nB.d, '\f', ' ', '<', '&'};
        v = cArr;
        x = new int[]{8364, 129, 8218, 402, 8222, 8230, 8224, 8225, 710, 8240, 352, 8249, 338, C3503Kz.e0, 381, C3503Kz.g0, C3503Kz.h0, 8216, 8217, 8220, 8221, 8226, 8211, 8212, 732, 8482, 353, 8250, 339, C3503Kz.q0, 382, 376};
        Arrays.sort(cArr);
    }

    public Tokeniser(TreeBuilder treeBuilder) {
        Document.OutputSettings.Syntax syntax;
        if (treeBuilder instanceof XmlTreeBuilder) {
            syntax = Document.OutputSettings.Syntax.xml;
        } else {
            syntax = Document.OutputSettings.Syntax.html;
        }
        this.g = syntax;
        Token.StartTag startTag = new Token.StartTag(treeBuilder);
        this.h = startTag;
        this.j = startTag;
        this.i = new Token.EndTag(treeBuilder);
        this.n = new Token.XmlDecl(treeBuilder);
        this.a = treeBuilder.b;
        this.b = treeBuilder.a.d();
    }

    public void a(TokeniserState tokeniserState) {
        y(tokeniserState);
        this.a.n();
    }

    public String b() {
        return this.f936o;
    }

    public String c() {
        if (this.p == null) {
            this.p = "</" + this.f936o;
        }
        return this.p;
    }

    public final void d(String str, Object... objArr) {
        if (this.b.d()) {
            ParseErrorList parseErrorList = this.b;
            CharacterReader characterReader = this.a;
            parseErrorList.add(new ParseError(characterReader, String.format("Invalid character reference: " + str, objArr)));
        }
    }

    public int[] e(Character ch, boolean z) {
        String v2;
        int i;
        int i2;
        if (this.a.R()) {
            return null;
        }
        if ((ch != null && ch.charValue() == this.a.P()) || this.a.i0(v)) {
            return null;
        }
        int[] iArr = this.s;
        this.a.Z();
        if (this.a.a0("#")) {
            boolean b0 = this.a.b0("X");
            CharacterReader characterReader = this.a;
            if (b0) {
                v2 = characterReader.x();
            } else {
                v2 = characterReader.v();
            }
            if (v2.isEmpty()) {
                d("numeric reference with no numerals", new Object[0]);
                this.a.A0();
                return null;
            }
            this.a.E0();
            if (!this.a.a0(";")) {
                d("missing semicolon on [&#%s]", v2);
            }
            if (b0) {
                i = 16;
            } else {
                i = 10;
            }
            try {
                i2 = Integer.valueOf(v2, i).intValue();
            } catch (NumberFormatException unused) {
                i2 = -1;
            }
            if (i2 != -1 && i2 <= 1114111) {
                if (i2 >= 128) {
                    int[] iArr2 = x;
                    if (i2 < iArr2.length + 128) {
                        d("character [%s] is not a valid unicode code point", Integer.valueOf(i2));
                        i2 = iArr2[i2 - 128];
                    }
                }
                iArr[0] = i2;
            } else {
                d("character [%s] outside of valid range", Integer.valueOf(i2));
                iArr[0] = 65533;
            }
            return iArr;
        }
        String z2 = this.a.z();
        boolean c0 = this.a.c0(C10928yK2.l);
        if (!Entities.r(z2) && (!Entities.s(z2) || !c0)) {
            this.a.A0();
            if (c0) {
                d("invalid named reference [%s]", z2);
            }
            if (z) {
                return null;
            }
            z2 = Entities.p(z2);
            if (z2.isEmpty()) {
                return null;
            }
            this.a.a0(z2);
        }
        if (z && (this.a.j0() || this.a.k0() || this.a.g0('=', '-', '_'))) {
            this.a.A0();
            return null;
        }
        this.a.E0();
        if (!this.a.a0(";")) {
            d("missing semicolon on [&%s]", z2);
        }
        int i3 = Entities.i(z2, this.t);
        if (i3 == 1) {
            iArr[0] = this.t[0];
            return iArr;
        } else if (i3 == 2) {
            return this.t;
        } else {
            Validate.f("Unexpected characters returned for " + z2);
            return this.t;
        }
    }

    public void f() {
        this.m.p();
        this.m.f = true;
    }

    public void g() {
        this.m.p();
    }

    public void h() {
        this.l.p();
    }

    public Token.Tag i(boolean z) {
        Token.Tag p;
        if (z) {
            p = this.h.p();
        } else {
            p = this.i.p();
        }
        this.j = p;
        return p;
    }

    public void j() {
        this.f.f();
    }

    public Token.XmlDecl k(boolean z) {
        Token.XmlDecl p = this.n.p();
        p.t = z;
        this.j = p;
        return p;
    }

    public void l(char c) {
        this.k.e.a(c);
        this.k.r(this.r);
        this.k.h(this.a.p0());
    }

    public void m(String str) {
        this.k.t(str);
        this.k.r(this.r);
        this.k.h(this.a.p0());
    }

    public void n(Token token) {
        Validate.h(this.e);
        this.d = token;
        this.e = true;
        token.r(this.q);
        token.h(this.a.p0());
        this.r = this.a.p0();
        Token.TokenType tokenType = token.a;
        if (tokenType == Token.TokenType.StartTag) {
            this.f936o = ((Token.StartTag) token).G();
            this.p = null;
        } else if (tokenType == Token.TokenType.EndTag) {
            Token.EndTag endTag = (Token.EndTag) token;
            if (endTag.E()) {
                u("Attributes incorrectly present on end tag [/%s]", endTag.J());
            }
        }
    }

    public void o(int[] iArr) {
        m(new String(iArr, 0, iArr.length));
    }

    public void p() {
        n(this.m);
    }

    public void q() {
        n(this.l);
    }

    public void r() {
        this.j.C();
        n(this.j);
    }

    public void s(TokeniserState tokeniserState) {
        if (this.b.d()) {
            this.b.add(new ParseError(this.a, "Unexpectedly reached end of file (EOF) in input state [%s]", tokeniserState));
        }
    }

    public void t(String str) {
        if (this.b.d()) {
            this.b.add(new ParseError(this.a, str));
        }
    }

    public void u(String str, Object... objArr) {
        if (this.b.d()) {
            this.b.add(new ParseError(this.a, str, objArr));
        }
    }

    public void v(TokeniserState tokeniserState) {
        if (this.b.d()) {
            ParseErrorList parseErrorList = this.b;
            CharacterReader characterReader = this.a;
            parseErrorList.add(new ParseError(characterReader, "Unexpected character '%s' in input state [%s]", Character.valueOf(characterReader.P()), tokeniserState));
        }
    }

    public boolean w() {
        if (this.f936o != null && this.j.G().equalsIgnoreCase(this.f936o)) {
            return true;
        }
        return false;
    }

    public Token x() {
        while (!this.e) {
            this.c.p(this, this.a);
        }
        if (this.k.e.e()) {
            return this.k;
        }
        this.e = false;
        return this.d;
    }

    public void y(TokeniserState tokeniserState) {
        if (tokeniserState == TokeniserState.TagOpen) {
            this.q = this.a.p0();
        }
        this.c = tokeniserState;
    }

    public String z(boolean z) {
        StringBuilder e = StringUtil.e();
        while (!this.a.R()) {
            e.append(this.a.G('&'));
            if (this.a.c0('&')) {
                this.a.s();
                int[] e2 = e(null, z);
                if (e2 != null && e2.length != 0) {
                    e.appendCodePoint(e2[0]);
                    if (e2.length == 2) {
                        e.appendCodePoint(e2[1]);
                    }
                } else {
                    e.append('&');
                }
            }
        }
        return StringUtil.x(e);
    }
}
