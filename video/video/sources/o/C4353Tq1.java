package o;

import java.util.Iterator;
import java.util.NoSuchElementException;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

/* renamed from: o.Tq1  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C4353Tq1 implements Iterator<Node> {
    public final NodeList X;
    public int Y = 0;

    public C4353Tq1(Node node) {
        if (node != null) {
            this.X = node.getChildNodes();
            return;
        }
        throw new NullPointerException("Node must not be null.");
    }

    @Override // java.util.Iterator
    /* renamed from: b */
    public Node next() {
        NodeList nodeList = this.X;
        if (nodeList != null && this.Y < nodeList.getLength()) {
            NodeList nodeList2 = this.X;
            int i = this.Y;
            this.Y = i + 1;
            return nodeList2.item(i);
        }
        throw new NoSuchElementException("underlying nodeList has no more elements");
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        NodeList nodeList = this.X;
        if (nodeList != null && this.Y < nodeList.getLength()) {
            return true;
        }
        return false;
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException("remove() method not supported for a NodeListIterator.");
    }

    public C4353Tq1(NodeList nodeList) {
        if (nodeList != null) {
            this.X = nodeList;
            return;
        }
        throw new NullPointerException("NodeList must not be null.");
    }
}
