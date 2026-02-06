package org.jsoup.select;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.function.ToIntFunction;
import o.C6566gU0;
import org.jsoup.internal.StringUtil;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.LeafNode;
import org.jsoup.select.Evaluator;

/* loaded from: classes4.dex */
public abstract class CombiningEvaluator extends Evaluator {
    public final ArrayList<Evaluator> a;
    public final List<Evaluator> b;
    public int c;
    public int d;
    public boolean e;

    /* loaded from: classes4.dex */
    public static final class And extends CombiningEvaluator {
        public And(Collection<Evaluator> collection) {
            super(collection);
        }

        @Override // org.jsoup.select.Evaluator
        public boolean f(Element element, Element element2) {
            for (int i = 0; i < this.c; i++) {
                if (!this.b.get(i).f(element, element2)) {
                    return false;
                }
            }
            return true;
        }

        @Override // org.jsoup.select.Evaluator
        public boolean g(Element element, LeafNode leafNode) {
            for (int i = 0; i < this.c; i++) {
                if (!this.b.get(i).g(element, leafNode)) {
                    return false;
                }
            }
            return true;
        }

        public String toString() {
            return StringUtil.q(this.a, "");
        }

        public And(Evaluator... evaluatorArr) {
            this(Arrays.asList(evaluatorArr));
        }
    }

    public CombiningEvaluator() {
        this.c = 0;
        this.d = 0;
        this.a = new ArrayList<>();
        this.b = new ArrayList();
    }

    @Override // org.jsoup.select.Evaluator
    public int e() {
        return this.d;
    }

    @Override // org.jsoup.select.Evaluator
    public void i() {
        Iterator<Evaluator> it = this.a.iterator();
        while (it.hasNext()) {
            it.next().i();
        }
        super.i();
    }

    @Override // org.jsoup.select.Evaluator
    public boolean j() {
        return this.e;
    }

    public void k(Evaluator evaluator) {
        this.a.add(evaluator);
        l();
    }

    public void l() {
        this.c = this.a.size();
        this.d = 0;
        Iterator<Evaluator> it = this.a.iterator();
        while (it.hasNext()) {
            this.d += it.next().e();
        }
        this.b.clear();
        this.b.addAll(this.a);
        this.b.sort(Comparator.comparingInt(new ToIntFunction() { // from class: o.HG
            @Override // java.util.function.ToIntFunction
            public final int applyAsInt(Object obj) {
                return ((Evaluator) obj).e();
            }
        }));
        Iterator<Evaluator> it2 = this.a.iterator();
        while (it2.hasNext()) {
            if (it2.next().j()) {
                this.e = true;
                return;
            }
        }
    }

    /* loaded from: classes4.dex */
    public static final class Or extends CombiningEvaluator {
        public Or(Collection<Evaluator> collection) {
            if (this.c > 1) {
                this.a.add(new And(collection));
            } else {
                this.a.addAll(collection);
            }
            l();
        }

        @Override // org.jsoup.select.Evaluator
        public boolean f(Element element, Element element2) {
            for (int i = 0; i < this.c; i++) {
                if (this.b.get(i).f(element, element2)) {
                    return true;
                }
            }
            return false;
        }

        @Override // org.jsoup.select.Evaluator
        public boolean g(Element element, LeafNode leafNode) {
            for (int i = 0; i < this.c; i++) {
                if (this.b.get(i).g(element, leafNode)) {
                    return true;
                }
            }
            return false;
        }

        public String toString() {
            return StringUtil.q(this.a, C6566gU0.h);
        }

        public Or(Evaluator... evaluatorArr) {
            this(Arrays.asList(evaluatorArr));
        }

        public Or() {
        }
    }

    public CombiningEvaluator(Collection<Evaluator> collection) {
        this();
        this.a.addAll(collection);
        l();
    }
}
