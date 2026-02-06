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
import o.AbstractC8166n1;

/* renamed from: o.yS  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C10957yS<E> extends AbstractC8166n1<E> implements Serializable {
    private static final long serialVersionUID = 8836393098519411393L;
    public transient List<WeakReference<a<E>>> Y0;

    /* renamed from: o.yS$b */
    /* loaded from: classes4.dex */
    public static class b<E> extends a<E> {
        public final AbstractC8166n1.b<E> d1;

        public b(AbstractC8166n1.b<E> bVar, int i) {
            super((C10957yS) bVar.X, i + bVar.Y);
            this.d1 = bVar;
        }

        @Override // o.C10957yS.a, o.AbstractC8166n1.a, java.util.ListIterator
        public void add(E e) {
            super.add(e);
            AbstractC8166n1.b<E> bVar = this.d1;
            bVar.Y0 = this.X.Z;
            bVar.Z++;
        }

        @Override // o.C10957yS.a, o.AbstractC8166n1.a, java.util.ListIterator, java.util.Iterator
        public boolean hasNext() {
            if (nextIndex() < this.d1.Z) {
                return true;
            }
            return false;
        }

        @Override // o.C10957yS.a, o.AbstractC8166n1.a, java.util.ListIterator, o.InterfaceC8877pw1
        public boolean hasPrevious() {
            if (previousIndex() >= 0) {
                return true;
            }
            return false;
        }

        @Override // o.C10957yS.a, o.AbstractC8166n1.a, java.util.ListIterator
        public int nextIndex() {
            return super.nextIndex() - this.d1.Y;
        }

        @Override // o.C10957yS.a, o.AbstractC8166n1.a, java.util.ListIterator, java.util.Iterator
        public void remove() {
            AbstractC8166n1.b<E> bVar;
            super.remove();
            this.d1.Y0 = this.X.Z;
            bVar.Z--;
        }
    }

    public C10957yS() {
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

    @Override // o.AbstractC8166n1
    public void D() {
        super.D();
        this.Y0 = new ArrayList();
    }

    @Override // o.AbstractC8166n1
    public void G() {
        if (size() > 0) {
            Iterator<E> it = iterator();
            while (it.hasNext()) {
                it.next();
                it.remove();
            }
        }
    }

    @Override // o.AbstractC8166n1
    public void H(AbstractC8166n1.d<E> dVar) {
        super.H(dVar);
        M(dVar);
    }

    @Override // o.AbstractC8166n1
    public void J(AbstractC8166n1.d<E> dVar, E e) {
        super.J(dVar, e);
        K(dVar);
    }

    public void K(AbstractC8166n1.d<E> dVar) {
        Iterator<WeakReference<a<E>>> it = this.Y0.iterator();
        while (it.hasNext()) {
            a<E> aVar = it.next().get();
            if (aVar == null) {
                it.remove();
            } else {
                aVar.e(dVar);
            }
        }
    }

    public void L(AbstractC8166n1.d<E> dVar) {
        Iterator<WeakReference<a<E>>> it = this.Y0.iterator();
        while (it.hasNext()) {
            a<E> aVar = it.next().get();
            if (aVar == null) {
                it.remove();
            } else {
                aVar.f(dVar);
            }
        }
    }

    public void M(AbstractC8166n1.d<E> dVar) {
        Iterator<WeakReference<a<E>>> it = this.Y0.iterator();
        while (it.hasNext()) {
            a<E> aVar = it.next().get();
            if (aVar == null) {
                it.remove();
            } else {
                aVar.g(dVar);
            }
        }
    }

    public a<E> Q() {
        return U(0);
    }

    public a<E> U(int i) {
        a<E> aVar = new a<>(this, i);
        V(aVar);
        return aVar;
    }

    public void V(a<E> aVar) {
        Iterator<WeakReference<a<E>>> it = this.Y0.iterator();
        while (it.hasNext()) {
            if (it.next().get() == null) {
                it.remove();
            }
        }
        this.Y0.add(new WeakReference<>(aVar));
    }

    public void X(a<E> aVar) {
        Iterator<WeakReference<a<E>>> it = this.Y0.iterator();
        while (it.hasNext()) {
            WeakReference<a<E>> next = it.next();
            a<E> aVar2 = next.get();
            if (aVar2 == null) {
                it.remove();
            } else if (aVar2 == aVar) {
                next.clear();
                it.remove();
                return;
            }
        }
    }

    @Override // o.AbstractC8166n1
    public void f(AbstractC8166n1.d<E> dVar, AbstractC8166n1.d<E> dVar2) {
        super.f(dVar, dVar2);
        L(dVar);
    }

    @Override // o.AbstractC8166n1, java.util.List, java.util.Collection, java.lang.Iterable
    public Iterator<E> iterator() {
        return super.listIterator(0);
    }

    @Override // o.AbstractC8166n1, java.util.List
    public ListIterator<E> listIterator() {
        return U(0);
    }

    @Override // o.AbstractC8166n1
    public ListIterator<E> p(AbstractC8166n1.b<E> bVar, int i) {
        b bVar2 = new b(bVar, i);
        V(bVar2);
        return bVar2;
    }

    @Override // o.AbstractC8166n1, java.util.List
    public ListIterator<E> listIterator(int i) {
        return U(i);
    }

    public C10957yS(Collection<? extends E> collection) {
        super(collection);
    }

    /* renamed from: o.yS$a */
    /* loaded from: classes4.dex */
    public static class a<E> extends AbstractC8166n1.a<E> {
        public boolean a1;
        public boolean b1;
        public boolean c1;

        public a(C10957yS<E> c10957yS, int i) {
            super(c10957yS, i);
            this.b1 = true;
            this.c1 = false;
            this.a1 = true;
        }

        @Override // o.AbstractC8166n1.a, java.util.ListIterator
        public void add(E e) {
            super.add(e);
            this.Y = this.Y.b;
        }

        @Override // o.AbstractC8166n1.a
        public void b() {
            if (this.a1) {
                return;
            }
            throw new ConcurrentModificationException("Cursor closed");
        }

        public void d() {
            if (this.a1) {
                ((C10957yS) this.X).X(this);
                this.a1 = false;
            }
        }

        public void f(AbstractC8166n1.d<E> dVar) {
            if (dVar.a == this.Y0) {
                this.Y = dVar;
            } else if (this.Y.a == dVar) {
                this.Y = dVar;
            } else {
                this.b1 = false;
            }
        }

        public void g(AbstractC8166n1.d<E> dVar) {
            AbstractC8166n1.d<E> dVar2 = this.Y;
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

        @Override // o.AbstractC8166n1.a, java.util.ListIterator, java.util.Iterator
        public /* bridge */ /* synthetic */ boolean hasNext() {
            return super.hasNext();
        }

        @Override // o.AbstractC8166n1.a, java.util.ListIterator, o.InterfaceC8877pw1
        public /* bridge */ /* synthetic */ boolean hasPrevious() {
            return super.hasPrevious();
        }

        @Override // o.AbstractC8166n1.a, java.util.ListIterator, java.util.Iterator
        public /* bridge */ /* synthetic */ Object next() {
            return super.next();
        }

        @Override // o.AbstractC8166n1.a, java.util.ListIterator
        public int nextIndex() {
            if (!this.b1) {
                AbstractC8166n1.d<E> dVar = this.Y;
                AbstractC8166n1<E> abstractC8166n1 = this.X;
                AbstractC8166n1.d<E> dVar2 = abstractC8166n1.X;
                if (dVar == dVar2) {
                    this.Z = abstractC8166n1.size();
                } else {
                    int i = 0;
                    for (AbstractC8166n1.d<E> dVar3 = dVar2.b; dVar3 != this.Y; dVar3 = dVar3.b) {
                        i++;
                    }
                    this.Z = i;
                }
                this.b1 = true;
            }
            return this.Z;
        }

        @Override // o.AbstractC8166n1.a, java.util.ListIterator, o.InterfaceC8877pw1
        public /* bridge */ /* synthetic */ Object previous() {
            return super.previous();
        }

        @Override // o.AbstractC8166n1.a, java.util.ListIterator
        public /* bridge */ /* synthetic */ int previousIndex() {
            return super.previousIndex();
        }

        @Override // o.AbstractC8166n1.a, java.util.ListIterator, java.util.Iterator
        public void remove() {
            if (this.Y0 != null || !this.c1) {
                b();
                this.X.H(c());
            }
            this.c1 = false;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // o.AbstractC8166n1.a, java.util.ListIterator
        public /* bridge */ /* synthetic */ void set(Object obj) {
            super.set(obj);
        }

        public void e(AbstractC8166n1.d<E> dVar) {
        }
    }
}
