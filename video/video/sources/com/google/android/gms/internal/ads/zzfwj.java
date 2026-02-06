package com.google.android.gms.internal.ads;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public class zzfwj implements Iterator {
    public final Iterator X;
    public Collection Y;
    public final /* synthetic */ zzfwv Y0;
    public Iterator Z;

    public zzfwj(zzfwv zzfwvVar) {
        Map map;
        this.Y0 = zzfwvVar;
        map = zzfwvVar.Y0;
        this.X = map.entrySet().iterator();
        this.Y = null;
        this.Z = zzfyk.INSTANCE;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        if (!this.X.hasNext() && !this.Z.hasNext()) {
            return false;
        }
        return true;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (!this.Z.hasNext()) {
            Map.Entry entry = (Map.Entry) this.X.next();
            entry.getKey();
            Collection collection = (Collection) entry.getValue();
            this.Y = collection;
            this.Z = collection.iterator();
        }
        return this.Z.next();
    }

    @Override // java.util.Iterator
    public final void remove() {
        int i;
        this.Z.remove();
        Collection collection = this.Y;
        Objects.requireNonNull(collection);
        if (collection.isEmpty()) {
            this.X.remove();
        }
        zzfwv zzfwvVar = this.Y0;
        i = zzfwvVar.Z0;
        zzfwvVar.Z0 = i - 1;
    }
}
