package org.jsoup.select;

import java.util.function.Function;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import o.C10923yJ1;
import o.C10928yK2;
import o.C5588cW;
import o.C8206nB;
import org.jsoup.helper.Validate;
import org.jsoup.internal.Normalizer;
import org.jsoup.internal.StringUtil;
import org.jsoup.nodes.CDataNode;
import org.jsoup.nodes.Comment;
import org.jsoup.nodes.DataNode;
import org.jsoup.nodes.LeafNode;
import org.jsoup.nodes.Node;
import org.jsoup.nodes.TextNode;
import org.jsoup.parser.TokenQueue;
import org.jsoup.select.CombiningEvaluator;
import org.jsoup.select.Evaluator;
import org.jsoup.select.NodeEvaluator;
import org.jsoup.select.Selector;
import org.jsoup.select.StructuralEvaluator;

/* loaded from: classes4.dex */
public class QueryParser implements AutoCloseable {
    public static final char[] Y0 = {'>', '+', '~'};
    public static final String[] Z0 = {"=", "!=", "^=", "$=", "*=", "~="};
    public static final char[] a1 = {',', ')'};
    public static final Pattern b1 = Pattern.compile("(([+-])?(\\d+)?)n(\\s*([+-])?\\s*\\d+)?", 2);
    public static final Pattern c1 = Pattern.compile("([+-])?(\\d+)");
    public final TokenQueue X;
    public final String Y;
    public boolean Z;

    public QueryParser(String str) {
        Validate.n(str);
        String trim = str.trim();
        this.Y = trim;
        this.X = new TokenQueue(trim);
    }

    public static Evaluator a(Evaluator evaluator, Evaluator evaluator2) {
        if (evaluator == null) {
            return evaluator2;
        }
        if (evaluator instanceof CombiningEvaluator.And) {
            ((CombiningEvaluator.And) evaluator).k(evaluator2);
            return evaluator;
        }
        return new CombiningEvaluator.And(evaluator, evaluator2);
    }

    public static Evaluator j(Evaluator evaluator, char c, Evaluator evaluator2) {
        StructuralEvaluator.ImmediateParentRun immediateParentRun;
        if (c != ' ') {
            if (c != '+') {
                if (c != '>') {
                    if (c == '~') {
                        return a(new StructuralEvaluator.PreviousSibling(evaluator), evaluator2);
                    }
                    throw new Selector.SelectorParseException("Unknown combinator '%s'", Character.valueOf(c));
                }
                if (evaluator instanceof StructuralEvaluator.ImmediateParentRun) {
                    immediateParentRun = (StructuralEvaluator.ImmediateParentRun) evaluator;
                } else {
                    immediateParentRun = new StructuralEvaluator.ImmediateParentRun(evaluator);
                }
                immediateParentRun.n(evaluator2);
                return immediateParentRun;
            }
            return a(new StructuralEvaluator.ImmediatePreviousSibling(evaluator), evaluator2);
        }
        return a(new StructuralEvaluator.Ancestor(evaluator), evaluator2);
    }

    public static Evaluator x(Evaluator evaluator, Evaluator evaluator2) {
        if (evaluator instanceof CombiningEvaluator.Or) {
            ((CombiningEvaluator.Or) evaluator).k(evaluator2);
            return evaluator;
        }
        return new CombiningEvaluator.Or(evaluator, evaluator2);
    }

    public static Evaluator z(String str) {
        try {
            QueryParser queryParser = new QueryParser(str);
            Evaluator y = queryParser.y();
            queryParser.close();
            return y;
        } catch (IllegalArgumentException e) {
            throw new Selector.SelectorParseException(e.getMessage());
        }
    }

    public final Evaluator A(Function<Evaluator, Evaluator> function, String str) {
        Validate.k(this.X.C('('), str);
        Evaluator G = G();
        Validate.k(this.X.C(')'), str);
        return function.apply(G);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0049, code lost:
        if (r0.equals("node") == false) goto L3;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Evaluator C() {
        Evaluator instanceType;
        String m = this.X.m();
        char c = 1;
        this.Z = true;
        m.getClass();
        switch (m.hashCode()) {
            case 3076010:
                if (m.equals("data")) {
                    c = 0;
                    break;
                }
                c = 65535;
                break;
            case 3386882:
                break;
            case 3556653:
                if (m.equals("text")) {
                    c = 2;
                    break;
                }
                c = 65535;
                break;
            case 94504589:
                if (m.equals("cdata")) {
                    c = 3;
                    break;
                }
                c = 65535;
                break;
            case 950398559:
                if (m.equals("comment")) {
                    c = 4;
                    break;
                }
                c = 65535;
                break;
            case 1563127392:
                if (m.equals("leafnode")) {
                    c = 5;
                    break;
                }
                c = 65535;
                break;
            default:
                c = 65535;
                break;
        }
        switch (c) {
            case 0:
                instanceType = new NodeEvaluator.InstanceType(DataNode.class, m);
                break;
            case 1:
                instanceType = new NodeEvaluator.InstanceType(Node.class, m);
                break;
            case 2:
                instanceType = new NodeEvaluator.InstanceType(TextNode.class, m);
                break;
            case 3:
                instanceType = new NodeEvaluator.InstanceType(CDataNode.class, m);
                break;
            case 4:
                instanceType = new NodeEvaluator.InstanceType(Comment.class, m);
                break;
            case 5:
                instanceType = new NodeEvaluator.InstanceType(LeafNode.class, m);
                break;
            default:
                throw new Selector.SelectorParseException("Could not parse query '%s': unknown node type '::%s'", this.Y, m);
        }
        while (true) {
            Evaluator I = I();
            if (I != null) {
                instanceType = a(instanceType, I);
            } else {
                this.Z = false;
                return instanceType;
            }
        }
    }

    public final Evaluator E() {
        String m = this.X.m();
        m.getClass();
        char c = 65535;
        switch (m.hashCode()) {
            case -2141736343:
                if (m.equals("containsData")) {
                    c = 0;
                    break;
                }
                break;
            case -2136991809:
                if (m.equals("first-child")) {
                    c = 1;
                    break;
                }
                break;
            case -1939921007:
                if (m.equals("matchesWholeText")) {
                    c = 2;
                    break;
                }
                break;
            case -1754914063:
                if (m.equals("nth-child")) {
                    c = 3;
                    break;
                }
                break;
            case -1629748624:
                if (m.equals("nth-last-child")) {
                    c = 4;
                    break;
                }
                break;
            case -947996741:
                if (m.equals("only-child")) {
                    c = 5;
                    break;
                }
                break;
            case -897532411:
                if (m.equals("nth-of-type")) {
                    c = 6;
                    break;
                }
                break;
            case -872629820:
                if (m.equals("nth-last-of-type")) {
                    c = 7;
                    break;
                }
                break;
            case -567445985:
                if (m.equals("contains")) {
                    c = '\b';
                    break;
                }
                break;
            case -55413797:
                if (m.equals("containsWholeOwnText")) {
                    c = '\t';
                    break;
                }
                break;
            case 3244:
                if (m.equals("eq")) {
                    c = '\n';
                    break;
                }
                break;
            case 3309:
                if (m.equals(C10928yK2.f915o)) {
                    c = 11;
                    break;
                }
                break;
            case 3370:
                if (m.equals("is")) {
                    c = '\f';
                    break;
                }
                break;
            case 3464:
                if (m.equals(C10928yK2.n)) {
                    c = C8206nB.d;
                    break;
                }
                break;
            case 103066:
                if (m.equals("has")) {
                    c = 14;
                    break;
                }
                break;
            case 109267:
                if (m.equals("not")) {
                    c = 15;
                    break;
                }
                break;
            case 3506402:
                if (m.equals("root")) {
                    c = 16;
                    break;
                }
                break;
            case 93819220:
                if (m.equals("blank")) {
                    c = 17;
                    break;
                }
                break;
            case 96634189:
                if (m.equals("empty")) {
                    c = 18;
                    break;
                }
                break;
            case 208017639:
                if (m.equals("containsOwn")) {
                    c = 19;
                    break;
                }
                break;
            case 614017170:
                if (m.equals("matchText")) {
                    c = 20;
                    break;
                }
                break;
            case 835834661:
                if (m.equals("last-child")) {
                    c = 21;
                    break;
                }
                break;
            case 840862003:
                if (m.equals("matches")) {
                    c = 22;
                    break;
                }
                break;
            case 1255901423:
                if (m.equals("matchesWholeOwnText")) {
                    c = 23;
                    break;
                }
                break;
            case 1292941139:
                if (m.equals("first-of-type")) {
                    c = 24;
                    break;
                }
                break;
            case 1455900751:
                if (m.equals("only-of-type")) {
                    c = 25;
                    break;
                }
                break;
            case 1870740819:
                if (m.equals("matchesOwn")) {
                    c = 26;
                    break;
                }
                break;
            case 2014184485:
                if (m.equals("containsWholeText")) {
                    c = 27;
                    break;
                }
                break;
            case 2025926969:
                if (m.equals("last-of-type")) {
                    c = C5588cW.n;
                    break;
                }
                break;
        }
        switch (c) {
            case 0:
                return n();
            case 1:
                return new Evaluator.IsFirstChild();
            case 2:
                return u(false);
            case 3:
                return p(false, false);
            case 4:
                return p(true, false);
            case 5:
                return new Evaluator.IsOnlyChild();
            case 6:
                return p(false, true);
            case 7:
                return p(true, true);
            case '\b':
                return m(false);
            case '\t':
                return o(true);
            case '\n':
                return new Evaluator.IndexEquals(k());
            case 11:
                return new Evaluator.IndexGreaterThan(k());
            case '\f':
                return s();
            case '\r':
                return new Evaluator.IndexLessThan(k());
            case 14:
                return r();
            case 15:
                return v();
            case 16:
                return new Evaluator.IsRoot();
            case 17:
                return new NodeEvaluator.BlankValue();
            case 18:
                return new Evaluator.IsEmpty();
            case 19:
                return m(true);
            case 20:
                return new Evaluator.MatchText();
            case 21:
                return new Evaluator.IsLastChild();
            case 22:
                return t(false);
            case 23:
                return u(true);
            case 24:
                return new Evaluator.IsFirstOfType();
            case 25:
                return new Evaluator.IsOnlyOfType();
            case 26:
                return t(true);
            case 27:
                return o(false);
            case 28:
                return new Evaluator.IsLastOfType();
            default:
                throw new Selector.SelectorParseException("Could not parse query '%s': unexpected token at '%s'", this.Y, this.X.O());
        }
    }

    public Evaluator F() {
        Evaluator H;
        char c;
        this.X.r();
        if (this.X.H(Y0)) {
            H = new StructuralEvaluator.Root();
        } else {
            H = H();
        }
        while (true) {
            if (this.X.r()) {
                c = ' ';
            } else {
                c = 0;
            }
            if (this.X.H(Y0)) {
                c = this.X.j();
            } else if (this.X.H(a1)) {
                break;
            }
            if (c == 0) {
                break;
            }
            H = j(H, c, H());
        }
        return H;
    }

    public Evaluator G() {
        Evaluator F = F();
        while (this.X.C(',')) {
            F = x(F, F());
        }
        return F;
    }

    public Evaluator H() {
        Evaluator i;
        this.X.r();
        if (!this.X.N() && !this.X.G("*|")) {
            if (this.X.C('*')) {
                i = new Evaluator.AllElements();
            } else {
                i = null;
            }
        } else {
            i = i();
        }
        while (true) {
            Evaluator I = I();
            if (I == null) {
                break;
            }
            i = a(i, I);
        }
        if (i != null) {
            return i;
        }
        throw new Selector.SelectorParseException("Could not parse query '%s': unexpected token at '%s'", this.Y, this.X.O());
    }

    public Evaluator I() {
        if (this.X.C('#')) {
            return h();
        }
        if (this.X.C('.')) {
            return f();
        }
        if (this.X.F('[')) {
            return d();
        }
        if (this.X.E(C10923yJ1.d)) {
            return C();
        }
        if (this.X.C(':')) {
            return E();
        }
        return null;
    }

    @Override // java.lang.AutoCloseable
    public void close() {
        this.X.close();
    }

    public final Evaluator d() {
        TokenQueue tokenQueue = new TokenQueue(this.X.i('[', ']'));
        try {
            Evaluator q = q(tokenQueue);
            tokenQueue.close();
            return q;
        } catch (Throwable th) {
            try {
                tokenQueue.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public final Evaluator f() {
        String m = this.X.m();
        Validate.n(m);
        return new Evaluator.Class(m.trim());
    }

    public final Evaluator h() {
        String m = this.X.m();
        Validate.n(m);
        return new Evaluator.Id(m);
    }

    public final Evaluator i() {
        String b = Normalizer.b(this.X.n());
        Validate.n(b);
        if (b.startsWith("*|")) {
            String substring = b.substring(2);
            Evaluator.Tag tag = new Evaluator.Tag(substring);
            return new CombiningEvaluator.Or(tag, new Evaluator.TagEndsWith(":" + substring));
        } else if (b.endsWith("|*")) {
            return new Evaluator.TagStartsWith(b.substring(0, b.length() - 2) + ":");
        } else {
            if (b.contains("|")) {
                b = b.replace("|", ":");
            }
            return new Evaluator.Tag(b);
        }
    }

    public final int k() {
        String trim = l().trim();
        Validate.k(StringUtil.o(trim), "Index must be numeric");
        return Integer.parseInt(trim);
    }

    public final String l() {
        return this.X.i('(', ')');
    }

    public final Evaluator m(boolean z) {
        String str;
        if (z) {
            str = ":containsOwn";
        } else {
            str = ":contains";
        }
        String P = TokenQueue.P(l());
        Validate.o(P, str + "(text) query must not be empty");
        if (this.Z) {
            return new NodeEvaluator.ContainsValue(P);
        }
        if (z) {
            return new Evaluator.ContainsOwnText(P);
        }
        return new Evaluator.ContainsText(P);
    }

    public final Evaluator n() {
        String P = TokenQueue.P(l());
        Validate.o(P, ":containsData(text) query must not be empty");
        return new Evaluator.ContainsData(P);
    }

    public final Evaluator o(boolean z) {
        String str;
        if (z) {
            str = ":containsWholeOwnText";
        } else {
            str = ":containsWholeText";
        }
        String P = TokenQueue.P(l());
        Validate.o(P, str + "(text) query must not be empty");
        if (z) {
            return new Evaluator.ContainsWholeOwnText(P);
        }
        return new Evaluator.ContainsWholeText(P);
    }

    public final Evaluator p(boolean z, boolean z2) {
        String b = Normalizer.b(l());
        int i = 1;
        int i2 = 2;
        if (!"odd".equals(b)) {
            if (!"even".equals(b)) {
                Matcher matcher = b1.matcher(b);
                if (matcher.matches()) {
                    if (matcher.group(3) != null) {
                        i2 = Integer.parseInt(matcher.group(1).replaceFirst("^\\+", ""));
                    } else {
                        if ("-".equals(matcher.group(2))) {
                            i = -1;
                        }
                        i2 = i;
                    }
                    if (matcher.group(4) != null) {
                        i = Integer.parseInt(matcher.group(4).replaceFirst("^\\+", ""));
                    }
                } else {
                    Matcher matcher2 = c1.matcher(b);
                    if (matcher2.matches()) {
                        i = Integer.parseInt(matcher2.group().replaceFirst("^\\+", ""));
                        i2 = 0;
                    } else {
                        throw new Selector.SelectorParseException("Could not parse nth-index '%s': unexpected format", b);
                    }
                }
            }
            i = 0;
        }
        if (z2) {
            if (z) {
                return new Evaluator.IsNthLastOfType(i2, i);
            }
            return new Evaluator.IsNthOfType(i2, i);
        } else if (z) {
            return new Evaluator.IsNthLastChild(i2, i);
        } else {
            return new Evaluator.IsNthChild(i2, i);
        }
    }

    public final Evaluator q(TokenQueue tokenQueue) {
        String q = tokenQueue.q(Z0);
        Validate.n(q);
        tokenQueue.r();
        if (tokenQueue.u()) {
            if (q.startsWith("^")) {
                return new Evaluator.AttributeStarting(q.substring(1));
            }
            if (q.equals("*")) {
                return new Evaluator.AttributeStarting("");
            }
            return new Evaluator.Attribute(q);
        } else if (tokenQueue.C('=')) {
            return new Evaluator.AttributeWithValue(q, tokenQueue.O());
        } else {
            if (tokenQueue.E("!=")) {
                return new Evaluator.AttributeWithValueNot(q, tokenQueue.O());
            }
            if (tokenQueue.E("^=")) {
                return new Evaluator.AttributeWithValueStarting(q, tokenQueue.O());
            }
            if (tokenQueue.E("$=")) {
                return new Evaluator.AttributeWithValueEnding(q, tokenQueue.O());
            }
            if (tokenQueue.E("*=")) {
                return new Evaluator.AttributeWithValueContaining(q, tokenQueue.O());
            }
            if (tokenQueue.E("~=")) {
                return new Evaluator.AttributeWithValueMatching(q, Pattern.compile(tokenQueue.O()));
            }
            throw new Selector.SelectorParseException("Could not parse attribute query '%s': unexpected token at '%s'", this.Y, tokenQueue.O());
        }
    }

    public final Evaluator r() {
        return A(new Function() { // from class: org.jsoup.select.b
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return new StructuralEvaluator.Has((Evaluator) obj);
            }
        }, ":has() must have a selector");
    }

    public final Evaluator s() {
        return A(new Function() { // from class: org.jsoup.select.a
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return new StructuralEvaluator.Is((Evaluator) obj);
            }
        }, ":is() must have a selector");
    }

    public final Evaluator t(boolean z) {
        String str;
        if (z) {
            str = ":matchesOwn";
        } else {
            str = ":matches";
        }
        String l = l();
        Validate.o(l, str + "(regex) query must not be empty");
        Pattern compile = Pattern.compile(l);
        if (this.Z) {
            return new NodeEvaluator.MatchesValue(compile);
        }
        if (z) {
            return new Evaluator.MatchesOwn(compile);
        }
        return new Evaluator.Matches(compile);
    }

    public String toString() {
        return this.Y;
    }

    public final Evaluator u(boolean z) {
        String str;
        if (z) {
            str = ":matchesWholeOwnText";
        } else {
            str = ":matchesWholeText";
        }
        String l = l();
        Validate.o(l, str + "(regex) query must not be empty");
        if (z) {
            return new Evaluator.MatchesWholeOwnText(Pattern.compile(l));
        }
        return new Evaluator.MatchesWholeText(Pattern.compile(l));
    }

    public final Evaluator v() {
        String l = l();
        Validate.o(l, ":not(selector) subselect must not be empty");
        return new StructuralEvaluator.Not(z(l));
    }

    public Evaluator y() {
        Evaluator G = G();
        this.X.r();
        if (this.X.u()) {
            return G;
        }
        throw new Selector.SelectorParseException("Could not parse query '%s': unexpected token at '%s'", this.Y, this.X.O());
    }
}
