package org.jsoup.nodes;

import org.jsoup.internal.QuietAppendable;
import org.jsoup.internal.StringUtil;
import org.jsoup.nodes.Document;
import org.jsoup.parser.Tag;
import org.jsoup.select.NodeVisitor;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes4.dex */
public class Printer implements NodeVisitor {
    public final Node X;
    public final QuietAppendable Y;
    public final Document.OutputSettings Z;

    /* loaded from: classes4.dex */
    public static class Outline extends Pretty {
        public Outline(Node node, QuietAppendable quietAppendable, Document.OutputSettings outputSettings) {
            super(node, quietAppendable, outputSettings);
        }

        @Override // org.jsoup.nodes.Printer.Pretty
        public boolean m(Node node) {
            return node != null;
        }

        @Override // org.jsoup.nodes.Printer.Pretty
        public boolean p(Node node) {
            if (node == null || node == this.X || this.Y0 || Pretty.l(node)) {
                return false;
            }
            if ((node instanceof TextNode) && node.V0() == null && node.v0() == null) {
                return false;
            }
            return true;
        }
    }

    /* loaded from: classes4.dex */
    public static class Pretty extends Printer {
        public static final int Z0 = 5;
        public boolean Y0;

        public Pretty(Node node, QuietAppendable quietAppendable, Document.OutputSettings outputSettings) {
            super(node, quietAppendable, outputSettings);
            this.Y0 = false;
            while (node != null) {
                if (q(Tag.f1, node)) {
                    this.Y0 = true;
                    return;
                }
                node = node.S0();
            }
        }

        public static boolean j(Element element) {
            Element w2 = element.w2();
            for (int i = 0; i < 5 && w2 != null; i++) {
                if (!w2.r3() && w2.a1.k()) {
                    w2 = w2.u0();
                } else {
                    return true;
                }
            }
            return false;
        }

        public static boolean k(Element element) {
            Node b0 = element.b0();
            for (int i = 0; i < 5 && b0 != null; i++) {
                if (!(b0 instanceof TextNode)) {
                    return true;
                }
                b0 = b0.v0();
            }
            return false;
        }

        public static boolean l(Node node) {
            if ((node instanceof TextNode) && ((TextNode) node).B1()) {
                return true;
            }
            return false;
        }

        public static Node n(Node node) {
            while (l(node)) {
                node = node.v0();
            }
            return node;
        }

        public static Node o(Node node) {
            Node V0 = node.V0();
            while (l(V0)) {
                V0 = V0.V0();
            }
            return V0;
        }

        public static boolean q(int i, Node node) {
            if ((node instanceof Element) && ((Element) node).a1.f(i)) {
                return true;
            }
            return false;
        }

        @Override // org.jsoup.nodes.Printer
        public void a(Element element, int i) {
            if (p(element)) {
                h(i);
            }
            super.a(element, i);
            if (q(Tag.f1, element)) {
                this.Y0 = true;
            }
        }

        @Override // org.jsoup.nodes.Printer
        public void e(LeafNode leafNode, int i) {
            if (p(leafNode)) {
                h(i);
            }
            super.e(leafNode, i);
        }

        @Override // org.jsoup.nodes.Printer
        public void f(Element element, int i) {
            if (p(n(element.b0()))) {
                h(i);
            }
            super.f(element, i);
            if (this.Y0 && element.a1.f(Tag.f1)) {
                do {
                    element = element.O0();
                    if (element == null) {
                        this.Y0 = false;
                        return;
                    }
                } while (!element.A4().u());
            }
        }

        @Override // org.jsoup.nodes.Printer
        public void g(TextNode textNode, int i, int i2) {
            if (!this.Y0) {
                i = r(textNode, i | 4);
                if (!textNode.B1() && m(textNode.X) && p(textNode)) {
                    h(i2);
                }
            }
            super.g(textNode, i, i2);
        }

        public boolean m(Node node) {
            if (node == null || !(node instanceof Element)) {
                return false;
            }
            Element element = (Element) node;
            if (!element.r3()) {
                if (element.a1.k() || (!(element.X instanceof Document) && !j(element))) {
                    return false;
                }
                return true;
            }
            return true;
        }

        public boolean p(Node node) {
            if (node != null && node != this.X && !this.Y0 && !l(node)) {
                if (m(node)) {
                    return true;
                }
                Node o2 = o(node);
                if (m(o2)) {
                    return true;
                }
                Element element = node.X;
                if (m(element) && !element.A4().f(Tag.c1) && k(element)) {
                    if (o2 != null && ((o2 instanceof TextNode) || (!m(o2) && (o2 instanceof Element)))) {
                        return false;
                    }
                    return true;
                }
            }
            return false;
        }

        public int r(TextNode textNode, int i) {
            if (!m(textNode.X)) {
                return i;
            }
            Node V0 = textNode.V0();
            Node v0 = textNode.v0();
            if ((!(V0 instanceof Element) || m(V0)) && (V0 == null || (!(V0 instanceof TextNode) && p(V0)))) {
                i |= 8;
            }
            if (v0 != null && ((v0 instanceof TextNode) || !p(v0))) {
                Node n = n(v0);
                if ((n instanceof TextNode) && StringUtil.p(n.z0().codePointAt(0))) {
                    return i | 16;
                }
                return i;
            }
            return i | 16;
        }
    }

    public Printer(Node node, QuietAppendable quietAppendable, Document.OutputSettings outputSettings) {
        this.X = node;
        this.Y = quietAppendable;
        this.Z = outputSettings;
    }

    public static Printer i(Node node, QuietAppendable quietAppendable) {
        Document.OutputSettings a = NodeUtils.a(node);
        if (a.m()) {
            return new Outline(node, quietAppendable, a);
        }
        if (a.o()) {
            return new Pretty(node, quietAppendable, a);
        }
        return new Printer(node, quietAppendable, a);
    }

    public void a(Element element, int i) {
        element.K0(this.Y, this.Z);
    }

    @Override // org.jsoup.select.NodeVisitor
    public void b(Node node, int i) {
        if (node instanceof Element) {
            f((Element) node, i);
        }
    }

    @Override // org.jsoup.select.NodeVisitor
    public void d(Node node, int i) {
        if (node.getClass() == TextNode.class) {
            g((TextNode) node, 0, i);
        } else if (node instanceof Element) {
            a((Element) node, i);
        } else {
            e((LeafNode) node, i);
        }
    }

    public void e(LeafNode leafNode, int i) {
        leafNode.K0(this.Y, this.Z);
    }

    public void f(Element element, int i) {
        element.L0(this.Y, this.Z);
    }

    public void g(TextNode textNode, int i, int i2) {
        Entities.n(this.Y, textNode.r1(), this.Z, i | 1);
    }

    public void h(int i) {
        this.Y.a('\n').b(StringUtil.w(i * this.Z.h(), this.Z.j()));
    }
}
