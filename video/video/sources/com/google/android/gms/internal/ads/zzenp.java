package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import java.util.Map;
import o.AbstractServiceC6956i60;
import o.InterfaceFutureC8411o11;

/* loaded from: classes2.dex */
public final class zzenp implements zzetv {
    public final Context a;
    public final String b;
    public final String c;
    public final long d;
    public final zzcsn e;
    public final zzfdw f;
    public final zzfcp g;
    public final com.google.android.gms.ads.internal.util.zzg h = com.google.android.gms.ads.internal.zzv.t().j();
    public final zzdrx i;
    public final zzctb j;

    public zzenp(Context context, String str, String str2, zzcsn zzcsnVar, zzfdw zzfdwVar, zzfcp zzfcpVar, zzdrx zzdrxVar, zzctb zzctbVar, long j) {
        this.a = context;
        this.b = str;
        this.c = str2;
        this.e = zzcsnVar;
        this.f = zzfdwVar;
        this.g = zzfcpVar;
        this.i = zzdrxVar;
        this.j = zzctbVar;
        this.d = j;
    }

    @Override // com.google.android.gms.internal.ads.zzetv
    public final int a() {
        return 12;
    }

    @Override // com.google.android.gms.internal.ads.zzetv
    public final InterfaceFutureC8411o11 b() {
        String str;
        Bundle bundle = new Bundle();
        zzdrx zzdrxVar = this.i;
        Map b = zzdrxVar.b();
        String str2 = this.b;
        b.put("seq_num", str2);
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.c().b(zzbcv.q2)).booleanValue()) {
            zzdrxVar.d("tsacc", String.valueOf(com.google.android.gms.ads.internal.zzv.d().a() - this.d));
            com.google.android.gms.ads.internal.zzv.v();
            if (true != com.google.android.gms.ads.internal.util.zzs.h(this.a)) {
                str = "1";
            } else {
                str = "0";
            }
            zzdrxVar.d(AbstractServiceC6956i60.s1, str);
        }
        zzcsn zzcsnVar = this.e;
        zzfcp zzfcpVar = this.g;
        zzcsnVar.n(zzfcpVar.d);
        bundle.putAll(this.f.a());
        return zzgcy.h(new zzenq(this.a, bundle, str2, this.c, this.h, zzfcpVar.f, this.j));
    }
}
