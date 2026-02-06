package com.google.android.gms.internal.ads;

import android.content.Context;

/* loaded from: classes2.dex */
public final class zzezn implements zzhfv {
    public final zzhge a;
    public final zzhge b;
    public final zzhge c;

    public zzezn(zzhge zzhgeVar, zzhge zzhgeVar2, zzhge zzhgeVar3) {
        this.a = zzhgeVar;
        this.b = zzhgeVar2;
        this.c = zzhgeVar3;
    }

    @Override // com.google.android.gms.internal.ads.zzhgk, com.google.android.gms.internal.ads.zzhgj
    /* renamed from: a */
    public final zzezl b() {
        zzbzh h;
        Context context = (Context) this.a.b();
        zzfdy zzfdyVar = (zzfdy) this.b.b();
        zzfeq zzfeqVar = (zzfeq) this.c.b();
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.c().b(zzbcv.x6)).booleanValue()) {
            h = com.google.android.gms.ads.internal.zzv.t().j().g();
        } else {
            h = com.google.android.gms.ads.internal.zzv.t().j().h();
        }
        boolean z = false;
        if (h != null && h.h()) {
            z = true;
        }
        if (((Integer) com.google.android.gms.ads.internal.client.zzbd.c().b(zzbcv.N6)).intValue() > 0) {
            if (!((Boolean) com.google.android.gms.ads.internal.client.zzbd.c().b(zzbcv.w6)).booleanValue() || z) {
                zzfep a = zzfeqVar.a(zzfeg.AppOpen, context, zzfdyVar, new zzeyp(new zzeym()));
                zzezb zzezbVar = new zzezb(new zzeza());
                zzfec zzfecVar = a.a;
                zzgdj zzgdjVar = zzcaa.a;
                return new zzeyr(zzezbVar, new zzeyx(zzfecVar, zzgdjVar), a.b, zzfecVar.a().c1, zzgdjVar);
            }
        }
        return new zzeza();
    }
}
