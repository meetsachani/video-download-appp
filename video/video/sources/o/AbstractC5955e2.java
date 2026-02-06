package o;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.AbstractCollection;
import java.util.AbstractSet;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;
import o.InterfaceC6135em1;

/* renamed from: o.e2  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC5955e2<E> extends AbstractCollection<E> implements InterfaceC6135em1<E> {
    public transient Set<E> X;
    public transient Set<InterfaceC6135em1.a<E>> Y;

    /* renamed from: o.e2$a */
    /* loaded from: classes4.dex */
    public class a implements InterfaceC3287Is2<InterfaceC6135em1.a<E>, E> {
        public a() {
        }

        @Override // o.InterfaceC3287Is2
        /* renamed from: b */
        public E a(InterfaceC6135em1.a<E> aVar) {
            return aVar.a();
        }
    }

    /* renamed from: o.e2$b */
    /* loaded from: classes4.dex */
    public static abstract class b<E> implements InterfaceC6135em1.a<E> {
        @Override // o.InterfaceC6135em1.a
        public boolean equals(Object obj) {
            if (obj instanceof InterfaceC6135em1.a) {
                InterfaceC6135em1.a aVar = (InterfaceC6135em1.a) obj;
                E a = a();
                Object a2 = aVar.a();
                if (getCount() == aVar.getCount()) {
                    if (a != a2) {
                        if (a != null && a.equals(a2)) {
                            return true;
                        }
                    } else {
                        return true;
                    }
                }
            }
            return false;
        }

        @Override // o.InterfaceC6135em1.a
        public int hashCode() {
            int hashCode;
            E a = a();
            if (a == null) {
                hashCode = 0;
            } else {
                hashCode = a.hashCode();
            }
            return hashCode ^ getCount();
        }

        public String toString() {
            return String.format("%s:%d", a(), Integer.valueOf(getCount()));
        }
    }

    /* renamed from: o.e2$c */
    /* loaded from: classes4.dex */
    public static class c<E> extends AbstractSet<InterfaceC6135em1.a<E>> {
        public final AbstractC5955e2<E> X;

        public c(AbstractC5955e2<E> abstractC5955e2) {
            this.X = abstractC5955e2;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(Object obj) {
            if (!(obj instanceof InterfaceC6135em1.a)) {
                return false;
            }
            InterfaceC6135em1.a aVar = (InterfaceC6135em1.a) obj;
            if (this.X.I(aVar.a()) != aVar.getCount()) {
                return false;
            }
            return true;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public Iterator<InterfaceC6135em1.a<E>> iterator() {
            return this.X.e();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean remove(Object obj) {
            int I;
            if (!(obj instanceof InterfaceC6135em1.a)) {
                return false;
            }
            InterfaceC6135em1.a aVar = (InterfaceC6135em1.a) obj;
            Object a = aVar.a();
            if (!this.X.contains(a) || aVar.getCount() != (I = this.X.I(a))) {
                return false;
            }
            this.X.v(a, I);
            return true;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return this.X.k();
        }
    }

    /* renamed from: o.e2$d */
    /* loaded from: classes4.dex */
    public static class d<E> implements Iterator<E> {
        public final AbstractC5955e2<E> X;
        public final Iterator<InterfaceC6135em1.a<E>> Y;
        public int Y0;
        public InterfaceC6135em1.a<E> Z = null;
        public boolean Z0 = false;

        public d(AbstractC5955e2<E> abstractC5955e2) {
            this.X = abstractC5955e2;
            this.Y = abstractC5955e2.entrySet().iterator();
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            if (this.Y0 <= 0 && !this.Y.hasNext()) {
                return false;
            }
            return true;
        }

        @Override // java.util.Iterator
        public E next() {
            if (this.Y0 == 0) {
                InterfaceC6135em1.a<E> next = this.Y.next();
                this.Z = next;
                this.Y0 = next.getCount();
            }
            this.Z0 = true;
            this.Y0--;
            return this.Z.a();
        }

        @Override // java.util.Iterator
        public void remove() {
            if (this.Z0) {
                if (this.Z.getCount() > 1) {
                    this.X.remove(this.Z.a());
                } else {
                    this.Y.remove();
                }
                this.Z0 = false;
                return;
            }
            throw new IllegalStateException();
        }
    }

    /* renamed from: o.e2$e */
    /* loaded from: classes4.dex */
    public static class e<E> extends AbstractSet<E> {
        public final AbstractC5955e2<E> X;

        public e(AbstractC5955e2<E> abstractC5955e2) {
            this.X = abstractC5955e2;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public void clear() {
            this.X.clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(Object obj) {
            return this.X.contains(obj);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean containsAll(Collection<?> collection) {
            return this.X.containsAll(collection);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public Iterator<E> iterator() {
            return this.X.h();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean remove(Object obj) {
            AbstractC5955e2<E> abstractC5955e2 = this.X;
            if (abstractC5955e2.v(obj, abstractC5955e2.I(obj)) != 0) {
                return true;
            }
            return false;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return this.X.k();
        }
    }

    public int I(Object obj) {
        for (InterfaceC6135em1.a<E> aVar : entrySet()) {
            E a2 = aVar.a();
            if (a2 == obj || (a2 != null && a2.equals(obj))) {
                return aVar.getCount();
            }
        }
        return 0;
    }

    @Override // o.InterfaceC6135em1
    public int R(E e2, int i) {
        if (i >= 0) {
            int I = I(e2);
            if (I < i) {
                x(e2, i - I);
                return I;
            }
            v(e2, I - i);
            return I;
        }
        throw new IllegalArgumentException("Count must not be negative.");
    }

    @Override // java.util.AbstractCollection, java.util.Collection, o.InterfaceC6135em1
    public boolean add(E e2) {
        x(e2, 1);
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public void clear() {
        Iterator<InterfaceC6135em1.a<E>> it = entrySet().iterator();
        while (it.hasNext()) {
            it.next();
            it.remove();
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean contains(Object obj) {
        if (I(obj) > 0) {
            return true;
        }
        return false;
    }

    public Set<InterfaceC6135em1.a<E>> d() {
        return new c(this);
    }

    public abstract Iterator<InterfaceC6135em1.a<E>> e();

    @Override // o.InterfaceC6135em1
    public Set<InterfaceC6135em1.a<E>> entrySet() {
        if (this.Y == null) {
            this.Y = d();
        }
        return this.Y;
    }

    @Override // java.util.Collection, o.InterfaceC6135em1
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof InterfaceC6135em1)) {
            return false;
        }
        InterfaceC6135em1 interfaceC6135em1 = (InterfaceC6135em1) obj;
        if (interfaceC6135em1.size() != size()) {
            return false;
        }
        for (InterfaceC6135em1.a<E> aVar : entrySet()) {
            if (interfaceC6135em1.I(aVar.a()) != I(aVar.a())) {
                return false;
            }
        }
        return true;
    }

    public Set<E> f() {
        return new e(this);
    }

    public Iterator<E> h() {
        return C6566gU0.k0(entrySet().iterator(), new a());
    }

    @Override // java.util.Collection, o.InterfaceC6135em1
    public int hashCode() {
        return entrySet().hashCode();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void i(ObjectInputStream objectInputStream) throws IOException, ClassNotFoundException {
        int readInt = objectInputStream.readInt();
        for (int i = 0; i < readInt; i++) {
            R(objectInputStream.readObject(), objectInputStream.readInt());
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, o.InterfaceC6135em1
    public Iterator<E> iterator() {
        return new d(this);
    }

    public void j(ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.writeInt(entrySet().size());
        for (InterfaceC6135em1.a<E> aVar : entrySet()) {
            objectOutputStream.writeObject(aVar.a());
            objectOutputStream.writeInt(aVar.getCount());
        }
    }

    public abstract int k();

    @Override // java.util.AbstractCollection, java.util.Collection, o.InterfaceC6135em1
    public boolean remove(Object obj) {
        if (v(obj, 1) != 0) {
            return true;
        }
        return false;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, o.InterfaceC6135em1
    public boolean removeAll(Collection<?> collection) {
        boolean z;
        while (true) {
            boolean z2 = false;
            for (Object obj : collection) {
                if (v(obj, I(obj)) != 0) {
                    z = true;
                } else {
                    z = false;
                }
                if (z2 || z) {
                    z2 = true;
                }
            }
            return z2;
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, o.InterfaceC6135em1
    public int size() {
        int i = 0;
        for (InterfaceC6135em1.a<E> aVar : entrySet()) {
            i += aVar.getCount();
        }
        return i;
    }

    @Override // java.util.AbstractCollection
    public String toString() {
        return entrySet().toString();
    }

    public int v(Object obj, int i) {
        throw new UnsupportedOperationException();
    }

    public int x(E e2, int i) {
        throw new UnsupportedOperationException();
    }

    @Override // o.InterfaceC6135em1
    public Set<E> y() {
        if (this.X == null) {
            this.X = f();
        }
        return this.X;
    }
}
