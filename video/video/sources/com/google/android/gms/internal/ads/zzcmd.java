package com.google.android.gms.internal.ads;

import android.content.Context;
import o.InterfaceC11300zs1;

/* loaded from: classes2.dex */
public final class zzcmd implements zzcwo {
    public final zzfdn X;

    public zzcmd(zzfdn zzfdnVar) {
        this.X = zzfdnVar;
    }

    @Override // com.google.android.gms.internal.ads.zzcwo
    public final void t(@InterfaceC11300zs1 Context context) {
        try {
            this.X.l();
        } catch (zzfcw e) {
            int i = com.google.android.gms.ads.internal.util.zze.b;
            com.google.android.gms.ads.internal.util.client.zzo.h("Cannot invoke onDestroy for the mediation adapter.", e);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcwo
    public final void w(@InterfaceC11300zs1 Context context) {
        try {
            this.X.y();
        } catch (zzfcw e) {
            int i = com.google.android.gms.ads.internal.util.zze.b;
            com.google.android.gms.ads.internal.util.client.zzo.h("Cannot invoke onPause for the mediation adapter.", e);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcwo
    public final void x(@InterfaceC11300zs1 Context context) {
        try {
            zzfdn zzfdnVar = this.X;
            zzfdnVar.z();
            if (context != null) {
                zzfdnVar.x(context);
            }
        } catch (zzfcw e) {
            int i = com.google.android.gms.ads.internal.util.zze.b;
            com.google.android.gms.ads.internal.util.client.zzo.h("Cannot invoke onResume for the mediation adapter.", e);
        }
    }
}
