package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class zzbzj extends com.google.android.gms.ads.internal.util.zzb {
    public final /* synthetic */ zzbzn c;

    public zzbzj(zzbzn zzbznVar) {
        this.c = zzbznVar;
    }

    @Override // com.google.android.gms.ads.internal.util.zzb
    public final void a() {
        Context context;
        VersionInfoParcel versionInfoParcel;
        Object obj;
        zzbda zzbdaVar;
        zzbzn zzbznVar = this.c;
        context = zzbznVar.e;
        versionInfoParcel = zzbznVar.f;
        zzbcy zzbcyVar = new zzbcy(context, versionInfoParcel.X);
        obj = zzbznVar.a;
        synchronized (obj) {
            try {
                com.google.android.gms.ads.internal.zzv.i();
                zzbdaVar = zzbznVar.h;
                zzbdb.a(zzbdaVar, zzbcyVar);
            } catch (IllegalArgumentException e) {
                int i = com.google.android.gms.ads.internal.util.zze.b;
                com.google.android.gms.ads.internal.util.client.zzo.h("Cannot config CSI reporter.", e);
            }
        }
    }
}
