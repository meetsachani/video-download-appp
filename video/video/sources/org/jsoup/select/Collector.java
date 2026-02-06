package org.jsoup.select;

import java.util.function.Supplier;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.Node;
import org.jsoup.select.Elements;
import org.jsoup.select.Nodes;

/* loaded from: classes4.dex */
public class Collector {
    private Collector() {
    }

    public static Elements a(Evaluator evaluator, Element element) {
        Stream<Element> e;
        if (evaluator.j()) {
            e = f(evaluator, element, Element.class);
        } else {
            e = e(evaluator, element);
        }
        return (Elements) e.collect(Collectors.toCollection(new Supplier() { // from class: o.zF
            @Override // java.util.function.Supplier
            public final Object get() {
                return new Elements();
            }
        }));
    }

    public static <T extends Node> Nodes<T> b(Evaluator evaluator, Element element, Class<T> cls) {
        return (Nodes) f(evaluator, element, cls).collect(Collectors.toCollection(new Supplier() { // from class: o.yF
            @Override // java.util.function.Supplier
            public final Object get() {
                return new Nodes();
            }
        }));
    }

    public static Element c(Evaluator evaluator, Element element) {
        return e(evaluator, element).findFirst().orElse(null);
    }

    public static <T extends Node> T d(Evaluator evaluator, Element element, Class<T> cls) {
        return (T) f(evaluator, element, cls).findFirst().orElse(null);
    }

    public static Stream<Element> e(Evaluator evaluator, Element element) {
        evaluator.i();
        return element.stream().filter(evaluator.d(element));
    }

    public static <T extends Node> Stream<T> f(Evaluator evaluator, Element element, Class<T> cls) {
        evaluator.i();
        return element.y0(cls).filter(evaluator.c(element));
    }
}
