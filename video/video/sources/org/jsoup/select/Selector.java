package org.jsoup.select;

import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.stream.Stream;
import org.jsoup.helper.Validate;
import org.jsoup.nodes.Element;
import org.jsoup.parser.TokenQueue;
import org.jsoup.select.Elements;

/* loaded from: classes4.dex */
public class Selector {

    /* loaded from: classes4.dex */
    public static class SelectorParseException extends IllegalStateException {
        public SelectorParseException(String str) {
            super(str);
        }

        public SelectorParseException(String str, Object... objArr) {
            super(String.format(str, objArr));
        }

        public SelectorParseException(Throwable th, String str, Object... objArr) {
            super(String.format(str, objArr), th);
        }
    }

    private Selector() {
    }

    public static String a(String str) {
        return TokenQueue.t(str);
    }

    public static Evaluator b(String str) {
        return QueryParser.z(str);
    }

    public static Elements c(Collection<Element> collection, Collection<Element> collection2) {
        Elements elements = new Elements();
        for (Element element : collection) {
            Iterator<Element> it = collection2.iterator();
            while (true) {
                if (it.hasNext()) {
                    if (element.equals(it.next())) {
                        break;
                    }
                } else {
                    elements.add(element);
                    break;
                }
            }
        }
        return elements;
    }

    public static Elements d(String str, Iterable<Element> iterable) {
        Validate.n(str);
        Validate.q(iterable);
        Evaluator b = b(str);
        final Elements elements = new Elements();
        final HashSet hashSet = new HashSet();
        for (Element element : iterable) {
            j(b, element).filter(new Predicate() { // from class: o.m02
                @Override // java.util.function.Predicate
                public final boolean test(Object obj) {
                    return hashSet.add((Element) obj);
                }
            }).forEach(new Consumer() { // from class: o.n02
                @Override // java.util.function.Consumer
                public final void accept(Object obj) {
                    Elements.this.add((Element) obj);
                }
            });
        }
        return elements;
    }

    public static Elements e(String str, Element element) {
        Validate.n(str);
        return f(b(str), element);
    }

    public static Elements f(Evaluator evaluator, Element element) {
        Validate.q(evaluator);
        Validate.q(element);
        return Collector.a(evaluator, element);
    }

    public static Element g(String str, Iterable<Element> iterable) {
        Validate.n(str);
        Validate.q(iterable);
        Evaluator b = b(str);
        for (Element element : iterable) {
            Element c = Collector.c(b, element);
            if (c != null) {
                return c;
            }
        }
        return null;
    }

    public static Element h(String str, Element element) {
        Validate.n(str);
        return Collector.c(b(str), element);
    }

    public static Stream<Element> i(String str, Element element) {
        Validate.n(str);
        return j(b(str), element);
    }

    public static Stream<Element> j(Evaluator evaluator, Element element) {
        Validate.q(evaluator);
        Validate.q(element);
        return Collector.e(evaluator, element);
    }

    public static String k(String str) {
        TokenQueue tokenQueue = new TokenQueue(str);
        try {
            String m = tokenQueue.m();
            tokenQueue.close();
            return m;
        } catch (Throwable th) {
            try {
                tokenQueue.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }
}
