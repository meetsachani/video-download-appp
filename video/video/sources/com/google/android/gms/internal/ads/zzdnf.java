package com.google.android.gms.internal.ads;

import android.os.Bundle;
import o.InterfaceC11300zs1;

/* loaded from: classes2.dex */
public class zzdnf implements com.google.android.gms.ads.internal.client.zza, zzbim, com.google.android.gms.ads.internal.overlay.zzr, zzbio, com.google.android.gms.ads.internal.overlay.zzad {
    public com.google.android.gms.ads.internal.client.zza X;
    public zzbim Y;
    public zzbio Y0;
    public com.google.android.gms.ads.internal.overlay.zzr Z;
    public com.google.android.gms.ads.internal.overlay.zzad Z0;

    @Override // com.google.android.gms.ads.internal.overlay.zzr
    public final synchronized void S7() {
        com.google.android.gms.ads.internal.overlay.zzr zzrVar = this.Z;
        if (zzrVar != null) {
            zzrVar.S7();
        }
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzr
    public final synchronized void V3() {
        com.google.android.gms.ads.internal.overlay.zzr zzrVar = this.Z;
        if (zzrVar != null) {
            zzrVar.V3();
        }
    }

    public final synchronized void a(com.google.android.gms.ads.internal.client.zza zzaVar, zzbim zzbimVar, com.google.android.gms.ads.internal.overlay.zzr zzrVar, zzbio zzbioVar, com.google.android.gms.ads.internal.overlay.zzad zzadVar) {
        this.X = zzaVar;
        this.Y = zzbimVar;
        this.Z = zzrVar;
        this.Y0 = zzbioVar;
        this.Z0 = zzadVar;
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzad
    public final synchronized void g() {
        com.google.android.gms.ads.internal.overlay.zzad zzadVar = this.Z0;
        if (zzadVar != null) {
            zzadVar.g();
        }
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzr
    public final synchronized void h5(int i) {
        com.google.android.gms.ads.internal.overlay.zzr zzrVar = this.Z;
        if (zzrVar != null) {
            zzrVar.h5(i);
        }
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzr
    public final synchronized void o1() {
        com.google.android.gms.ads.internal.overlay.zzr zzrVar = this.Z;
        if (zzrVar != null) {
            zzrVar.o1();
        }
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzr
    public final synchronized void r4() {
        com.google.android.gms.ads.internal.overlay.zzr zzrVar = this.Z;
        if (zzrVar != null) {
            zzrVar.r4();
        }
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzr
    public final synchronized void s7() {
        com.google.android.gms.ads.internal.overlay.zzr zzrVar = this.Z;
        if (zzrVar != null) {
            zzrVar.s7();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbio
    public final synchronized void u(String str, @InterfaceC11300zs1 String str2) {
        zzbio zzbioVar = this.Y0;
        if (zzbioVar != null) {
            zzbioVar.u(str, str2);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbim
    public final synchronized void x0(String str, Bundle bundle) {
        zzbim zzbimVar = this.Y;
        if (zzbimVar != null) {
            zzbimVar.x0(str, bundle);
        }
    }

    @Override // com.google.android.gms.ads.internal.client.zza
    public final synchronized void y() {
        com.google.android.gms.ads.internal.client.zza zzaVar = this.X;
        if (zzaVar != null) {
            zzaVar.y();
        }
    }
}
