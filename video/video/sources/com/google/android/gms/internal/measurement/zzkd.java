package com.google.android.gms.internal.measurement;

import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/* loaded from: classes3.dex */
public final class zzkd<K, V> extends LinkedHashMap<K, V> {
    public static final zzkd<?, ?> Y;
    public boolean X;

    static {
        zzkd<?, ?> zzkdVar = new zzkd<>();
        Y = zzkdVar;
        zzkdVar.X = false;
    }

    private zzkd() {
        this.X = true;
    }

    public static int b(Object obj) {
        if (obj instanceof byte[]) {
            return zziz.d((byte[]) obj);
        }
        if (!(obj instanceof zzjc)) {
            return obj.hashCode();
        }
        throw new UnsupportedOperationException();
    }

    public static <K, V> zzkd<K, V> c() {
        return (zzkd<K, V>) Y;
    }

    @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final void clear() {
        i();
        super.clear();
    }

    public final void d(zzkd<K, V> zzkdVar) {
        i();
        if (!zzkdVar.isEmpty()) {
            putAll(zzkdVar);
        }
    }

    public final zzkd<K, V> e() {
        if (isEmpty()) {
            return new zzkd<>();
        }
        return new zzkd<>(this);
    }

    @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final Set<Map.Entry<K, V>> entrySet() {
        if (isEmpty()) {
            return Collections.EMPTY_SET;
        }
        return super.entrySet();
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x005c A[RETURN] */
    @Override // java.util.AbstractMap, java.util.Map
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean equals(Object obj) {
        boolean z;
        boolean equals;
        if (obj instanceof Map) {
            Map map = (Map) obj;
            if (this != map) {
                if (size() == map.size()) {
                    for (Map.Entry<K, V> entry : entrySet()) {
                        if (map.containsKey(entry.getKey())) {
                            V value = entry.getValue();
                            Object obj2 = map.get(entry.getKey());
                            if ((value instanceof byte[]) && (obj2 instanceof byte[])) {
                                equals = Arrays.equals((byte[]) value, (byte[]) obj2);
                                continue;
                            } else {
                                equals = value.equals(obj2);
                                continue;
                            }
                            if (!equals) {
                            }
                        }
                    }
                }
                z = false;
                if (!z) {
                    return true;
                }
            }
            z = true;
            if (!z) {
            }
        }
        return false;
    }

    public final void f() {
        this.X = false;
    }

    public final boolean g() {
        return this.X;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int hashCode() {
        int i = 0;
        for (Map.Entry<K, V> entry : entrySet()) {
            i += b(entry.getValue()) ^ b(entry.getKey());
        }
        return i;
    }

    public final void i() {
        if (this.X) {
            return;
        }
        throw new UnsupportedOperationException();
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final V put(K k, V v) {
        i();
        zziz.e(k);
        zziz.e(v);
        return (V) super.put(k, v);
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final void putAll(Map<? extends K, ? extends V> map) {
        i();
        for (K k : map.keySet()) {
            zziz.e(k);
            zziz.e(map.get(k));
        }
        super.putAll(map);
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final V remove(Object obj) {
        i();
        return (V) super.remove(obj);
    }

    public zzkd(Map<K, V> map) {
        super(map);
        this.X = true;
    }
}
