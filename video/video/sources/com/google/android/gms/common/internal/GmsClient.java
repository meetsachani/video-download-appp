package com.google.android.gms.common.internal;

import android.accounts.Account;
import android.content.Context;
import android.os.Handler;
import android.os.IInterface;
import android.os.Looper;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.GoogleApiAvailability;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.api.internal.ConnectionCallbacks;
import com.google.android.gms.common.api.internal.OnConnectionFailedListener;
import com.google.android.gms.common.util.VisibleForTesting;
import java.util.Collections;
import java.util.Set;
import java.util.concurrent.Executor;
import o.InterfaceC11300zs1;
import o.InterfaceC5670cr1;

@KeepForSdk
/* loaded from: classes2.dex */
public abstract class GmsClient<T extends IInterface> extends BaseGmsClient<T> implements Api.Client, zaj {
    @InterfaceC11300zs1
    public static volatile Executor I1;
    public final ClientSettings F1;
    public final Set<Scope> G1;
    @InterfaceC11300zs1
    public final Account H1;

    @VisibleForTesting
    @KeepForSdk
    public GmsClient(@InterfaceC5670cr1 Context context, @InterfaceC5670cr1 Handler handler, int i, @InterfaceC5670cr1 ClientSettings clientSettings) {
        super(context, handler, GmsClientSupervisor.e(context), GoogleApiAvailability.x(), i, null, null);
        this.F1 = (ClientSettings) Preconditions.r(clientSettings);
        this.H1 = clientSettings.b();
        this.G1 = s0(clientSettings.e());
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient
    @InterfaceC11300zs1
    public final Account B() {
        return this.H1;
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient
    @InterfaceC11300zs1
    public final Executor D() {
        return null;
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient
    @InterfaceC5670cr1
    @KeepForSdk
    public final Set<Scope> K() {
        return this.G1;
    }

    @Override // com.google.android.gms.common.api.Api.Client
    @InterfaceC5670cr1
    @KeepForSdk
    public Feature[] k() {
        return new Feature[0];
    }

    @Override // com.google.android.gms.common.api.Api.Client
    @InterfaceC5670cr1
    @KeepForSdk
    public Set<Scope> o() {
        if (m()) {
            return this.G1;
        }
        return Collections.EMPTY_SET;
    }

    @InterfaceC5670cr1
    @KeepForSdk
    public final ClientSettings q0() {
        return this.F1;
    }

    @InterfaceC5670cr1
    @KeepForSdk
    public Set<Scope> r0(@InterfaceC5670cr1 Set<Scope> set) {
        return set;
    }

    public final Set<Scope> s0(@InterfaceC5670cr1 Set<Scope> set) {
        Set<Scope> r0 = r0(set);
        for (Scope scope : r0) {
            if (!set.contains(scope)) {
                throw new IllegalStateException("Expanding scopes is not permitted, use implied scopes instead");
            }
        }
        return r0;
    }

    @KeepForSdk
    public GmsClient(@InterfaceC5670cr1 Context context, @InterfaceC5670cr1 Looper looper, int i, @InterfaceC5670cr1 ClientSettings clientSettings) {
        this(context, looper, GmsClientSupervisor.e(context), GoogleApiAvailability.x(), i, clientSettings, null, null);
    }

    @KeepForSdk
    @Deprecated
    public GmsClient(@InterfaceC5670cr1 Context context, @InterfaceC5670cr1 Looper looper, int i, @InterfaceC5670cr1 ClientSettings clientSettings, @InterfaceC5670cr1 GoogleApiClient.ConnectionCallbacks connectionCallbacks, @InterfaceC5670cr1 GoogleApiClient.OnConnectionFailedListener onConnectionFailedListener) {
        this(context, looper, i, clientSettings, (ConnectionCallbacks) connectionCallbacks, (OnConnectionFailedListener) onConnectionFailedListener);
    }

    @KeepForSdk
    public GmsClient(@InterfaceC5670cr1 Context context, @InterfaceC5670cr1 Looper looper, int i, @InterfaceC5670cr1 ClientSettings clientSettings, @InterfaceC5670cr1 ConnectionCallbacks connectionCallbacks, @InterfaceC5670cr1 OnConnectionFailedListener onConnectionFailedListener) {
        this(context, looper, GmsClientSupervisor.e(context), GoogleApiAvailability.x(), i, clientSettings, (ConnectionCallbacks) Preconditions.r(connectionCallbacks), (OnConnectionFailedListener) Preconditions.r(onConnectionFailedListener));
    }

    @VisibleForTesting
    public GmsClient(@InterfaceC5670cr1 Context context, @InterfaceC5670cr1 Looper looper, @InterfaceC5670cr1 GmsClientSupervisor gmsClientSupervisor, @InterfaceC5670cr1 GoogleApiAvailability googleApiAvailability, int i, @InterfaceC5670cr1 ClientSettings clientSettings, @InterfaceC11300zs1 ConnectionCallbacks connectionCallbacks, @InterfaceC11300zs1 OnConnectionFailedListener onConnectionFailedListener) {
        super(context, looper, gmsClientSupervisor, googleApiAvailability, i, connectionCallbacks == null ? null : new zah(connectionCallbacks), onConnectionFailedListener != null ? new zai(onConnectionFailedListener) : null, clientSettings.m());
        this.F1 = clientSettings;
        this.H1 = clientSettings.b();
        this.G1 = s0(clientSettings.e());
    }
}
