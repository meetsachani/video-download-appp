package com.google.android.gms.ads.internal.client;

import com.google.android.gms.ads.AdInspectorError;
import com.google.android.gms.ads.OnAdInspectorClosedListener;
import o.InterfaceC11300zs1;

/* loaded from: classes2.dex */
final class zzeq extends zzdj {
    private zzeq() {
        throw null;
    }

    @Override // com.google.android.gms.ads.internal.client.zzdk
    public final void U2(@InterfaceC11300zs1 zze zzeVar) {
        AdInspectorError adInspectorError;
        OnAdInspectorClosedListener f = zzet.f(zzet.j());
        if (f != null) {
            if (zzeVar == null) {
                adInspectorError = null;
            } else {
                adInspectorError = new AdInspectorError(zzeVar.X, zzeVar.Y, zzeVar.Z);
            }
            f.a(adInspectorError);
        }
    }

    public /* synthetic */ zzeq(zzes zzesVar) {
    }
}
