package com.google.android.gms.ads.internal.util;

import android.content.Context;
import com.google.android.gms.ads.internal.client.zzdj;
import o.InterfaceC11300zs1;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class zzav extends zzdj {
    public final /* synthetic */ Context X;
    public final /* synthetic */ zzay Y;

    public zzav(zzay zzayVar, Context context) {
        this.X = context;
        this.Y = zzayVar;
    }

    @Override // com.google.android.gms.ads.internal.client.zzdk
    public final void U2(@InterfaceC11300zs1 com.google.android.gms.ads.internal.client.zze zzeVar) {
        if (zzeVar == null) {
            return;
        }
        this.Y.i(this.X, zzeVar.Y, true, true);
    }
}
