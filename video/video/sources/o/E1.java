package o;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.lang.reflect.Array;
import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import okhttp3.HttpUrl;

/* loaded from: classes4.dex */
public abstract class E1<E> implements InterfaceC2958Fk<E> {
    public transient Map<E, b> X;
    public int Y;
    public transient Set<E> Y0;
    public transient int Z;

    /* loaded from: classes4.dex */
    public static class a<E> implements Iterator<E> {
        public final E1<E> X;
        public final Iterator<Map.Entry<E, b>> Y;
        public int Y0;
        public final int Z0;
        public Map.Entry<E, b> Z = null;
        public boolean a1 = false;

        public a(E1<E> e1) {
            this.X = e1;
            this.Y = e1.X.entrySet().iterator();
            this.Z0 = e1.Z;
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
            if (this.X.Z == this.Z0) {
                if (this.Y0 == 0) {
                    Map.Entry<E, b> next = this.Y.next();
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
            if (this.X.Z == this.Z0) {
                if (this.a1) {
                    b value = this.Z.getValue();
                    int i = value.a;
                    if (i > 1) {
                        value.a = i - 1;
                    } else {
                        this.Y.remove();
                    }
                    E1.f(this.X);
                    this.a1 = false;
                    return;
                }
                throw new IllegalStateException();
            }
            throw new ConcurrentModificationException();
        }
    }

    /* loaded from: classes4.dex */
    public static class b {
        public int a;

        public b(int i) {
            this.a = i;
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof b) || ((b) obj).a != this.a) {
                return false;
            }
            return true;
        }

        public int hashCode() {
            return this.a;
        }
    }

    public E1() {
    }

    public static /* synthetic */ int f(E1 e1) {
        int i = e1.Y;
        e1.Y = i - 1;
        return i;
    }

    @Override // o.InterfaceC2958Fk
    public int I(Object obj) {
        b bVar = this.X.get(obj);
        if (bVar != null) {
            return bVar.a;
        }
        return 0;
    }

    @Override // o.InterfaceC2958Fk, java.util.Collection
    public boolean add(E e) {
        return x(e, 1);
    }

    @Override // java.util.Collection
    public boolean addAll(Collection<? extends E> collection) {
        while (true) {
            boolean z = false;
            for (E e : collection) {
                boolean add = add(e);
                if (z || add) {
                    z = true;
                }
            }
            return z;
        }
    }

    @Override // java.util.Collection
    public void clear() {
        this.Z++;
        this.X.clear();
        this.Y = 0;
    }

    @Override // java.util.Collection
    public boolean contains(Object obj) {
        return this.X.containsKey(obj);
    }

    @Override // o.InterfaceC2958Fk, java.util.Collection
    public boolean containsAll(Collection<?> collection) {
        if (collection instanceof InterfaceC2958Fk) {
            return h((InterfaceC2958Fk) collection);
        }
        return h(new C7480kG0(collection));
    }

    @Override // java.util.Collection
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof InterfaceC2958Fk)) {
            return false;
        }
        InterfaceC2958Fk interfaceC2958Fk = (InterfaceC2958Fk) obj;
        if (interfaceC2958Fk.size() != size()) {
            return false;
        }
        for (E e : this.X.keySet()) {
            if (interfaceC2958Fk.I(e) != I(e)) {
                return false;
            }
        }
        return true;
    }

    public boolean h(InterfaceC2958Fk<?> interfaceC2958Fk) {
        for (Object obj : interfaceC2958Fk.y()) {
            if (I(obj) < interfaceC2958Fk.I(obj)) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.Collection
    public int hashCode() {
        int hashCode;
        int i = 0;
        for (Map.Entry<E, b> entry : this.X.entrySet()) {
            E key = entry.getKey();
            b value = entry.getValue();
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
    public void i(Map<E, b> map, ObjectInputStream objectInputStream) throws IOException, ClassNotFoundException {
        this.X = map;
        int readInt = objectInputStream.readInt();
        for (int i = 0; i < readInt; i++) {
            Object readObject = objectInputStream.readObject();
            int readInt2 = objectInputStream.readInt();
            map.put(readObject, new b(readInt2));
            this.Y += readInt2;
        }
    }

    @Override // java.util.Collection
    public boolean isEmpty() {
        return this.X.isEmpty();
    }

    @Override // o.InterfaceC2958Fk, java.util.Collection, java.lang.Iterable
    public Iterator<E> iterator() {
        return new a(this);
    }

    public void j(ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.writeInt(this.X.size());
        for (Map.Entry<E, b> entry : this.X.entrySet()) {
            objectOutputStream.writeObject(entry.getKey());
            objectOutputStream.writeInt(entry.getValue().a);
        }
    }

    public Map<E, b> k() {
        return this.X;
    }

    public boolean l(InterfaceC2958Fk<?> interfaceC2958Fk) {
        C7480kG0 c7480kG0 = new C7480kG0();
        for (E e : y()) {
            int I = I(e);
            int I2 = interfaceC2958Fk.I(e);
            if (1 <= I2 && I2 <= I) {
                c7480kG0.x(e, I - I2);
            } else {
                c7480kG0.x(e, I);
            }
        }
        if (!c7480kG0.isEmpty()) {
            return removeAll(c7480kG0);
        }
        return false;
    }

    @Override // o.InterfaceC2958Fk, java.util.Collection
    public boolean remove(Object obj) {
        b bVar = this.X.get(obj);
        if (bVar == null) {
            return false;
        }
        this.Z++;
        this.X.remove(obj);
        this.Y -= bVar.a;
        return true;
    }

    @Override // o.InterfaceC2958Fk, java.util.Collection
    public boolean removeAll(Collection<?> collection) {
        if (collection == null) {
            return false;
        }
        Iterator<?> it = collection.iterator();
        while (true) {
            boolean z = false;
            while (it.hasNext()) {
                boolean v = v(it.next(), 1);
                if (z || v) {
                    z = true;
                }
            }
            return z;
        }
    }

    @Override // o.InterfaceC2958Fk, java.util.Collection
    public boolean retainAll(Collection<?> collection) {
        if (collection instanceof InterfaceC2958Fk) {
            return l((InterfaceC2958Fk) collection);
        }
        return l(new C7480kG0(collection));
    }

    @Override // o.InterfaceC2958Fk, java.util.Collection
    public int size() {
        return this.Y;
    }

    @Override // java.util.Collection
    public Object[] toArray() {
        Object[] objArr = new Object[size()];
        int i = 0;
        for (E e : this.X.keySet()) {
            int I = I(e);
            while (I > 0) {
                objArr[i] = e;
                I--;
                i++;
            }
        }
        return objArr;
    }

    public String toString() {
        if (size() == 0) {
            return HttpUrl.PATH_SEGMENT_ENCODE_SET_URI;
        }
        StringBuilder sb = new StringBuilder();
        sb.append('[');
        Iterator<E> it = y().iterator();
        while (it.hasNext()) {
            E next = it.next();
            sb.append(I(next));
            sb.append(':');
            sb.append(next);
            if (it.hasNext()) {
                sb.append(',');
            }
        }
        sb.append(']');
        return sb.toString();
    }

    @Override // o.InterfaceC2958Fk
    public boolean v(Object obj, int i) {
        b bVar = this.X.get(obj);
        if (bVar == null || i <= 0) {
            return false;
        }
        this.Z++;
        int i2 = bVar.a;
        if (i < i2) {
            bVar.a = i2 - i;
            this.Y -= i;
        } else {
            this.X.remove(obj);
            this.Y -= bVar.a;
        }
        return true;
    }

    @Override // o.InterfaceC2958Fk
    public boolean x(E e, int i) {
        this.Z++;
        if (i > 0) {
            b bVar = this.X.get(e);
            this.Y += i;
            if (bVar == null) {
                this.X.put(e, new b(i));
                return true;
            }
            bVar.a += i;
        }
        return false;
    }

    @Override // o.InterfaceC2958Fk
    public Set<E> y() {
        if (this.Y0 == null) {
            this.Y0 = CB2.h(this.X.keySet());
        }
        return this.Y0;
    }

    public E1(Map<E, b> map) {
        this.X = map;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.Collection
    public <T> T[] toArray(T[] tArr) {
        int size = size();
        if (tArr.length < size) {
            tArr = (T[]) ((Object[]) Array.newInstance(tArr.getClass().getComponentType(), size));
        }
        int i = 0;
        for (E e : this.X.keySet()) {
            int I = I(e);
            while (I > 0) {
                tArr[i] = e;
                I--;
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
