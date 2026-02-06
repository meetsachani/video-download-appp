package com.google.android.gms.internal.ads;

import java.util.Iterator;
import java.util.Map;

/* loaded from: classes2.dex */
final class zzfzq extends zzfyh {
    public final transient Object[] Y0;
    public final transient zzfyf Z;
    public final transient int Z0;

    public zzfzq(zzfyf zzfyfVar, Object[] objArr, int i, int i2) {
        this.Z = zzfyfVar;
        this.Y0 = objArr;
        this.Z0 = i2;
    }

    @Override // com.google.android.gms.internal.ads.zzfxx, java.util.AbstractCollection, java.util.Collection
    public final boolean contains(Object obj) {
        if (obj instanceof Map.Entry) {
            Map.Entry entry = (Map.Entry) obj;
            Object key = entry.getKey();
            Object value = entry.getValue();
            if (value != null && value.equals(this.Z.get(key))) {
                return true;
            }
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzfxx
    public final int d(Object[] objArr, int i) {
        return h().d(objArr, i);
    }

    @Override // com.google.android.gms.internal.ads.zzfyh, com.google.android.gms.internal.ads.zzfxx
    public final zzgai i() {
        return h().listIterator(0);
    }

    @Override // com.google.android.gms.internal.ads.zzfyh, com.google.android.gms.internal.ads.zzfxx, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final /* synthetic */ Iterator iterator() {
        return h().listIterator(0);
    }

    @Override // com.google.android.gms.internal.ads.zzfxx
    public final boolean j() {
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzfyh
    public final zzfyc p() {
        return new zzfzp(this);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.Z0;
    }
}
