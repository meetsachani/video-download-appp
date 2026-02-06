package o;

import java.util.Iterator;

/* renamed from: o.j1  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C7176j1 implements Iterator {
    public final Iterator X;

    public C7176j1(Iterator it) {
        if (it != null) {
            this.X = it;
            return;
        }
        throw new IllegalArgumentException("Iterator must not be null");
    }

    public Iterator b() {
        return this.X;
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.X.hasNext();
    }

    @Override // java.util.Iterator
    public Object next() {
        return this.X.next();
    }

    @Override // java.util.Iterator
    public void remove() {
        this.X.remove();
    }
}
