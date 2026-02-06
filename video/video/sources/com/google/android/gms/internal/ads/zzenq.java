package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import o.C9755tW1;
import o.InterfaceC11300zs1;

/* loaded from: classes2.dex */
public final class zzenq implements zzetu {
    public final Context a;
    public final Bundle b;
    public final String c;
    public final String d;
    public final com.google.android.gms.ads.internal.util.zzg e;
    @InterfaceC11300zs1
    public final String f;
    public final zzctb g;

    public zzenq(Context context, Bundle bundle, String str, String str2, com.google.android.gms.ads.internal.util.zzg zzgVar, @InterfaceC11300zs1 String str3, zzctb zzctbVar) {
        this.a = context;
        this.b = bundle;
        this.c = str;
        this.d = str2;
        this.e = zzgVar;
        this.f = str3;
        this.g = zzctbVar;
    }

    private final void a(Bundle bundle) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.c().b(zzbcv.R5)).booleanValue()) {
            try {
                com.google.android.gms.ads.internal.zzv.v();
                bundle.putString("_app_id", com.google.android.gms.ads.internal.util.zzs.W(this.a));
            } catch (RemoteException | RuntimeException e) {
                com.google.android.gms.ads.internal.zzv.t().x(e, "AppStatsSignal_AppId");
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzetu
    public final /* bridge */ /* synthetic */ void b(Object obj) {
        Bundle bundle = ((zzcuv) obj).b;
        bundle.putBundle("quality_signals", this.b);
        a(bundle);
    }

    @Override // com.google.android.gms.internal.ads.zzetu
    public final /* bridge */ /* synthetic */ void c(Object obj) {
        Bundle bundle = ((zzcuv) obj).a;
        bundle.putBundle("quality_signals", this.b);
        bundle.putString("seq_num", this.c);
        com.google.android.gms.ads.internal.util.zzg zzgVar = this.e;
        if (!zzgVar.M()) {
            bundle.putString(C9755tW1.p, this.d);
        }
        bundle.putBoolean("client_purpose_one", !zzgVar.M());
        a(bundle);
        String str = this.f;
        if (str != null) {
            Bundle bundle2 = new Bundle();
            zzctb zzctbVar = this.g;
            bundle2.putLong("dload", zzctbVar.b(str));
            bundle2.putInt("pcc", zzctbVar.a(str));
            bundle.putBundle("ad_unit_quality_signals", bundle2);
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.c().b(zzbcv.aa)).booleanValue() && com.google.android.gms.ads.internal.zzv.t().b() > 0) {
            bundle.putInt("nrwv", com.google.android.gms.ads.internal.zzv.t().b());
        }
    }
}
