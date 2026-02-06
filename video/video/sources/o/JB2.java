package o;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.Collection;
import java.util.Comparator;
import java.util.Map;
import java.util.Set;
import java.util.SortedMap;

/* loaded from: classes4.dex */
public final class JB2 extends AbstractC7913m3 implements RA2, Serializable {
    private static final long serialVersionUID = 5805344239827376360L;

    public JB2(SortedMap sortedMap) {
        super(sortedMap);
    }

    public static SortedMap b(SortedMap sortedMap) {
        if (sortedMap instanceof RA2) {
            return sortedMap;
        }
        return new JB2(sortedMap);
    }

    private void readObject(ObjectInputStream objectInputStream) throws IOException, ClassNotFoundException {
        objectInputStream.defaultReadObject();
        this.X = (Map) objectInputStream.readObject();
    }

    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.defaultWriteObject();
        objectOutputStream.writeObject(this.X);
    }

    @Override // o.J1, java.util.Map
    public void clear() {
        throw new UnsupportedOperationException();
    }

    @Override // o.AbstractC7913m3, java.util.SortedMap
    public Comparator comparator() {
        return a().comparator();
    }

    @Override // o.J1, java.util.Map
    public Set entrySet() {
        return C5267bB2.f(super.entrySet());
    }

    @Override // o.AbstractC7913m3, java.util.SortedMap
    public Object firstKey() {
        return a().firstKey();
    }

    @Override // o.AbstractC7913m3, java.util.SortedMap
    public SortedMap headMap(Object obj) {
        return new JB2(a().headMap(obj));
    }

    @Override // o.J1, java.util.Map
    public Set keySet() {
        return DB2.f(super.keySet());
    }

    @Override // o.AbstractC7913m3, java.util.SortedMap
    public Object lastKey() {
        return a().lastKey();
    }

    @Override // o.J1, java.util.Map
    public Object put(Object obj, Object obj2) {
        throw new UnsupportedOperationException();
    }

    @Override // o.J1, java.util.Map
    public void putAll(Map map) {
        throw new UnsupportedOperationException();
    }

    @Override // o.J1, java.util.Map
    public Object remove(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // o.AbstractC7913m3, java.util.SortedMap
    public SortedMap subMap(Object obj, Object obj2) {
        return new JB2(a().subMap(obj, obj2));
    }

    @Override // o.AbstractC7913m3, java.util.SortedMap
    public SortedMap tailMap(Object obj) {
        return new JB2(a().tailMap(obj));
    }

    @Override // o.J1, java.util.Map
    public Collection values() {
        return C5024aB2.e(super.values());
    }
}
