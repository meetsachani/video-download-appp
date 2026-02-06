package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Binder;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.internal.BaseGmsClient;
import java.util.concurrent.Executor;
import o.InterfaceC5056aJ2;
import o.InterfaceC5670cr1;
import o.InterfaceC8710pF0;
import o.InterfaceFutureC8411o11;

/* loaded from: classes2.dex */
public abstract class zzdyb implements BaseGmsClient.BaseConnectionCallbacks, BaseGmsClient.BaseOnConnectionFailedListener {
    public zzbvl Z0;
    @InterfaceC8710pF0("lock")
    @InterfaceC5056aJ2(otherwise = 3)
    public zzbuq a1;
    public final zzcaf X = new zzcaf();
    public final Object Y = new Object();
    public boolean Z = false;
    public boolean Y0 = false;

    public static void b(Context context, InterfaceFutureC8411o11 interfaceFutureC8411o11, Executor executor) {
        if (!((Boolean) zzben.j.e()).booleanValue() && !((Boolean) zzben.h.e()).booleanValue()) {
            return;
        }
        zzgcy.r(interfaceFutureC8411o11, new zzdxy(context), executor);
    }

    public final void a() {
        synchronized (this.Y) {
            try {
                this.Y0 = true;
                if (!this.a1.a()) {
                    if (this.a1.h()) {
                    }
                    Binder.flushPendingCommands();
                }
                this.a1.c();
                Binder.flushPendingCommands();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient.BaseConnectionCallbacks
    public final void g1(int i) {
        int i2 = com.google.android.gms.ads.internal.util.zze.b;
        com.google.android.gms.ads.internal.util.client.zzo.b("Cannot connect to remote service, fallback to local instance.");
    }

    public void o1(@InterfaceC5670cr1 ConnectionResult connectionResult) {
        int i = com.google.android.gms.ads.internal.util.zze.b;
        com.google.android.gms.ads.internal.util.client.zzo.b("Disconnected from remote ad request service.");
        this.X.d(new zzdyq(1));
    }
}
