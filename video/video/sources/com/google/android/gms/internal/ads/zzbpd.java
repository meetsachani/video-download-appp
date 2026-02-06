package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.RemoteException;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import java.util.concurrent.atomic.AtomicBoolean;
import o.InterfaceC11300zs1;

/* loaded from: classes2.dex */
public final class zzbpd {
    public static zzbpd b;
    public final AtomicBoolean a = new AtomicBoolean(false);

    public static zzbpd a() {
        if (b == null) {
            b = new zzbpd();
        }
        return b;
    }

    @InterfaceC11300zs1
    public final Thread b(final Context context, @InterfaceC11300zs1 final String str) {
        if (!this.a.compareAndSet(false, true)) {
            return null;
        }
        Thread thread = new Thread(new Runnable(this) { // from class: com.google.android.gms.internal.ads.zzbpc
            @Override // java.lang.Runnable
            public final void run() {
                Context context2 = context;
                zzbcv.a(context2);
                if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.c().b(zzbcv.K0)).booleanValue()) {
                    return;
                }
                Bundle bundle = new Bundle();
                bundle.putBoolean("measurementEnabled", ((Boolean) com.google.android.gms.ads.internal.client.zzbd.c().b(zzbcv.z0)).booleanValue());
                if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.c().b(zzbcv.G0)).booleanValue()) {
                    bundle.putString("ad_storage", "denied");
                    bundle.putString("analytics_storage", "denied");
                }
                try {
                    ((zzcha) com.google.android.gms.ads.internal.util.client.zzs.b(context2, "com.google.android.gms.ads.measurement.DynamiteMeasurementManager", new com.google.android.gms.ads.internal.util.client.zzq() { // from class: com.google.android.gms.internal.ads.zzbpb
                        @Override // com.google.android.gms.ads.internal.util.client.zzq
                        public final Object b(Object obj) {
                            return zzcgz.W7((IBinder) obj);
                        }
                    })).Y5(ObjectWrapper.V3(context2), new zzbpa(AppMeasurementSdk.l(context2, "FA-Ads", "am", str, bundle)));
                } catch (RemoteException | com.google.android.gms.ads.internal.util.client.zzr | NullPointerException e) {
                    com.google.android.gms.ads.internal.util.client.zzo.i("#007 Could not call remote method.", e);
                }
            }
        });
        thread.start();
        return thread;
    }
}
