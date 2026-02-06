package com.google.android.gms.internal.ads;

import android.content.Context;
import o.InterfaceC11300zs1;

/* loaded from: classes2.dex */
final class zzeib implements zzdgi {
    public final /* synthetic */ zzedi a;
    public final /* synthetic */ zzfbu b;

    public zzeib(zzeid zzeidVar, zzedi zzediVar, zzfbu zzfbuVar) {
        this.a = zzediVar;
        this.b = zzfbuVar;
    }

    @Override // com.google.android.gms.internal.ads.zzdgi
    @InterfaceC11300zs1
    public final zzfbu a() {
        return this.b;
    }

    @Override // com.google.android.gms.internal.ads.zzdgi
    public final void b(boolean z, Context context, @InterfaceC11300zs1 zzcwg zzcwgVar) throws zzdgh {
        try {
            zzfdn zzfdnVar = (zzfdn) this.a.b;
            zzfdnVar.A(z);
            zzfdnVar.a();
        } catch (zzfcw e) {
            int i = com.google.android.gms.ads.internal.util.zze.b;
            com.google.android.gms.ads.internal.util.client.zzo.h("Cannot show rewarded video.", e);
            throw new zzdgh(e.getCause());
        }
    }
}
