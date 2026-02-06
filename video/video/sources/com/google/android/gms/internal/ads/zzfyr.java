package com.google.android.gms.internal.ads;

import java.io.Serializable;
import java.util.AbstractSequentialList;
import java.util.List;
import java.util.ListIterator;

/* loaded from: classes2.dex */
final class zzfyr extends AbstractSequentialList implements Serializable {
    public final List X;
    public final zzfur Y;

    public zzfyr(List list, zzfur zzfurVar) {
        list.getClass();
        this.X = list;
        this.Y = zzfurVar;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean isEmpty() {
        return this.X.isEmpty();
    }

    @Override // java.util.AbstractSequentialList, java.util.AbstractList, java.util.List
    public final ListIterator listIterator(int i) {
        return new zzfyq(this, this.X.listIterator(i));
    }

    @Override // java.util.AbstractList
    public final void removeRange(int i, int i2) {
        this.X.subList(i, i2).clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.X.size();
    }
}
