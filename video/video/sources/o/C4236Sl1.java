package o;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;

/* renamed from: o.Sl1  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C4236Sl1 extends HashMap implements InterfaceC4925Zl1 {
    private static final long serialVersionUID = 1943563828307035349L;
    public transient Collection X;

    /* renamed from: o.Sl1$a */
    /* loaded from: classes4.dex */
    public class a implements Iterator {
        public Iterator X;
        public Iterator Y;

        public final boolean b() {
            while (true) {
                Iterator it = this.Y;
                if (it != null && it.hasNext()) {
                    return true;
                }
                if (!this.X.hasNext()) {
                    return false;
                }
                this.Y = ((Collection) this.X.next()).iterator();
            }
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return b();
        }

        @Override // java.util.Iterator
        public Object next() {
            if (b()) {
                return this.Y.next();
            }
            throw new NoSuchElementException();
        }

        @Override // java.util.Iterator
        public void remove() {
            Iterator it = this.Y;
            if (it != null) {
                it.remove();
                return;
            }
            throw new IllegalStateException();
        }

        public a() {
            this.X = C4236Sl1.this.i();
        }
    }

    /* renamed from: o.Sl1$b */
    /* loaded from: classes4.dex */
    public class b extends AbstractCollection {
        public b() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public void clear() {
            C4236Sl1.this.clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
        public Iterator iterator() {
            return new a();
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public int size() {
            Iterator it = iterator();
            int i = 0;
            while (it.hasNext()) {
                it.next();
                i++;
            }
            return i;
        }
    }

    public C4236Sl1() {
        this.X = null;
    }

    private void readObject(ObjectInputStream objectInputStream) throws IOException, ClassNotFoundException {
        String str;
        objectInputStream.defaultReadObject();
        try {
            str = System.getProperty("java.version");
        } catch (SecurityException unused) {
            str = "1.2";
        }
        if (str.startsWith("1.2") || str.startsWith("1.3")) {
            Iterator it = entrySet().iterator();
            while (it.hasNext()) {
                Map.Entry entry = (Map.Entry) it.next();
                super.put(entry.getKey(), ((Collection) entry.getValue()).iterator().next());
            }
        }
    }

    public boolean b(Object obj, Object obj2) {
        Collection d = d(obj);
        if (d == null) {
            return false;
        }
        return d.contains(obj2);
    }

    public Collection c(Collection collection) {
        if (collection == null) {
            return new ArrayList();
        }
        return new ArrayList(collection);
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public void clear() {
        for (Map.Entry entry : super.entrySet()) {
            ((Collection) entry.getValue()).clear();
        }
        super.clear();
    }

    @Override // java.util.HashMap, java.util.AbstractMap
    public Object clone() {
        C4236Sl1 c4236Sl1 = (C4236Sl1) super.clone();
        Iterator it = c4236Sl1.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            entry.setValue(c((Collection) entry.getValue()));
        }
        return c4236Sl1;
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map, o.InterfaceC4925Zl1
    public boolean containsValue(Object obj) {
        Set<Map.Entry> entrySet = super.entrySet();
        if (entrySet == null) {
            return false;
        }
        for (Map.Entry entry : entrySet) {
            if (((Collection) entry.getValue()).contains(obj)) {
                return true;
            }
        }
        return false;
    }

    public Collection d(Object obj) {
        return (Collection) get(obj);
    }

    public Iterator e(Object obj) {
        Collection d = d(obj);
        if (d == null) {
            return C4482Va0.Y;
        }
        return d.iterator();
    }

    public boolean f(Object obj, Collection collection) {
        if (collection == null || collection.size() == 0) {
            return false;
        }
        Collection d = d(obj);
        if (d == null) {
            Collection c = c(collection);
            if (c.size() == 0) {
                return false;
            }
            super.put(obj, c);
            return true;
        }
        return d.addAll(collection);
    }

    public int g(Object obj) {
        Collection d = d(obj);
        if (d == null) {
            return 0;
        }
        return d.size();
    }

    public Iterator i() {
        return super.values().iterator();
    }

    public int j() {
        int i = 0;
        for (Collection collection : super.values()) {
            i += collection.size();
        }
        return i;
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map, o.InterfaceC4925Zl1
    public Object put(Object obj, Object obj2) {
        Collection d = d(obj);
        if (d == null) {
            d = c(null);
            super.put(obj, d);
        }
        if (!d.add(obj2)) {
            return null;
        }
        return obj2;
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public void putAll(Map map) {
        if (map instanceof InterfaceC4925Zl1) {
            for (Map.Entry entry : map.entrySet()) {
                f(entry.getKey(), (Collection) entry.getValue());
            }
            return;
        }
        for (Map.Entry entry2 : map.entrySet()) {
            put(entry2.getKey(), entry2.getValue());
        }
    }

    @Override // java.util.HashMap, java.util.Map, o.InterfaceC4925Zl1
    public Object remove(Object obj, Object obj2) {
        Collection d = d(obj);
        if (d == null || !d.remove(obj2)) {
            return null;
        }
        if (d.isEmpty()) {
            remove(obj);
        }
        return obj2;
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map, o.InterfaceC4925Zl1
    public Collection values() {
        Collection collection = this.X;
        if (collection != null) {
            return collection;
        }
        b bVar = new b();
        this.X = bVar;
        return bVar;
    }

    public C4236Sl1(int i) {
        super(i);
        this.X = null;
    }

    public C4236Sl1(int i, float f) {
        super(i, f);
        this.X = null;
    }

    public C4236Sl1(Map map) {
        super((int) (map.size() * 1.4f));
        this.X = null;
        putAll(map);
    }
}
