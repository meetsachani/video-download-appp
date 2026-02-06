package com.google.android.gms.common.api.internal;

import android.os.Bundle;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.internal.Preconditions;
import o.InterfaceC11300zs1;
import o.InterfaceC5670cr1;

/* loaded from: classes2.dex */
public final class zat implements GoogleApiClient.ConnectionCallbacks, GoogleApiClient.OnConnectionFailedListener {
    public final Api<?> X;
    public final boolean Y;
    @InterfaceC11300zs1
    public zau Z;

    public zat(Api<?> api, boolean z) {
        this.X = api;
        this.Y = z;
    }

    @Override // com.google.android.gms.common.api.internal.ConnectionCallbacks
    public final void O0(@InterfaceC11300zs1 Bundle bundle) {
        b().O0(bundle);
    }

    public final void a(zau zauVar) {
        this.Z = zauVar;
    }

    public final zau b() {
        Preconditions.s(this.Z, "Callbacks must be attached to a ClientConnectionHelper instance before connecting the client.");
        return this.Z;
    }

    @Override // com.google.android.gms.common.api.internal.ConnectionCallbacks
    public final void g1(int i) {
        b().g1(i);
    }

    @Override // com.google.android.gms.common.api.internal.OnConnectionFailedListener
    public final void o1(@InterfaceC5670cr1 ConnectionResult connectionResult) {
        b().V3(connectionResult, this.X, this.Y);
    }
}
