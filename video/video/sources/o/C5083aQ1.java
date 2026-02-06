package o;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.lang.ref.Reference;
import java.lang.ref.ReferenceQueue;
import java.lang.ref.SoftReference;
import java.lang.ref.WeakReference;
import java.util.AbstractMap;
import java.util.Arrays;
import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;

/* renamed from: o.aQ1  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C5083aQ1 extends AbstractMap {
    public static final long h1 = -3370601314380922368L;
    public static final int i1 = 0;
    public static final int j1 = 1;
    public static final int k1 = 2;
    public int X;
    public int Y;
    public boolean Y0;
    public float Z;
    public transient ReferenceQueue Z0;
    public transient a[] a1;
    public transient int b1;
    public transient int c1;
    public volatile transient int d1;
    public transient Set e1;
    public transient Set f1;
    public transient Collection g1;

    /* renamed from: o.aQ1$a */
    /* loaded from: classes4.dex */
    public class a implements Map.Entry, KX0 {
        public Object X;
        public Object Y;
        public a Y0;
        public int Z;

        public a(Object obj, int i, Object obj2, a aVar) {
            this.X = obj;
            this.Z = i;
            this.Y = obj2;
            this.Y0 = aVar;
        }

        public boolean a(Reference reference) {
            boolean z;
            if ((C5083aQ1.this.X > 0 && this.X == reference) || (C5083aQ1.this.Y > 0 && this.Y == reference)) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                if (C5083aQ1.this.X > 0) {
                    ((Reference) this.X).clear();
                }
                if (C5083aQ1.this.Y > 0) {
                    ((Reference) this.Y).clear();
                    return z;
                } else if (C5083aQ1.this.Y0) {
                    this.Y = null;
                }
            }
            return z;
        }

        @Override // java.util.Map.Entry
        public boolean equals(Object obj) {
            if (obj == null) {
                return false;
            }
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof Map.Entry)) {
                return false;
            }
            Map.Entry entry = (Map.Entry) obj;
            Object key = entry.getKey();
            Object value = entry.getValue();
            if (key == null || value == null || !key.equals(getKey()) || !value.equals(getValue())) {
                return false;
            }
            return true;
        }

        @Override // java.util.Map.Entry, o.KX0
        public Object getKey() {
            if (C5083aQ1.this.X > 0) {
                return ((Reference) this.X).get();
            }
            return this.X;
        }

        @Override // java.util.Map.Entry, o.KX0
        public Object getValue() {
            if (C5083aQ1.this.Y > 0) {
                return ((Reference) this.Y).get();
            }
            return this.Y;
        }

        @Override // java.util.Map.Entry
        public int hashCode() {
            int hashCode;
            Object value = getValue();
            int i = this.Z;
            if (value == null) {
                hashCode = 0;
            } else {
                hashCode = value.hashCode();
            }
            return hashCode ^ i;
        }

        @Override // java.util.Map.Entry
        public Object setValue(Object obj) {
            Object value = getValue();
            if (C5083aQ1.this.Y > 0) {
                ((Reference) this.Y).clear();
            }
            C5083aQ1 c5083aQ1 = C5083aQ1.this;
            this.Y = c5083aQ1.o(c5083aQ1.Y, obj, this.Z);
            return value;
        }

        public String toString() {
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append(getKey());
            stringBuffer.append("=");
            stringBuffer.append(getValue());
            return stringBuffer.toString();
        }
    }

    /* renamed from: o.aQ1$b */
    /* loaded from: classes4.dex */
    public class b implements Iterator {
        public int X;
        public a Y;
        public Object Y0;
        public a Z;
        public Object Z0;
        public Object a1;
        public Object b1;
        public int c1;

        public b() {
            int i;
            if (C5083aQ1.this.size() != 0) {
                i = C5083aQ1.this.a1.length;
            } else {
                i = 0;
            }
            this.X = i;
            this.c1 = C5083aQ1.this.d1;
        }

        public final void b() {
            if (C5083aQ1.this.d1 == this.c1) {
                return;
            }
            throw new ConcurrentModificationException();
        }

        public a c() {
            b();
            if (d() && !hasNext()) {
                throw new NoSuchElementException();
            }
            a aVar = this.Y;
            this.Z = aVar;
            this.Y = aVar.Y0;
            this.a1 = this.Y0;
            this.b1 = this.Z0;
            this.Y0 = null;
            this.Z0 = null;
            return aVar;
        }

        public final boolean d() {
            if (this.Y0 != null && this.Z0 != null) {
                return false;
            }
            return true;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            b();
            while (d()) {
                a aVar = this.Y;
                int i = this.X;
                while (aVar == null && i > 0) {
                    i--;
                    aVar = C5083aQ1.this.a1[i];
                }
                this.Y = aVar;
                this.X = i;
                if (aVar == null) {
                    this.a1 = null;
                    this.b1 = null;
                    return false;
                }
                this.Y0 = aVar.getKey();
                this.Z0 = aVar.getValue();
                if (d()) {
                    this.Y = this.Y.Y0;
                }
            }
            return true;
        }

        @Override // java.util.Iterator
        public Object next() {
            return c();
        }

        @Override // java.util.Iterator
        public void remove() {
            b();
            if (this.Z != null) {
                C5083aQ1.this.remove(this.a1);
                this.Z = null;
                this.a1 = null;
                this.b1 = null;
                this.c1 = C5083aQ1.this.d1;
                return;
            }
            throw new IllegalStateException();
        }
    }

    /* renamed from: o.aQ1$c */
    /* loaded from: classes4.dex */
    public class c extends b {
        public final /* synthetic */ C5083aQ1 e1;

        public c(C5083aQ1 c5083aQ1) {
            super();
            this.e1 = c5083aQ1;
        }

        @Override // o.C5083aQ1.b, java.util.Iterator
        public Object next() {
            return c().getKey();
        }

        public /* synthetic */ c(C5083aQ1 c5083aQ1, XP1 xp1) {
            this(c5083aQ1);
        }
    }

    /* renamed from: o.aQ1$d */
    /* loaded from: classes4.dex */
    public static class d extends SoftReference {
        public int a;

        public d(int i, Object obj, ReferenceQueue referenceQueue) {
            super(obj, referenceQueue);
            this.a = i;
        }

        public int hashCode() {
            return this.a;
        }
    }

    /* renamed from: o.aQ1$e */
    /* loaded from: classes4.dex */
    public class e extends b {
        public final /* synthetic */ C5083aQ1 e1;

        public e(C5083aQ1 c5083aQ1) {
            super();
            this.e1 = c5083aQ1;
        }

        @Override // o.C5083aQ1.b, java.util.Iterator
        public Object next() {
            return c().getValue();
        }

        public /* synthetic */ e(C5083aQ1 c5083aQ1, XP1 xp1) {
            this(c5083aQ1);
        }
    }

    /* renamed from: o.aQ1$f */
    /* loaded from: classes4.dex */
    public static class f extends WeakReference {
        public int a;

        public f(int i, Object obj, ReferenceQueue referenceQueue) {
            super(obj, referenceQueue);
            this.a = i;
        }

        public int hashCode() {
            return this.a;
        }
    }

    public C5083aQ1() {
        this(0, 1);
    }

    public static void r(String str, int i) {
        if (i >= 0 && i <= 2) {
            return;
        }
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(str);
        stringBuffer.append(" must be HARD, SOFT, WEAK.");
        throw new IllegalArgumentException(stringBuffer.toString());
    }

    @Override // java.util.AbstractMap, java.util.Map
    public void clear() {
        Arrays.fill(this.a1, (Object) null);
        this.b1 = 0;
        do {
        } while (this.Z0.poll() != null);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public boolean containsKey(Object obj) {
        k();
        a i = i(obj);
        if (i == null || i.getValue() == null) {
            return false;
        }
        return true;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Set entrySet() {
        Set set = this.f1;
        if (set != null) {
            return set;
        }
        XP1 xp1 = new XP1(this);
        this.f1 = xp1;
        return xp1;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Object get(Object obj) {
        k();
        a i = i(obj);
        if (i == null) {
            return null;
        }
        return i.getValue();
    }

    public final a i(Object obj) {
        if (obj == null) {
            return null;
        }
        int hashCode = obj.hashCode();
        for (a aVar = this.a1[j(hashCode)]; aVar != null; aVar = aVar.Y0) {
            if (aVar.Z == hashCode && obj.equals(aVar.getKey())) {
                return aVar;
            }
        }
        return null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public boolean isEmpty() {
        k();
        if (this.b1 == 0) {
            return true;
        }
        return false;
    }

    public final int j(int i) {
        int i2 = i + (~(i << 15));
        int i3 = i2 ^ (i2 >>> 10);
        int i4 = i3 + (i3 << 3);
        int i5 = i4 ^ (i4 >>> 6);
        int i6 = i5 + (~(i5 << 11));
        return (i6 ^ (i6 >>> 16)) & (this.a1.length - 1);
    }

    public final void k() {
        Reference poll = this.Z0.poll();
        while (poll != null) {
            l(poll);
            poll = this.Z0.poll();
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Set keySet() {
        Set set = this.e1;
        if (set != null) {
            return set;
        }
        YP1 yp1 = new YP1(this);
        this.e1 = yp1;
        return yp1;
    }

    public final void l(Reference reference) {
        int j = j(reference.hashCode());
        a aVar = null;
        for (a aVar2 = this.a1[j]; aVar2 != null; aVar2 = aVar2.Y0) {
            if (aVar2.a(reference)) {
                if (aVar == null) {
                    this.a1[j] = aVar2.Y0;
                } else {
                    aVar.Y0 = aVar2.Y0;
                }
                this.b1--;
                return;
            }
            aVar = aVar2;
        }
    }

    public final void m(ObjectInputStream objectInputStream) throws IOException, ClassNotFoundException {
        objectInputStream.defaultReadObject();
        a[] aVarArr = new a[objectInputStream.readInt()];
        this.a1 = aVarArr;
        this.c1 = (int) (aVarArr.length * this.Z);
        this.Z0 = new ReferenceQueue();
        Object readObject = objectInputStream.readObject();
        while (readObject != null) {
            put(readObject, objectInputStream.readObject());
            readObject = objectInputStream.readObject();
        }
    }

    public final void n() {
        a[] aVarArr = this.a1;
        this.a1 = new a[aVarArr.length * 2];
        for (int i = 0; i < aVarArr.length; i++) {
            a aVar = aVarArr[i];
            while (aVar != null) {
                a aVar2 = aVar.Y0;
                int j = j(aVar.Z);
                a[] aVarArr2 = this.a1;
                aVar.Y0 = aVarArr2[j];
                aVarArr2[j] = aVar;
                aVar = aVar2;
            }
            aVarArr[i] = null;
        }
        this.c1 = (int) (this.a1.length * this.Z);
    }

    public final Object o(int i, Object obj, int i2) {
        if (i != 0) {
            if (i != 1) {
                if (i == 2) {
                    return new f(i2, obj, this.Z0);
                }
                throw new Error();
            }
            return new d(i2, obj, this.Z0);
        }
        return obj;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Object put(Object obj, Object obj2) {
        if (obj != null) {
            if (obj2 != null) {
                k();
                if (this.b1 + 1 > this.c1) {
                    n();
                }
                int hashCode = obj.hashCode();
                int j = j(hashCode);
                for (a aVar = this.a1[j]; aVar != null; aVar = aVar.Y0) {
                    if (hashCode == aVar.Z && obj.equals(aVar.getKey())) {
                        Object value = aVar.getValue();
                        aVar.setValue(obj2);
                        return value;
                    }
                }
                this.b1++;
                this.d1++;
                Object o2 = o(this.X, obj, hashCode);
                Object o3 = o(this.Y, obj2, hashCode);
                a[] aVarArr = this.a1;
                aVarArr[j] = new a(o2, hashCode, o3, aVarArr[j]);
                return null;
            }
            throw new NullPointerException("null values not allowed");
        }
        throw new NullPointerException("null keys not allowed");
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Object remove(Object obj) {
        if (obj == null) {
            return null;
        }
        k();
        int hashCode = obj.hashCode();
        int j = j(hashCode);
        a aVar = null;
        for (a aVar2 = this.a1[j]; aVar2 != null; aVar2 = aVar2.Y0) {
            if (hashCode == aVar2.Z && obj.equals(aVar2.getKey())) {
                if (aVar == null) {
                    this.a1[j] = aVar2.Y0;
                } else {
                    aVar.Y0 = aVar2.Y0;
                }
                this.b1--;
                this.d1++;
                return aVar2.getValue();
            }
            aVar = aVar2;
        }
        return null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public int size() {
        k();
        return this.b1;
    }

    public final void t(ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.defaultWriteObject();
        objectOutputStream.writeInt(this.a1.length);
        for (Map.Entry entry : entrySet()) {
            objectOutputStream.writeObject(entry.getKey());
            objectOutputStream.writeObject(entry.getValue());
        }
        objectOutputStream.writeObject(null);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Collection values() {
        Collection collection = this.g1;
        if (collection != null) {
            return collection;
        }
        ZP1 zp1 = new ZP1(this);
        this.g1 = zp1;
        return zp1;
    }

    public C5083aQ1(int i, int i2, boolean z) {
        this(i, i2);
        this.Y0 = z;
    }

    public C5083aQ1(int i, int i2) {
        this(i, i2, 16, 0.75f);
    }

    public C5083aQ1(int i, int i2, int i3, float f2, boolean z) {
        this(i, i2, i3, f2);
        this.Y0 = z;
    }

    public C5083aQ1(int i, int i2, int i3, float f2) {
        this.Y0 = false;
        this.Z0 = new ReferenceQueue();
        r("keyType", i);
        r(com.facebook.a0.p, i2);
        if (i3 <= 0) {
            throw new IllegalArgumentException("capacity must be positive");
        }
        if (f2 > 0.0f && f2 < 1.0f) {
            this.X = i;
            this.Y = i2;
            int i4 = 1;
            while (i4 < i3) {
                i4 *= 2;
            }
            this.a1 = new a[i4];
            this.Z = f2;
            this.c1 = (int) (i4 * f2);
            return;
        }
        throw new IllegalArgumentException("Load factor must be greater than 0 and less than 1.");
    }
}
