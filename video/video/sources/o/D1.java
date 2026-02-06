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
public abstract class D1 implements InterfaceC3056Gk {
    public transient Map X;
    public int Y;
    public transient Set Y0;
    public transient int Z;

    /* loaded from: classes4.dex */
    public static class a implements Iterator {
        public D1 X;
        public Iterator Y;
        public int Y0;
        public final int Z0;
        public Map.Entry Z = null;
        public boolean a1 = false;

        public a(D1 d1) {
            this.X = d1;
            this.Y = d1.X.entrySet().iterator();
            this.Z0 = d1.Z;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            if (this.Y0 <= 0 && !this.Y.hasNext()) {
                return false;
            }
            return true;
        }

        @Override // java.util.Iterator
        public Object next() {
            if (this.X.Z == this.Z0) {
                if (this.Y0 == 0) {
                    Map.Entry entry = (Map.Entry) this.Y.next();
                    this.Z = entry;
                    this.Y0 = ((b) entry.getValue()).a;
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
                    b bVar = (b) this.Z.getValue();
                    int i = bVar.a;
                    if (i > 1) {
                        bVar.a = i - 1;
                    } else {
                        this.Y.remove();
                    }
                    D1.f(this.X);
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

    public D1() {
    }

    public static /* synthetic */ int f(D1 d1) {
        int i = d1.Y;
        d1.Y = i - 1;
        return i;
    }

    @Override // o.InterfaceC3056Gk
    public int I(Object obj) {
        b bVar = (b) this.X.get(obj);
        if (bVar != null) {
            return bVar.a;
        }
        return 0;
    }

    @Override // o.InterfaceC3056Gk, java.util.Collection
    public boolean add(Object obj) {
        return x(obj, 1);
    }

    @Override // java.util.Collection
    public boolean addAll(Collection collection) {
        while (true) {
            boolean z = false;
            for (Object obj : collection) {
                boolean add = add(obj);
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

    @Override // o.InterfaceC3056Gk, java.util.Collection
    public boolean containsAll(Collection collection) {
        if (collection instanceof InterfaceC3056Gk) {
            return h((InterfaceC3056Gk) collection);
        }
        return h(new C7237jG0(collection));
    }

    @Override // java.util.Collection
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof InterfaceC3056Gk)) {
            return false;
        }
        InterfaceC3056Gk interfaceC3056Gk = (InterfaceC3056Gk) obj;
        if (interfaceC3056Gk.size() != size()) {
            return false;
        }
        for (Object obj2 : this.X.keySet()) {
            if (interfaceC3056Gk.I(obj2) != I(obj2)) {
                return false;
            }
        }
        return true;
    }

    public boolean h(InterfaceC3056Gk interfaceC3056Gk) {
        boolean z;
        while (true) {
            boolean z2 = true;
            for (Object obj : interfaceC3056Gk.y()) {
                if (I(obj) >= interfaceC3056Gk.I(obj)) {
                    z = true;
                } else {
                    z = false;
                }
                if (!z2 || !z) {
                    z2 = false;
                }
            }
            return z2;
        }
    }

    @Override // java.util.Collection
    public int hashCode() {
        int hashCode;
        int i = 0;
        for (Map.Entry entry : this.X.entrySet()) {
            Object key = entry.getKey();
            b bVar = (b) entry.getValue();
            if (key == null) {
                hashCode = 0;
            } else {
                hashCode = key.hashCode();
            }
            i += bVar.a ^ hashCode;
        }
        return i;
    }

    public void i(Map map, ObjectInputStream objectInputStream) throws IOException, ClassNotFoundException {
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

    @Override // o.InterfaceC3056Gk, java.util.Collection, java.lang.Iterable
    public Iterator iterator() {
        return new a(this);
    }

    public void j(ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.writeInt(this.X.size());
        for (Map.Entry entry : this.X.entrySet()) {
            objectOutputStream.writeObject(entry.getKey());
            objectOutputStream.writeInt(((b) entry.getValue()).a);
        }
    }

    public Map k() {
        return this.X;
    }

    public boolean l(InterfaceC3056Gk interfaceC3056Gk) {
        C7237jG0 c7237jG0 = new C7237jG0();
        for (Object obj : y()) {
            int I = I(obj);
            int I2 = interfaceC3056Gk.I(obj);
            if (1 <= I2 && I2 <= I) {
                c7237jG0.x(obj, I - I2);
            } else {
                c7237jG0.x(obj, I);
            }
        }
        if (!c7237jG0.isEmpty()) {
            return removeAll(c7237jG0);
        }
        return false;
    }

    @Override // o.InterfaceC3056Gk, java.util.Collection
    public boolean remove(Object obj) {
        b bVar = (b) this.X.get(obj);
        if (bVar == null) {
            return false;
        }
        this.Z++;
        this.X.remove(obj);
        this.Y -= bVar.a;
        return true;
    }

    @Override // o.InterfaceC3056Gk, java.util.Collection
    public boolean removeAll(Collection collection) {
        if (collection == null) {
            return false;
        }
        while (true) {
            boolean z = false;
            for (Object obj : collection) {
                boolean v = v(obj, 1);
                if (z || v) {
                    z = true;
                }
            }
            return z;
        }
    }

    @Override // o.InterfaceC3056Gk, java.util.Collection
    public boolean retainAll(Collection collection) {
        if (collection instanceof InterfaceC3056Gk) {
            return l((InterfaceC3056Gk) collection);
        }
        return l(new C7237jG0(collection));
    }

    @Override // o.InterfaceC3056Gk, java.util.Collection
    public int size() {
        return this.Y;
    }

    @Override // java.util.Collection
    public Object[] toArray() {
        Object[] objArr = new Object[size()];
        int i = 0;
        for (Object obj : this.X.keySet()) {
            int I = I(obj);
            while (I > 0) {
                objArr[i] = obj;
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
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append('[');
        Iterator it = y().iterator();
        while (it.hasNext()) {
            Object next = it.next();
            stringBuffer.append(I(next));
            stringBuffer.append(':');
            stringBuffer.append(next);
            if (it.hasNext()) {
                stringBuffer.append(',');
            }
        }
        stringBuffer.append(']');
        return stringBuffer.toString();
    }

    @Override // o.InterfaceC3056Gk
    public boolean v(Object obj, int i) {
        b bVar = (b) this.X.get(obj);
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

    @Override // o.InterfaceC3056Gk
    public boolean x(Object obj, int i) {
        this.Z++;
        if (i > 0) {
            b bVar = (b) this.X.get(obj);
            this.Y += i;
            if (bVar == null) {
                this.X.put(obj, new b(i));
                return true;
            }
            bVar.a += i;
        }
        return false;
    }

    @Override // o.InterfaceC3056Gk
    public Set y() {
        if (this.Y0 == null) {
            this.Y0 = DB2.f(this.X.keySet());
        }
        return this.Y0;
    }

    public D1(Map map) {
        this.X = map;
    }

    @Override // java.util.Collection
    public Object[] toArray(Object[] objArr) {
        int size = size();
        if (objArr.length < size) {
            objArr = (Object[]) Array.newInstance(objArr.getClass().getComponentType(), size);
        }
        int i = 0;
        for (Object obj : this.X.keySet()) {
            int I = I(obj);
            while (I > 0) {
                objArr[i] = obj;
                I--;
                i++;
            }
        }
        if (objArr.length > size) {
            objArr[size] = null;
        }
        return objArr;
    }
}
