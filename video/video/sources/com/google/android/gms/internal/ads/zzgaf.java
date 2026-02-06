package com.google.android.gms.internal.ads;

import java.util.Iterator;
import o.C6566gU0;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class zzgaf extends zzfyh {
    public final transient Object Z;

    public zzgaf(Object obj) {
        obj.getClass();
        this.Z = obj;
    }

    @Override // com.google.android.gms.internal.ads.zzfxx, java.util.AbstractCollection, java.util.Collection
    public final boolean contains(Object obj) {
        return this.Z.equals(obj);
    }

    @Override // com.google.android.gms.internal.ads.zzfxx
    public final int d(Object[] objArr, int i) {
        objArr[i] = this.Z;
        return i + 1;
    }

    @Override // com.google.android.gms.internal.ads.zzfyh, com.google.android.gms.internal.ads.zzfxx
    public final zzfyc h() {
        return zzfyc.G(this.Z);
    }

    @Override // com.google.android.gms.internal.ads.zzfyh, java.util.Collection, java.util.Set
    public final int hashCode() {
        return this.Z.hashCode();
    }

    @Override // com.google.android.gms.internal.ads.zzfyh, com.google.android.gms.internal.ads.zzfxx
    public final zzgai i() {
        return new zzfyl(this.Z);
    }

    @Override // com.google.android.gms.internal.ads.zzfyh, com.google.android.gms.internal.ads.zzfxx, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final /* synthetic */ Iterator iterator() {
        return new zzfyl(this.Z);
    }

    @Override // com.google.android.gms.internal.ads.zzfxx
    public final boolean j() {
        return false;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return 1;
    }

    @Override // java.util.AbstractCollection
    public final String toString() {
        String obj = this.Z.toString();
        return C6566gU0.f + obj + C6566gU0.g;
    }
}
