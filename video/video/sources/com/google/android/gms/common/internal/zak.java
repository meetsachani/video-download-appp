package com.google.android.gms.common.internal;

import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.util.VisibleForTesting;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicInteger;
import o.InterfaceC10810xr1;
import o.InterfaceC11300zs1;

/* loaded from: classes2.dex */
public final class zak implements Handler.Callback {
    @InterfaceC10810xr1
    public final zaj X;
    public final Handler c1;
    public final ArrayList<GoogleApiClient.ConnectionCallbacks> Y = new ArrayList<>();
    @VisibleForTesting
    public final ArrayList<GoogleApiClient.ConnectionCallbacks> Z = new ArrayList<>();
    public final ArrayList<GoogleApiClient.OnConnectionFailedListener> Y0 = new ArrayList<>();
    public volatile boolean Z0 = false;
    public final AtomicInteger a1 = new AtomicInteger(0);
    public boolean b1 = false;
    public final Object d1 = new Object();

    public zak(Looper looper, zaj zajVar) {
        this.X = zajVar;
        this.c1 = new com.google.android.gms.internal.base.zaq(looper, this);
    }

    public final void a() {
        this.Z0 = false;
        this.a1.incrementAndGet();
    }

    public final void b() {
        this.Z0 = true;
    }

    @VisibleForTesting
    public final void c(ConnectionResult connectionResult) {
        Preconditions.i(this.c1, "onConnectionFailure must only be called on the Handler thread");
        this.c1.removeMessages(1);
        synchronized (this.d1) {
            try {
                ArrayList arrayList = new ArrayList(this.Y0);
                int i = this.a1.get();
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    GoogleApiClient.OnConnectionFailedListener onConnectionFailedListener = (GoogleApiClient.OnConnectionFailedListener) it.next();
                    if (this.Z0 && this.a1.get() == i) {
                        if (this.Y0.contains(onConnectionFailedListener)) {
                            onConnectionFailedListener.o1(connectionResult);
                        }
                    }
                    return;
                }
            } finally {
            }
        }
    }

    @VisibleForTesting
    public final void d(@InterfaceC11300zs1 Bundle bundle) {
        Preconditions.i(this.c1, "onConnectionSuccess must only be called on the Handler thread");
        synchronized (this.d1) {
            try {
                Preconditions.x(!this.b1);
                this.c1.removeMessages(1);
                this.b1 = true;
                Preconditions.x(this.Z.isEmpty());
                ArrayList arrayList = new ArrayList(this.Y);
                int i = this.a1.get();
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    GoogleApiClient.ConnectionCallbacks connectionCallbacks = (GoogleApiClient.ConnectionCallbacks) it.next();
                    if (!this.Z0 || !this.X.a() || this.a1.get() != i) {
                        break;
                    } else if (!this.Z.contains(connectionCallbacks)) {
                        connectionCallbacks.O0(bundle);
                    }
                }
                this.Z.clear();
                this.b1 = false;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @VisibleForTesting
    public final void e(int i) {
        Preconditions.i(this.c1, "onUnintentionalDisconnection must only be called on the Handler thread");
        this.c1.removeMessages(1);
        synchronized (this.d1) {
            try {
                this.b1 = true;
                ArrayList arrayList = new ArrayList(this.Y);
                int i2 = this.a1.get();
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    GoogleApiClient.ConnectionCallbacks connectionCallbacks = (GoogleApiClient.ConnectionCallbacks) it.next();
                    if (!this.Z0 || this.a1.get() != i2) {
                        break;
                    } else if (this.Y.contains(connectionCallbacks)) {
                        connectionCallbacks.g1(i);
                    }
                }
                this.Z.clear();
                this.b1 = false;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void f(GoogleApiClient.ConnectionCallbacks connectionCallbacks) {
        Preconditions.r(connectionCallbacks);
        synchronized (this.d1) {
            try {
                if (this.Y.contains(connectionCallbacks)) {
                    String valueOf = String.valueOf(connectionCallbacks);
                    StringBuilder sb = new StringBuilder(valueOf.length() + 62);
                    sb.append("registerConnectionCallbacks(): listener ");
                    sb.append(valueOf);
                    sb.append(" is already registered");
                    Log.w("GmsClientEvents", sb.toString());
                } else {
                    this.Y.add(connectionCallbacks);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (this.X.a()) {
            Handler handler = this.c1;
            handler.sendMessage(handler.obtainMessage(1, connectionCallbacks));
        }
    }

    public final void g(GoogleApiClient.OnConnectionFailedListener onConnectionFailedListener) {
        Preconditions.r(onConnectionFailedListener);
        synchronized (this.d1) {
            try {
                if (this.Y0.contains(onConnectionFailedListener)) {
                    String valueOf = String.valueOf(onConnectionFailedListener);
                    StringBuilder sb = new StringBuilder(valueOf.length() + 67);
                    sb.append("registerConnectionFailedListener(): listener ");
                    sb.append(valueOf);
                    sb.append(" is already registered");
                    Log.w("GmsClientEvents", sb.toString());
                } else {
                    this.Y0.add(onConnectionFailedListener);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void h(GoogleApiClient.ConnectionCallbacks connectionCallbacks) {
        Preconditions.r(connectionCallbacks);
        synchronized (this.d1) {
            try {
                if (!this.Y.remove(connectionCallbacks)) {
                    String valueOf = String.valueOf(connectionCallbacks);
                    StringBuilder sb = new StringBuilder(valueOf.length() + 52);
                    sb.append("unregisterConnectionCallbacks(): listener ");
                    sb.append(valueOf);
                    sb.append(" not found");
                    Log.w("GmsClientEvents", sb.toString());
                } else if (this.b1) {
                    this.Z.add(connectionCallbacks);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        int i = message.what;
        if (i == 1) {
            GoogleApiClient.ConnectionCallbacks connectionCallbacks = (GoogleApiClient.ConnectionCallbacks) message.obj;
            synchronized (this.d1) {
                try {
                    if (this.Z0 && this.X.a() && this.Y.contains(connectionCallbacks)) {
                        connectionCallbacks.O0(null);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            return true;
        }
        StringBuilder sb = new StringBuilder(45);
        sb.append("Don't know how to handle message: ");
        sb.append(i);
        Log.wtf("GmsClientEvents", sb.toString(), new Exception());
        return false;
    }

    public final void i(GoogleApiClient.OnConnectionFailedListener onConnectionFailedListener) {
        Preconditions.r(onConnectionFailedListener);
        synchronized (this.d1) {
            try {
                if (!this.Y0.remove(onConnectionFailedListener)) {
                    String valueOf = String.valueOf(onConnectionFailedListener);
                    StringBuilder sb = new StringBuilder(valueOf.length() + 57);
                    sb.append("unregisterConnectionFailedListener(): listener ");
                    sb.append(valueOf);
                    sb.append(" not found");
                    Log.w("GmsClientEvents", sb.toString());
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final boolean j(GoogleApiClient.ConnectionCallbacks connectionCallbacks) {
        boolean contains;
        Preconditions.r(connectionCallbacks);
        synchronized (this.d1) {
            contains = this.Y.contains(connectionCallbacks);
        }
        return contains;
    }

    public final boolean k(GoogleApiClient.OnConnectionFailedListener onConnectionFailedListener) {
        boolean contains;
        Preconditions.r(onConnectionFailedListener);
        synchronized (this.d1) {
            contains = this.Y0.contains(onConnectionFailedListener);
        }
        return contains;
    }
}
