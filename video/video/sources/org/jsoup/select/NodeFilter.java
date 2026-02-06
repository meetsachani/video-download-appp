package org.jsoup.select;

import org.jsoup.nodes.Node;

/* loaded from: classes4.dex */
public interface NodeFilter {

    /* loaded from: classes4.dex */
    public enum FilterResult {
        CONTINUE,
        SKIP_CHILDREN,
        SKIP_ENTIRELY,
        REMOVE,
        STOP
    }

    default FilterResult b(Node node, int i) {
        return FilterResult.CONTINUE;
    }

    default void c(Node node) {
        NodeTraversor.a(this, node);
    }

    FilterResult d(Node node, int i);
}
