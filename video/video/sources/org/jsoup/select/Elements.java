package org.jsoup.select;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.function.Function;
import o.C4500Ve2;
import org.jsoup.helper.Validate;
import org.jsoup.internal.StringUtil;
import org.jsoup.nodes.Comment;
import org.jsoup.nodes.DataNode;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.FormElement;
import org.jsoup.nodes.Node;
import org.jsoup.nodes.TextNode;

/* loaded from: classes4.dex */
public class Elements extends Nodes<Element> {
    public Elements() {
    }

    public Elements C0(String str) {
        return Selector.c(this, Selector.d(str, this));
    }

    public Elements F0() {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        Iterator<T> it = iterator();
        while (it.hasNext()) {
            linkedHashSet.addAll(((Element) it.next()).I3());
        }
        return new Elements(linkedHashSet);
    }

    public Elements G(String str) {
        Iterator<T> it = iterator();
        while (it.hasNext()) {
            ((Element) it.next()).w1(str);
        }
        return this;
    }

    @Override // org.jsoup.select.Nodes
    /* renamed from: H */
    public Elements d(String str) {
        super.d(str);
        return this;
    }

    public Elements I0(String str) {
        Iterator<T> it = iterator();
        while (it.hasNext()) {
            ((Element) it.next()).J3(str);
        }
        return this;
    }

    public Elements J(String str) {
        Iterator<T> it = iterator();
        while (it.hasNext()) {
            ((Element) it.next()).A1(str);
        }
        return this;
    }

    public Elements J0() {
        return a1(null, false, false);
    }

    public String K(String str) {
        Iterator<T> it = iterator();
        while (it.hasNext()) {
            Element element = (Element) it.next();
            if (element.j0(str)) {
                return element.k(str);
            }
        }
        return "";
    }

    public Elements K0(String str) {
        return a1(str, false, false);
    }

    public Elements L(String str, String str2) {
        Iterator<T> it = iterator();
        while (it.hasNext()) {
            ((Element) it.next()).l(str, str2);
        }
        return this;
    }

    public Elements L0() {
        return a1(null, false, true);
    }

    @Override // org.jsoup.select.Nodes
    /* renamed from: M */
    public Elements f(String str) {
        super.f(str);
        return this;
    }

    public Elements N0(String str) {
        return a1(str, false, true);
    }

    @Override // org.jsoup.select.Nodes
    /* renamed from: O0 */
    public Element w(int i) {
        return (Element) super.remove(i);
    }

    @Override // org.jsoup.select.Nodes
    /* renamed from: P0 */
    public Elements B() {
        super.B();
        return this;
    }

    public final <T extends Node> List<T> Q(Class<T> cls) {
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = iterator();
        while (it.hasNext()) {
            Element element = (Element) it.next();
            for (int i = 0; i < element.G(); i++) {
                Node F = element.F(i);
                if (cls.isInstance(F)) {
                    arrayList.add(cls.cast(F));
                }
            }
        }
        return arrayList;
    }

    public Elements Q0(String str) {
        Iterator<T> it = iterator();
        while (it.hasNext()) {
            ((Element) it.next()).Y0(str);
        }
        return this;
    }

    public Elements R0(String str) {
        Iterator<T> it = iterator();
        while (it.hasNext()) {
            ((Element) it.next()).W3(str);
        }
        return this;
    }

    public Elements T0(String str) {
        return Selector.d(str, this);
    }

    @Override // org.jsoup.select.Nodes
    /* renamed from: U */
    public Elements h() {
        Elements elements = new Elements(size());
        Iterator<T> it = iterator();
        while (it.hasNext()) {
            elements.add(((Element) it.next()).clone());
        }
        return elements;
    }

    public List<Comment> V() {
        return Q(Comment.class);
    }

    public List<DataNode> X() {
        return Q(DataNode.class);
    }

    public Element X0(String str) {
        return Selector.g(str, this);
    }

    @Override // org.jsoup.select.Nodes
    /* renamed from: Y */
    public Element i(int i) {
        return (Element) super.i(i);
    }

    @Override // org.jsoup.select.Nodes, java.util.ArrayList, java.util.AbstractList, java.util.List
    /* renamed from: Y0 */
    public Element set(int i, Element element) {
        return (Element) super.set(i, element);
    }

    public final Elements a1(String str, boolean z, boolean z2) {
        Evaluator evaluator;
        Elements elements = new Elements();
        if (str != null) {
            evaluator = Selector.b(str);
        } else {
            evaluator = null;
        }
        Iterator<T> it = iterator();
        while (it.hasNext()) {
            Element element = (Element) it.next();
            do {
                if (z) {
                    element = element.u0();
                } else {
                    element = element.T0();
                }
                if (element != null) {
                    if (evaluator == null || element.p3(evaluator)) {
                        elements.add(element);
                        continue;
                    }
                }
            } while (z2);
        }
        return elements;
    }

    public List<String> b0(String str) {
        ArrayList arrayList = new ArrayList(size());
        Iterator<T> it = iterator();
        while (it.hasNext()) {
            Element element = (Element) it.next();
            if (element.j0(str)) {
                arrayList.add(element.k(str));
            }
        }
        return arrayList;
    }

    public Elements b1(String str) {
        Iterator<T> it = iterator();
        while (it.hasNext()) {
            ((Element) it.next()).C4(str);
        }
        return this;
    }

    public String c1() {
        return (String) stream().map(new Function() { // from class: o.qa0
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return ((Element) obj).F4();
            }
        }).collect(StringUtil.t(C4500Ve2.b));
    }

    public List<String> d0() {
        ArrayList arrayList = new ArrayList(size());
        Iterator<T> it = iterator();
        while (it.hasNext()) {
            Element element = (Element) it.next();
            if (element.a3()) {
                arrayList.add(element.F4());
            }
        }
        return arrayList;
    }

    public List<TextNode> d1() {
        return Q(TextNode.class);
    }

    @Override // org.jsoup.select.Nodes
    public ArrayList<Element> e() {
        return new ArrayList<>(this);
    }

    public Elements e1(String str) {
        Iterator<T> it = iterator();
        while (it.hasNext()) {
            ((Element) it.next()).I4(str);
        }
        return this;
    }

    public Elements f0() {
        Iterator<T> it = iterator();
        while (it.hasNext()) {
            ((Element) it.next()).V();
        }
        return this;
    }

    public Elements f1(NodeVisitor nodeVisitor) {
        NodeTraversor.d(nodeVisitor, this);
        return this;
    }

    public Elements g1() {
        Iterator<T> it = iterator();
        while (it.hasNext()) {
            ((Element) it.next()).p1();
        }
        return this;
    }

    public Elements h0(int i) {
        if (size() > i) {
            return new Elements((Element) get(i));
        }
        return new Elements();
    }

    public String i1() {
        if (size() > 0) {
            return l().L4();
        }
        return "";
    }

    public Element j0(String str) {
        return (Element) Validate.e(Selector.g(str, this), "No elements matched the query '%s' in the elements.", str);
    }

    public Elements j1(String str) {
        Iterator<T> it = iterator();
        while (it.hasNext()) {
            ((Element) it.next()).M4(str);
        }
        return this;
    }

    public Elements k0(NodeFilter nodeFilter) {
        NodeTraversor.b(nodeFilter, this);
        return this;
    }

    @Override // org.jsoup.select.Nodes
    /* renamed from: k1 */
    public Elements F(String str) {
        super.F(str);
        return this;
    }

    @Override // org.jsoup.select.Nodes
    /* renamed from: l0 */
    public Element l() {
        return (Element) super.l();
    }

    public List<FormElement> m0() {
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = iterator();
        while (it.hasNext()) {
            Element element = (Element) it.next();
            if (element instanceof FormElement) {
                arrayList.add((FormElement) element);
            }
        }
        return arrayList;
    }

    public boolean n0(String str) {
        Iterator<T> it = iterator();
        while (it.hasNext()) {
            if (((Element) it.next()).j0(str)) {
                return true;
            }
        }
        return false;
    }

    public boolean p0(String str) {
        Iterator<T> it = iterator();
        while (it.hasNext()) {
            if (((Element) it.next()).Z2(str)) {
                return true;
            }
        }
        return false;
    }

    public boolean r0() {
        Iterator<T> it = iterator();
        while (it.hasNext()) {
            if (((Element) it.next()).a3()) {
                return true;
            }
        }
        return false;
    }

    public String s0() {
        return (String) stream().map(new Function() { // from class: o.pa0
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return ((Element) obj).c3();
            }
        }).collect(StringUtil.t("\n"));
    }

    public Elements t0(String str) {
        Iterator<T> it = iterator();
        while (it.hasNext()) {
            ((Element) it.next()).e3(str);
        }
        return this;
    }

    public boolean u0(String str) {
        Evaluator b = Selector.b(str);
        Iterator<T> it = iterator();
        while (it.hasNext()) {
            if (((Element) it.next()).p3(b)) {
                return true;
            }
        }
        return false;
    }

    @Override // org.jsoup.select.Nodes
    /* renamed from: v0 */
    public Element p() {
        return (Element) super.p();
    }

    public Elements w0() {
        return a1(null, true, false);
    }

    public Elements x0(String str) {
        return a1(str, true, false);
    }

    public Elements y0() {
        return a1(null, true, true);
    }

    public Elements z0(String str) {
        return a1(str, true, true);
    }

    public Elements(int i) {
        super(i);
    }

    public Elements(Collection<Element> collection) {
        super(collection);
    }

    public Elements(List<Element> list) {
        super((List) list);
    }

    public Elements(Element... elementArr) {
        super(Arrays.asList(elementArr));
    }
}
