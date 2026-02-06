package o;

import java.util.Collection;
import java.util.Map;
import java.util.Set;

/* renamed from: o.Za2  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C4882Za2 {

    /* renamed from: o.Za2$b */
    /* loaded from: classes4.dex */
    public static class b<K, V> implements WT0<K, V>, QA2 {
        public final UC0<K, V> X;

        @Override // java.util.Map, o.OK1
        public void clear() {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.Map, o.UC0
        public boolean containsKey(Object obj) {
            return this.X.containsKey(obj);
        }

        @Override // java.util.Map, o.UC0
        public boolean containsValue(Object obj) {
            return this.X.containsValue(obj);
        }

        @Override // java.util.Map, o.UC0
        public Set<Map.Entry<K, V>> entrySet() {
            return C5509cB2.i(this.X.entrySet());
        }

        @Override // java.util.Map
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if ((obj instanceof b) && ((b) obj).X.equals(this.X)) {
                return true;
            }
            return false;
        }

        @Override // java.util.Map, o.UC0
        public V get(Object obj) {
            return this.X.get(obj);
        }

        @Override // java.util.Map
        public int hashCode() {
            return this.X.hashCode() | 360074000;
        }

        @Override // java.util.Map, o.UC0
        public boolean isEmpty() {
            return this.X.isEmpty();
        }

        @Override // java.util.Map, o.UC0
        public Set<K> keySet() {
            return CB2.h(this.X.keySet());
        }

        @Override // o.VT0
        public U71<K, V> p() {
            U71<K, V> c2724Dd0;
            UC0<K, V> uc0 = this.X;
            if (uc0 instanceof VT0) {
                c2724Dd0 = ((VT0) uc0).p();
            } else {
                c2724Dd0 = new C2724Dd0(uc0.entrySet());
            }
            return C8939qB2.b(c2724Dd0);
        }

        @Override // java.util.Map, o.OK1
        public V put(K k, V v) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.Map, o.OK1
        public void putAll(Map<? extends K, ? extends V> map) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.Map, o.UC0
        public V remove(Object obj) {
            return this.X.remove(obj);
        }

        @Override // java.util.Map, o.UC0
        public int size() {
            return this.X.size();
        }

        @Override // java.util.Map, o.UC0
        public Collection<V> values() {
            return ZA2.f(this.X.values());
        }

        public b(UC0<K, V> uc0) {
            this.X = uc0;
        }
    }

    /* renamed from: o.Za2$c */
    /* loaded from: classes4.dex */
    public static class c<K, V> implements Map<K, V>, OK1<K, V> {
        public final OK1<K, V> X;

        @Override // java.util.Map, o.OK1
        public void clear() {
            this.X.clear();
        }

        @Override // java.util.Map
        public boolean containsKey(Object obj) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.Map
        public boolean containsValue(Object obj) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.Map
        public Set<Map.Entry<K, V>> entrySet() {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.Map
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if ((obj instanceof c) && ((c) obj).X.equals(this.X)) {
                return true;
            }
            return false;
        }

        @Override // java.util.Map
        public V get(Object obj) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.Map
        public int hashCode() {
            return this.X.hashCode() | 360220320;
        }

        @Override // java.util.Map
        public boolean isEmpty() {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.Map
        public Set<K> keySet() {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.Map, o.OK1
        public V put(K k, V v) {
            return (V) this.X.put(k, v);
        }

        @Override // java.util.Map, o.OK1
        public void putAll(Map<? extends K, ? extends V> map) {
            this.X.putAll(map);
        }

        @Override // java.util.Map
        public V remove(Object obj) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.Map
        public int size() {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.Map
        public Collection<V> values() {
            throw new UnsupportedOperationException();
        }

        public c(OK1<K, V> ok1) {
            this.X = ok1;
        }
    }

    public static <K, V> WT0<K, V> a(UC0<K, V> uc0) {
        if (uc0 != null) {
            if (uc0 instanceof Map) {
                if (uc0 instanceof WT0) {
                    return (WT0) uc0;
                }
                return C6224f81.R((Map) uc0);
            }
            return new b(uc0);
        }
        throw new NullPointerException("Get must not be null");
    }

    public static <K, V> Map<K, V> b(OK1<K, V> ok1) {
        if (ok1 != null) {
            if (ok1 instanceof Map) {
                return (Map) ok1;
            }
            return new c(ok1);
        }
        throw new NullPointerException("Put must not be null");
    }
}
