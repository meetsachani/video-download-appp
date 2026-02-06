package org.jsoup.nodes;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.function.Consumer;
import java.util.stream.Stream;
import org.jsoup.helper.Validate;
import org.jsoup.internal.QuietAppendable;
import org.jsoup.internal.StringUtil;
import org.jsoup.nodes.Document;
import org.jsoup.parser.ParseSettings;
import org.jsoup.select.NodeFilter;
import org.jsoup.select.NodeVisitor;

/* loaded from: classes4.dex */
public abstract class Node implements Cloneable {
    public static final String Y0 = "";
    public static final List<Node> Z = Collections.EMPTY_LIST;
    public static final /* synthetic */ boolean Z0 = false;
    public Element X;
    public int Y;

    public static Element h0(Element element) {
        Element w2 = element.w2();
        while (true) {
            Element element2 = w2;
            Element element3 = element;
            element = element2;
            if (element != null) {
                w2 = element.w2();
            } else {
                return element3;
            }
        }
    }

    public Node B(String str) {
        h(k1(), str);
        return this;
    }

    public String C0() {
        return w0();
    }

    public Node D(Node node) {
        Validate.q(node);
        Validate.q(this.X);
        if (node.X == this.X) {
            node.X0();
        }
        this.X.e(k1(), node);
        return this;
    }

    public Node F(int i) {
        return X().get(i);
    }

    public String F0() {
        StringBuilder e = StringUtil.e();
        J0(QuietAppendable.d(e));
        return StringUtil.x(e);
    }

    public abstract int G();

    public List<Node> H() {
        if (G() == 0) {
            return Z;
        }
        List<Node> X = X();
        ArrayList arrayList = new ArrayList(X.size());
        arrayList.addAll(X);
        return Collections.unmodifiableList(arrayList);
    }

    public void I0(Appendable appendable) {
        J0(QuietAppendable.d(appendable));
    }

    public Node[] J() {
        return (Node[]) X().toArray(new Node[0]);
    }

    public void J0(QuietAppendable quietAppendable) {
        Printer.i(this, quietAppendable).c(this);
    }

    public List<Node> K() {
        List<Node> X = X();
        ArrayList arrayList = new ArrayList(X.size());
        for (Node node : X) {
            arrayList.add(node.clone());
        }
        return arrayList;
    }

    public abstract void K0(QuietAppendable quietAppendable, Document.OutputSettings outputSettings);

    public Node L() {
        if (k0()) {
            Iterator<Attribute> it = p().iterator();
            while (it.hasNext()) {
                it.next();
                it.remove();
            }
        }
        return this;
    }

    public abstract void L0(QuietAppendable quietAppendable, Document.OutputSettings outputSettings);

    @Override // 
    /* renamed from: M */
    public Node clone() {
        Node Q = Q(null);
        LinkedList linkedList = new LinkedList();
        linkedList.add(Q);
        while (!linkedList.isEmpty()) {
            Node node = (Node) linkedList.remove();
            int G = node.G();
            for (int i = 0; i < G; i++) {
                List<Node> X = node.X();
                Node Q2 = X.get(i).Q(node);
                X.set(i, Q2);
                linkedList.add(Q2);
            }
        }
        return Q;
    }

    public Document N0() {
        for (Node node = this; node != null; node = node.X) {
            if (node instanceof Document) {
                return (Document) node;
            }
        }
        return null;
    }

    public Node O0() {
        return this.X;
    }

    public Element P0() {
        return this.X;
    }

    public Node Q(Node node) {
        int k1;
        Document N0;
        try {
            Node node2 = (Node) super.clone();
            node2.X = (Element) node;
            if (node == null) {
                k1 = 0;
            } else {
                k1 = k1();
            }
            node2.Y = k1;
            if (node == null && !(this instanceof Document) && (N0 = N0()) != null) {
                Document u4 = N0.u4();
                node2.X = u4;
                u4.X().add(node2);
            }
            return node2;
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }
    }

    public boolean Q0(String str, String str2) {
        Element element = this.X;
        if (element != null && element != null && this.X.m2(str, str2)) {
            return true;
        }
        return false;
    }

    public boolean R0(String str) {
        Element element = this.X;
        if (element != null && element.C0().equals(str)) {
            return true;
        }
        return false;
    }

    public final Node S0() {
        return this.X;
    }

    public Element T0() {
        Node node = this;
        do {
            node = node.V0();
            if (node == null) {
                return null;
            }
        } while (!(node instanceof Element));
        return (Element) node;
    }

    public abstract void U(String str);

    public abstract Node V();

    public Node V0() {
        if (this.X == null || k1() <= 0) {
            return null;
        }
        return this.X.X().get(this.Y - 1);
    }

    public abstract List<Node> X();

    public void X0() {
        Element element = this.X;
        if (element != null) {
            element.a1(this);
        }
    }

    public Node Y(NodeFilter nodeFilter) {
        Validate.q(nodeFilter);
        nodeFilter.c(this);
        return this;
    }

    public Node Y0(String str) {
        Validate.q(str);
        if (k0()) {
            p().p0(str);
        }
        return this;
    }

    public void a1(Node node) {
        boolean z;
        if (node.X == this) {
            z = true;
        } else {
            z = false;
        }
        Validate.j(z);
        Element element = (Element) this;
        if (element.b3()) {
            X().remove(node.Y);
        } else {
            X().remove(node);
        }
        element.l3();
        node.X = null;
    }

    public Node b0() {
        if (G() == 0) {
            return null;
        }
        return X().get(0);
    }

    public void b1(Node node) {
        node.g1(this);
    }

    public void c1(Node node, Node node2) {
        boolean z;
        if (node.X == this) {
            z = true;
        } else {
            z = false;
        }
        Validate.j(z);
        Validate.q(node2);
        if (node == node2) {
            return;
        }
        Element element = node2.X;
        if (element != null) {
            element.a1(node2);
        }
        int k1 = node.k1();
        X().set(k1, node2);
        node2.X = (Element) this;
        node2.i1(k1);
        node.X = null;
    }

    public String d(String str) {
        Validate.n(str);
        if (k0() && p().M(str)) {
            return StringUtil.z(w(), p().G(str));
        }
        return "";
    }

    public Node d0() {
        Element element = this.X;
        if (element != null) {
            return element.b0();
        }
        return this;
    }

    public void d1(Node node) {
        Validate.q(node);
        if (this.X == null) {
            this.X = node.X;
        }
        Validate.q(this.X);
        this.X.c1(this, node);
    }

    public void e(int i, Node... nodeArr) {
        Validate.q(nodeArr);
        if (nodeArr.length == 0) {
            return;
        }
        List<Node> X = X();
        Node O0 = nodeArr[0].O0();
        if (O0 != null && O0.G() == nodeArr.length) {
            List<Node> X2 = O0.X();
            int length = nodeArr.length;
            while (true) {
                int i2 = length - 1;
                if (length > 0) {
                    if (nodeArr[i2] != X2.get(i2)) {
                        break;
                    }
                    length = i2;
                } else {
                    O0.V();
                    X.addAll(i, Arrays.asList(nodeArr));
                    int length2 = nodeArr.length;
                    while (true) {
                        int i3 = length2 - 1;
                        if (length2 > 0) {
                            nodeArr[i3].X = (Element) this;
                            length2 = i3;
                        } else {
                            ((Element) this).l3();
                            return;
                        }
                    }
                }
            }
        }
        Validate.l(nodeArr);
        for (Node node : nodeArr) {
            b1(node);
        }
        X.addAll(i, Arrays.asList(nodeArr));
        ((Element) this).l3();
    }

    public Node e1() {
        Element element = this;
        while (true) {
            Element element2 = element.X;
            if (element2 != null) {
                element = element2;
            } else {
                return element;
            }
        }
    }

    public boolean equals(Object obj) {
        return this == obj;
    }

    public void f(Node... nodeArr) {
        List<Node> X = X();
        for (Node node : nodeArr) {
            b1(node);
            X.add(node);
            node.i1(X.size() - 1);
        }
    }

    public Node f0(Consumer<? super Node> consumer) {
        Validate.q(consumer);
        x0().forEach(consumer);
        return this;
    }

    public void f1(String str) {
        Validate.q(str);
        U(str);
    }

    public void g1(Node node) {
        Validate.q(node);
        Element element = this.X;
        if (element != null) {
            element.a1(this);
        }
        this.X = (Element) node;
    }

    public final void h(int i, String str) {
        Element element;
        Validate.q(str);
        Validate.q(this.X);
        if (this.X != null) {
            element = this.X;
        } else {
            element = null;
        }
        this.X.e(i, (Node[]) NodeUtils.b(this).o(str, element, w()).toArray(new Node[0]));
    }

    public int hashCode() {
        return super.hashCode();
    }

    public Node i(String str) {
        h(k1() + 1, str);
        return this;
    }

    public void i1(int i) {
        this.Y = i;
    }

    public Node j(Node node) {
        Validate.q(node);
        Validate.q(this.X);
        if (node.X == this.X) {
            node.X0();
        }
        this.X.e(k1() + 1, node);
        return this;
    }

    public boolean j0(String str) {
        Validate.q(str);
        if (!k0()) {
            return false;
        }
        if (str.startsWith("abs:")) {
            String substring = str.substring(4);
            if (p().M(substring) && !d(substring).isEmpty()) {
                return true;
            }
        }
        return p().M(str);
    }

    public Node j1() {
        return Q(null);
    }

    public String k(String str) {
        Validate.q(str);
        if (!k0()) {
            return "";
        }
        String G = p().G(str);
        if (G.length() > 0) {
            return G;
        }
        if (!str.startsWith("abs:")) {
            return "";
        }
        return d(str.substring(4));
    }

    public abstract boolean k0();

    public int k1() {
        Element element = this.X;
        if (element != null && !element.b1.X) {
            element.T3();
        }
        return this.Y;
    }

    public Node l(String str, String str2) {
        ParseSettings parseSettings;
        Document N0 = N0();
        if (N0 != null) {
            parseSettings = N0.m5().u();
        } else {
            parseSettings = ParseSettings.c;
        }
        p().l0(parseSettings.b(str), str2);
        return this;
    }

    public boolean l0() {
        if (this.X != null) {
            return true;
        }
        return false;
    }

    public List<Node> l1() {
        Element element = this.X;
        if (element == null) {
            return Collections.EMPTY_LIST;
        }
        List<Node> X = element.X();
        ArrayList arrayList = new ArrayList(X.size() - 1);
        for (Node node : X) {
            if (node != this) {
                arrayList.add(node);
            }
        }
        return arrayList;
    }

    public boolean m0(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            return F0().equals(((Node) obj).F0());
        }
        return false;
    }

    public <T extends Appendable> T n0(T t) {
        I0(t);
        return t;
    }

    public Range n1() {
        return Range.f(this, true);
    }

    public Node o1(NodeVisitor nodeVisitor) {
        Validate.q(nodeVisitor);
        nodeVisitor.c(this);
        return this;
    }

    public abstract Attributes p();

    @Deprecated
    public void p0(Appendable appendable, int i, Document.OutputSettings outputSettings) throws IOException {
        appendable.append('\n').append(StringUtil.w(i * outputSettings.h(), outputSettings.j()));
    }

    public Node p1() {
        Validate.q(this.X);
        Node b0 = b0();
        this.X.e(k1(), J());
        X0();
        return b0;
    }

    public Node q1(String str) {
        Element element;
        Validate.n(str);
        Element element2 = this.X;
        if (element2 != null && element2 != null) {
            element = this.X;
        } else if (this instanceof Element) {
            element = (Element) this;
        } else {
            element = null;
        }
        List<Node> o2 = NodeUtils.b(this).o(str, element, w());
        Node node = o2.get(0);
        if (node instanceof Element) {
            Element element3 = (Element) node;
            Element h0 = h0(element3);
            Element element4 = this.X;
            if (element4 != null) {
                element4.c1(this, element3);
            }
            h0.f(this);
            if (o2.size() > 0) {
                for (int i = 0; i < o2.size(); i++) {
                    Node node2 = o2.get(i);
                    if (element3 != node2) {
                        Element element5 = node2.X;
                        if (element5 != null) {
                            element5.a1(node2);
                        }
                        element3.j(node2);
                    }
                }
            }
        }
        return this;
    }

    public int r() {
        if (k0()) {
            return p().size();
        }
        return 0;
    }

    public Node r0() {
        int G = G();
        if (G == 0) {
            return null;
        }
        return X().get(G - 1);
    }

    public Node s0() {
        Element element = this.X;
        if (element != null) {
            return element.r0();
        }
        return this;
    }

    public boolean t0(String str) {
        return C0().equals(str);
    }

    public String toString() {
        return F0();
    }

    public Element u0() {
        Node node = this;
        do {
            node = node.v0();
            if (node == null) {
                return null;
            }
        } while (!(node instanceof Element));
        return (Element) node;
    }

    public Node v0() {
        Element element = this.X;
        if (element == null) {
            return null;
        }
        List<Node> X = element.X();
        int k1 = k1() + 1;
        if (X.size() <= k1) {
            return null;
        }
        return X.get(k1);
    }

    public abstract String w();

    public abstract String w0();

    public Stream<Node> x0() {
        return NodeUtils.e(this, Node.class);
    }

    public <T extends Node> Stream<T> y0(Class<T> cls) {
        return NodeUtils.e(this, cls);
    }

    public String z0() {
        return "";
    }
}
