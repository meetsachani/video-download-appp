package o;

import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

/* renamed from: o.bU0  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C5341bU0<E> implements Iterator<E> {
    public final Queue<Iterator<? extends E>> X = new LinkedList();
    public Iterator<? extends E> Y = null;
    public Iterator<? extends E> Z = null;
    public boolean Y0 = false;

    public C5341bU0() {
    }

    public void b(Iterator<? extends E> it) {
        c();
        if (it != null) {
            this.X.add(it);
            return;
        }
        throw new NullPointerException("Iterator must not be null");
    }

    public final void c() {
        if (!this.Y0) {
            return;
        }
        throw new UnsupportedOperationException("IteratorChain cannot be changed after the first use of a method from the Iterator interface");
    }

    public boolean d() {
        return this.Y0;
    }

    public final void e() {
        if (!this.Y0) {
            this.Y0 = true;
        }
    }

    public int f() {
        return this.X.size();
    }

    public void g() {
        if (this.Y == null) {
            if (this.X.isEmpty()) {
                this.Y = C4579Wa0.b();
            } else {
                this.Y = this.X.remove();
            }
            this.Z = this.Y;
        }
        while (!this.Y.hasNext() && !this.X.isEmpty()) {
            this.Y = this.X.remove();
        }
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        e();
        g();
        Iterator<? extends E> it = this.Y;
        this.Z = it;
        return it.hasNext();
    }

    @Override // java.util.Iterator
    public E next() {
        e();
        g();
        Iterator<? extends E> it = this.Y;
        this.Z = it;
        return it.next();
    }

    @Override // java.util.Iterator
    public void remove() {
        e();
        if (this.Y == null) {
            g();
        }
        this.Z.remove();
    }

    public C5341bU0(Iterator<? extends E> it) {
        b(it);
    }

    public C5341bU0(Iterator<? extends E> it, Iterator<? extends E> it2) {
        b(it);
        b(it2);
    }

    public C5341bU0(Iterator<? extends E>... itArr) {
        for (Iterator<? extends E> it : itArr) {
            b(it);
        }
    }

    public C5341bU0(Collection<Iterator<? extends E>> collection) {
        for (Iterator<? extends E> it : collection) {
            b(it);
        }
    }
}
