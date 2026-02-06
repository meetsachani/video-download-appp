package com.google.android.gms.internal.ads;

import java.util.Iterator;

/* loaded from: classes2.dex */
abstract class zzgag implements Iterator {
    public final Iterator X;

    public zzgag(Iterator it) {
        it.getClass();
        this.X = it;
    }

    public abstract Object b(Object obj);

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.X.hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        return b(this.X.next());
    }

    @Override // java.util.Iterator
    public final void remove() {
        this.X.remove();
    }
}
