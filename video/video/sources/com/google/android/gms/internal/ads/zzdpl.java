package com.google.android.gms.internal.ads;

import android.content.Context;
import o.InterfaceC11300zs1;

/* loaded from: classes2.dex */
public final class zzdpl implements zzcwo {
    @InterfaceC11300zs1
    public final zzcfb X;

    public zzdpl(@InterfaceC11300zs1 zzcfb zzcfbVar) {
        this.X = zzcfbVar;
    }

    @Override // com.google.android.gms.internal.ads.zzcwo
    public final void t(@InterfaceC11300zs1 Context context) {
        zzcfb zzcfbVar = this.X;
        if (zzcfbVar != null) {
            zzcfbVar.destroy();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcwo
    public final void w(@InterfaceC11300zs1 Context context) {
        zzcfb zzcfbVar = this.X;
        if (zzcfbVar != null) {
            zzcfbVar.onPause();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcwo
    public final void x(@InterfaceC11300zs1 Context context) {
        zzcfb zzcfbVar = this.X;
        if (zzcfbVar != null) {
            zzcfbVar.onResume();
        }
    }
}
