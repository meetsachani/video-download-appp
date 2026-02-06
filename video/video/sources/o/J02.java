package o;

import java.util.AbstractSet;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import o.K02;

/* loaded from: classes4.dex */
public class J02 extends AbstractSet {
    public final /* synthetic */ K02 X;

    public J02(K02 k02) {
        this.X = k02;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public void clear() {
        this.X.clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean contains(Object obj) {
        if (d(obj) != null) {
            return true;
        }
        return false;
    }

    public final K02.a d(Object obj) {
        HashMap hashMap;
        if (obj == null || !(obj instanceof Map.Entry)) {
            return null;
        }
        Map.Entry entry = (Map.Entry) obj;
        hashMap = this.X.Y;
        K02.a aVar = (K02.a) hashMap.get(entry.getKey());
        if (aVar == null || !aVar.equals(entry)) {
            return null;
        }
        return aVar;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean isEmpty() {
        return this.X.isEmpty();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public Iterator iterator() {
        return new K02.b(2);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean remove(Object obj) {
        K02.a d = d(obj);
        if (d == null || this.X.z(d.getKey()) == null) {
            return false;
        }
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public int size() {
        return this.X.size();
    }
}
