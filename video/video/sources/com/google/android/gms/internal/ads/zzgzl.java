package com.google.android.gms.internal.ads;

import java.util.Iterator;
import java.util.Map;

/* loaded from: classes2.dex */
final class zzgzl implements Iterator {
    public final Iterator X;

    public zzgzl(Iterator it) {
        this.X = it;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.X.hasNext();
    }

    @Override // java.util.Iterator
    public final /* bridge */ /* synthetic */ Object next() {
        Map.Entry entry = (Map.Entry) this.X.next();
        if (entry.getValue() instanceof zzgzn) {
            return new zzgzk(entry, null);
        }
        return entry;
    }

    @Override // java.util.Iterator
    public final void remove() {
        this.X.remove();
    }
}
