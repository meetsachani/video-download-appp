package com.google.android.gms.internal.ads;

import java.util.Collection;
import java.util.Map;
import java.util.Set;

/* loaded from: classes2.dex */
public abstract class zzfxs extends zzfxt implements Map {
    @Override // java.util.Map
    public final void clear() {
        g().clear();
    }

    @Override // java.util.Map
    public boolean containsKey(Object obj) {
        return g().containsKey(obj);
    }

    @Override // java.util.Map
    public boolean containsValue(Object obj) {
        return g().containsValue(obj);
    }

    @Override // com.google.android.gms.internal.ads.zzfxt
    public /* bridge */ /* synthetic */ Object e() {
        throw null;
    }

    @Override // java.util.Map
    public Set entrySet() {
        return g().entrySet();
    }

    @Override // java.util.Map
    public boolean equals(Object obj) {
        if (obj != this && !g().equals(obj)) {
            return false;
        }
        return true;
    }

    public abstract Map g();

    @Override // java.util.Map
    public Object get(Object obj) {
        return g().get(obj);
    }

    @Override // java.util.Map
    public int hashCode() {
        return g().hashCode();
    }

    public final int i() {
        return zzgae.a(entrySet());
    }

    @Override // java.util.Map
    public boolean isEmpty() {
        return g().isEmpty();
    }

    public final boolean j(Object obj) {
        zzfyu zzfyuVar = new zzfyu(entrySet().iterator());
        if (obj == null) {
            while (zzfyuVar.hasNext()) {
                if (zzfyuVar.next() == null) {
                    return true;
                }
            }
            return false;
        }
        while (zzfyuVar.hasNext()) {
            if (obj.equals(zzfyuVar.next())) {
                return true;
            }
        }
        return false;
    }

    @Override // java.util.Map
    public Set keySet() {
        return g().keySet();
    }

    public final boolean l(Object obj) {
        return zzfyz.b(this, obj);
    }

    @Override // java.util.Map
    public final Object put(Object obj, Object obj2) {
        return g().put(obj, obj2);
    }

    @Override // java.util.Map
    public final void putAll(Map map) {
        g().putAll(map);
    }

    @Override // java.util.Map
    public final Object remove(Object obj) {
        return g().remove(obj);
    }

    @Override // java.util.Map
    public int size() {
        return g().size();
    }

    @Override // java.util.Map
    public final Collection values() {
        return g().values();
    }
}
