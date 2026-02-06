package com.google.android.gms.internal.ads;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;

/* loaded from: classes2.dex */
final class zzfwk implements Iterator {
    public Map.Entry X;
    public final /* synthetic */ Iterator Y;
    public final /* synthetic */ zzfwl Z;

    public zzfwk(zzfwl zzfwlVar, Iterator it) {
        this.Y = it;
        this.Z = zzfwlVar;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.Y.hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        Map.Entry entry = (Map.Entry) this.Y.next();
        this.X = entry;
        return entry.getKey();
    }

    @Override // java.util.Iterator
    public final void remove() {
        boolean z;
        int i;
        if (this.X != null) {
            z = true;
        } else {
            z = false;
        }
        zzfvc.m(z, "no calls to next() since the last call to remove()");
        Collection collection = (Collection) this.X.getValue();
        this.Y.remove();
        zzfwv zzfwvVar = this.Z.Y;
        i = zzfwvVar.Z0;
        zzfwvVar.Z0 = i - collection.size();
        collection.clear();
        this.X = null;
    }
}
