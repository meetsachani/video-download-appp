package com.google.android.gms.measurement.internal;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import com.google.android.gms.common.GooglePlayServicesUtilLight;
import com.google.android.gms.common.internal.BaseGmsClient;
import o.InterfaceC5670cr1;

/* loaded from: classes3.dex */
public final class zzfs extends BaseGmsClient<zzfk> {
    public zzfs(Context context, Looper looper, BaseGmsClient.BaseConnectionCallbacks baseConnectionCallbacks, BaseGmsClient.BaseOnConnectionFailedListener baseOnConnectionFailedListener) {
        super(context, looper, 93, baseConnectionCallbacks, baseOnConnectionFailedListener, null);
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient
    @InterfaceC5670cr1
    public final String M() {
        return "com.google.android.gms.measurement.internal.IMeasurementService";
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient
    @InterfaceC5670cr1
    public final String N() {
        return "com.google.android.gms.measurement.START";
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient, com.google.android.gms.common.api.Api.Client
    public final int s() {
        return GooglePlayServicesUtilLight.a;
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient
    public final /* synthetic */ zzfk z(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.measurement.internal.IMeasurementService");
        if (queryLocalInterface instanceof zzfk) {
            return (zzfk) queryLocalInterface;
        }
        return new zzfm(iBinder);
    }
}
