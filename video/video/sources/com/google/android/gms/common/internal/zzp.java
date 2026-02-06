package com.google.android.gms.common.internal;

import android.content.ComponentName;
import android.content.Context;
import android.content.ServiceConnection;
import android.os.Handler;
import android.os.IBinder;
import android.os.Message;
import android.os.StrictMode;
import com.google.android.gms.common.stats.ConnectionTracker;
import com.google.android.gms.common.util.PlatformVersion;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Executor;
import o.InterfaceC11300zs1;

/* loaded from: classes2.dex */
final class zzp implements ServiceConnection, zzt {
    public final Map X = new HashMap();
    public int Y = 2;
    @InterfaceC11300zs1
    public IBinder Y0;
    public boolean Z;
    public final zzo Z0;
    public ComponentName a1;
    public final /* synthetic */ zzs b1;

    public zzp(zzs zzsVar, zzo zzoVar) {
        this.b1 = zzsVar;
        this.Z0 = zzoVar;
    }

    public final int a() {
        return this.Y;
    }

    public final ComponentName b() {
        return this.a1;
    }

    @InterfaceC11300zs1
    public final IBinder c() {
        return this.Y0;
    }

    public final void d(ServiceConnection serviceConnection, ServiceConnection serviceConnection2, String str) {
        this.X.put(serviceConnection, serviceConnection2);
    }

    public final void e(String str, @InterfaceC11300zs1 Executor executor) {
        ConnectionTracker connectionTracker;
        Context context;
        Context context2;
        ConnectionTracker connectionTracker2;
        Context context3;
        Handler handler;
        Handler handler2;
        long j;
        StrictMode.VmPolicy.Builder permitUnsafeIntentLaunch;
        this.Y = 3;
        StrictMode.VmPolicy vmPolicy = StrictMode.getVmPolicy();
        if (PlatformVersion.r()) {
            permitUnsafeIntentLaunch = new StrictMode.VmPolicy.Builder(vmPolicy).permitUnsafeIntentLaunch();
            StrictMode.setVmPolicy(permitUnsafeIntentLaunch.build());
        }
        try {
            zzs zzsVar = this.b1;
            connectionTracker = zzsVar.j;
            context = zzsVar.g;
            zzo zzoVar = this.Z0;
            context2 = zzsVar.g;
            try {
                boolean e = connectionTracker.e(context, str, zzoVar.b(context2), this, 4225, executor);
                this.Z = e;
                if (e) {
                    handler = this.b1.h;
                    Message obtainMessage = handler.obtainMessage(1, this.Z0);
                    handler2 = this.b1.h;
                    j = this.b1.l;
                    handler2.sendMessageDelayed(obtainMessage, j);
                } else {
                    this.Y = 2;
                    try {
                        zzs zzsVar2 = this.b1;
                        connectionTracker2 = zzsVar2.j;
                        context3 = zzsVar2.g;
                        connectionTracker2.c(context3, this);
                    } catch (IllegalArgumentException unused) {
                    }
                }
                StrictMode.setVmPolicy(vmPolicy);
            } catch (Throwable th) {
                th = th;
                Throwable th2 = th;
                StrictMode.setVmPolicy(vmPolicy);
                throw th2;
            }
        } catch (Throwable th3) {
            th = th3;
        }
    }

    public final void f(ServiceConnection serviceConnection, String str) {
        this.X.remove(serviceConnection);
    }

    public final void g(String str) {
        Handler handler;
        ConnectionTracker connectionTracker;
        Context context;
        zzo zzoVar = this.Z0;
        handler = this.b1.h;
        handler.removeMessages(1, zzoVar);
        zzs zzsVar = this.b1;
        connectionTracker = zzsVar.j;
        context = zzsVar.g;
        connectionTracker.c(context, this);
        this.Z = false;
        this.Y = 2;
    }

    public final boolean h(ServiceConnection serviceConnection) {
        return this.X.containsKey(serviceConnection);
    }

    public final boolean i() {
        return this.X.isEmpty();
    }

    public final boolean j() {
        return this.Z;
    }

    @Override // android.content.ServiceConnection
    public final void onBindingDied(ComponentName componentName) {
        onServiceDisconnected(componentName);
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        HashMap hashMap;
        Handler handler;
        hashMap = this.b1.f;
        synchronized (hashMap) {
            try {
                handler = this.b1.h;
                handler.removeMessages(1, this.Z0);
                this.Y0 = iBinder;
                this.a1 = componentName;
                for (ServiceConnection serviceConnection : this.X.values()) {
                    serviceConnection.onServiceConnected(componentName, iBinder);
                }
                this.Y = 1;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        HashMap hashMap;
        Handler handler;
        hashMap = this.b1.f;
        synchronized (hashMap) {
            try {
                handler = this.b1.h;
                handler.removeMessages(1, this.Z0);
                this.Y0 = null;
                this.a1 = componentName;
                for (ServiceConnection serviceConnection : this.X.values()) {
                    serviceConnection.onServiceDisconnected(componentName);
                }
                this.Y = 2;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
