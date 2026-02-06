package com.google.android.gms.internal.ads;

import java.util.Objects;

/* loaded from: classes2.dex */
public final class zzdno {
    public final zzcvr a;
    public final zzcxa b;
    public final zzcxn c;
    public final zzcxz d;
    public final zzdau e;
    public final zzfbu f;
    public final zzfbx g;
    public final zzcmn h;

    public zzdno(zzcvr zzcvrVar, zzcxa zzcxaVar, zzcxn zzcxnVar, zzcxz zzcxzVar, zzdau zzdauVar, zzfbu zzfbuVar, zzfbx zzfbxVar, zzcmn zzcmnVar) {
        this.a = zzcvrVar;
        this.b = zzcxaVar;
        this.c = zzcxnVar;
        this.d = zzcxzVar;
        this.e = zzdauVar;
        this.f = zzfbuVar;
        this.g = zzfbxVar;
        this.h = zzcmnVar;
    }

    public final void a(zzdns zzdnsVar) {
        zzdnf zzdnfVar;
        final zzcxa zzcxaVar = this.b;
        zzdnfVar = zzdnsVar.a;
        Objects.requireNonNull(zzcxaVar);
        zzdnfVar.a(this.a, this.c, this.d, this.e, new com.google.android.gms.ads.internal.overlay.zzad() { // from class: com.google.android.gms.internal.ads.zzdnn
            @Override // com.google.android.gms.ads.internal.overlay.zzad
            public final void g() {
                zzcxa.this.b();
            }
        });
        zzdnsVar.h(this.f, this.g, this.h);
    }
}
