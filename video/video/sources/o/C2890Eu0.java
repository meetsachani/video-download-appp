package o;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.Collection;
import java.util.Map;
import java.util.Set;
import java.util.SortedMap;

/* renamed from: o.Eu0  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C2890Eu0 extends AbstractC7913m3 implements SortedMap, InterfaceC9825tp, Serializable {
    private static final long serialVersionUID = 3126019624511683653L;

    public C2890Eu0(SortedMap sortedMap) {
        super(sortedMap);
    }

    public static SortedMap b(SortedMap sortedMap) {
        return new C2890Eu0(sortedMap);
    }

    private void readObject(ObjectInputStream objectInputStream) throws IOException, ClassNotFoundException {
        objectInputStream.defaultReadObject();
        this.X = (Map) objectInputStream.readObject();
    }

    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.defaultWriteObject();
        objectOutputStream.writeObject(this.X);
    }

    @Override // o.AbstractC7913m3
    public SortedMap a() {
        return (SortedMap) this.X;
    }

    @Override // o.J1, java.util.Map
    public void clear() {
        throw new UnsupportedOperationException("Map is fixed size");
    }

    @Override // o.J1, java.util.Map
    public Set entrySet() {
        return DB2.f(this.X.entrySet());
    }

    @Override // o.AbstractC7913m3, java.util.SortedMap
    public SortedMap headMap(Object obj) {
        return new C2890Eu0(a().headMap(obj));
    }

    @Override // o.J1, java.util.Map
    public Set keySet() {
        return DB2.f(this.X.keySet());
    }

    @Override // o.J1, java.util.Map
    public Object put(Object obj, Object obj2) {
        if (this.X.containsKey(obj)) {
            return this.X.put(obj, obj2);
        }
        throw new IllegalArgumentException("Cannot put new key/value pair - Map is fixed size");
    }

    @Override // o.J1, java.util.Map
    public void putAll(Map map) {
        for (Object obj : map.keySet()) {
            if (!map.containsKey(obj)) {
                throw new IllegalArgumentException("Cannot put new key/value pair - Map is fixed size");
            }
        }
        this.X.putAll(map);
    }

    @Override // o.InterfaceC9825tp
    public int q() {
        return size();
    }

    @Override // o.J1, java.util.Map
    public Object remove(Object obj) {
        throw new UnsupportedOperationException("Map is fixed size");
    }

    @Override // o.InterfaceC9825tp
    public boolean s() {
        return true;
    }

    @Override // o.AbstractC7913m3, java.util.SortedMap
    public SortedMap subMap(Object obj, Object obj2) {
        return new C2890Eu0(a().subMap(obj, obj2));
    }

    @Override // o.AbstractC7913m3, java.util.SortedMap
    public SortedMap tailMap(Object obj) {
        return new C2890Eu0(a().tailMap(obj));
    }

    @Override // o.J1, java.util.Map
    public Collection values() {
        return C5024aB2.e(this.X.values());
    }
}
