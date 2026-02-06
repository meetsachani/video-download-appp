package com.google.android.gms.internal.ads;

import java.util.List;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class zzfyb extends zzfyc {
    public final transient int Y0;
    public final transient int Z0;
    public final /* synthetic */ zzfyc a1;

    public zzfyb(zzfyc zzfycVar, int i, int i2) {
        this.a1 = zzfycVar;
        this.Y0 = i;
        this.Z0 = i2;
    }

    @Override // com.google.android.gms.internal.ads.zzfxx
    public final int e() {
        return this.a1.f() + this.Y0 + this.Z0;
    }

    @Override // com.google.android.gms.internal.ads.zzfxx
    public final int f() {
        return this.a1.f() + this.Y0;
    }

    @Override // java.util.List
    public final Object get(int i) {
        zzfvc.a(i, this.Z0, "index");
        return this.a1.get(i + this.Y0);
    }

    @Override // com.google.android.gms.internal.ads.zzfxx
    public final boolean j() {
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzfxx
    public final Object[] k() {
        return this.a1.k();
    }

    @Override // com.google.android.gms.internal.ads.zzfyc
    public final zzfyc l(int i, int i2) {
        zzfvc.k(i, i2, this.Z0);
        int i3 = this.Y0;
        return this.a1.subList(i + i3, i2 + i3);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.Z0;
    }

    @Override // com.google.android.gms.internal.ads.zzfyc, java.util.List
    public final /* bridge */ /* synthetic */ List subList(int i, int i2) {
        return subList(i, i2);
    }
}
