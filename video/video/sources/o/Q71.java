package o;

import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import o.C9740tS0;

/* loaded from: classes.dex */
public final class Q71<K, V> extends LinkedHashMap<K, V> {
    public static final Q71 Y;
    public boolean X;

    static {
        Q71 q71 = new Q71();
        Y = q71;
        q71.m();
    }

    public Q71() {
        this.X = true;
    }

    public static <K, V> int b(Map<K, V> map) {
        int i = 0;
        for (Map.Entry<K, V> entry : map.entrySet()) {
            i += c(entry.getValue()) ^ c(entry.getKey());
        }
        return i;
    }

    public static int c(Object obj) {
        if (obj instanceof byte[]) {
            return C9740tS0.m((byte[]) obj);
        }
        if (!(obj instanceof C9740tS0.c)) {
            return obj.hashCode();
        }
        throw new UnsupportedOperationException();
    }

    public static void d(Map<?, ?> map) {
        for (Object obj : map.keySet()) {
            C9740tS0.d(obj);
            C9740tS0.d(map.get(obj));
        }
    }

    public static Object e(Object obj) {
        if (obj instanceof byte[]) {
            byte[] bArr = (byte[]) obj;
            return Arrays.copyOf(bArr, bArr.length);
        }
        return obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static <K, V> Map<K, V> f(Map<K, V> map) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry<K, V> entry : map.entrySet()) {
            linkedHashMap.put(entry.getKey(), e(entry.getValue()));
        }
        return linkedHashMap;
    }

    public static <K, V> Q71<K, V> g() {
        return Y;
    }

    public static boolean j(Object obj, Object obj2) {
        if ((obj instanceof byte[]) && (obj2 instanceof byte[])) {
            return Arrays.equals((byte[]) obj, (byte[]) obj2);
        }
        return obj.equals(obj2);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x001e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static <K, V> boolean k(Map<K, V> map, Map<K, V> map2) {
        if (map == map2) {
            return true;
        }
        if (map.size() != map2.size()) {
            return false;
        }
        for (Map.Entry<K, V> entry : map.entrySet()) {
            if (!map2.containsKey(entry.getKey()) || !j(entry.getValue(), map2.get(entry.getKey()))) {
                return false;
            }
            while (r4.hasNext()) {
            }
        }
        return true;
    }

    @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
    public void clear() {
        i();
        super.clear();
    }

    @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
    public Set<Map.Entry<K, V>> entrySet() {
        if (isEmpty()) {
            return Collections.EMPTY_SET;
        }
        return super.entrySet();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public boolean equals(Object obj) {
        if ((obj instanceof Map) && k(this, (Map) obj)) {
            return true;
        }
        return false;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public int hashCode() {
        return b(this);
    }

    public final void i() {
        if (l()) {
            return;
        }
        throw new UnsupportedOperationException();
    }

    public boolean l() {
        return this.X;
    }

    public void m() {
        this.X = false;
    }

    public void n(Q71<K, V> q71) {
        i();
        if (!q71.isEmpty()) {
            putAll(q71);
        }
    }

    public Q71<K, V> o() {
        if (isEmpty()) {
            return new Q71<>();
        }
        return new Q71<>(this);
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public V put(K k, V v) {
        i();
        C9740tS0.d(k);
        C9740tS0.d(v);
        return (V) super.put(k, v);
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public void putAll(Map<? extends K, ? extends V> map) {
        i();
        d(map);
        super.putAll(map);
    }

    public V r(Map.Entry<K, V> entry) {
        return put(entry.getKey(), entry.getValue());
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public V remove(Object obj) {
        i();
        return (V) super.remove(obj);
    }

    public Q71(Map<K, V> map) {
        super(map);
        this.X = true;
    }
}
