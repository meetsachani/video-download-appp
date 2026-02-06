package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.DeadObjectException;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.internal.BaseGmsClient;
import com.google.android.gms.common.util.ArrayUtils;
import o.InterfaceC5056aJ2;

/* loaded from: classes2.dex */
public final class zzbbe extends com.google.android.gms.ads.internal.zzc {
    public zzbbe(Context context, Looper looper, BaseGmsClient.BaseConnectionCallbacks baseConnectionCallbacks, BaseGmsClient.BaseOnConnectionFailedListener baseOnConnectionFailedListener) {
        super(zzbvv.a(context), looper, 123, baseConnectionCallbacks, baseOnConnectionFailedListener, null);
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient
    public final Feature[] C() {
        return com.google.android.gms.ads.zzh.b;
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient
    @InterfaceC5056aJ2
    public final String M() {
        return "com.google.android.gms.ads.internal.cache.ICacheService";
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient
    @InterfaceC5056aJ2
    public final String N() {
        return "com.google.android.gms.ads.service.CACHE";
    }

    public final boolean q0() {
        Feature[] t = t();
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.c().b(zzbcv.c2)).booleanValue() && ArrayUtils.d(t, com.google.android.gms.ads.zzh.a)) {
            return true;
        }
        return false;
    }

    public final zzbbh r0() throws DeadObjectException {
        return (zzbbh) super.L();
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient
    @InterfaceC5056aJ2
    public final /* synthetic */ IInterface z(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.cache.ICacheService");
        if (queryLocalInterface instanceof zzbbh) {
            return (zzbbh) queryLocalInterface;
        }
        return new zzbbh(iBinder);
    }
}
