package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
public final class zzdaw implements zzcyv {
    public int X = ((Integer) com.google.android.gms.ads.internal.client.zzbd.c().b(zzbcv.t1)).intValue();
    public int Y = ((Integer) com.google.android.gms.ads.internal.client.zzbd.c().b(zzbcv.dd)).intValue();

    @Override // com.google.android.gms.internal.ads.zzcyv
    public final void D0(zzbvl zzbvlVar) {
    }

    public final synchronized int a() {
        return this.X;
    }

    public final synchronized int b() {
        return this.Y;
    }

    @Override // com.google.android.gms.internal.ads.zzcyv
    public final synchronized void f0(zzfcg zzfcgVar) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.c().b(zzbcv.u1)).booleanValue()) {
            try {
                zzfbx zzfbxVar = zzfcgVar.b.b;
                this.X = zzfbxVar.c;
                this.Y = zzfbxVar.d;
            } catch (NullPointerException unused) {
            }
        }
    }
}
