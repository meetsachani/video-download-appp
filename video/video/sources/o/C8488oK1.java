package o;

import java.util.Iterator;

/* renamed from: o.oK1  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C8488oK1 implements Iterator {
    public Iterator X;

    public C8488oK1() {
    }

    public Iterator b() {
        return this.X;
    }

    public void c(Iterator it) {
        this.X = it;
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return b().hasNext();
    }

    @Override // java.util.Iterator
    public Object next() {
        return b().next();
    }

    @Override // java.util.Iterator
    public void remove() {
        b().remove();
    }

    public C8488oK1(Iterator it) {
        this.X = it;
    }
}
