package com.google.android.gms.internal.ads;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.NavigableMap;
import java.util.NavigableSet;
import java.util.Set;
import java.util.SortedMap;
import java.util.SortedSet;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class zzfwm extends zzfwp implements NavigableMap {
    public final /* synthetic */ zzfwv c1;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzfwm(zzfwv zzfwvVar, NavigableMap navigableMap) {
        super(zzfwvVar, navigableMap);
        this.c1 = zzfwvVar;
    }

    @Override // java.util.NavigableMap
    public final Map.Entry ceilingEntry(Object obj) {
        Map.Entry ceilingEntry = ((NavigableMap) ((SortedMap) this.Y0)).ceilingEntry(obj);
        if (ceilingEntry == null) {
            return null;
        }
        return c(ceilingEntry);
    }

    @Override // java.util.NavigableMap
    public final Object ceilingKey(Object obj) {
        return ((NavigableMap) ((SortedMap) this.Y0)).ceilingKey(obj);
    }

    @Override // com.google.android.gms.internal.ads.zzfwp
    public final /* synthetic */ SortedMap d() {
        return (NavigableMap) ((SortedMap) this.Y0);
    }

    @Override // java.util.NavigableMap
    public final NavigableSet descendingKeySet() {
        return (NavigableSet) super.keySet();
    }

    @Override // java.util.NavigableMap
    public final NavigableMap descendingMap() {
        return new zzfwm(this.c1, ((NavigableMap) ((SortedMap) this.Y0)).descendingMap());
    }

    @Override // com.google.android.gms.internal.ads.zzfwp
    public final /* synthetic */ SortedSet f() {
        return (NavigableSet) super.keySet();
    }

    @Override // java.util.NavigableMap
    public final Map.Entry firstEntry() {
        Map.Entry firstEntry = ((NavigableMap) ((SortedMap) this.Y0)).firstEntry();
        if (firstEntry == null) {
            return null;
        }
        return c(firstEntry);
    }

    @Override // java.util.NavigableMap
    public final Map.Entry floorEntry(Object obj) {
        Map.Entry floorEntry = ((NavigableMap) ((SortedMap) this.Y0)).floorEntry(obj);
        if (floorEntry == null) {
            return null;
        }
        return c(floorEntry);
    }

    @Override // java.util.NavigableMap
    public final Object floorKey(Object obj) {
        return ((NavigableMap) ((SortedMap) this.Y0)).floorKey(obj);
    }

    public final Map.Entry g(Iterator it) {
        if (!it.hasNext()) {
            return null;
        }
        Map.Entry entry = (Map.Entry) it.next();
        zzfwv zzfwvVar = this.c1;
        Collection h = zzfwvVar.h();
        h.addAll((Collection) entry.getValue());
        it.remove();
        return new zzfxy(entry.getKey(), zzfwvVar.i(h));
    }

    @Override // com.google.android.gms.internal.ads.zzfwp, java.util.SortedMap, java.util.NavigableMap
    public final /* synthetic */ SortedMap headMap(Object obj) {
        return headMap(obj, false);
    }

    @Override // java.util.NavigableMap
    public final Map.Entry higherEntry(Object obj) {
        Map.Entry higherEntry = ((NavigableMap) ((SortedMap) this.Y0)).higherEntry(obj);
        if (higherEntry == null) {
            return null;
        }
        return c(higherEntry);
    }

    @Override // java.util.NavigableMap
    public final Object higherKey(Object obj) {
        return ((NavigableMap) ((SortedMap) this.Y0)).higherKey(obj);
    }

    @Override // com.google.android.gms.internal.ads.zzfwp
    /* renamed from: i */
    public final NavigableSet e() {
        return new zzfwn(this.c1, (NavigableMap) ((SortedMap) this.Y0));
    }

    @Override // com.google.android.gms.internal.ads.zzfwp, com.google.android.gms.internal.ads.zzfwi, com.google.android.gms.internal.ads.zzfyy, java.util.AbstractMap, java.util.Map
    public final /* synthetic */ Set keySet() {
        return (NavigableSet) super.keySet();
    }

    @Override // java.util.NavigableMap
    public final Map.Entry lastEntry() {
        Map.Entry lastEntry = ((NavigableMap) ((SortedMap) this.Y0)).lastEntry();
        if (lastEntry == null) {
            return null;
        }
        return c(lastEntry);
    }

    @Override // java.util.NavigableMap
    public final Map.Entry lowerEntry(Object obj) {
        Map.Entry lowerEntry = ((NavigableMap) ((SortedMap) this.Y0)).lowerEntry(obj);
        if (lowerEntry == null) {
            return null;
        }
        return c(lowerEntry);
    }

    @Override // java.util.NavigableMap
    public final Object lowerKey(Object obj) {
        return ((NavigableMap) ((SortedMap) this.Y0)).lowerKey(obj);
    }

    @Override // java.util.NavigableMap
    public final NavigableSet navigableKeySet() {
        return (NavigableSet) super.keySet();
    }

    @Override // java.util.NavigableMap
    public final Map.Entry pollFirstEntry() {
        return g(entrySet().iterator());
    }

    @Override // java.util.NavigableMap
    public final Map.Entry pollLastEntry() {
        return g(descendingMap().entrySet().iterator());
    }

    @Override // com.google.android.gms.internal.ads.zzfwp, java.util.SortedMap, java.util.NavigableMap
    public final /* bridge */ /* synthetic */ SortedMap subMap(Object obj, Object obj2) {
        return subMap(obj, true, obj2, false);
    }

    @Override // com.google.android.gms.internal.ads.zzfwp, java.util.SortedMap, java.util.NavigableMap
    public final /* synthetic */ SortedMap tailMap(Object obj) {
        return tailMap(obj, true);
    }

    @Override // java.util.NavigableMap
    public final NavigableMap headMap(Object obj, boolean z) {
        return new zzfwm(this.c1, ((NavigableMap) ((SortedMap) this.Y0)).headMap(obj, z));
    }

    @Override // java.util.NavigableMap
    public final NavigableMap subMap(Object obj, boolean z, Object obj2, boolean z2) {
        return new zzfwm(this.c1, ((NavigableMap) ((SortedMap) this.Y0)).subMap(obj, z, obj2, z2));
    }

    @Override // java.util.NavigableMap
    public final NavigableMap tailMap(Object obj, boolean z) {
        return new zzfwm(this.c1, ((NavigableMap) ((SortedMap) this.Y0)).tailMap(obj, z));
    }
}
