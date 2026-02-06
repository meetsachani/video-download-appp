package o;

import java.util.Collection;
import java.util.Map;
import java.util.Set;

/* loaded from: classes4.dex */
public class QI implements Map {
    public Map[] X;
    public a Y;

    /* loaded from: classes4.dex */
    public interface a {
        void a(QI qi, Map[] mapArr, Map map);

        Object b(QI qi, Map[] mapArr, Object obj, Object obj2);

        void c(QI qi, Map map, Map map2, Collection collection);
    }

    public QI() {
        this(new Map[0], (a) null);
    }

    public synchronized void a(Map map) throws IllegalArgumentException {
        try {
            for (int length = this.X.length - 1; length >= 0; length--) {
                Collection w = C6991iF.w(this.X[length].keySet(), map.keySet());
                if (w.size() != 0) {
                    a aVar = this.Y;
                    if (aVar != null) {
                        aVar.c(this, this.X[length], map, w);
                    } else {
                        throw new IllegalArgumentException("Key collision adding Map to CompositeMap");
                    }
                }
            }
            Map[] mapArr = this.X;
            int length2 = mapArr.length;
            Map[] mapArr2 = new Map[length2 + 1];
            System.arraycopy(mapArr, 0, mapArr2, 0, mapArr.length);
            mapArr2[length2] = map;
            this.X = mapArr2;
        } catch (Throwable th) {
            throw th;
        }
    }

    public synchronized Map b(Map map) {
        int length = this.X.length;
        for (int i = 0; i < length; i++) {
            if (this.X[i].equals(map)) {
                Map[] mapArr = new Map[length - 1];
                System.arraycopy(this.X, 0, mapArr, 0, i);
                System.arraycopy(this.X, i + 1, mapArr, i, (length - i) - 1);
                this.X = mapArr;
                return map;
            }
        }
        return null;
    }

    public void c(a aVar) {
        this.Y = aVar;
    }

    @Override // java.util.Map
    public void clear() {
        for (int length = this.X.length - 1; length >= 0; length--) {
            this.X[length].clear();
        }
    }

    @Override // java.util.Map
    public boolean containsKey(Object obj) {
        for (int length = this.X.length - 1; length >= 0; length--) {
            if (this.X[length].containsKey(obj)) {
                return true;
            }
        }
        return false;
    }

    @Override // java.util.Map
    public boolean containsValue(Object obj) {
        for (int length = this.X.length - 1; length >= 0; length--) {
            if (this.X[length].containsValue(obj)) {
                return true;
            }
        }
        return false;
    }

    @Override // java.util.Map
    public Set entrySet() {
        WI wi = new WI();
        for (int length = this.X.length - 1; length >= 0; length--) {
            wi.d(this.X[length].entrySet());
        }
        return wi;
    }

    @Override // java.util.Map
    public boolean equals(Object obj) {
        if (obj instanceof Map) {
            return entrySet().equals(((Map) obj).entrySet());
        }
        return false;
    }

    @Override // java.util.Map
    public Object get(Object obj) {
        for (int length = this.X.length - 1; length >= 0; length--) {
            if (this.X[length].containsKey(obj)) {
                return this.X[length].get(obj);
            }
        }
        return null;
    }

    @Override // java.util.Map
    public int hashCode() {
        int i = 0;
        for (Object obj : entrySet()) {
            i += obj.hashCode();
        }
        return i;
    }

    @Override // java.util.Map
    public boolean isEmpty() {
        for (int length = this.X.length - 1; length >= 0; length--) {
            if (!this.X[length].isEmpty()) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.Map
    public Set keySet() {
        WI wi = new WI();
        for (int length = this.X.length - 1; length >= 0; length--) {
            wi.d(this.X[length].keySet());
        }
        return wi;
    }

    @Override // java.util.Map
    public Object put(Object obj, Object obj2) {
        a aVar = this.Y;
        if (aVar != null) {
            return aVar.b(this, this.X, obj, obj2);
        }
        throw new UnsupportedOperationException("No mutator specified");
    }

    @Override // java.util.Map
    public void putAll(Map map) {
        a aVar = this.Y;
        if (aVar != null) {
            aVar.a(this, this.X, map);
            return;
        }
        throw new UnsupportedOperationException("No mutator specified");
    }

    @Override // java.util.Map
    public Object remove(Object obj) {
        for (int length = this.X.length - 1; length >= 0; length--) {
            if (this.X[length].containsKey(obj)) {
                return this.X[length].remove(obj);
            }
        }
        return null;
    }

    @Override // java.util.Map
    public int size() {
        int i = 0;
        for (int length = this.X.length - 1; length >= 0; length--) {
            i += this.X[length].size();
        }
        return i;
    }

    @Override // java.util.Map
    public Collection values() {
        II ii = new II();
        for (int length = this.X.length - 1; length >= 0; length--) {
            ii.d(this.X[length].values());
        }
        return ii;
    }

    public QI(Map map, Map map2) {
        this(new Map[]{map, map2}, (a) null);
    }

    public QI(Map map, Map map2, a aVar) {
        this(new Map[]{map, map2}, aVar);
    }

    public QI(Map[] mapArr) {
        this(mapArr, (a) null);
    }

    public QI(Map[] mapArr, a aVar) {
        this.Y = aVar;
        this.X = new Map[0];
        for (int length = mapArr.length - 1; length >= 0; length--) {
            a(mapArr[length]);
        }
    }
}
