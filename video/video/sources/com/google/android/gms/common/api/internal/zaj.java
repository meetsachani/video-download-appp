package com.google.android.gms.common.api.internal;

import android.util.Log;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.GoogleApiClient;
import o.InterfaceC11300zs1;
import o.InterfaceC5670cr1;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class zaj implements GoogleApiClient.OnConnectionFailedListener {
    public final int X;
    public final GoogleApiClient Y;
    public final /* synthetic */ zak Y0;
    @InterfaceC11300zs1
    public final GoogleApiClient.OnConnectionFailedListener Z;

    public zaj(zak zakVar, int i, @InterfaceC11300zs1 GoogleApiClient googleApiClient, GoogleApiClient.OnConnectionFailedListener onConnectionFailedListener) {
        this.Y0 = zakVar;
        this.X = i;
        this.Y = googleApiClient;
        this.Z = onConnectionFailedListener;
    }

    @Override // com.google.android.gms.common.api.internal.OnConnectionFailedListener
    public final void o1(@InterfaceC5670cr1 ConnectionResult connectionResult) {
        Log.d("AutoManageHelper", "beginFailureResolution for ".concat(String.valueOf(connectionResult)));
        this.Y0.t(connectionResult, this.X);
    }
}
