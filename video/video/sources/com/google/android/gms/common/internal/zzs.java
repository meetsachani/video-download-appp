package com.google.android.gms.common.internal;

import android.content.Context;
import android.content.ServiceConnection;
import android.os.Handler;
import android.os.Looper;
import com.google.android.gms.common.stats.ConnectionTracker;
import java.util.HashMap;
import java.util.concurrent.Executor;
import o.InterfaceC11300zs1;
import o.InterfaceC7980mF0;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class zzs extends GmsClientSupervisor {
    @InterfaceC7980mF0("connectionStatus")
    public final HashMap f = new HashMap();
    public final Context g;
    public volatile Handler h;
    public final zzr i;
    public final ConnectionTracker j;
    public final long k;
    public final long l;
    @InterfaceC11300zs1
    public volatile Executor m;

    public zzs(Context context, Looper looper, @InterfaceC11300zs1 Executor executor) {
        zzr zzrVar = new zzr(this, null);
        this.i = zzrVar;
        this.g = context.getApplicationContext();
        this.h = new com.google.android.gms.internal.common.zzi(looper, zzrVar);
        this.j = ConnectionTracker.b();
        this.k = 5000L;
        this.l = 300000L;
        this.m = executor;
    }

    @Override // com.google.android.gms.common.internal.GmsClientSupervisor
    public final void l(zzo zzoVar, ServiceConnection serviceConnection, String str) {
        Preconditions.s(serviceConnection, "ServiceConnection must not be null");
        synchronized (this.f) {
            try {
                zzp zzpVar = (zzp) this.f.get(zzoVar);
                if (zzpVar != null) {
                    if (zzpVar.h(serviceConnection)) {
                        zzpVar.f(serviceConnection, str);
                        if (zzpVar.i()) {
                            this.h.sendMessageDelayed(this.h.obtainMessage(0, zzoVar), this.k);
                        }
                    } else {
                        String obj = zzoVar.toString();
                        throw new IllegalStateException("Trying to unbind a GmsServiceConnection  that was not bound before.  config=" + obj);
                    }
                } else {
                    String obj2 = zzoVar.toString();
                    throw new IllegalStateException("Nonexistent connection status for service config: " + obj2);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.google.android.gms.common.internal.GmsClientSupervisor
    public final boolean n(zzo zzoVar, ServiceConnection serviceConnection, String str, @InterfaceC11300zs1 Executor executor) {
        boolean j;
        Preconditions.s(serviceConnection, "ServiceConnection must not be null");
        synchronized (this.f) {
            try {
                zzp zzpVar = (zzp) this.f.get(zzoVar);
                if (executor == null) {
                    executor = this.m;
                }
                if (zzpVar == null) {
                    zzpVar = new zzp(this, zzoVar);
                    zzpVar.d(serviceConnection, serviceConnection, str);
                    zzpVar.e(str, executor);
                    this.f.put(zzoVar, zzpVar);
                } else {
                    this.h.removeMessages(0, zzoVar);
                    if (!zzpVar.h(serviceConnection)) {
                        zzpVar.d(serviceConnection, serviceConnection, str);
                        int a = zzpVar.a();
                        if (a != 1) {
                            if (a == 2) {
                                zzpVar.e(str, executor);
                            }
                        } else {
                            serviceConnection.onServiceConnected(zzpVar.b(), zzpVar.c());
                        }
                    } else {
                        String obj = zzoVar.toString();
                        throw new IllegalStateException("Trying to bind a GmsServiceConnection that was already connected before.  config=" + obj);
                    }
                }
                j = zzpVar.j();
            } catch (Throwable th) {
                throw th;
            }
        }
        return j;
    }

    public final void t(@InterfaceC11300zs1 Executor executor) {
        synchronized (this.f) {
            this.m = executor;
        }
    }

    public final void u(Looper looper) {
        synchronized (this.f) {
            this.h = new com.google.android.gms.internal.common.zzi(looper, this.i);
        }
    }
}
