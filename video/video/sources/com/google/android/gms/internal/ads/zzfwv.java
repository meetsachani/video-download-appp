package com.google.android.gms.internal.ads;

import java.io.Serializable;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.NavigableMap;
import java.util.RandomAccess;
import java.util.Set;
import java.util.SortedMap;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public abstract class zzfwv extends zzfwy implements Serializable {
    public final transient Map Y0;
    public transient int Z0;

    public zzfwv(Map map) {
        zzfvc.e(map.isEmpty());
        this.Y0 = map;
    }

    public static /* bridge */ /* synthetic */ void r(zzfwv zzfwvVar, Object obj) {
        Object obj2;
        try {
            obj2 = zzfwvVar.Y0.remove(obj);
        } catch (ClassCastException | NullPointerException unused) {
            obj2 = null;
        }
        Collection collection = (Collection) obj2;
        if (collection != null) {
            int size = collection.size();
            collection.clear();
            zzfwvVar.Z0 -= size;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzfwy, com.google.android.gms.internal.ads.zzfza
    public final boolean a(Object obj, Object obj2) {
        Map map = this.Y0;
        Collection collection = (Collection) map.get(obj);
        if (collection == null) {
            Collection h = h();
            if (h.add(obj2)) {
                this.Z0++;
                map.put(obj, h);
                return true;
            }
            throw new AssertionError("New Collection violated the Collection spec");
        } else if (collection.add(obj2)) {
            this.Z0++;
            return true;
        } else {
            return false;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzfwy
    public final Collection b() {
        return new zzfwx(this);
    }

    @Override // com.google.android.gms.internal.ads.zzfwy
    public final Iterator c() {
        return new zzfwf(this);
    }

    @Override // com.google.android.gms.internal.ads.zzfza
    public final int d() {
        return this.Z0;
    }

    @Override // com.google.android.gms.internal.ads.zzfwy
    public Map e() {
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzfwy
    public Set f() {
        throw null;
    }

    public abstract Collection h();

    public Collection i(Collection collection) {
        throw null;
    }

    public Collection j(Object obj, Collection collection) {
        throw null;
    }

    public final List l(Object obj, List list, zzfws zzfwsVar) {
        if (list instanceof RandomAccess) {
            return new zzfwo(this, obj, list, zzfwsVar);
        }
        return new zzfwu(this, obj, list, zzfwsVar);
    }

    public final Map n() {
        Map map = this.Y0;
        if (map instanceof NavigableMap) {
            return new zzfwm(this, (NavigableMap) map);
        }
        if (map instanceof SortedMap) {
            return new zzfwp(this, (SortedMap) map);
        }
        return new zzfwi(this, map);
    }

    @Override // com.google.android.gms.internal.ads.zzfza
    public final void o() {
        Map map = this.Y0;
        for (Collection collection : map.values()) {
            collection.clear();
        }
        map.clear();
        this.Z0 = 0;
    }

    public final Set p() {
        Map map = this.Y0;
        if (map instanceof NavigableMap) {
            return new zzfwn(this, (NavigableMap) map);
        }
        if (map instanceof SortedMap) {
            return new zzfwq(this, (SortedMap) map);
        }
        return new zzfwl(this, map);
    }
}
