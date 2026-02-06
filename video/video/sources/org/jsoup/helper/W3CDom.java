package org.jsoup.helper;

import java.io.StringWriter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Properties;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import javax.xml.xpath.XPathConstants;
import javax.xml.xpath.XPathExpressionException;
import javax.xml.xpath.XPathFactory;
import javax.xml.xpath.XPathFactoryConfigurationException;
import o.C2730De2;
import org.jsoup.internal.Normalizer;
import org.jsoup.internal.StringUtil;
import org.jsoup.nodes.Attribute;
import org.jsoup.nodes.Comment;
import org.jsoup.nodes.DataNode;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.TextNode;
import org.jsoup.parser.HtmlTreeBuilder;
import org.jsoup.parser.XmlTreeBuilder;
import org.jsoup.select.NodeVisitor;
import org.jsoup.select.Selector;
import org.w3c.dom.DOMException;
import org.w3c.dom.DOMImplementation;
import org.w3c.dom.Document;
import org.w3c.dom.DocumentType;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

/* loaded from: classes4.dex */
public class W3CDom {
    public static final String c = "jsoupSource";
    public static final String d = "jsoupContextSource";
    public static final String e = "jsoupContextNode";
    public static final String f = "javax.xml.xpath.XPathFactory:jsoup";
    public static final /* synthetic */ boolean g = false;
    public DocumentBuilderFactory a;
    public boolean b = true;

    /* loaded from: classes4.dex */
    public static class W3CBuilder implements NodeVisitor {
        public static final String a1 = "undefined";
        public final Document X;
        public boolean Y = true;
        public Document.OutputSettings.Syntax Y0 = Document.OutputSettings.Syntax.xml;
        public Node Z;
        public final Element Z0;

        public W3CBuilder(org.w3c.dom.Document document) {
            this.X = document;
            this.Z = document;
            this.Z0 = (Element) document.getUserData(W3CDom.d);
        }

        @Override // org.jsoup.select.NodeVisitor
        public void b(org.jsoup.nodes.Node node, int i) {
            if ((node instanceof Element) && (this.Z.getParentNode() instanceof org.w3c.dom.Element)) {
                this.Z = this.Z.getParentNode();
            }
        }

        @Override // org.jsoup.select.NodeVisitor
        public void d(org.jsoup.nodes.Node node, int i) {
            String str;
            if (node instanceof Element) {
                Element element = (Element) node;
                if (this.Y) {
                    str = element.A4().q();
                } else {
                    str = null;
                }
                String d = Normalizer.d(element.B4());
                if (str == null) {
                    try {
                        if (d.contains(":")) {
                            str = "";
                        }
                    } catch (DOMException unused) {
                        f(this.X.createTextNode("<" + d + ">"), element);
                        return;
                    }
                }
                org.w3c.dom.Element createElementNS = this.X.createElementNS(str, d);
                g(element, createElementNS);
                f(createElementNS, element);
                if (element == this.Z0) {
                    this.X.setUserData(W3CDom.e, createElementNS, null);
                }
                this.Z = createElementNS;
            } else if (node instanceof TextNode) {
                TextNode textNode = (TextNode) node;
                f(this.X.createTextNode(textNode.A1()), textNode);
            } else if (node instanceof Comment) {
                Comment comment = (Comment) node;
                f(this.X.createComment(comment.A1()), comment);
            } else if (node instanceof DataNode) {
                DataNode dataNode = (DataNode) node;
                f(this.X.createTextNode(dataNode.z1()), dataNode);
            }
        }

        public final void f(Node node, org.jsoup.nodes.Node node2) {
            node.setUserData(W3CDom.c, node2, null);
            this.Z.appendChild(node);
        }

        public final void g(Element element, org.w3c.dom.Element element2) {
            Iterator<Attribute> it = element.p().iterator();
            while (it.hasNext()) {
                Attribute next = it.next();
                try {
                    i(element, element2, next, this.Y0);
                } catch (DOMException unused) {
                    Document.OutputSettings.Syntax syntax = this.Y0;
                    Document.OutputSettings.Syntax syntax2 = Document.OutputSettings.Syntax.xml;
                    if (syntax != syntax2) {
                        i(element, element2, next, syntax2);
                    }
                }
            }
        }

        public final void h(String str, String str2, Element element, org.w3c.dom.Element element2) {
            int indexOf;
            if (this.Y && str.isEmpty() && (indexOf = str2.indexOf(58)) != -1) {
                String substring = str2.substring(0, indexOf);
                if (!substring.equals(XmlTreeBuilder.f937o)) {
                    org.jsoup.nodes.Document N0 = element.N0();
                    if (N0 != null && (N0.m5().e() instanceof HtmlTreeBuilder)) {
                        for (Element element3 = element; element3 != null; element3 = element3.O0()) {
                            String k = element3.k(XmlTreeBuilder.p + substring);
                            if (!k.isEmpty()) {
                                element2.setAttributeNS(k, str2, element.k(str2));
                                return;
                            }
                        }
                    }
                    element2.setAttribute(XmlTreeBuilder.p + substring, "undefined");
                }
            }
        }

        public final void i(Element element, org.w3c.dom.Element element2, Attribute attribute, Document.OutputSettings.Syntax syntax) throws DOMException {
            String e = Attribute.e(attribute.getKey(), syntax);
            if (e != null) {
                String t = attribute.t();
                if (this.Y && !t.isEmpty()) {
                    element2.setAttributeNS(t, e, attribute.getValue());
                } else {
                    element2.setAttribute(e, attribute.getValue());
                }
                h(t, e, element, element2);
            }
        }
    }

    public W3CDom() {
        DocumentBuilderFactory newInstance = DocumentBuilderFactory.newInstance();
        this.a = newInstance;
        newInstance.setNamespaceAware(true);
    }

    public static HashMap<String, String> a() {
        return k("html");
    }

    public static HashMap<String, String> b() {
        return k(C2730De2.w);
    }

    public static String d(org.w3c.dom.Document document, Map<String, String> map) {
        try {
            DOMSource dOMSource = new DOMSource(document);
            StringWriter stringWriter = new StringWriter();
            StreamResult streamResult = new StreamResult(stringWriter);
            Transformer newTransformer = TransformerFactory.newInstance().newTransformer();
            if (map != null) {
                newTransformer.setOutputProperties(n(map));
            }
            if (document.getDoctype() != null) {
                DocumentType doctype = document.getDoctype();
                if (!StringUtil.k(doctype.getPublicId())) {
                    newTransformer.setOutputProperty("doctype-public", doctype.getPublicId());
                }
                if (!StringUtil.k(doctype.getSystemId())) {
                    newTransformer.setOutputProperty("doctype-system", doctype.getSystemId());
                } else if (doctype.getName().equalsIgnoreCase("html") && StringUtil.k(doctype.getPublicId()) && StringUtil.k(doctype.getSystemId())) {
                    newTransformer.setOutputProperty("doctype-system", "about:legacy-compat");
                }
            }
            newTransformer.transform(dOMSource, streamResult);
            return stringWriter.toString();
        } catch (TransformerException e2) {
            throw new IllegalStateException(e2);
        }
    }

    public static org.w3c.dom.Document f(org.jsoup.nodes.Document document) {
        return new W3CDom().i(document);
    }

    public static HashMap<String, String> k(String str) {
        HashMap<String, String> hashMap = new HashMap<>();
        hashMap.put("method", str);
        return hashMap;
    }

    public static Properties n(Map<String, String> map) {
        Properties properties = new Properties();
        properties.putAll(map);
        return properties;
    }

    public String c(org.w3c.dom.Document document) {
        return d(document, null);
    }

    public Node e(org.w3c.dom.Document document) {
        return (Node) document.getUserData(e);
    }

    public void g(org.jsoup.nodes.Document document, org.w3c.dom.Document document2) {
        h(document, document2);
    }

    public void h(Element element, org.w3c.dom.Document document) {
        W3CBuilder w3CBuilder = new W3CBuilder(document);
        w3CBuilder.Y = this.b;
        org.jsoup.nodes.Document N0 = element.N0();
        if (N0 != null) {
            if (!StringUtil.k(N0.i5())) {
                document.setDocumentURI(N0.i5());
            }
            w3CBuilder.Y0 = N0.j5().p();
        }
        if (element instanceof org.jsoup.nodes.Document) {
            element = element.w2();
        }
        w3CBuilder.c(element);
    }

    public org.w3c.dom.Document i(org.jsoup.nodes.Document document) {
        return j(document);
    }

    public org.w3c.dom.Document j(Element element) {
        org.jsoup.nodes.DocumentType documentType;
        Element element2;
        Validate.q(element);
        try {
            DocumentBuilder newDocumentBuilder = this.a.newDocumentBuilder();
            DOMImplementation dOMImplementation = newDocumentBuilder.getDOMImplementation();
            org.w3c.dom.Document newDocument = newDocumentBuilder.newDocument();
            org.jsoup.nodes.Document N0 = element.N0();
            if (N0 != null) {
                documentType = N0.Z4();
            } else {
                documentType = null;
            }
            if (documentType != null) {
                try {
                    newDocument.appendChild(dOMImplementation.createDocumentType(documentType.z1(), documentType.A1(), documentType.E1()));
                } catch (DOMException unused) {
                }
            }
            newDocument.setXmlStandalone(true);
            if (element instanceof org.jsoup.nodes.Document) {
                element2 = element.w2();
            } else {
                element2 = element;
            }
            newDocument.setUserData(d, element2, null);
            if (N0 != null) {
                element = N0;
            }
            h(element, newDocument);
            return newDocument;
        } catch (ParserConfigurationException e2) {
            throw new IllegalStateException(e2);
        }
    }

    public W3CDom l(boolean z) {
        this.b = z;
        this.a.setNamespaceAware(z);
        return this;
    }

    public boolean m() {
        return this.b;
    }

    public NodeList o(String str, org.w3c.dom.Document document) {
        return p(str, document);
    }

    public NodeList p(String str, Node node) {
        XPathFactory newInstance;
        Validate.p(str, "xpath");
        Validate.s(node, "contextNode");
        try {
            if (System.getProperty(f) != null) {
                newInstance = XPathFactory.newInstance("jsoup");
            } else {
                newInstance = XPathFactory.newInstance();
            }
            NodeList nodeList = (NodeList) newInstance.newXPath().compile(str).evaluate(node, XPathConstants.NODESET);
            Validate.q(nodeList);
            return nodeList;
        } catch (XPathExpressionException e2) {
            e = e2;
            throw new Selector.SelectorParseException(e, "Could not evaluate XPath query [%s]: %s", str, e.getMessage());
        } catch (XPathFactoryConfigurationException e3) {
            e = e3;
            throw new Selector.SelectorParseException(e, "Could not evaluate XPath query [%s]: %s", str, e.getMessage());
        }
    }

    public <T extends org.jsoup.nodes.Node> List<T> q(NodeList nodeList, Class<T> cls) {
        Validate.q(nodeList);
        Validate.q(cls);
        ArrayList arrayList = new ArrayList(nodeList.getLength());
        for (int i = 0; i < nodeList.getLength(); i++) {
            Object userData = nodeList.item(i).getUserData(c);
            if (cls.isInstance(userData)) {
                arrayList.add(cls.cast(userData));
            }
        }
        return arrayList;
    }
}
