package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.HandlerThread;
import com.facebook.ads.AdError;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.internal.BaseGmsClient;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;
import o.AD1;
import o.C5865df1;
import o.InterfaceC5056aJ2;

@InterfaceC5056aJ2
/* loaded from: classes2.dex */
final class zzfog implements BaseGmsClient.BaseConnectionCallbacks, BaseGmsClient.BaseOnConnectionFailedListener {
    @InterfaceC5056aJ2
    public final zzfpc X;
    public final String Y;
    public final LinkedBlockingQueue Y0;
    public final String Z;
    public final HandlerThread Z0;
    public final zzfnx a1;
    public final long b1;
    public final int c1;

    public zzfog(Context context, int i, int i2, String str, String str2, String str3, zzfnx zzfnxVar) {
        this.Y = str;
        this.c1 = i2;
        this.Z = str2;
        this.a1 = zzfnxVar;
        HandlerThread handlerThread = new HandlerThread("GassDGClient");
        this.Z0 = handlerThread;
        handlerThread.start();
        this.b1 = System.currentTimeMillis();
        zzfpc zzfpcVar = new zzfpc(context, handlerThread.getLooper(), this, this, 19621000);
        this.X = zzfpcVar;
        this.Y0 = new LinkedBlockingQueue();
        zzfpcVar.x();
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient.BaseConnectionCallbacks
    public final void O0(Bundle bundle) {
        zzfph c = c();
        if (c != null) {
            try {
                zzfpo h5 = c.h5(new zzfpm(1, this.c1, this.Y, this.Z));
                d(5011, this.b1, null);
                this.Y0.put(h5);
            } finally {
                try {
                } finally {
                }
            }
        }
    }

    public final zzfpo a(int i) {
        zzfpo zzfpoVar;
        try {
            zzfpoVar = (zzfpo) this.Y0.poll(C5865df1.d.u, TimeUnit.MILLISECONDS);
        } catch (InterruptedException e) {
            d(AdError.INTERSTITIAL_AD_TIMEOUT, this.b1, e);
            zzfpoVar = null;
        }
        d(AD1.o1, this.b1, null);
        if (zzfpoVar != null) {
            if (zzfpoVar.Z == 7) {
                zzfnx.g(3);
            } else {
                zzfnx.g(2);
            }
        }
        if (zzfpoVar == null) {
            return new zzfpo(null, 1);
        }
        return zzfpoVar;
    }

    public final void b() {
        zzfpc zzfpcVar = this.X;
        if (zzfpcVar != null) {
            if (zzfpcVar.a() || zzfpcVar.h()) {
                zzfpcVar.c();
            }
        }
    }

    public final zzfph c() {
        try {
            return this.X.q0();
        } catch (DeadObjectException | IllegalStateException unused) {
            return null;
        }
    }

    public final void d(int i, long j, Exception exc) {
        this.a1.c(i, System.currentTimeMillis() - j, exc);
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient.BaseConnectionCallbacks
    public final void g1(int i) {
        try {
            d(4011, this.b1, null);
            this.Y0.put(new zzfpo(null, 1));
        } catch (InterruptedException unused) {
        }
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient.BaseOnConnectionFailedListener
    public final void o1(ConnectionResult connectionResult) {
        try {
            d(4012, this.b1, null);
            this.Y0.put(new zzfpo(null, 1));
        } catch (InterruptedException unused) {
        }
    }
}
