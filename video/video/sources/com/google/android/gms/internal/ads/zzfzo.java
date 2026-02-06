package com.google.android.gms.internal.ads;

import java.util.Objects;

/* loaded from: classes2.dex */
public final class zzfzo extends zzfyc {
    public static final zzfyc a1 = new zzfzo(new Object[0], 0);
    public final transient Object[] Y0;
    public final transient int Z0;

    public zzfzo(Object[] objArr, int i) {
        this.Y0 = objArr;
        this.Z0 = i;
    }

    @Override // com.google.android.gms.internal.ads.zzfyc, com.google.android.gms.internal.ads.zzfxx
    public final int d(Object[] objArr, int i) {
        Object[] objArr2 = this.Y0;
        int i2 = this.Z0;
        System.arraycopy(objArr2, 0, objArr, i, i2);
        return i + i2;
    }

    @Override // com.google.android.gms.internal.ads.zzfxx
    public final int e() {
        return this.Z0;
    }

    @Override // com.google.android.gms.internal.ads.zzfxx
    public final int f() {
        return 0;
    }

    @Override // java.util.List
    public final Object get(int i) {
        zzfvc.a(i, this.Z0, "index");
        Object obj = this.Y0[i];
        Objects.requireNonNull(obj);
        return obj;
    }

    @Override // com.google.android.gms.internal.ads.zzfxx
    public final boolean j() {
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzfxx
    public final Object[] k() {
        return this.Y0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.Z0;
    }
}
