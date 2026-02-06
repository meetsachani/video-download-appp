package com.google.android.gms.internal.ads;

import java.util.Iterator;

/* loaded from: classes2.dex */
final class zzgnv implements Iterator {
    public final Iterator X;
    public final Iterator Y;

    public /* synthetic */ zzgnv(Iterator it, Iterator it2, zzgnw zzgnwVar) {
        this.X = it;
        this.Y = it2;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        if (!this.X.hasNext() && !this.Y.hasNext()) {
            return false;
        }
        return true;
    }

    @Override // java.util.Iterator
    public final Object next() {
        Iterator it = this.X;
        if (it.hasNext()) {
            return it.next();
        }
        return this.Y.next();
    }
}
