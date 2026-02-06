package com.google.android.gms.internal.ads;

import java.util.AbstractCollection;
import java.util.Collection;
import java.util.Iterator;

/* loaded from: classes2.dex */
final class zzfwx extends AbstractCollection {
    public final /* synthetic */ zzfwy X;

    public zzfwx(zzfwy zzfwyVar) {
        this.X = zzfwyVar;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final void clear() {
        this.X.o();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean contains(Object obj) {
        for (Collection collection : this.X.s().values()) {
            if (collection.contains(obj)) {
                return true;
            }
        }
        return false;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return this.X.c();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final int size() {
        return this.X.d();
    }
}
