package o;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.lang.reflect.Array;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.Map;
import o.AbstractC5955e2;
import o.InterfaceC6135em1;

/* loaded from: classes4.dex */
public abstract class S1<E> extends AbstractC5955e2<E> {
    public transient int Y0;
    public transient Map<E, d> Z;
    public transient int Z0;

    /* loaded from: classes4.dex */
    public static class a<E> implements Iterator<InterfaceC6135em1.a<E>> {
        public final S1<E> X;
        public final Iterator<Map.Entry<E, d>> Y;
        public InterfaceC6135em1.a<E> Z = null;
        public boolean Y0 = false;

        public a(Iterator<Map.Entry<E, d>> it, S1<E> s1) {
            this.Y = it;
            this.X = s1;
        }

        @Override // java.util.Iterator
        /* renamed from: b */
        public InterfaceC6135em1.a<E> next() {
            c cVar = new c(this.Y.next());
            this.Z = cVar;
            this.Y0 = true;
            return cVar;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.Y.hasNext();
        }

        @Override // java.util.Iterator
        public void remove() {
            if (this.Y0) {
                this.Y.remove();
                this.Z = null;
                this.Y0 = false;
                return;
            }
            throw new IllegalStateException("Iterator remove() can only be called once after next()");
        }
    }

    /* loaded from: classes4.dex */
    public static class b<E> implements Iterator<E> {
        public final S1<E> X;
        public final Iterator<Map.Entry<E, d>> Y;
        public int Y0;
        public final int Z0;
        public Map.Entry<E, d> Z = null;
        public boolean a1 = false;

        public b(S1<E> s1) {
            this.X = s1;
            this.Y = s1.Z.entrySet().iterator();
            this.Z0 = s1.Z0;
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
            if (this.X.Z0 == this.Z0) {
                if (this.Y0 == 0) {
                    Map.Entry<E, d> next = this.Y.next();
                    this.Z = next;
                    this.Y0 = next.getValue().a;
                }
                this.a1 = true;
                this.Y0--;
                return this.Z.getKey();
            }
            throw new ConcurrentModificationException();
        }

        @Override // java.util.Iterator
        public void remove() {
            if (this.X.Z0 == this.Z0) {
                if (this.a1) {
                    d value = this.Z.getValue();
                    int i = value.a;
                    if (i > 1) {
                        value.a = i - 1;
                    } else {
                        this.Y.remove();
                    }
                    S1.r(this.X);
                    this.a1 = false;
                    return;
                }
                throw new IllegalStateException();
            }
            throw new ConcurrentModificationException();
        }
    }

    /* loaded from: classes4.dex */
    public static class c<E> extends AbstractC5955e2.b<E> {
        public final Map.Entry<E, d> a;

        public c(Map.Entry<E, d> entry) {
            this.a = entry;
        }

        @Override // o.InterfaceC6135em1.a
        public E a() {
            return this.a.getKey();
        }

        @Override // o.InterfaceC6135em1.a
        public int getCount() {
            return this.a.getValue().a;
        }
    }

    /* loaded from: classes4.dex */
    public static class d {
        public int a;

        public d(int i) {
            this.a = i;
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof d) || ((d) obj).a != this.a) {
                return false;
            }
            return true;
        }

        public int hashCode() {
            return this.a;
        }
    }

    /* loaded from: classes4.dex */
    public static class e<E> extends AbstractC6935i1<E> {
        public final S1<E> Y;
        public boolean Y0;
        public E Z;

        public e(Iterator<E> it, S1<E> s1) {
            super(it);
            this.Z = null;
            this.Y0 = false;
            this.Y = s1;
        }

        @Override // o.AbstractC6935i1, java.util.Iterator
        public E next() {
            E e = (E) super.next();
            this.Z = e;
            this.Y0 = true;
            return e;
        }

        @Override // o.C3, java.util.Iterator
        public void remove() {
            if (this.Y0) {
                int I = this.Y.I(this.Z);
                super.remove();
                this.Y.v(this.Z, I);
                this.Z = null;
                this.Y0 = false;
                return;
            }
            throw new IllegalStateException("Iterator remove() can only be called once after next()");
        }
    }

    public S1() {
    }

    public static /* synthetic */ int r(S1 s1) {
        int i = s1.Y0;
        s1.Y0 = i - 1;
        return i;
    }

    public void B(Map<E, d> map) {
        this.Z = map;
    }

    @Override // o.AbstractC5955e2, o.InterfaceC6135em1
    public int I(Object obj) {
        d dVar = this.Z.get(obj);
        if (dVar != null) {
            return dVar.a;
        }
        return 0;
    }

    @Override // o.AbstractC5955e2, java.util.AbstractCollection, java.util.Collection
    public void clear() {
        this.Z0++;
        this.Z.clear();
        this.Y0 = 0;
    }

    @Override // o.AbstractC5955e2, java.util.AbstractCollection, java.util.Collection
    public boolean contains(Object obj) {
        return this.Z.containsKey(obj);
    }

    @Override // o.AbstractC5955e2
    public Iterator<InterfaceC6135em1.a<E>> e() {
        return new a(this.Z.entrySet().iterator(), this);
    }

    @Override // o.AbstractC5955e2, java.util.Collection, o.InterfaceC6135em1
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
        for (E e2 : this.Z.keySet()) {
            if (interfaceC6135em1.I(e2) != I(e2)) {
                return false;
            }
        }
        return true;
    }

    @Override // o.AbstractC5955e2
    public Iterator<E> h() {
        return new e(w().keySet().iterator(), this);
    }

    @Override // o.AbstractC5955e2, java.util.Collection, o.InterfaceC6135em1
    public int hashCode() {
        int hashCode;
        int i = 0;
        for (Map.Entry<E, d> entry : this.Z.entrySet()) {
            E key = entry.getKey();
            d value = entry.getValue();
            if (key == null) {
                hashCode = 0;
            } else {
                hashCode = key.hashCode();
            }
            i += value.a ^ hashCode;
        }
        return i;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // o.AbstractC5955e2
    public void i(ObjectInputStream objectInputStream) throws IOException, ClassNotFoundException {
        int readInt = objectInputStream.readInt();
        for (int i = 0; i < readInt; i++) {
            Object readObject = objectInputStream.readObject();
            int readInt2 = objectInputStream.readInt();
            this.Z.put(readObject, new d(readInt2));
            this.Y0 += readInt2;
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean isEmpty() {
        return this.Z.isEmpty();
    }

    @Override // o.AbstractC5955e2, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, o.InterfaceC6135em1
    public Iterator<E> iterator() {
        return new b(this);
    }

    @Override // o.AbstractC5955e2
    public void j(ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.writeInt(this.Z.size());
        for (Map.Entry<E, d> entry : this.Z.entrySet()) {
            objectOutputStream.writeObject(entry.getKey());
            objectOutputStream.writeInt(entry.getValue().a);
        }
    }

    @Override // o.AbstractC5955e2
    public int k() {
        return this.Z.size();
    }

    @Override // o.AbstractC5955e2, java.util.AbstractCollection, java.util.Collection, o.InterfaceC6135em1
    public int size() {
        return this.Y0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public Object[] toArray() {
        Object[] objArr = new Object[size()];
        int i = 0;
        for (Map.Entry<E, d> entry : this.Z.entrySet()) {
            E key = entry.getKey();
            int i2 = entry.getValue().a;
            while (i2 > 0) {
                objArr[i] = key;
                i2--;
                i++;
            }
        }
        return objArr;
    }

    @Override // o.AbstractC5955e2, o.InterfaceC6135em1
    public int v(Object obj, int i) {
        if (i >= 0) {
            d dVar = this.Z.get(obj);
            if (dVar == null) {
                return 0;
            }
            int i2 = dVar.a;
            if (i > 0) {
                this.Z0++;
                if (i < i2) {
                    dVar.a = i2 - i;
                    this.Y0 -= i;
                    return i2;
                }
                this.Z.remove(obj);
                this.Y0 -= dVar.a;
                dVar.a = 0;
            }
            return i2;
        }
        throw new IllegalArgumentException("Occurrences must not be negative.");
    }

    public Map<E, d> w() {
        return this.Z;
    }

    @Override // o.AbstractC5955e2, o.InterfaceC6135em1
    public int x(E e2, int i) {
        int i2;
        if (i >= 0) {
            d dVar = this.Z.get(e2);
            if (dVar != null) {
                i2 = dVar.a;
            } else {
                i2 = 0;
            }
            if (i > 0) {
                this.Z0++;
                this.Y0 += i;
                if (dVar == null) {
                    this.Z.put(e2, new d(i));
                    return i2;
                }
                dVar.a += i;
            }
            return i2;
        }
        throw new IllegalArgumentException("Occurrences must not be negative.");
    }

    public S1(Map<E, d> map) {
        this.Z = map;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.AbstractCollection, java.util.Collection
    public <T> T[] toArray(T[] tArr) {
        int size = size();
        if (tArr.length < size) {
            tArr = (T[]) ((Object[]) Array.newInstance(tArr.getClass().getComponentType(), size));
        }
        int i = 0;
        for (Map.Entry<E, d> entry : this.Z.entrySet()) {
            E key = entry.getKey();
            int i2 = entry.getValue().a;
            while (i2 > 0) {
                tArr[i] = key;
                i2--;
                i++;
            }
        }
        while (i < tArr.length) {
            tArr[i] = null;
            i++;
        }
        return tArr;
    }
}
