package com.google.android.gms.internal.ads;

import java.util.AbstractList;

/* loaded from: classes2.dex */
public final class zzgzc extends AbstractList {
    public final zzgza X;
    public final zzgzb Y;

    public zzgzc(zzgza zzgzaVar, zzgzb zzgzbVar) {
        this.X = zzgzaVar;
        this.Y = zzgzbVar;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i) {
        return this.Y.z(this.X.A0(i));
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.X.size();
    }
}
