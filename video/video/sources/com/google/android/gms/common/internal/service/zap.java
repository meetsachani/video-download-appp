package com.google.android.gms.common.internal.service;

import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.api.internal.ConnectionCallbacks;
import com.google.android.gms.common.api.internal.OnConnectionFailedListener;
import com.google.android.gms.common.internal.ClientSettings;
import com.google.android.gms.common.internal.GmsClient;
import com.google.android.gms.common.internal.TelemetryLoggingOptions;
import o.C4731Xo;
import o.InterfaceC11300zs1;
import o.InterfaceC5670cr1;

/* loaded from: classes2.dex */
public final class zap extends GmsClient<zai> {
    public final TelemetryLoggingOptions J1;

    public zap(Context context, Looper looper, ClientSettings clientSettings, TelemetryLoggingOptions telemetryLoggingOptions, ConnectionCallbacks connectionCallbacks, OnConnectionFailedListener onConnectionFailedListener) {
        super(context, looper, (int) C4731Xo.d1, clientSettings, connectionCallbacks, onConnectionFailedListener);
        this.J1 = telemetryLoggingOptions;
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient
    public final Feature[] C() {
        return com.google.android.gms.internal.base.zad.b;
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient
    public final Bundle H() {
        return this.J1.b();
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient
    @InterfaceC5670cr1
    public final String M() {
        return "com.google.android.gms.common.internal.service.IClientTelemetryService";
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient
    @InterfaceC5670cr1
    public final String N() {
        return "com.google.android.gms.common.telemetry.service.START";
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient
    public final boolean Q() {
        return true;
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient, com.google.android.gms.common.api.Api.Client
    public final int s() {
        return 203400000;
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient
    @InterfaceC11300zs1
    public final /* synthetic */ IInterface z(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.service.IClientTelemetryService");
        if (queryLocalInterface instanceof zai) {
            return (zai) queryLocalInterface;
        }
        return new zai(iBinder);
    }
}
