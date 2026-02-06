package com.google.android.gms.internal.ads;

import java.util.Comparator;
import java.util.SortedMap;
import java.util.SortedSet;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public class zzfwq extends zzfwl implements SortedSet {
    public final /* synthetic */ zzfwv Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzfwq(zzfwv zzfwvVar, SortedMap sortedMap) {
        super(zzfwvVar, sortedMap);
        this.Z = zzfwvVar;
    }

    @Override // java.util.SortedSet
    public final Comparator comparator() {
        return d().comparator();
    }

    public SortedMap d() {
        return (SortedMap) this.X;
    }

    @Override // java.util.SortedSet
    public final Object first() {
        return d().firstKey();
    }

    public SortedSet headSet(Object obj) {
        return new zzfwq(this.Z, d().headMap(obj));
    }

    @Override // java.util.SortedSet
    public final Object last() {
        return d().lastKey();
    }

    public SortedSet subSet(Object obj, Object obj2) {
        return new zzfwq(this.Z, d().subMap(obj, obj2));
    }

    public SortedSet tailSet(Object obj) {
        return new zzfwq(this.Z, d().tailMap(obj));
    }
}
