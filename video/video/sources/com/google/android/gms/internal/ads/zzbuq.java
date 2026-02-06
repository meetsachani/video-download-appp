package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.DeadObjectException;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import com.google.android.gms.common.internal.BaseGmsClient;
import o.InterfaceC5056aJ2;

/* loaded from: classes2.dex */
public final class zzbuq extends com.google.android.gms.ads.internal.zzc {
    public zzbuq(Context context, Looper looper, BaseGmsClient.BaseConnectionCallbacks baseConnectionCallbacks, BaseGmsClient.BaseOnConnectionFailedListener baseOnConnectionFailedListener) {
        super(zzbvv.a(context), looper, 8, baseConnectionCallbacks, baseOnConnectionFailedListener, null);
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient
    @InterfaceC5056aJ2
    public final String M() {
        return "com.google.android.gms.ads.internal.request.IAdRequestService";
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient
    @InterfaceC5056aJ2
    public final String N() {
        return "com.google.android.gms.ads.service.START";
    }

    public final zzbuz q0() throws DeadObjectException {
        return (zzbuz) super.L();
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient, com.google.android.gms.common.api.Api.Client
    public final int s() {
        return 243734000;
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient
    @InterfaceC5056aJ2
    public final /* synthetic */ IInterface z(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.request.IAdRequestService");
        if (queryLocalInterface instanceof zzbuz) {
            return (zzbuz) queryLocalInterface;
        }
        return new zzbux(iBinder);
    }
}
