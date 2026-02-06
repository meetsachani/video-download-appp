package com.google.android.gms.internal.ads;

import java.util.Collection;
import java.util.Map;
import java.util.Set;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public class zzfwi extends zzfyy {
    public final transient Map Y0;
    public final /* synthetic */ zzfwv Z0;

    public zzfwi(zzfwv zzfwvVar, Map map) {
        this.Z0 = zzfwvVar;
        this.Y0 = map;
    }

    @Override // com.google.android.gms.internal.ads.zzfyy
    public final Set a() {
        return new zzfwg(this);
    }

    public final Map.Entry c(Map.Entry entry) {
        Object key = entry.getKey();
        return new zzfxy(key, this.Z0.j(key, (Collection) entry.getValue()));
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void clear() {
        Map map;
        zzfwv zzfwvVar = this.Z0;
        Map map2 = this.Y0;
        map = zzfwvVar.Y0;
        if (map2 == map) {
            zzfwvVar.o();
        } else {
            zzfym.b(new zzfwh(this));
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsKey(Object obj) {
        Map map = this.Y0;
        map.getClass();
        try {
            return map.containsKey(obj);
        } catch (ClassCastException | NullPointerException unused) {
            return false;
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean equals(Object obj) {
        if (this != obj && !this.Y0.equals(obj)) {
            return false;
        }
        return true;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final /* bridge */ /* synthetic */ Object get(Object obj) {
        Collection collection = (Collection) zzfyz.a(this.Y0, obj);
        if (collection == null) {
            return null;
        }
        return this.Z0.j(obj, collection);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int hashCode() {
        return this.Y0.hashCode();
    }

    @Override // com.google.android.gms.internal.ads.zzfyy, java.util.AbstractMap, java.util.Map
    public Set keySet() {
        return this.Z0.g();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final /* bridge */ /* synthetic */ Object remove(Object obj) {
        int i;
        Collection collection = (Collection) this.Y0.remove(obj);
        if (collection == null) {
            return null;
        }
        zzfwv zzfwvVar = this.Z0;
        Collection h = zzfwvVar.h();
        h.addAll(collection);
        i = zzfwvVar.Z0;
        zzfwvVar.Z0 = i - collection.size();
        collection.clear();
        return h;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int size() {
        return this.Y0.size();
    }

    @Override // java.util.AbstractMap
    public final String toString() {
        return this.Y0.toString();
    }
}
