package o;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.lang.ref.Reference;
import java.lang.ref.ReferenceQueue;
import java.lang.ref.SoftReference;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;
import o.U0;

/* loaded from: classes4.dex */
public abstract class M2 extends U0 {
    public static final int s1 = 0;
    public static final int t1 = 1;
    public static final int u1 = 2;
    public int o1;
    public int p1;
    public boolean q1;
    public transient ReferenceQueue r1;

    /* loaded from: classes4.dex */
    public static class a extends U0.c {
        public final M2 Z0;

        public a(M2 m2, U0.c cVar, int i, Object obj, Object obj2) {
            super(cVar, i, null, null);
            this.Z0 = m2;
            this.Z = c(m2.o1, obj, i);
            this.Y0 = c(m2.p1, obj2, i);
        }

        public a a() {
            return (a) this.X;
        }

        public boolean b(Reference reference) {
            boolean z;
            M2 m2 = this.Z0;
            int i = m2.o1;
            if ((i > 0 && this.Z == reference) || (m2.p1 > 0 && this.Y0 == reference)) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                if (i > 0) {
                    ((Reference) this.Z).clear();
                }
                M2 m22 = this.Z0;
                if (m22.p1 > 0) {
                    ((Reference) this.Y0).clear();
                    return z;
                } else if (m22.q1) {
                    this.Y0 = null;
                }
            }
            return z;
        }

        public Object c(int i, Object obj, int i2) {
            if (i != 0) {
                if (i != 1) {
                    if (i == 2) {
                        return new j(i2, obj, this.Z0.r1);
                    }
                    throw new Error();
                }
                return new i(i2, obj, this.Z0.r1);
            }
            return obj;
        }

        @Override // o.U0.c, java.util.Map.Entry
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof Map.Entry)) {
                return false;
            }
            Map.Entry entry = (Map.Entry) obj;
            Object key = entry.getKey();
            Object value = entry.getValue();
            if (key != null && value != null && this.Z0.B(key, this.Z) && this.Z0.C(value, getValue())) {
                return true;
            }
            return false;
        }

        @Override // o.U0.c, java.util.Map.Entry, o.KX0
        public Object getKey() {
            if (this.Z0.o1 > 0) {
                return ((Reference) this.Z).get();
            }
            return this.Z;
        }

        @Override // o.U0.c, java.util.Map.Entry, o.KX0
        public Object getValue() {
            if (this.Z0.p1 > 0) {
                return ((Reference) this.Y0).get();
            }
            return this.Y0;
        }

        @Override // o.U0.c, java.util.Map.Entry
        public int hashCode() {
            return this.Z0.I(getKey(), getValue());
        }

        @Override // o.U0.c, java.util.Map.Entry
        public Object setValue(Object obj) {
            Object value = getValue();
            if (this.Z0.p1 > 0) {
                ((Reference) this.Y0).clear();
            }
            this.Y0 = c(this.Z0.p1, obj, this.Y);
            return value;
        }
    }

    /* loaded from: classes4.dex */
    public static class b extends U0.a {
        public b(U0 u0) {
            super(u0);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public Object[] toArray() {
            return toArray(new Object[0]);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public Object[] toArray(Object[] objArr) {
            ArrayList arrayList = new ArrayList();
            Iterator it = iterator();
            while (it.hasNext()) {
                Map.Entry entry = (Map.Entry) it.next();
                arrayList.add(new DZ(entry.getKey(), entry.getValue()));
            }
            return arrayList.toArray(objArr);
        }
    }

    /* loaded from: classes4.dex */
    public static class c implements Iterator {
        public final M2 X;
        public int Y;
        public a Y0;
        public a Z;
        public Object Z0;
        public Object a1;
        public Object b1;
        public Object c1;
        public int d1;

        public c(M2 m2) {
            int i;
            this.X = m2;
            if (m2.size() != 0) {
                i = m2.Z.length;
            } else {
                i = 0;
            }
            this.Y = i;
            this.d1 = m2.Z0;
        }

        public final void b() {
            if (this.X.Z0 == this.d1) {
                return;
            }
            throw new ConcurrentModificationException();
        }

        public a c() {
            b();
            return this.Y0;
        }

        public a d() {
            b();
            if (e() && !hasNext()) {
                throw new NoSuchElementException();
            }
            a aVar = this.Z;
            this.Y0 = aVar;
            this.Z = aVar.a();
            this.b1 = this.Z0;
            this.c1 = this.a1;
            this.Z0 = null;
            this.a1 = null;
            return this.Y0;
        }

        public final boolean e() {
            if (this.Z0 != null && this.a1 != null) {
                return false;
            }
            return true;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            b();
            while (e()) {
                a aVar = this.Z;
                int i = this.Y;
                while (aVar == null && i > 0) {
                    i--;
                    aVar = (a) this.X.Z[i];
                }
                this.Z = aVar;
                this.Y = i;
                if (aVar == null) {
                    this.b1 = null;
                    this.c1 = null;
                    return false;
                }
                this.Z0 = aVar.getKey();
                this.a1 = aVar.getValue();
                if (e()) {
                    this.Z = this.Z.a();
                }
            }
            return true;
        }

        @Override // java.util.Iterator
        public Object next() {
            return d();
        }

        @Override // java.util.Iterator
        public void remove() {
            b();
            if (this.Y0 != null) {
                this.X.remove(this.b1);
                this.Y0 = null;
                this.b1 = null;
                this.c1 = null;
                this.d1 = this.X.Z0;
                return;
            }
            throw new IllegalStateException();
        }
    }

    /* loaded from: classes4.dex */
    public static class d extends U0.f {
        public d(U0 u0) {
            super(u0);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public Object[] toArray() {
            return toArray(new Object[0]);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public Object[] toArray(Object[] objArr) {
            ArrayList arrayList = new ArrayList(this.X.size());
            Iterator it = iterator();
            while (it.hasNext()) {
                arrayList.add(it.next());
            }
            return arrayList.toArray(objArr);
        }
    }

    /* loaded from: classes4.dex */
    public static class e extends c {
        public e(M2 m2) {
            super(m2);
        }

        @Override // o.M2.c, java.util.Iterator
        public Object next() {
            return d().getKey();
        }
    }

    /* loaded from: classes4.dex */
    public static class f extends c implements V71 {
        public f(M2 m2) {
            super(m2);
        }

        @Override // o.V71
        public Object getKey() {
            a c = c();
            if (c != null) {
                return c.getKey();
            }
            throw new IllegalStateException("getKey() can only be called after next() and before remove()");
        }

        @Override // o.V71
        public Object getValue() {
            a c = c();
            if (c != null) {
                return c.getValue();
            }
            throw new IllegalStateException("getValue() can only be called after next() and before remove()");
        }

        @Override // o.M2.c, java.util.Iterator
        public Object next() {
            return d().getKey();
        }

        @Override // o.V71
        public Object setValue(Object obj) {
            a c = c();
            if (c != null) {
                return c.setValue(obj);
            }
            throw new IllegalStateException("setValue() can only be called after next() and before remove()");
        }
    }

    /* loaded from: classes4.dex */
    public static class g extends U0.h {
        public g(U0 u0) {
            super(u0);
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public Object[] toArray() {
            return toArray(new Object[0]);
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public Object[] toArray(Object[] objArr) {
            ArrayList arrayList = new ArrayList(this.X.size());
            Iterator it = iterator();
            while (it.hasNext()) {
                arrayList.add(it.next());
            }
            return arrayList.toArray(objArr);
        }
    }

    /* loaded from: classes4.dex */
    public static class h extends c {
        public h(M2 m2) {
            super(m2);
        }

        @Override // o.M2.c, java.util.Iterator
        public Object next() {
            return d().getValue();
        }
    }

    /* loaded from: classes4.dex */
    public static class i extends SoftReference {
        public int a;

        public i(int i, Object obj, ReferenceQueue referenceQueue) {
            super(obj, referenceQueue);
            this.a = i;
        }

        public int hashCode() {
            return this.a;
        }
    }

    /* loaded from: classes4.dex */
    public static class j extends WeakReference {
        public int a;

        public j(int i, Object obj, ReferenceQueue referenceQueue) {
            super(obj, referenceQueue);
            this.a = i;
        }

        public int hashCode() {
            return this.a;
        }
    }

    public M2() {
    }

    public static void O(String str, int i2) {
        if (i2 >= 0 && i2 <= 2) {
            return;
        }
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(str);
        stringBuffer.append(" must be HARD, SOFT, WEAK.");
        throw new IllegalArgumentException(stringBuffer.toString());
    }

    @Override // o.U0
    public void A() {
        this.r1 = new ReferenceQueue();
    }

    @Override // o.U0
    public boolean B(Object obj, Object obj2) {
        if (this.o1 > 0) {
            obj2 = ((Reference) obj2).get();
        }
        if (obj != obj2 && !obj.equals(obj2)) {
            return false;
        }
        return true;
    }

    public int I(Object obj, Object obj2) {
        int hashCode;
        int i2 = 0;
        if (obj == null) {
            hashCode = 0;
        } else {
            hashCode = obj.hashCode();
        }
        if (obj2 != null) {
            i2 = obj2.hashCode();
        }
        return hashCode ^ i2;
    }

    public void J() {
        Reference poll = this.r1.poll();
        while (poll != null) {
            K(poll);
            poll = this.r1.poll();
        }
    }

    public void K(Reference reference) {
        int z = z(reference.hashCode(), this.Z.length);
        U0.c cVar = null;
        for (U0.c cVar2 = this.Z[z]; cVar2 != null; cVar2 = cVar2.X) {
            if (((a) cVar2).b(reference)) {
                if (cVar == null) {
                    this.Z[z] = cVar2.X;
                } else {
                    cVar.X = cVar2.X;
                }
                this.Y--;
                return;
            }
            cVar = cVar2;
        }
    }

    public void L() {
        J();
    }

    public void N() {
        J();
    }

    @Override // o.U0, java.util.AbstractMap, java.util.Map
    public void clear() {
        super.clear();
        do {
        } while (this.r1.poll() != null);
    }

    @Override // o.U0, java.util.AbstractMap, java.util.Map
    public boolean containsKey(Object obj) {
        L();
        U0.c x = x(obj);
        if (x == null || x.getValue() == null) {
            return false;
        }
        return true;
    }

    @Override // o.U0, java.util.AbstractMap, java.util.Map
    public boolean containsValue(Object obj) {
        L();
        if (obj == null) {
            return false;
        }
        return super.containsValue(obj);
    }

    @Override // o.U0, java.util.AbstractMap, java.util.Map
    public Set entrySet() {
        if (this.a1 == null) {
            this.a1 = new b(this);
        }
        return this.a1;
    }

    @Override // o.U0, java.util.AbstractMap, java.util.Map
    public Object get(Object obj) {
        L();
        U0.c x = x(obj);
        if (x == null) {
            return null;
        }
        return x.getValue();
    }

    @Override // o.U0
    public U0.c i(U0.c cVar, int i2, Object obj, Object obj2) {
        return new a(this, cVar, i2, obj, obj2);
    }

    @Override // o.U0, java.util.AbstractMap, java.util.Map
    public boolean isEmpty() {
        L();
        return super.isEmpty();
    }

    @Override // o.U0
    public Iterator j() {
        return new c(this);
    }

    @Override // o.U0
    public Iterator k() {
        return new e(this);
    }

    @Override // o.U0, java.util.AbstractMap, java.util.Map
    public Set keySet() {
        if (this.b1 == null) {
            this.b1 = new d(this);
        }
        return this.b1;
    }

    @Override // o.U0
    public Iterator l() {
        return new h(this);
    }

    @Override // o.U0
    public void n(ObjectInputStream objectInputStream) throws IOException, ClassNotFoundException {
        this.o1 = objectInputStream.readInt();
        this.p1 = objectInputStream.readInt();
        this.q1 = objectInputStream.readBoolean();
        this.X = objectInputStream.readFloat();
        int readInt = objectInputStream.readInt();
        A();
        this.Z = new U0.c[readInt];
        while (true) {
            Object readObject = objectInputStream.readObject();
            if (readObject == null) {
                this.Y0 = e(this.Z.length, this.X);
                return;
            }
            put(readObject, objectInputStream.readObject());
        }
    }

    @Override // o.U0
    public void o(ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.writeInt(this.o1);
        objectOutputStream.writeInt(this.p1);
        objectOutputStream.writeBoolean(this.q1);
        objectOutputStream.writeFloat(this.X);
        objectOutputStream.writeInt(this.Z.length);
        V71 p = p();
        while (p.hasNext()) {
            objectOutputStream.writeObject(p.next());
            objectOutputStream.writeObject(p.getValue());
        }
        objectOutputStream.writeObject(null);
    }

    @Override // o.U0, o.XT0
    public V71 p() {
        return new f(this);
    }

    @Override // o.U0, java.util.AbstractMap, java.util.Map
    public Object put(Object obj, Object obj2) {
        if (obj != null) {
            if (obj2 != null) {
                N();
                return super.put(obj, obj2);
            }
            throw new NullPointerException("null values not allowed");
        }
        throw new NullPointerException("null keys not allowed");
    }

    @Override // o.U0, java.util.AbstractMap, java.util.Map
    public Object remove(Object obj) {
        if (obj == null) {
            return null;
        }
        N();
        return super.remove(obj);
    }

    @Override // o.U0, java.util.AbstractMap, java.util.Map
    public int size() {
        L();
        return super.size();
    }

    @Override // o.U0, java.util.AbstractMap, java.util.Map
    public Collection values() {
        if (this.c1 == null) {
            this.c1 = new g(this);
        }
        return this.c1;
    }

    @Override // o.U0
    public U0.c x(Object obj) {
        if (obj == null) {
            return null;
        }
        return super.x(obj);
    }

    public M2(int i2, int i3, int i4, float f2, boolean z) {
        super(i4, f2);
        O("keyType", i2);
        O(com.facebook.a0.p, i3);
        this.o1 = i2;
        this.p1 = i3;
        this.q1 = z;
    }
}
