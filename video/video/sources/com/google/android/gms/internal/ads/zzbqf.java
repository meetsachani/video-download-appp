package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import com.google.android.gms.ads.mediation.InitializationCompleteCallback;

/* loaded from: classes2.dex */
final class zzbqf implements InitializationCompleteCallback {
    public final /* synthetic */ zzbly a;

    public zzbqf(zzbqm zzbqmVar, zzbly zzblyVar) {
        this.a = zzblyVar;
    }

    @Override // com.google.android.gms.ads.mediation.InitializationCompleteCallback
    public final void a(String str) {
        try {
            this.a.u(str);
        } catch (RemoteException e) {
            com.google.android.gms.ads.internal.util.client.zzo.e("", e);
        }
    }

    @Override // com.google.android.gms.ads.mediation.InitializationCompleteCallback
    public final void b() {
        try {
            this.a.e();
        } catch (RemoteException e) {
            com.google.android.gms.ads.internal.util.client.zzo.e("", e);
        }
    }
}
