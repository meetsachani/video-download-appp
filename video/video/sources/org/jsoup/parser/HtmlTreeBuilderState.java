package org.jsoup.parser;

import com.facebook.C2381j;
import com.facebook.C2383l;
import com.facebook.appevents.Q;
import java.util.ArrayList;
import java.util.Iterator;
import o.C10928yK2;
import o.C2730De2;
import o.C3599Ly1;
import o.C4317Th1;
import o.C5445bv2;
import o.C5588cW;
import o.C8206nB;
import o.C9642t32;
import o.C9796th2;
import o.C9998uW1;
import o.InterfaceC8148mw2;
import o.VN2;
import org.jsoup.helper.Validate;
import org.jsoup.internal.StringUtil;
import org.jsoup.nodes.Attribute;
import org.jsoup.nodes.Attributes;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.DocumentType;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.FormElement;
import org.jsoup.nodes.Node;
import org.jsoup.nodes.Range;
import org.jsoup.parser.Token;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes4.dex */
public enum HtmlTreeBuilderState {
    Initial { // from class: org.jsoup.parser.HtmlTreeBuilderState.1
        @Override // org.jsoup.parser.HtmlTreeBuilderState
        public boolean o(Token token, HtmlTreeBuilder htmlTreeBuilder) {
            if (HtmlTreeBuilderState.m(token)) {
                return true;
            }
            if (token.k()) {
                htmlTreeBuilder.o0(token.b());
            } else if (token.l()) {
                Token.Doctype c = token.c();
                DocumentType documentType = new DocumentType(htmlTreeBuilder.h.d(c.t()), c.v(), c.w());
                documentType.B1(c.u());
                htmlTreeBuilder.X().B1(documentType);
                htmlTreeBuilder.p(documentType);
                if (c.x() || !documentType.z1().equals("html") || documentType.A1().equalsIgnoreCase("HTML")) {
                    htmlTreeBuilder.X().o5(Document.QuirksMode.quirks);
                }
                htmlTreeBuilder.k1(HtmlTreeBuilderState.BeforeHtml);
            } else {
                htmlTreeBuilder.X().o5(Document.QuirksMode.quirks);
                htmlTreeBuilder.k1(HtmlTreeBuilderState.BeforeHtml);
                return htmlTreeBuilder.t(token);
            }
            return true;
        }
    },
    BeforeHtml { // from class: org.jsoup.parser.HtmlTreeBuilderState.2
        private boolean p(Token token, HtmlTreeBuilder htmlTreeBuilder) {
            htmlTreeBuilder.v("html");
            htmlTreeBuilder.k1(HtmlTreeBuilderState.BeforeHead);
            return htmlTreeBuilder.t(token);
        }

        @Override // org.jsoup.parser.HtmlTreeBuilderState
        public boolean o(Token token, HtmlTreeBuilder htmlTreeBuilder) {
            if (token.l()) {
                htmlTreeBuilder.P(this);
                return false;
            } else if (token.k()) {
                htmlTreeBuilder.o0(token.b());
                return true;
            } else if (HtmlTreeBuilderState.m(token)) {
                htmlTreeBuilder.m0(token.a());
                return true;
            } else if (token.o() && token.e().J().equals("html")) {
                htmlTreeBuilder.p0(token.e());
                htmlTreeBuilder.k1(HtmlTreeBuilderState.BeforeHead);
                return true;
            } else if (token.n() && StringUtil.g(token.d().J(), Constants.e)) {
                return p(token, htmlTreeBuilder);
            } else {
                if (token.n()) {
                    htmlTreeBuilder.P(this);
                    return false;
                }
                return p(token, htmlTreeBuilder);
            }
        }
    },
    BeforeHead { // from class: org.jsoup.parser.HtmlTreeBuilderState.3
        @Override // org.jsoup.parser.HtmlTreeBuilderState
        public boolean o(Token token, HtmlTreeBuilder htmlTreeBuilder) {
            if (HtmlTreeBuilderState.m(token)) {
                htmlTreeBuilder.m0(token.a());
                return true;
            } else if (token.k()) {
                htmlTreeBuilder.o0(token.b());
                return true;
            } else if (token.l()) {
                htmlTreeBuilder.P(this);
                return false;
            } else if (token.o() && token.e().J().equals("html")) {
                return HtmlTreeBuilderState.InBody.o(token, htmlTreeBuilder);
            } else {
                if (token.o() && token.e().J().equals(C5445bv2.f701o)) {
                    htmlTreeBuilder.h1(htmlTreeBuilder.p0(token.e()));
                    htmlTreeBuilder.k1(HtmlTreeBuilderState.InHead);
                    return true;
                } else if (token.n() && StringUtil.g(token.d().J(), Constants.e)) {
                    htmlTreeBuilder.v(C5445bv2.f701o);
                    return htmlTreeBuilder.t(token);
                } else if (token.n()) {
                    htmlTreeBuilder.P(this);
                    return false;
                } else {
                    htmlTreeBuilder.v(C5445bv2.f701o);
                    return htmlTreeBuilder.t(token);
                }
            }
        }
    },
    InHead { // from class: org.jsoup.parser.HtmlTreeBuilderState.4
        @Override // org.jsoup.parser.HtmlTreeBuilderState
        public boolean o(Token token, HtmlTreeBuilder htmlTreeBuilder) {
            if (HtmlTreeBuilderState.m(token)) {
                htmlTreeBuilder.m0(token.a());
                return true;
            }
            int i = AnonymousClass25.a[token.a.ordinal()];
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        if (i != 4) {
                            return p(token, htmlTreeBuilder);
                        }
                        String J = token.d().J();
                        if (J.equals(C5445bv2.f701o)) {
                            htmlTreeBuilder.s();
                            htmlTreeBuilder.k1(HtmlTreeBuilderState.AfterHead);
                        } else if (StringUtil.g(J, Constants.c)) {
                            return p(token, htmlTreeBuilder);
                        } else {
                            if (J.equals(C9998uW1.b0)) {
                                if (!htmlTreeBuilder.H0(J)) {
                                    htmlTreeBuilder.P(this);
                                } else {
                                    htmlTreeBuilder.U(true);
                                    if (!htmlTreeBuilder.d(J)) {
                                        htmlTreeBuilder.P(this);
                                    }
                                    htmlTreeBuilder.M0(J);
                                    htmlTreeBuilder.G();
                                    htmlTreeBuilder.P0();
                                    htmlTreeBuilder.d1();
                                }
                            } else {
                                htmlTreeBuilder.P(this);
                                return false;
                            }
                        }
                    } else {
                        Token.StartTag e = token.e();
                        String J2 = e.J();
                        if (J2.equals("html")) {
                            return HtmlTreeBuilderState.InBody.o(token, htmlTreeBuilder);
                        }
                        if (StringUtil.g(J2, Constants.a)) {
                            Element q0 = htmlTreeBuilder.q0(e);
                            if (J2.equals(C5445bv2.X) && q0.j0(C9642t32.j)) {
                                htmlTreeBuilder.F0(q0);
                            }
                        } else if (J2.equals("meta")) {
                            htmlTreeBuilder.q0(e);
                        } else if (J2.equals("title")) {
                            HtmlTreeBuilderState.g(e, htmlTreeBuilder, htmlTreeBuilder.B(e).x());
                        } else if (StringUtil.g(J2, Constants.b)) {
                            HtmlTreeBuilderState.g(e, htmlTreeBuilder, htmlTreeBuilder.B(e).x());
                        } else if (J2.equals("noscript")) {
                            htmlTreeBuilder.p0(e);
                            htmlTreeBuilder.k1(HtmlTreeBuilderState.InHeadNoscript);
                        } else if (J2.equals(C2730De2.r)) {
                            htmlTreeBuilder.c.y(TokeniserState.ScriptData);
                            htmlTreeBuilder.E0();
                            htmlTreeBuilder.k1(HtmlTreeBuilderState.Text);
                            htmlTreeBuilder.p0(e);
                        } else if (J2.equals(C5445bv2.f701o)) {
                            htmlTreeBuilder.P(this);
                            return false;
                        } else if (J2.equals(C9998uW1.b0)) {
                            htmlTreeBuilder.p0(e);
                            htmlTreeBuilder.u0();
                            htmlTreeBuilder.Q(false);
                            HtmlTreeBuilderState htmlTreeBuilderState = HtmlTreeBuilderState.InTemplate;
                            htmlTreeBuilder.k1(htmlTreeBuilderState);
                            htmlTreeBuilder.T0(htmlTreeBuilderState);
                        } else {
                            return p(token, htmlTreeBuilder);
                        }
                    }
                } else {
                    htmlTreeBuilder.P(this);
                    return false;
                }
            } else {
                htmlTreeBuilder.o0(token.b());
            }
            return true;
        }

        public final boolean p(Token token, TreeBuilder treeBuilder) {
            treeBuilder.u(C5445bv2.f701o);
            return treeBuilder.t(token);
        }
    },
    InHeadNoscript { // from class: org.jsoup.parser.HtmlTreeBuilderState.5
        private boolean p(Token token, HtmlTreeBuilder htmlTreeBuilder) {
            htmlTreeBuilder.P(this);
            htmlTreeBuilder.m0(new Token.Character().u(token.toString()));
            return true;
        }

        @Override // org.jsoup.parser.HtmlTreeBuilderState
        public boolean o(Token token, HtmlTreeBuilder htmlTreeBuilder) {
            if (token.l()) {
                htmlTreeBuilder.P(this);
                return true;
            } else if (token.o() && token.e().J().equals("html")) {
                return htmlTreeBuilder.R0(token, HtmlTreeBuilderState.InBody);
            } else {
                if (token.n() && token.d().J().equals("noscript")) {
                    htmlTreeBuilder.s();
                    htmlTreeBuilder.k1(HtmlTreeBuilderState.InHead);
                    return true;
                } else if (!HtmlTreeBuilderState.m(token) && !token.k() && (!token.o() || !StringUtil.g(token.e().J(), Constants.f))) {
                    if (token.n() && token.d().J().equals("br")) {
                        return p(token, htmlTreeBuilder);
                    }
                    if ((token.o() && StringUtil.g(token.e().J(), Constants.I)) || token.n()) {
                        htmlTreeBuilder.P(this);
                        return false;
                    }
                    return p(token, htmlTreeBuilder);
                } else {
                    return htmlTreeBuilder.R0(token, HtmlTreeBuilderState.InHead);
                }
            }
        }
    },
    AfterHead { // from class: org.jsoup.parser.HtmlTreeBuilderState.6
        private boolean p(Token token, HtmlTreeBuilder htmlTreeBuilder) {
            htmlTreeBuilder.v("body");
            htmlTreeBuilder.Q(true);
            return htmlTreeBuilder.t(token);
        }

        @Override // org.jsoup.parser.HtmlTreeBuilderState
        public boolean o(Token token, HtmlTreeBuilder htmlTreeBuilder) {
            if (HtmlTreeBuilderState.m(token)) {
                htmlTreeBuilder.m0(token.a());
                return true;
            } else if (token.k()) {
                htmlTreeBuilder.o0(token.b());
                return true;
            } else if (token.l()) {
                htmlTreeBuilder.P(this);
                return true;
            } else if (token.o()) {
                Token.StartTag e = token.e();
                String J = e.J();
                if (J.equals("html")) {
                    return htmlTreeBuilder.R0(token, HtmlTreeBuilderState.InBody);
                }
                if (J.equals("body")) {
                    htmlTreeBuilder.p0(e);
                    htmlTreeBuilder.Q(false);
                    htmlTreeBuilder.k1(HtmlTreeBuilderState.InBody);
                    return true;
                } else if (J.equals("frameset")) {
                    htmlTreeBuilder.p0(e);
                    htmlTreeBuilder.k1(HtmlTreeBuilderState.InFrameset);
                    return true;
                } else if (StringUtil.g(J, Constants.g)) {
                    htmlTreeBuilder.P(this);
                    Element a0 = htmlTreeBuilder.a0();
                    htmlTreeBuilder.x(a0);
                    htmlTreeBuilder.R0(token, HtmlTreeBuilderState.InHead);
                    htmlTreeBuilder.X0(a0);
                    return true;
                } else if (J.equals(C5445bv2.f701o)) {
                    htmlTreeBuilder.P(this);
                    return false;
                } else {
                    p(token, htmlTreeBuilder);
                    return true;
                }
            } else if (token.n()) {
                String J2 = token.d().J();
                if (StringUtil.g(J2, Constants.d)) {
                    p(token, htmlTreeBuilder);
                    return true;
                } else if (J2.equals(C9998uW1.b0)) {
                    htmlTreeBuilder.R0(token, HtmlTreeBuilderState.InHead);
                    return true;
                } else {
                    htmlTreeBuilder.P(this);
                    return false;
                }
            } else {
                p(token, htmlTreeBuilder);
                return true;
            }
        }
    },
    InBody { // from class: org.jsoup.parser.HtmlTreeBuilderState.7
        public static final int v1 = 24;

        @Override // org.jsoup.parser.HtmlTreeBuilderState
        public boolean o(Token token, HtmlTreeBuilder htmlTreeBuilder) {
            switch (AnonymousClass25.a[token.a.ordinal()]) {
                case 1:
                    htmlTreeBuilder.o0(token.b());
                    return true;
                case 2:
                    htmlTreeBuilder.P(this);
                    return false;
                case 3:
                    return s(token, htmlTreeBuilder);
                case 4:
                    return q(token, htmlTreeBuilder);
                case 5:
                    Token.Character a = token.a();
                    if (a.v().equals(HtmlTreeBuilderState.t1)) {
                        htmlTreeBuilder.P(this);
                        return false;
                    } else if (htmlTreeBuilder.R() && HtmlTreeBuilderState.m(a)) {
                        htmlTreeBuilder.V0();
                        htmlTreeBuilder.m0(a);
                        return true;
                    } else {
                        htmlTreeBuilder.V0();
                        htmlTreeBuilder.m0(a);
                        htmlTreeBuilder.Q(false);
                        return true;
                    }
                case 6:
                    if (htmlTreeBuilder.j1() > 0) {
                        return htmlTreeBuilder.R0(token, HtmlTreeBuilderState.InTemplate);
                    }
                    if (htmlTreeBuilder.K0(Constants.q)) {
                        htmlTreeBuilder.P(this);
                        return true;
                    }
                    return true;
                default:
                    Validate.t("Unexpected state: " + token.a);
                    return true;
            }
        }

        /* JADX WARN: Code restructure failed: missing block: B:19:0x0046, code lost:
            return true;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public boolean p(Token token, HtmlTreeBuilder htmlTreeBuilder) {
            String str = token.d().f;
            ArrayList<Element> c0 = htmlTreeBuilder.c0();
            if (htmlTreeBuilder.Z(str) == null) {
                htmlTreeBuilder.P(this);
                return false;
            }
            int size = c0.size() - 1;
            while (true) {
                if (size < 0) {
                    break;
                }
                Element element = c0.get(size);
                if (element.t0(str)) {
                    htmlTreeBuilder.T(str);
                    if (!htmlTreeBuilder.d(str)) {
                        htmlTreeBuilder.P(this);
                    }
                    htmlTreeBuilder.M0(str);
                } else if (HtmlTreeBuilder.C0(element)) {
                    htmlTreeBuilder.P(this);
                    return false;
                } else {
                    size--;
                }
            }
        }

        public final boolean q(Token token, HtmlTreeBuilder htmlTreeBuilder) {
            Token.EndTag d = token.d();
            String J = d.J();
            J.getClass();
            char c = 65535;
            switch (J.hashCode()) {
                case -1321546630:
                    if (J.equals(C9998uW1.b0)) {
                        c = 0;
                        break;
                    }
                    break;
                case 112:
                    if (J.equals("p")) {
                        c = 1;
                        break;
                    }
                    break;
                case 3152:
                    if (J.equals("br")) {
                        c = 2;
                        break;
                    }
                    break;
                case 3200:
                    if (J.equals("dd")) {
                        c = 3;
                        break;
                    }
                    break;
                case 3216:
                    if (J.equals("dt")) {
                        c = 4;
                        break;
                    }
                    break;
                case 3273:
                    if (J.equals("h1")) {
                        c = 5;
                        break;
                    }
                    break;
                case 3274:
                    if (J.equals("h2")) {
                        c = 6;
                        break;
                    }
                    break;
                case 3275:
                    if (J.equals("h3")) {
                        c = 7;
                        break;
                    }
                    break;
                case 3276:
                    if (J.equals("h4")) {
                        c = '\b';
                        break;
                    }
                    break;
                case 3277:
                    if (J.equals("h5")) {
                        c = '\t';
                        break;
                    }
                    break;
                case 3278:
                    if (J.equals("h6")) {
                        c = '\n';
                        break;
                    }
                    break;
                case 3453:
                    if (J.equals("li")) {
                        c = 11;
                        break;
                    }
                    break;
                case 3029410:
                    if (J.equals("body")) {
                        c = '\f';
                        break;
                    }
                    break;
                case 3148996:
                    if (J.equals("form")) {
                        c = C8206nB.d;
                        break;
                    }
                    break;
                case 3213227:
                    if (J.equals("html")) {
                        c = 14;
                        break;
                    }
                    break;
                case 3536714:
                    if (J.equals(C5445bv2.s)) {
                        c = 15;
                        break;
                    }
                    break;
                case 1869063452:
                    if (J.equals("sarcasm")) {
                        c = 16;
                        break;
                    }
                    break;
            }
            switch (c) {
                case 0:
                    htmlTreeBuilder.R0(token, HtmlTreeBuilderState.InHead);
                    break;
                case 1:
                    if (!htmlTreeBuilder.d0(J)) {
                        htmlTreeBuilder.P(this);
                        htmlTreeBuilder.v(J);
                        return htmlTreeBuilder.t(d);
                    }
                    htmlTreeBuilder.T(J);
                    if (!htmlTreeBuilder.d(J)) {
                        htmlTreeBuilder.P(this);
                    }
                    htmlTreeBuilder.M0(J);
                    break;
                case 2:
                    htmlTreeBuilder.P(this);
                    htmlTreeBuilder.v("br");
                    return false;
                case 3:
                case 4:
                    if (!htmlTreeBuilder.f0(J)) {
                        htmlTreeBuilder.P(this);
                        return false;
                    }
                    htmlTreeBuilder.T(J);
                    if (!htmlTreeBuilder.d(J)) {
                        htmlTreeBuilder.P(this);
                    }
                    htmlTreeBuilder.M0(J);
                    break;
                case 5:
                case 6:
                case 7:
                case '\b':
                case '\t':
                case '\n':
                    String[] strArr = Constants.i;
                    if (!htmlTreeBuilder.h0(strArr)) {
                        htmlTreeBuilder.P(this);
                        return false;
                    }
                    htmlTreeBuilder.T(J);
                    if (!htmlTreeBuilder.d(J)) {
                        htmlTreeBuilder.P(this);
                    }
                    htmlTreeBuilder.N0(strArr);
                    break;
                case 11:
                    if (!htmlTreeBuilder.e0(J)) {
                        htmlTreeBuilder.P(this);
                        return false;
                    }
                    htmlTreeBuilder.T(J);
                    if (!htmlTreeBuilder.d(J)) {
                        htmlTreeBuilder.P(this);
                    }
                    htmlTreeBuilder.M0(J);
                    break;
                case '\f':
                    if (!htmlTreeBuilder.f0("body")) {
                        htmlTreeBuilder.P(this);
                        return false;
                    }
                    if (htmlTreeBuilder.K0(Constants.q)) {
                        htmlTreeBuilder.P(this);
                    }
                    htmlTreeBuilder.C(htmlTreeBuilder.Z("body"), false);
                    htmlTreeBuilder.k1(HtmlTreeBuilderState.AfterBody);
                    break;
                case '\r':
                    if (!htmlTreeBuilder.H0(C9998uW1.b0)) {
                        FormElement Y = htmlTreeBuilder.Y();
                        htmlTreeBuilder.f1(null);
                        if (Y != null && htmlTreeBuilder.f0(J)) {
                            htmlTreeBuilder.S();
                            if (!htmlTreeBuilder.d(J)) {
                                htmlTreeBuilder.P(this);
                            }
                            htmlTreeBuilder.X0(Y);
                            break;
                        } else {
                            htmlTreeBuilder.P(this);
                            return false;
                        }
                    } else if (!htmlTreeBuilder.f0(J)) {
                        htmlTreeBuilder.P(this);
                        return false;
                    } else {
                        htmlTreeBuilder.S();
                        if (!htmlTreeBuilder.d(J)) {
                            htmlTreeBuilder.P(this);
                        }
                        htmlTreeBuilder.M0(J);
                        break;
                    }
                    break;
                case 14:
                    if (!htmlTreeBuilder.H0("body")) {
                        htmlTreeBuilder.P(this);
                        return false;
                    }
                    if (htmlTreeBuilder.K0(Constants.q)) {
                        htmlTreeBuilder.P(this);
                    }
                    htmlTreeBuilder.k1(HtmlTreeBuilderState.AfterBody);
                    return htmlTreeBuilder.t(token);
                case 15:
                case 16:
                    return p(token, htmlTreeBuilder);
                default:
                    if (StringUtil.g(J, Constants.r)) {
                        return r(token, htmlTreeBuilder);
                    }
                    if (StringUtil.g(J, Constants.p)) {
                        if (!htmlTreeBuilder.f0(J)) {
                            htmlTreeBuilder.P(this);
                            return false;
                        }
                        htmlTreeBuilder.S();
                        if (!htmlTreeBuilder.d(J)) {
                            htmlTreeBuilder.P(this);
                        }
                        htmlTreeBuilder.M0(J);
                        break;
                    } else if (StringUtil.g(J, Constants.l)) {
                        if (!htmlTreeBuilder.f0("name")) {
                            if (!htmlTreeBuilder.f0(J)) {
                                htmlTreeBuilder.P(this);
                                return false;
                            }
                            htmlTreeBuilder.S();
                            if (!htmlTreeBuilder.d(J)) {
                                htmlTreeBuilder.P(this);
                            }
                            htmlTreeBuilder.M0(J);
                            htmlTreeBuilder.G();
                            break;
                        }
                    } else {
                        return p(token, htmlTreeBuilder);
                    }
                    break;
            }
            return true;
        }

        /* JADX WARN: Code restructure failed: missing block: B:22:0x0053, code lost:
            r8 = null;
         */
        /* JADX WARN: Code restructure failed: missing block: B:62:0x00dd, code lost:
            r16 = r4 == true ? 1 : 0;
         */
        /* JADX WARN: Code restructure failed: missing block: B:80:0x013e, code lost:
            r19.P(r17);
         */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:84:0x016a A[LOOP:4: B:82:0x0164->B:84:0x016a, LOOP_END] */
        /* JADX WARN: Type inference failed for: r10v1 */
        /* JADX WARN: Type inference failed for: r10v2, types: [int] */
        /* JADX WARN: Type inference failed for: r16v0 */
        /* JADX WARN: Type inference failed for: r16v1 */
        /* JADX WARN: Type inference failed for: r16v2 */
        /* JADX WARN: Type inference failed for: r16v3 */
        /* JADX WARN: Type inference failed for: r19v0, types: [org.jsoup.parser.TreeBuilder, org.jsoup.parser.HtmlTreeBuilder] */
        /* JADX WARN: Type inference failed for: r4v0 */
        /* JADX WARN: Type inference failed for: r4v1, types: [boolean, int] */
        /* JADX WARN: Type inference failed for: r4v11 */
        /* JADX WARN: Type inference failed for: r4v13 */
        /* JADX WARN: Type inference failed for: r4v14 */
        /* JADX WARN: Type inference failed for: r4v15 */
        /* JADX WARN: Type inference failed for: r4v2 */
        /* JADX WARN: Type inference failed for: r4v7 */
        /* JADX WARN: Type inference failed for: r4v8 */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final boolean r(Token token, HtmlTreeBuilder htmlTreeBuilder) {
            Element element;
            Element element2;
            String str = token.d().f;
            ?? r4 = 1;
            if (htmlTreeBuilder.c().C0().equals(str) && !htmlTreeBuilder.z0(htmlTreeBuilder.c())) {
                htmlTreeBuilder.s();
                return true;
            }
            boolean z = false;
            int i = 0;
            while (i < 8) {
                i++;
                int size = htmlTreeBuilder.t.size() - r4;
                while (true) {
                    element = null;
                    if (size < 0 || (element2 = htmlTreeBuilder.t.get(size)) == null) {
                        break;
                    } else if (element2.C0().equals(str)) {
                        break;
                    } else {
                        size--;
                    }
                }
                if (element2 == null) {
                    return p(token, htmlTreeBuilder);
                }
                if (!htmlTreeBuilder.J0(element2)) {
                    htmlTreeBuilder.P(this);
                    htmlTreeBuilder.W0(element2);
                    return r4;
                } else if (!htmlTreeBuilder.f0(element2.C0())) {
                    htmlTreeBuilder.P(this);
                    return z;
                } else {
                    if (htmlTreeBuilder.c() != element2) {
                        htmlTreeBuilder.P(this);
                    }
                    ArrayList<Element> c0 = htmlTreeBuilder.c0();
                    int lastIndexOf = c0.lastIndexOf(element2);
                    if (lastIndexOf != -1) {
                        while (true) {
                            lastIndexOf++;
                            if (lastIndexOf >= c0.size()) {
                                break;
                            }
                            Element element3 = c0.get(lastIndexOf);
                            if (HtmlTreeBuilder.C0(element3)) {
                                element = element3;
                                break;
                            }
                        }
                    }
                    if (element == null) {
                        while (htmlTreeBuilder.c() != element2) {
                            htmlTreeBuilder.s();
                        }
                        htmlTreeBuilder.s();
                        htmlTreeBuilder.W0(element2);
                        return r4;
                    }
                    Element D = htmlTreeBuilder.D(element2);
                    if (D == null) {
                        htmlTreeBuilder.P(this);
                        return r4;
                    }
                    int Q0 = htmlTreeBuilder.Q0(element2);
                    int i2 = z;
                    Element element4 = element;
                    Node node = element4;
                    while (true) {
                        i2 += r4 == true ? 1 : 0;
                        if (!htmlTreeBuilder.J0(element4)) {
                            element4 = element4.O0();
                        } else {
                            element4 = htmlTreeBuilder.D(element4);
                        }
                        if (element4 == null || element4.t0("body")) {
                            break;
                        } else if (element4 == element2) {
                            break;
                        } else if (i2 > 3 && htmlTreeBuilder.z0(element4)) {
                            htmlTreeBuilder.W0(element4);
                            break;
                        } else if (!htmlTreeBuilder.z0(element4)) {
                            htmlTreeBuilder.X0(element4);
                        } else if (!htmlTreeBuilder.J0(element4)) {
                            htmlTreeBuilder.P(this);
                            htmlTreeBuilder.W0(element4);
                            break;
                        } else {
                            String w0 = element4.w0();
                            String C0 = element4.C0();
                            String f = htmlTreeBuilder.f();
                            ?? r16 = r4 == true ? 1 : 0;
                            Element element5 = new Element(htmlTreeBuilder.A(w0, C0, f, ParseSettings.d), htmlTreeBuilder.W());
                            htmlTreeBuilder.Z0(element4, element5);
                            htmlTreeBuilder.b1(element4, element5);
                            if (node == element) {
                                Q0 = htmlTreeBuilder.Q0(element5) + 1;
                            }
                            element5.B1(node);
                            element4 = element5;
                            node = element4;
                            r4 = r16;
                        }
                        D.B1(node);
                        Element element6 = new Element(element2.A4(), htmlTreeBuilder.W());
                        element6.p().h(element2.p());
                        for (Node node2 : element.H()) {
                            element6.B1(node2);
                        }
                        element.B1(element6);
                        htmlTreeBuilder.W0(element2);
                        htmlTreeBuilder.U0(element6, Q0);
                        htmlTreeBuilder.X0(element2);
                        htmlTreeBuilder.v0(element, element6);
                        r4 = r16;
                        z = false;
                    }
                    ?? r162 = r4 == true ? 1 : 0;
                    D.B1(node);
                    Element element62 = new Element(element2.A4(), htmlTreeBuilder.W());
                    element62.p().h(element2.p());
                    while (r4.hasNext()) {
                    }
                    element.B1(element62);
                    htmlTreeBuilder.W0(element2);
                    htmlTreeBuilder.U0(element62, Q0);
                    htmlTreeBuilder.X0(element2);
                    htmlTreeBuilder.v0(element, element62);
                    r4 = r162;
                    z = false;
                }
            }
            return r4;
        }

        /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
        public final boolean s(Token token, HtmlTreeBuilder htmlTreeBuilder) {
            char c;
            char c2;
            Token.StartTag e = token.e();
            String J = e.J();
            J.getClass();
            switch (J.hashCode()) {
                case -1644953643:
                    if (J.equals("frameset")) {
                        c = 0;
                        break;
                    }
                    c = 65535;
                    break;
                case -1377687758:
                    if (J.equals("button")) {
                        c = 1;
                        break;
                    }
                    c = 65535;
                    break;
                case -1191214428:
                    if (J.equals("iframe")) {
                        c = 2;
                        break;
                    }
                    c = 65535;
                    break;
                case -1134665583:
                    if (J.equals("keygen")) {
                        c2 = 3;
                        c = c2;
                        break;
                    }
                    c = 65535;
                    break;
                case -1010136971:
                    if (J.equals("option")) {
                        c2 = 4;
                        c = c2;
                        break;
                    }
                    c = 65535;
                    break;
                case -1003243718:
                    if (J.equals("textarea")) {
                        c2 = 5;
                        c = c2;
                        break;
                    }
                    c = 65535;
                    break;
                case -906021636:
                    if (J.equals("select")) {
                        c2 = 6;
                        c = c2;
                        break;
                    }
                    c = 65535;
                    break;
                case -891985998:
                    if (J.equals("strike")) {
                        c2 = 7;
                        c = c2;
                        break;
                    }
                    c = 65535;
                    break;
                case -891980137:
                    if (J.equals("strong")) {
                        c2 = '\b';
                        c = c2;
                        break;
                    }
                    c = 65535;
                    break;
                case -80773204:
                    if (J.equals("optgroup")) {
                        c2 = '\t';
                        c = c2;
                        break;
                    }
                    c = 65535;
                    break;
                case 97:
                    if (J.equals("a")) {
                        c2 = '\n';
                        c = c2;
                        break;
                    }
                    c = 65535;
                    break;
                case 98:
                    if (J.equals("b")) {
                        c2 = 11;
                        c = c2;
                        break;
                    }
                    c = 65535;
                    break;
                case 105:
                    if (J.equals("i")) {
                        c2 = '\f';
                        c = c2;
                        break;
                    }
                    c = 65535;
                    break;
                case 115:
                    if (J.equals("s")) {
                        c2 = C8206nB.d;
                        c = c2;
                        break;
                    }
                    c = 65535;
                    break;
                case 117:
                    if (J.equals("u")) {
                        c2 = 14;
                        c = c2;
                        break;
                    }
                    c = 65535;
                    break;
                case 3152:
                    if (J.equals("br")) {
                        c2 = 15;
                        c = c2;
                        break;
                    }
                    c = 65535;
                    break;
                case 3200:
                    if (J.equals("dd")) {
                        c2 = 16;
                        c = c2;
                        break;
                    }
                    c = 65535;
                    break;
                case 3216:
                    if (J.equals("dt")) {
                        c2 = 17;
                        c = c2;
                        break;
                    }
                    c = 65535;
                    break;
                case 3240:
                    if (J.equals(Q.k)) {
                        c2 = 18;
                        c = c2;
                        break;
                    }
                    c = 65535;
                    break;
                case 3273:
                    if (J.equals("h1")) {
                        c2 = 19;
                        c = c2;
                        break;
                    }
                    c = 65535;
                    break;
                case 3274:
                    if (J.equals("h2")) {
                        c2 = 20;
                        c = c2;
                        break;
                    }
                    c = 65535;
                    break;
                case 3275:
                    if (J.equals("h3")) {
                        c2 = 21;
                        c = c2;
                        break;
                    }
                    c = 65535;
                    break;
                case 3276:
                    if (J.equals("h4")) {
                        c2 = 22;
                        c = c2;
                        break;
                    }
                    c = 65535;
                    break;
                case 3277:
                    if (J.equals("h5")) {
                        c2 = 23;
                        c = c2;
                        break;
                    }
                    c = 65535;
                    break;
                case 3278:
                    if (J.equals("h6")) {
                        c = 24;
                        break;
                    }
                    c = 65535;
                    break;
                case 3338:
                    if (J.equals("hr")) {
                        c = 25;
                        break;
                    }
                    c = 65535;
                    break;
                case 3453:
                    if (J.equals("li")) {
                        c2 = 26;
                        c = c2;
                        break;
                    }
                    c = 65535;
                    break;
                case 3632:
                    if (J.equals("rb")) {
                        c2 = 27;
                        c = c2;
                        break;
                    }
                    c = 65535;
                    break;
                case 3646:
                    if (J.equals("rp")) {
                        c2 = C5588cW.n;
                        c = c2;
                        break;
                    }
                    c = 65535;
                    break;
                case 3650:
                    if (J.equals(C10928yK2.w)) {
                        c2 = C5588cW.f706o;
                        c = c2;
                        break;
                    }
                    c = 65535;
                    break;
                case 3712:
                    if (J.equals(C5445bv2.n)) {
                        c2 = C5588cW.p;
                        c = c2;
                        break;
                    }
                    c = 65535;
                    break;
                case 97536:
                    if (J.equals("big")) {
                        c2 = VN2.b;
                        c = c2;
                        break;
                    }
                    c = 65535;
                    break;
                case 104387:
                    if (J.equals("img")) {
                        c2 = ' ';
                        c = c2;
                        break;
                    }
                    c = 65535;
                    break;
                case 111267:
                    if (J.equals("pre")) {
                        c2 = '!';
                        c = c2;
                        break;
                    }
                    c = 65535;
                    break;
                case 113249:
                    if (J.equals("rtc")) {
                        c2 = '\"';
                        c = c2;
                        break;
                    }
                    c = 65535;
                    break;
                case 114276:
                    if (J.equals("svg")) {
                        c2 = '#';
                        c = c2;
                        break;
                    }
                    c = 65535;
                    break;
                case 117511:
                    if (J.equals("wbr")) {
                        c2 = '$';
                        c = c2;
                        break;
                    }
                    c = 65535;
                    break;
                case 118811:
                    if (J.equals("xmp")) {
                        c2 = '%';
                        c = c2;
                        break;
                    }
                    c = 65535;
                    break;
                case 3002509:
                    if (J.equals("area")) {
                        c2 = '&';
                        c = c2;
                        break;
                    }
                    c = 65535;
                    break;
                case 3029410:
                    if (J.equals("body")) {
                        c2 = '\'';
                        c = c2;
                        break;
                    }
                    c = 65535;
                    break;
                case 3059181:
                    if (J.equals("code")) {
                        c2 = '(';
                        c = c2;
                        break;
                    }
                    c = 65535;
                    break;
                case 3148879:
                    if (J.equals(C4317Th1.q)) {
                        c2 = ')';
                        c = c2;
                        break;
                    }
                    c = 65535;
                    break;
                case 3148996:
                    if (J.equals("form")) {
                        c2 = '*';
                        c = c2;
                        break;
                    }
                    c = 65535;
                    break;
                case 3213227:
                    if (J.equals("html")) {
                        c2 = '+';
                        c = c2;
                        break;
                    }
                    c = 65535;
                    break;
                case 3344136:
                    if (J.equals("math")) {
                        c2 = ',';
                        c = c2;
                        break;
                    }
                    c = 65535;
                    break;
                case 3386833:
                    if (J.equals("nobr")) {
                        c2 = '-';
                        c = c2;
                        break;
                    }
                    c = 65535;
                    break;
                case 3536714:
                    if (J.equals(C5445bv2.s)) {
                        c2 = '.';
                        c = c2;
                        break;
                    }
                    c = 65535;
                    break;
                case 96620249:
                    if (J.equals("embed")) {
                        c2 = '/';
                        c = c2;
                        break;
                    }
                    c = 65535;
                    break;
                case 100313435:
                    if (J.equals("image")) {
                        c2 = C3599Ly1.j;
                        c = c2;
                        break;
                    }
                    c = 65535;
                    break;
                case 100358090:
                    if (J.equals("input")) {
                        c2 = '1';
                        c = c2;
                        break;
                    }
                    c = 65535;
                    break;
                case 109548807:
                    if (J.equals("small")) {
                        c2 = '2';
                        c = c2;
                        break;
                    }
                    c = 65535;
                    break;
                case 110115790:
                    if (J.equals("table")) {
                        c2 = '3';
                        c = c2;
                        break;
                    }
                    c = 65535;
                    break;
                case 181975684:
                    if (J.equals("listing")) {
                        c2 = '4';
                        c = c2;
                        break;
                    }
                    c = 65535;
                    break;
                case 1973234167:
                    if (J.equals("plaintext")) {
                        c2 = '5';
                        c = c2;
                        break;
                    }
                    c = 65535;
                    break;
                case 2115613112:
                    if (J.equals("noembed")) {
                        c2 = '6';
                        c = c2;
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
                    htmlTreeBuilder.P(this);
                    ArrayList<Element> c0 = htmlTreeBuilder.c0();
                    if (c0.size() != 1) {
                        if ((c0.size() <= 2 || c0.get(1).t0("body")) && htmlTreeBuilder.R()) {
                            Element element = c0.get(1);
                            if (element.O0() != null) {
                                element.X0();
                            }
                            while (c0.size() > 1) {
                                c0.remove(c0.size() - 1);
                            }
                            htmlTreeBuilder.p0(e);
                            htmlTreeBuilder.k1(HtmlTreeBuilderState.InFrameset);
                            return true;
                        }
                        return false;
                    }
                    return false;
                case 1:
                    if (htmlTreeBuilder.d0("button")) {
                        htmlTreeBuilder.P(this);
                        htmlTreeBuilder.u("button");
                        htmlTreeBuilder.t(e);
                        break;
                    } else {
                        htmlTreeBuilder.V0();
                        htmlTreeBuilder.p0(e);
                        htmlTreeBuilder.Q(false);
                        break;
                    }
                case 2:
                    htmlTreeBuilder.Q(false);
                    HtmlTreeBuilderState.g(e, htmlTreeBuilder, htmlTreeBuilder.B(e).x());
                    break;
                case 3:
                case 15:
                case ' ':
                case '$':
                case '&':
                case '/':
                    htmlTreeBuilder.V0();
                    htmlTreeBuilder.q0(e);
                    htmlTreeBuilder.Q(false);
                    break;
                case 4:
                case '\t':
                    if (htmlTreeBuilder.d("option")) {
                        htmlTreeBuilder.u("option");
                    }
                    htmlTreeBuilder.V0();
                    htmlTreeBuilder.p0(e);
                    break;
                case 5:
                    htmlTreeBuilder.Q(false);
                    HtmlTreeBuilderState.g(e, htmlTreeBuilder, htmlTreeBuilder.B(e).x());
                    break;
                case 6:
                    htmlTreeBuilder.V0();
                    htmlTreeBuilder.p0(e);
                    htmlTreeBuilder.Q(false);
                    if (!e.g) {
                        HtmlTreeBuilderState i1 = htmlTreeBuilder.i1();
                        if (!i1.equals(HtmlTreeBuilderState.InTable) && !i1.equals(HtmlTreeBuilderState.InCaption) && !i1.equals(HtmlTreeBuilderState.InTableBody) && !i1.equals(HtmlTreeBuilderState.InRow) && !i1.equals(HtmlTreeBuilderState.InCell)) {
                            htmlTreeBuilder.k1(HtmlTreeBuilderState.InSelect);
                            break;
                        } else {
                            htmlTreeBuilder.k1(HtmlTreeBuilderState.InSelectInTable);
                            break;
                        }
                    }
                    break;
                case 7:
                case '\b':
                case 11:
                case '\f':
                case '\r':
                case 14:
                case 18:
                case 30:
                case 31:
                case '(':
                case ')':
                case '2':
                    htmlTreeBuilder.V0();
                    htmlTreeBuilder.S0(htmlTreeBuilder.p0(e));
                    break;
                case '\n':
                    if (htmlTreeBuilder.V("a") != null) {
                        htmlTreeBuilder.P(this);
                        htmlTreeBuilder.u("a");
                        Element Z = htmlTreeBuilder.Z("a");
                        if (Z != null) {
                            htmlTreeBuilder.W0(Z);
                            htmlTreeBuilder.X0(Z);
                        }
                    }
                    htmlTreeBuilder.V0();
                    htmlTreeBuilder.S0(htmlTreeBuilder.p0(e));
                    break;
                case 16:
                case 17:
                    htmlTreeBuilder.Q(false);
                    ArrayList<Element> c02 = htmlTreeBuilder.c0();
                    int size = c02.size();
                    int i = size - 1;
                    int i2 = i >= 24 ? size - 25 : 0;
                    while (true) {
                        if (i >= i2) {
                            Element element2 = c02.get(i);
                            if (StringUtil.g(element2.C0(), Constants.k)) {
                                htmlTreeBuilder.u(element2.C0());
                            } else if (!HtmlTreeBuilder.C0(element2) || StringUtil.g(element2.C0(), Constants.j)) {
                                i--;
                            }
                        }
                    }
                    if (htmlTreeBuilder.d0("p")) {
                        htmlTreeBuilder.u("p");
                    }
                    htmlTreeBuilder.p0(e);
                    break;
                case 19:
                case 20:
                case 21:
                case 22:
                case 23:
                case 24:
                    if (htmlTreeBuilder.d0("p")) {
                        htmlTreeBuilder.u("p");
                    }
                    if (StringUtil.g(htmlTreeBuilder.c().C0(), Constants.i)) {
                        htmlTreeBuilder.P(this);
                        htmlTreeBuilder.s();
                    }
                    htmlTreeBuilder.p0(e);
                    break;
                case 25:
                    if (htmlTreeBuilder.d0("p")) {
                        htmlTreeBuilder.u("p");
                    }
                    htmlTreeBuilder.q0(e);
                    htmlTreeBuilder.Q(false);
                    break;
                case 26:
                    htmlTreeBuilder.Q(false);
                    ArrayList<Element> c03 = htmlTreeBuilder.c0();
                    int size2 = c03.size() - 1;
                    while (true) {
                        if (size2 > 0) {
                            Element element3 = c03.get(size2);
                            if (element3.t0("li")) {
                                htmlTreeBuilder.u("li");
                            } else if (!HtmlTreeBuilder.C0(element3) || StringUtil.g(element3.C0(), Constants.j)) {
                                size2--;
                            }
                        }
                    }
                    if (htmlTreeBuilder.d0("p")) {
                        htmlTreeBuilder.u("p");
                    }
                    htmlTreeBuilder.p0(e);
                    break;
                case 27:
                case '\"':
                    if (htmlTreeBuilder.f0("ruby")) {
                        htmlTreeBuilder.S();
                        if (!htmlTreeBuilder.d("ruby")) {
                            htmlTreeBuilder.P(this);
                        }
                    }
                    htmlTreeBuilder.p0(e);
                    break;
                case 28:
                case 29:
                    if (htmlTreeBuilder.f0("ruby")) {
                        htmlTreeBuilder.T("rtc");
                        if (!htmlTreeBuilder.d("rtc") && !htmlTreeBuilder.d("ruby")) {
                            htmlTreeBuilder.P(this);
                        }
                    }
                    htmlTreeBuilder.p0(e);
                    break;
                case '!':
                case '4':
                    if (htmlTreeBuilder.d0("p")) {
                        htmlTreeBuilder.u("p");
                    }
                    htmlTreeBuilder.p0(e);
                    htmlTreeBuilder.b.a0("\n");
                    htmlTreeBuilder.Q(false);
                    break;
                case '#':
                    htmlTreeBuilder.V0();
                    htmlTreeBuilder.r0(e, Parser.e1);
                    break;
                case '%':
                    if (htmlTreeBuilder.d0("p")) {
                        htmlTreeBuilder.u("p");
                    }
                    htmlTreeBuilder.V0();
                    htmlTreeBuilder.Q(false);
                    HtmlTreeBuilderState.g(e, htmlTreeBuilder, htmlTreeBuilder.B(e).x());
                    break;
                case '\'':
                    htmlTreeBuilder.P(this);
                    ArrayList<Element> c04 = htmlTreeBuilder.c0();
                    if (c04.size() == 1) {
                        return false;
                    }
                    if ((c04.size() > 2 && !c04.get(1).t0("body")) || htmlTreeBuilder.H0(C9998uW1.b0)) {
                        return false;
                    }
                    htmlTreeBuilder.Q(false);
                    Element Z2 = htmlTreeBuilder.Z("body");
                    if (Z2 != null) {
                        HtmlTreeBuilderState.n(e, Z2);
                        break;
                    }
                    break;
                case '*':
                    if (htmlTreeBuilder.Y() != null && !htmlTreeBuilder.H0(C9998uW1.b0)) {
                        htmlTreeBuilder.P(this);
                        return false;
                    }
                    if (htmlTreeBuilder.d0("p")) {
                        htmlTreeBuilder.L("p");
                    }
                    htmlTreeBuilder.s0(e, true, true);
                    return true;
                case '+':
                    htmlTreeBuilder.P(this);
                    if (!htmlTreeBuilder.H0(C9998uW1.b0)) {
                        if (htmlTreeBuilder.c0().size() > 0) {
                            HtmlTreeBuilderState.n(e, htmlTreeBuilder.c0().get(0));
                            break;
                        }
                    } else {
                        return false;
                    }
                    break;
                case ',':
                    htmlTreeBuilder.V0();
                    htmlTreeBuilder.r0(e, Parser.d1);
                    break;
                case '-':
                    htmlTreeBuilder.V0();
                    if (htmlTreeBuilder.f0("nobr")) {
                        htmlTreeBuilder.P(this);
                        htmlTreeBuilder.u("nobr");
                        htmlTreeBuilder.V0();
                    }
                    htmlTreeBuilder.S0(htmlTreeBuilder.p0(e));
                    break;
                case '.':
                    htmlTreeBuilder.V0();
                    htmlTreeBuilder.p0(e);
                    break;
                case '0':
                    if (htmlTreeBuilder.Z("svg") == null) {
                        return htmlTreeBuilder.t(e.H("img"));
                    }
                    htmlTreeBuilder.p0(e);
                    break;
                case '1':
                    htmlTreeBuilder.V0();
                    if (!htmlTreeBuilder.q0(e).k("type").equalsIgnoreCase("hidden")) {
                        htmlTreeBuilder.Q(false);
                        break;
                    }
                    break;
                case '3':
                    if (htmlTreeBuilder.X().n5() != Document.QuirksMode.quirks && htmlTreeBuilder.d0("p")) {
                        htmlTreeBuilder.u("p");
                    }
                    htmlTreeBuilder.p0(e);
                    htmlTreeBuilder.Q(false);
                    htmlTreeBuilder.k1(HtmlTreeBuilderState.InTable);
                    break;
                case '5':
                    if (htmlTreeBuilder.d0("p")) {
                        htmlTreeBuilder.u("p");
                    }
                    htmlTreeBuilder.p0(e);
                    htmlTreeBuilder.c.y(TokeniserState.PLAINTEXT);
                    break;
                case '6':
                    HtmlTreeBuilderState.g(e, htmlTreeBuilder, htmlTreeBuilder.B(e).x());
                    break;
                default:
                    Tag B = htmlTreeBuilder.B(e);
                    TokeniserState x = B.x();
                    if (x != null) {
                        HtmlTreeBuilderState.g(e, htmlTreeBuilder, x);
                        break;
                    } else if (!B.k()) {
                        htmlTreeBuilder.p0(e);
                        break;
                    } else if (StringUtil.g(J, Constants.h)) {
                        if (htmlTreeBuilder.d0("p")) {
                            htmlTreeBuilder.u("p");
                        }
                        htmlTreeBuilder.p0(e);
                        break;
                    } else if (StringUtil.g(J, Constants.g)) {
                        return htmlTreeBuilder.R0(token, HtmlTreeBuilderState.InHead);
                    } else {
                        if (StringUtil.g(J, Constants.l)) {
                            htmlTreeBuilder.V0();
                            htmlTreeBuilder.p0(e);
                            htmlTreeBuilder.u0();
                            htmlTreeBuilder.Q(false);
                            break;
                        } else if (StringUtil.g(J, Constants.m)) {
                            htmlTreeBuilder.q0(e);
                            break;
                        } else if (StringUtil.g(J, Constants.f934o)) {
                            htmlTreeBuilder.P(this);
                            return false;
                        } else {
                            htmlTreeBuilder.V0();
                            htmlTreeBuilder.p0(e);
                            break;
                        }
                    }
            }
            return true;
        }
    },
    Text { // from class: org.jsoup.parser.HtmlTreeBuilderState.8
        @Override // org.jsoup.parser.HtmlTreeBuilderState
        public boolean o(Token token, HtmlTreeBuilder htmlTreeBuilder) {
            if (token.j()) {
                htmlTreeBuilder.m0(token.a());
                return true;
            } else if (token.m()) {
                htmlTreeBuilder.P(this);
                htmlTreeBuilder.s();
                htmlTreeBuilder.k1(htmlTreeBuilder.L0());
                if (htmlTreeBuilder.i1() == HtmlTreeBuilderState.Text) {
                    htmlTreeBuilder.k1(HtmlTreeBuilderState.InBody);
                }
                return htmlTreeBuilder.t(token);
            } else if (token.n()) {
                htmlTreeBuilder.s();
                htmlTreeBuilder.k1(htmlTreeBuilder.L0());
                return true;
            } else {
                return true;
            }
        }
    },
    InTable { // from class: org.jsoup.parser.HtmlTreeBuilderState.9
        @Override // org.jsoup.parser.HtmlTreeBuilderState
        public boolean o(Token token, HtmlTreeBuilder htmlTreeBuilder) {
            if (token.j() && StringUtil.g(htmlTreeBuilder.c().C0(), Constants.A)) {
                htmlTreeBuilder.e1();
                htmlTreeBuilder.E0();
                htmlTreeBuilder.k1(HtmlTreeBuilderState.InTableText);
                return htmlTreeBuilder.t(token);
            } else if (token.k()) {
                htmlTreeBuilder.o0(token.b());
                return true;
            } else if (token.l()) {
                htmlTreeBuilder.P(this);
                return false;
            } else if (token.o()) {
                Token.StartTag e = token.e();
                String J = e.J();
                if (J.equals("caption")) {
                    htmlTreeBuilder.J();
                    htmlTreeBuilder.u0();
                    htmlTreeBuilder.p0(e);
                    htmlTreeBuilder.k1(HtmlTreeBuilderState.InCaption);
                } else if (J.equals("colgroup")) {
                    htmlTreeBuilder.J();
                    htmlTreeBuilder.p0(e);
                    htmlTreeBuilder.k1(HtmlTreeBuilderState.InColumnGroup);
                } else if (J.equals("col")) {
                    htmlTreeBuilder.J();
                    htmlTreeBuilder.v("colgroup");
                    return htmlTreeBuilder.t(token);
                } else if (StringUtil.g(J, Constants.s)) {
                    htmlTreeBuilder.J();
                    htmlTreeBuilder.p0(e);
                    htmlTreeBuilder.k1(HtmlTreeBuilderState.InTableBody);
                } else if (StringUtil.g(J, Constants.t)) {
                    htmlTreeBuilder.J();
                    htmlTreeBuilder.v("tbody");
                    return htmlTreeBuilder.t(token);
                } else if (J.equals("table")) {
                    htmlTreeBuilder.P(this);
                    if (!htmlTreeBuilder.l0(J)) {
                        return false;
                    }
                    htmlTreeBuilder.M0(J);
                    if (!htmlTreeBuilder.d1()) {
                        htmlTreeBuilder.p0(e);
                        return true;
                    }
                    return htmlTreeBuilder.t(token);
                } else if (StringUtil.g(J, Constants.u)) {
                    return htmlTreeBuilder.R0(token, HtmlTreeBuilderState.InHead);
                } else {
                    if (J.equals("input")) {
                        if (e.E() && e.h.F("type").equalsIgnoreCase("hidden")) {
                            htmlTreeBuilder.q0(e);
                        } else {
                            return p(token, htmlTreeBuilder);
                        }
                    } else if (J.equals("form")) {
                        htmlTreeBuilder.P(this);
                        if (htmlTreeBuilder.Y() != null || htmlTreeBuilder.H0(C9998uW1.b0)) {
                            return false;
                        }
                        htmlTreeBuilder.s0(e, false, false);
                    } else {
                        return p(token, htmlTreeBuilder);
                    }
                }
                return true;
            } else if (token.n()) {
                String J2 = token.d().J();
                if (J2.equals("table")) {
                    if (!htmlTreeBuilder.l0(J2)) {
                        htmlTreeBuilder.P(this);
                        return false;
                    }
                    htmlTreeBuilder.M0("table");
                    htmlTreeBuilder.d1();
                } else if (StringUtil.g(J2, Constants.z)) {
                    htmlTreeBuilder.P(this);
                    return false;
                } else if (J2.equals(C9998uW1.b0)) {
                    htmlTreeBuilder.R0(token, HtmlTreeBuilderState.InHead);
                } else {
                    return p(token, htmlTreeBuilder);
                }
                return true;
            } else if (token.m()) {
                if (htmlTreeBuilder.d("html")) {
                    htmlTreeBuilder.P(this);
                }
                return true;
            } else {
                return p(token, htmlTreeBuilder);
            }
        }

        public boolean p(Token token, HtmlTreeBuilder htmlTreeBuilder) {
            htmlTreeBuilder.P(this);
            htmlTreeBuilder.g1(true);
            htmlTreeBuilder.R0(token, HtmlTreeBuilderState.InBody);
            htmlTreeBuilder.g1(false);
            return true;
        }
    },
    InTableText { // from class: org.jsoup.parser.HtmlTreeBuilderState.10
        @Override // org.jsoup.parser.HtmlTreeBuilderState
        public boolean o(Token token, HtmlTreeBuilder htmlTreeBuilder) {
            if (token.a == Token.TokenType.Character) {
                Token.Character a = token.a();
                if (a.v().equals(HtmlTreeBuilderState.t1)) {
                    htmlTreeBuilder.P(this);
                    return false;
                }
                htmlTreeBuilder.E(a);
                return true;
            }
            if (htmlTreeBuilder.b0().size() > 0) {
                Token token2 = htmlTreeBuilder.g;
                for (Token.Character character : htmlTreeBuilder.b0()) {
                    htmlTreeBuilder.g = character;
                    if (!HtmlTreeBuilderState.m(character)) {
                        htmlTreeBuilder.P(this);
                        if (StringUtil.g(htmlTreeBuilder.c().C0(), Constants.A)) {
                            htmlTreeBuilder.g1(true);
                            htmlTreeBuilder.R0(character, HtmlTreeBuilderState.InBody);
                            htmlTreeBuilder.g1(false);
                        } else {
                            htmlTreeBuilder.R0(character, HtmlTreeBuilderState.InBody);
                        }
                    } else {
                        htmlTreeBuilder.m0(character);
                    }
                }
                htmlTreeBuilder.g = token2;
                htmlTreeBuilder.e1();
            }
            htmlTreeBuilder.k1(htmlTreeBuilder.L0());
            return htmlTreeBuilder.t(token);
        }
    },
    InCaption { // from class: org.jsoup.parser.HtmlTreeBuilderState.11
        @Override // org.jsoup.parser.HtmlTreeBuilderState
        public boolean o(Token token, HtmlTreeBuilder htmlTreeBuilder) {
            if (token.n() && token.d().J().equals("caption")) {
                if (!htmlTreeBuilder.l0("caption")) {
                    htmlTreeBuilder.P(this);
                    return false;
                }
                htmlTreeBuilder.S();
                if (!htmlTreeBuilder.d("caption")) {
                    htmlTreeBuilder.P(this);
                }
                htmlTreeBuilder.M0("caption");
                htmlTreeBuilder.G();
                htmlTreeBuilder.k1(HtmlTreeBuilderState.InTable);
                return true;
            } else if ((token.o() && StringUtil.g(token.e().J(), Constants.y)) || (token.n() && token.d().J().equals("table"))) {
                if (!htmlTreeBuilder.l0("caption")) {
                    htmlTreeBuilder.P(this);
                    return false;
                }
                htmlTreeBuilder.U(false);
                if (!htmlTreeBuilder.d("caption")) {
                    htmlTreeBuilder.P(this);
                }
                htmlTreeBuilder.M0("caption");
                htmlTreeBuilder.G();
                HtmlTreeBuilderState htmlTreeBuilderState = HtmlTreeBuilderState.InTable;
                htmlTreeBuilder.k1(htmlTreeBuilderState);
                htmlTreeBuilderState.o(token, htmlTreeBuilder);
                return true;
            } else if (token.n() && StringUtil.g(token.d().J(), Constants.J)) {
                htmlTreeBuilder.P(this);
                return false;
            } else {
                return htmlTreeBuilder.R0(token, HtmlTreeBuilderState.InBody);
            }
        }
    },
    InColumnGroup { // from class: org.jsoup.parser.HtmlTreeBuilderState.12
        private boolean p(Token token, HtmlTreeBuilder htmlTreeBuilder) {
            if (!htmlTreeBuilder.d("colgroup")) {
                htmlTreeBuilder.P(this);
                return false;
            }
            htmlTreeBuilder.s();
            htmlTreeBuilder.k1(HtmlTreeBuilderState.InTable);
            htmlTreeBuilder.t(token);
            return true;
        }

        /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
        /* JADX WARN: Code restructure failed: missing block: B:39:0x008d, code lost:
            if (r3.equals("html") == false) goto L38;
         */
        @Override // org.jsoup.parser.HtmlTreeBuilderState
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public boolean o(Token token, HtmlTreeBuilder htmlTreeBuilder) {
            if (HtmlTreeBuilderState.m(token)) {
                htmlTreeBuilder.m0(token.a());
                return true;
            }
            int i = AnonymousClass25.a[token.a.ordinal()];
            if (i != 1) {
                char c = 2;
                if (i != 2) {
                    if (i != 3) {
                        if (i != 4) {
                            if (i != 6) {
                                return p(token, htmlTreeBuilder);
                            }
                            if (htmlTreeBuilder.d("html")) {
                                return true;
                            }
                            return p(token, htmlTreeBuilder);
                        }
                        String J = token.d().J();
                        J.getClass();
                        if (!J.equals(C9998uW1.b0)) {
                            if (!J.equals("colgroup")) {
                                return p(token, htmlTreeBuilder);
                            }
                            if (!htmlTreeBuilder.d(J)) {
                                htmlTreeBuilder.P(this);
                                return false;
                            }
                            htmlTreeBuilder.s();
                            htmlTreeBuilder.k1(HtmlTreeBuilderState.InTable);
                        } else {
                            htmlTreeBuilder.R0(token, HtmlTreeBuilderState.InHead);
                        }
                    } else {
                        Token.StartTag e = token.e();
                        String J2 = e.J();
                        J2.getClass();
                        switch (J2.hashCode()) {
                            case -1321546630:
                                if (J2.equals(C9998uW1.b0)) {
                                    c = 0;
                                    break;
                                }
                                c = 65535;
                                break;
                            case 98688:
                                if (J2.equals("col")) {
                                    c = 1;
                                    break;
                                }
                                c = 65535;
                                break;
                            case 3213227:
                                break;
                            default:
                                c = 65535;
                                break;
                        }
                        switch (c) {
                            case 0:
                                htmlTreeBuilder.R0(token, HtmlTreeBuilderState.InHead);
                                break;
                            case 1:
                                htmlTreeBuilder.q0(e);
                                break;
                            case 2:
                                return htmlTreeBuilder.R0(token, HtmlTreeBuilderState.InBody);
                            default:
                                return p(token, htmlTreeBuilder);
                        }
                    }
                } else {
                    htmlTreeBuilder.P(this);
                }
            } else {
                htmlTreeBuilder.o0(token.b());
            }
            return true;
        }
    },
    InTableBody { // from class: org.jsoup.parser.HtmlTreeBuilderState.13
        private boolean p(Token token, HtmlTreeBuilder htmlTreeBuilder) {
            return htmlTreeBuilder.R0(token, HtmlTreeBuilderState.InTable);
        }

        @Override // org.jsoup.parser.HtmlTreeBuilderState
        public boolean o(Token token, HtmlTreeBuilder htmlTreeBuilder) {
            int i = AnonymousClass25.a[token.a.ordinal()];
            if (i != 3) {
                if (i != 4) {
                    return p(token, htmlTreeBuilder);
                }
                String J = token.d().J();
                if (StringUtil.g(J, Constants.H)) {
                    if (!htmlTreeBuilder.l0(J)) {
                        htmlTreeBuilder.P(this);
                        return false;
                    }
                    htmlTreeBuilder.I();
                    htmlTreeBuilder.s();
                    htmlTreeBuilder.k1(HtmlTreeBuilderState.InTable);
                    return true;
                } else if (J.equals("table")) {
                    return q(token, htmlTreeBuilder);
                } else {
                    if (StringUtil.g(J, Constants.C)) {
                        htmlTreeBuilder.P(this);
                        return false;
                    }
                    return p(token, htmlTreeBuilder);
                }
            }
            Token.StartTag e = token.e();
            String J2 = e.J();
            if (J2.equals("tr")) {
                htmlTreeBuilder.I();
                htmlTreeBuilder.p0(e);
                htmlTreeBuilder.k1(HtmlTreeBuilderState.InRow);
                return true;
            } else if (StringUtil.g(J2, Constants.v)) {
                htmlTreeBuilder.P(this);
                htmlTreeBuilder.v("tr");
                return htmlTreeBuilder.t(e);
            } else if (StringUtil.g(J2, Constants.B)) {
                return q(token, htmlTreeBuilder);
            } else {
                return p(token, htmlTreeBuilder);
            }
        }

        public final boolean q(Token token, HtmlTreeBuilder htmlTreeBuilder) {
            if (!htmlTreeBuilder.l0("tbody") && !htmlTreeBuilder.l0("thead") && !htmlTreeBuilder.f0("tfoot")) {
                htmlTreeBuilder.P(this);
                return false;
            }
            htmlTreeBuilder.I();
            htmlTreeBuilder.u(htmlTreeBuilder.c().C0());
            return htmlTreeBuilder.t(token);
        }
    },
    InRow { // from class: org.jsoup.parser.HtmlTreeBuilderState.14
        private boolean p(Token token, HtmlTreeBuilder htmlTreeBuilder) {
            return htmlTreeBuilder.R0(token, HtmlTreeBuilderState.InTable);
        }

        @Override // org.jsoup.parser.HtmlTreeBuilderState
        public boolean o(Token token, HtmlTreeBuilder htmlTreeBuilder) {
            if (token.o()) {
                Token.StartTag e = token.e();
                String J = e.J();
                if (StringUtil.g(J, Constants.v)) {
                    htmlTreeBuilder.K();
                    htmlTreeBuilder.p0(e);
                    htmlTreeBuilder.k1(HtmlTreeBuilderState.InCell);
                    htmlTreeBuilder.u0();
                    return true;
                } else if (StringUtil.g(J, Constants.D)) {
                    if (!htmlTreeBuilder.l0("tr")) {
                        htmlTreeBuilder.P(this);
                        return false;
                    }
                    htmlTreeBuilder.K();
                    htmlTreeBuilder.s();
                    htmlTreeBuilder.k1(HtmlTreeBuilderState.InTableBody);
                    return htmlTreeBuilder.t(token);
                } else {
                    return p(token, htmlTreeBuilder);
                }
            } else if (token.n()) {
                String J2 = token.d().J();
                if (J2.equals("tr")) {
                    if (!htmlTreeBuilder.l0(J2)) {
                        htmlTreeBuilder.P(this);
                        return false;
                    }
                    htmlTreeBuilder.K();
                    htmlTreeBuilder.s();
                    htmlTreeBuilder.k1(HtmlTreeBuilderState.InTableBody);
                    return true;
                } else if (J2.equals("table")) {
                    if (!htmlTreeBuilder.l0("tr")) {
                        htmlTreeBuilder.P(this);
                        return false;
                    }
                    htmlTreeBuilder.K();
                    htmlTreeBuilder.s();
                    htmlTreeBuilder.k1(HtmlTreeBuilderState.InTableBody);
                    return htmlTreeBuilder.t(token);
                } else if (StringUtil.g(J2, Constants.s)) {
                    if (!htmlTreeBuilder.l0(J2)) {
                        htmlTreeBuilder.P(this);
                        return false;
                    } else if (!htmlTreeBuilder.l0("tr")) {
                        return false;
                    } else {
                        htmlTreeBuilder.K();
                        htmlTreeBuilder.s();
                        htmlTreeBuilder.k1(HtmlTreeBuilderState.InTableBody);
                        return htmlTreeBuilder.t(token);
                    }
                } else if (StringUtil.g(J2, Constants.E)) {
                    htmlTreeBuilder.P(this);
                    return false;
                } else {
                    return p(token, htmlTreeBuilder);
                }
            } else {
                return p(token, htmlTreeBuilder);
            }
        }
    },
    InCell { // from class: org.jsoup.parser.HtmlTreeBuilderState.15
        private boolean p(Token token, HtmlTreeBuilder htmlTreeBuilder) {
            return htmlTreeBuilder.R0(token, HtmlTreeBuilderState.InBody);
        }

        @Override // org.jsoup.parser.HtmlTreeBuilderState
        public boolean o(Token token, HtmlTreeBuilder htmlTreeBuilder) {
            if (token.n()) {
                String J = token.d().J();
                if (StringUtil.g(J, Constants.v)) {
                    if (!htmlTreeBuilder.l0(J)) {
                        htmlTreeBuilder.P(this);
                        htmlTreeBuilder.k1(HtmlTreeBuilderState.InRow);
                        return false;
                    }
                    htmlTreeBuilder.S();
                    if (!htmlTreeBuilder.d(J)) {
                        htmlTreeBuilder.P(this);
                    }
                    htmlTreeBuilder.M0(J);
                    htmlTreeBuilder.G();
                    htmlTreeBuilder.k1(HtmlTreeBuilderState.InRow);
                    return true;
                } else if (StringUtil.g(J, Constants.w)) {
                    htmlTreeBuilder.P(this);
                    return false;
                } else if (StringUtil.g(J, Constants.x)) {
                    if (!htmlTreeBuilder.l0(J)) {
                        htmlTreeBuilder.P(this);
                        return false;
                    }
                    q(htmlTreeBuilder);
                    return htmlTreeBuilder.t(token);
                } else {
                    return p(token, htmlTreeBuilder);
                }
            } else if (token.o() && StringUtil.g(token.e().J(), Constants.y)) {
                if (!htmlTreeBuilder.l0("td") && !htmlTreeBuilder.l0("th")) {
                    htmlTreeBuilder.P(this);
                    return false;
                }
                q(htmlTreeBuilder);
                return htmlTreeBuilder.t(token);
            } else {
                return p(token, htmlTreeBuilder);
            }
        }

        public final void q(HtmlTreeBuilder htmlTreeBuilder) {
            if (htmlTreeBuilder.l0("td")) {
                htmlTreeBuilder.u("td");
            } else {
                htmlTreeBuilder.u("th");
            }
        }
    },
    InSelect { // from class: org.jsoup.parser.HtmlTreeBuilderState.16
        private boolean p(Token token, HtmlTreeBuilder htmlTreeBuilder) {
            htmlTreeBuilder.P(this);
            return false;
        }

        @Override // org.jsoup.parser.HtmlTreeBuilderState
        public boolean o(Token token, HtmlTreeBuilder htmlTreeBuilder) {
            switch (AnonymousClass25.a[token.a.ordinal()]) {
                case 1:
                    htmlTreeBuilder.o0(token.b());
                    break;
                case 2:
                    htmlTreeBuilder.P(this);
                    return false;
                case 3:
                    Token.StartTag e = token.e();
                    String J = e.J();
                    if (J.equals("html")) {
                        return htmlTreeBuilder.R0(e, HtmlTreeBuilderState.InBody);
                    }
                    if (J.equals("option")) {
                        if (htmlTreeBuilder.d("option")) {
                            htmlTreeBuilder.u("option");
                        }
                        htmlTreeBuilder.p0(e);
                        break;
                    } else if (J.equals("optgroup")) {
                        if (htmlTreeBuilder.d("option")) {
                            htmlTreeBuilder.u("option");
                        }
                        if (htmlTreeBuilder.d("optgroup")) {
                            htmlTreeBuilder.u("optgroup");
                        }
                        htmlTreeBuilder.p0(e);
                        break;
                    } else if (J.equals("select")) {
                        htmlTreeBuilder.P(this);
                        return htmlTreeBuilder.u("select");
                    } else if (StringUtil.g(J, Constants.F)) {
                        htmlTreeBuilder.P(this);
                        if (!htmlTreeBuilder.i0("select")) {
                            return false;
                        }
                        do {
                            htmlTreeBuilder.M0("select");
                            htmlTreeBuilder.d1();
                        } while (htmlTreeBuilder.i0("select"));
                        return htmlTreeBuilder.t(e);
                    } else if (!J.equals(C2730De2.r) && !J.equals(C9998uW1.b0)) {
                        return p(token, htmlTreeBuilder);
                    } else {
                        return htmlTreeBuilder.R0(token, HtmlTreeBuilderState.InHead);
                    }
                    break;
                case 4:
                    String J2 = token.d().J();
                    J2.getClass();
                    char c = 65535;
                    switch (J2.hashCode()) {
                        case -1321546630:
                            if (J2.equals(C9998uW1.b0)) {
                                c = 0;
                                break;
                            }
                            break;
                        case -1010136971:
                            if (J2.equals("option")) {
                                c = 1;
                                break;
                            }
                            break;
                        case -906021636:
                            if (J2.equals("select")) {
                                c = 2;
                                break;
                            }
                            break;
                        case -80773204:
                            if (J2.equals("optgroup")) {
                                c = 3;
                                break;
                            }
                            break;
                    }
                    switch (c) {
                        case 0:
                            return htmlTreeBuilder.R0(token, HtmlTreeBuilderState.InHead);
                        case 1:
                            if (htmlTreeBuilder.d("option")) {
                                htmlTreeBuilder.s();
                                break;
                            } else {
                                htmlTreeBuilder.P(this);
                                break;
                            }
                        case 2:
                            if (!htmlTreeBuilder.i0(J2)) {
                                htmlTreeBuilder.P(this);
                                return false;
                            }
                            htmlTreeBuilder.M0(J2);
                            htmlTreeBuilder.d1();
                            break;
                        case 3:
                            if (htmlTreeBuilder.d("option") && htmlTreeBuilder.D(htmlTreeBuilder.c()) != null && htmlTreeBuilder.D(htmlTreeBuilder.c()).t0("optgroup")) {
                                htmlTreeBuilder.u("option");
                            }
                            if (htmlTreeBuilder.d("optgroup")) {
                                htmlTreeBuilder.s();
                                break;
                            } else {
                                htmlTreeBuilder.P(this);
                                break;
                            }
                            break;
                        default:
                            return p(token, htmlTreeBuilder);
                    }
                case 5:
                    Token.Character a = token.a();
                    if (a.v().equals(HtmlTreeBuilderState.t1)) {
                        htmlTreeBuilder.P(this);
                        return false;
                    }
                    htmlTreeBuilder.m0(a);
                    break;
                case 6:
                    if (!htmlTreeBuilder.d("html")) {
                        htmlTreeBuilder.P(this);
                        break;
                    }
                    break;
                default:
                    return p(token, htmlTreeBuilder);
            }
            return true;
        }
    },
    InSelectInTable { // from class: org.jsoup.parser.HtmlTreeBuilderState.17
        @Override // org.jsoup.parser.HtmlTreeBuilderState
        public boolean o(Token token, HtmlTreeBuilder htmlTreeBuilder) {
            if (token.o() && StringUtil.g(token.e().J(), Constants.G)) {
                htmlTreeBuilder.P(this);
                htmlTreeBuilder.M0("select");
                htmlTreeBuilder.d1();
                return htmlTreeBuilder.t(token);
            } else if (token.n() && StringUtil.g(token.d().J(), Constants.G)) {
                htmlTreeBuilder.P(this);
                if (htmlTreeBuilder.l0(token.d().J())) {
                    htmlTreeBuilder.M0("select");
                    htmlTreeBuilder.d1();
                    return htmlTreeBuilder.t(token);
                }
                return false;
            } else {
                return htmlTreeBuilder.R0(token, HtmlTreeBuilderState.InSelect);
            }
        }
    },
    InTemplate { // from class: org.jsoup.parser.HtmlTreeBuilderState.18
        @Override // org.jsoup.parser.HtmlTreeBuilderState
        public boolean o(Token token, HtmlTreeBuilder htmlTreeBuilder) {
            switch (AnonymousClass25.a[token.a.ordinal()]) {
                case 1:
                case 2:
                case 5:
                    htmlTreeBuilder.R0(token, HtmlTreeBuilderState.InBody);
                    break;
                case 3:
                    String J = token.e().J();
                    if (StringUtil.g(J, Constants.K)) {
                        htmlTreeBuilder.R0(token, HtmlTreeBuilderState.InHead);
                        break;
                    } else if (StringUtil.g(J, Constants.L)) {
                        htmlTreeBuilder.P0();
                        HtmlTreeBuilderState htmlTreeBuilderState = HtmlTreeBuilderState.InTable;
                        htmlTreeBuilder.T0(htmlTreeBuilderState);
                        htmlTreeBuilder.k1(htmlTreeBuilderState);
                        return htmlTreeBuilder.t(token);
                    } else if (J.equals("col")) {
                        htmlTreeBuilder.P0();
                        HtmlTreeBuilderState htmlTreeBuilderState2 = HtmlTreeBuilderState.InColumnGroup;
                        htmlTreeBuilder.T0(htmlTreeBuilderState2);
                        htmlTreeBuilder.k1(htmlTreeBuilderState2);
                        return htmlTreeBuilder.t(token);
                    } else if (J.equals("tr")) {
                        htmlTreeBuilder.P0();
                        HtmlTreeBuilderState htmlTreeBuilderState3 = HtmlTreeBuilderState.InTableBody;
                        htmlTreeBuilder.T0(htmlTreeBuilderState3);
                        htmlTreeBuilder.k1(htmlTreeBuilderState3);
                        return htmlTreeBuilder.t(token);
                    } else if (!J.equals("td") && !J.equals("th")) {
                        htmlTreeBuilder.P0();
                        HtmlTreeBuilderState htmlTreeBuilderState4 = HtmlTreeBuilderState.InBody;
                        htmlTreeBuilder.T0(htmlTreeBuilderState4);
                        htmlTreeBuilder.k1(htmlTreeBuilderState4);
                        return htmlTreeBuilder.t(token);
                    } else {
                        htmlTreeBuilder.P0();
                        HtmlTreeBuilderState htmlTreeBuilderState5 = HtmlTreeBuilderState.InRow;
                        htmlTreeBuilder.T0(htmlTreeBuilderState5);
                        htmlTreeBuilder.k1(htmlTreeBuilderState5);
                        return htmlTreeBuilder.t(token);
                    }
                    break;
                case 4:
                    if (token.d().J().equals(C9998uW1.b0)) {
                        htmlTreeBuilder.R0(token, HtmlTreeBuilderState.InHead);
                        break;
                    } else {
                        htmlTreeBuilder.P(this);
                        return false;
                    }
                case 6:
                    if (!htmlTreeBuilder.H0(C9998uW1.b0)) {
                        return true;
                    }
                    htmlTreeBuilder.P(this);
                    htmlTreeBuilder.M0(C9998uW1.b0);
                    htmlTreeBuilder.G();
                    htmlTreeBuilder.P0();
                    htmlTreeBuilder.d1();
                    if (htmlTreeBuilder.i1() == HtmlTreeBuilderState.InTemplate || htmlTreeBuilder.j1() >= 12) {
                        return true;
                    }
                    return htmlTreeBuilder.t(token);
                default:
                    Validate.t("Unexpected state: " + token.a);
                    break;
            }
            return true;
        }
    },
    AfterBody { // from class: org.jsoup.parser.HtmlTreeBuilderState.19
        @Override // org.jsoup.parser.HtmlTreeBuilderState
        public boolean o(Token token, HtmlTreeBuilder htmlTreeBuilder) {
            Element Z = htmlTreeBuilder.Z("html");
            if (HtmlTreeBuilderState.m(token)) {
                if (Z != null) {
                    htmlTreeBuilder.n0(token.a(), Z);
                    return true;
                }
                htmlTreeBuilder.R0(token, HtmlTreeBuilderState.InBody);
                return true;
            } else if (token.k()) {
                htmlTreeBuilder.o0(token.b());
                return true;
            } else if (token.l()) {
                htmlTreeBuilder.P(this);
                return false;
            } else if (token.o() && token.e().J().equals("html")) {
                return htmlTreeBuilder.R0(token, HtmlTreeBuilderState.InBody);
            } else {
                if (token.n() && token.d().J().equals("html")) {
                    if (htmlTreeBuilder.x0()) {
                        htmlTreeBuilder.P(this);
                        return false;
                    }
                    if (Z != null) {
                        htmlTreeBuilder.C(Z, false);
                    }
                    htmlTreeBuilder.k1(HtmlTreeBuilderState.AfterAfterBody);
                    return true;
                } else if (token.m()) {
                    return true;
                } else {
                    htmlTreeBuilder.P(this);
                    htmlTreeBuilder.c1();
                    return htmlTreeBuilder.t(token);
                }
            }
        }
    },
    InFrameset { // from class: org.jsoup.parser.HtmlTreeBuilderState.20
        @Override // org.jsoup.parser.HtmlTreeBuilderState
        public boolean o(Token token, HtmlTreeBuilder htmlTreeBuilder) {
            if (HtmlTreeBuilderState.m(token)) {
                htmlTreeBuilder.m0(token.a());
            } else if (token.k()) {
                htmlTreeBuilder.o0(token.b());
            } else if (token.l()) {
                htmlTreeBuilder.P(this);
                return false;
            } else if (token.o()) {
                Token.StartTag e = token.e();
                String J = e.J();
                J.getClass();
                char c = 65535;
                switch (J.hashCode()) {
                    case -1644953643:
                        if (J.equals("frameset")) {
                            c = 0;
                            break;
                        }
                        break;
                    case 3213227:
                        if (J.equals("html")) {
                            c = 1;
                            break;
                        }
                        break;
                    case 97692013:
                        if (J.equals(InterfaceC8148mw2.a.L)) {
                            c = 2;
                            break;
                        }
                        break;
                    case 1192721831:
                        if (J.equals("noframes")) {
                            c = 3;
                            break;
                        }
                        break;
                }
                switch (c) {
                    case 0:
                        htmlTreeBuilder.p0(e);
                        break;
                    case 1:
                        return htmlTreeBuilder.R0(e, HtmlTreeBuilderState.InBody);
                    case 2:
                        htmlTreeBuilder.q0(e);
                        break;
                    case 3:
                        return htmlTreeBuilder.R0(e, HtmlTreeBuilderState.InHead);
                    default:
                        htmlTreeBuilder.P(this);
                        return false;
                }
            } else if (token.n() && token.d().J().equals("frameset")) {
                if (htmlTreeBuilder.d("html")) {
                    htmlTreeBuilder.P(this);
                    return false;
                }
                htmlTreeBuilder.s();
                if (!htmlTreeBuilder.x0() && !htmlTreeBuilder.d("frameset")) {
                    htmlTreeBuilder.k1(HtmlTreeBuilderState.AfterFrameset);
                }
            } else if (token.m()) {
                if (!htmlTreeBuilder.d("html")) {
                    htmlTreeBuilder.P(this);
                }
            } else {
                htmlTreeBuilder.P(this);
                return false;
            }
            return true;
        }
    },
    AfterFrameset { // from class: org.jsoup.parser.HtmlTreeBuilderState.21
        @Override // org.jsoup.parser.HtmlTreeBuilderState
        public boolean o(Token token, HtmlTreeBuilder htmlTreeBuilder) {
            if (HtmlTreeBuilderState.m(token)) {
                htmlTreeBuilder.m0(token.a());
                return true;
            } else if (token.k()) {
                htmlTreeBuilder.o0(token.b());
                return true;
            } else if (token.l()) {
                htmlTreeBuilder.P(this);
                return false;
            } else if (token.o() && token.e().J().equals("html")) {
                return htmlTreeBuilder.R0(token, HtmlTreeBuilderState.InBody);
            } else {
                if (token.n() && token.d().J().equals("html")) {
                    htmlTreeBuilder.k1(HtmlTreeBuilderState.AfterAfterFrameset);
                    return true;
                } else if (token.o() && token.e().J().equals("noframes")) {
                    return htmlTreeBuilder.R0(token, HtmlTreeBuilderState.InHead);
                } else {
                    if (token.m()) {
                        return true;
                    }
                    htmlTreeBuilder.P(this);
                    return false;
                }
            }
        }
    },
    AfterAfterBody { // from class: org.jsoup.parser.HtmlTreeBuilderState.22
        @Override // org.jsoup.parser.HtmlTreeBuilderState
        public boolean o(Token token, HtmlTreeBuilder htmlTreeBuilder) {
            if (token.k()) {
                htmlTreeBuilder.o0(token.b());
                return true;
            } else if (!token.l() && (!token.o() || !token.e().J().equals("html"))) {
                if (HtmlTreeBuilderState.m(token)) {
                    htmlTreeBuilder.n0(token.a(), htmlTreeBuilder.X());
                    return true;
                } else if (token.m()) {
                    return true;
                } else {
                    htmlTreeBuilder.P(this);
                    htmlTreeBuilder.c1();
                    return htmlTreeBuilder.t(token);
                }
            } else {
                return htmlTreeBuilder.R0(token, HtmlTreeBuilderState.InBody);
            }
        }
    },
    AfterAfterFrameset { // from class: org.jsoup.parser.HtmlTreeBuilderState.23
        @Override // org.jsoup.parser.HtmlTreeBuilderState
        public boolean o(Token token, HtmlTreeBuilder htmlTreeBuilder) {
            if (token.k()) {
                htmlTreeBuilder.o0(token.b());
                return true;
            } else if (!token.l() && !HtmlTreeBuilderState.m(token) && (!token.o() || !token.e().J().equals("html"))) {
                if (token.m()) {
                    return true;
                }
                if (token.o() && token.e().J().equals("noframes")) {
                    return htmlTreeBuilder.R0(token, HtmlTreeBuilderState.InHead);
                }
                htmlTreeBuilder.P(this);
                return false;
            } else {
                return htmlTreeBuilder.R0(token, HtmlTreeBuilderState.InBody);
            }
        }
    },
    ForeignContent { // from class: org.jsoup.parser.HtmlTreeBuilderState.24
        @Override // org.jsoup.parser.HtmlTreeBuilderState
        public boolean o(Token token, HtmlTreeBuilder htmlTreeBuilder) {
            switch (AnonymousClass25.a[token.a.ordinal()]) {
                case 1:
                    htmlTreeBuilder.o0(token.b());
                    break;
                case 2:
                    htmlTreeBuilder.P(this);
                    break;
                case 3:
                    Token.StartTag e = token.e();
                    if (StringUtil.f(e.f, Constants.M)) {
                        return p(token, htmlTreeBuilder);
                    }
                    if (e.f.equals(C4317Th1.q) && (e.D("color") || e.D("face") || e.D("size"))) {
                        return p(token, htmlTreeBuilder);
                    }
                    String q = htmlTreeBuilder.c().A4().q();
                    htmlTreeBuilder.r0(e, q);
                    TokeniserState x = htmlTreeBuilder.A(e.e.h(), e.f, q, htmlTreeBuilder.h).x();
                    if (x != null) {
                        if (e.f.equals(C2730De2.r)) {
                            htmlTreeBuilder.c.y(TokeniserState.ScriptData);
                            break;
                        } else {
                            htmlTreeBuilder.c.y(x);
                            break;
                        }
                    }
                    break;
                case 4:
                    Token.EndTag d = token.d();
                    if (!d.f.equals("br") && !d.f.equals("p")) {
                        if (d.f.equals(C2730De2.r) && htmlTreeBuilder.e(C2730De2.r, Parser.e1)) {
                            htmlTreeBuilder.s();
                            return true;
                        }
                        ArrayList<Element> c0 = htmlTreeBuilder.c0();
                        if (c0.isEmpty()) {
                            Validate.t("Stack unexpectedly empty");
                        }
                        int size = c0.size() - 1;
                        Element element = c0.get(size);
                        if (!element.t0(d.f)) {
                            htmlTreeBuilder.P(this);
                        }
                        while (size != 0) {
                            if (element.t0(d.f)) {
                                htmlTreeBuilder.O0(element.C0());
                                return true;
                            }
                            size--;
                            element = c0.get(size);
                            if (element.A4().q().equals(Parser.b1)) {
                                return p(token, htmlTreeBuilder);
                            }
                        }
                        break;
                    } else {
                        return p(token, htmlTreeBuilder);
                    }
                case 5:
                    Token.Character a = token.a();
                    if (a.v().equals(HtmlTreeBuilderState.t1)) {
                        htmlTreeBuilder.P(this);
                        break;
                    } else if (HtmlTreeBuilderState.m(a)) {
                        htmlTreeBuilder.m0(a);
                        break;
                    } else {
                        htmlTreeBuilder.m0(a);
                        htmlTreeBuilder.Q(false);
                        break;
                    }
                case 6:
                    break;
                default:
                    Validate.t("Unexpected state: " + token.a);
                    break;
            }
            return true;
        }

        public boolean p(Token token, HtmlTreeBuilder htmlTreeBuilder) {
            return htmlTreeBuilder.i1().o(token, htmlTreeBuilder);
        }
    };
    
    public static final String t1 = String.valueOf((char) 0);

    /* renamed from: org.jsoup.parser.HtmlTreeBuilderState$25  reason: invalid class name */
    /* loaded from: classes4.dex */
    public static /* synthetic */ class AnonymousClass25 {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[Token.TokenType.values().length];
            a = iArr;
            try {
                iArr[Token.TokenType.Comment.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                a[Token.TokenType.Doctype.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                a[Token.TokenType.StartTag.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                a[Token.TokenType.EndTag.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                a[Token.TokenType.Character.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                a[Token.TokenType.EOF.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
        }
    }

    /* loaded from: classes4.dex */
    public static final class Constants {
        public static final String[] a = {C5445bv2.X, "basefont", "bgsound", "command", "link"};
        public static final String[] b = {"noframes", "style"};
        public static final String[] c = {"body", "br", "html"};
        public static final String[] d = {"body", "br", "html"};
        public static final String[] e = {"body", "br", C5445bv2.f701o, "html"};
        public static final String[] f = {"basefont", "bgsound", "link", "meta", "noframes", "style"};
        public static final String[] g = {C5445bv2.X, "basefont", "bgsound", "command", "link", "meta", "noframes", C2730De2.r, "style", C9998uW1.b0, "title"};
        public static final String[] h = {"address", "article", "aside", "blockquote", C5445bv2.m0, "details", "dir", C5445bv2.q, "dl", "fieldset", "figcaption", "figure", "footer", C2381j.e1, "hgroup", C9796th2.f, "nav", "ol", "p", "section", "summary", "ul"};
        public static final String[] i = {"h1", "h2", "h3", "h4", "h5", "h6"};
        public static final String[] j = {"address", C5445bv2.q, "p"};
        public static final String[] k = {"dd", "dt"};
        public static final String[] l = {"applet", "marquee", "object"};
        public static final String[] m = {"param", "source", "track"};
        public static final String[] n = {"action", "name", "prompt"};

        /* renamed from: o  reason: collision with root package name */
        public static final String[] f934o = {"caption", "col", "colgroup", InterfaceC8148mw2.a.L, C5445bv2.f701o, "tbody", "td", "tfoot", "th", "thead", "tr"};
        public static final String[] p = {"address", "article", "aside", "blockquote", "button", C5445bv2.m0, "details", "dir", C5445bv2.q, "dl", "fieldset", "figcaption", "figure", "footer", C2381j.e1, "hgroup", "listing", C9796th2.f, "nav", "ol", "pre", "section", "summary", "ul"};
        public static final String[] q = {"body", "dd", "dt", "html", "li", "optgroup", "option", "p", "rb", "rp", C10928yK2.w, "rtc", "tbody", "td", "tfoot", "th", "thead", "tr"};
        public static final String[] r = {"a", "b", "big", "code", Q.k, C4317Th1.q, "i", "nobr", "s", "small", "strike", "strong", C5445bv2.n, "u"};
        public static final String[] s = {"tbody", "tfoot", "thead"};
        public static final String[] t = {"td", "th", "tr"};
        public static final String[] u = {C2730De2.r, "style", C9998uW1.b0};
        public static final String[] v = {"td", "th"};
        public static final String[] w = {"body", "caption", "col", "colgroup", "html"};
        public static final String[] x = {"table", "tbody", "tfoot", "thead", "tr"};
        public static final String[] y = {"caption", "col", "colgroup", "tbody", "td", "tfoot", "th", "thead", "tr"};
        public static final String[] z = {"body", "caption", "col", "colgroup", "html", "tbody", "td", "tfoot", "th", "thead", "tr"};
        public static final String[] A = {"table", "tbody", "tfoot", "thead", "tr"};
        public static final String[] B = {"caption", "col", "colgroup", "tbody", "tfoot", "thead"};
        public static final String[] C = {"body", "caption", "col", "colgroup", "html", "td", "th", "tr"};
        public static final String[] D = {"caption", "col", "colgroup", "tbody", "tfoot", "thead", "tr"};
        public static final String[] E = {"body", "caption", "col", "colgroup", "html", "td", "th"};
        public static final String[] F = {"input", "keygen", "textarea"};
        public static final String[] G = {"caption", "table", "tbody", "td", "tfoot", "th", "thead", "tr"};
        public static final String[] H = {"tbody", "tfoot", "thead"};
        public static final String[] I = {C5445bv2.f701o, "noscript"};
        public static final String[] J = {"body", "col", "colgroup", "html", "tbody", "td", "tfoot", "th", "thead", "tr"};
        public static final String[] K = {C5445bv2.X, "basefont", "bgsound", "link", "meta", "noframes", C2730De2.r, "style", C9998uW1.b0, "title"};
        public static final String[] L = {"caption", "colgroup", "tbody", "tfoot", "thead"};
        public static final String[] M = {"b", "big", "blockquote", "body", "br", C5445bv2.m0, "code", "dd", C5445bv2.q, "dl", "dt", Q.k, "embed", "h1", "h2", "h3", "h4", "h5", "h6", C5445bv2.f701o, "hr", "i", "img", "li", "listing", C9796th2.f, "meta", "nobr", "ol", "p", "pre", "ruby", "s", "small", C5445bv2.s, "strike", "strong", C2383l.x1, "sup", "table", C5445bv2.n, "u", "ul", "var"};
    }

    public static void g(Token.StartTag startTag, HtmlTreeBuilder htmlTreeBuilder, TokeniserState tokeniserState) {
        if (tokeniserState != null) {
            htmlTreeBuilder.c.y(tokeniserState);
        }
        htmlTreeBuilder.E0();
        htmlTreeBuilder.k1(Text);
        htmlTreeBuilder.p0(startTag);
    }

    public static boolean m(Token token) {
        if (token.j()) {
            return StringUtil.k(token.a().v());
        }
        return false;
    }

    public static void n(Token.StartTag startTag, Element element) {
        if (startTag.E()) {
            Iterator<Attribute> it = startTag.h.iterator();
            while (it.hasNext()) {
                Attribute next = it.next();
                Attributes p = element.p();
                if (!p.L(next.getKey())) {
                    Range.AttributeRange z = next.z();
                    p.k0(next);
                    if (startTag.m) {
                        p.r0(next.getKey(), z);
                    }
                }
            }
        }
    }

    public abstract boolean o(Token token, HtmlTreeBuilder htmlTreeBuilder);
}
