package org.jsoup.parser;

import com.facebook.C2381j;
import java.io.Reader;
import java.util.ArrayList;
import java.util.List;
import o.C10928yK2;
import o.C2730De2;
import o.C5445bv2;
import o.C8206nB;
import o.C9642t32;
import o.C9796th2;
import o.C9998uW1;
import o.InterfaceC8148mw2;
import org.jsoup.helper.Validate;
import org.jsoup.internal.Normalizer;
import org.jsoup.internal.StringUtil;
import org.jsoup.nodes.Attributes;
import org.jsoup.nodes.CDataNode;
import org.jsoup.nodes.Comment;
import org.jsoup.nodes.DataNode;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.FormElement;
import org.jsoup.nodes.Node;
import org.jsoup.nodes.TextNode;
import org.jsoup.parser.HtmlTreeBuilderState;
import org.jsoup.parser.Token;

/* loaded from: classes4.dex */
public class HtmlTreeBuilder extends TreeBuilder {
    public static final String[] B = {"applet", "caption", "html", "marquee", "object", "table", "td", C9998uW1.b0, "th"};
    public static final String[] C = {"annotation-xml", "mi", "mn", "mo", "ms", "mtext"};
    public static final String[] D = {"desc", "foreignObject", "title"};
    public static final String[] E = {"ol", "ul"};
    public static final String[] F = {"button"};
    public static final String[] G = {"html", "table"};
    public static final String[] H = {"optgroup", "option"};
    public static final String[] I = {"dd", "dt", "li", "optgroup", "option", "p", "rb", "rp", C10928yK2.w, "rtc"};
    public static final String[] J = {"caption", "colgroup", "dd", "dt", "li", "optgroup", "option", "p", "rb", "rp", C10928yK2.w, "rtc", "tbody", "td", "tfoot", "th", "thead", "tr"};
    public static final String[] K = {"address", "applet", "area", "article", "aside", C5445bv2.X, "basefont", "bgsound", "blockquote", "body", "br", "button", "caption", C5445bv2.m0, "col", "colgroup", "dd", "details", "dir", C5445bv2.q, "dl", "dt", "embed", "fieldset", "figcaption", "figure", "footer", "form", InterfaceC8148mw2.a.L, "frameset", "h1", "h2", "h3", "h4", "h5", "h6", C5445bv2.f701o, C2381j.e1, "hgroup", "hr", "html", "iframe", "img", "input", "keygen", "li", "link", "listing", "main", "marquee", C9796th2.f, "meta", "nav", "noembed", "noframes", "noscript", "object", "ol", "p", "param", "plaintext", "pre", C2730De2.r, "search", "section", "select", "source", "style", "summary", "table", "tbody", "td", C9998uW1.b0, "textarea", "tfoot", "th", "thead", "title", "tr", "track", "ul", "wbr", "xmp"};
    public static String[] L = {"annotation-xml", "mi", "mn", "mo", "ms", "mtext"};
    public static final String[] M = {"mi", "mn", "mo", "ms", "mtext"};
    public static final String[] N = {"desc", "foreignObject", "title"};
    public static final String[] O = {"button", "fieldset", "input", "keygen", "object", "output", "select", "textarea"};
    public static final int P = 100;
    public static final int Q = 256;
    public static final int R = 12;
    public final String[] A = {null};
    public HtmlTreeBuilderState n;

    /* renamed from: o  reason: collision with root package name */
    public HtmlTreeBuilderState f933o;
    public boolean p;
    public Element q;
    public FormElement r;
    public Element s;
    public ArrayList<Element> t;
    public ArrayList<HtmlTreeBuilderState> u;
    public List<Token.Character> v;
    public Token.EndTag w;
    public boolean x;
    public boolean y;
    public boolean z;

    public static boolean A0(Element element) {
        if (Parser.d1.equals(element.A4().q()) && StringUtil.g(element.C0(), M)) {
            return true;
        }
        return false;
    }

    public static boolean B0(Element element, Element element2) {
        if (element.C0().equals(element2.C0()) && element.p().equals(element2.p())) {
            return true;
        }
        return false;
    }

    public static boolean C0(Element element) {
        String q = element.A4().q();
        String C0 = element.C0();
        q.getClass();
        char c = 65535;
        switch (q.hashCode()) {
            case -2078206768:
                if (q.equals(Parser.b1)) {
                    c = 0;
                    break;
                }
                break;
            case -296110905:
                if (q.equals(Parser.e1)) {
                    c = 1;
                    break;
                }
                break;
            case 1725132794:
                if (q.equals(Parser.d1)) {
                    c = 2;
                    break;
                }
                break;
        }
        switch (c) {
            case 0:
                return StringUtil.g(C0, K);
            case 1:
                return StringUtil.g(C0, N);
            case 2:
                return StringUtil.g(C0, L);
            default:
                return false;
        }
    }

    public static boolean I0(ArrayList<Element> arrayList, Element element) {
        int i;
        int size = arrayList.size();
        int i2 = size - 1;
        if (i2 >= 256) {
            i = size - 257;
        } else {
            i = 0;
        }
        while (i2 >= i) {
            if (arrayList.get(i2) == element) {
                return true;
            }
            i2--;
        }
        return false;
    }

    public static void a1(ArrayList<Element> arrayList, Element element, Element element2) {
        boolean z;
        int lastIndexOf = arrayList.lastIndexOf(element);
        if (lastIndexOf != -1) {
            z = true;
        } else {
            z = false;
        }
        Validate.j(z);
        arrayList.set(lastIndexOf, element2);
    }

    public static boolean y0(Element element) {
        if (Parser.d1.equals(element.A4().q()) && element.t0("annotation-xml")) {
            String b = Normalizer.b(element.k("encoding"));
            if (b.equals("text/html") || b.equals("application/xhtml+xml")) {
                return true;
            }
        }
        if (Parser.e1.equals(element.A4().q()) && StringUtil.f(element.B4(), N)) {
            return true;
        }
        return false;
    }

    public Element D(Element element) {
        if (!J0(element)) {
            return null;
        }
        for (int size = this.e.size() - 1; size > 0; size--) {
            if (this.e.get(size) == element) {
                return this.e.get(size - 1);
            }
        }
        return null;
    }

    public Element D0() {
        if (this.t.size() > 0) {
            ArrayList<Element> arrayList = this.t;
            return arrayList.get(arrayList.size() - 1);
        }
        return null;
    }

    public void E(Token.Character character) {
        this.v.add(new Token.Character(character));
    }

    public void E0() {
        this.f933o = this.n;
    }

    public void F(Element element) {
        int size = this.t.size();
        int i = size - 13;
        int i2 = 0;
        if (i < 0) {
            i = 0;
        }
        for (int i3 = size - 1; i3 >= i; i3--) {
            Element element2 = this.t.get(i3);
            if (element2 != null) {
                if (B0(element, element2)) {
                    i2++;
                }
                if (i2 == 3) {
                    this.t.remove(i3);
                    return;
                }
            } else {
                return;
            }
        }
    }

    public void F0(Element element) {
        if (!this.p) {
            String d = element.d(C9642t32.j);
            if (d.length() != 0) {
                this.f = d;
                this.p = true;
                this.d.f1(d);
            }
        }
    }

    public void G() {
        while (!this.t.isEmpty() && Y0() != null) {
        }
    }

    @Override // org.jsoup.parser.TreeBuilder
    /* renamed from: G0 */
    public HtmlTreeBuilder m() {
        return new HtmlTreeBuilder();
    }

    public final void H(String... strArr) {
        for (int size = this.e.size() - 1; size >= 0; size--) {
            Element element = this.e.get(size);
            if (!Parser.b1.equals(element.A4().q()) || (!StringUtil.f(element.C0(), strArr) && !element.t0("html"))) {
                s();
            } else {
                return;
            }
        }
    }

    public boolean H0(String str) {
        if (Z(str) != null) {
            return true;
        }
        return false;
    }

    public void I() {
        H("tbody", "tfoot", "thead", C9998uW1.b0);
    }

    public void J() {
        H("table", C9998uW1.b0);
    }

    public boolean J0(Element element) {
        return I0(this.e, element);
    }

    public void K() {
        H("tr", C9998uW1.b0);
    }

    public boolean K0(String[] strArr) {
        int i;
        int size = this.e.size();
        int i2 = size - 1;
        if (i2 > 100) {
            i = size - 101;
        } else {
            i = 0;
        }
        while (i2 >= i) {
            if (!StringUtil.g(this.e.get(i2).C0(), strArr)) {
                return true;
            }
            i2--;
        }
        return false;
    }

    public void L(String str) {
        T(str);
        if (!str.equals(c().C0())) {
            P(i1());
        }
        M0(str);
    }

    public HtmlTreeBuilderState L0() {
        return this.f933o;
    }

    public Element M(Token.StartTag startTag, String str, boolean z) {
        ParseSettings parseSettings;
        Attributes attributes = startTag.h;
        if (attributes != null && !attributes.isEmpty()) {
            if (!z) {
                this.h.c(attributes);
            }
            if (attributes.D(this.h) > 0) {
                j("Dropped duplicate attribute(s) in tag [%s]", startTag.f);
            }
        }
        String G2 = startTag.G();
        String str2 = startTag.f;
        if (z) {
            parseSettings = ParseSettings.d;
        } else {
            parseSettings = this.h;
        }
        Tag A = A(G2, str2, str, parseSettings);
        if (A.s().equals("form")) {
            return new FormElement(A, null, attributes);
        }
        return new Element(A, null, attributes);
    }

    public Element M0(String str) {
        for (int size = this.e.size() - 1; size >= 0; size--) {
            Element s = s();
            if (s.m2(str, Parser.b1)) {
                return s;
            }
        }
        return null;
    }

    public HtmlTreeBuilderState N() {
        if (this.u.size() > 0) {
            ArrayList<HtmlTreeBuilderState> arrayList = this.u;
            return arrayList.get(arrayList.size() - 1);
        }
        return null;
    }

    public void N0(String... strArr) {
        for (int size = this.e.size() - 1; size >= 0; size--) {
            Element s = s();
            if (StringUtil.g(s.C0(), strArr) && Parser.b1.equals(s.A4().q())) {
                return;
            }
        }
    }

    public final void O(Element element) {
        if (this.r != null && element.A4().X.equals(Parser.b1) && StringUtil.g(element.C0(), O)) {
            this.r.R4(element);
        }
        if (this.a.d().d() && element.j0(XmlTreeBuilder.f937o) && !element.k(XmlTreeBuilder.f937o).equals(element.A4().q())) {
            j("Invalid xmlns attribute [%s] on tag [%s]", element.k(XmlTreeBuilder.f937o), element.B4());
        }
        if (w0() && StringUtil.g(c().C0(), HtmlTreeBuilderState.Constants.A)) {
            t0(element);
        } else {
            c().B1(element);
        }
        x(element);
    }

    public Element O0(String str) {
        for (int size = this.e.size() - 1; size >= 0; size--) {
            Element s = s();
            if (s.t0(str)) {
                return s;
            }
        }
        return null;
    }

    public void P(HtmlTreeBuilderState htmlTreeBuilderState) {
        if (this.a.d().d()) {
            this.a.d().add(new ParseError(this.b, "Unexpected %s token [%s] when in state [%s]", this.g.s(), this.g, htmlTreeBuilderState));
        }
    }

    public HtmlTreeBuilderState P0() {
        if (this.u.size() > 0) {
            ArrayList<HtmlTreeBuilderState> arrayList = this.u;
            return arrayList.remove(arrayList.size() - 1);
        }
        return null;
    }

    public void Q(boolean z) {
        this.x = z;
    }

    public int Q0(Element element) {
        for (int i = 0; i < this.t.size(); i++) {
            if (element == this.t.get(i)) {
                return i;
            }
        }
        return -1;
    }

    public boolean R() {
        return this.x;
    }

    public boolean R0(Token token, HtmlTreeBuilderState htmlTreeBuilderState) {
        return htmlTreeBuilderState.o(token, this);
    }

    public void S() {
        U(false);
    }

    public void S0(Element element) {
        F(element);
        this.t.add(element);
    }

    public void T(String str) {
        while (StringUtil.g(c().C0(), I)) {
            if (str == null || !d(str)) {
                s();
            } else {
                return;
            }
        }
    }

    public void T0(HtmlTreeBuilderState htmlTreeBuilderState) {
        this.u.add(htmlTreeBuilderState);
    }

    public void U(boolean z) {
        String[] strArr;
        if (z) {
            strArr = J;
        } else {
            strArr = I;
        }
        while (Parser.b1.equals(c().A4().q()) && StringUtil.g(c().C0(), strArr)) {
            s();
        }
    }

    public void U0(Element element, int i) {
        F(element);
        try {
            this.t.add(i, element);
        } catch (IndexOutOfBoundsException unused) {
            this.t.add(element);
        }
    }

    public Element V(String str) {
        for (int size = this.t.size() - 1; size >= 0; size--) {
            Element element = this.t.get(size);
            if (element != null) {
                if (element.t0(str)) {
                    return element;
                }
            } else {
                return null;
            }
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x002b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void V0() {
        Element D0;
        if (this.e.size() <= 256 && (D0 = D0()) != null && !J0(D0)) {
            int size = this.t.size();
            int i = size - 12;
            if (i < 0) {
                i = 0;
            }
            boolean z = true;
            int i2 = size - 1;
            int i3 = i2;
            while (i3 != i) {
                i3--;
                D0 = this.t.get(i3);
                if (D0 == null || J0(D0)) {
                    z = false;
                    break;
                }
                while (i3 != i) {
                }
            }
            while (true) {
                if (!z) {
                    i3++;
                    D0 = this.t.get(i3);
                }
                Validate.q(D0);
                Element element = new Element(A(D0.w0(), D0.C0(), f(), this.h), null, D0.p().clone());
                O(element);
                this.t.set(i3, element);
                if (i3 != i2) {
                    z = false;
                } else {
                    return;
                }
            }
        }
    }

    public String W() {
        return this.f;
    }

    public void W0(Element element) {
        for (int size = this.t.size() - 1; size >= 0; size--) {
            if (this.t.get(size) == element) {
                this.t.remove(size);
                return;
            }
        }
    }

    public Document X() {
        return this.d;
    }

    public boolean X0(Element element) {
        for (int size = this.e.size() - 1; size >= 0; size--) {
            if (this.e.get(size) == element) {
                this.e.remove(size);
                o(element);
                return true;
            }
        }
        return false;
    }

    public FormElement Y() {
        return this.r;
    }

    public Element Y0() {
        int size = this.t.size();
        if (size > 0) {
            return this.t.remove(size - 1);
        }
        return null;
    }

    public Element Z(String str) {
        int i;
        int size = this.e.size();
        int i2 = size - 1;
        if (i2 >= 256) {
            i = size - 257;
        } else {
            i = 0;
        }
        while (i2 >= i) {
            Element element = this.e.get(i2);
            if (element.m2(str, Parser.b1)) {
                return element;
            }
            i2--;
        }
        return null;
    }

    public void Z0(Element element, Element element2) {
        a1(this.t, element, element2);
    }

    public Element a0() {
        return this.q;
    }

    @Override // org.jsoup.parser.TreeBuilder
    public List<Node> b() {
        Element element = this.s;
        if (element != null) {
            List<Node> l1 = element.l1();
            if (!l1.isEmpty()) {
                this.s.j3(-1, l1);
            }
            return this.s.H();
        }
        return this.d.H();
    }

    public List<Token.Character> b0() {
        return this.v;
    }

    public void b1(Element element, Element element2) {
        a1(this.e, element, element2);
    }

    public ArrayList<Element> c0() {
        return this.e;
    }

    public void c1() {
        if (!H0("body")) {
            this.e.add(this.d.R4());
        }
        k1(HtmlTreeBuilderState.InBody);
    }

    public boolean d0(String str) {
        return g0(str, F);
    }

    public boolean d1() {
        int i;
        String str;
        HtmlTreeBuilderState htmlTreeBuilderState;
        int size = this.e.size();
        int i2 = size - 1;
        if (i2 >= 256) {
            i = size - 257;
        } else {
            i = 0;
        }
        HtmlTreeBuilderState htmlTreeBuilderState2 = this.n;
        if (this.e.size() == 0) {
            k1(HtmlTreeBuilderState.InBody);
        }
        boolean z = false;
        while (true) {
            if (i2 >= i) {
                Element element = this.e.get(i2);
                if (i2 == i) {
                    if (this.z) {
                        element = this.s;
                    }
                    z = true;
                }
                if (element != null) {
                    str = element.C0();
                } else {
                    str = "";
                }
                if (Parser.b1.equals(element.A4().q())) {
                    str.getClass();
                    char c = 65535;
                    switch (str.hashCode()) {
                        case -1644953643:
                            if (str.equals("frameset")) {
                                c = 0;
                                break;
                            }
                            break;
                        case -1321546630:
                            if (str.equals(C9998uW1.b0)) {
                                c = 1;
                                break;
                            }
                            break;
                        case -906021636:
                            if (str.equals("select")) {
                                c = 2;
                                break;
                            }
                            break;
                        case -636197633:
                            if (str.equals("colgroup")) {
                                c = 3;
                                break;
                            }
                            break;
                        case 3696:
                            if (str.equals("td")) {
                                c = 4;
                                break;
                            }
                            break;
                        case 3700:
                            if (str.equals("th")) {
                                c = 5;
                                break;
                            }
                            break;
                        case 3710:
                            if (str.equals("tr")) {
                                c = 6;
                                break;
                            }
                            break;
                        case 3029410:
                            if (str.equals("body")) {
                                c = 7;
                                break;
                            }
                            break;
                        case 3198432:
                            if (str.equals(C5445bv2.f701o)) {
                                c = '\b';
                                break;
                            }
                            break;
                        case 3213227:
                            if (str.equals("html")) {
                                c = '\t';
                                break;
                            }
                            break;
                        case 110115790:
                            if (str.equals("table")) {
                                c = '\n';
                                break;
                            }
                            break;
                        case 110157846:
                            if (str.equals("tbody")) {
                                c = 11;
                                break;
                            }
                            break;
                        case 110277346:
                            if (str.equals("tfoot")) {
                                c = '\f';
                                break;
                            }
                            break;
                        case 110326868:
                            if (str.equals("thead")) {
                                c = C8206nB.d;
                                break;
                            }
                            break;
                        case 552573414:
                            if (str.equals("caption")) {
                                c = 14;
                                break;
                            }
                            break;
                    }
                    switch (c) {
                        case 0:
                            k1(HtmlTreeBuilderState.InFrameset);
                            break;
                        case 1:
                            HtmlTreeBuilderState N2 = N();
                            Validate.r(N2, "Bug: no template insertion mode on stack!");
                            k1(N2);
                            break;
                        case 2:
                            k1(HtmlTreeBuilderState.InSelect);
                            break;
                        case 3:
                            k1(HtmlTreeBuilderState.InColumnGroup);
                            break;
                        case 4:
                        case 5:
                            if (!z) {
                                k1(HtmlTreeBuilderState.InCell);
                                break;
                            }
                            break;
                        case 6:
                            k1(HtmlTreeBuilderState.InRow);
                            break;
                        case 7:
                            k1(HtmlTreeBuilderState.InBody);
                            break;
                        case '\b':
                            if (!z) {
                                k1(HtmlTreeBuilderState.InHead);
                                break;
                            }
                            break;
                        case '\t':
                            if (this.q == null) {
                                htmlTreeBuilderState = HtmlTreeBuilderState.BeforeHead;
                            } else {
                                htmlTreeBuilderState = HtmlTreeBuilderState.AfterHead;
                            }
                            k1(htmlTreeBuilderState);
                            break;
                        case '\n':
                            k1(HtmlTreeBuilderState.InTable);
                            break;
                        case 11:
                        case '\f':
                        case '\r':
                            k1(HtmlTreeBuilderState.InTableBody);
                            break;
                        case 14:
                            k1(HtmlTreeBuilderState.InCaption);
                            break;
                    }
                    if (z) {
                        k1(HtmlTreeBuilderState.InBody);
                    }
                }
                i2--;
            }
        }
        if (this.n == htmlTreeBuilderState2) {
            return false;
        }
        return true;
    }

    public boolean e0(String str) {
        return g0(str, E);
    }

    public void e1() {
        this.v.clear();
    }

    public boolean f0(String str) {
        return g0(str, null);
    }

    public void f1(FormElement formElement) {
        this.r = formElement;
    }

    @Override // org.jsoup.parser.TreeBuilder
    public ParseSettings g() {
        return ParseSettings.c;
    }

    public boolean g0(String str, String[] strArr) {
        return j0(str, B, strArr);
    }

    public void g1(boolean z) {
        this.y = z;
    }

    public boolean h0(String[] strArr) {
        return k0(strArr, B, null);
    }

    public void h1(Element element) {
        this.q = element;
    }

    public boolean i0(String str) {
        for (int size = this.e.size() - 1; size >= 0; size--) {
            String C0 = this.e.get(size).C0();
            if (C0.equals(str)) {
                return true;
            }
            if (!StringUtil.g(C0, H)) {
                return false;
            }
        }
        return false;
    }

    public HtmlTreeBuilderState i1() {
        return this.n;
    }

    public final boolean j0(String str, String[] strArr, String[] strArr2) {
        String[] strArr3 = this.A;
        strArr3[0] = str;
        return k0(strArr3, strArr, strArr2);
    }

    public int j1() {
        return this.u.size();
    }

    @Override // org.jsoup.parser.TreeBuilder
    public void k(Reader reader, String str, Parser parser) {
        super.k(reader, str, parser);
        this.n = HtmlTreeBuilderState.Initial;
        this.f933o = null;
        this.p = false;
        this.q = null;
        this.r = null;
        this.s = null;
        this.t = new ArrayList<>();
        this.u = new ArrayList<>();
        this.v = new ArrayList();
        this.w = new Token.EndTag(this);
        this.x = true;
        this.y = false;
        this.z = false;
    }

    public final boolean k0(String[] strArr, String[] strArr2, String[] strArr3) {
        int i;
        int size = this.e.size();
        int i2 = size - 1;
        if (i2 > 100) {
            i = size - 101;
        } else {
            i = 0;
        }
        while (i2 >= i) {
            Element element = this.e.get(i2);
            String C0 = element.C0();
            String q = element.A4().q();
            if (q.equals(Parser.b1)) {
                if (StringUtil.g(C0, strArr)) {
                    return true;
                }
                if (StringUtil.g(C0, strArr2)) {
                    return false;
                }
                if (strArr3 != null && StringUtil.g(C0, strArr3)) {
                    return false;
                }
            } else if (strArr2 != B) {
                continue;
            } else if (q.equals(Parser.d1) && StringUtil.g(C0, C)) {
                return false;
            } else {
                if (q.equals(Parser.e1) && StringUtil.g(C0, D)) {
                    return false;
                }
            }
            i2--;
        }
        return false;
    }

    public void k1(HtmlTreeBuilderState htmlTreeBuilderState) {
        this.n = htmlTreeBuilderState;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0051, code lost:
        if (r1.equals(o.C2730De2.r) == false) goto L8;
     */
    @Override // org.jsoup.parser.TreeBuilder
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void l(Element element) {
        this.n = HtmlTreeBuilderState.Initial;
        char c = 1;
        this.z = true;
        if (element != null) {
            String C0 = element.C0();
            this.s = new Element(A(C0, C0, f(), this.h), this.f);
            if (element.N0() != null) {
                this.d.o5(element.N0().n5());
            }
            C0.getClass();
            switch (C0.hashCode()) {
                case -1321546630:
                    if (C0.equals(C9998uW1.b0)) {
                        c = 0;
                        break;
                    }
                    c = 65535;
                    break;
                case -907685685:
                    break;
                case 1973234167:
                    if (C0.equals("plaintext")) {
                        c = 2;
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
                    this.c.y(TokeniserState.Data);
                    T0(HtmlTreeBuilderState.InTemplate);
                    break;
                case 1:
                    this.c.y(TokeniserState.ScriptData);
                    break;
                case 2:
                    this.c.y(TokeniserState.PLAINTEXT);
                    break;
                default:
                    TokeniserState x = this.s.A4().x();
                    if (x != null) {
                        this.c.y(x);
                        break;
                    } else {
                        this.c.y(TokeniserState.Data);
                        break;
                    }
            }
            this.d.B1(this.s);
            x(this.s);
            d1();
            while (element != null) {
                if (element instanceof FormElement) {
                    this.r = (FormElement) element;
                    return;
                }
                element = element.O0();
            }
        }
    }

    public boolean l0(String str) {
        return j0(str, G, null);
    }

    public boolean l1(Token token) {
        if (this.e.isEmpty()) {
            return true;
        }
        Element c = c();
        String q = c.A4().q();
        if (Parser.b1.equals(q)) {
            return true;
        }
        if (A0(c) && ((token.o() && !"mglyph".equals(token.e().f) && !"malignmark".equals(token.e().f)) || token.j())) {
            return true;
        }
        if (Parser.d1.equals(q) && c.t0("annotation-xml") && token.o() && "svg".equals(token.e().f)) {
            return true;
        }
        if (y0(c) && (token.o() || token.j())) {
            return true;
        }
        return token.m();
    }

    public void m0(Token.Character character) {
        n0(character, c());
    }

    public void n0(Token.Character character, Element element) {
        Node textNode;
        String v = character.v();
        if (character.i()) {
            textNode = new CDataNode(v);
        } else if (element.A4().f(Tag.h1)) {
            textNode = new DataNode(v);
        } else {
            textNode = new TextNode(v);
        }
        element.B1(textNode);
        p(textNode);
    }

    public void o0(Token.Comment comment) {
        Comment comment2 = new Comment(comment.v());
        c().B1(comment2);
        p(comment2);
    }

    public Element p0(Token.StartTag startTag) {
        Element M2 = M(startTag, Parser.b1, false);
        O(M2);
        if (startTag.F()) {
            Tag A4 = M2.A4();
            A4.w();
            if (A4.k() && (A4.h() || A4.m())) {
                this.c.y(TokeniserState.Data);
                this.c.n(this.w.p().H(M2.B4()));
                return M2;
            }
            this.c.u("Tag [%s] cannot be self-closing; not a void tag", A4.s());
        }
        return M2;
    }

    public Element q0(Token.StartTag startTag) {
        Element M2 = M(startTag, Parser.b1, false);
        O(M2);
        s();
        return M2;
    }

    public Element r0(Token.StartTag startTag, String str) {
        Element M2 = M(startTag, str, true);
        O(M2);
        if (startTag.F()) {
            M2.A4().w();
            s();
        }
        return M2;
    }

    public FormElement s0(Token.StartTag startTag, boolean z, boolean z2) {
        FormElement formElement = (FormElement) M(startTag, Parser.b1, false);
        if (z2) {
            if (!H0(C9998uW1.b0)) {
                f1(formElement);
            }
        } else {
            f1(formElement);
        }
        O(formElement);
        if (!z) {
            s();
        }
        return formElement;
    }

    @Override // org.jsoup.parser.TreeBuilder
    public boolean t(Token token) {
        HtmlTreeBuilderState htmlTreeBuilderState;
        if (l1(token)) {
            htmlTreeBuilderState = this.n;
        } else {
            htmlTreeBuilderState = HtmlTreeBuilderState.ForeignContent;
        }
        return htmlTreeBuilderState.o(token, this);
    }

    public void t0(Node node) {
        Element element;
        Element Z = Z("table");
        boolean z = false;
        if (Z != null) {
            if (Z.O0() != null) {
                element = Z.O0();
                z = true;
            } else {
                element = D(Z);
            }
        } else {
            element = this.e.get(0);
        }
        if (z) {
            Validate.q(Z);
            Z.D(node);
            return;
        }
        element.B1(node);
    }

    public String toString() {
        return "TreeBuilder{currentToken=" + this.g + ", state=" + this.n + ", currentElement=" + c() + '}';
    }

    public void u0() {
        this.t.add(null);
    }

    public void v0(Element element, Element element2) {
        boolean z;
        int lastIndexOf = this.e.lastIndexOf(element);
        if (lastIndexOf != -1) {
            z = true;
        } else {
            z = false;
        }
        Validate.j(z);
        this.e.add(lastIndexOf + 1, element2);
    }

    public boolean w0() {
        return this.y;
    }

    public boolean x0() {
        return this.z;
    }

    public boolean z0(Element element) {
        return I0(this.t, element);
    }
}
