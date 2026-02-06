package o;

import java.beans.PropertyDescriptor;
import java.lang.ref.Reference;
import java.lang.ref.SoftReference;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.WeakHashMap;

/* loaded from: classes4.dex */
public class BN2 implements B80 {
    public static final C9715tM<Map<c, BN2>> d1 = new a();
    @Deprecated
    public static HashMap<Object, Object> e1 = new b();
    public String X;
    public Reference<Class<?>> Y;
    public final NJ1 Z;
    @Deprecated
    public Class<?> Y0 = null;
    public PropertyDescriptor[] Z0 = null;
    public HashMap<String, PropertyDescriptor> a1 = new HashMap<>();
    public C80[] b1 = null;
    public HashMap<String, C80> c1 = new HashMap<>();

    /* loaded from: classes4.dex */
    public static class a extends C9715tM<Map<c, BN2>> {
        @Override // o.C9715tM
        /* renamed from: f */
        public Map<c, BN2> b() {
            return new WeakHashMap();
        }
    }

    /* loaded from: classes4.dex */
    public static class b extends HashMap<Object, Object> {
        @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
        public void clear() {
            BN2.c().clear();
        }

        @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
        public boolean containsKey(Object obj) {
            return BN2.c().containsKey(obj);
        }

        @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
        public boolean containsValue(Object obj) {
            return BN2.c().containsValue(obj);
        }

        @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
        public Set<Map.Entry<Object, Object>> entrySet() {
            return BN2.c().entrySet();
        }

        @Override // java.util.AbstractMap, java.util.Map
        public boolean equals(Object obj) {
            return BN2.c().equals(obj);
        }

        @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
        public Object get(Object obj) {
            return BN2.c().get(obj);
        }

        @Override // java.util.AbstractMap, java.util.Map
        public int hashCode() {
            return BN2.c().hashCode();
        }

        @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
        public boolean isEmpty() {
            return BN2.c().isEmpty();
        }

        @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
        public Set<Object> keySet() {
            HashSet hashSet = new HashSet();
            for (c cVar : BN2.d().keySet()) {
                hashSet.add(cVar.a);
            }
            return hashSet;
        }

        @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
        public Object put(Object obj, Object obj2) {
            return BN2.d().put(new c((Class) obj, NJ1.h()), (BN2) obj2);
        }

        @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
        public void putAll(Map<? extends Object, ? extends Object> map) {
            for (Map.Entry<? extends Object, ? extends Object> entry : map.entrySet()) {
                put(entry.getKey(), entry.getValue());
            }
        }

        @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
        public Object remove(Object obj) {
            return BN2.c().remove(obj);
        }

        @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
        public int size() {
            return BN2.c().size();
        }

        @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
        public Collection<Object> values() {
            return BN2.c().values();
        }
    }

    /* loaded from: classes4.dex */
    public static class c {
        public final Class<?> a;
        public final NJ1 b;

        public c(Class<?> cls, NJ1 nj1) {
            this.a = cls;
            this.b = nj1;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            if (this.a.equals(cVar.a) && this.b.equals(cVar.b)) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            return (this.b.hashCode() * 31) + (this.a.hashCode() * 31) + 17;
        }
    }

    public BN2(Class<?> cls, NJ1 nj1) {
        this.X = null;
        this.Y = null;
        this.Y = new SoftReference(cls);
        this.X = cls.getName();
        this.Z = nj1;
        r();
    }

    public static /* synthetic */ Map c() {
        return m();
    }

    public static /* synthetic */ Map d() {
        return k();
    }

    public static void f() {
        k().clear();
    }

    public static BN2 g(Class<?> cls) {
        return h(cls, null);
    }

    public static BN2 h(Class<?> cls, NJ1 nj1) {
        if (nj1 == null) {
            nj1 = NJ1.h();
        }
        c cVar = new c(cls, nj1);
        BN2 bn2 = k().get(cVar);
        if (bn2 == null) {
            BN2 bn22 = new BN2(cls, nj1);
            k().put(cVar, bn22);
            return bn22;
        }
        return bn2;
    }

    public static Map<c, BN2> k() {
        return d1.a();
    }

    public static Map<Object, Object> m() {
        return d1.a();
    }

    @Override // o.B80
    public InterfaceC10878y80 b() throws IllegalAccessException, InstantiationException {
        return new AN2(j().newInstance());
    }

    @Override // o.B80
    public C80[] e() {
        return this.b1;
    }

    @Override // o.B80
    public String getName() {
        return this.X;
    }

    public Class<?> j() {
        return this.Y.get();
    }

    public PropertyDescriptor o(String str) {
        return this.a1.get(str);
    }

    @Override // o.B80
    public C80 p(String str) {
        if (str != null) {
            return this.c1.get(str);
        }
        throw new IllegalArgumentException("No property name specified");
    }

    public NJ1 q() {
        return this.Z;
    }

    public void r() {
        Class<?> j = j();
        PropertyDescriptor[] q = q().q(j);
        if (q == null) {
            q = new PropertyDescriptor[0];
        }
        Map j2 = MJ1.j(j);
        if (j2 == null) {
            j2 = new HashMap();
        }
        this.b1 = new C80[q.length + j2.size()];
        for (int i = 0; i < q.length; i++) {
            this.a1.put(q[i].getName(), q[i]);
            this.b1[i] = new C80(q[i].getName(), q[i].getPropertyType());
            this.c1.put(this.b1[i].b(), this.b1[i]);
        }
        int length = q.length;
        for (String str : j2.keySet()) {
            this.b1[length] = new C80(((PropertyDescriptor) j2.get(str)).getName(), Map.class);
            this.c1.put(this.b1[length].b(), this.b1[length]);
            length++;
        }
    }
}
