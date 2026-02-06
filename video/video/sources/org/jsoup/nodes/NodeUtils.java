package org.jsoup.nodes;

import androidx.media.AudioAttributesCompat;
import java.util.Iterator;
import java.util.List;
import java.util.Spliterator;
import java.util.Spliterators;
import java.util.stream.Stream;
import java.util.stream.StreamSupport;
import org.jsoup.helper.Validate;
import org.jsoup.helper.W3CDom;
import org.jsoup.nodes.Document;
import org.jsoup.parser.HtmlTreeBuilder;
import org.jsoup.parser.Parser;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes4.dex */
public final class NodeUtils {
    public static Document.OutputSettings a(Node node) {
        Document N0 = node.N0();
        if (N0 != null) {
            return N0.j5();
        }
        return new Document("").j5();
    }

    public static Parser b(Node node) {
        Document N0 = node.N0();
        if (N0 != null) {
            return N0.m5();
        }
        return new Parser(new HtmlTreeBuilder());
    }

    public static <T extends Node> List<T> c(String str, Element element, Class<T> cls) {
        Validate.n(str);
        Validate.q(element);
        Validate.q(cls);
        W3CDom l = new W3CDom().l(false);
        return l.q(l.p(str, l.e(l.j(element))), cls);
    }

    public static <T extends Node> Spliterator<T> d(Iterator<T> it) {
        return Spliterators.spliteratorUnknownSize(it, (int) AudioAttributesCompat.O);
    }

    public static <T extends Node> Stream<T> e(Node node, Class<T> cls) {
        return StreamSupport.stream(d(new NodeIterator(node, cls)), false);
    }
}
