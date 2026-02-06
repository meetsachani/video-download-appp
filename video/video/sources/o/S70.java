package o;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Map;
import java.util.SortedMap;
import java.util.TreeMap;

/* loaded from: classes4.dex */
public class S70 extends AbstractC11088z0 implements X92, Serializable {
    private static final long serialVersionUID = 721969328361809L;
    public final Comparator a1;

    /* loaded from: classes4.dex */
    public static class a implements InterfaceC10098uw1, NS1 {
        public final AbstractC11088z0 X;
        public ListIterator Y;
        public Map.Entry Z = null;

        public a(AbstractC11088z0 abstractC11088z0) {
            this.X = abstractC11088z0;
            this.Y = new ArrayList(abstractC11088z0.entrySet()).listIterator();
        }

        @Override // o.V71
        public Object getKey() {
            Map.Entry entry = this.Z;
            if (entry != null) {
                return entry.getKey();
            }
            throw new IllegalStateException("Iterator getKey() can only be called after next() and before remove()");
        }

        @Override // o.V71
        public Object getValue() {
            Map.Entry entry = this.Z;
            if (entry != null) {
                return entry.getValue();
            }
            throw new IllegalStateException("Iterator getValue() can only be called after next() and before remove()");
        }

        @Override // o.V71, java.util.Iterator
        public boolean hasNext() {
            return this.Y.hasNext();
        }

        @Override // o.InterfaceC10098uw1, o.InterfaceC9127qw1
        public boolean hasPrevious() {
            return this.Y.hasPrevious();
        }

        @Override // o.V71, java.util.Iterator
        public Object next() {
            Map.Entry entry = (Map.Entry) this.Y.next();
            this.Z = entry;
            return entry.getKey();
        }

        @Override // o.InterfaceC10098uw1, o.InterfaceC9127qw1
        public Object previous() {
            Map.Entry entry = (Map.Entry) this.Y.previous();
            this.Z = entry;
            return entry.getKey();
        }

        @Override // o.V71, java.util.Iterator
        public void remove() {
            this.Y.remove();
            this.X.remove(this.Z.getKey());
            this.Z = null;
        }

        @Override // o.NS1
        public void reset() {
            this.Y = new ArrayList(this.X.entrySet()).listIterator();
            this.Z = null;
        }

        @Override // o.V71
        public Object setValue(Object obj) {
            if (this.Z != null) {
                if (this.X.X[1].containsKey(obj) && this.X.X[1].get(obj) != this.Z.getKey()) {
                    throw new IllegalArgumentException("Cannot use setValue() when the object being set is already in the map");
                }
                return this.X.put(this.Z.getKey(), obj);
            }
            throw new IllegalStateException("Iterator setValue() can only be called after next() and before remove()");
        }

        public String toString() {
            if (this.Z != null) {
                StringBuffer stringBuffer = new StringBuffer();
                stringBuffer.append("MapIterator[");
                stringBuffer.append(getKey());
                stringBuffer.append("=");
                stringBuffer.append(getValue());
                stringBuffer.append(C6566gU0.g);
                return stringBuffer.toString();
            }
            return "MapIterator[]";
        }
    }

    /* loaded from: classes4.dex */
    public static class b extends AbstractC7913m3 {
        public final S70 Y;

        public b(S70 s70, SortedMap sortedMap) {
            super((SortedMap) s70.a(sortedMap, s70.X[1], s70.Y));
            this.Y = (S70) this.X;
        }

        @Override // o.J1, java.util.Map
        public void clear() {
            Iterator it = keySet().iterator();
            while (it.hasNext()) {
                it.next();
                it.remove();
            }
        }

        @Override // o.J1, java.util.Map
        public boolean containsValue(Object obj) {
            return this.Y.X[0].containsValue(obj);
        }

        @Override // o.AbstractC7913m3, java.util.SortedMap
        public SortedMap headMap(Object obj) {
            return new b(this.Y, super.headMap(obj));
        }

        @Override // o.AbstractC7913m3, java.util.SortedMap
        public SortedMap subMap(Object obj, Object obj2) {
            return new b(this.Y, super.subMap(obj, obj2));
        }

        @Override // o.AbstractC7913m3, java.util.SortedMap
        public SortedMap tailMap(Object obj) {
            return new b(this.Y, super.tailMap(obj));
        }
    }

    public S70() {
        super(new TreeMap(), new TreeMap());
        this.a1 = null;
    }

    private void readObject(ObjectInputStream objectInputStream) throws IOException, ClassNotFoundException {
        objectInputStream.defaultReadObject();
        this.X[0] = new TreeMap(this.a1);
        this.X[1] = new TreeMap(this.a1);
        putAll((Map) objectInputStream.readObject());
    }

    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.defaultWriteObject();
        objectOutputStream.writeObject(this.X[0]);
    }

    @Override // o.X92
    public X92 Z4() {
        return (X92) h();
    }

    @Override // o.AbstractC11088z0
    public InterfaceC5167an a(Map map, Map map2, InterfaceC5167an interfaceC5167an) {
        return new S70(map, map2, interfaceC5167an);
    }

    @Override // o.InterfaceC9612sw1
    public InterfaceC10098uw1 c2() {
        return new a(this);
    }

    @Override // java.util.SortedMap
    public Comparator comparator() {
        return ((SortedMap) this.X[0]).comparator();
    }

    @Override // o.InterfaceC8634ow1
    public InterfaceC8634ow1 e1() {
        return (InterfaceC8634ow1) h();
    }

    @Override // o.InterfaceC9612sw1
    public Object firstKey() {
        return ((SortedMap) this.X[0]).firstKey();
    }

    @Override // java.util.SortedMap
    public SortedMap headMap(Object obj) {
        return new b(this, ((SortedMap) this.X[0]).headMap(obj));
    }

    @Override // o.InterfaceC9612sw1
    public Object j0(Object obj) {
        if (isEmpty()) {
            return null;
        }
        Map map = this.X[0];
        if (map instanceof InterfaceC9612sw1) {
            return ((InterfaceC9612sw1) map).j0(obj);
        }
        SortedMap headMap = ((SortedMap) map).headMap(obj);
        if (headMap.isEmpty()) {
            return null;
        }
        return headMap.lastKey();
    }

    @Override // o.InterfaceC9612sw1
    public Object lastKey() {
        return ((SortedMap) this.X[0]).lastKey();
    }

    @Override // o.InterfaceC9612sw1
    public Object n0(Object obj) {
        if (isEmpty()) {
            return null;
        }
        Map map = this.X[0];
        if (map instanceof InterfaceC9612sw1) {
            return ((InterfaceC9612sw1) map).n0(obj);
        }
        Iterator it = ((SortedMap) map).tailMap(obj).keySet().iterator();
        it.next();
        if (!it.hasNext()) {
            return null;
        }
        return it.next();
    }

    @Override // java.util.SortedMap
    public SortedMap subMap(Object obj, Object obj2) {
        return new b(this, ((SortedMap) this.X[0]).subMap(obj, obj2));
    }

    @Override // java.util.SortedMap
    public SortedMap tailMap(Object obj) {
        return new b(this, ((SortedMap) this.X[0]).tailMap(obj));
    }

    public S70(Map map) {
        super(new TreeMap(), new TreeMap());
        putAll(map);
        this.a1 = null;
    }

    public S70(Comparator comparator) {
        super(new TreeMap(comparator), new TreeMap(comparator));
        this.a1 = comparator;
    }

    public S70(Map map, Map map2, InterfaceC5167an interfaceC5167an) {
        super(map, map2, interfaceC5167an);
        this.a1 = ((SortedMap) map).comparator();
    }
}
