package o;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;
import java.util.ArrayList;
import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;

/* loaded from: classes4.dex */
public class K02 implements Map, Cloneable, Externalizable {
    public static final int Y0 = 0;
    public static final int Z0 = 1;
    public static final int a1 = 2;
    public static final int b1 = Integer.MIN_VALUE;
    private static final long serialVersionUID = 3380552487888102930L;
    public a X;
    public HashMap Y;
    public transient long Z;

    /* loaded from: classes4.dex */
    public static class a implements Map.Entry, KX0 {
        public final Object X;
        public Object Y;
        public a Z = null;
        public a Y0 = null;

        public a(Object obj, Object obj2) {
            this.X = obj;
            this.Y = obj2;
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
            if (getKey() != null ? getKey().equals(entry.getKey()) : entry.getKey() == null) {
                if (getValue() != null ? getValue().equals(entry.getValue()) : entry.getValue() == null) {
                    return true;
                }
            }
            return false;
        }

        @Override // java.util.Map.Entry, o.KX0
        public Object getKey() {
            return this.X;
        }

        @Override // java.util.Map.Entry, o.KX0
        public Object getValue() {
            return this.Y;
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
            Object obj2 = this.Y;
            this.Y = obj;
            return obj2;
        }

        public String toString() {
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append(C6566gU0.f);
            stringBuffer.append(getKey());
            stringBuffer.append("=");
            stringBuffer.append(getValue());
            stringBuffer.append(C6566gU0.g);
            return stringBuffer.toString();
        }
    }

    /* loaded from: classes4.dex */
    public class b implements Iterator {
        public int X;
        public a Y;
        public transient long Z;

        public b(int i) {
            this.Y = K02.this.X;
            this.Z = K02.this.Z;
            this.X = Integer.MIN_VALUE | i;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            if (this.Y.Z != K02.this.X) {
                return true;
            }
            return false;
        }

        @Override // java.util.Iterator
        public Object next() {
            if (K02.this.Z == this.Z) {
                if (this.Y.Z != K02.this.X) {
                    int i = this.X & Integer.MAX_VALUE;
                    this.X = i;
                    a aVar = this.Y.Z;
                    this.Y = aVar;
                    if (i != 0) {
                        if (i != 1) {
                            if (i == 2) {
                                return aVar;
                            }
                            StringBuffer stringBuffer = new StringBuffer();
                            stringBuffer.append("bad iterator type: ");
                            stringBuffer.append(this.X);
                            throw new Error(stringBuffer.toString());
                        }
                        return aVar.getValue();
                    }
                    return aVar.getKey();
                }
                throw new NoSuchElementException();
            }
            throw new ConcurrentModificationException();
        }

        @Override // java.util.Iterator
        public void remove() {
            if ((this.X & Integer.MIN_VALUE) == 0) {
                if (K02.this.Z == this.Z) {
                    K02.this.z(this.Y.getKey());
                    this.Z++;
                    this.X |= Integer.MIN_VALUE;
                    return;
                }
                throw new ConcurrentModificationException();
            }
            throw new IllegalStateException("remove() must follow next()");
        }
    }

    public K02() {
        this.Z = 0L;
        this.X = f();
        this.Y = new HashMap();
    }

    public static final a f() {
        a aVar = new a(null, null);
        aVar.Y0 = aVar;
        aVar.Z = aVar;
        return aVar;
    }

    public List A() {
        ArrayList arrayList = new ArrayList(size());
        for (Object obj : keySet()) {
            arrayList.add(obj);
        }
        return C6978iB2.f(arrayList);
    }

    @Override // java.util.Map
    public void clear() {
        this.Z++;
        this.Y.clear();
        a aVar = this.X;
        aVar.Z = aVar;
        aVar.Y0 = aVar;
    }

    public Object clone() throws CloneNotSupportedException {
        K02 k02 = (K02) super.clone();
        k02.X = f();
        k02.Y = new HashMap();
        k02.putAll(this);
        return k02;
    }

    @Override // java.util.Map
    public boolean containsKey(Object obj) {
        return this.Y.containsKey(obj);
    }

    @Override // java.util.Map
    public boolean containsValue(Object obj) {
        if (obj == null) {
            a aVar = this.X;
            do {
                aVar = aVar.Z;
                if (aVar == this.X) {
                    return false;
                }
            } while (aVar.getValue() != null);
            return true;
        }
        a aVar2 = this.X;
        do {
            aVar2 = aVar2.Z;
            if (aVar2 == this.X) {
                return false;
            }
        } while (!obj.equals(aVar2.getValue()));
        return true;
    }

    @Override // java.util.Map
    public Set entrySet() {
        return new J02(this);
    }

    @Override // java.util.Map
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Map)) {
            return false;
        }
        return entrySet().equals(((Map) obj).entrySet());
    }

    public Object g(int i) {
        return i(i).getKey();
    }

    @Override // java.util.Map
    public Object get(Object obj) {
        a aVar = (a) this.Y.get(obj);
        if (aVar == null) {
            return null;
        }
        return aVar.getValue();
    }

    @Override // java.util.Map
    public int hashCode() {
        return entrySet().hashCode();
    }

    public final Map.Entry i(int i) {
        a aVar;
        a aVar2 = this.X;
        if (i >= 0) {
            int i2 = -1;
            while (i2 < i - 1 && (aVar = aVar2.Z) != this.X) {
                i2++;
                aVar2 = aVar;
            }
            a aVar3 = aVar2.Z;
            if (aVar3 != this.X) {
                return aVar3;
            }
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append(i);
            stringBuffer.append(" >= ");
            stringBuffer.append(i2 + 1);
            throw new ArrayIndexOutOfBoundsException(stringBuffer.toString());
        }
        StringBuffer stringBuffer2 = new StringBuffer();
        stringBuffer2.append(i);
        stringBuffer2.append(" < 0");
        throw new ArrayIndexOutOfBoundsException(stringBuffer2.toString());
    }

    @Override // java.util.Map
    public boolean isEmpty() {
        a aVar = this.X;
        if (aVar.Z == aVar) {
            return true;
        }
        return false;
    }

    public Map.Entry j() {
        if (isEmpty()) {
            return null;
        }
        return this.X.Z;
    }

    public Object k() {
        return this.X.Z.getKey();
    }

    @Override // java.util.Map
    public Set keySet() {
        return new H02(this);
    }

    public Object l() {
        return this.X.Z.getValue();
    }

    public Map.Entry m() {
        if (isEmpty()) {
            return null;
        }
        return this.X.Y0;
    }

    public Object n() {
        return this.X.Y0.getKey();
    }

    public Object o() {
        return this.X.Y0.getValue();
    }

    @Override // java.util.Map
    public Object put(Object obj, Object obj2) {
        Object obj3;
        this.Z++;
        a aVar = (a) this.Y.get(obj);
        if (aVar != null) {
            y(aVar);
            obj3 = aVar.setValue(obj2);
        } else {
            aVar = new a(obj, obj2);
            this.Y.put(obj, aVar);
            obj3 = null;
        }
        u(aVar);
        return obj3;
    }

    @Override // java.util.Map
    public void putAll(Map map) {
        for (Map.Entry entry : map.entrySet()) {
            put(entry.getKey(), entry.getValue());
        }
    }

    public Object r(int i) {
        return i(i).getValue();
    }

    @Override // java.io.Externalizable
    public void readExternal(ObjectInput objectInput) throws IOException, ClassNotFoundException {
        int readInt = objectInput.readInt();
        for (int i = 0; i < readInt; i++) {
            put(objectInput.readObject(), objectInput.readObject());
        }
    }

    @Override // java.util.Map
    public Object remove(Object obj) {
        a z = z(obj);
        if (z == null) {
            return null;
        }
        return z.getValue();
    }

    @Override // java.util.Map
    public int size() {
        return this.Y.size();
    }

    public int t(Object obj) {
        a aVar = (a) this.Y.get(obj);
        if (aVar == null) {
            return -1;
        }
        int i = 0;
        while (true) {
            aVar = aVar.Y0;
            if (aVar != this.X) {
                i++;
            } else {
                return i;
            }
        }
    }

    public String toString() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append('[');
        a aVar = this.X;
        while (true) {
            aVar = aVar.Z;
            if (aVar != this.X) {
                stringBuffer.append(aVar.getKey());
                stringBuffer.append('=');
                stringBuffer.append(aVar.getValue());
                if (aVar.Z != this.X) {
                    stringBuffer.append(',');
                }
            } else {
                stringBuffer.append(']');
                return stringBuffer.toString();
            }
        }
    }

    public final void u(a aVar) {
        a aVar2 = this.X;
        aVar.Z = aVar2;
        aVar.Y0 = aVar2.Y0;
        aVar2.Y0.Z = aVar;
        aVar2.Y0 = aVar;
    }

    public Iterator v() {
        return keySet().iterator();
    }

    @Override // java.util.Map
    public Collection values() {
        return new I02(this);
    }

    public int w(Object obj) {
        return t(obj);
    }

    @Override // java.io.Externalizable
    public void writeExternal(ObjectOutput objectOutput) throws IOException {
        objectOutput.writeInt(size());
        a aVar = this.X;
        while (true) {
            aVar = aVar.Z;
            if (aVar != this.X) {
                objectOutput.writeObject(aVar.getKey());
                objectOutput.writeObject(aVar.getValue());
            } else {
                return;
            }
        }
    }

    public Object x(int i) {
        return remove(g(i));
    }

    public final void y(a aVar) {
        a aVar2 = aVar.Z;
        aVar2.Y0 = aVar.Y0;
        aVar.Y0.Z = aVar2;
    }

    public final a z(Object obj) {
        a aVar = (a) this.Y.remove(obj);
        if (aVar == null) {
            return null;
        }
        this.Z++;
        y(aVar);
        return aVar;
    }

    public K02(int i) {
        this.Z = 0L;
        this.X = f();
        this.Y = new HashMap(i);
    }

    public K02(int i, float f) {
        this.Z = 0L;
        this.X = f();
        this.Y = new HashMap(i, f);
    }

    public K02(Map map) {
        this();
        putAll(map);
    }
}
