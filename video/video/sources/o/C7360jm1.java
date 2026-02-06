package o;

import java.util.AbstractCollection;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* renamed from: o.jm1  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C7360jm1 extends J1 implements InterfaceC4925Zl1 {
    public static /* synthetic */ Class Y0;
    public final InterfaceC5399bk0 Y;
    public transient Collection Z;

    /* renamed from: o.jm1$a */
    /* loaded from: classes4.dex */
    public static class a implements InterfaceC5399bk0 {
        public final Class X;

        public a(Class cls) {
            this.X = cls;
        }

        @Override // o.InterfaceC5399bk0
        public Object a() {
            try {
                return this.X.newInstance();
            } catch (Exception e) {
                StringBuffer stringBuffer = new StringBuffer();
                stringBuffer.append("Cannot instantiate class: ");
                stringBuffer.append(this.X);
                throw new PB0(stringBuffer.toString(), e);
            }
        }
    }

    /* renamed from: o.jm1$b */
    /* loaded from: classes4.dex */
    public class b extends AbstractCollection {
        public b() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public void clear() {
            C7360jm1.this.clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
        public Iterator iterator() {
            C5583cU0 c5583cU0 = new C5583cU0();
            for (Object obj : C7360jm1.this.keySet()) {
                c5583cU0.b(new c(obj));
            }
            return c5583cU0;
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public int size() {
            return C7360jm1.this.l();
        }
    }

    /* renamed from: o.jm1$c */
    /* loaded from: classes4.dex */
    public class c implements Iterator {
        public final Object X;
        public final Collection Y;
        public final Iterator Z;

        public c(Object obj) {
            this.X = obj;
            Collection g = C7360jm1.this.g(obj);
            this.Y = g;
            this.Z = g.iterator();
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.Z.hasNext();
        }

        @Override // java.util.Iterator
        public Object next() {
            return this.Z.next();
        }

        @Override // java.util.Iterator
        public void remove() {
            this.Z.remove();
            if (this.Y.isEmpty()) {
                C7360jm1.this.remove(this.X);
            }
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public C7360jm1() {
        this(r0, new a(r2));
        HashMap hashMap = new HashMap();
        Class cls = Y0;
        if (cls == null) {
            cls = a("java.util.ArrayList");
            Y0 = cls;
        }
    }

    public static /* synthetic */ Class a(String str) {
        try {
            return Class.forName(str);
        } catch (ClassNotFoundException e) {
            throw new NoClassDefFoundError(e.getMessage());
        }
    }

    public static C7360jm1 d(Map map) {
        Class cls = Y0;
        if (cls == null) {
            cls = a("java.util.ArrayList");
            Y0 = cls;
        }
        return new C7360jm1(map, new a(cls));
    }

    public static C7360jm1 e(Map map, Class cls) {
        return new C7360jm1(map, new a(cls));
    }

    public static C7360jm1 f(Map map, InterfaceC5399bk0 interfaceC5399bk0) {
        return new C7360jm1(map, interfaceC5399bk0);
    }

    public boolean b(Object obj, Object obj2) {
        Collection g = g(obj);
        if (g == null) {
            return false;
        }
        return g.contains(obj2);
    }

    public Collection c(int i) {
        return (Collection) this.Y.a();
    }

    @Override // o.J1, java.util.Map
    public void clear() {
        V().clear();
    }

    @Override // o.J1, java.util.Map
    public boolean containsValue(Object obj) {
        Set<Map.Entry> entrySet = V().entrySet();
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

    public Collection g(Object obj) {
        return (Collection) V().get(obj);
    }

    public Iterator i(Object obj) {
        if (!containsKey(obj)) {
            return C4482Va0.Y;
        }
        return new c(obj);
    }

    public boolean j(Object obj, Collection collection) {
        if (collection == null || collection.size() == 0) {
            return false;
        }
        Collection g = g(obj);
        if (g == null) {
            Collection c2 = c(collection.size());
            c2.addAll(collection);
            if (c2.size() <= 0) {
                return false;
            }
            V().put(obj, c2);
            return true;
        }
        return g.addAll(collection);
    }

    public int k(Object obj) {
        Collection g = g(obj);
        if (g == null) {
            return 0;
        }
        return g.size();
    }

    public int l() {
        int i = 0;
        for (Collection collection : V().values()) {
            i += collection.size();
        }
        return i;
    }

    @Override // o.J1, java.util.Map
    public Object put(Object obj, Object obj2) {
        boolean add;
        Collection g = g(obj);
        if (g == null) {
            add = true;
            Collection c2 = c(1);
            boolean add2 = c2.add(obj2);
            if (c2.size() > 0) {
                V().put(obj, c2);
            } else {
                add = add2;
            }
        } else {
            add = g.add(obj2);
        }
        if (add) {
            return obj2;
        }
        return null;
    }

    @Override // o.J1, java.util.Map
    public void putAll(Map map) {
        if (map instanceof InterfaceC4925Zl1) {
            for (Map.Entry entry : map.entrySet()) {
                j(entry.getKey(), (Collection) entry.getValue());
            }
            return;
        }
        for (Map.Entry entry2 : map.entrySet()) {
            put(entry2.getKey(), entry2.getValue());
        }
    }

    @Override // java.util.Map, o.InterfaceC4925Zl1
    public Object remove(Object obj, Object obj2) {
        Collection g = g(obj);
        if (g == null || !g.remove(obj2)) {
            return null;
        }
        if (g.isEmpty()) {
            remove(obj);
        }
        return obj2;
    }

    @Override // o.J1, java.util.Map
    public Collection values() {
        Collection collection = this.Z;
        if (collection != null) {
            return collection;
        }
        b bVar = new b();
        this.Z = bVar;
        return bVar;
    }

    public C7360jm1(Map map, InterfaceC5399bk0 interfaceC5399bk0) {
        super(map);
        if (interfaceC5399bk0 != null) {
            this.Y = interfaceC5399bk0;
            return;
        }
        throw new IllegalArgumentException("The factory must not be null");
    }
}
