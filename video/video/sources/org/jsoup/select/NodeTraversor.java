package org.jsoup.select;

import java.util.Iterator;
import org.jsoup.helper.Validate;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.Node;
import org.jsoup.select.NodeFilter;

/* loaded from: classes4.dex */
public class NodeTraversor {
    public static final /* synthetic */ boolean a = false;

    public static NodeFilter.FilterResult a(NodeFilter nodeFilter, Node node) {
        Node node2 = node;
        int i = 0;
        while (node2 != null) {
            NodeFilter.FilterResult d = nodeFilter.d(node2, i);
            if (d == NodeFilter.FilterResult.STOP) {
                return d;
            }
            if (d == NodeFilter.FilterResult.CONTINUE && node2.G() > 0) {
                node2 = node2.F(0);
                i++;
            } else {
                while (node2.v0() == null && i > 0) {
                    NodeFilter.FilterResult filterResult = NodeFilter.FilterResult.CONTINUE;
                    if ((d == filterResult || d == NodeFilter.FilterResult.SKIP_CHILDREN) && (d = nodeFilter.b(node2, i)) == NodeFilter.FilterResult.STOP) {
                        return d;
                    }
                    Node S0 = node2.S0();
                    i--;
                    if (d == NodeFilter.FilterResult.REMOVE) {
                        node2.X0();
                    }
                    d = filterResult;
                    node2 = S0;
                }
                if ((d == NodeFilter.FilterResult.CONTINUE || d == NodeFilter.FilterResult.SKIP_CHILDREN) && (d = nodeFilter.b(node2, i)) == NodeFilter.FilterResult.STOP) {
                    return d;
                }
                if (node2 == node) {
                    return d;
                }
                Node v0 = node2.v0();
                if (d == NodeFilter.FilterResult.REMOVE) {
                    node2.X0();
                }
                node2 = v0;
            }
        }
        return NodeFilter.FilterResult.CONTINUE;
    }

    public static void b(NodeFilter nodeFilter, Elements elements) {
        Validate.q(nodeFilter);
        Validate.q(elements);
        Iterator<T> it = elements.iterator();
        while (it.hasNext() && a(nodeFilter, (Element) it.next()) != NodeFilter.FilterResult.STOP) {
        }
    }

    public static void c(NodeVisitor nodeVisitor, Node node) {
        int i;
        Validate.q(nodeVisitor);
        Validate.q(node);
        Node node2 = node;
        int i2 = 0;
        while (node2 != null) {
            Node S0 = node2.S0();
            if (S0 != null) {
                i = S0.G();
            } else {
                i = 0;
            }
            Node v0 = node2.v0();
            nodeVisitor.d(node2, i2);
            if (S0 != null && !node2.l0()) {
                if (i == S0.G()) {
                    node2 = S0.F(node2.k1());
                } else if (v0 == null) {
                    do {
                        i2--;
                        nodeVisitor.b(S0, i2);
                        if (S0 == node) {
                            break;
                        } else if (S0.v0() != null) {
                            node2 = S0.v0();
                            break;
                        } else {
                            S0 = S0.S0();
                        }
                    } while (S0 != null);
                    node2 = S0;
                    if (node2 == node || node2 == null) {
                        return;
                    }
                } else {
                    node2 = v0;
                }
            } else if (node2.G() > 0) {
                node2 = node2.F(0);
                i2++;
            } else {
                while (node2.v0() == null && i2 > 0) {
                    nodeVisitor.b(node2, i2);
                    node2 = node2.S0();
                    i2--;
                }
                nodeVisitor.b(node2, i2);
                if (node2 != node) {
                    node2 = node2.v0();
                } else {
                    return;
                }
            }
        }
    }

    public static void d(NodeVisitor nodeVisitor, Elements elements) {
        Validate.q(nodeVisitor);
        Validate.q(elements);
        Iterator<T> it = elements.iterator();
        while (it.hasNext()) {
            c(nodeVisitor, (Element) it.next());
        }
    }
}
