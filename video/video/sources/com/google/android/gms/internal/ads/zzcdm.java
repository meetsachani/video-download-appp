package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
public final class zzcdm extends zzcdi {
    public zzcdm(zzcbw zzcbwVar) {
        super(zzcbwVar);
    }

    @Override // com.google.android.gms.internal.ads.zzcdi
    public final void l() {
    }

    @Override // com.google.android.gms.internal.ads.zzcdi
    public final boolean w(String str) {
        String l = com.google.android.gms.ads.internal.util.client.zzf.l(str);
        zzcbw zzcbwVar = (zzcbw) this.Z.get();
        if (zzcbwVar != null && l != null) {
            zzcbwVar.z(l, this);
        }
        int i = com.google.android.gms.ads.internal.util.zze.b;
        com.google.android.gms.ads.internal.util.client.zzo.g("VideoStreamNoopCache is doing nothing.");
        m(str, l, "noop", "Noop cache is a noop.");
        return false;
    }
}
