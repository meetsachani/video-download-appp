package org.jsoup.nodes;

import java.nio.charset.Charset;
import java.util.Iterator;
import java.util.List;
import o.C2730De2;
import o.C4317Th1;
import o.C5445bv2;
import org.jsoup.Connection;
import org.jsoup.Jsoup;
import org.jsoup.helper.DataUtil;
import org.jsoup.helper.Validate;
import org.jsoup.internal.StringUtil;
import org.jsoup.nodes.Entities;
import org.jsoup.parser.ParseSettings;
import org.jsoup.parser.Parser;
import org.jsoup.parser.Tag;
import org.jsoup.select.Evaluator;

/* loaded from: classes4.dex */
public class Document extends Element {
    public static final Evaluator o1 = new Evaluator.Tag("title");
    public Connection j1;
    public OutputSettings k1;
    public Parser l1;
    public QuirksMode m1;
    public final String n1;

    /* loaded from: classes4.dex */
    public static class OutputSettings implements Cloneable {
        public Entities.EscapeMode X = Entities.EscapeMode.base;
        public Charset Y = DataUtil.b;
        public boolean Z = true;
        public boolean Y0 = false;
        public int Z0 = 1;
        public int a1 = 30;
        public Syntax b1 = Syntax.html;

        /* loaded from: classes4.dex */
        public enum Syntax {
            html,
            xml
        }

        public Charset b() {
            return this.Y;
        }

        public OutputSettings c(String str) {
            d(Charset.forName(str));
            return this;
        }

        public OutputSettings d(Charset charset) {
            this.Y = charset;
            return this;
        }

        /* renamed from: e */
        public OutputSettings clone() {
            try {
                OutputSettings outputSettings = (OutputSettings) super.clone();
                outputSettings.c(this.Y.name());
                outputSettings.X = Entities.EscapeMode.valueOf(this.X.name());
                return outputSettings;
            } catch (CloneNotSupportedException e) {
                throw new RuntimeException(e);
            }
        }

        public OutputSettings f(Entities.EscapeMode escapeMode) {
            this.X = escapeMode;
            return this;
        }

        public Entities.EscapeMode g() {
            return this.X;
        }

        public int h() {
            return this.Z0;
        }

        public OutputSettings i(int i) {
            boolean z;
            if (i >= 0) {
                z = true;
            } else {
                z = false;
            }
            Validate.j(z);
            this.Z0 = i;
            return this;
        }

        public int j() {
            return this.a1;
        }

        public OutputSettings k(int i) {
            boolean z;
            if (i >= -1) {
                z = true;
            } else {
                z = false;
            }
            Validate.j(z);
            this.a1 = i;
            return this;
        }

        public OutputSettings l(boolean z) {
            this.Y0 = z;
            return this;
        }

        public boolean m() {
            return this.Y0;
        }

        public OutputSettings n(boolean z) {
            this.Z = z;
            return this;
        }

        public boolean o() {
            return this.Z;
        }

        public Syntax p() {
            return this.b1;
        }

        public OutputSettings q(Syntax syntax) {
            this.b1 = syntax;
            if (syntax == Syntax.xml) {
                f(Entities.EscapeMode.xhtml);
            }
            return this;
        }
    }

    /* loaded from: classes4.dex */
    public enum QuirksMode {
        noQuirks,
        quirks,
        limitedQuirks
    }

    public Document(String str, String str2) {
        this(str, str2, Parser.f());
    }

    public static Document Y4(String str) {
        Validate.q(str);
        Document document = new Document(str);
        Element F1 = document.F1("html");
        F1.F1(C5445bv2.f701o);
        F1.F1("body");
        return document;
    }

    @Override // org.jsoup.nodes.Node
    public String F0() {
        return super.c3();
    }

    @Override // org.jsoup.nodes.Element
    public Element G4(String str) {
        R4().G4(str);
        return this;
    }

    public Element R4() {
        Element h5 = h5();
        for (Element w2 = h5.w2(); w2 != null; w2 = w2.u0()) {
            if (w2.t0("body") || w2.t0("frameset")) {
                return w2;
            }
        }
        return h5.F1("body");
    }

    public Charset S4() {
        return this.k1.b();
    }

    public void T4(Charset charset) {
        this.k1.d(charset);
        a5();
    }

    @Override // org.jsoup.nodes.Element, org.jsoup.nodes.Node
    /* renamed from: U4 */
    public Document clone() {
        Document document = (Document) super.clone();
        Attributes attributes = this.c1;
        if (attributes != null) {
            document.c1 = attributes.clone();
        }
        document.k1 = this.k1.clone();
        return document;
    }

    public Connection V4() {
        Connection connection = this.j1;
        if (connection == null) {
            return Jsoup.f();
        }
        return connection;
    }

    public Document W4(Connection connection) {
        Validate.q(connection);
        this.j1 = connection;
        return this;
    }

    public Element X4(String str) {
        return new Element(this.l1.x().x(str, this.l1.c(), ParseSettings.d), Element.a4(this, Element.g1));
    }

    public DocumentType Z4() {
        Iterator<Node> it = this.b1.iterator();
        while (it.hasNext()) {
            Node next = it.next();
            if (next instanceof DocumentType) {
                return (DocumentType) next;
            }
            if (!(next instanceof LeafNode)) {
                return null;
            }
        }
        return null;
    }

    public final void a5() {
        OutputSettings.Syntax p = j5().p();
        if (p == OutputSettings.Syntax.html) {
            Element d4 = d4("meta[charset]");
            if (d4 != null) {
                d4.l(C4317Th1.g, S4().displayName());
            } else {
                f5().F1("meta").l(C4317Th1.g, S4().displayName());
            }
            b4("meta[name=charset]").B();
        } else if (p == OutputSettings.Syntax.xml) {
            XmlDeclaration b5 = b5();
            b5.l("version", "1.0");
            b5.l("encoding", S4().displayName());
        }
    }

    public final XmlDeclaration b5() {
        Node b0 = b0();
        if (b0 instanceof XmlDeclaration) {
            XmlDeclaration xmlDeclaration = (XmlDeclaration) b0;
            if (xmlDeclaration.B1().equals(C2730De2.w)) {
                return xmlDeclaration;
            }
        }
        XmlDeclaration xmlDeclaration2 = new XmlDeclaration(C2730De2.w, false);
        K3(xmlDeclaration2);
        return xmlDeclaration2;
    }

    public FormElement c5(String str) {
        Iterator<T> it = b4(str).iterator();
        while (it.hasNext()) {
            Element element = (Element) it.next();
            if (element instanceof FormElement) {
                return (FormElement) element;
            }
        }
        Validate.g("No form elements matched the query '%s' in the document.", str);
        return null;
    }

    public List<FormElement> d5() {
        return b4("form").m0();
    }

    public Element f5() {
        Element h5 = h5();
        for (Element w2 = h5.w2(); w2 != null; w2 = w2.u0()) {
            if (w2.t0(C5445bv2.f701o)) {
                return w2;
            }
        }
        return h5.M3(C5445bv2.f701o);
    }

    public final Element h5() {
        for (Element w2 = w2(); w2 != null; w2 = w2.u0()) {
            if (w2.t0("html")) {
                return w2;
            }
        }
        return F1("html");
    }

    public String i5() {
        return this.n1;
    }

    public OutputSettings j5() {
        return this.k1;
    }

    public Document k5(OutputSettings outputSettings) {
        Validate.q(outputSettings);
        this.k1 = outputSettings;
        return this;
    }

    public Document l5(Parser parser) {
        this.l1 = parser;
        return this;
    }

    public Parser m5() {
        return this.l1;
    }

    public QuirksMode n5() {
        return this.m1;
    }

    public Document o5(QuirksMode quirksMode) {
        this.m1 = quirksMode;
        return this;
    }

    @Override // org.jsoup.nodes.Element
    /* renamed from: p5 */
    public Document u4() {
        Document document = new Document(A4().q(), w(), this.l1);
        Attributes attributes = this.c1;
        if (attributes != null) {
            document.c1 = attributes.clone();
        }
        document.k1 = this.k1.clone();
        return document;
    }

    public String q5() {
        Element e4 = f5().e4(o1);
        if (e4 != null) {
            return StringUtil.u(e4.F4()).trim();
        }
        return "";
    }

    public void r5(String str) {
        Validate.q(str);
        Element e4 = f5().e4(o1);
        if (e4 == null) {
            e4 = f5().F1("title");
        }
        e4.G4(str);
    }

    @Override // org.jsoup.nodes.Element, org.jsoup.nodes.Node
    public String w0() {
        return "#document";
    }

    public Document(String str, String str2, Parser parser) {
        super(new Tag("#root", str), str2);
        this.k1 = new OutputSettings();
        this.m1 = QuirksMode.noQuirks;
        this.n1 = str2;
        this.l1 = parser;
    }

    public Document(String str) {
        this(Parser.b1, str);
    }
}
