package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Binder;
import android.os.Bundle;
import android.os.Looper;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.internal.BaseGmsClient;
import o.InterfaceC11300zs1;
import o.InterfaceC5670cr1;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class zzfoj implements BaseGmsClient.BaseConnectionCallbacks, BaseGmsClient.BaseOnConnectionFailedListener {
    public final zzfpc X;
    public final zzfow Y;
    public final Object Z = new Object();
    public boolean Y0 = false;
    public boolean Z0 = false;

    public zzfoj(@InterfaceC5670cr1 Context context, @InterfaceC5670cr1 Looper looper, @InterfaceC5670cr1 zzfow zzfowVar) {
        this.Y = zzfowVar;
        this.X = new zzfpc(context, looper, this, this, 12800000);
    }

    private final void b() {
        synchronized (this.Z) {
            try {
                zzfpc zzfpcVar = this.X;
                if (!zzfpcVar.a()) {
                    if (zzfpcVar.h()) {
                    }
                    Binder.flushPendingCommands();
                }
                zzfpcVar.c();
                Binder.flushPendingCommands();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient.BaseConnectionCallbacks
    public final void O0(@InterfaceC11300zs1 Bundle bundle) {
        synchronized (this.Z) {
            try {
                if (this.Z0) {
                    return;
                }
                this.Z0 = true;
                try {
                    this.X.q0().B5(new zzfpa(this.Y.b1()));
                } catch (Exception unused) {
                } catch (Throwable th) {
                    b();
                    throw th;
                }
                b();
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void a() {
        synchronized (this.Z) {
            try {
                if (!this.Y0) {
                    this.Y0 = true;
                    this.X.x();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient.BaseConnectionCallbacks
    public final void g1(int i) {
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient.BaseOnConnectionFailedListener
    public final void o1(@InterfaceC5670cr1 ConnectionResult connectionResult) {
    }
}
