package com.google.android.gms.common.api.internal;

import android.os.Bundle;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.internal.Preconditions;
import java.util.concurrent.atomic.AtomicReference;
import o.InterfaceC11300zs1;

/* loaded from: classes2.dex */
final class zaaz implements GoogleApiClient.ConnectionCallbacks {
    public final /* synthetic */ AtomicReference X;
    public final /* synthetic */ StatusPendingResult Y;
    public final /* synthetic */ zabe Z;

    public zaaz(zabe zabeVar, AtomicReference atomicReference, StatusPendingResult statusPendingResult) {
        this.Z = zabeVar;
        this.X = atomicReference;
        this.Y = statusPendingResult;
    }

    @Override // com.google.android.gms.common.api.internal.ConnectionCallbacks
    public final void O0(@InterfaceC11300zs1 Bundle bundle) {
        this.Z.T((GoogleApiClient) Preconditions.r((GoogleApiClient) this.X.get()), this.Y, true);
    }

    @Override // com.google.android.gms.common.api.internal.ConnectionCallbacks
    public final void g1(int i) {
    }
}
