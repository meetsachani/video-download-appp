package org.jsoup.parser;

import androidx.media.AudioAttributesCompat;
import java.io.Closeable;
import java.io.IOException;
import java.io.Reader;
import java.io.StringReader;
import java.io.UncheckedIOException;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Queue;
import java.util.Spliterators;
import java.util.stream.Stream;
import java.util.stream.StreamSupport;
import org.jsoup.helper.Validate;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.Node;
import org.jsoup.select.Evaluator;
import org.jsoup.select.NodeVisitor;
import org.jsoup.select.Selector;

/* loaded from: classes4.dex */
public class StreamParser implements Closeable {
    public final Parser X;
    public final TreeBuilder Y;
    public Document Y0;
    public final ElementIterator Z;
    public boolean Z0;

    /* loaded from: classes4.dex */
    public final class ElementIterator implements Iterator<Element>, NodeVisitor {
        public final Queue<Element> X = new LinkedList();
        public Element Y;
        public Element Y0;
        public Element Z;

        public ElementIterator() {
        }

        @Override // org.jsoup.select.NodeVisitor
        public void b(Node node, int i) {
            if (node instanceof Element) {
                Element element = (Element) node;
                this.Y0 = element;
                Element s3 = element.s3();
                if (s3 != null) {
                    this.X.add(s3);
                }
            }
        }

        @Override // org.jsoup.select.NodeVisitor
        public void d(Node node, int i) {
            Element T0;
            if ((node instanceof Element) && (T0 = node.T0()) != null) {
                this.X.add(T0);
            }
        }

        public final void e() {
            if (!StreamParser.this.Z0 && this.Z == null) {
                if (!this.X.isEmpty()) {
                    this.Z = this.X.remove();
                    return;
                }
                while (StreamParser.this.Y.z()) {
                    if (!this.X.isEmpty()) {
                        this.Z = this.X.remove();
                        return;
                    }
                }
                StreamParser.this.u();
                StreamParser.this.close();
                Element element = this.Y0;
                if (element != null) {
                    this.Z = element;
                    this.Y0 = null;
                }
            }
        }

        @Override // java.util.Iterator
        /* renamed from: f */
        public Element next() {
            e();
            Element element = this.Z;
            if (element != null) {
                this.Y = element;
                this.Z = null;
                return element;
            }
            throw new NoSuchElementException();
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            e();
            if (this.Z != null) {
                return true;
            }
            return false;
        }

        @Override // java.util.Iterator
        public void remove() {
            Element element = this.Y;
            if (element != null) {
                element.X0();
                return;
            }
            throw new NoSuchElementException();
        }

        public void reset() {
            this.X.clear();
            this.Y0 = null;
            this.Z = null;
            this.Y = null;
            StreamParser.this.Z0 = false;
        }
    }

    public StreamParser(Parser parser) {
        ElementIterator elementIterator = new ElementIterator();
        this.Z = elementIterator;
        this.Z0 = false;
        this.X = parser;
        TreeBuilder e = parser.e();
        this.Y = e;
        e.n(elementIterator);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.Y.a();
    }

    public Document h() throws IOException {
        Document j = j();
        this.Y.y();
        return j;
    }

    public List<Node> i() throws IOException {
        this.Y.y();
        return this.Y.b();
    }

    public Iterator<Element> iterator() {
        return this.Z;
    }

    public Document j() {
        Document document = this.Y.d;
        this.Y0 = document;
        Validate.r(document, "Must run parse() before calling.");
        return this.Y0;
    }

    public Element k(String str) throws IOException {
        return (Element) Validate.e(q(str), "No elements matched the query '%s' in the document.", str);
    }

    public Element l(String str) throws IOException {
        return (Element) Validate.e(s(str), "No elements matched the query '%s' in the document.", str);
    }

    public StreamParser m(Reader reader, String str) {
        close();
        this.Z.reset();
        this.Y.k(reader, str, this.X);
        this.Y0 = this.Y.d;
        return this;
    }

    public StreamParser n(String str, String str2) {
        return m(new StringReader(str), str2);
    }

    public StreamParser o(Reader reader, Element element, String str) {
        m(reader, str);
        this.Y.l(element);
        return this;
    }

    public StreamParser p(String str, Element element, String str2) {
        return o(new StringReader(str), element, str2);
    }

    public Element q(String str) throws IOException {
        return r(Selector.b(str));
    }

    public Element r(Evaluator evaluator) throws IOException {
        Element e4 = j().e4(evaluator);
        if (e4 != null) {
            return e4;
        }
        return t(evaluator);
    }

    public Element s(String str) throws IOException {
        return t(Selector.b(str));
    }

    public Element t(Evaluator evaluator) throws IOException {
        try {
            return v().filter(evaluator.d(j())).findFirst().orElse(null);
        } catch (UncheckedIOException e) {
            throw e.getCause();
        }
    }

    public StreamParser u() {
        this.Z0 = true;
        return this;
    }

    public Stream<Element> v() {
        return StreamSupport.stream(Spliterators.spliteratorUnknownSize(this.Z, (int) AudioAttributesCompat.O), false);
    }
}
