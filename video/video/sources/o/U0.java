package o;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.AbstractCollection;
import java.util.AbstractMap;
import java.util.AbstractSet;
import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;

/* loaded from: classes4.dex */
public class U0 extends AbstractMap implements XT0 {
    public static final String d1 = "No next() entry in the iteration";
    public static final String e1 = "No previous() entry in the iteration";
    public static final String f1 = "remove() can only be called once after next()";
    public static final String g1 = "getKey() can only be called after next() and before remove()";
    public static final String h1 = "getValue() can only be called after next() and before remove()";
    public static final String i1 = "setValue() can only be called after next() and before remove()";
    public static final int j1 = 16;
    public static final int k1 = 12;
    public static final float l1 = 0.75f;
    public static final int m1 = 1073741824;
    public static final Object n1 = new Object();
    public transient float X;
    public transient int Y;
    public transient int Y0;
    public transient c[] Z;
    public transient int Z0;
    public transient a a1;
    public transient f b1;
    public transient h c1;

    /* loaded from: classes4.dex */
    public static class a extends AbstractSet {
        public final U0 X;

        public a(U0 u0) {
            this.X = u0;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public void clear() {
            this.X.clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(Object obj) {
            if (obj instanceof Map.Entry) {
                Map.Entry entry = (Map.Entry) obj;
                c x = this.X.x(entry.getKey());
                if (x != null && x.equals(entry)) {
                    return true;
                }
            }
            return false;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public Iterator iterator() {
            return this.X.j();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean remove(Object obj) {
            if (!(obj instanceof Map.Entry) || !contains(obj)) {
                return false;
            }
            this.X.remove(((Map.Entry) obj).getKey());
            return true;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return this.X.size();
        }
    }

    /* loaded from: classes4.dex */
    public static class b extends d {
        public b(U0 u0) {
            super(u0);
        }

        @Override // java.util.Iterator
        public Object next() {
            return super.c();
        }
    }

    /* loaded from: classes4.dex */
    public static class c implements Map.Entry, KX0 {
        public c X;
        public int Y;
        public Object Y0;
        public Object Z;

        public c(c cVar, int i, Object obj, Object obj2) {
            this.X = cVar;
            this.Y = i;
            this.Z = obj;
            this.Y0 = obj2;
        }

        @Override // java.util.Map.Entry
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof Map.Entry)) {
                return false;
            }
            Map.Entry entry = (Map.Entry) obj;
            if (getKey() != null ? getKey().equals(entry.getKey()) : entry.getKey() == null) {
                if (getValue() != null ? getValue().equals(entry.getValue()) : entry.getValue() == null) {
                    return true;
                }
            }
            return false;
        }

        @Override // java.util.Map.Entry, o.KX0
        public Object getKey() {
            Object obj = this.Z;
            if (obj == U0.n1) {
                return null;
            }
            return obj;
        }

        @Override // java.util.Map.Entry, o.KX0
        public Object getValue() {
            return this.Y0;
        }

        @Override // java.util.Map.Entry
        public int hashCode() {
            int hashCode;
            int i = 0;
            if (getKey() == null) {
                hashCode = 0;
            } else {
                hashCode = getKey().hashCode();
            }
            if (getValue() != null) {
                i = getValue().hashCode();
            }
            return hashCode ^ i;
        }

        @Override // java.util.Map.Entry
        public Object setValue(Object obj) {
            Object obj2 = this.Y0;
            this.Y0 = obj;
            return obj2;
        }

        public String toString() {
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append(getKey());
            stringBuffer.append('=');
            stringBuffer.append(getValue());
            return stringBuffer.toString();
        }
    }

    /* loaded from: classes4.dex */
    public static abstract class d implements Iterator {
        public final U0 X;
        public int Y;
        public c Y0;
        public c Z;
        public int Z0;

        public d(U0 u0) {
            this.X = u0;
            c[] cVarArr = u0.Z;
            int length = cVarArr.length;
            c cVar = null;
            while (length > 0 && cVar == null) {
                length--;
                cVar = cVarArr[length];
            }
            this.Y0 = cVar;
            this.Y = length;
            this.Z0 = u0.Z0;
        }

        public c b() {
            return this.Z;
        }

        public c c() {
            U0 u0 = this.X;
            if (u0.Z0 == this.Z0) {
                c cVar = this.Y0;
                if (cVar != null) {
                    c[] cVarArr = u0.Z;
                    int i = this.Y;
                    c cVar2 = cVar.X;
                    while (cVar2 == null && i > 0) {
                        i--;
                        cVar2 = cVarArr[i];
                    }
                    this.Y0 = cVar2;
                    this.Y = i;
                    this.Z = cVar;
                    return cVar;
                }
                throw new NoSuchElementException("No next() entry in the iteration");
            }
            throw new ConcurrentModificationException();
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            if (this.Y0 != null) {
                return true;
            }
            return false;
        }

        @Override // java.util.Iterator
        public void remove() {
            c cVar = this.Z;
            if (cVar != null) {
                U0 u0 = this.X;
                if (u0.Z0 == this.Z0) {
                    u0.remove(cVar.getKey());
                    this.Z = null;
                    this.Z0 = this.X.Z0;
                    return;
                }
                throw new ConcurrentModificationException();
            }
            throw new IllegalStateException("remove() can only be called once after next()");
        }

        public String toString() {
            if (this.Z != null) {
                StringBuffer stringBuffer = new StringBuffer();
                stringBuffer.append("Iterator[");
                stringBuffer.append(this.Z.getKey());
                stringBuffer.append("=");
                stringBuffer.append(this.Z.getValue());
                stringBuffer.append(C6566gU0.g);
                return stringBuffer.toString();
            }
            return "Iterator[]";
        }
    }

    /* loaded from: classes4.dex */
    public static class e extends d implements V71 {
        public e(U0 u0) {
            super(u0);
        }

        @Override // o.V71
        public Object getKey() {
            c b = b();
            if (b != null) {
                return b.getKey();
            }
            throw new IllegalStateException("getKey() can only be called after next() and before remove()");
        }

        @Override // o.V71
        public Object getValue() {
            c b = b();
            if (b != null) {
                return b.getValue();
            }
            throw new IllegalStateException("getValue() can only be called after next() and before remove()");
        }

        @Override // java.util.Iterator, o.V71
        public Object next() {
            return super.c().getKey();
        }

        @Override // o.V71
        public Object setValue(Object obj) {
            c b = b();
            if (b != null) {
                return b.setValue(obj);
            }
            throw new IllegalStateException("setValue() can only be called after next() and before remove()");
        }
    }

    /* loaded from: classes4.dex */
    public static class f extends AbstractSet {
        public final U0 X;

        public f(U0 u0) {
            this.X = u0;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public void clear() {
            this.X.clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(Object obj) {
            return this.X.containsKey(obj);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public Iterator iterator() {
            return this.X.k();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean remove(Object obj) {
            boolean containsKey = this.X.containsKey(obj);
            this.X.remove(obj);
            return containsKey;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return this.X.size();
        }
    }

    /* loaded from: classes4.dex */
    public static class g extends b {
        public g(U0 u0) {
            super(u0);
        }

        @Override // o.U0.b, java.util.Iterator
        public Object next() {
            return super.c().getKey();
        }
    }

    /* loaded from: classes4.dex */
    public static class h extends AbstractCollection {
        public final U0 X;

        public h(U0 u0) {
            this.X = u0;
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public void clear() {
            this.X.clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean contains(Object obj) {
            return this.X.containsValue(obj);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
        public Iterator iterator() {
            return this.X.l();
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public int size() {
            return this.X.size();
        }
    }

    /* loaded from: classes4.dex */
    public static class i extends d {
        public i(U0 u0) {
            super(u0);
        }

        @Override // java.util.Iterator
        public Object next() {
            return super.c().getValue();
        }
    }

    public U0() {
    }

    public boolean B(Object obj, Object obj2) {
        if (obj != obj2 && !obj.equals(obj2)) {
            return false;
        }
        return true;
    }

    public boolean C(Object obj, Object obj2) {
        if (obj != obj2 && !obj.equals(obj2)) {
            return false;
        }
        return true;
    }

    public void D(c cVar, int i2, c cVar2) {
        if (cVar2 == null) {
            this.Z[i2] = cVar.X;
        } else {
            cVar2.X = cVar.X;
        }
    }

    public void E(c cVar, int i2, c cVar2) {
        this.Z0++;
        D(cVar, i2, cVar2);
        this.Y--;
        m(cVar);
    }

    public void F(c cVar, int i2, int i3, Object obj, Object obj2) {
        cVar.X = this.Z[i2];
        cVar.Y = i3;
        cVar.Z = obj;
        cVar.Y0 = obj2;
    }

    public void G(c cVar, Object obj) {
        cVar.setValue(obj);
    }

    public void b(c cVar, int i2) {
        this.Z[i2] = cVar;
    }

    public void c(int i2, int i3, Object obj, Object obj2) {
        this.Z0++;
        b(i(this.Z[i2], i3, obj, obj2), i2);
        this.Y++;
        f();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public void clear() {
        this.Z0++;
        c[] cVarArr = this.Z;
        for (int length = cVarArr.length - 1; length >= 0; length--) {
            cVarArr[length] = null;
        }
        this.Y = 0;
    }

    @Override // java.util.AbstractMap
    public Object clone() {
        try {
            U0 u0 = (U0) super.clone();
            u0.Z = new c[this.Z.length];
            u0.a1 = null;
            u0.b1 = null;
            u0.c1 = null;
            u0.Z0 = 0;
            u0.Y = 0;
            u0.A();
            u0.putAll(this);
            return u0;
        } catch (CloneNotSupportedException unused) {
            return null;
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public boolean containsKey(Object obj) {
        Object g2 = g(obj);
        int y = y(g2);
        c[] cVarArr = this.Z;
        for (c cVar = cVarArr[z(y, cVarArr.length)]; cVar != null; cVar = cVar.X) {
            if (cVar.Y == y && B(g2, cVar.Z)) {
                return true;
            }
        }
        return false;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public boolean containsValue(Object obj) {
        if (obj == null) {
            int length = this.Z.length;
            for (int i2 = 0; i2 < length; i2++) {
                for (c cVar = this.Z[i2]; cVar != null; cVar = cVar.X) {
                    if (cVar.getValue() == null) {
                        return true;
                    }
                }
            }
        } else {
            int length2 = this.Z.length;
            for (int i3 = 0; i3 < length2; i3++) {
                for (c cVar2 = this.Z[i3]; cVar2 != null; cVar2 = cVar2.X) {
                    if (C(obj, cVar2.getValue())) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public int d(int i2) {
        if (i2 > 1073741824) {
            return 1073741824;
        }
        int i3 = 1;
        while (i3 < i2) {
            i3 <<= 1;
        }
        if (i3 > 1073741824) {
            return 1073741824;
        }
        return i3;
    }

    public int e(int i2, float f2) {
        return (int) (i2 * f2);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Set entrySet() {
        if (this.a1 == null) {
            this.a1 = new a(this);
        }
        return this.a1;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Map)) {
            return false;
        }
        Map map = (Map) obj;
        if (map.size() != size()) {
            return false;
        }
        V71 p = p();
        while (p.hasNext()) {
            try {
                Object next = p.next();
                Object value = p.getValue();
                if (value == null) {
                    if (map.get(next) != null || !map.containsKey(next)) {
                        return false;
                    }
                } else if (!value.equals(map.get(next))) {
                    return false;
                }
            } catch (ClassCastException | NullPointerException unused) {
                return false;
            }
        }
        return true;
    }

    public void f() {
        int length;
        if (this.Y >= this.Y0 && (length = this.Z.length * 2) <= 1073741824) {
            r(length);
        }
    }

    public Object g(Object obj) {
        if (obj == null) {
            return n1;
        }
        return obj;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Object get(Object obj) {
        Object g2 = g(obj);
        int y = y(g2);
        c[] cVarArr = this.Z;
        for (c cVar = cVarArr[z(y, cVarArr.length)]; cVar != null; cVar = cVar.X) {
            if (cVar.Y == y && B(g2, cVar.Z)) {
                return cVar.getValue();
            }
        }
        return null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public int hashCode() {
        Iterator j = j();
        int i2 = 0;
        while (j.hasNext()) {
            i2 += j.next().hashCode();
        }
        return i2;
    }

    public c i(c cVar, int i2, Object obj, Object obj2) {
        return new c(cVar, i2, obj, obj2);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public boolean isEmpty() {
        if (this.Y == 0) {
            return true;
        }
        return false;
    }

    public Iterator j() {
        if (size() == 0) {
            return C4482Va0.Y;
        }
        return new b(this);
    }

    public Iterator k() {
        if (size() == 0) {
            return C4482Va0.Y;
        }
        return new g(this);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Set keySet() {
        if (this.b1 == null) {
            this.b1 = new f(this);
        }
        return this.b1;
    }

    public Iterator l() {
        if (size() == 0) {
            return C4482Va0.Y;
        }
        return new i(this);
    }

    public void m(c cVar) {
        cVar.X = null;
        cVar.Z = null;
        cVar.Y0 = null;
    }

    public void n(ObjectInputStream objectInputStream) throws IOException, ClassNotFoundException {
        this.X = objectInputStream.readFloat();
        int readInt = objectInputStream.readInt();
        int readInt2 = objectInputStream.readInt();
        A();
        this.Y0 = e(readInt, this.X);
        this.Z = new c[readInt];
        for (int i2 = 0; i2 < readInt2; i2++) {
            put(objectInputStream.readObject(), objectInputStream.readObject());
        }
    }

    public void o(ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.writeFloat(this.X);
        objectOutputStream.writeInt(this.Z.length);
        objectOutputStream.writeInt(this.Y);
        V71 p = p();
        while (p.hasNext()) {
            objectOutputStream.writeObject(p.next());
            objectOutputStream.writeObject(p.getValue());
        }
    }

    public V71 p() {
        if (this.Y == 0) {
            return C5848db0.X;
        }
        return new e(this);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Object put(Object obj, Object obj2) {
        Object g2 = g(obj);
        int y = y(g2);
        int z = z(y, this.Z.length);
        for (c cVar = this.Z[z]; cVar != null; cVar = cVar.X) {
            if (cVar.Y == y && B(g2, cVar.Z)) {
                Object value = cVar.getValue();
                G(cVar, obj2);
                return value;
            }
        }
        c(z, y, g2, obj2);
        return null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public void putAll(Map map) {
        int size = map.size();
        if (size != 0) {
            r(d((int) (((this.Y + size) / this.X) + 1.0f)));
            for (Map.Entry entry : map.entrySet()) {
                put(entry.getKey(), entry.getValue());
            }
        }
    }

    public void r(int i2) {
        c[] cVarArr = this.Z;
        int length = cVarArr.length;
        if (i2 <= length) {
            return;
        }
        if (this.Y == 0) {
            this.Y0 = e(i2, this.X);
            this.Z = new c[i2];
            return;
        }
        c[] cVarArr2 = new c[i2];
        this.Z0++;
        for (int i3 = length - 1; i3 >= 0; i3--) {
            c cVar = cVarArr[i3];
            if (cVar != null) {
                cVarArr[i3] = null;
                while (true) {
                    c cVar2 = cVar.X;
                    int z = z(cVar.Y, i2);
                    cVar.X = cVarArr2[z];
                    cVarArr2[z] = cVar;
                    if (cVar2 == null) {
                        break;
                    }
                    cVar = cVar2;
                }
            }
        }
        this.Y0 = e(i2, this.X);
        this.Z = cVarArr2;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Object remove(Object obj) {
        Object g2 = g(obj);
        int y = y(g2);
        int z = z(y, this.Z.length);
        c cVar = null;
        for (c cVar2 = this.Z[z]; cVar2 != null; cVar2 = cVar2.X) {
            if (cVar2.Y == y && B(g2, cVar2.Z)) {
                Object value = cVar2.getValue();
                E(cVar2, z, cVar);
                return value;
            }
            cVar = cVar2;
        }
        return null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public int size() {
        return this.Y;
    }

    public int t(c cVar) {
        return cVar.Y;
    }

    @Override // java.util.AbstractMap
    public String toString() {
        if (size() == 0) {
            return "{}";
        }
        StringBuffer stringBuffer = new StringBuffer(size() * 32);
        stringBuffer.append('{');
        V71 p = p();
        boolean hasNext = p.hasNext();
        while (hasNext) {
            Object next = p.next();
            Object value = p.getValue();
            if (next == this) {
                next = "(this Map)";
            }
            stringBuffer.append(next);
            stringBuffer.append('=');
            if (value == this) {
                value = "(this Map)";
            }
            stringBuffer.append(value);
            hasNext = p.hasNext();
            if (hasNext) {
                stringBuffer.append(',');
                stringBuffer.append(' ');
            }
        }
        stringBuffer.append('}');
        return stringBuffer.toString();
    }

    public Object u(c cVar) {
        return cVar.Z;
    }

    public c v(c cVar) {
        return cVar.X;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Collection values() {
        if (this.c1 == null) {
            this.c1 = new h(this);
        }
        return this.c1;
    }

    public Object w(c cVar) {
        return cVar.Y0;
    }

    public c x(Object obj) {
        Object g2 = g(obj);
        int y = y(g2);
        c[] cVarArr = this.Z;
        for (c cVar = cVarArr[z(y, cVarArr.length)]; cVar != null; cVar = cVar.X) {
            if (cVar.Y == y && B(g2, cVar.Z)) {
                return cVar;
            }
        }
        return null;
    }

    public int y(Object obj) {
        int hashCode = obj.hashCode();
        int i2 = hashCode + (~(hashCode << 9));
        int i3 = i2 ^ (i2 >>> 14);
        int i4 = i3 + (i3 << 4);
        return i4 ^ (i4 >>> 10);
    }

    public int z(int i2, int i3) {
        return i2 & (i3 - 1);
    }

    public U0(int i2, float f2, int i3) {
        this.X = f2;
        this.Z = new c[i2];
        this.Y0 = i3;
        A();
    }

    public U0(int i2) {
        this(i2, 0.75f);
    }

    public U0(int i2, float f2) {
        if (i2 >= 1) {
            if (f2 > 0.0f && !Float.isNaN(f2)) {
                this.X = f2;
                int d2 = d(i2);
                this.Y0 = e(d2, f2);
                this.Z = new c[d2];
                A();
                return;
            }
            throw new IllegalArgumentException("Load factor must be greater than 0");
        }
        throw new IllegalArgumentException("Initial capacity must be greater than 0");
    }

    public U0(Map map) {
        this(Math.max(map.size() * 2, 16), 0.75f);
        putAll(map);
    }

    public void A() {
    }
}
