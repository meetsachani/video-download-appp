package com.google.android.gms.internal.consent_sdk;

import java.util.List;

/* loaded from: classes3.dex */
public final class zzdd extends zzde {
    public final transient int Y0;
    public final transient int Z0;
    public final /* synthetic */ zzde a1;

    public zzdd(zzde zzdeVar, int i, int i2) {
        this.a1 = zzdeVar;
        this.Y0 = i;
        this.Z0 = i2;
    }

    @Override // com.google.android.gms.internal.consent_sdk.zzdb
    public final int e() {
        return this.a1.f() + this.Y0 + this.Z0;
    }

    @Override // com.google.android.gms.internal.consent_sdk.zzdb
    public final int f() {
        return this.a1.f() + this.Y0;
    }

    @Override // java.util.List
    public final Object get(int i) {
        zzcx.a(i, this.Z0, "index");
        return this.a1.get(i + this.Y0);
    }

    @Override // com.google.android.gms.internal.consent_sdk.zzdb
    public final Object[] i() {
        return this.a1.i();
    }

    @Override // com.google.android.gms.internal.consent_sdk.zzde
    public final zzde j(int i, int i2) {
        zzcx.c(i, i2, this.Z0);
        int i3 = this.Y0;
        return this.a1.subList(i + i3, i2 + i3);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.Z0;
    }

    @Override // com.google.android.gms.internal.consent_sdk.zzde, java.util.List
    public final /* bridge */ /* synthetic */ List subList(int i, int i2) {
        return subList(i, i2);
    }
}
