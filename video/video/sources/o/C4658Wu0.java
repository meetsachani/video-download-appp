package o;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.AbstractCollection;
import java.util.AbstractSet;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;

/* renamed from: o.Wu0  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C4658Wu0 implements XT0, Serializable, Cloneable {
    private static final long serialVersionUID = -6701087419741928296L;
    public transient int X;
    public transient int Y;
    public transient int Y0;
    public transient int Z;
    public transient Object Z0;
    public transient Object a1;
    public transient Object b1;
    public transient Object c1;
    public transient Object d1;
    public transient Object e1;
    public transient U0 f1;

    /* renamed from: o.Wu0$a */
    /* loaded from: classes4.dex */
    public static class a extends AbstractSet {
        public final C4658Wu0 X;

        public a(C4658Wu0 c4658Wu0) {
            this.X = c4658Wu0;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public void clear() {
            this.X.clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public Iterator iterator() {
            if (this.X.f1 != null) {
                return this.X.f1.entrySet().iterator();
            }
            if (this.X.size() == 0) {
                return C4482Va0.Y;
            }
            return new b(this.X);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean remove(Object obj) {
            if (!(obj instanceof Map.Entry)) {
                return false;
            }
            Object key = ((Map.Entry) obj).getKey();
            boolean containsKey = this.X.containsKey(key);
            this.X.remove(key);
            return containsKey;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return this.X.size();
        }
    }

    /* renamed from: o.Wu0$b */
    /* loaded from: classes4.dex */
    public static class b implements Iterator, Map.Entry {
        public final C4658Wu0 X;
        public int Y = 0;
        public boolean Z = false;

        public b(C4658Wu0 c4658Wu0) {
            this.X = c4658Wu0;
        }

        @Override // java.util.Map.Entry
        public boolean equals(Object obj) {
            if (!this.Z || !(obj instanceof Map.Entry)) {
                return false;
            }
            Map.Entry entry = (Map.Entry) obj;
            Object key = getKey();
            Object value = getValue();
            if (key != null ? key.equals(entry.getKey()) : entry.getKey() == null) {
                Object value2 = entry.getValue();
                if (value == null) {
                    if (value2 == null) {
                        return true;
                    }
                } else if (value.equals(value2)) {
                    return true;
                }
            }
            return false;
        }

        @Override // java.util.Map.Entry
        public Object getKey() {
            if (this.Z) {
                int i = this.Y;
                if (i == 1) {
                    return this.X.Z0;
                }
                if (i == 2) {
                    return this.X.a1;
                }
                if (i == 3) {
                    return this.X.b1;
                }
                throw new IllegalStateException("Invalid map index");
            }
            throw new IllegalStateException("getKey() can only be called after next() and before remove()");
        }

        @Override // java.util.Map.Entry
        public Object getValue() {
            if (this.Z) {
                int i = this.Y;
                if (i == 1) {
                    return this.X.c1;
                }
                if (i == 2) {
                    return this.X.d1;
                }
                if (i == 3) {
                    return this.X.e1;
                }
                throw new IllegalStateException("Invalid map index");
            }
            throw new IllegalStateException("getValue() can only be called after next() and before remove()");
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            if (this.Y < this.X.X) {
                return true;
            }
            return false;
        }

        @Override // java.util.Map.Entry
        public int hashCode() {
            int hashCode;
            int i = 0;
            if (!this.Z) {
                return 0;
            }
            Object key = getKey();
            Object value = getValue();
            if (key == null) {
                hashCode = 0;
            } else {
                hashCode = key.hashCode();
            }
            if (value != null) {
                i = value.hashCode();
            }
            return hashCode ^ i;
        }

        @Override // java.util.Iterator
        public Object next() {
            if (hasNext()) {
                this.Z = true;
                this.Y++;
                return this;
            }
            throw new NoSuchElementException("No next() entry in the iteration");
        }

        @Override // java.util.Iterator
        public void remove() {
            if (this.Z) {
                this.X.remove(getKey());
                this.Y--;
                this.Z = false;
                return;
            }
            throw new IllegalStateException("remove() can only be called once after next()");
        }

        @Override // java.util.Map.Entry
        public Object setValue(Object obj) {
            if (this.Z) {
                Object value = getValue();
                int i = this.Y;
                if (i == 1) {
                    this.X.c1 = obj;
                    return value;
                } else if (i == 2) {
                    this.X.d1 = obj;
                    return value;
                } else if (i == 3) {
                    this.X.e1 = obj;
                    return value;
                } else {
                    return value;
                }
            }
            throw new IllegalStateException("setValue() can only be called after next() and before remove()");
        }

        public String toString() {
            if (this.Z) {
                StringBuffer stringBuffer = new StringBuffer();
                stringBuffer.append(getKey());
                stringBuffer.append("=");
                stringBuffer.append(getValue());
                return stringBuffer.toString();
            }
            return "";
        }
    }

    /* renamed from: o.Wu0$c */
    /* loaded from: classes4.dex */
    public static class c implements V71, NS1 {
        public final C4658Wu0 X;
        public int Y = 0;
        public boolean Z = false;

        public c(C4658Wu0 c4658Wu0) {
            this.X = c4658Wu0;
        }

        @Override // o.V71
        public Object getKey() {
            if (this.Z) {
                int i = this.Y;
                if (i == 1) {
                    return this.X.Z0;
                }
                if (i == 2) {
                    return this.X.a1;
                }
                if (i == 3) {
                    return this.X.b1;
                }
                throw new IllegalStateException("Invalid map index");
            }
            throw new IllegalStateException("getKey() can only be called after next() and before remove()");
        }

        @Override // o.V71
        public Object getValue() {
            if (this.Z) {
                int i = this.Y;
                if (i == 1) {
                    return this.X.c1;
                }
                if (i == 2) {
                    return this.X.d1;
                }
                if (i == 3) {
                    return this.X.e1;
                }
                throw new IllegalStateException("Invalid map index");
            }
            throw new IllegalStateException("getValue() can only be called after next() and before remove()");
        }

        @Override // o.V71, java.util.Iterator
        public boolean hasNext() {
            if (this.Y < this.X.X) {
                return true;
            }
            return false;
        }

        @Override // o.V71, java.util.Iterator
        public Object next() {
            if (hasNext()) {
                this.Z = true;
                this.Y++;
                return getKey();
            }
            throw new NoSuchElementException("No next() entry in the iteration");
        }

        @Override // o.V71, java.util.Iterator
        public void remove() {
            if (this.Z) {
                this.X.remove(getKey());
                this.Y--;
                this.Z = false;
                return;
            }
            throw new IllegalStateException("remove() can only be called once after next()");
        }

        @Override // o.NS1
        public void reset() {
            this.Y = 0;
            this.Z = false;
        }

        @Override // o.V71
        public Object setValue(Object obj) {
            if (this.Z) {
                Object value = getValue();
                int i = this.Y;
                if (i != 1) {
                    if (i != 2) {
                        if (i == 3) {
                            this.X.e1 = obj;
                        } else {
                            return value;
                        }
                    }
                    this.X.d1 = obj;
                }
                this.X.c1 = obj;
                return value;
            }
            throw new IllegalStateException("setValue() can only be called after next() and before remove()");
        }

        public String toString() {
            if (this.Z) {
                StringBuffer stringBuffer = new StringBuffer();
                stringBuffer.append("Iterator[");
                stringBuffer.append(getKey());
                stringBuffer.append("=");
                stringBuffer.append(getValue());
                stringBuffer.append(C6566gU0.g);
                return stringBuffer.toString();
            }
            return "Iterator[]";
        }
    }

    /* renamed from: o.Wu0$d */
    /* loaded from: classes4.dex */
    public static class d extends AbstractSet {
        public final C4658Wu0 X;

        public d(C4658Wu0 c4658Wu0) {
            this.X = c4658Wu0;
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
            if (this.X.f1 != null) {
                return this.X.f1.keySet().iterator();
            }
            if (this.X.size() == 0) {
                return C4482Va0.Y;
            }
            return new e(this.X);
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

    /* renamed from: o.Wu0$e */
    /* loaded from: classes4.dex */
    public static class e extends b {
        public e(C4658Wu0 c4658Wu0) {
            super(c4658Wu0);
        }

        @Override // o.C4658Wu0.b, java.util.Iterator
        public Object next() {
            super.next();
            return getKey();
        }
    }

    /* renamed from: o.Wu0$f */
    /* loaded from: classes4.dex */
    public static class f extends AbstractCollection {
        public final C4658Wu0 X;

        public f(C4658Wu0 c4658Wu0) {
            this.X = c4658Wu0;
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
            if (this.X.f1 != null) {
                return this.X.f1.values().iterator();
            }
            if (this.X.size() == 0) {
                return C4482Va0.Y;
            }
            return new g(this.X);
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public int size() {
            return this.X.size();
        }
    }

    /* renamed from: o.Wu0$g */
    /* loaded from: classes4.dex */
    public static class g extends b {
        public g(C4658Wu0 c4658Wu0) {
            super(c4658Wu0);
        }

        @Override // o.C4658Wu0.b, java.util.Iterator
        public Object next() {
            super.next();
            return getValue();
        }
    }

    public C4658Wu0() {
    }

    private void readObject(ObjectInputStream objectInputStream) throws IOException, ClassNotFoundException {
        objectInputStream.defaultReadObject();
        int readInt = objectInputStream.readInt();
        if (readInt > 3) {
            this.f1 = o();
        }
        while (readInt > 0) {
            put(objectInputStream.readObject(), objectInputStream.readObject());
            readInt--;
        }
    }

    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.defaultWriteObject();
        objectOutputStream.writeInt(size());
        V71 p = p();
        while (p.hasNext()) {
            objectOutputStream.writeObject(p.next());
            objectOutputStream.writeObject(p.getValue());
        }
    }

    @Override // java.util.Map
    public void clear() {
        U0 u0 = this.f1;
        if (u0 != null) {
            u0.clear();
            this.f1 = null;
            return;
        }
        this.X = 0;
        this.Y0 = 0;
        this.Z = 0;
        this.Y = 0;
        this.b1 = null;
        this.a1 = null;
        this.Z0 = null;
        this.e1 = null;
        this.d1 = null;
        this.c1 = null;
    }

    public Object clone() {
        try {
            C4658Wu0 c4658Wu0 = (C4658Wu0) super.clone();
            U0 u0 = c4658Wu0.f1;
            if (u0 != null) {
                c4658Wu0.f1 = (AG0) u0.clone();
            }
            return c4658Wu0;
        } catch (CloneNotSupportedException unused) {
            throw new InternalError();
        }
    }

    @Override // java.util.Map
    public boolean containsKey(Object obj) {
        U0 u0 = this.f1;
        if (u0 != null) {
            return u0.containsKey(obj);
        }
        if (obj == null) {
            int i = this.X;
            if (i != 1) {
                if (i != 2) {
                    if (i == 3) {
                        if (this.b1 == null) {
                            return true;
                        }
                    } else {
                        return false;
                    }
                }
                if (this.a1 == null) {
                    return true;
                }
            }
            if (this.Z0 == null) {
                return true;
            }
            return false;
        } else if (this.X > 0) {
            int hashCode = obj.hashCode();
            int i2 = this.X;
            if (i2 != 1) {
                if (i2 != 2) {
                    if (i2 == 3) {
                        if (this.Y0 == hashCode && obj.equals(this.b1)) {
                            return true;
                        }
                    } else {
                        return false;
                    }
                }
                if (this.Z == hashCode && obj.equals(this.a1)) {
                    return true;
                }
            }
            if (this.Y == hashCode && obj.equals(this.Z0)) {
                return true;
            }
            return false;
        } else {
            return false;
        }
    }

    @Override // java.util.Map
    public boolean containsValue(Object obj) {
        U0 u0 = this.f1;
        if (u0 != null) {
            return u0.containsValue(obj);
        }
        if (obj == null) {
            int i = this.X;
            if (i != 1) {
                if (i != 2) {
                    if (i == 3) {
                        if (this.e1 == null) {
                            return true;
                        }
                    } else {
                        return false;
                    }
                }
                if (this.d1 == null) {
                    return true;
                }
            }
            if (this.c1 == null) {
                return true;
            }
            return false;
        }
        int i2 = this.X;
        if (i2 != 1) {
            if (i2 != 2) {
                if (i2 == 3) {
                    if (obj.equals(this.e1)) {
                        return true;
                    }
                } else {
                    return false;
                }
            }
            if (obj.equals(this.d1)) {
                return true;
            }
        }
        if (obj.equals(this.c1)) {
            return true;
        }
        return false;
    }

    @Override // java.util.Map
    public Set entrySet() {
        U0 u0 = this.f1;
        if (u0 != null) {
            return u0.entrySet();
        }
        return new a(this);
    }

    @Override // java.util.Map
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        U0 u0 = this.f1;
        if (u0 != null) {
            return u0.equals(obj);
        }
        if (!(obj instanceof Map)) {
            return false;
        }
        Map map = (Map) obj;
        if (this.X != map.size()) {
            return false;
        }
        int i = this.X;
        if (i > 0) {
            if (i != 1) {
                if (i != 2) {
                    if (i == 3) {
                        if (!map.containsKey(this.b1)) {
                            return false;
                        }
                        Object obj2 = map.get(this.b1);
                        Object obj3 = this.e1;
                        if (obj3 != null ? !obj3.equals(obj2) : obj2 != null) {
                            return false;
                        }
                    }
                }
                if (!map.containsKey(this.a1)) {
                    return false;
                }
                Object obj4 = map.get(this.a1);
                Object obj5 = this.d1;
                if (obj5 != null ? !obj5.equals(obj4) : obj4 != null) {
                    return false;
                }
            }
            if (!map.containsKey(this.Z0)) {
                return false;
            }
            Object obj6 = map.get(this.Z0);
            Object obj7 = this.c1;
            if (obj7 != null ? !obj7.equals(obj6) : obj6 != null) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.Map
    public Object get(Object obj) {
        U0 u0 = this.f1;
        if (u0 != null) {
            return u0.get(obj);
        }
        if (obj == null) {
            int i = this.X;
            if (i != 1) {
                if (i != 2) {
                    if (i == 3) {
                        if (this.b1 == null) {
                            return this.e1;
                        }
                    } else {
                        return null;
                    }
                }
                if (this.a1 == null) {
                    return this.d1;
                }
            }
            if (this.Z0 == null) {
                return this.c1;
            }
            return null;
        } else if (this.X > 0) {
            int hashCode = obj.hashCode();
            int i2 = this.X;
            if (i2 != 1) {
                if (i2 != 2) {
                    if (i2 == 3) {
                        if (this.Y0 == hashCode && obj.equals(this.b1)) {
                            return this.e1;
                        }
                    } else {
                        return null;
                    }
                }
                if (this.Z == hashCode && obj.equals(this.a1)) {
                    return this.d1;
                }
            }
            if (this.Y == hashCode && obj.equals(this.Z0)) {
                return this.c1;
            }
            return null;
        } else {
            return null;
        }
    }

    @Override // java.util.Map
    public int hashCode() {
        int i;
        int i2;
        int hashCode;
        int hashCode2;
        U0 u0 = this.f1;
        if (u0 != null) {
            return u0.hashCode();
        }
        int i3 = this.X;
        int i4 = 0;
        if (i3 != 1) {
            if (i3 != 2) {
                if (i3 != 3) {
                    return 0;
                }
                int i5 = this.Y0;
                Object obj = this.e1;
                if (obj == null) {
                    hashCode2 = 0;
                } else {
                    hashCode2 = obj.hashCode();
                }
                i2 = i5 ^ hashCode2;
            } else {
                i2 = 0;
            }
            int i6 = this.Z;
            Object obj2 = this.d1;
            if (obj2 == null) {
                hashCode = 0;
            } else {
                hashCode = obj2.hashCode();
            }
            i = i2 + (i6 ^ hashCode);
        } else {
            i = 0;
        }
        int i7 = this.Y;
        Object obj3 = this.c1;
        if (obj3 != null) {
            i4 = obj3.hashCode();
        }
        return i + (i7 ^ i4);
    }

    @Override // java.util.Map
    public boolean isEmpty() {
        if (size() == 0) {
            return true;
        }
        return false;
    }

    @Override // java.util.Map
    public Set keySet() {
        U0 u0 = this.f1;
        if (u0 != null) {
            return u0.keySet();
        }
        return new d(this);
    }

    public final void n() {
        U0 o2 = o();
        this.f1 = o2;
        int i = this.X;
        if (i != 1) {
            if (i != 2) {
                if (i == 3) {
                    o2.put(this.b1, this.e1);
                }
                this.X = 0;
                this.Y0 = 0;
                this.Z = 0;
                this.Y = 0;
                this.b1 = null;
                this.a1 = null;
                this.Z0 = null;
                this.e1 = null;
                this.d1 = null;
                this.c1 = null;
            }
            this.f1.put(this.a1, this.d1);
        }
        this.f1.put(this.Z0, this.c1);
        this.X = 0;
        this.Y0 = 0;
        this.Z = 0;
        this.Y = 0;
        this.b1 = null;
        this.a1 = null;
        this.Z0 = null;
        this.e1 = null;
        this.d1 = null;
        this.c1 = null;
    }

    public U0 o() {
        return new AG0();
    }

    @Override // o.XT0
    public V71 p() {
        U0 u0 = this.f1;
        if (u0 != null) {
            return u0.p();
        }
        if (this.X == 0) {
            return C5848db0.X;
        }
        return new c(this);
    }

    @Override // java.util.Map
    public Object put(Object obj, Object obj2) {
        U0 u0 = this.f1;
        if (u0 != null) {
            return u0.put(obj, obj2);
        }
        if (obj == null) {
            int i = this.X;
            if (i != 1) {
                if (i != 2) {
                    if (i == 3) {
                        if (this.b1 == null) {
                            Object obj3 = this.e1;
                            this.e1 = obj2;
                            return obj3;
                        }
                    }
                }
                if (this.a1 == null) {
                    Object obj4 = this.d1;
                    this.d1 = obj2;
                    return obj4;
                }
            }
            if (this.Z0 == null) {
                Object obj5 = this.c1;
                this.c1 = obj2;
                return obj5;
            }
        } else if (this.X > 0) {
            int hashCode = obj.hashCode();
            int i2 = this.X;
            if (i2 != 1) {
                if (i2 != 2) {
                    if (i2 == 3) {
                        if (this.Y0 == hashCode && obj.equals(this.b1)) {
                            Object obj6 = this.e1;
                            this.e1 = obj2;
                            return obj6;
                        }
                    }
                }
                if (this.Z == hashCode && obj.equals(this.a1)) {
                    Object obj7 = this.d1;
                    this.d1 = obj2;
                    return obj7;
                }
            }
            if (this.Y == hashCode && obj.equals(this.Z0)) {
                Object obj8 = this.c1;
                this.c1 = obj2;
                return obj8;
            }
        }
        int i3 = this.X;
        int i4 = 0;
        if (i3 != 0) {
            if (i3 != 1) {
                if (i3 != 2) {
                    n();
                    this.f1.put(obj, obj2);
                    return null;
                }
                if (obj != null) {
                    i4 = obj.hashCode();
                }
                this.Y0 = i4;
                this.b1 = obj;
                this.e1 = obj2;
            } else {
                if (obj != null) {
                    i4 = obj.hashCode();
                }
                this.Z = i4;
                this.a1 = obj;
                this.d1 = obj2;
            }
        } else {
            if (obj != null) {
                i4 = obj.hashCode();
            }
            this.Y = i4;
            this.Z0 = obj;
            this.c1 = obj2;
        }
        this.X++;
        return null;
    }

    @Override // java.util.Map
    public void putAll(Map map) {
        int size = map.size();
        if (size != 0) {
            U0 u0 = this.f1;
            if (u0 != null) {
                u0.putAll(map);
            } else if (size < 4) {
                for (Map.Entry entry : map.entrySet()) {
                    put(entry.getKey(), entry.getValue());
                }
            } else {
                n();
                this.f1.putAll(map);
            }
        }
    }

    @Override // java.util.Map
    public Object remove(Object obj) {
        U0 u0 = this.f1;
        if (u0 != null) {
            return u0.remove(obj);
        }
        int i = this.X;
        if (i == 0) {
            return null;
        }
        if (obj == null) {
            if (i != 1) {
                if (i != 2) {
                    if (i == 3) {
                        Object obj2 = this.b1;
                        if (obj2 == null) {
                            Object obj3 = this.e1;
                            this.Y0 = 0;
                            this.b1 = null;
                            this.e1 = null;
                            this.X = 2;
                            return obj3;
                        } else if (this.a1 == null) {
                            Object obj4 = this.d1;
                            this.Z = this.Y0;
                            this.a1 = obj2;
                            this.d1 = this.e1;
                            this.Y0 = 0;
                            this.b1 = null;
                            this.e1 = null;
                            this.X = 2;
                            return obj4;
                        } else if (this.Z0 != null) {
                            return null;
                        } else {
                            Object obj5 = this.c1;
                            this.Y = this.Y0;
                            this.Z0 = obj2;
                            this.c1 = this.e1;
                            this.Y0 = 0;
                            this.b1 = null;
                            this.e1 = null;
                            this.X = 2;
                            return obj5;
                        }
                    }
                } else {
                    Object obj6 = this.a1;
                    if (obj6 == null) {
                        Object obj7 = this.d1;
                        this.Z = 0;
                        this.a1 = null;
                        this.d1 = null;
                        this.X = 1;
                        return obj7;
                    } else if (this.Z0 != null) {
                        return null;
                    } else {
                        Object obj8 = this.c1;
                        this.Y = this.Z;
                        this.Z0 = obj6;
                        this.c1 = this.d1;
                        this.Z = 0;
                        this.a1 = null;
                        this.d1 = null;
                        this.X = 1;
                        return obj8;
                    }
                }
            } else if (this.Z0 == null) {
                Object obj9 = this.c1;
                this.Y = 0;
                this.Z0 = null;
                this.c1 = null;
                this.X = 0;
                return obj9;
            }
        } else if (i > 0) {
            int hashCode = obj.hashCode();
            int i2 = this.X;
            if (i2 != 1) {
                if (i2 != 2) {
                    if (i2 == 3) {
                        if (this.Y0 == hashCode && obj.equals(this.b1)) {
                            Object obj10 = this.e1;
                            this.Y0 = 0;
                            this.b1 = null;
                            this.e1 = null;
                            this.X = 2;
                            return obj10;
                        } else if (this.Z == hashCode && obj.equals(this.a1)) {
                            Object obj11 = this.d1;
                            this.Z = this.Y0;
                            this.a1 = this.b1;
                            this.d1 = this.e1;
                            this.Y0 = 0;
                            this.b1 = null;
                            this.e1 = null;
                            this.X = 2;
                            return obj11;
                        } else if (this.Y != hashCode || !obj.equals(this.Z0)) {
                            return null;
                        } else {
                            Object obj12 = this.c1;
                            this.Y = this.Y0;
                            this.Z0 = this.b1;
                            this.c1 = this.e1;
                            this.Y0 = 0;
                            this.b1 = null;
                            this.e1 = null;
                            this.X = 2;
                            return obj12;
                        }
                    }
                } else if (this.Z == hashCode && obj.equals(this.a1)) {
                    Object obj13 = this.d1;
                    this.Z = 0;
                    this.a1 = null;
                    this.d1 = null;
                    this.X = 1;
                    return obj13;
                } else if (this.Y != hashCode || !obj.equals(this.Z0)) {
                    return null;
                } else {
                    Object obj14 = this.c1;
                    this.Y = this.Z;
                    this.Z0 = this.a1;
                    this.c1 = this.d1;
                    this.Z = 0;
                    this.a1 = null;
                    this.d1 = null;
                    this.X = 1;
                    return obj14;
                }
            } else if (this.Y == hashCode && obj.equals(this.Z0)) {
                Object obj15 = this.c1;
                this.Y = 0;
                this.Z0 = null;
                this.c1 = null;
                this.X = 0;
                return obj15;
            }
        }
        return null;
    }

    @Override // java.util.Map
    public int size() {
        U0 u0 = this.f1;
        if (u0 != null) {
            return u0.size();
        }
        return this.X;
    }

    public String toString() {
        U0 u0 = this.f1;
        if (u0 != null) {
            return u0.toString();
        }
        if (this.X == 0) {
            return "{}";
        }
        StringBuffer stringBuffer = new StringBuffer(128);
        stringBuffer.append('{');
        int i = this.X;
        Object obj = "(this Map)";
        if (i != 1) {
            if (i != 2) {
                if (i == 3) {
                    Object obj2 = this.b1;
                    if (obj2 == this) {
                        obj2 = "(this Map)";
                    }
                    stringBuffer.append(obj2);
                    stringBuffer.append('=');
                    Object obj3 = this.e1;
                    if (obj3 == this) {
                        obj3 = "(this Map)";
                    }
                    stringBuffer.append(obj3);
                    stringBuffer.append(',');
                }
                stringBuffer.append('}');
                return stringBuffer.toString();
            }
            Object obj4 = this.a1;
            if (obj4 == this) {
                obj4 = "(this Map)";
            }
            stringBuffer.append(obj4);
            stringBuffer.append('=');
            Object obj5 = this.d1;
            if (obj5 == this) {
                obj5 = "(this Map)";
            }
            stringBuffer.append(obj5);
            stringBuffer.append(',');
        }
        Object obj6 = this.Z0;
        if (obj6 == this) {
            obj6 = "(this Map)";
        }
        stringBuffer.append(obj6);
        stringBuffer.append('=');
        Object obj7 = this.c1;
        if (obj7 != this) {
            obj = obj7;
        }
        stringBuffer.append(obj);
        stringBuffer.append('}');
        return stringBuffer.toString();
    }

    @Override // java.util.Map
    public Collection values() {
        U0 u0 = this.f1;
        if (u0 != null) {
            return u0.values();
        }
        return new f(this);
    }

    public C4658Wu0(Map map) {
        putAll(map);
    }
}
