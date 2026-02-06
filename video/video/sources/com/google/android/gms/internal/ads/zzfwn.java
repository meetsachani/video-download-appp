package com.google.android.gms.internal.ads;

import java.util.Iterator;
import java.util.NavigableMap;
import java.util.NavigableSet;
import java.util.SortedMap;
import java.util.SortedSet;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class zzfwn extends zzfwq implements NavigableSet {
    public final /* synthetic */ zzfwv Y0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzfwn(zzfwv zzfwvVar, NavigableMap navigableMap) {
        super(zzfwvVar, navigableMap);
        this.Y0 = zzfwvVar;
    }

    @Override // java.util.NavigableSet
    public final Object ceiling(Object obj) {
        return ((NavigableMap) ((SortedMap) this.X)).ceilingKey(obj);
    }

    @Override // com.google.android.gms.internal.ads.zzfwq
    public final /* synthetic */ SortedMap d() {
        return (NavigableMap) ((SortedMap) this.X);
    }

    @Override // java.util.NavigableSet
    public final Iterator descendingIterator() {
        return descendingSet().iterator();
    }

    @Override // java.util.NavigableSet
    public final NavigableSet descendingSet() {
        return new zzfwn(this.Y0, ((NavigableMap) ((SortedMap) this.X)).descendingMap());
    }

    @Override // java.util.NavigableSet
    public final Object floor(Object obj) {
        return ((NavigableMap) ((SortedMap) this.X)).floorKey(obj);
    }

    @Override // com.google.android.gms.internal.ads.zzfwq, java.util.SortedSet, java.util.NavigableSet
    public final /* synthetic */ SortedSet headSet(Object obj) {
        return headSet(obj, false);
    }

    @Override // java.util.NavigableSet
    public final Object higher(Object obj) {
        return ((NavigableMap) ((SortedMap) this.X)).higherKey(obj);
    }

    @Override // java.util.NavigableSet
    public final Object lower(Object obj) {
        return ((NavigableMap) ((SortedMap) this.X)).lowerKey(obj);
    }

    @Override // java.util.NavigableSet
    public final Object pollFirst() {
        return zzfym.a(iterator());
    }

    @Override // java.util.NavigableSet
    public final Object pollLast() {
        return zzfym.a(descendingIterator());
    }

    @Override // com.google.android.gms.internal.ads.zzfwq, java.util.SortedSet, java.util.NavigableSet
    public final /* bridge */ /* synthetic */ SortedSet subSet(Object obj, Object obj2) {
        return subSet(obj, true, obj2, false);
    }

    @Override // com.google.android.gms.internal.ads.zzfwq, java.util.SortedSet, java.util.NavigableSet
    public final /* synthetic */ SortedSet tailSet(Object obj) {
        return tailSet(obj, true);
    }

    @Override // java.util.NavigableSet
    public final NavigableSet headSet(Object obj, boolean z) {
        return new zzfwn(this.Y0, ((NavigableMap) ((SortedMap) this.X)).headMap(obj, z));
    }

    @Override // java.util.NavigableSet
    public final NavigableSet subSet(Object obj, boolean z, Object obj2, boolean z2) {
        return new zzfwn(this.Y0, ((NavigableMap) ((SortedMap) this.X)).subMap(obj, z, obj2, z2));
    }

    @Override // java.util.NavigableSet
    public final NavigableSet tailSet(Object obj, boolean z) {
        return new zzfwn(this.Y0, ((NavigableMap) ((SortedMap) this.X)).tailMap(obj, z));
    }
}
