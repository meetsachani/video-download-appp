package o;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/* renamed from: o.cU0  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C5583cU0 implements Iterator {
    public final List X = new ArrayList();
    public int Y = 0;
    public Iterator Z = null;
    public Iterator Y0 = null;
    public boolean Z0 = false;

    public C5583cU0() {
    }

    public void b(Iterator it) {
        c();
        if (it != null) {
            this.X.add(it);
            return;
        }
        throw new NullPointerException("Iterator must not be null");
    }

    public final void c() {
        if (!this.Z0) {
            return;
        }
        throw new UnsupportedOperationException("IteratorChain cannot be changed after the first use of a method from the Iterator interface");
    }

    public List d() {
        return C6978iB2.f(this.X);
    }

    public boolean e() {
        return this.Z0;
    }

    public final void f() {
        if (!this.Z0) {
            this.Z0 = true;
        }
    }

    public void g(int i, Iterator it) throws IndexOutOfBoundsException {
        c();
        if (it != null) {
            this.X.set(i, it);
            return;
        }
        throw new NullPointerException("Iterator must not be null");
    }

    public int h() {
        return this.X.size();
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        f();
        i();
        Iterator it = this.Z;
        this.Y0 = it;
        return it.hasNext();
    }

    public void i() {
        if (this.Z == null) {
            if (this.X.isEmpty()) {
                this.Z = C4482Va0.Y;
            } else {
                this.Z = (Iterator) this.X.get(0);
            }
            this.Y0 = this.Z;
        }
        while (!this.Z.hasNext() && this.Y < this.X.size() - 1) {
            int i = this.Y + 1;
            this.Y = i;
            this.Z = (Iterator) this.X.get(i);
        }
    }

    @Override // java.util.Iterator
    public Object next() {
        f();
        i();
        Iterator it = this.Z;
        this.Y0 = it;
        return it.next();
    }

    @Override // java.util.Iterator
    public void remove() {
        f();
        if (this.Z == null) {
            i();
        }
        this.Y0.remove();
    }

    public C5583cU0(Iterator it) {
        b(it);
    }

    public C5583cU0(Iterator it, Iterator it2) {
        b(it);
        b(it2);
    }

    public C5583cU0(Iterator[] itArr) {
        for (Iterator it : itArr) {
            b(it);
        }
    }

    public C5583cU0(Collection collection) {
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            b((Iterator) it.next());
        }
    }
}
