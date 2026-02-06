package o;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/* renamed from: o.el  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC6129el<K> implements Map<K, Object> {
    public final InterfaceC10878y80 X;
    public final boolean Y;
    public transient Set<K> Z;

    /* renamed from: o.el$a */
    /* loaded from: classes4.dex */
    public static class a<K> implements Map.Entry<K, Object> {
        public final K X;
        public final Object Y;

        public a(K k, Object obj) {
            this.X = k;
            this.Y = obj;
        }

        @Override // java.util.Map.Entry
        public boolean equals(Object obj) {
            if (!(obj instanceof Map.Entry)) {
                return false;
            }
            Map.Entry entry = (Map.Entry) obj;
            if (this.X.equals(entry.getKey())) {
                Object obj2 = this.Y;
                if (obj2 == null) {
                    if (entry.getValue() == null) {
                        return true;
                    }
                } else if (obj2.equals(entry.getValue())) {
                    return true;
                }
            }
            return false;
        }

        @Override // java.util.Map.Entry
        public K getKey() {
            return this.X;
        }

        @Override // java.util.Map.Entry
        public Object getValue() {
            return this.Y;
        }

        @Override // java.util.Map.Entry
        public int hashCode() {
            int hashCode;
            int hashCode2 = this.X.hashCode();
            Object obj = this.Y;
            if (obj == null) {
                hashCode = 0;
            } else {
                hashCode = obj.hashCode();
            }
            return hashCode2 + hashCode;
        }

        @Override // java.util.Map.Entry
        public Object setValue(Object obj) {
            throw new UnsupportedOperationException();
        }
    }

    public AbstractC6129el(InterfaceC10878y80 interfaceC10878y80) {
        this(interfaceC10878y80, true);
    }

    public abstract K a(String str);

    public InterfaceC10878y80 b() {
        return this.X;
    }

    public final C80[] c() {
        return b().d().e();
    }

    @Override // java.util.Map
    public void clear() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map
    public boolean containsKey(Object obj) {
        if (b().d().p(e(obj)) == null) {
            return false;
        }
        return true;
    }

    @Override // java.util.Map
    public boolean containsValue(Object obj) {
        for (C80 c80 : c()) {
            Object m = b().m(c80.b());
            if (obj == null) {
                if (m == null) {
                    return true;
                }
            } else if (obj.equals(m)) {
                return true;
            }
        }
        return false;
    }

    public boolean d() {
        return this.Y;
    }

    public final String e(Object obj) {
        if (obj == null) {
            return null;
        }
        return obj.toString();
    }

    @Override // java.util.Map
    public Set<Map.Entry<K, Object>> entrySet() {
        C80[] c = c();
        HashSet hashSet = new HashSet(c.length);
        for (C80 c80 : c) {
            hashSet.add(new a(a(c80.b()), b().m(c80.b())));
        }
        return Collections.unmodifiableSet(hashSet);
    }

    @Override // java.util.Map
    public Object get(Object obj) {
        return b().m(e(obj));
    }

    @Override // java.util.Map
    public boolean isEmpty() {
        if (c().length == 0) {
            return true;
        }
        return false;
    }

    @Override // java.util.Map
    public Set<K> keySet() {
        Set<K> set = this.Z;
        if (set != null) {
            return set;
        }
        C80[] c = c();
        HashSet hashSet = new HashSet(c.length);
        for (C80 c80 : c) {
            hashSet.add(a(c80.b()));
        }
        Set<K> unmodifiableSet = Collections.unmodifiableSet(hashSet);
        if (!(b().d() instanceof InterfaceC4240Sm1)) {
            this.Z = unmodifiableSet;
        }
        return unmodifiableSet;
    }

    @Override // java.util.Map
    public Object put(K k, Object obj) {
        if (!d()) {
            String e = e(k);
            Object m = b().m(e);
            b().k(e, obj);
            return m;
        }
        throw new UnsupportedOperationException("Map is read only");
    }

    @Override // java.util.Map
    public void putAll(Map<? extends K, ? extends Object> map) {
        if (!d()) {
            for (Map.Entry<? extends K, ? extends Object> entry : map.entrySet()) {
                put(entry.getKey(), entry.getValue());
            }
            return;
        }
        throw new UnsupportedOperationException("Map is read only");
    }

    @Override // java.util.Map
    public Object remove(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map
    public int size() {
        return c().length;
    }

    @Override // java.util.Map
    public Collection<Object> values() {
        C80[] c = c();
        ArrayList arrayList = new ArrayList(c.length);
        for (C80 c80 : c) {
            arrayList.add(b().m(c80.b()));
        }
        return Collections.unmodifiableList(arrayList);
    }

    public AbstractC6129el(InterfaceC10878y80 interfaceC10878y80, boolean z) {
        if (interfaceC10878y80 != null) {
            this.X = interfaceC10878y80;
            this.Y = z;
            return;
        }
        throw new IllegalArgumentException("DynaBean is null");
    }
}
