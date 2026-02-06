package com.google.android.gms.internal.ads;

import java.io.Serializable;
import java.util.Map;
import java.util.Set;
import o.C6566gU0;

/* loaded from: classes2.dex */
public abstract class zzfyf implements Map, Serializable {
    public transient zzfyh X;
    public transient zzfyh Y;
    public transient zzfxx Z;

    public static zzfyf c(Map map) {
        int i;
        Set entrySet = map.entrySet();
        if (entrySet != null) {
            i = entrySet.size();
        } else {
            i = 4;
        }
        zzfye zzfyeVar = new zzfye(i);
        zzfyeVar.b(entrySet);
        return zzfyeVar.c();
    }

    public static zzfyf d() {
        return zzfzt.b1;
    }

    public static zzfyf e(Object obj, Object obj2) {
        zzfwz.b("dialog_not_shown_reason", obj2);
        return zzfzt.k(1, new Object[]{"dialog_not_shown_reason", obj2}, null);
    }

    public abstract zzfxx a();

    @Override // java.util.Map
    /* renamed from: b */
    public final zzfxx values() {
        zzfxx zzfxxVar = this.Z;
        if (zzfxxVar == null) {
            zzfxx a = a();
            this.Z = a;
            return a;
        }
        return zzfxxVar;
    }

    @Override // java.util.Map
    @Deprecated
    public final void clear() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map
    public final boolean containsKey(Object obj) {
        if (get(obj) != null) {
            return true;
        }
        return false;
    }

    @Override // java.util.Map
    public final boolean containsValue(Object obj) {
        return values().contains(obj);
    }

    @Override // java.util.Map
    public final boolean equals(Object obj) {
        return zzfyz.b(this, obj);
    }

    public abstract zzfyh f();

    public abstract zzfyh g();

    @Override // java.util.Map
    public abstract Object get(Object obj);

    @Override // java.util.Map
    public final Object getOrDefault(Object obj, Object obj2) {
        Object obj3 = get(obj);
        if (obj3 != null) {
            return obj3;
        }
        return obj2;
    }

    @Override // java.util.Map
    public final int hashCode() {
        return zzgae.a(entrySet());
    }

    @Override // java.util.Map
    /* renamed from: i */
    public final zzfyh entrySet() {
        zzfyh zzfyhVar = this.X;
        if (zzfyhVar == null) {
            zzfyh f = f();
            this.X = f;
            return f;
        }
        return zzfyhVar;
    }

    @Override // java.util.Map
    public final boolean isEmpty() {
        return size() == 0;
    }

    @Override // java.util.Map
    /* renamed from: j */
    public final zzfyh keySet() {
        zzfyh zzfyhVar = this.Y;
        if (zzfyhVar == null) {
            zzfyh g = g();
            this.Y = g;
            return g;
        }
        return zzfyhVar;
    }

    @Override // java.util.Map
    @Deprecated
    public final Object put(Object obj, Object obj2) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map
    @Deprecated
    public final void putAll(Map map) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map
    @Deprecated
    public final Object remove(Object obj) {
        throw new UnsupportedOperationException();
    }

    public final String toString() {
        int size = size();
        zzfwz.a(size, "size");
        StringBuilder sb = new StringBuilder((int) Math.min(size * 8, 1073741824L));
        sb.append('{');
        boolean z = true;
        for (Map.Entry entry : entrySet()) {
            if (!z) {
                sb.append(C6566gU0.h);
            }
            sb.append(entry.getKey());
            sb.append('=');
            sb.append(entry.getValue());
            z = false;
        }
        sb.append('}');
        return sb.toString();
    }
}
