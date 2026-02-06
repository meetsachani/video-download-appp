package org.jsoup.select;

import java.util.ArrayList;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.function.Function;
import java.util.function.Supplier;
import o.GD2;
import org.jsoup.internal.Functions;
import org.jsoup.internal.SoftPool;
import org.jsoup.internal.StringUtil;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.LeafNode;
import org.jsoup.nodes.Node;
import org.jsoup.nodes.NodeIterator;
import org.jsoup.nodes.TextNode;
import org.jsoup.select.StructuralEvaluator;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes4.dex */
public abstract class StructuralEvaluator extends Evaluator {
    public final Evaluator a;
    public boolean b;
    public final ThreadLocal<IdentityHashMap<Node, IdentityHashMap<Node, Boolean>>> c = new GD2(new Supplier() { // from class: o.Uf2
        @Override // java.util.function.Supplier
        public final Object get() {
            return new IdentityHashMap();
        }
    });

    /* loaded from: classes4.dex */
    public static class Ancestor extends StructuralEvaluator {
        public Ancestor(Evaluator evaluator) {
            super(evaluator);
        }

        @Override // org.jsoup.select.Evaluator
        public int e() {
            return this.a.e() * 8;
        }

        @Override // org.jsoup.select.StructuralEvaluator
        public boolean l(Element element, Node node) {
            if (element == node) {
                return false;
            }
            do {
                node = node.O0();
                if (node == null) {
                    break;
                } else if (m(element, node)) {
                    return true;
                }
            } while (node != element);
            return false;
        }

        public String toString() {
            return String.format("%s ", this.a);
        }
    }

    /* loaded from: classes4.dex */
    public static class Has extends StructuralEvaluator {
        public static final SoftPool<NodeIterator<Node>> e = new SoftPool<>(new Supplier() { // from class: org.jsoup.select.d
            @Override // java.util.function.Supplier
            public final Object get() {
                return StructuralEvaluator.Has.n();
            }
        });
        public final boolean d;

        public Has(Evaluator evaluator) {
            super(evaluator);
            this.d = o(evaluator);
        }

        public static /* synthetic */ NodeIterator n() {
            return new NodeIterator(new TextNode(""), Node.class);
        }

        /* JADX WARN: Removed duplicated region for block: B:7:0x0012  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public static boolean o(Evaluator evaluator) {
            if (evaluator instanceof CombiningEvaluator) {
                Iterator<Evaluator> it = ((CombiningEvaluator) evaluator).a.iterator();
                while (it.hasNext()) {
                    Evaluator next = it.next();
                    if ((next instanceof PreviousSibling) || (next instanceof ImmediatePreviousSibling)) {
                        return true;
                    }
                    while (it.hasNext()) {
                    }
                }
                return false;
            }
            return false;
        }

        @Override // org.jsoup.select.Evaluator
        public int e() {
            return this.a.e() * 10;
        }

        @Override // org.jsoup.select.StructuralEvaluator, org.jsoup.select.Evaluator
        public boolean f(Element element, Element element2) {
            if (this.d) {
                for (Element x2 = element2.x2(); x2 != null; x2 = x2.u0()) {
                    if (x2 != element2 && this.a.f(element2, x2)) {
                        return true;
                    }
                }
            }
            NodeIterator<Node> b = e.b();
            b.f(element2);
            while (b.hasNext()) {
                try {
                    Node next = b.next();
                    if (next != element2 && this.a.h(element2, next)) {
                        return true;
                    }
                } finally {
                    e.d(b);
                }
            }
            e.d(b);
            return false;
        }

        @Override // org.jsoup.select.StructuralEvaluator
        public boolean l(Element element, Node node) {
            return false;
        }

        public String toString() {
            return String.format(":has(%s)", this.a);
        }
    }

    /* loaded from: classes4.dex */
    public static class ImmediateParentRun extends StructuralEvaluator {
        public final ArrayList<Evaluator> d;
        public int e;

        public ImmediateParentRun(Evaluator evaluator) {
            super(evaluator);
            ArrayList<Evaluator> arrayList = new ArrayList<>();
            this.d = arrayList;
            this.e = 2;
            arrayList.add(evaluator);
            this.e += evaluator.e();
        }

        @Override // org.jsoup.select.Evaluator
        public int e() {
            return this.e;
        }

        @Override // org.jsoup.select.StructuralEvaluator, org.jsoup.select.Evaluator
        public void i() {
            Iterator<Evaluator> it = this.d.iterator();
            while (it.hasNext()) {
                it.next().i();
            }
            super.i();
        }

        @Override // org.jsoup.select.StructuralEvaluator
        public boolean l(Element element, Node node) {
            if (node == element) {
                return false;
            }
            for (int size = this.d.size() - 1; size >= 0; size--) {
                if (node == null || !this.d.get(size).h(element, node)) {
                    return false;
                }
                node = node.O0();
            }
            return true;
        }

        public void n(Evaluator evaluator) {
            this.d.add(evaluator);
            this.e += evaluator.e();
            this.b = evaluator.j() | this.b;
        }

        public String toString() {
            return StringUtil.q(this.d, " > ");
        }
    }

    /* loaded from: classes4.dex */
    public static class ImmediatePreviousSibling extends StructuralEvaluator {
        public ImmediatePreviousSibling(Evaluator evaluator) {
            super(evaluator);
        }

        @Override // org.jsoup.select.Evaluator
        public int e() {
            return this.a.e() + 2;
        }

        @Override // org.jsoup.select.StructuralEvaluator
        public boolean l(Element element, Node node) {
            Node T0;
            if (element == node) {
                return false;
            }
            if (this.b) {
                T0 = node.V0();
            } else {
                T0 = node.T0();
            }
            if (T0 == null || !m(element, T0)) {
                return false;
            }
            return true;
        }

        public String toString() {
            return String.format("%s + ", this.a);
        }
    }

    /* loaded from: classes4.dex */
    public static class Is extends StructuralEvaluator {
        public Is(Evaluator evaluator) {
            super(evaluator);
        }

        @Override // org.jsoup.select.Evaluator
        public int e() {
            return this.a.e() + 2;
        }

        @Override // org.jsoup.select.StructuralEvaluator
        public boolean l(Element element, Node node) {
            return this.a.h(element, node);
        }

        public String toString() {
            return String.format(":is(%s)", this.a);
        }
    }

    /* loaded from: classes4.dex */
    public static class Not extends StructuralEvaluator {
        public Not(Evaluator evaluator) {
            super(evaluator);
        }

        @Override // org.jsoup.select.Evaluator
        public int e() {
            return this.a.e() + 2;
        }

        @Override // org.jsoup.select.StructuralEvaluator
        public boolean l(Element element, Node node) {
            return !m(element, node);
        }

        public String toString() {
            return String.format(":not(%s)", this.a);
        }
    }

    /* loaded from: classes4.dex */
    public static class PreviousSibling extends StructuralEvaluator {
        public PreviousSibling(Evaluator evaluator) {
            super(evaluator);
        }

        @Override // org.jsoup.select.Evaluator
        public int e() {
            return this.a.e() * 3;
        }

        @Override // org.jsoup.select.StructuralEvaluator
        public boolean l(Element element, Node node) {
            if (element == node) {
                return false;
            }
            for (Node d0 = node.d0(); d0 != null && d0 != node; d0 = d0.v0()) {
                if (m(element, d0)) {
                    return true;
                }
            }
            return false;
        }

        public String toString() {
            return String.format("%s ~ ", this.a);
        }
    }

    /* loaded from: classes4.dex */
    public static class Root extends Evaluator {
        @Override // org.jsoup.select.Evaluator
        public int e() {
            return 1;
        }

        @Override // org.jsoup.select.Evaluator
        public boolean f(Element element, Element element2) {
            return element == element2;
        }

        public String toString() {
            return ">";
        }
    }

    public StructuralEvaluator(Evaluator evaluator) {
        this.a = evaluator;
        this.b = evaluator.j();
    }

    @Override // org.jsoup.select.Evaluator
    public boolean f(Element element, Element element2) {
        return l(element, element2);
    }

    @Override // org.jsoup.select.Evaluator
    public boolean g(Element element, LeafNode leafNode) {
        return l(element, leafNode);
    }

    @Override // org.jsoup.select.Evaluator
    public void i() {
        this.c.get().clear();
        this.a.i();
        super.i();
    }

    @Override // org.jsoup.select.Evaluator
    public boolean j() {
        return this.b;
    }

    public abstract boolean l(Element element, Node node);

    public boolean m(final Element element, Node node) {
        return this.c.get().computeIfAbsent(element, Functions.e()).computeIfAbsent(node, new Function() { // from class: org.jsoup.select.c
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                Boolean valueOf;
                valueOf = Boolean.valueOf(StructuralEvaluator.this.a.h(element, (Node) obj));
                return valueOf;
            }
        }).booleanValue();
    }
}
