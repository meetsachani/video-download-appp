package com.google.android.gms.common.internal.service;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.common.internal.TelemetryData;

/* loaded from: classes2.dex */
public final class zai extends com.google.android.gms.internal.base.zaa implements IInterface {
    public zai(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.common.internal.service.IClientTelemetryService");
    }

    public final void r4(TelemetryData telemetryData) throws RemoteException {
        Parcel O0 = O0();
        com.google.android.gms.internal.base.zac.c(O0, telemetryData);
        V3(1, O0);
    }
}
