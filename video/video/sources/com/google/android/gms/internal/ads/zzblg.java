package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.DeadObjectException;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import com.google.android.gms.common.internal.BaseGmsClient;
import o.C10997yd1;
import o.InterfaceC5056aJ2;

/* loaded from: classes2.dex */
public final class zzblg extends com.google.android.gms.ads.internal.zzc {
    public zzblg(Context context, Looper looper, BaseGmsClient.BaseConnectionCallbacks baseConnectionCallbacks, BaseGmsClient.BaseOnConnectionFailedListener baseOnConnectionFailedListener) {
        super(zzbvv.a(context), looper, C10997yd1.t1, baseConnectionCallbacks, baseOnConnectionFailedListener, null);
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient
    @InterfaceC5056aJ2
    public final String M() {
        return "com.google.android.gms.ads.internal.httpcache.IHttpAssetsCacheService";
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient
    @InterfaceC5056aJ2
    public final String N() {
        return "com.google.android.gms.ads.service.HTTP";
    }

    public final zzbln q0() throws DeadObjectException {
        return (zzbln) super.L();
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient
    @InterfaceC5056aJ2
    public final /* synthetic */ IInterface z(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.httpcache.IHttpAssetsCacheService");
        if (queryLocalInterface instanceof zzbln) {
            return (zzbln) queryLocalInterface;
        }
        return new zzbln(iBinder);
    }
}
