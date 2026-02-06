package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import o.InterfaceC11300zs1;

/* loaded from: classes2.dex */
final class zzefg implements zzdgi {
    public final /* synthetic */ zzedi a;
    public final /* synthetic */ zzfbu b;
    public final /* synthetic */ zzefh c;

    public zzefg(zzefh zzefhVar, zzedi zzediVar, zzfbu zzfbuVar) {
        this.a = zzediVar;
        this.b = zzfbuVar;
        this.c = zzefhVar;
    }

    @Override // com.google.android.gms.internal.ads.zzdgi
    @InterfaceC11300zs1
    public final zzfbu a() {
        return this.b;
    }

    @Override // com.google.android.gms.internal.ads.zzdgi
    public final void b(boolean z, Context context, @InterfaceC11300zs1 zzcwg zzcwgVar) throws zzdgh {
        VersionInfoParcel versionInfoParcel;
        try {
            zzfdn zzfdnVar = (zzfdn) this.a.b;
            zzfdnVar.A(z);
            versionInfoParcel = this.c.c;
            if (versionInfoParcel.Z < ((Integer) com.google.android.gms.ads.internal.client.zzbd.c().b(zzbcv.W0)).intValue()) {
                zzfdnVar.C();
            } else {
                zzfdnVar.D(context);
            }
        } catch (zzfcw e) {
            int i = com.google.android.gms.ads.internal.util.zze.b;
            com.google.android.gms.ads.internal.util.client.zzo.f("Cannot show interstitial.");
            throw new zzdgh(e.getCause());
        }
    }
}
