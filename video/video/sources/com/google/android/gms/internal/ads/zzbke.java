package com.google.android.gms.internal.ads;

import java.util.Map;

/* loaded from: classes2.dex */
final class zzbke implements zzgcu {
    public final /* synthetic */ Map a;
    public final /* synthetic */ com.google.android.gms.ads.internal.client.zza b;
    public final /* synthetic */ String c;
    public final /* synthetic */ zzbki d;

    public zzbke(zzbki zzbkiVar, Map map, com.google.android.gms.ads.internal.client.zza zzaVar, String str) {
        this.a = map;
        this.b = zzaVar;
        this.c = str;
        this.d = zzbkiVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgcu
    public final void a(Throwable th) {
        com.google.android.gms.ads.internal.zzv.t().x(th, "OpenGmsgHandler.attributionReportingManager");
    }

    @Override // com.google.android.gms.internal.ads.zzgcu
    public final /* bridge */ /* synthetic */ void c(Object obj) {
        String str = (String) obj;
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.c().b(zzbcv.ra)).booleanValue()) {
            this.a.put("u", str);
        }
        this.d.h(str, this.b, this.a, this.c);
    }
}
