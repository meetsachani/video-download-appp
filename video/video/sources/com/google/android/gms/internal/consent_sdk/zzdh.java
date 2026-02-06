package com.google.android.gms.internal.consent_sdk;

import java.util.Objects;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class zzdh extends zzde {
    public static final zzde a1 = new zzdh(new Object[0], 0);
    public final transient Object[] Y0;
    public final transient int Z0;

    public zzdh(Object[] objArr, int i) {
        this.Y0 = objArr;
        this.Z0 = i;
    }

    @Override // com.google.android.gms.internal.consent_sdk.zzde, com.google.android.gms.internal.consent_sdk.zzdb
    public final int d(Object[] objArr, int i) {
        Object[] objArr2 = this.Y0;
        int i2 = this.Z0;
        System.arraycopy(objArr2, 0, objArr, 0, i2);
        return i2;
    }

    @Override // com.google.android.gms.internal.consent_sdk.zzdb
    public final int e() {
        return this.Z0;
    }

    @Override // com.google.android.gms.internal.consent_sdk.zzdb
    public final int f() {
        return 0;
    }

    @Override // java.util.List
    public final Object get(int i) {
        zzcx.a(i, this.Z0, "index");
        Object obj = this.Y0[i];
        Objects.requireNonNull(obj);
        return obj;
    }

    @Override // com.google.android.gms.internal.consent_sdk.zzdb
    public final Object[] i() {
        return this.Y0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.Z0;
    }
}
