package com.google.android.gms.internal.ads;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;

/* loaded from: classes2.dex */
final class zzfwh implements Iterator {
    public final Iterator X;
    public Collection Y;
    public final /* synthetic */ zzfwi Z;

    public zzfwh(zzfwi zzfwiVar) {
        this.Z = zzfwiVar;
        this.X = zzfwiVar.Y0.entrySet().iterator();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.X.hasNext();
    }

    @Override // java.util.Iterator
    public final /* bridge */ /* synthetic */ Object next() {
        Map.Entry entry = (Map.Entry) this.X.next();
        this.Y = (Collection) entry.getValue();
        return this.Z.c(entry);
    }

    @Override // java.util.Iterator
    public final void remove() {
        boolean z;
        int i;
        if (this.Y != null) {
            z = true;
        } else {
            z = false;
        }
        zzfvc.m(z, "no calls to next() since the last call to remove()");
        this.X.remove();
        zzfwv zzfwvVar = this.Z.Z0;
        i = zzfwvVar.Z0;
        zzfwvVar.Z0 = i - this.Y.size();
        this.Y.clear();
        this.Y = null;
    }
}
