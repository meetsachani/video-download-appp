package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel;
import o.InterfaceC11300zs1;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class zzeet implements zzdgi {
    public final /* synthetic */ zzcaf a;
    public final /* synthetic */ zzfbu b;
    public final /* synthetic */ zzeeu c;

    public zzeet(zzeeu zzeeuVar, zzcaf zzcafVar, zzfbu zzfbuVar) {
        this.a = zzcafVar;
        this.b = zzfbuVar;
        this.c = zzeeuVar;
    }

    @Override // com.google.android.gms.internal.ads.zzdgi
    @InterfaceC11300zs1
    public final zzfbu a() {
        return this.b;
    }

    @Override // com.google.android.gms.internal.ads.zzdgi
    public final void b(boolean z, Context context, @InterfaceC11300zs1 zzcwg zzcwgVar) {
        zzdsd zzdsdVar;
        try {
            com.google.android.gms.ads.internal.zzv.n();
            zzdsdVar = this.c.e;
            com.google.android.gms.ads.internal.overlay.zzn.a(context, (AdOverlayInfoParcel) this.a.get(), true, zzdsdVar);
        } catch (Exception unused) {
        }
    }
}
