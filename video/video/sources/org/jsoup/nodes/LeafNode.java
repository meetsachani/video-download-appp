package org.jsoup.nodes;

import java.util.List;
import org.jsoup.helper.Validate;
import org.jsoup.internal.QuietAppendable;
import org.jsoup.nodes.Document;

/* loaded from: classes4.dex */
public abstract class LeafNode extends Node {
    public Object a1;

    public LeafNode() {
        this.a1 = "";
    }

    @Override // org.jsoup.nodes.Node
    public int G() {
        return 0;
    }

    @Override // org.jsoup.nodes.Node
    public void L0(QuietAppendable quietAppendable, Document.OutputSettings outputSettings) {
    }

    @Override // org.jsoup.nodes.Node
    public void U(String str) {
    }

    @Override // org.jsoup.nodes.Node
    public Node V() {
        return this;
    }

    @Override // org.jsoup.nodes.Node
    public List<Node> X() {
        return Node.Z;
    }

    @Override // org.jsoup.nodes.Node
    public Node Y0(String str) {
        v1();
        return super.Y0(str);
    }

    @Override // org.jsoup.nodes.Node
    public String d(String str) {
        v1();
        return super.d(str);
    }

    @Override // org.jsoup.nodes.Node
    public boolean j0(String str) {
        v1();
        return super.j0(str);
    }

    @Override // org.jsoup.nodes.Node
    public String k(String str) {
        if (!k0()) {
            if (w0().equals(str)) {
                return (String) this.a1;
            }
            return "";
        }
        return super.k(str);
    }

    @Override // org.jsoup.nodes.Node
    public final boolean k0() {
        return this.a1 instanceof Attributes;
    }

    @Override // org.jsoup.nodes.Node
    public Node l(String str, String str2) {
        if (!k0() && str.equals(w0())) {
            this.a1 = str2;
            return this;
        }
        v1();
        super.l(str, str2);
        return this;
    }

    @Override // org.jsoup.nodes.Node
    public final Attributes p() {
        v1();
        return (Attributes) this.a1;
    }

    public String r1() {
        return k(w0());
    }

    public void s1(String str) {
        l(w0(), str);
    }

    @Override // org.jsoup.nodes.Node
    /* renamed from: u1 */
    public LeafNode Q(Node node) {
        LeafNode leafNode = (LeafNode) super.Q(node);
        if (k0()) {
            leafNode.a1 = ((Attributes) this.a1).clone();
        }
        return leafNode;
    }

    public final void v1() {
        if (!k0()) {
            Attributes attributes = new Attributes();
            this.a1 = attributes;
            attributes.h0(w0(), (String) this.a1);
        }
    }

    @Override // org.jsoup.nodes.Node
    public String w() {
        Element element = this.X;
        if (element != null) {
            return element.w();
        }
        return "";
    }

    @Override // org.jsoup.nodes.Node
    /* renamed from: w1 */
    public Element O0() {
        return this.X;
    }

    @Override // org.jsoup.nodes.Node
    public String z0() {
        return r1();
    }

    public LeafNode(String str) {
        Validate.q(str);
        this.a1 = str;
    }
}
