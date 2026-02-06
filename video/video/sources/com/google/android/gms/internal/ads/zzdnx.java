package com.google.android.gms.internal.ads;

import java.util.Objects;

/* loaded from: classes2.dex */
public final class zzdnx {
    public final zzcvr a;
    public final zzcxa b;
    public final zzcxn c;
    public final zzcxz d;
    public final zzdau e;
    public final zzddw f;
    public final zzdsd g;
    public final zzfjr h;
    public final zzebt i;
    public final zzcmn j;

    public zzdnx(zzcvr zzcvrVar, zzcxa zzcxaVar, zzcxn zzcxnVar, zzcxz zzcxzVar, zzdau zzdauVar, zzddw zzddwVar, zzdsd zzdsdVar, zzfjr zzfjrVar, zzebt zzebtVar, zzcmn zzcmnVar) {
        this.a = zzcvrVar;
        this.b = zzcxaVar;
        this.c = zzcxnVar;
        this.d = zzcxzVar;
        this.e = zzdauVar;
        this.f = zzddwVar;
        this.g = zzdsdVar;
        this.h = zzfjrVar;
        this.i = zzebtVar;
        this.j = zzcmnVar;
    }

    public final void a(zzdny zzdnyVar, zzcfb zzcfbVar) {
        zzdnv zzdnvVar;
        zzdnvVar = zzdnyVar.a;
        final zzcxa zzcxaVar = this.b;
        Objects.requireNonNull(zzcxaVar);
        zzdnvVar.b(this.a, this.c, this.d, this.e, new com.google.android.gms.ads.internal.overlay.zzad() { // from class: com.google.android.gms.internal.ads.zzdnw
            @Override // com.google.android.gms.ads.internal.overlay.zzad
            public final void g() {
                zzcxa.this.b();
            }
        }, this.f);
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.c().b(zzbcv.wa)).booleanValue() && zzcfbVar != null && zzcfbVar.M() != null) {
            zzcgt M = zzcfbVar.M();
            zzcmn zzcmnVar = this.j;
            zzebt zzebtVar = this.i;
            M.J0(zzcmnVar, zzebtVar, this.h);
            M.T0(zzcmnVar, zzebtVar, this.g);
        }
    }
}
