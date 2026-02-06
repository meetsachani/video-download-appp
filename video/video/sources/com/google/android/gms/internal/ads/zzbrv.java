package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import com.google.android.gms.ads.AdError;
import com.google.android.gms.ads.mediation.rtb.SignalCallbacks;

/* loaded from: classes2.dex */
final class zzbrv implements SignalCallbacks {
    public final /* synthetic */ zzbrn a;

    public zzbrv(zzbrx zzbrxVar, zzbrn zzbrnVar) {
        this.a = zzbrnVar;
    }

    @Override // com.google.android.gms.ads.mediation.rtb.SignalCallbacks
    public final void a(String str) {
        try {
            this.a.u(str);
        } catch (RemoteException e) {
            com.google.android.gms.ads.internal.util.client.zzo.e("", e);
        }
    }

    @Override // com.google.android.gms.ads.mediation.rtb.SignalCallbacks
    public final void q0(String str) {
        try {
            this.a.S(str);
        } catch (RemoteException e) {
            com.google.android.gms.ads.internal.util.client.zzo.e("", e);
        }
    }

    @Override // com.google.android.gms.ads.mediation.rtb.SignalCallbacks
    public final void r0(AdError adError) {
        try {
            this.a.D1(adError.e());
        } catch (RemoteException e) {
            com.google.android.gms.ads.internal.util.client.zzo.e("", e);
        }
    }
}
