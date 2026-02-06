package o;

import java.util.Iterator;

/* renamed from: o.Wr2  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C4649Wr2 implements Iterator {
    public Iterator X;
    public InterfaceC3189Hs2 Y;

    public C4649Wr2() {
    }

    public Iterator b() {
        return this.X;
    }

    public InterfaceC3189Hs2 c() {
        return this.Y;
    }

    public void d(Iterator it) {
        this.X = it;
    }

    public void e(InterfaceC3189Hs2 interfaceC3189Hs2) {
        this.Y = interfaceC3189Hs2;
    }

    public Object f(Object obj) {
        InterfaceC3189Hs2 interfaceC3189Hs2 = this.Y;
        if (interfaceC3189Hs2 != null) {
            return interfaceC3189Hs2.a(obj);
        }
        return obj;
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.X.hasNext();
    }

    @Override // java.util.Iterator
    public Object next() {
        return f(this.X.next());
    }

    @Override // java.util.Iterator
    public void remove() {
        this.X.remove();
    }

    public C4649Wr2(Iterator it) {
        this.X = it;
    }

    public C4649Wr2(Iterator it, InterfaceC3189Hs2 interfaceC3189Hs2) {
        this.X = it;
        this.Y = interfaceC3189Hs2;
    }
}
