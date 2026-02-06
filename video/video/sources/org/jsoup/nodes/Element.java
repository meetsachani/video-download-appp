package org.jsoup.nodes;

import com.facebook.applinks.c;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import o.C4500Ve2;
import o.UE;
import org.jsoup.helper.Validate;
import org.jsoup.internal.Normalizer;
import org.jsoup.internal.QuietAppendable;
import org.jsoup.internal.StringUtil;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.Node;
import org.jsoup.parser.ParseSettings;
import org.jsoup.parser.Parser;
import org.jsoup.parser.Tag;
import org.jsoup.parser.TokenQueue;
import org.jsoup.select.Collector;
import org.jsoup.select.Elements;
import org.jsoup.select.Evaluator;
import org.jsoup.select.NodeFilter;
import org.jsoup.select.NodeVisitor;
import org.jsoup.select.Nodes;
import org.jsoup.select.Selector;

/* loaded from: classes4.dex */
public class Element extends Node implements Iterable<Element> {
    public static final List<Element> d1 = Collections.EMPTY_LIST;
    public static final NodeList e1 = new NodeList(0);
    public static final Pattern f1 = Pattern.compile("\\s+");
    public static final String g1 = Attributes.b0("baseUri");
    public static final String h1 = "jsoup.childEls";
    public static final String i1 = "jsoup.childElsMod";
    public Tag a1;
    public NodeList b1;
    public Attributes c1;

    /* loaded from: classes4.dex */
    public static final class NodeList extends ArrayList<Node> {
        public boolean X;

        public NodeList(int i) {
            super(i);
            this.X = true;
        }

        public int d() {
            return ((ArrayList) this).modCount;
        }
    }

    /* loaded from: classes4.dex */
    public static class TextAccumulator implements NodeVisitor {
        public final StringBuilder X;

        public TextAccumulator(StringBuilder sb) {
            this.X = sb;
        }

        @Override // org.jsoup.select.NodeVisitor
        public void b(Node node, int i) {
            if (node instanceof Element) {
                Element element = (Element) node;
                Node v0 = node.v0();
                if (!element.a1.j()) {
                    if (((v0 instanceof TextNode) || ((v0 instanceof Element) && ((Element) v0).a1.j())) && !TextNode.E1(this.X)) {
                        this.X.append(' ');
                    }
                }
            }
        }

        @Override // org.jsoup.select.NodeVisitor
        public void d(Node node, int i) {
            if (node instanceof TextNode) {
                Element.H1(this.X, (TextNode) node);
            } else if (node instanceof Element) {
                Element element = (Element) node;
                if (this.X.length() > 0) {
                    if ((element.r3() || element.t0("br")) && !TextNode.E1(this.X)) {
                        this.X.append(' ');
                    }
                }
            }
        }
    }

    public Element(String str, String str2) {
        this(Tag.z(str, str2, ParseSettings.d), (String) null);
    }

    public static void H1(StringBuilder sb, TextNode textNode) {
        String A1 = textNode.A1();
        if (!R3(textNode.X) && !(textNode instanceof CDataNode)) {
            StringUtil.d(sb, A1, TextNode.E1(sb));
        } else {
            sb.append(A1);
        }
    }

    public static String P4(Stream<Node> stream) {
        return (String) stream.map(new Function() { // from class: o.V90
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return Element.s1((Node) obj);
            }
        }).collect(StringUtil.t(""));
    }

    public static boolean R3(Node node) {
        if (node instanceof Element) {
            Element element = (Element) node;
            int i = 0;
            while (!element.a1.u()) {
                element = element.O0();
                i++;
                if (i < 6) {
                    if (element == null) {
                    }
                }
            }
            return true;
        }
        return false;
    }

    public static String a4(Element element, String str) {
        while (element != null) {
            Attributes attributes = element.c1;
            if (attributes != null && attributes.L(str)) {
                return element.c1.F(str);
            }
            element = element.O0();
        }
        return null;
    }

    public static <E extends Element> int i3(Element element, List<E> list) {
        int size = list.size();
        for (int i = 0; i < size; i++) {
            if (list.get(i) == element) {
                return i;
            }
        }
        return 0;
    }

    public static /* synthetic */ NodeFilter.FilterResult r1(AtomicBoolean atomicBoolean, Node node, int i) {
        if ((node instanceof TextNode) && !((TextNode) node).B1()) {
            atomicBoolean.set(true);
            return NodeFilter.FilterResult.STOP;
        }
        return NodeFilter.FilterResult.CONTINUE;
    }

    public static /* synthetic */ String s1(Node node) {
        if (node instanceof TextNode) {
            return ((TextNode) node).A1();
        }
        if (node.t0("br")) {
            return "\n";
        }
        return "";
    }

    public static /* synthetic */ void u1(StringBuilder sb, Node node, int i) {
        if (node instanceof DataNode) {
            sb.append(((DataNode) node).z1());
        } else if (node instanceof Comment) {
            sb.append(((Comment) node).A1());
        } else if (node instanceof CDataNode) {
            sb.append(((CDataNode) node).A1());
        }
    }

    public Element A1(String str) {
        Validate.q(str);
        f((Node[]) NodeUtils.b(this).o(str, this, w()).toArray(new Node[0]));
        return this;
    }

    @Override // org.jsoup.nodes.Node
    /* renamed from: A3 */
    public final Element O0() {
        return this.X;
    }

    public Tag A4() {
        return this.a1;
    }

    public Element B1(Node node) {
        Validate.q(node);
        b1(node);
        X();
        this.b1.add(node);
        node.i1(this.b1.size() - 1);
        return this;
    }

    public Element B2(String str) {
        Validate.n(str);
        return Collector.c(new Evaluator.Id(str), this);
    }

    public String B4() {
        return this.a1.e();
    }

    @Override // org.jsoup.nodes.Node
    public String C0() {
        return this.a1.s();
    }

    public Elements C2(String str) {
        Validate.n(str);
        return Collector.a(new Evaluator.Attribute(str.trim()), this);
    }

    public Element C4(String str) {
        return D4(str, this.a1.q());
    }

    public Elements D2(String str) {
        Validate.n(str);
        return Collector.a(new Evaluator.AttributeStarting(str.trim()), this);
    }

    public Element D4(String str, String str2) {
        Validate.p(str, "tagName");
        Validate.p(str2, "namespace");
        Parser b = NodeUtils.b(this);
        this.a1 = b.x().x(str, str2, b.u());
        return this;
    }

    public Element E1(Collection<? extends Node> collection) {
        j3(-1, collection);
        return this;
    }

    public Elements E2(String str, String str2) {
        return Collector.a(new Evaluator.AttributeWithValue(str, str2), this);
    }

    public Element F1(String str) {
        return G1(str, this.a1.q());
    }

    public Elements F2(String str, String str2) {
        return Collector.a(new Evaluator.AttributeWithValueContaining(str, str2), this);
    }

    public String F4() {
        StringBuilder e = StringUtil.e();
        new TextAccumulator(e).c(this);
        return StringUtil.x(e).trim();
    }

    @Override // org.jsoup.nodes.Node
    public int G() {
        return this.b1.size();
    }

    public Element G1(String str, String str2) {
        Parser b = NodeUtils.b(this);
        Element element = new Element(b.x().x(str, str2, b.u()), w());
        B1(element);
        return element;
    }

    public Element G4(String str) {
        Validate.q(str);
        V();
        if (A4().f(Tag.h1)) {
            B1(new DataNode(str));
            return this;
        }
        B1(new TextNode(str));
        return this;
    }

    public Elements H2(String str, String str2) {
        return Collector.a(new Evaluator.AttributeWithValueEnding(str, str2), this);
    }

    public List<TextNode> H4() {
        return v2(TextNode.class);
    }

    public Elements I2(String str, String str2) {
        try {
            return J2(str, Pattern.compile(str2));
        } catch (PatternSyntaxException e) {
            throw new IllegalArgumentException("Pattern syntax error: " + str2, e);
        }
    }

    public Elements I3() {
        Elements elements = new Elements();
        for (Element O0 = O0(); O0 != null && !O0.t0("#root"); O0 = O0.O0()) {
            elements.add(O0);
        }
        return elements;
    }

    public Element I4(String str) {
        Validate.q(str);
        Set<String> Y1 = Y1();
        if (Y1.contains(str)) {
            Y1.remove(str);
        } else {
            Y1.add(str);
        }
        Z1(Y1);
        return this;
    }

    public Element J1(String str) {
        Validate.q(str);
        B1(new TextNode(str));
        return this;
    }

    public Elements J2(String str, Pattern pattern) {
        return Collector.a(new Evaluator.AttributeWithValueMatching(str, pattern), this);
    }

    public Element J3(String str) {
        Validate.q(str);
        e(0, (Node[]) NodeUtils.b(this).o(str, this, w()).toArray(new Node[0]));
        return this;
    }

    @Override // org.jsoup.nodes.Node
    /* renamed from: J4 */
    public Element o1(NodeVisitor nodeVisitor) {
        return (Element) super.o1(nodeVisitor);
    }

    @Override // org.jsoup.nodes.Node
    public void K0(QuietAppendable quietAppendable, Document.OutputSettings outputSettings) {
        boolean z;
        String Z3 = Z3(outputSettings.p());
        quietAppendable.a('<').b(Z3);
        Attributes attributes = this.c1;
        if (attributes != null) {
            attributes.V(quietAppendable, outputSettings);
        }
        if (this.b1.isEmpty()) {
            if (outputSettings.p() != Document.OutputSettings.Syntax.xml && this.a1.q().equals(Parser.b1)) {
                z = false;
            } else {
                z = true;
            }
            if (z && (this.a1.f(Tag.e1) || (this.a1.k() && (this.a1.h() || this.a1.m())))) {
                quietAppendable.b(" />");
                return;
            } else if (!z && this.a1.h()) {
                quietAppendable.a('>');
                return;
            } else {
                quietAppendable.b("></").b(Z3).a('>');
                return;
            }
        }
        quietAppendable.a('>');
    }

    public Element K1(Element element) {
        Validate.q(element);
        element.B1(this);
        return this;
    }

    public Elements K2(String str, String str2) {
        return Collector.a(new Evaluator.AttributeWithValueNot(str, str2), this);
    }

    public Element K3(Node node) {
        Validate.q(node);
        e(0, node);
        return this;
    }

    public final String K4(Document document) {
        String f3;
        if (!f3().isEmpty()) {
            String str = "#" + TokenQueue.t(f3);
            if (document != null) {
                Elements b4 = document.b4(str);
                if (b4.size() != 1 || b4.get(0) != this) {
                    return "";
                }
            }
            return str;
        }
        return "";
    }

    @Override // org.jsoup.nodes.Node
    public void L0(QuietAppendable quietAppendable, Document.OutputSettings outputSettings) {
        if (!this.b1.isEmpty()) {
            quietAppendable.b("</").b(Z3(outputSettings.p())).a('>');
        }
    }

    @Override // org.jsoup.nodes.Node
    /* renamed from: L1 */
    public Element l(String str, String str2) {
        super.l(str, str2);
        return this;
    }

    public Elements L2(String str, String str2) {
        return Collector.a(new Evaluator.AttributeWithValueStarting(str, str2), this);
    }

    public Element L3(Collection<? extends Node> collection) {
        j3(0, collection);
        return this;
    }

    public String L4() {
        if (m2("textarea", Parser.b1)) {
            return F4();
        }
        return k("value");
    }

    public Element M1(String str, boolean z) {
        p().j0(str, z);
        return this;
    }

    public Elements M2(String str) {
        Validate.n(str);
        return Collector.a(new Evaluator.Class(str), this);
    }

    public Element M3(String str) {
        return N3(str, this.a1.q());
    }

    public Element M4(String str) {
        if (m2("textarea", Parser.b1)) {
            G4(str);
            return this;
        }
        l("value", str);
        return this;
    }

    public Attribute N1(String str) {
        if (k0()) {
            return p().k(str);
        }
        return null;
    }

    public Elements N2(int i) {
        return Collector.a(new Evaluator.IndexEquals(i), this);
    }

    public Element N3(String str, String str2) {
        Parser b = NodeUtils.b(this);
        Element element = new Element(b.x().x(str, str2, b.u()), w());
        K3(element);
        return element;
    }

    public String N4() {
        return P4(this.b1.stream());
    }

    public Elements O2(int i) {
        return Collector.a(new Evaluator.IndexGreaterThan(i), this);
    }

    public Element O3(String str) {
        Validate.q(str);
        K3(new TextNode(str));
        return this;
    }

    public String O4() {
        return P4(x0());
    }

    @Override // org.jsoup.nodes.Node
    /* renamed from: P1 */
    public Element B(String str) {
        return (Element) super.B(str);
    }

    public Elements P2(int i) {
        return Collector.a(new Evaluator.IndexLessThan(i), this);
    }

    @Override // org.jsoup.nodes.Node
    /* renamed from: Q1 */
    public Element D(Node node) {
        return (Element) super.D(node);
    }

    public Elements Q2(String str) {
        Validate.n(str);
        return Collector.a(new Evaluator.Tag(Normalizer.b(str)), this);
    }

    @Override // org.jsoup.nodes.Node
    /* renamed from: Q4 */
    public Element q1(String str) {
        return (Element) super.q1(str);
    }

    public List<Element> R1() {
        List<Element> list;
        Integer num;
        Attributes attributes = this.c1;
        if (attributes != null && attributes.Q()) {
            Map<String, Object> u0 = this.c1.u0();
            WeakReference weakReference = (WeakReference) u0.get(h1);
            if (weakReference != null && (list = (List) weakReference.get()) != null && (num = (Integer) u0.get(i1)) != null && num.intValue() == this.b1.d()) {
                return list;
            }
        }
        return null;
    }

    public Elements R2(String str) {
        return Collector.a(new Evaluator.ContainsOwnText(str), this);
    }

    public Element S1(int i) {
        boolean z;
        if (i >= 0) {
            z = true;
        } else {
            z = false;
        }
        Validate.k(z, "Index must be >= 0");
        List<Element> R1 = R1();
        if (R1 != null) {
            return R1.get(i);
        }
        int size = this.b1.size();
        int i2 = 0;
        for (int i3 = 0; i3 < size; i3++) {
            Node node = this.b1.get(i3);
            if (node instanceof Element) {
                int i4 = i2 + 1;
                if (i2 == i) {
                    return (Element) node;
                }
                i2 = i4;
            }
        }
        throw new IndexOutOfBoundsException("No child at index: " + i);
    }

    public Elements S2(String str) {
        return Collector.a(new Evaluator.ContainsText(str), this);
    }

    public Elements S3() {
        return w3(false);
    }

    public Elements T2(String str) {
        try {
            return U2(Pattern.compile(str));
        } catch (PatternSyntaxException e) {
            throw new IllegalArgumentException("Pattern syntax error: " + str, e);
        }
    }

    public void T3() {
        int size = this.b1.size();
        for (int i = 0; i < size; i++) {
            this.b1.get(i).i1(i);
        }
        this.b1.X = true;
    }

    @Override // org.jsoup.nodes.Node
    public void U(String str) {
        p().h0(g1, str);
    }

    public List<Element> U1() {
        List<Element> R1;
        if (G() == 0) {
            return d1;
        }
        synchronized (this.b1) {
            try {
                R1 = R1();
                if (R1 == null) {
                    R1 = v2(Element.class);
                    y4(R1);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return R1;
    }

    public Elements U2(Pattern pattern) {
        return Collector.a(new Evaluator.MatchesOwn(pattern), this);
    }

    @Override // org.jsoup.nodes.Node
    /* renamed from: U3 */
    public Element Y0(String str) {
        return (Element) super.Y0(str);
    }

    public Elements V1() {
        return new Elements(U1());
    }

    public Elements V2(String str) {
        try {
            return W2(Pattern.compile(str));
        } catch (PatternSyntaxException e) {
            throw new IllegalArgumentException("Pattern syntax error: " + str, e);
        }
    }

    public int W1() {
        if (G() == 0) {
            return 0;
        }
        return U1().size();
    }

    public Elements W2(Pattern pattern) {
        return Collector.a(new Evaluator.Matches(pattern), this);
    }

    public Element W3(String str) {
        Validate.q(str);
        Set<String> Y1 = Y1();
        Y1.remove(str);
        Z1(Y1);
        return this;
    }

    @Override // org.jsoup.nodes.Node
    public List<Node> X() {
        if (this.b1 == e1) {
            this.b1 = new NodeList(4);
        }
        return this.b1;
    }

    public String X1() {
        return k(c.f).trim();
    }

    @Override // org.jsoup.nodes.Node
    /* renamed from: X3 */
    public Element e1() {
        return (Element) super.e1();
    }

    public Set<String> Y1() {
        LinkedHashSet linkedHashSet = new LinkedHashSet(Arrays.asList(f1.split(X1())));
        linkedHashSet.remove("");
        return linkedHashSet;
    }

    public boolean Y2() {
        if (this.b1 != e1) {
            return true;
        }
        return false;
    }

    public Element Z1(Set<String> set) {
        Validate.q(set);
        if (set.isEmpty()) {
            p().n0(c.f);
            return this;
        }
        p().h0(c.f, StringUtil.q(set, C4500Ve2.b));
        return this;
    }

    public boolean Z2(String str) {
        String str2;
        Attributes attributes = this.c1;
        if (attributes == null) {
            return false;
        }
        String G = attributes.G(c.f);
        int length = G.length();
        int length2 = str.length();
        if (length != 0 && length >= length2) {
            if (length == length2) {
                return str.equalsIgnoreCase(G);
            }
            int i = 0;
            boolean z = false;
            int i2 = 0;
            while (i < length) {
                if (Character.isWhitespace(G.charAt(i))) {
                    if (z) {
                        if (i - i2 == length2) {
                            str2 = str;
                            if (G.regionMatches(true, i2, str2, 0, length2)) {
                                return true;
                            }
                        } else {
                            str2 = str;
                        }
                        z = false;
                    } else {
                        str2 = str;
                    }
                } else {
                    str2 = str;
                    if (!z) {
                        i2 = i;
                        z = true;
                    }
                }
                i++;
                str = str2;
            }
            String str3 = str;
            if (z && length - i2 == length2) {
                return G.regionMatches(true, i2, str3, 0, length2);
            }
        }
        return false;
    }

    public final String Z3(Document.OutputSettings.Syntax syntax) {
        if (syntax == Document.OutputSettings.Syntax.xml) {
            return Normalizer.d(B4());
        }
        return B4();
    }

    @Override // org.jsoup.nodes.Node
    /* renamed from: a2 */
    public Element L() {
        if (this.c1 != null) {
            super.L();
            if (this.c1.X == 0) {
                this.c1 = null;
            }
        }
        return this;
    }

    public boolean a3() {
        final AtomicBoolean atomicBoolean = new AtomicBoolean(false);
        Y(new NodeFilter() { // from class: o.W90
            @Override // org.jsoup.select.NodeFilter
            public final NodeFilter.FilterResult d(Node node, int i) {
                return Element.r1(atomicBoolean, node, i);
            }
        });
        return atomicBoolean.get();
    }

    @Override // org.jsoup.nodes.Node
    /* renamed from: b2 */
    public Element clone() {
        return (Element) super.clone();
    }

    public boolean b3() {
        return this.b1.X;
    }

    public Elements b4(String str) {
        return Selector.e(str, this);
    }

    public Element c2(String str) {
        return d2(Selector.b(str));
    }

    public String c3() {
        StringBuilder e = StringUtil.e();
        n0(e);
        String x = StringUtil.x(e);
        if (NodeUtils.a(this).o()) {
            return x.trim();
        }
        return x;
    }

    public Elements c4(Evaluator evaluator) {
        return Selector.f(evaluator, this);
    }

    public Element d2(Evaluator evaluator) {
        Validate.q(evaluator);
        Element e12 = e1();
        Element element = this;
        while (!evaluator.f(e12, element)) {
            element = element.O0();
            if (element == null) {
                return null;
            }
        }
        return element;
    }

    public Element d4(String str) {
        return Selector.h(str, this);
    }

    public String e2() {
        Document N0 = N0();
        String K4 = K4(N0);
        if (!K4.isEmpty()) {
            return K4;
        }
        StringBuilder e = StringUtil.e();
        Element element = this;
        while (true) {
            if (element == null || (element instanceof Document)) {
                break;
            }
            String K42 = element.K4(N0);
            if (!K42.isEmpty()) {
                e.insert(0, K42);
                break;
            }
            e.insert(0, element.f2());
            element = element.O0();
        }
        return StringUtil.x(e);
    }

    public Element e3(String str) {
        V();
        A1(str);
        return this;
    }

    public Element e4(Evaluator evaluator) {
        return Collector.c(evaluator, this);
    }

    public final String f2() {
        String replace = TokenQueue.t(B4()).replace("\\:", "|");
        StringBuilder e = StringUtil.e();
        e.append(replace);
        String str = (String) Y1().stream().map(new Function() { // from class: o.X90
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return TokenQueue.t((String) obj);
            }
        }).collect(StringUtil.t(UE.h));
        if (!str.isEmpty()) {
            e.append('.');
            e.append(str);
        }
        if (O0() != null && !(O0() instanceof Document)) {
            e.insert(0, " > ");
            if (O0().b4(e.toString()).size() > 1) {
                e.append(String.format(":nth-child(%d)", Integer.valueOf(o2() + 1)));
            }
            return StringUtil.x(e);
        }
        return StringUtil.x(e);
    }

    public String f3() {
        Attributes attributes = this.c1;
        if (attributes != null) {
            return attributes.G("id");
        }
        return "";
    }

    public <T extends Node> T f4(String str, Class<T> cls) {
        return (T) g4(Selector.b(str), cls);
    }

    @Override // java.lang.Iterable
    public void forEach(Consumer<? super Element> consumer) {
        stream().forEach(consumer);
    }

    public String g2() {
        final StringBuilder e = StringUtil.e();
        o1(new NodeVisitor() { // from class: o.U90
            @Override // org.jsoup.select.NodeVisitor
            public final void d(Node node, int i) {
                Element.u1(e, node, i);
            }
        });
        return StringUtil.x(e);
    }

    public <T extends Node> T g4(Evaluator evaluator, Class<T> cls) {
        return (T) Collector.d(evaluator, this, cls);
    }

    public List<DataNode> h2() {
        return v2(DataNode.class);
    }

    public Element h3(String str) {
        Validate.q(str);
        l("id", str);
        return this;
    }

    @Override // java.lang.Iterable
    public Iterator<Element> iterator() {
        return new NodeIterator(this, Element.class);
    }

    public Map<String, String> j2() {
        return p().B();
    }

    public Element j3(int i, Collection<? extends Node> collection) {
        boolean z;
        Validate.r(collection, "Children collection to be inserted must not be null.");
        int G = G();
        if (i < 0) {
            i += G + 1;
        }
        if (i >= 0 && i <= G) {
            z = true;
        } else {
            z = false;
        }
        Validate.k(z, "Insert position out of bounds.");
        e(i, (Node[]) collection.toArray(new Node[0]));
        return this;
    }

    public Nodes<Node> j4(String str) {
        return k4(str, Node.class);
    }

    @Override // org.jsoup.nodes.Node
    public boolean k0() {
        if (this.c1 != null) {
            return true;
        }
        return false;
    }

    @Override // org.jsoup.nodes.Node
    /* renamed from: k2 */
    public Element Q(Node node) {
        Element element = (Element) super.Q(node);
        NodeList nodeList = new NodeList(this.b1.size());
        element.b1 = nodeList;
        nodeList.addAll(this.b1);
        Attributes attributes = this.c1;
        if (attributes != null) {
            Attributes clone = attributes.clone();
            element.c1 = clone;
            clone.v0(h1, null);
        }
        return element;
    }

    public Element k3(int i, Node... nodeArr) {
        boolean z;
        Validate.r(nodeArr, "Children collection to be inserted must not be null.");
        int G = G();
        if (i < 0) {
            i += G + 1;
        }
        if (i >= 0 && i <= G) {
            z = true;
        } else {
            z = false;
        }
        Validate.k(z, "Insert position out of bounds.");
        e(i, nodeArr);
        return this;
    }

    public <T extends Node> Nodes<T> k4(String str, Class<T> cls) {
        Validate.n(str);
        return o4(Selector.b(str), cls);
    }

    public void l3() {
        this.b1.X = false;
    }

    public boolean m2(String str, String str2) {
        if (this.a1.s().equals(str) && this.a1.q().equals(str2)) {
            return true;
        }
        return false;
    }

    public Nodes<Node> m4(Evaluator evaluator) {
        return o4(evaluator, Node.class);
    }

    @Override // org.jsoup.nodes.Node
    public <T extends Appendable> T n0(T t) {
        Node b0 = b0();
        if (b0 != null) {
            Printer i = Printer.i(b0, QuietAppendable.d(t));
            while (b0 != null) {
                i.c(b0);
                b0 = b0.v0();
            }
        }
        return t;
    }

    public boolean n3(String str) {
        return p3(Selector.b(str));
    }

    public int o2() {
        if (O0() == null) {
            return 0;
        }
        return i3(this, O0().U1());
    }

    public <T extends Node> Nodes<T> o4(Evaluator evaluator, Class<T> cls) {
        Validate.q(evaluator);
        return Collector.b(evaluator, this, cls);
    }

    @Override // org.jsoup.nodes.Node
    public Attributes p() {
        if (this.c1 == null) {
            this.c1 = new Attributes();
        }
        return this.c1;
    }

    @Override // org.jsoup.nodes.Node
    /* renamed from: p2 */
    public Element V() {
        int size = this.b1.size();
        for (int i = 0; i < size; i++) {
            this.b1.get(i).X = null;
        }
        this.b1.clear();
        return this;
    }

    public boolean p3(Evaluator evaluator) {
        return evaluator.f(e1(), this);
    }

    public Stream<Element> p4(String str) {
        return Selector.i(str, this);
    }

    public Range q2() {
        return Range.f(this, false);
    }

    public Stream<Element> q4(Evaluator evaluator) {
        return Selector.j(evaluator, this);
    }

    public Element r2(String str) {
        String str2;
        Element h = Selector.h(str, this);
        if (O0() != null) {
            str2 = "No elements matched the query '%s' on element '%s'.";
        } else {
            str2 = "No elements matched the query '%s' in the document.";
        }
        return (Element) Validate.e(h, str2, str, B4());
    }

    public boolean r3() {
        return this.a1.g();
    }

    public <T extends Node> List<T> r4(String str, Class<T> cls) {
        return NodeUtils.c(str, this, cls);
    }

    public <T extends Node> T s2(String str, Class<T> cls) {
        String str2;
        Node f4 = f4(str, cls);
        if (O0() != null) {
            str2 = "No nodes matched the query '%s' on element '%s'.";
        } else {
            str2 = "No nodes matched the query '%s' in the document.";
        }
        return (T) Validate.e(f4, str2, str, B4());
    }

    public Element s3() {
        for (int size = this.b1.size() - 1; size >= 0; size--) {
            Node node = this.b1.get(size);
            if (node instanceof Element) {
                return (Element) node;
            }
        }
        return null;
    }

    public Elements s4(String str) {
        return new Elements((List<Element>) NodeUtils.c(str, this, Element.class));
    }

    public Stream<Element> stream() {
        return NodeUtils.e(this, Element.class);
    }

    @Override // org.jsoup.nodes.Node
    /* renamed from: t2 */
    public Element Y(NodeFilter nodeFilter) {
        return (Element) super.Y(nodeFilter);
    }

    public Element u3() {
        if (O0() != null) {
            return O0().s3();
        }
        return this;
    }

    @Override // org.jsoup.nodes.Node
    /* renamed from: u4 */
    public Element j1() {
        String w = w();
        Attributes attributes = null;
        if (w.isEmpty()) {
            w = null;
        }
        Tag tag = this.a1;
        Attributes attributes2 = this.c1;
        if (attributes2 != null) {
            attributes = attributes2.clone();
        }
        return new Element(tag, w, attributes);
    }

    public final <T> List<T> v2(final Class<T> cls) {
        Stream<Node> stream = this.b1.stream();
        Objects.requireNonNull(cls);
        return (List) stream.filter(new Predicate() { // from class: o.R90
            @Override // java.util.function.Predicate
            public final boolean test(Object obj) {
                return cls.isInstance((Node) obj);
            }
        }).map(new Function() { // from class: o.S90
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return cls.cast((Node) obj);
            }
        }).collect(Collectors.collectingAndThen(Collectors.toList(), new Function() { // from class: o.T90
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return Collections.unmodifiableList((List) obj);
            }
        }));
    }

    public Elements v3() {
        return w3(true);
    }

    @Override // org.jsoup.nodes.Node
    public String w() {
        String a4 = a4(this, g1);
        if (a4 != null) {
            return a4;
        }
        return "";
    }

    @Override // org.jsoup.nodes.Node
    public String w0() {
        return this.a1.e();
    }

    public Element w1(String str) {
        Validate.q(str);
        Set<String> Y1 = Y1();
        Y1.add(str);
        Z1(Y1);
        return this;
    }

    public Element w2() {
        int size = this.b1.size();
        for (int i = 0; i < size; i++) {
            Node node = this.b1.get(i);
            if (node instanceof Element) {
                return (Element) node;
            }
        }
        return null;
    }

    public final Elements w3(boolean z) {
        Elements elements = new Elements();
        if (this.X == null) {
            return elements;
        }
        elements.add(this);
        if (z) {
            return elements.y0();
        }
        return elements.L0();
    }

    public Element x2() {
        if (O0() != null) {
            return O0().w2();
        }
        return this;
    }

    public String x3() {
        StringBuilder e = StringUtil.e();
        z3(e);
        return StringUtil.x(e).trim();
    }

    public Elements x4() {
        if (this.X == null) {
            return new Elements(0);
        }
        List<Element> U1 = O0().U1();
        Elements elements = new Elements(U1.size() - 1);
        for (Element element : U1) {
            if (element != this) {
                elements.add(element);
            }
        }
        return elements;
    }

    @Override // org.jsoup.nodes.Node
    /* renamed from: y1 */
    public Element i(String str) {
        return (Element) super.i(str);
    }

    @Override // org.jsoup.nodes.Node
    /* renamed from: y2 */
    public Element f0(Consumer<? super Node> consumer) {
        return (Element) super.f0(consumer);
    }

    public final void y4(List<Element> list) {
        Map<String, Object> u0 = p().u0();
        u0.put(h1, new WeakReference(list));
        u0.put(i1, Integer.valueOf(this.b1.d()));
    }

    @Override // org.jsoup.nodes.Node
    public String z0() {
        return N4();
    }

    @Override // org.jsoup.nodes.Node
    /* renamed from: z1 */
    public Element j(Node node) {
        return (Element) super.j(node);
    }

    public Elements z2() {
        return Collector.a(new Evaluator.AllElements(), this);
    }

    public final void z3(StringBuilder sb) {
        for (int i = 0; i < G(); i++) {
            Node node = this.b1.get(i);
            if (node instanceof TextNode) {
                H1(sb, (TextNode) node);
            } else if (node.t0("br") && !TextNode.E1(sb)) {
                sb.append(C4500Ve2.b);
            }
        }
    }

    public Element z4(Tag tag) {
        Validate.q(tag);
        this.a1 = tag;
        return this;
    }

    public Element(String str) {
        this(str, Parser.b1);
    }

    public Element(Tag tag, String str, Attributes attributes) {
        Validate.q(tag);
        this.b1 = e1;
        this.c1 = attributes;
        this.a1 = tag;
        if (StringUtil.k(str)) {
            return;
        }
        f1(str);
    }

    public Element(Tag tag, String str) {
        this(tag, str, null);
    }
}
