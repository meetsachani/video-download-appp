package com.google.android.gms.internal.ads;

import java.util.Comparator;
import java.util.SortedMap;
import java.util.SortedSet;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public class zzfwp extends zzfwi implements SortedMap {
    public SortedSet a1;
    public final /* synthetic */ zzfwv b1;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzfwp(zzfwv zzfwvVar, SortedMap sortedMap) {
        super(zzfwvVar, sortedMap);
        this.b1 = zzfwvVar;
    }

    @Override // java.util.SortedMap
    public final Comparator comparator() {
        return d().comparator();
    }

    public SortedMap d() {
        return (SortedMap) this.Y0;
    }

    @Override // com.google.android.gms.internal.ads.zzfyy
    /* renamed from: e */
    public SortedSet b() {
        return new zzfwq(this.b1, d());
    }

    @Override // com.google.android.gms.internal.ads.zzfwi, com.google.android.gms.internal.ads.zzfyy, java.util.AbstractMap, java.util.Map
    /* renamed from: f */
    public SortedSet keySet() {
        SortedSet sortedSet = this.a1;
        if (sortedSet == null) {
            SortedSet b = b();
            this.a1 = b;
            return b;
        }
        return sortedSet;
    }

    @Override // java.util.SortedMap
    public final Object firstKey() {
        return d().firstKey();
    }

    public SortedMap headMap(Object obj) {
        return new zzfwp(this.b1, d().headMap(obj));
    }

    @Override // java.util.SortedMap
    public final Object lastKey() {
        return d().lastKey();
    }

    public SortedMap subMap(Object obj, Object obj2) {
        return new zzfwp(this.b1, d().subMap(obj, obj2));
    }

    public SortedMap tailMap(Object obj) {
        return new zzfwp(this.b1, d().tailMap(obj));
    }
}
