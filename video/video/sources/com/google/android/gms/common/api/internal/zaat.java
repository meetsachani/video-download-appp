package com.google.android.gms.common.api.internal;

import android.os.Bundle;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.internal.ClientSettings;
import com.google.android.gms.common.internal.Preconditions;
import java.util.concurrent.locks.Lock;
import o.InterfaceC11300zs1;
import o.InterfaceC5670cr1;

/* loaded from: classes2.dex */
final class zaat implements GoogleApiClient.ConnectionCallbacks, GoogleApiClient.OnConnectionFailedListener {
    public final /* synthetic */ zaaw X;

    public /* synthetic */ zaat(zaaw zaawVar, zaas zaasVar) {
        this.X = zaawVar;
    }

    @Override // com.google.android.gms.common.api.internal.ConnectionCallbacks
    public final void O0(@InterfaceC11300zs1 Bundle bundle) {
        ClientSettings clientSettings;
        com.google.android.gms.signin.zae zaeVar;
        clientSettings = this.X.r;
        ClientSettings clientSettings2 = (ClientSettings) Preconditions.r(clientSettings);
        zaeVar = this.X.k;
        ((com.google.android.gms.signin.zae) Preconditions.r(zaeVar)).r(new zaar(this.X));
    }

    @Override // com.google.android.gms.common.api.internal.ConnectionCallbacks
    public final void g1(int i) {
    }

    @Override // com.google.android.gms.common.api.internal.OnConnectionFailedListener
    public final void o1(@InterfaceC5670cr1 ConnectionResult connectionResult) {
        Lock lock;
        Lock lock2;
        boolean q;
        Lock lock3;
        lock = this.X.b;
        lock.lock();
        try {
            q = this.X.q(connectionResult);
            if (q) {
                this.X.i();
                this.X.n();
            } else {
                this.X.l(connectionResult);
            }
            lock3 = this.X.b;
            lock3.unlock();
        } catch (Throwable th) {
            lock2 = this.X.b;
            lock2.unlock();
            throw th;
        }
    }
}
