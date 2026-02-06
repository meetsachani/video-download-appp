package o;

import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import o.C10471wS;

/* renamed from: o.zS  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C11200zS extends C10471wS implements List {
    public C10471wS Z0;
    public C10471wS.c a1;
    public C10471wS.c b1;

    public C11200zS(C10471wS c10471wS, int i, int i2) {
        C10471wS.c b;
        this.Z0 = null;
        this.a1 = null;
        this.b1 = null;
        if (i >= 0 && c10471wS.size() >= i2) {
            if (i <= i2) {
                this.Z0 = c10471wS;
                if (i < c10471wS.size()) {
                    this.Y.c(this.Z0.l(i));
                    if (this.Y.a() == null) {
                        b = null;
                    } else {
                        b = this.Y.a().b();
                    }
                    this.a1 = b;
                } else {
                    this.a1 = this.Z0.l(i - 1);
                }
                if (i == i2) {
                    this.Y.c(null);
                    this.Y.d(null);
                    if (i2 < c10471wS.size()) {
                        this.b1 = this.Z0.l(i2);
                    } else {
                        this.b1 = null;
                    }
                } else {
                    this.Y.d(this.Z0.l(i2 - 1));
                    this.b1 = this.Y.b().a();
                }
                this.X = i2 - i;
                this.Z = this.Z0.Z;
                return;
            }
            throw new IllegalArgumentException();
        }
        throw new IndexOutOfBoundsException();
    }

    @Override // o.C10471wS
    public void B(C10471wS.c cVar) {
        this.Z++;
        this.X--;
        if (this.Y.a() == cVar && this.Y.b() == cVar) {
            this.Y.c(null);
            this.Y.d(null);
        }
        if (this.Y.a() == cVar) {
            this.Y.c(cVar.a());
        }
        if (this.Y.b() == cVar) {
            this.Y.d(cVar.b());
        }
        this.Z0.B(cVar);
        i(cVar);
    }

    public void F() throws ConcurrentModificationException {
        if (this.Z == this.Z0.Z) {
            return;
        }
        throw new ConcurrentModificationException();
    }

    @Override // o.C10471wS, java.util.List, java.util.Collection
    public boolean add(Object obj) {
        F();
        return super.add(obj);
    }

    @Override // o.C10471wS, java.util.List, java.util.Collection
    public boolean addAll(Collection collection) {
        F();
        return super.addAll(collection);
    }

    @Override // o.C10471wS, java.util.List, java.util.Collection
    public void clear() {
        F();
        Iterator it = iterator();
        while (it.hasNext()) {
            it.next();
            it.remove();
        }
    }

    @Override // o.C10471wS, java.util.List, java.util.Collection
    public boolean contains(Object obj) {
        F();
        return super.contains(obj);
    }

    @Override // o.C10471wS, java.util.List, java.util.Collection
    public boolean containsAll(Collection collection) {
        F();
        return super.containsAll(collection);
    }

    @Override // o.C10471wS
    public boolean d(Object obj) {
        F();
        return super.d(obj);
    }

    @Override // o.C10471wS
    public boolean e(Object obj) {
        F();
        return super.e(obj);
    }

    @Override // o.C10471wS, java.util.List, java.util.Collection
    public boolean equals(Object obj) {
        F();
        return super.equals(obj);
    }

    @Override // o.C10471wS, java.util.List
    public Object get(int i) {
        F();
        return super.get(i);
    }

    @Override // o.C10471wS
    public Object getFirst() {
        F();
        return super.getFirst();
    }

    @Override // o.C10471wS
    public Object getLast() {
        F();
        return super.getLast();
    }

    @Override // o.C10471wS, java.util.List, java.util.Collection
    public int hashCode() {
        F();
        return super.hashCode();
    }

    @Override // o.C10471wS, java.util.List
    public int indexOf(Object obj) {
        F();
        return super.indexOf(obj);
    }

    @Override // o.C10471wS, java.util.List, java.util.Collection
    public boolean isEmpty() {
        F();
        return super.isEmpty();
    }

    @Override // o.C10471wS, java.util.List, java.util.Collection, java.lang.Iterable
    public Iterator iterator() {
        F();
        return super.iterator();
    }

    @Override // o.C10471wS, java.util.List
    public int lastIndexOf(Object obj) {
        F();
        return super.lastIndexOf(obj);
    }

    @Override // o.C10471wS, java.util.List
    public ListIterator listIterator(int i) {
        F();
        return super.listIterator(i);
    }

    @Override // o.C10471wS
    public C10471wS.c p(C10471wS.c cVar, C10471wS.c cVar2, Object obj) {
        C10471wS.c cVar3;
        C10471wS.c cVar4;
        this.Z++;
        this.X++;
        C10471wS c10471wS = this.Z0;
        if (cVar == null) {
            cVar3 = this.a1;
        } else {
            cVar3 = cVar;
        }
        if (cVar2 == null) {
            cVar4 = this.b1;
        } else {
            cVar4 = cVar2;
        }
        C10471wS.c p = c10471wS.p(cVar3, cVar4, obj);
        if (this.Y.a() == null) {
            this.Y.c(p);
            this.Y.d(p);
        }
        if (cVar == this.Y.b()) {
            this.Y.d(p);
        }
        if (cVar2 == this.Y.a()) {
            this.Y.c(p);
        }
        h(p);
        return p;
    }

    @Override // o.C10471wS, java.util.List, java.util.Collection
    public boolean remove(Object obj) {
        F();
        return super.remove(obj);
    }

    @Override // o.C10471wS, java.util.List, java.util.Collection
    public boolean removeAll(Collection collection) {
        F();
        return super.removeAll(collection);
    }

    @Override // o.C10471wS
    public Object removeFirst() {
        F();
        return super.removeFirst();
    }

    @Override // o.C10471wS
    public Object removeLast() {
        F();
        return super.removeLast();
    }

    @Override // o.C10471wS, java.util.List, java.util.Collection
    public boolean retainAll(Collection collection) {
        F();
        return super.retainAll(collection);
    }

    @Override // o.C10471wS, java.util.List
    public Object set(int i, Object obj) {
        F();
        return super.set(i, obj);
    }

    @Override // o.C10471wS, java.util.List, java.util.Collection
    public int size() {
        F();
        return super.size();
    }

    @Override // o.C10471wS, java.util.List
    public List subList(int i, int i2) {
        F();
        return super.subList(i, i2);
    }

    @Override // o.C10471wS, java.util.List, java.util.Collection
    public Object[] toArray() {
        F();
        return super.toArray();
    }

    @Override // o.C10471wS, java.util.List
    public void add(int i, Object obj) {
        F();
        super.add(i, obj);
    }

    @Override // o.C10471wS, java.util.List
    public boolean addAll(int i, Collection collection) {
        F();
        return super.addAll(i, collection);
    }

    @Override // o.C10471wS, java.util.List
    public ListIterator listIterator() {
        F();
        return super.listIterator();
    }

    @Override // o.C10471wS, java.util.List
    public Object remove(int i) {
        F();
        return super.remove(i);
    }

    @Override // o.C10471wS, java.util.List, java.util.Collection
    public Object[] toArray(Object[] objArr) {
        F();
        return super.toArray(objArr);
    }
}
