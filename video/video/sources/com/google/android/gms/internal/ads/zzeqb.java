package com.google.android.gms.internal.ads;

import android.content.Context;

/* loaded from: classes2.dex */
public final class zzeqb implements zzhfv {
    public final zzhge a;
    public final zzhge b;

    public zzeqb(zzhge zzhgeVar, zzhge zzhgeVar2) {
        this.a = zzhgeVar;
        this.b = zzhgeVar2;
    }

    @Override // com.google.android.gms.internal.ads.zzhgk, com.google.android.gms.internal.ads.zzhgj
    public final /* bridge */ /* synthetic */ Object b() {
        zzfyh F;
        zzeqz b = ((zzerb) this.a).b();
        Context a = ((zzchi) this.b).a();
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.c().b(zzbcv.Hb)).booleanValue()) {
            com.google.android.gms.ads.internal.zzv.v();
            if (com.google.android.gms.ads.internal.util.zzs.c(a)) {
                F = zzfyh.G(b);
                zzhgd.b(F);
                return F;
            }
        }
        F = zzfyh.F();
        zzhgd.b(F);
        return F;
    }
}
