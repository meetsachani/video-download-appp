package com.google.android.gms.internal.ads;

import java.util.AbstractMap;
import java.util.Objects;

/* loaded from: classes2.dex */
final class zzfzp extends zzfyc {
    public final /* synthetic */ zzfzq Y0;

    public zzfzp(zzfzq zzfzqVar) {
        this.Y0 = zzfzqVar;
    }

    @Override // java.util.List
    public final /* bridge */ /* synthetic */ Object get(int i) {
        int i2;
        Object[] objArr;
        Object[] objArr2;
        zzfzq zzfzqVar = this.Y0;
        i2 = zzfzqVar.Z0;
        zzfvc.a(i, i2, "index");
        objArr = zzfzqVar.Y0;
        int i3 = i + i;
        Object obj = objArr[i3];
        Objects.requireNonNull(obj);
        objArr2 = zzfzqVar.Y0;
        Object obj2 = objArr2[i3 + 1];
        Objects.requireNonNull(obj2);
        return new AbstractMap.SimpleImmutableEntry(obj, obj2);
    }

    @Override // com.google.android.gms.internal.ads.zzfxx
    public final boolean j() {
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        int i;
        i = this.Y0.Z0;
        return i;
    }
}
