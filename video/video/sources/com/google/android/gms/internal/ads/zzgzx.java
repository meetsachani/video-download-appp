package com.google.android.gms.internal.ads;

import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/* loaded from: classes2.dex */
public final class zzgzx extends LinkedHashMap {
    public static final zzgzx Y;
    public boolean X;

    static {
        zzgzx zzgzxVar = new zzgzx();
        Y = zzgzxVar;
        zzgzxVar.X = false;
    }

    private zzgzx() {
        this.X = true;
    }

    public static zzgzx b() {
        return Y;
    }

    public static int g(Object obj) {
        if (obj instanceof byte[]) {
            byte[] bArr = (byte[]) obj;
            byte[] bArr2 = zzgzf.b;
            int length = bArr.length;
            int b = zzgzf.b(length, bArr, 0, length);
            if (b == 0) {
                return 1;
            }
            return b;
        } else if (!(obj instanceof zzgyw)) {
            return obj.hashCode();
        } else {
            throw new UnsupportedOperationException();
        }
    }

    public final zzgzx c() {
        if (isEmpty()) {
            return new zzgzx();
        }
        return new zzgzx(this);
    }

    @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final void clear() {
        i();
        super.clear();
    }

    public final void d() {
        this.X = false;
    }

    public final void e(zzgzx zzgzxVar) {
        i();
        if (!zzgzxVar.isEmpty()) {
            putAll(zzgzxVar);
        }
    }

    @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final Set entrySet() {
        if (isEmpty()) {
            return Collections.EMPTY_SET;
        }
        return super.entrySet();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean equals(Object obj) {
        boolean equals;
        if (obj instanceof Map) {
            Map map = (Map) obj;
            if (this != map) {
                if (size() == map.size()) {
                    Iterator it = entrySet().iterator();
                    while (it.hasNext()) {
                        Map.Entry entry = (Map.Entry) it.next();
                        if (map.containsKey(entry.getKey())) {
                            Object value = entry.getValue();
                            Object obj2 = map.get(entry.getKey());
                            if ((value instanceof byte[]) && (obj2 instanceof byte[])) {
                                equals = Arrays.equals((byte[]) value, (byte[]) obj2);
                                continue;
                            } else {
                                equals = value.equals(obj2);
                                continue;
                            }
                            if (!equals) {
                                return false;
                            }
                        } else {
                            return false;
                        }
                    }
                    return true;
                }
                return false;
            }
            return true;
        }
        return false;
    }

    public final boolean f() {
        return this.X;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int hashCode() {
        Iterator it = entrySet().iterator();
        int i = 0;
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            i += g(entry.getValue()) ^ g(entry.getKey());
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
    public final Object put(Object obj, Object obj2) {
        i();
        byte[] bArr = zzgzf.b;
        obj.getClass();
        obj2.getClass();
        return super.put(obj, obj2);
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final void putAll(Map map) {
        i();
        for (Object obj : map.keySet()) {
            byte[] bArr = zzgzf.b;
            obj.getClass();
            map.get(obj).getClass();
        }
        super.putAll(map);
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final Object remove(Object obj) {
        i();
        return super.remove(obj);
    }

    public zzgzx(Map map) {
        super(map);
        this.X = true;
    }
}
