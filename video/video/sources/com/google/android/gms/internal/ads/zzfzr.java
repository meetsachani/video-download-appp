package com.google.android.gms.internal.ads;

import java.util.Iterator;

/* loaded from: classes2.dex */
final class zzfzr extends zzfyh {
    public final transient zzfyc Y0;
    public final transient zzfyf Z;

    public zzfzr(zzfyf zzfyfVar, zzfyc zzfycVar) {
        this.Z = zzfyfVar;
        this.Y0 = zzfycVar;
    }

    @Override // com.google.android.gms.internal.ads.zzfxx, java.util.AbstractCollection, java.util.Collection
    public final boolean contains(Object obj) {
        if (this.Z.get(obj) != null) {
            return true;
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzfxx
    public final int d(Object[] objArr, int i) {
        return this.Y0.d(objArr, i);
    }

    @Override // com.google.android.gms.internal.ads.zzfyh, com.google.android.gms.internal.ads.zzfxx
    public final zzfyc h() {
        return this.Y0;
    }

    @Override // com.google.android.gms.internal.ads.zzfyh, com.google.android.gms.internal.ads.zzfxx
    public final zzgai i() {
        return this.Y0.listIterator(0);
    }

    @Override // com.google.android.gms.internal.ads.zzfyh, com.google.android.gms.internal.ads.zzfxx, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final /* synthetic */ Iterator iterator() {
        return this.Y0.listIterator(0);
    }

    @Override // com.google.android.gms.internal.ads.zzfxx
    public final boolean j() {
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.Z.size();
    }
}
