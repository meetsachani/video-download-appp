package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.IBinder;
import android.os.RemoteException;
import com.google.android.gms.dynamic.ObjectWrapper;
import java.util.concurrent.ExecutorService;
import o.InterfaceC5056aJ2;

/* loaded from: classes2.dex */
public final class zzbbz {
    @InterfaceC5056aJ2
    public zzayp a;
    @InterfaceC5056aJ2
    public boolean b;
    public final ExecutorService c;

    public zzbbz() {
        this.c = com.google.android.gms.ads.internal.util.client.zzb.b;
    }

    public zzbbz(final Context context) {
        ExecutorService executorService = com.google.android.gms.ads.internal.util.client.zzb.b;
        this.c = executorService;
        executorService.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzbbu
            @Override // java.lang.Runnable
            public final void run() {
                boolean booleanValue = ((Boolean) com.google.android.gms.ads.internal.client.zzbd.c().b(zzbcv.q5)).booleanValue();
                zzbbz zzbbzVar = zzbbz.this;
                Context context2 = context;
                if (booleanValue) {
                    try {
                        zzbbzVar.a = (zzayp) com.google.android.gms.ads.internal.util.client.zzs.b(context2, "com.google.android.gms.ads.clearcut.DynamiteClearcutLogger", new com.google.android.gms.ads.internal.util.client.zzq() { // from class: com.google.android.gms.internal.ads.zzbbv
                            @Override // com.google.android.gms.ads.internal.util.client.zzq
                            public final Object b(Object obj) {
                                return zzayo.W7((IBinder) obj);
                            }
                        });
                        zzbbzVar.a.F3(ObjectWrapper.V3(context2), "GMA_SDK");
                        zzbbzVar.b = true;
                    } catch (RemoteException | com.google.android.gms.ads.internal.util.client.zzr | NullPointerException unused) {
                        com.google.android.gms.ads.internal.util.client.zzo.b("Cannot dynamite load clearcut");
                    }
                }
            }
        });
    }
}
