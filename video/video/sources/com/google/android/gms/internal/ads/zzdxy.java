package com.google.android.gms.internal.ads;

import android.content.Context;

/* loaded from: classes2.dex */
final class zzdxy implements zzgcu {
    public final /* synthetic */ Context a;

    public zzdxy(Context context) {
        this.a = context;
    }

    @Override // com.google.android.gms.internal.ads.zzgcu
    public final void a(Throwable th) {
        if (((Boolean) zzben.h.e()).booleanValue() && (th instanceof com.google.android.gms.ads.internal.util.zzba)) {
            zzbcf.e(this.a);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgcu
    public final /* bridge */ /* synthetic */ void c(Object obj) {
        zzdyr zzdyrVar = (zzdyr) obj;
        if (((Boolean) zzben.j.e()).booleanValue()) {
            zzbcf.e(this.a);
        }
    }
}
