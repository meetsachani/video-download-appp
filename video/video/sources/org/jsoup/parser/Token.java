package org.jsoup.parser;

import o.C4500Ve2;
import org.jsoup.helper.Validate;
import org.jsoup.internal.Normalizer;
import org.jsoup.nodes.Attributes;
import org.jsoup.nodes.Range;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes4.dex */
public abstract class Token {
    public static final int d = -1;
    public final TokenType a;
    public int b;
    public int c;

    /* loaded from: classes4.dex */
    public static final class CData extends Character {
        public CData(String str) {
            u(str);
        }

        @Override // org.jsoup.parser.Token.Character
        public String toString() {
            return "<![CDATA[" + v() + "]]>";
        }
    }

    /* loaded from: classes4.dex */
    public static final class Comment extends Token {
        public final TokenData e;
        public boolean f;

        public Comment() {
            super(TokenType.Comment);
            this.e = new TokenData();
            this.f = false;
        }

        @Override // org.jsoup.parser.Token
        public Token p() {
            super.p();
            this.e.f();
            this.f = false;
            return this;
        }

        public Comment t(char c) {
            this.e.a(c);
            return this;
        }

        public String toString() {
            return "<!--" + v() + "-->";
        }

        public Comment u(String str) {
            this.e.b(str);
            return this;
        }

        public String v() {
            return this.e.h();
        }
    }

    /* loaded from: classes4.dex */
    public static final class Doctype extends Token {
        public final TokenData e;
        public String f;
        public final TokenData g;
        public final TokenData h;
        public boolean i;

        public Doctype() {
            super(TokenType.Doctype);
            this.e = new TokenData();
            this.f = null;
            this.g = new TokenData();
            this.h = new TokenData();
            this.i = false;
        }

        @Override // org.jsoup.parser.Token
        public Token p() {
            super.p();
            this.e.f();
            this.f = null;
            this.g.f();
            this.h.f();
            this.i = false;
            return this;
        }

        public String t() {
            return this.e.h();
        }

        public String toString() {
            return "<!doctype " + t() + ">";
        }

        public String u() {
            return this.f;
        }

        public String v() {
            return this.g.h();
        }

        public String w() {
            return this.h.h();
        }

        public boolean x() {
            return this.i;
        }
    }

    /* loaded from: classes4.dex */
    public static final class EOF extends Token {
        public EOF() {
            super(TokenType.EOF);
        }

        @Override // org.jsoup.parser.Token
        public Token p() {
            super.p();
            return this;
        }

        public String toString() {
            return "";
        }
    }

    /* loaded from: classes4.dex */
    public static final class EndTag extends Tag {
        public EndTag(TreeBuilder treeBuilder) {
            super(TokenType.EndTag, treeBuilder);
        }

        @Override // org.jsoup.parser.Token.Tag
        public String toString() {
            return "</" + N() + ">";
        }
    }

    /* loaded from: classes4.dex */
    public static final class StartTag extends Tag {
        public StartTag(TreeBuilder treeBuilder) {
            super(TokenType.StartTag, treeBuilder);
        }

        @Override // org.jsoup.parser.Token.Tag, org.jsoup.parser.Token
        /* renamed from: K */
        public Tag p() {
            super.p();
            this.h = null;
            return this;
        }

        public StartTag P(String str, Attributes attributes) {
            this.e.g(str);
            this.h = attributes;
            this.f = ParseSettings.a(str);
            return this;
        }

        @Override // org.jsoup.parser.Token.Tag
        public String toString() {
            String str;
            if (F()) {
                str = "/>";
            } else {
                str = ">";
            }
            if (E() && this.h.size() > 0) {
                return "<" + N() + C4500Ve2.b + this.h.toString() + str;
            }
            return "<" + N() + str;
        }
    }

    /* loaded from: classes4.dex */
    public static abstract class Tag extends Token {
        public static final int r = 512;
        public static final /* synthetic */ boolean s = false;
        public TokenData e;
        public String f;
        public boolean g;
        public Attributes h;
        public final TokenData i;
        public final TokenData j;
        public boolean k;
        public final TreeBuilder l;
        public final boolean m;
        public int n;

        /* renamed from: o  reason: collision with root package name */
        public int f935o;
        public int p;
        public int q;

        public Tag(TokenType tokenType, TreeBuilder treeBuilder) {
            super(tokenType);
            this.e = new TokenData();
            this.g = false;
            this.i = new TokenData();
            this.j = new TokenData();
            this.k = false;
            this.l = treeBuilder;
            this.m = treeBuilder.m;
        }

        public final void A(int i, int i2) {
            if (this.m) {
                int i3 = this.n;
                if (i3 > -1) {
                    i = i3;
                }
                this.n = i;
                this.f935o = i2;
            }
        }

        public final void B(int i, int i2) {
            if (this.m) {
                int i3 = this.p;
                if (i3 > -1) {
                    i = i3;
                }
                this.p = i;
                this.q = i2;
            }
        }

        public final void C() {
            if (this.i.e()) {
                I();
            }
        }

        public final boolean D(String str) {
            Attributes attributes = this.h;
            if (attributes != null && attributes.M(str)) {
                return true;
            }
            return false;
        }

        public final boolean E() {
            if (this.h != null) {
                return true;
            }
            return false;
        }

        public final boolean F() {
            return this.g;
        }

        public final String G() {
            return this.e.h();
        }

        public final Tag H(String str) {
            this.e.g(str);
            this.f = ParseSettings.a(this.e.h());
            return this;
        }

        public final void I() {
            String str;
            if (this.h == null) {
                this.h = new Attributes();
            }
            if (this.i.e() && this.h.size() < 512) {
                String trim = this.i.h().trim();
                if (!trim.isEmpty()) {
                    if (this.j.e()) {
                        str = this.j.h();
                    } else if (this.k) {
                        str = "";
                    } else {
                        str = null;
                    }
                    this.h.f(trim, str);
                    O(trim);
                }
            }
            L();
        }

        public final String J() {
            boolean z;
            String str = this.f;
            if (str != null && !str.isEmpty()) {
                z = false;
            } else {
                z = true;
            }
            Validate.h(z);
            return this.f;
        }

        @Override // org.jsoup.parser.Token
        /* renamed from: K */
        public Tag p() {
            super.p();
            this.e.f();
            this.f = null;
            this.g = false;
            this.h = null;
            L();
            return this;
        }

        public final void L() {
            this.i.f();
            this.j.f();
            this.k = false;
            if (this.m) {
                this.q = -1;
                this.p = -1;
                this.f935o = -1;
                this.n = -1;
            }
        }

        public final void M() {
            this.k = true;
        }

        public final String N() {
            String h = this.e.h();
            if (h.isEmpty()) {
                return "[unset]";
            }
            return h;
        }

        public final void O(String str) {
            if (this.m && o()) {
                TreeBuilder treeBuilder = e().l;
                CharacterReader characterReader = treeBuilder.b;
                if (!treeBuilder.h.e()) {
                    str = Normalizer.a(str);
                }
                if (!this.h.s0(str).a().e()) {
                    if (!this.j.e()) {
                        int i = this.f935o;
                        this.q = i;
                        this.p = i;
                    }
                    int i2 = this.n;
                    Range.Position position = new Range.Position(i2, characterReader.W(i2), characterReader.r(this.n));
                    int i3 = this.f935o;
                    Range range = new Range(position, new Range.Position(i3, characterReader.W(i3), characterReader.r(this.f935o)));
                    int i4 = this.p;
                    Range.Position position2 = new Range.Position(i4, characterReader.W(i4), characterReader.r(this.p));
                    int i5 = this.q;
                    this.h.r0(str, new Range.AttributeRange(range, new Range(position2, new Range.Position(i5, characterReader.W(i5), characterReader.r(this.q)))));
                }
            }
        }

        public final void t(char c, int i, int i2) {
            this.i.a(c);
            A(i, i2);
        }

        public abstract String toString();

        public final void u(String str, int i, int i2) {
            this.i.b(str.replace((char) 0, (char) 65533));
            A(i, i2);
        }

        public final void v(char c, int i, int i2) {
            this.j.a(c);
            B(i, i2);
        }

        public final void w(String str, int i, int i2) {
            this.j.b(str);
            B(i, i2);
        }

        public final void x(int[] iArr, int i, int i2) {
            for (int i3 : iArr) {
                this.j.c(i3);
            }
            B(i, i2);
        }

        public final void y(char c) {
            z(String.valueOf(c));
        }

        public final void z(String str) {
            this.e.b(str.replace((char) 0, (char) 65533));
            this.f = ParseSettings.a(this.e.h());
        }
    }

    /* loaded from: classes4.dex */
    public enum TokenType {
        Doctype,
        StartTag,
        EndTag,
        Comment,
        Character,
        XmlDecl,
        EOF
    }

    /* loaded from: classes4.dex */
    public static final class XmlDecl extends Tag {
        public boolean t;

        public XmlDecl(TreeBuilder treeBuilder) {
            super(TokenType.XmlDecl, treeBuilder);
            this.t = true;
        }

        @Override // org.jsoup.parser.Token.Tag, org.jsoup.parser.Token
        /* renamed from: P */
        public XmlDecl p() {
            super.p();
            this.t = true;
            return this;
        }

        @Override // org.jsoup.parser.Token.Tag
        public String toString() {
            String str;
            String str2;
            boolean z = this.t;
            if (z) {
                str = "<!";
            } else {
                str = "<?";
            }
            if (z) {
                str2 = ">";
            } else {
                str2 = "?>";
            }
            if (E() && this.h.size() > 0) {
                return str + N() + C4500Ve2.b + this.h.toString() + str2;
            }
            return str + N() + str2;
        }
    }

    public final Character a() {
        return (Character) this;
    }

    public final Comment b() {
        return (Comment) this;
    }

    public final Doctype c() {
        return (Doctype) this;
    }

    public final EndTag d() {
        return (EndTag) this;
    }

    public final StartTag e() {
        return (StartTag) this;
    }

    public final XmlDecl f() {
        return (XmlDecl) this;
    }

    public int g() {
        return this.c;
    }

    public void h(int i) {
        this.c = i;
    }

    public final boolean i() {
        return this instanceof CData;
    }

    public final boolean j() {
        if (this.a == TokenType.Character) {
            return true;
        }
        return false;
    }

    public final boolean k() {
        if (this.a == TokenType.Comment) {
            return true;
        }
        return false;
    }

    public final boolean l() {
        if (this.a == TokenType.Doctype) {
            return true;
        }
        return false;
    }

    public final boolean m() {
        if (this.a == TokenType.EOF) {
            return true;
        }
        return false;
    }

    public final boolean n() {
        if (this.a == TokenType.EndTag) {
            return true;
        }
        return false;
    }

    public final boolean o() {
        if (this.a == TokenType.StartTag) {
            return true;
        }
        return false;
    }

    public Token p() {
        this.b = -1;
        this.c = -1;
        return this;
    }

    public int q() {
        return this.b;
    }

    public void r(int i) {
        this.b = i;
    }

    public String s() {
        return getClass().getSimpleName();
    }

    /* loaded from: classes4.dex */
    public static class Character extends Token {
        public final TokenData e;

        public Character() {
            super(TokenType.Character);
            this.e = new TokenData();
        }

        @Override // org.jsoup.parser.Token
        public Token p() {
            super.p();
            this.e.f();
            return this;
        }

        public Character t(String str) {
            this.e.b(str);
            return this;
        }

        public String toString() {
            return v();
        }

        public Character u(String str) {
            this.e.g(str);
            return this;
        }

        public String v() {
            return this.e.h();
        }

        public Character(Character character) {
            super(TokenType.Character);
            TokenData tokenData = new TokenData();
            this.e = tokenData;
            this.b = character.b;
            this.c = character.c;
            tokenData.g(character.e.h());
        }
    }

    public Token(TokenType tokenType) {
        this.c = -1;
        this.a = tokenType;
    }
}
