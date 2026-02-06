package o;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import o.AbstractC7905m1;

/* renamed from: o.xS  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C10714xS extends AbstractC7905m1 implements Serializable {
    private static final long serialVersionUID = 8836393098519411393L;
    public transient List Y0;

    /* renamed from: o.xS$b */
    /* loaded from: classes4.dex */
    public static class b extends a {
        public final AbstractC7905m1.b d1;

        public b(AbstractC7905m1.b bVar, int i) {
            super((C10714xS) bVar.X, i + bVar.Y);
            this.d1 = bVar;
        }

        @Override // o.C10714xS.a, o.AbstractC7905m1.a, java.util.ListIterator
        public void add(Object obj) {
            super.add(obj);
            AbstractC7905m1.b bVar = this.d1;
            bVar.Y0 = this.X.Z;
            bVar.Z++;
        }

        @Override // o.AbstractC7905m1.a, java.util.ListIterator, java.util.Iterator
        public boolean hasNext() {
            if (nextIndex() < this.d1.Z) {
                return true;
            }
            return false;
        }

        @Override // o.AbstractC7905m1.a, java.util.ListIterator, o.InterfaceC9127qw1
        public boolean hasPrevious() {
            if (previousIndex() >= 0) {
                return true;
            }
            return false;
        }

        @Override // o.C10714xS.a, o.AbstractC7905m1.a, java.util.ListIterator
        public int nextIndex() {
            return super.nextIndex() - this.d1.Y;
        }

        @Override // o.C10714xS.a, o.AbstractC7905m1.a, java.util.ListIterator, java.util.Iterator
        public void remove() {
            AbstractC7905m1.b bVar;
            super.remove();
            this.d1.Y0 = this.X.Z;
            bVar.Z--;
        }
    }

    public C10714xS() {
        this.Y0 = new ArrayList();
        D();
    }

    private void readObject(ObjectInputStream objectInputStream) throws IOException, ClassNotFoundException {
        objectInputStream.defaultReadObject();
        r(objectInputStream);
    }

    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.defaultWriteObject();
        w(objectOutputStream);
    }

    @Override // o.AbstractC7905m1
    public void D() {
        super.D();
        this.Y0 = new ArrayList();
    }

    @Override // o.AbstractC7905m1
    public void G() {
        if (size() > 0) {
            Iterator it = iterator();
            while (it.hasNext()) {
                it.next();
                it.remove();
            }
        }
    }

    @Override // o.AbstractC7905m1
    public void H(AbstractC7905m1.d dVar) {
        super.H(dVar);
        M(dVar);
    }

    @Override // o.AbstractC7905m1
    public void J(AbstractC7905m1.d dVar, Object obj) {
        super.J(dVar, obj);
        K(dVar);
    }

    public void K(AbstractC7905m1.d dVar) {
        Iterator it = this.Y0.iterator();
        while (it.hasNext()) {
            a aVar = (a) ((WeakReference) it.next()).get();
            if (aVar == null) {
                it.remove();
            } else {
                aVar.e(dVar);
            }
        }
    }

    public void L(AbstractC7905m1.d dVar) {
        Iterator it = this.Y0.iterator();
        while (it.hasNext()) {
            a aVar = (a) ((WeakReference) it.next()).get();
            if (aVar == null) {
                it.remove();
            } else {
                aVar.f(dVar);
            }
        }
    }

    public void M(AbstractC7905m1.d dVar) {
        Iterator it = this.Y0.iterator();
        while (it.hasNext()) {
            a aVar = (a) ((WeakReference) it.next()).get();
            if (aVar == null) {
                it.remove();
            } else {
                aVar.g(dVar);
            }
        }
    }

    public a Q() {
        return U(0);
    }

    public a U(int i) {
        a aVar = new a(this, i);
        V(aVar);
        return aVar;
    }

    public void V(a aVar) {
        Iterator it = this.Y0.iterator();
        while (it.hasNext()) {
            if (((WeakReference) it.next()).get() == null) {
                it.remove();
            }
        }
        this.Y0.add(new WeakReference(aVar));
    }

    public void X(a aVar) {
        Iterator it = this.Y0.iterator();
        while (it.hasNext()) {
            WeakReference weakReference = (WeakReference) it.next();
            a aVar2 = (a) weakReference.get();
            if (aVar2 == null) {
                it.remove();
            } else if (aVar2 == aVar) {
                weakReference.clear();
                it.remove();
                return;
            }
        }
    }

    @Override // o.AbstractC7905m1
    public void f(AbstractC7905m1.d dVar, AbstractC7905m1.d dVar2) {
        super.f(dVar, dVar2);
        L(dVar);
    }

    @Override // o.AbstractC7905m1, java.util.List, java.util.Collection, java.lang.Iterable
    public Iterator iterator() {
        return super.listIterator(0);
    }

    @Override // o.AbstractC7905m1, java.util.List
    public ListIterator listIterator() {
        return U(0);
    }

    @Override // o.AbstractC7905m1
    public ListIterator p(AbstractC7905m1.b bVar, int i) {
        b bVar2 = new b(bVar, i);
        V(bVar2);
        return bVar2;
    }

    @Override // o.AbstractC7905m1, java.util.List
    public ListIterator listIterator(int i) {
        return U(i);
    }

    public C10714xS(Collection collection) {
        super(collection);
        this.Y0 = new ArrayList();
    }

    /* renamed from: o.xS$a */
    /* loaded from: classes4.dex */
    public static class a extends AbstractC7905m1.a {
        public boolean a1;
        public boolean b1;
        public boolean c1;

        public a(C10714xS c10714xS, int i) {
            super(c10714xS, i);
            this.b1 = true;
            this.c1 = false;
            this.a1 = true;
        }

        @Override // o.AbstractC7905m1.a, java.util.ListIterator
        public void add(Object obj) {
            super.add(obj);
            this.Y = this.Y.b;
        }

        @Override // o.AbstractC7905m1.a
        public void b() {
            if (this.a1) {
                return;
            }
            throw new ConcurrentModificationException("Cursor closed");
        }

        public void d() {
            if (this.a1) {
                ((C10714xS) this.X).X(this);
                this.a1 = false;
            }
        }

        public void f(AbstractC7905m1.d dVar) {
            if (dVar.a == this.Y0) {
                this.Y = dVar;
            } else if (this.Y.a == dVar) {
                this.Y = dVar;
            } else {
                this.b1 = false;
            }
        }

        public void g(AbstractC7905m1.d dVar) {
            AbstractC7905m1.d dVar2 = this.Y;
            if (dVar == dVar2 && dVar == this.Y0) {
                this.Y = dVar.b;
                this.Y0 = null;
                this.c1 = true;
            } else if (dVar == dVar2) {
                this.Y = dVar.b;
                this.c1 = false;
            } else if (dVar == this.Y0) {
                this.Y0 = null;
                this.c1 = true;
                this.Z--;
            } else {
                this.b1 = false;
                this.c1 = false;
            }
        }

        @Override // o.AbstractC7905m1.a, java.util.ListIterator
        public int nextIndex() {
            if (!this.b1) {
                AbstractC7905m1.d dVar = this.Y;
                AbstractC7905m1 abstractC7905m1 = this.X;
                AbstractC7905m1.d dVar2 = abstractC7905m1.X;
                if (dVar == dVar2) {
                    this.Z = abstractC7905m1.size();
                } else {
                    int i = 0;
                    for (AbstractC7905m1.d dVar3 = dVar2.b; dVar3 != this.Y; dVar3 = dVar3.b) {
                        i++;
                    }
                    this.Z = i;
                }
                this.b1 = true;
            }
            return this.Z;
        }

        @Override // o.AbstractC7905m1.a, java.util.ListIterator, java.util.Iterator
        public void remove() {
            if (this.Y0 != null || !this.c1) {
                b();
                this.X.H(c());
            }
            this.c1 = false;
        }

        public void e(AbstractC7905m1.d dVar) {
        }
    }
}
