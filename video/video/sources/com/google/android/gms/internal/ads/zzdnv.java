package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
public final class zzdnv extends zzdnf implements zzddy {
    public zzddy a1;

    @Override // com.google.android.gms.internal.ads.zzddy
    public final synchronized void X0() {
        zzddy zzddyVar = this.a1;
        if (zzddyVar != null) {
            zzddyVar.X0();
        }
    }

    public final synchronized void b(com.google.android.gms.ads.internal.client.zza zzaVar, zzbim zzbimVar, com.google.android.gms.ads.internal.overlay.zzr zzrVar, zzbio zzbioVar, com.google.android.gms.ads.internal.overlay.zzad zzadVar, zzddy zzddyVar) {
        try {
            try {
                super.a(zzaVar, zzbimVar, zzrVar, zzbioVar, zzadVar);
                this.a1 = zzddyVar;
            } catch (Throwable th) {
                th = th;
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            throw th;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzddy
    public final synchronized void t() {
        zzddy zzddyVar = this.a1;
        if (zzddyVar != null) {
            zzddyVar.t();
        }
    }
}
