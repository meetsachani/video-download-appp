package org.jsoup.safety;

import java.util.Iterator;
import o.C9642t32;
import org.jsoup.helper.Validate;
import org.jsoup.internal.SharedConstants;
import org.jsoup.nodes.Attribute;
import org.jsoup.nodes.Attributes;
import org.jsoup.nodes.DataNode;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.Node;
import org.jsoup.nodes.TextNode;
import org.jsoup.parser.ParseErrorList;
import org.jsoup.parser.Parser;
import org.jsoup.select.NodeVisitor;

/* loaded from: classes4.dex */
public class Cleaner {
    public final Safelist a;

    /* loaded from: classes4.dex */
    public final class CleaningVisitor implements NodeVisitor {
        public int X;
        public final Element Y;
        public Element Z;

        @Override // org.jsoup.select.NodeVisitor
        public void b(Node node, int i) {
            if ((node instanceof Element) && Cleaner.this.a.i(node.C0())) {
                this.Z = this.Z.O0();
            }
        }

        @Override // org.jsoup.select.NodeVisitor
        public void d(Node node, int i) {
            if (node instanceof Element) {
                Element element = (Element) node;
                if (Cleaner.this.a.i(element.C0())) {
                    ElementMeta e = Cleaner.this.e(element);
                    Element element2 = e.a;
                    this.Z.B1(element2);
                    this.X += e.b;
                    this.Z = element2;
                } else if (node != this.Y) {
                    this.X++;
                }
            } else if (node instanceof TextNode) {
                this.Z.B1(new TextNode(((TextNode) node).A1()));
            } else if ((node instanceof DataNode) && Cleaner.this.a.i(node.O0().C0())) {
                this.Z.B1(new DataNode(((DataNode) node).z1()));
            } else {
                this.X++;
            }
        }

        public CleaningVisitor(Element element, Element element2) {
            this.X = 0;
            this.Y = element;
            this.Z = element2;
        }
    }

    /* loaded from: classes4.dex */
    public static class ElementMeta {
        public Element a;
        public int b;

        public ElementMeta(Element element, int i) {
            this.a = element;
            this.b = i;
        }
    }

    public Cleaner(Safelist safelist) {
        Validate.q(safelist);
        this.a = safelist;
    }

    public Document c(Document document) {
        Validate.q(document);
        Document Y4 = Document.Y4(document.w());
        d(document.R4(), Y4.R4());
        Y4.k5(document.j5().clone());
        return Y4;
    }

    public final int d(Element element, Element element2) {
        CleaningVisitor cleaningVisitor = new CleaningVisitor(element, element2);
        cleaningVisitor.c(element);
        return cleaningVisitor.X;
    }

    public final ElementMeta e(Element element) {
        Element j1 = element.j1();
        String B4 = element.B4();
        Attributes p = j1.p();
        j1.L();
        Iterator<Attribute> it = element.p().iterator();
        int i = 0;
        while (it.hasNext()) {
            Attribute next = it.next();
            if (this.a.h(B4, element, next)) {
                p.k0(next);
            } else {
                i++;
            }
        }
        Attributes g = this.a.g(B4);
        if (element.t0("a") && g.F("rel").equals("nofollow")) {
            String d = element.d(C9642t32.j);
            String w = element.w();
            if (!d.isEmpty() && !w.isEmpty() && d.startsWith(w)) {
                g.n0("rel");
            }
        }
        p.h(g);
        j1.p().h(p);
        return new ElementMeta(j1, i);
    }

    public boolean f(Document document) {
        Validate.q(document);
        if (d(document.R4(), Document.Y4(document.w()).R4()) == 0 && document.f5().H().isEmpty()) {
            return true;
        }
        return false;
    }

    public boolean g(String str) {
        String str2;
        if (this.a.m()) {
            str2 = SharedConstants.h;
        } else {
            str2 = "";
        }
        Document Y4 = Document.Y4(str2);
        Document Y42 = Document.Y4(str2);
        ParseErrorList h = ParseErrorList.h(1);
        Y42.R4().j3(0, Parser.m(str, Y42.R4(), str2, h));
        if (d(Y42.R4(), Y4.R4()) == 0 && h.isEmpty()) {
            return true;
        }
        return false;
    }
}
