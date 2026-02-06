package com.google.android.gms.internal.appset;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.api.internal.ConnectionCallbacks;
import com.google.android.gms.common.api.internal.OnConnectionFailedListener;
import com.google.android.gms.common.internal.ClientSettings;
import com.google.android.gms.common.internal.GmsClient;
import o.InterfaceC11300zs1;
import o.InterfaceC5670cr1;

/* loaded from: classes2.dex */
public final class zzd extends GmsClient<zzg> {
    public zzd(Context context, Looper looper, ClientSettings clientSettings, ConnectionCallbacks connectionCallbacks, OnConnectionFailedListener onConnectionFailedListener) {
        super(context, looper, 300, clientSettings, connectionCallbacks, onConnectionFailedListener);
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient
    public final Feature[] C() {
        return com.google.android.gms.appset.zze.b;
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient
    @InterfaceC5670cr1
    public final String M() {
        return "com.google.android.gms.appset.internal.IAppSetService";
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient
    @InterfaceC5670cr1
    public final String N() {
        return "com.google.android.gms.appset.service.START";
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient
    public final boolean Q() {
        return true;
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient
    public final boolean Z() {
        return true;
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient, com.google.android.gms.common.api.Api.Client
    public final int s() {
        return 212800000;
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient
    @InterfaceC11300zs1
    public final /* synthetic */ IInterface z(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.appset.internal.IAppSetService");
        if (queryLocalInterface instanceof zzg) {
            return (zzg) queryLocalInterface;
        }
        return new zzg(iBinder);
    }
}
