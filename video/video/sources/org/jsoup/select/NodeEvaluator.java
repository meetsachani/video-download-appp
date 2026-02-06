package org.jsoup.select;

import java.util.regex.Pattern;
import o.C10923yJ1;
import org.jsoup.internal.Normalizer;
import org.jsoup.internal.StringUtil;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.LeafNode;
import org.jsoup.nodes.Node;

/* loaded from: classes4.dex */
abstract class NodeEvaluator extends Evaluator {

    /* loaded from: classes4.dex */
    public static class BlankValue extends NodeEvaluator {
        @Override // org.jsoup.select.Evaluator
        public int e() {
            return 4;
        }

        @Override // org.jsoup.select.NodeEvaluator
        public boolean k(Node node) {
            return StringUtil.k(node.z0());
        }

        public String toString() {
            return ":blank";
        }
    }

    /* loaded from: classes4.dex */
    public static class ContainsValue extends NodeEvaluator {
        public final String a;

        public ContainsValue(String str) {
            this.a = Normalizer.a(StringUtil.u(str));
        }

        @Override // org.jsoup.select.Evaluator
        public int e() {
            return 6;
        }

        @Override // org.jsoup.select.NodeEvaluator
        public boolean k(Node node) {
            return Normalizer.a(node.z0()).contains(this.a);
        }

        public String toString() {
            return String.format(":contains(%s)", this.a);
        }
    }

    /* loaded from: classes4.dex */
    public static class InstanceType extends NodeEvaluator {
        public final Class<? extends Node> a;
        public final String b;

        public InstanceType(Class<? extends Node> cls, String str) {
            this.a = cls;
            this.b = C10923yJ1.d + str;
        }

        @Override // org.jsoup.select.Evaluator
        public int e() {
            return 1;
        }

        @Override // org.jsoup.select.NodeEvaluator
        public boolean k(Node node) {
            return this.a.isInstance(node);
        }

        public String toString() {
            return this.b;
        }
    }

    /* loaded from: classes4.dex */
    public static class MatchesValue extends NodeEvaluator {
        public final Pattern a;

        public MatchesValue(Pattern pattern) {
            this.a = pattern;
        }

        @Override // org.jsoup.select.Evaluator
        public int e() {
            return 8;
        }

        @Override // org.jsoup.select.NodeEvaluator
        public boolean k(Node node) {
            return this.a.matcher(node.z0()).find();
        }

        public String toString() {
            return String.format(":matches(%s)", this.a);
        }
    }

    @Override // org.jsoup.select.Evaluator
    public boolean f(Element element, Element element2) {
        return k(element2);
    }

    @Override // org.jsoup.select.Evaluator
    public boolean g(Element element, LeafNode leafNode) {
        return k(leafNode);
    }

    @Override // org.jsoup.select.Evaluator
    public boolean j() {
        return true;
    }

    public abstract boolean k(Node node);
}
