package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.Status;
import o.InterfaceC5670cr1;

/* loaded from: classes2.dex */
final class zaba implements GoogleApiClient.OnConnectionFailedListener {
    public final /* synthetic */ StatusPendingResult X;

    public zaba(zabe zabeVar, StatusPendingResult statusPendingResult) {
        this.X = statusPendingResult;
    }

    @Override // com.google.android.gms.common.api.internal.OnConnectionFailedListener
    public final void o1(@InterfaceC5670cr1 ConnectionResult connectionResult) {
        this.X.o(new Status(8));
    }
}
