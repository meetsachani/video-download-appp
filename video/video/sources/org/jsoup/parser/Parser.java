package org.jsoup.parser;

import java.io.Reader;
import java.io.StringReader;
import java.util.List;
import java.util.concurrent.locks.ReentrantLock;
import org.jsoup.helper.Validate;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.Node;

/* loaded from: classes4.dex */
public class Parser implements Cloneable {
    public static final String b1 = "http://www.w3.org/1999/xhtml";
    public static final String c1 = "http://www.w3.org/XML/1998/namespace";
    public static final String d1 = "http://www.w3.org/1998/Math/MathML";
    public static final String e1 = "http://www.w3.org/2000/svg";
    public final TreeBuilder X;
    public ParseErrorList Y;
    public boolean Y0;
    public ParseSettings Z;
    public TagSet Z0;
    public final ReentrantLock a1;

    public Parser(TreeBuilder treeBuilder) {
        this.Y0 = false;
        this.a1 = new ReentrantLock();
        this.X = treeBuilder;
        this.Z = treeBuilder.g();
        this.Y = ParseErrorList.f();
    }

    public static Parser f() {
        return new Parser(new HtmlTreeBuilder());
    }

    public static Document j(String str, String str2) {
        HtmlTreeBuilder htmlTreeBuilder = new HtmlTreeBuilder();
        return htmlTreeBuilder.q(new StringReader(str), str2, new Parser(htmlTreeBuilder));
    }

    public static Document k(String str, String str2) {
        Document Y4 = Document.Y4(str2);
        Element R4 = Y4.R4();
        R4.E1(l(str, R4, str2));
        return Y4;
    }

    public static List<Node> l(String str, Element element, String str2) {
        HtmlTreeBuilder htmlTreeBuilder = new HtmlTreeBuilder();
        return htmlTreeBuilder.r(new StringReader(str), element, str2, new Parser(htmlTreeBuilder));
    }

    public static List<Node> m(String str, Element element, String str2, ParseErrorList parseErrorList) {
        HtmlTreeBuilder htmlTreeBuilder = new HtmlTreeBuilder();
        Parser parser = new Parser(htmlTreeBuilder);
        parser.Y = parseErrorList;
        return htmlTreeBuilder.r(new StringReader(str), element, str2, parser);
    }

    public static List<Node> r(String str, String str2) {
        XmlTreeBuilder xmlTreeBuilder = new XmlTreeBuilder();
        return xmlTreeBuilder.r(new StringReader(str), null, str2, new Parser(xmlTreeBuilder));
    }

    public static String y(String str, boolean z) {
        Validate.q(str);
        if (str.indexOf(38) < 0) {
            return str;
        }
        Parser f = f();
        f.X.k(new StringReader(str), "", f);
        return new Tokeniser(f.X).z(z);
    }

    public static Parser z() {
        return new Parser(new XmlTreeBuilder());
    }

    /* renamed from: b */
    public Parser clone() {
        return new Parser(this);
    }

    public String c() {
        return e().f();
    }

    public ParseErrorList d() {
        return this.Y;
    }

    public TreeBuilder e() {
        return this.X;
    }

    public boolean g() {
        if (this.Y.e() > 0) {
            return true;
        }
        return false;
    }

    public boolean h() {
        return this.Y0;
    }

    public Parser i() {
        return new Parser(this);
    }

    public List<Node> n(Reader reader, Element element, String str) {
        try {
            this.a1.lock();
            return this.X.r(reader, element, str, this);
        } finally {
            this.a1.unlock();
        }
    }

    public List<Node> o(String str, Element element, String str2) {
        return n(new StringReader(str), element, str2);
    }

    public Document p(Reader reader, String str) {
        try {
            this.a1.lock();
            return this.X.q(reader, str, this);
        } finally {
            this.a1.unlock();
        }
    }

    public Document q(String str, String str2) {
        return p(new StringReader(str), str2);
    }

    public Parser s(int i) {
        ParseErrorList f;
        if (i > 0) {
            f = ParseErrorList.h(i);
        } else {
            f = ParseErrorList.f();
        }
        this.Y = f;
        return this;
    }

    public Parser t(boolean z) {
        this.Y0 = z;
        return this;
    }

    public ParseSettings u() {
        return this.Z;
    }

    public Parser v(ParseSettings parseSettings) {
        this.Z = parseSettings;
        return this;
    }

    public Parser w(TagSet tagSet) {
        Validate.q(tagSet);
        this.Z0 = new TagSet(tagSet);
        return this;
    }

    public TagSet x() {
        if (this.Z0 == null) {
            this.Z0 = this.X.h();
        }
        return this.Z0;
    }

    public Parser(Parser parser) {
        this.Y0 = false;
        this.a1 = new ReentrantLock();
        this.X = parser.X.m();
        this.Y = new ParseErrorList(parser.Y);
        this.Z = new ParseSettings(parser.Z);
        this.Y0 = parser.Y0;
    }
}
