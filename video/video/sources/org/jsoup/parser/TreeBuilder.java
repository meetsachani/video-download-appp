package org.jsoup.parser;

import java.io.Reader;
import java.util.ArrayList;
import java.util.List;
import org.jsoup.helper.Validate;
import org.jsoup.internal.SharedConstants;
import org.jsoup.nodes.Attributes;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.Node;
import org.jsoup.nodes.Range;
import org.jsoup.parser.Token;
import org.jsoup.select.NodeVisitor;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes4.dex */
public abstract class TreeBuilder {
    public Parser a;
    public CharacterReader b;
    public Tokeniser c;
    public Document d;
    public ArrayList<Element> e;
    public String f;
    public Token g;
    public ParseSettings h;
    public TagSet i;
    public NodeVisitor j;
    public Token.StartTag k;
    public final Token.EndTag l = new Token.EndTag(this);
    public boolean m;

    public Tag A(String str, String str2, String str3, ParseSettings parseSettings) {
        return this.i.w(str, str2, str3, parseSettings.f());
    }

    public Tag B(Token.Tag tag) {
        return this.i.w(tag.G(), tag.f, f(), this.h.f());
    }

    public void C(Node node, boolean z) {
        String str;
        if (this.m) {
            Token token = this.g;
            int q = token.q();
            int g = token.g();
            if (node instanceof Element) {
                Element element = (Element) node;
                if (token.m()) {
                    if (element.q2().e()) {
                        return;
                    }
                    q = this.b.p0();
                } else if (!z) {
                }
                g = q;
            }
            Range range = new Range(new Range.Position(q, this.b.W(q), this.b.r(q)), new Range.Position(g, this.b.W(g), this.b.r(g)));
            Attributes p = node.p();
            if (z) {
                str = SharedConstants.c;
            } else {
                str = SharedConstants.d;
            }
            p.v0(str, range);
        }
    }

    public void a() {
        CharacterReader characterReader = this.b;
        if (characterReader == null) {
            return;
        }
        characterReader.close();
        this.b = null;
        this.c = null;
        this.e = null;
    }

    public abstract List<Node> b();

    public Element c() {
        int size = this.e.size();
        if (size > 0) {
            return this.e.get(size - 1);
        }
        return this.d;
    }

    public boolean d(String str) {
        Element c;
        if (this.e.size() == 0 || (c = c()) == null || !c.C0().equals(str) || !c.A4().q().equals(Parser.b1)) {
            return false;
        }
        return true;
    }

    public boolean e(String str, String str2) {
        Element c;
        if (this.e.size() == 0 || (c = c()) == null || !c.C0().equals(str) || !c.A4().q().equals(str2)) {
            return false;
        }
        return true;
    }

    public String f() {
        return Parser.b1;
    }

    public abstract ParseSettings g();

    public TagSet h() {
        return TagSet.o();
    }

    public void i(String str) {
        j(str, null);
    }

    public void j(String str, Object... objArr) {
        ParseErrorList d = this.a.d();
        if (d.d()) {
            d.add(new ParseError(this.b, str, objArr));
        }
    }

    public void k(Reader reader, String str, Parser parser) {
        boolean z;
        Validate.s(reader, "input");
        Validate.s(str, "baseUri");
        Validate.q(parser);
        Document document = new Document(parser.c(), str);
        this.d = document;
        document.l5(parser);
        this.a = parser;
        this.h = parser.u();
        this.b = new CharacterReader(reader);
        this.m = parser.h();
        CharacterReader characterReader = this.b;
        if (!parser.g() && !this.m) {
            z = false;
        } else {
            z = true;
        }
        characterReader.C0(z);
        if (parser.g()) {
            parser.d().clear();
        }
        this.c = new Tokeniser(this);
        this.e = new ArrayList<>(32);
        this.i = parser.x();
        Token.StartTag startTag = new Token.StartTag(this);
        this.k = startTag;
        this.g = startTag;
        this.f = str;
        p(this.d);
    }

    public void l(Element element) {
    }

    public abstract TreeBuilder m();

    public void n(NodeVisitor nodeVisitor) {
        this.j = nodeVisitor;
    }

    public void o(Node node) {
        C(node, false);
        NodeVisitor nodeVisitor = this.j;
        if (nodeVisitor != null) {
            nodeVisitor.b(node, this.e.size());
        }
    }

    public void p(Node node) {
        C(node, true);
        NodeVisitor nodeVisitor = this.j;
        if (nodeVisitor != null) {
            nodeVisitor.d(node, this.e.size());
        }
    }

    public Document q(Reader reader, String str, Parser parser) {
        k(reader, str, parser);
        y();
        return this.d;
    }

    public List<Node> r(Reader reader, Element element, String str, Parser parser) {
        k(reader, str, parser);
        l(element);
        y();
        return b();
    }

    public Element s() {
        Element remove = this.e.remove(this.e.size() - 1);
        o(remove);
        return remove;
    }

    public abstract boolean t(Token token);

    public boolean u(String str) {
        Token token = this.g;
        Token.EndTag endTag = this.l;
        if (token == endTag) {
            return t(new Token.EndTag(this).H(str));
        }
        return t(endTag.p().H(str));
    }

    public boolean v(String str) {
        Token.StartTag startTag = this.k;
        if (this.g == startTag) {
            return t(new Token.StartTag(this).H(str));
        }
        return t(startTag.p().H(str));
    }

    public boolean w(String str, Attributes attributes) {
        Token.StartTag startTag = this.k;
        if (this.g == startTag) {
            return t(new Token.StartTag(this).P(str, attributes));
        }
        startTag.p();
        startTag.P(str, attributes);
        return t(startTag);
    }

    public final void x(Element element) {
        this.e.add(element);
        p(element);
    }

    public void y() {
        do {
        } while (z());
        a();
    }

    public boolean z() {
        if (this.g.a == Token.TokenType.EOF) {
            ArrayList<Element> arrayList = this.e;
            if (arrayList == null) {
                return false;
            }
            if (arrayList.isEmpty()) {
                o(this.d);
                this.e = null;
                return true;
            }
            s();
            return true;
        }
        Token x = this.c.x();
        this.g = x;
        t(x);
        x.p();
        return true;
    }
}
