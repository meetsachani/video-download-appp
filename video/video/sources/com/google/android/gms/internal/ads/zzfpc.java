package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.DeadObjectException;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import com.google.android.gms.common.internal.BaseGmsClient;

/* loaded from: classes2.dex */
public final class zzfpc extends com.google.android.gms.ads.internal.zzc {
    public final int F1;

    public zzfpc(Context context, Looper looper, BaseGmsClient.BaseConnectionCallbacks baseConnectionCallbacks, BaseGmsClient.BaseOnConnectionFailedListener baseOnConnectionFailedListener, int i) {
        super(context, looper, 116, baseConnectionCallbacks, baseOnConnectionFailedListener, null);
        this.F1 = i;
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient
    public final String M() {
        return "com.google.android.gms.gass.internal.IGassService";
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient
    public final String N() {
        return "com.google.android.gms.gass.START";
    }

    public final zzfph q0() throws DeadObjectException {
        return (zzfph) super.L();
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient, com.google.android.gms.common.api.Api.Client
    public final int s() {
        return this.F1;
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient
    public final /* synthetic */ IInterface z(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.gass.internal.IGassService");
        if (queryLocalInterface instanceof zzfph) {
            return (zzfph) queryLocalInterface;
        }
        return new zzfph(iBinder);
    }
}
