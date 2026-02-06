package com.google.android.gms.internal.ads;

import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes2.dex */
class zzfwr implements Iterator {
    public final Iterator X;
    public final Collection Y;
    public final /* synthetic */ zzfws Z;

    public zzfwr(zzfws zzfwsVar, Iterator it) {
        this.Z = zzfwsVar;
        this.Y = zzfwsVar.Y;
        this.X = it;
    }

    public final void b() {
        zzfws zzfwsVar = this.Z;
        zzfwsVar.b();
        if (zzfwsVar.Y == this.Y) {
            return;
        }
        throw new ConcurrentModificationException();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        b();
        return this.X.hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        b();
        return this.X.next();
    }

    @Override // java.util.Iterator
    public final void remove() {
        int i;
        this.X.remove();
        zzfws zzfwsVar = this.Z;
        zzfwv zzfwvVar = zzfwsVar.Z0;
        i = zzfwvVar.Z0;
        zzfwvVar.Z0 = i - 1;
        zzfwsVar.e();
    }

    public zzfwr(zzfws zzfwsVar) {
        Iterator it;
        this.Z = zzfwsVar;
        Collection collection = zzfwsVar.Y;
        this.Y = collection;
        if (collection instanceof List) {
            it = ((List) collection).listIterator();
        } else {
            it = collection.iterator();
        }
        this.X = it;
    }
}
