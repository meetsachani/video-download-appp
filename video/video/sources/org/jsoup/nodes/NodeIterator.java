package org.jsoup.nodes;

import java.util.Iterator;
import java.util.NoSuchElementException;
import org.jsoup.helper.Validate;
import org.jsoup.nodes.Node;

/* loaded from: classes4.dex */
public class NodeIterator<T extends Node> implements Iterator<T> {
    public Node X;
    public T Y;
    public Node Y0;
    public Node Z;
    public Node Z0;
    public final Class<T> a1;

    public NodeIterator(Node node, Class<T> cls) {
        Validate.q(node);
        Validate.q(cls);
        this.a1 = cls;
        f(node);
    }

    public static NodeIterator<Node> c(Node node) {
        return new NodeIterator<>(node, Node.class);
    }

    public final T b() {
        Node node = (T) this.Z;
        do {
            if (node.G() > 0) {
                node = (T) node.F(0);
            } else if (this.X.equals(node)) {
                node = (T) null;
            } else if (node.v0() != null) {
                node = (T) node.v0();
            } else {
                do {
                    node = node.O0();
                    if (node == null || this.X.equals(node)) {
                        return null;
                    }
                } while (node.v0() == null);
                node = (T) node.v0();
            }
            if (node == null) {
                return null;
            }
        } while (!this.a1.isInstance(node));
        return (T) node;
    }

    public final void d() {
        if (this.Y != null) {
            return;
        }
        if (this.Z0 != null && !this.Z.l0()) {
            this.Z = this.Y0;
        }
        this.Y = b();
    }

    @Override // java.util.Iterator
    /* renamed from: e */
    public T next() {
        d();
        T t = this.Y;
        if (t != null) {
            this.Y0 = this.Z;
            this.Z = t;
            this.Z0 = t.O0();
            this.Y = null;
            return t;
        }
        throw new NoSuchElementException();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void f(Node node) {
        if (this.a1.isInstance(node)) {
            this.Y = node;
        }
        this.Z = node;
        this.Y0 = node;
        this.X = node;
        this.Z0 = node.O0();
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        d();
        if (this.Y != null) {
            return true;
        }
        return false;
    }

    @Override // java.util.Iterator
    public void remove() {
        this.Z.X0();
    }
}
