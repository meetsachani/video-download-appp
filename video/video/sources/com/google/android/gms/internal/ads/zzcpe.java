package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
public final class zzcpe implements zzhfv {
    public final zzhge a;

    public zzcpe(zzcow zzcowVar, zzhge zzhgeVar) {
        this.a = zzhgeVar;
    }

    @Override // com.google.android.gms.internal.ads.zzhgk, com.google.android.gms.internal.ads.zzhgj
    public final /* bridge */ /* synthetic */ Object b() {
        zzfyh F;
        zzcqh b = ((zzcqi) this.a).b();
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.c().b(zzbcv.Rc)).booleanValue()) {
            F = zzfyh.G(new zzddq(b, zzcaa.a));
        } else {
            F = zzfyh.F();
        }
        zzhgd.b(F);
        return F;
    }
}
