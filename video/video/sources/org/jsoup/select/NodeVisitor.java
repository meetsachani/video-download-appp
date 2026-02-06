package org.jsoup.select;

import org.jsoup.nodes.Node;

@FunctionalInterface
/* loaded from: classes4.dex */
public interface NodeVisitor {
    default void b(Node node, int i) {
    }

    default void c(Node node) {
        NodeTraversor.c(this, node);
    }

    void d(Node node, int i);
}
