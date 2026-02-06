package org.jsoup.parser;

import java.io.Reader;
import java.io.StringReader;
import java.util.ArrayDeque;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import o.C2730De2;
import org.jsoup.helper.Validate;
import org.jsoup.internal.SharedConstants;
import org.jsoup.nodes.Attribute;
import org.jsoup.nodes.Attributes;
import org.jsoup.nodes.CDataNode;
import org.jsoup.nodes.Comment;
import org.jsoup.nodes.DataNode;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.DocumentType;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.Entities;
import org.jsoup.nodes.LeafNode;
import org.jsoup.nodes.Node;
import org.jsoup.nodes.TextNode;
import org.jsoup.nodes.XmlDeclaration;
import org.jsoup.parser.Token;
import org.jsoup.select.Elements;

/* loaded from: classes4.dex */
public class XmlTreeBuilder extends TreeBuilder {

    /* renamed from: o  reason: collision with root package name */
    public static final String f937o = "xmlns";
    public static final String p = "xmlns:";
    public static final int q = 256;
    public final ArrayDeque<HashMap<String, String>> n = new ArrayDeque<>();

    /* renamed from: org.jsoup.parser.XmlTreeBuilder$1  reason: invalid class name */
    /* loaded from: classes4.dex */
    public static /* synthetic */ class AnonymousClass1 {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[Token.TokenType.values().length];
            a = iArr;
            try {
                iArr[Token.TokenType.StartTag.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                a[Token.TokenType.EndTag.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                a[Token.TokenType.Comment.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                a[Token.TokenType.Character.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                a[Token.TokenType.Doctype.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                a[Token.TokenType.XmlDecl.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                a[Token.TokenType.EOF.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    public static void D(Attributes attributes, HashMap<String, String> hashMap) {
        String str;
        HashMap hashMap2 = new HashMap();
        Iterator<Attribute> it = attributes.iterator();
        while (it.hasNext()) {
            String u = it.next().u();
            if (!u.isEmpty() && !u.equals(f937o) && (str = hashMap.get(u)) != null) {
                hashMap2.put(SharedConstants.e + u, str);
            }
        }
        for (Map.Entry entry : hashMap2.entrySet()) {
            attributes.v0((String) entry.getKey(), entry.getValue());
        }
    }

    public static void O(Attributes attributes, HashMap<String, String> hashMap) {
        Iterator<Attribute> it = attributes.iterator();
        while (it.hasNext()) {
            Attribute next = it.next();
            String key = next.getKey();
            String value = next.getValue();
            if (key.equals(f937o)) {
                hashMap.put("", value);
            } else if (key.startsWith(p)) {
                hashMap.put(key.substring(6), value);
            }
        }
    }

    public static String P(String str, HashMap<String, String> hashMap) {
        String str2 = hashMap.get("");
        int indexOf = str.indexOf(58);
        if (indexOf > 0) {
            String substring = str.substring(0, indexOf);
            if (hashMap.containsKey(substring)) {
                return hashMap.get(substring);
            }
        }
        return str2;
    }

    public void E(Token.Character character) {
        LeafNode textNode;
        String v = character.v();
        if (character.i()) {
            textNode = new CDataNode(v);
        } else if (c().A4().f(Tag.h1)) {
            textNode = new DataNode(v);
        } else {
            textNode = new TextNode(v);
        }
        I(textNode);
    }

    public void F(Token.Comment comment) {
        I(new Comment(comment.v()));
    }

    public void G(Token.Doctype doctype) {
        DocumentType documentType = new DocumentType(this.h.d(doctype.t()), doctype.v(), doctype.w());
        documentType.B1(doctype.u());
        I(documentType);
    }

    public void H(Token.StartTag startTag) {
        HashMap<String, String> hashMap = new HashMap<>(this.n.peek());
        this.n.push(hashMap);
        Attributes attributes = startTag.h;
        if (attributes != null) {
            this.h.c(attributes);
            attributes.D(this.h);
            O(attributes, hashMap);
            D(attributes, hashMap);
        }
        String h = startTag.e.h();
        Tag A = A(h, startTag.f, P(h, hashMap), this.h);
        Element element = new Element(A, null, attributes);
        c().B1(element);
        x(element);
        if (startTag.F()) {
            A.w();
            s();
        } else if (A.h()) {
            s();
        } else {
            TokeniserState x = A.x();
            if (x != null) {
                this.c.y(x);
            }
        }
    }

    public void I(LeafNode leafNode) {
        c().B1(leafNode);
        p(leafNode);
    }

    public void J(Token.XmlDecl xmlDecl) {
        XmlDeclaration xmlDeclaration = new XmlDeclaration(xmlDecl.G(), xmlDecl.t);
        if (xmlDecl.h != null) {
            xmlDeclaration.p().h(xmlDecl.h);
        }
        I(xmlDeclaration);
    }

    @Override // org.jsoup.parser.TreeBuilder
    /* renamed from: K */
    public XmlTreeBuilder m() {
        return new XmlTreeBuilder();
    }

    public Document L(Reader reader, String str) {
        return q(reader, str, new Parser(this));
    }

    public Document M(String str, String str2) {
        return q(new StringReader(str), str2, new Parser(this));
    }

    public void N(Token.EndTag endTag) {
        Element element;
        String d = this.h.d(endTag.G());
        int size = this.e.size();
        int i = size - 1 >= 256 ? size - 257 : 0;
        int size2 = this.e.size() - 1;
        while (true) {
            if (size2 >= i) {
                element = this.e.get(size2);
                if (element.w0().equals(d)) {
                    break;
                }
                size2--;
            } else {
                element = null;
                break;
            }
        }
        if (element != null) {
            for (int size3 = this.e.size() - 1; size3 >= 0 && s() != element; size3--) {
            }
        }
    }

    @Override // org.jsoup.parser.TreeBuilder
    public List<Node> b() {
        return this.d.H();
    }

    @Override // org.jsoup.parser.TreeBuilder
    public String f() {
        return Parser.c1;
    }

    @Override // org.jsoup.parser.TreeBuilder
    public ParseSettings g() {
        return ParseSettings.d;
    }

    @Override // org.jsoup.parser.TreeBuilder
    public TagSet h() {
        return new TagSet();
    }

    @Override // org.jsoup.parser.TreeBuilder
    public void k(Reader reader, String str, Parser parser) {
        super.k(reader, str, parser);
        this.d.j5().q(Document.OutputSettings.Syntax.xml).f(Entities.EscapeMode.xhtml).n(false);
        this.n.clear();
        HashMap<String, String> hashMap = new HashMap<>();
        hashMap.put(C2730De2.w, Parser.c1);
        hashMap.put("", Parser.c1);
        this.n.push(hashMap);
    }

    @Override // org.jsoup.parser.TreeBuilder
    public void l(Element element) {
        super.l(element);
        if (element != null) {
            TokeniserState x = element.A4().x();
            if (x != null) {
                this.c.y(x);
            }
            Elements I3 = element.I3();
            I3.add(0, element);
            for (int size = I3.size() - 1; size >= 0; size--) {
                Element element2 = (Element) I3.get(size);
                HashMap<String, String> hashMap = new HashMap<>(this.n.peek());
                this.n.push(hashMap);
                if (element2.r() > 0) {
                    O(element2.p(), hashMap);
                }
            }
        }
    }

    @Override // org.jsoup.parser.TreeBuilder
    public Element s() {
        this.n.pop();
        return super.s();
    }

    @Override // org.jsoup.parser.TreeBuilder
    public boolean t(Token token) {
        this.g = token;
        switch (AnonymousClass1.a[token.a.ordinal()]) {
            case 1:
                H(token.e());
                return true;
            case 2:
                N(token.d());
                return true;
            case 3:
                F(token.b());
                return true;
            case 4:
                E(token.a());
                return true;
            case 5:
                G(token.c());
                return true;
            case 6:
                J(token.f());
                return true;
            case 7:
                return true;
            default:
                Validate.f("Unexpected token type: " + token.a);
                return true;
        }
    }
}
