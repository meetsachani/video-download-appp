package com.google.android.gms.internal.ads;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* loaded from: classes2.dex */
final class zzdxl implements zzgcu {
    public final /* synthetic */ zzdxm a;

    public zzdxl(zzdxm zzdxmVar) {
        this.a = zzdxmVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgcu
    public final void a(Throwable th) {
        Pattern pattern;
        zzeap zzeapVar;
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.c().b(zzbcv.s6)).booleanValue()) {
            pattern = zzdxm.h;
            Matcher matcher = pattern.matcher(th.getMessage());
            if (matcher.matches()) {
                String group = matcher.group(1);
                zzeapVar = this.a.e;
                zzeapVar.i(Integer.parseInt(group));
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgcu
    public final /* bridge */ /* synthetic */ void c(Object obj) {
        zzeap zzeapVar;
        zzeap zzeapVar2;
        zzfcg zzfcgVar = (zzfcg) obj;
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.c().b(zzbcv.s6)).booleanValue()) {
            zzdxm zzdxmVar = this.a;
            zzeapVar = zzdxmVar.e;
            zzfbx zzfbxVar = zzfcgVar.b.b;
            zzeapVar.i(zzfbxVar.f);
            zzeapVar2 = zzdxmVar.e;
            zzeapVar2.j(zzfbxVar.g);
        }
    }
}
