package com.google.android.gms.internal.ads;

import java.util.Objects;

/* loaded from: classes2.dex */
final class zzfzs extends zzfyc {
    public final transient Object[] Y0;
    public final transient int Z0;
    public final transient int a1;

    public zzfzs(Object[] objArr, int i, int i2) {
        this.Y0 = objArr;
        this.Z0 = i;
        this.a1 = i2;
    }

    @Override // java.util.List
    public final Object get(int i) {
        zzfvc.a(i, this.a1, "index");
        Object obj = this.Y0[i + i + this.Z0];
        Objects.requireNonNull(obj);
        return obj;
    }

    @Override // com.google.android.gms.internal.ads.zzfxx
    public final boolean j() {
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.a1;
    }
}
