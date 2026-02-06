package o;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* renamed from: o.it1  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C7145it1 implements Iterator {
    public final C3815Oe X;
    public Object Y;
    public boolean Y0;
    public InterfaceC3189Hs2 Z;
    public Iterator Z0;
    public Object a1;
    public Iterator b1;

    public C7145it1(Object obj, InterfaceC3189Hs2 interfaceC3189Hs2) {
        this.X = new C3815Oe(8);
        this.Y0 = false;
        if (obj instanceof Iterator) {
            this.Z0 = (Iterator) obj;
        } else {
            this.Y = obj;
        }
        this.Z = interfaceC3189Hs2;
    }

    public void b(Object obj) {
        if (obj instanceof Iterator) {
            c((Iterator) obj);
            return;
        }
        this.a1 = obj;
        this.Y0 = true;
    }

    public void c(Iterator it) {
        Iterator it2 = this.Z0;
        if (it != it2) {
            if (it2 != null) {
                this.X.f(it2);
            }
            this.Z0 = it;
        }
        while (this.Z0.hasNext() && !this.Y0) {
            Object next = this.Z0.next();
            InterfaceC3189Hs2 interfaceC3189Hs2 = this.Z;
            if (interfaceC3189Hs2 != null) {
                next = interfaceC3189Hs2.a(next);
            }
            b(next);
        }
        if (this.Y0 || this.X.isEmpty()) {
            return;
        }
        Iterator it3 = (Iterator) this.X.pop();
        this.Z0 = it3;
        c(it3);
    }

    public void d() {
        if (!this.Y0) {
            Iterator it = this.Z0;
            if (it == null) {
                Object obj = this.Y;
                if (obj == null) {
                    return;
                }
                InterfaceC3189Hs2 interfaceC3189Hs2 = this.Z;
                if (interfaceC3189Hs2 == null) {
                    b(obj);
                } else {
                    b(interfaceC3189Hs2.a(obj));
                }
                this.Y = null;
                return;
            }
            c(it);
        }
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        d();
        return this.Y0;
    }

    @Override // java.util.Iterator
    public Object next() {
        d();
        if (this.Y0) {
            this.b1 = this.Z0;
            Object obj = this.a1;
            this.a1 = null;
            this.Y0 = false;
            return obj;
        }
        throw new NoSuchElementException("No more elements in the iteration");
    }

    @Override // java.util.Iterator
    public void remove() {
        Iterator it = this.b1;
        if (it != null) {
            it.remove();
            this.b1 = null;
            return;
        }
        throw new IllegalStateException("Iterator remove() cannot be called at this time");
    }

    public C7145it1(Iterator it) {
        this.X = new C3815Oe(8);
        this.Y0 = false;
        this.Z0 = it;
        this.Z = null;
    }
}
