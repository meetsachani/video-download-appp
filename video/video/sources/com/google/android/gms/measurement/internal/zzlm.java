package com.google.android.gms.measurement.internal;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.RemoteException;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.internal.BaseGmsClient;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.stats.ConnectionTracker;
import o.InterfaceC10389w71;
import o.InterfaceC10697xN2;
import o.InterfaceC5670cr1;

/* loaded from: classes3.dex */
public final class zzlm implements ServiceConnection, BaseGmsClient.BaseConnectionCallbacks, BaseGmsClient.BaseOnConnectionFailedListener {
    public volatile boolean X;
    public volatile zzfs Y;
    public final /* synthetic */ zzkp Z;

    public zzlm(zzkp zzkpVar) {
        this.Z = zzkpVar;
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient.BaseConnectionCallbacks
    @InterfaceC10389w71
    public final void O0(Bundle bundle) {
        Preconditions.k("MeasurementServiceConnection.onConnected");
        synchronized (this) {
            try {
                Preconditions.r(this.Y);
                this.Z.l().D(new zzln(this, this.Y.L()));
            } catch (DeadObjectException | IllegalStateException unused) {
                this.Y = null;
                this.X = false;
            }
        }
    }

    @InterfaceC10697xN2
    public final void a() {
        this.Z.n();
        Context a = this.Z.a();
        synchronized (this) {
            try {
                if (this.X) {
                    this.Z.j().K().a("Connection attempt already in progress");
                } else if (this.Y != null && (this.Y.h() || this.Y.a())) {
                    this.Z.j().K().a("Already awaiting connection attempt");
                } else {
                    this.Y = new zzfs(a, Looper.getMainLooper(), this, this);
                    this.Z.j().K().a("Connecting to remote service");
                    this.X = true;
                    Preconditions.r(this.Y);
                    this.Y.x();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @InterfaceC10697xN2
    public final void b(Intent intent) {
        zzlm zzlmVar;
        this.Z.n();
        Context a = this.Z.a();
        ConnectionTracker b = ConnectionTracker.b();
        synchronized (this) {
            try {
                if (this.X) {
                    this.Z.j().K().a("Connection attempt already in progress");
                    return;
                }
                this.Z.j().K().a("Using local app measurement service");
                this.X = true;
                zzlmVar = this.Z.c;
                b.a(a, intent, zzlmVar, 129);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @InterfaceC10697xN2
    public final void d() {
        if (this.Y != null && (this.Y.a() || this.Y.h())) {
            this.Y.c();
        }
        this.Y = null;
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient.BaseConnectionCallbacks
    @InterfaceC10389w71
    public final void g1(int i) {
        Preconditions.k("MeasurementServiceConnection.onConnectionSuspended");
        this.Z.j().F().a("Service connection suspended");
        this.Z.l().D(new zzlq(this));
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient.BaseOnConnectionFailedListener
    @InterfaceC10389w71
    public final void o1(@InterfaceC5670cr1 ConnectionResult connectionResult) {
        Preconditions.k("MeasurementServiceConnection.onConnectionFailed");
        zzfr E = this.Z.a.E();
        if (E != null) {
            E.L().b("Service connection failed", connectionResult);
        }
        synchronized (this) {
            this.X = false;
            this.Y = null;
        }
        this.Z.l().D(new zzlp(this));
    }

    @Override // android.content.ServiceConnection
    @InterfaceC10389w71
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        zzlm zzlmVar;
        zzfk zzfmVar;
        Preconditions.k("MeasurementServiceConnection.onServiceConnected");
        synchronized (this) {
            if (iBinder == null) {
                this.X = false;
                this.Z.j().G().a("Service connected with null binder");
                return;
            }
            zzfk zzfkVar = null;
            try {
                String interfaceDescriptor = iBinder.getInterfaceDescriptor();
                if ("com.google.android.gms.measurement.internal.IMeasurementService".equals(interfaceDescriptor)) {
                    IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.measurement.internal.IMeasurementService");
                    if (queryLocalInterface instanceof zzfk) {
                        zzfmVar = (zzfk) queryLocalInterface;
                    } else {
                        zzfmVar = new zzfm(iBinder);
                    }
                    zzfkVar = zzfmVar;
                    this.Z.j().K().a("Bound to IMeasurementService interface");
                } else {
                    this.Z.j().G().b("Got binder with a wrong descriptor", interfaceDescriptor);
                }
            } catch (RemoteException unused) {
                this.Z.j().G().a("Service connect failed to get IMeasurementService");
            }
            if (zzfkVar == null) {
                this.X = false;
                try {
                    ConnectionTracker b = ConnectionTracker.b();
                    Context a = this.Z.a();
                    zzlmVar = this.Z.c;
                    b.c(a, zzlmVar);
                } catch (IllegalArgumentException unused2) {
                }
            } else {
                this.Z.l().D(new zzll(this, zzfkVar));
            }
        }
    }

    @Override // android.content.ServiceConnection
    @InterfaceC10389w71
    public final void onServiceDisconnected(ComponentName componentName) {
        Preconditions.k("MeasurementServiceConnection.onServiceDisconnected");
        this.Z.j().F().a("Service disconnected");
        this.Z.l().D(new zzlo(this, componentName));
    }
}
