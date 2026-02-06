package com.google.android.gms.ads.internal.client;

import com.google.android.gms.ads.AdLoadCallback;

/* loaded from: classes2.dex */
public final class zzh extends zzbm {
    public final AdLoadCallback X;
    public final Object Y;

    public zzh(AdLoadCallback adLoadCallback, Object obj) {
        this.X = adLoadCallback;
        this.Y = obj;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbn
    public final void c() {
        Object obj;
        AdLoadCallback adLoadCallback = this.X;
        if (adLoadCallback != null && (obj = this.Y) != null) {
            adLoadCallback.b(obj);
        }
    }

    @Override // com.google.android.gms.ads.internal.client.zzbn
    public final void d1(zze zzeVar) {
        AdLoadCallback adLoadCallback = this.X;
        if (adLoadCallback != null) {
            adLoadCallback.a(zzeVar.B0());
        }
    }
}
