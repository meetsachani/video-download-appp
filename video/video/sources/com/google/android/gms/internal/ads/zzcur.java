package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.ArrayList;
import o.InterfaceC11300zs1;

/* loaded from: classes2.dex */
final class zzcur implements zzcxh, zzcwo {
    public final zzfbu X;

    public zzcur(Context context, zzfbu zzfbuVar, zzbtq zzbtqVar) {
        this.X = zzfbuVar;
    }

    @Override // com.google.android.gms.internal.ads.zzcwo
    public final void t(@InterfaceC11300zs1 Context context) {
    }

    @Override // com.google.android.gms.internal.ads.zzcxh
    public final void v() {
        zzbtr zzbtrVar = this.X.d0;
        if (zzbtrVar != null && zzbtrVar.a) {
            ArrayList arrayList = new ArrayList();
            String str = zzbtrVar.b;
            if (!str.isEmpty()) {
                arrayList.add(str);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcwo
    public final void w(@InterfaceC11300zs1 Context context) {
    }

    @Override // com.google.android.gms.internal.ads.zzcwo
    public final void x(@InterfaceC11300zs1 Context context) {
    }
}
