package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.HandlerThread;
import android.support.v4.media.session.PlaybackStateCompat;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.internal.BaseGmsClient;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;
import o.InterfaceC5056aJ2;

/* JADX INFO: Access modifiers changed from: package-private */
@InterfaceC5056aJ2
/* loaded from: classes2.dex */
public final class zzfoe implements BaseGmsClient.BaseConnectionCallbacks, BaseGmsClient.BaseOnConnectionFailedListener {
    @InterfaceC5056aJ2
    public final zzfpc X;
    public final String Y;
    public final LinkedBlockingQueue Y0;
    public final String Z;
    public final HandlerThread Z0;

    public zzfoe(Context context, String str, String str2) {
        this.Y = str;
        this.Z = str2;
        HandlerThread handlerThread = new HandlerThread("GassClient");
        this.Z0 = handlerThread;
        handlerThread.start();
        zzfpc zzfpcVar = new zzfpc(context, handlerThread.getLooper(), this, this, 9200000);
        this.X = zzfpcVar;
        this.Y0 = new LinkedBlockingQueue();
        zzfpcVar.x();
    }

    @InterfaceC5056aJ2
    public static zzath a() {
        zzask S2 = zzath.S2();
        S2.Z1(PlaybackStateCompat.w1);
        return (zzath) S2.V1();
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient.BaseConnectionCallbacks
    public final void O0(Bundle bundle) {
        zzfph d = d();
        if (d != null) {
            try {
                try {
                    this.Y0.put(d.r4(new zzfpd(this.Y, this.Z)).m0());
                } catch (InterruptedException unused) {
                } catch (Throwable th) {
                    c();
                    this.Z0.quit();
                    throw th;
                }
            } catch (Throwable unused2) {
                this.Y0.put(a());
            }
            c();
            this.Z0.quit();
        }
    }

    public final zzath b(int i) {
        zzath zzathVar;
        try {
            zzathVar = (zzath) this.Y0.poll(5000L, TimeUnit.MILLISECONDS);
        } catch (InterruptedException unused) {
            zzathVar = null;
        }
        if (zzathVar == null) {
            return a();
        }
        return zzathVar;
    }

    public final void c() {
        zzfpc zzfpcVar = this.X;
        if (zzfpcVar != null) {
            if (zzfpcVar.a() || zzfpcVar.h()) {
                zzfpcVar.c();
            }
        }
    }

    public final zzfph d() {
        try {
            return this.X.q0();
        } catch (DeadObjectException | IllegalStateException unused) {
            return null;
        }
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient.BaseConnectionCallbacks
    public final void g1(int i) {
        try {
            this.Y0.put(a());
        } catch (InterruptedException unused) {
        }
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient.BaseOnConnectionFailedListener
    public final void o1(ConnectionResult connectionResult) {
        try {
            this.Y0.put(a());
        } catch (InterruptedException unused) {
        }
    }
}
