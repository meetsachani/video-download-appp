package com.google.android.gms.ads.nonagon.signalgeneration;

import android.text.TextUtils;
import com.google.android.gms.internal.ads.zzdek;
import o.InterfaceC11300zs1;
import o.InterfaceC5056aJ2;

/* loaded from: classes2.dex */
public final class zzbm implements zzdek {
    public final zzb X;
    public final int Y;
    @InterfaceC11300zs1
    public final String Z;

    @InterfaceC5056aJ2
    public zzbm(zzb zzbVar, int i, @InterfaceC11300zs1 String str) {
        this.X = zzbVar;
        this.Y = i;
        this.Z = str;
    }

    @Override // com.google.android.gms.internal.ads.zzdek
    public final void S(@InterfaceC11300zs1 String str) {
    }

    @Override // com.google.android.gms.internal.ads.zzdek
    public final void a(@InterfaceC11300zs1 final zzbk zzbkVar) {
        if (zzbkVar != null && this.Y == 2 && !TextUtils.isEmpty(this.Z)) {
            com.google.android.gms.ads.internal.util.zzs.N(new Runnable() { // from class: com.google.android.gms.ads.nonagon.signalgeneration.zzbl
                @Override // java.lang.Runnable
                public final void run() {
                    r0.X.d(zzbm.this.Z, zzbkVar);
                }
            });
        }
    }
}
