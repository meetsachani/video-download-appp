package com.google.android.gms.ads.internal.client;

import com.google.android.gms.ads.AdValue;
import com.google.android.gms.ads.OnPaidEventListener;
import o.InterfaceC11300zs1;

/* loaded from: classes2.dex */
public final class zzfo extends zzdp {
    @InterfaceC11300zs1
    public final OnPaidEventListener X;

    public zzfo(@InterfaceC11300zs1 OnPaidEventListener onPaidEventListener) {
        this.X = onPaidEventListener;
    }

    @Override // com.google.android.gms.ads.internal.client.zzdq
    public final void a7(zzt zztVar) {
        OnPaidEventListener onPaidEventListener = this.X;
        if (onPaidEventListener != null) {
            onPaidEventListener.a(AdValue.d(zztVar.Y, zztVar.Z, zztVar.Y0));
        }
    }

    @Override // com.google.android.gms.ads.internal.client.zzdq
    public final boolean e() {
        return this.X == null;
    }
}
