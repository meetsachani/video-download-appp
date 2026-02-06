package org.jsoup.select;

import java.util.function.Predicate;
import java.util.regex.Pattern;
import o.AbstractC4253Sp2;
import org.jsoup.helper.Validate;
import org.jsoup.internal.Normalizer;
import org.jsoup.internal.StringUtil;
import org.jsoup.nodes.Comment;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.DocumentType;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.LeafNode;
import org.jsoup.nodes.Node;
import org.jsoup.nodes.PseudoTextElement;
import org.jsoup.nodes.TextNode;
import org.jsoup.nodes.XmlDeclaration;
import org.jsoup.parser.ParseSettings;
import org.jsoup.select.Evaluator;

/* loaded from: classes4.dex */
public abstract class Evaluator {

    /* loaded from: classes4.dex */
    public static final class AllElements extends Evaluator {
        @Override // org.jsoup.select.Evaluator
        public int e() {
            return 10;
        }

        @Override // org.jsoup.select.Evaluator
        public boolean f(Element element, Element element2) {
            return true;
        }

        public String toString() {
            return "*";
        }
    }

    /* loaded from: classes4.dex */
    public static final class Attribute extends Evaluator {
        public final String a;

        public Attribute(String str) {
            this.a = str;
        }

        @Override // org.jsoup.select.Evaluator
        public int e() {
            return 2;
        }

        @Override // org.jsoup.select.Evaluator
        public boolean f(Element element, Element element2) {
            return element2.j0(this.a);
        }

        public String toString() {
            return String.format("[%s]", this.a);
        }
    }

    /* loaded from: classes4.dex */
    public static abstract class AttributeKeyPair extends Evaluator {
        public final String a;
        public final String b;

        public AttributeKeyPair(String str, String str2) {
            this(str, str2, true);
        }

        public AttributeKeyPair(String str, String str2, boolean z) {
            Validate.n(str);
            Validate.n(str2);
            this.a = Normalizer.b(str);
            boolean z2 = (str2.startsWith("'") && str2.endsWith("'")) || (str2.startsWith(AbstractC4253Sp2.b.x1) && str2.endsWith(AbstractC4253Sp2.b.x1));
            str2 = z2 ? str2.substring(1, str2.length() - 1) : str2;
            if (!z && z2) {
                this.b = Normalizer.a(str2);
            } else {
                this.b = Normalizer.b(str2);
            }
        }
    }

    /* loaded from: classes4.dex */
    public static final class AttributeStarting extends Evaluator {
        public final String a;

        public AttributeStarting(String str) {
            Validate.q(str);
            this.a = Normalizer.a(str);
        }

        @Override // org.jsoup.select.Evaluator
        public int e() {
            return 6;
        }

        @Override // org.jsoup.select.Evaluator
        public boolean f(Element element, Element element2) {
            for (org.jsoup.nodes.Attribute attribute : element2.p().j()) {
                if (Normalizer.a(attribute.getKey()).startsWith(this.a)) {
                    return true;
                }
            }
            return false;
        }

        public String toString() {
            return String.format("[^%s]", this.a);
        }
    }

    /* loaded from: classes4.dex */
    public static final class AttributeWithValue extends AttributeKeyPair {
        public AttributeWithValue(String str, String str2) {
            super(str, str2);
        }

        @Override // org.jsoup.select.Evaluator
        public int e() {
            return 3;
        }

        @Override // org.jsoup.select.Evaluator
        public boolean f(Element element, Element element2) {
            if (element2.j0(this.a) && this.b.equalsIgnoreCase(element2.k(this.a).trim())) {
                return true;
            }
            return false;
        }

        public String toString() {
            return String.format("[%s=%s]", this.a, this.b);
        }
    }

    /* loaded from: classes4.dex */
    public static final class AttributeWithValueContaining extends AttributeKeyPair {
        public AttributeWithValueContaining(String str, String str2) {
            super(str, str2);
        }

        @Override // org.jsoup.select.Evaluator
        public int e() {
            return 6;
        }

        @Override // org.jsoup.select.Evaluator
        public boolean f(Element element, Element element2) {
            if (element2.j0(this.a) && Normalizer.a(element2.k(this.a)).contains(this.b)) {
                return true;
            }
            return false;
        }

        public String toString() {
            return String.format("[%s*=%s]", this.a, this.b);
        }
    }

    /* loaded from: classes4.dex */
    public static final class AttributeWithValueEnding extends AttributeKeyPair {
        public AttributeWithValueEnding(String str, String str2) {
            super(str, str2, false);
        }

        @Override // org.jsoup.select.Evaluator
        public int e() {
            return 4;
        }

        @Override // org.jsoup.select.Evaluator
        public boolean f(Element element, Element element2) {
            if (element2.j0(this.a) && Normalizer.a(element2.k(this.a)).endsWith(this.b)) {
                return true;
            }
            return false;
        }

        public String toString() {
            return String.format("[%s$=%s]", this.a, this.b);
        }
    }

    /* loaded from: classes4.dex */
    public static final class AttributeWithValueMatching extends Evaluator {
        public final String a;
        public final Pattern b;

        public AttributeWithValueMatching(String str, Pattern pattern) {
            this.a = Normalizer.b(str);
            this.b = pattern;
        }

        @Override // org.jsoup.select.Evaluator
        public int e() {
            return 8;
        }

        @Override // org.jsoup.select.Evaluator
        public boolean f(Element element, Element element2) {
            if (element2.j0(this.a) && this.b.matcher(element2.k(this.a)).find()) {
                return true;
            }
            return false;
        }

        public String toString() {
            return String.format("[%s~=%s]", this.a, this.b.toString());
        }
    }

    /* loaded from: classes4.dex */
    public static final class AttributeWithValueNot extends AttributeKeyPair {
        public AttributeWithValueNot(String str, String str2) {
            super(str, str2);
        }

        @Override // org.jsoup.select.Evaluator
        public int e() {
            return 3;
        }

        @Override // org.jsoup.select.Evaluator
        public boolean f(Element element, Element element2) {
            return !this.b.equalsIgnoreCase(element2.k(this.a));
        }

        public String toString() {
            return String.format("[%s!=%s]", this.a, this.b);
        }
    }

    /* loaded from: classes4.dex */
    public static final class AttributeWithValueStarting extends AttributeKeyPair {
        public AttributeWithValueStarting(String str, String str2) {
            super(str, str2, false);
        }

        @Override // org.jsoup.select.Evaluator
        public int e() {
            return 4;
        }

        @Override // org.jsoup.select.Evaluator
        public boolean f(Element element, Element element2) {
            if (element2.j0(this.a) && Normalizer.a(element2.k(this.a)).startsWith(this.b)) {
                return true;
            }
            return false;
        }

        public String toString() {
            return String.format("[%s^=%s]", this.a, this.b);
        }
    }

    /* loaded from: classes4.dex */
    public static final class Class extends Evaluator {
        public final String a;

        public Class(String str) {
            this.a = str;
        }

        @Override // org.jsoup.select.Evaluator
        public int e() {
            return 8;
        }

        @Override // org.jsoup.select.Evaluator
        public boolean f(Element element, Element element2) {
            return element2.Z2(this.a);
        }

        public String toString() {
            return String.format(".%s", this.a);
        }
    }

    /* loaded from: classes4.dex */
    public static final class ContainsData extends Evaluator {
        public final String a;

        public ContainsData(String str) {
            this.a = Normalizer.a(str);
        }

        @Override // org.jsoup.select.Evaluator
        public boolean f(Element element, Element element2) {
            return Normalizer.a(element2.g2()).contains(this.a);
        }

        public String toString() {
            return String.format(":containsData(%s)", this.a);
        }
    }

    /* loaded from: classes4.dex */
    public static final class ContainsOwnText extends Evaluator {
        public final String a;

        public ContainsOwnText(String str) {
            this.a = Normalizer.a(StringUtil.u(str));
        }

        @Override // org.jsoup.select.Evaluator
        public boolean f(Element element, Element element2) {
            return Normalizer.a(element2.x3()).contains(this.a);
        }

        public String toString() {
            return String.format(":containsOwn(%s)", this.a);
        }
    }

    /* loaded from: classes4.dex */
    public static final class ContainsText extends Evaluator {
        public final String a;

        public ContainsText(String str) {
            this.a = Normalizer.a(StringUtil.u(str));
        }

        @Override // org.jsoup.select.Evaluator
        public int e() {
            return 10;
        }

        @Override // org.jsoup.select.Evaluator
        public boolean f(Element element, Element element2) {
            return Normalizer.a(element2.F4()).contains(this.a);
        }

        public String toString() {
            return String.format(":contains(%s)", this.a);
        }
    }

    /* loaded from: classes4.dex */
    public static final class ContainsWholeOwnText extends Evaluator {
        public final String a;

        public ContainsWholeOwnText(String str) {
            this.a = str;
        }

        @Override // org.jsoup.select.Evaluator
        public boolean f(Element element, Element element2) {
            return element2.N4().contains(this.a);
        }

        public String toString() {
            return String.format(":containsWholeOwnText(%s)", this.a);
        }
    }

    /* loaded from: classes4.dex */
    public static final class ContainsWholeText extends Evaluator {
        public final String a;

        public ContainsWholeText(String str) {
            this.a = str;
        }

        @Override // org.jsoup.select.Evaluator
        public int e() {
            return 10;
        }

        @Override // org.jsoup.select.Evaluator
        public boolean f(Element element, Element element2) {
            return element2.O4().contains(this.a);
        }

        public String toString() {
            return String.format(":containsWholeText(%s)", this.a);
        }
    }

    /* loaded from: classes4.dex */
    public static final class Id extends Evaluator {
        public final String a;

        public Id(String str) {
            this.a = str;
        }

        @Override // org.jsoup.select.Evaluator
        public int e() {
            return 2;
        }

        @Override // org.jsoup.select.Evaluator
        public boolean f(Element element, Element element2) {
            return this.a.equals(element2.f3());
        }

        public String toString() {
            return String.format("#%s", this.a);
        }
    }

    /* loaded from: classes4.dex */
    public static final class IndexEquals extends IndexEvaluator {
        public IndexEquals(int i) {
            super(i);
        }

        @Override // org.jsoup.select.Evaluator
        public boolean f(Element element, Element element2) {
            if (element2.o2() == this.a) {
                return true;
            }
            return false;
        }

        public String toString() {
            return String.format(":eq(%d)", Integer.valueOf(this.a));
        }
    }

    /* loaded from: classes4.dex */
    public static abstract class IndexEvaluator extends Evaluator {
        public final int a;

        public IndexEvaluator(int i) {
            this.a = i;
        }
    }

    /* loaded from: classes4.dex */
    public static final class IndexGreaterThan extends IndexEvaluator {
        public IndexGreaterThan(int i) {
            super(i);
        }

        @Override // org.jsoup.select.Evaluator
        public boolean f(Element element, Element element2) {
            if (element2.o2() > this.a) {
                return true;
            }
            return false;
        }

        public String toString() {
            return String.format(":gt(%d)", Integer.valueOf(this.a));
        }
    }

    /* loaded from: classes4.dex */
    public static final class IndexLessThan extends IndexEvaluator {
        public IndexLessThan(int i) {
            super(i);
        }

        @Override // org.jsoup.select.Evaluator
        public boolean f(Element element, Element element2) {
            if (element != element2 && element2.o2() < this.a) {
                return true;
            }
            return false;
        }

        public String toString() {
            return String.format(":lt(%d)", Integer.valueOf(this.a));
        }
    }

    /* loaded from: classes4.dex */
    public static final class IsEmpty extends Evaluator {
        @Override // org.jsoup.select.Evaluator
        public boolean f(Element element, Element element2) {
            for (Node b0 = element2.b0(); b0 != null; b0 = b0.v0()) {
                if (b0 instanceof TextNode) {
                    if (!((TextNode) b0).B1()) {
                        return false;
                    }
                } else if (!(b0 instanceof Comment) && !(b0 instanceof XmlDeclaration) && !(b0 instanceof DocumentType)) {
                    return false;
                }
            }
            return true;
        }

        public String toString() {
            return ":empty";
        }
    }

    /* loaded from: classes4.dex */
    public static final class IsFirstChild extends Evaluator {
        @Override // org.jsoup.select.Evaluator
        public boolean f(Element element, Element element2) {
            Element O0 = element2.O0();
            if (O0 != null && !(O0 instanceof Document) && element2 == O0.w2()) {
                return true;
            }
            return false;
        }

        public String toString() {
            return ":first-child";
        }
    }

    /* loaded from: classes4.dex */
    public static final class IsFirstOfType extends IsNthOfType {
        public IsFirstOfType() {
            super(0, 1);
        }

        @Override // org.jsoup.select.Evaluator.CssNthEvaluator
        public String toString() {
            return ":first-of-type";
        }
    }

    /* loaded from: classes4.dex */
    public static final class IsLastChild extends Evaluator {
        @Override // org.jsoup.select.Evaluator
        public boolean f(Element element, Element element2) {
            Element O0 = element2.O0();
            if (O0 != null && !(O0 instanceof Document) && element2 == O0.s3()) {
                return true;
            }
            return false;
        }

        public String toString() {
            return ":last-child";
        }
    }

    /* loaded from: classes4.dex */
    public static final class IsLastOfType extends IsNthLastOfType {
        public IsLastOfType() {
            super(0, 1);
        }

        @Override // org.jsoup.select.Evaluator.CssNthEvaluator
        public String toString() {
            return ":last-of-type";
        }
    }

    /* loaded from: classes4.dex */
    public static final class IsNthChild extends CssNthEvaluator {
        public IsNthChild(int i, int i2) {
            super(i, i2);
        }

        @Override // org.jsoup.select.Evaluator.CssNthEvaluator
        public int k(Element element, Element element2) {
            return element2.o2() + 1;
        }

        @Override // org.jsoup.select.Evaluator.CssNthEvaluator
        public String l() {
            return "nth-child";
        }
    }

    /* loaded from: classes4.dex */
    public static final class IsNthLastChild extends CssNthEvaluator {
        public IsNthLastChild(int i, int i2) {
            super(i, i2);
        }

        @Override // org.jsoup.select.Evaluator.CssNthEvaluator
        public int k(Element element, Element element2) {
            if (element2.O0() == null) {
                return 0;
            }
            return element2.O0().W1() - element2.o2();
        }

        @Override // org.jsoup.select.Evaluator.CssNthEvaluator
        public String l() {
            return "nth-last-child";
        }
    }

    /* loaded from: classes4.dex */
    public static class IsNthLastOfType extends CssNthEvaluator {
        public IsNthLastOfType(int i, int i2) {
            super(i, i2);
        }

        @Override // org.jsoup.select.Evaluator.CssNthEvaluator
        public int k(Element element, Element element2) {
            int i = 0;
            if (element2.O0() == null) {
                return 0;
            }
            for (Element element3 = element2; element3 != null; element3 = element3.u0()) {
                if (element3.C0().equals(element2.C0())) {
                    i++;
                }
            }
            return i;
        }

        @Override // org.jsoup.select.Evaluator.CssNthEvaluator
        public String l() {
            return "nth-last-of-type";
        }
    }

    /* loaded from: classes4.dex */
    public static class IsNthOfType extends CssNthEvaluator {
        public IsNthOfType(int i, int i2) {
            super(i, i2);
        }

        @Override // org.jsoup.select.Evaluator.CssNthEvaluator
        public int k(Element element, Element element2) {
            Element O0 = element2.O0();
            if (O0 == null) {
                return 0;
            }
            int G = O0.G();
            int i = 0;
            for (int i2 = 0; i2 < G; i2++) {
                Node F = O0.F(i2);
                if (F.C0().equals(element2.C0())) {
                    i++;
                }
                if (F == element2) {
                    return i;
                }
            }
            return i;
        }

        @Override // org.jsoup.select.Evaluator.CssNthEvaluator
        public String l() {
            return "nth-of-type";
        }
    }

    /* loaded from: classes4.dex */
    public static final class IsOnlyChild extends Evaluator {
        @Override // org.jsoup.select.Evaluator
        public boolean f(Element element, Element element2) {
            Element O0 = element2.O0();
            if (O0 != null && !(O0 instanceof Document) && element2.x4().isEmpty()) {
                return true;
            }
            return false;
        }

        public String toString() {
            return ":only-child";
        }
    }

    /* loaded from: classes4.dex */
    public static final class IsOnlyOfType extends Evaluator {
        @Override // org.jsoup.select.Evaluator
        public boolean f(Element element, Element element2) {
            Element O0 = element2.O0();
            if (O0 != null && !(O0 instanceof Document)) {
                int i = 0;
                for (Element w2 = O0.w2(); w2 != null; w2 = w2.u0()) {
                    if (w2.C0().equals(element2.C0())) {
                        i++;
                    }
                    if (i > 1) {
                        break;
                    }
                }
                if (i == 1) {
                    return true;
                }
            }
            return false;
        }

        public String toString() {
            return ":only-of-type";
        }
    }

    /* loaded from: classes4.dex */
    public static final class IsRoot extends Evaluator {
        @Override // org.jsoup.select.Evaluator
        public int e() {
            return 1;
        }

        @Override // org.jsoup.select.Evaluator
        public boolean f(Element element, Element element2) {
            if (element instanceof Document) {
                element = element.w2();
            }
            if (element2 == element) {
                return true;
            }
            return false;
        }

        public String toString() {
            return ":root";
        }
    }

    @Deprecated
    /* loaded from: classes4.dex */
    public static final class MatchText extends Evaluator {
        public static boolean a = false;

        public MatchText() {
            if (!a) {
                a = true;
                System.err.println("WARNING: :matchText selector is deprecated and will be removed in a future version. Use Element#selectNodes(String, Class) with selector ::textnode and class TextNode instead.");
            }
        }

        @Override // org.jsoup.select.Evaluator
        public int e() {
            return -1;
        }

        @Override // org.jsoup.select.Evaluator
        public boolean f(Element element, Element element2) {
            if (element2 instanceof PseudoTextElement) {
                return true;
            }
            for (Node node : element2.H4()) {
                PseudoTextElement pseudoTextElement = new PseudoTextElement(org.jsoup.parser.Tag.z(element2.B4(), element2.A4().q(), ParseSettings.d), element2.w(), element2.p());
                node.d1(pseudoTextElement);
                pseudoTextElement.B1(node);
            }
            return false;
        }

        public String toString() {
            return ":matchText";
        }
    }

    /* loaded from: classes4.dex */
    public static final class Matches extends Evaluator {
        public final Pattern a;

        public Matches(Pattern pattern) {
            this.a = pattern;
        }

        @Override // org.jsoup.select.Evaluator
        public int e() {
            return 8;
        }

        @Override // org.jsoup.select.Evaluator
        public boolean f(Element element, Element element2) {
            return this.a.matcher(element2.F4()).find();
        }

        public String toString() {
            return String.format(":matches(%s)", this.a);
        }
    }

    /* loaded from: classes4.dex */
    public static final class MatchesOwn extends Evaluator {
        public final Pattern a;

        public MatchesOwn(Pattern pattern) {
            this.a = pattern;
        }

        @Override // org.jsoup.select.Evaluator
        public int e() {
            return 7;
        }

        @Override // org.jsoup.select.Evaluator
        public boolean f(Element element, Element element2) {
            return this.a.matcher(element2.x3()).find();
        }

        public String toString() {
            return String.format(":matchesOwn(%s)", this.a);
        }
    }

    /* loaded from: classes4.dex */
    public static final class MatchesWholeOwnText extends Evaluator {
        public final Pattern a;

        public MatchesWholeOwnText(Pattern pattern) {
            this.a = pattern;
        }

        @Override // org.jsoup.select.Evaluator
        public int e() {
            return 7;
        }

        @Override // org.jsoup.select.Evaluator
        public boolean f(Element element, Element element2) {
            return this.a.matcher(element2.N4()).find();
        }

        public String toString() {
            return String.format(":matchesWholeOwnText(%s)", this.a);
        }
    }

    /* loaded from: classes4.dex */
    public static final class MatchesWholeText extends Evaluator {
        public final Pattern a;

        public MatchesWholeText(Pattern pattern) {
            this.a = pattern;
        }

        @Override // org.jsoup.select.Evaluator
        public int e() {
            return 8;
        }

        @Override // org.jsoup.select.Evaluator
        public boolean f(Element element, Element element2) {
            return this.a.matcher(element2.O4()).find();
        }

        public String toString() {
            return String.format(":matchesWholeText(%s)", this.a);
        }
    }

    /* loaded from: classes4.dex */
    public static final class Tag extends Evaluator {
        public final String a;

        public Tag(String str) {
            this.a = str;
        }

        @Override // org.jsoup.select.Evaluator
        public int e() {
            return 1;
        }

        @Override // org.jsoup.select.Evaluator
        public boolean f(Element element, Element element2) {
            return element2.t0(this.a);
        }

        public String toString() {
            return String.format("%s", this.a);
        }
    }

    /* loaded from: classes4.dex */
    public static final class TagEndsWith extends Evaluator {
        public final String a;

        public TagEndsWith(String str) {
            this.a = str;
        }

        @Override // org.jsoup.select.Evaluator
        public boolean f(Element element, Element element2) {
            return element2.C0().endsWith(this.a);
        }

        public String toString() {
            return String.format("*|%s", this.a);
        }
    }

    /* loaded from: classes4.dex */
    public static final class TagStartsWith extends Evaluator {
        public final String a;

        public TagStartsWith(String str) {
            this.a = str;
        }

        @Override // org.jsoup.select.Evaluator
        public boolean f(Element element, Element element2) {
            return element2.C0().startsWith(this.a);
        }

        public String toString() {
            return String.format("%s|*", this.a);
        }
    }

    public Predicate<Node> c(final Element element) {
        return new Predicate() { // from class: o.ye0
            @Override // java.util.function.Predicate
            public final boolean test(Object obj) {
                boolean h;
                h = Evaluator.this.h(element, (Node) obj);
                return h;
            }
        };
    }

    public Predicate<Element> d(final Element element) {
        return new Predicate() { // from class: o.ze0
            @Override // java.util.function.Predicate
            public final boolean test(Object obj) {
                boolean f;
                f = Evaluator.this.f(element, (Element) obj);
                return f;
            }
        };
    }

    public int e() {
        return 5;
    }

    public abstract boolean f(Element element, Element element2);

    public boolean g(Element element, LeafNode leafNode) {
        return false;
    }

    public final boolean h(Element element, Node node) {
        if (node instanceof Element) {
            return f(element, (Element) node);
        }
        if ((node instanceof LeafNode) && j()) {
            return g(element, (LeafNode) node);
        }
        return false;
    }

    public void i() {
    }

    public boolean j() {
        return false;
    }

    /* loaded from: classes4.dex */
    public static abstract class CssNthEvaluator extends Evaluator {
        public final int a;
        public final int b;

        public CssNthEvaluator(int i, int i2) {
            this.a = i;
            this.b = i2;
        }

        @Override // org.jsoup.select.Evaluator
        public boolean f(Element element, Element element2) {
            Element O0 = element2.O0();
            if (O0 != null && !(O0 instanceof Document)) {
                int k = k(element, element2);
                int i = this.a;
                if (i == 0) {
                    if (k != this.b) {
                        return false;
                    }
                    return true;
                }
                int i2 = this.b;
                if ((k - i2) * i >= 0 && (k - i2) % i == 0) {
                    return true;
                }
            }
            return false;
        }

        public abstract int k(Element element, Element element2);

        public abstract String l();

        public String toString() {
            String str;
            if (this.a == 0) {
                str = ":%s(%3$d)";
            } else if (this.b == 0) {
                str = ":%s(%2$dn)";
            } else {
                str = ":%s(%2$dn%3$+d)";
            }
            return String.format(str, l(), Integer.valueOf(this.a), Integer.valueOf(this.b));
        }

        public CssNthEvaluator(int i) {
            this(0, i);
        }
    }
}
