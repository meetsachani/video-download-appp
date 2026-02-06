package com.google.android.gms.common.api.internal;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.Looper;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.BaseGmsClient;
import com.google.android.gms.common.internal.GmsClientSupervisor;
import com.google.android.gms.common.internal.IAccountAccessor;
import com.google.android.gms.common.internal.Preconditions;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.Collections;
import java.util.Set;
import o.InterfaceC10697xN2;
import o.InterfaceC11300zs1;
import o.InterfaceC5670cr1;

@KeepForSdk
/* loaded from: classes2.dex */
public final class NonGmsServiceBrokerClient implements Api.Client, ServiceConnection {
    public static final String g1 = "NonGmsServiceBrokerClient";
    @InterfaceC11300zs1
    public final String X;
    @InterfaceC11300zs1
    public final String Y;
    public final Context Y0;
    @InterfaceC11300zs1
    public final ComponentName Z;
    public final ConnectionCallbacks Z0;
    public final Handler a1;
    public final OnConnectionFailedListener b1;
    @InterfaceC11300zs1
    public IBinder c1;
    public boolean d1;
    @InterfaceC11300zs1
    public String e1;
    @InterfaceC11300zs1
    public String f1;

    @KeepForSdk
    public NonGmsServiceBrokerClient(@InterfaceC5670cr1 Context context, @InterfaceC5670cr1 Looper looper, @InterfaceC5670cr1 ComponentName componentName, @InterfaceC5670cr1 ConnectionCallbacks connectionCallbacks, @InterfaceC5670cr1 OnConnectionFailedListener onConnectionFailedListener) {
        this(context, looper, null, null, componentName, connectionCallbacks, onConnectionFailedListener);
    }

    @InterfaceC10697xN2
    public final void A() {
        if (Thread.currentThread() == this.a1.getLooper().getThread()) {
            return;
        }
        throw new IllegalStateException("This method should only run on the NonGmsServiceBrokerClient's handler thread.");
    }

    public final void B(String str) {
        String.valueOf(this.c1);
    }

    @Override // com.google.android.gms.common.api.Api.Client
    @InterfaceC10697xN2
    public final boolean a() {
        A();
        if (this.c1 != null) {
            return true;
        }
        return false;
    }

    @Override // com.google.android.gms.common.api.Api.Client
    public final boolean b() {
        return false;
    }

    @Override // com.google.android.gms.common.api.Api.Client
    @InterfaceC10697xN2
    public final void c() {
        A();
        B("Disconnect called.");
        try {
            this.Y0.unbindService(this);
        } catch (IllegalArgumentException unused) {
        }
        this.d1 = false;
        this.c1 = null;
    }

    @Override // com.google.android.gms.common.api.Api.Client
    public final void dump(@InterfaceC5670cr1 String str, @InterfaceC11300zs1 FileDescriptor fileDescriptor, @InterfaceC5670cr1 PrintWriter printWriter, @InterfaceC11300zs1 String[] strArr) {
    }

    @Override // com.google.android.gms.common.api.Api.Client
    public final boolean e() {
        return false;
    }

    public final /* synthetic */ void f() {
        this.d1 = false;
        this.c1 = null;
        B("Disconnected.");
        this.Z0.g1(1);
    }

    @Override // com.google.android.gms.common.api.Api.Client
    @InterfaceC10697xN2
    public final void g(@InterfaceC5670cr1 String str) {
        A();
        this.e1 = str;
        c();
    }

    @Override // com.google.android.gms.common.api.Api.Client
    @InterfaceC10697xN2
    public final boolean h() {
        A();
        return this.d1;
    }

    @Override // com.google.android.gms.common.api.Api.Client
    @InterfaceC5670cr1
    public final String i() {
        String str = this.X;
        if (str != null) {
            return str;
        }
        Preconditions.r(this.Z);
        return this.Z.getPackageName();
    }

    @Override // com.google.android.gms.common.api.Api.Client
    @InterfaceC10697xN2
    public final void j(@InterfaceC5670cr1 BaseGmsClient.ConnectionProgressReportCallbacks connectionProgressReportCallbacks) {
        A();
        B("Connect started.");
        if (a()) {
            try {
                g("connect() called when already connected");
            } catch (Exception unused) {
            }
        }
        try {
            Intent intent = new Intent();
            ComponentName componentName = this.Z;
            if (componentName != null) {
                intent.setComponent(componentName);
            } else {
                intent.setPackage(this.X).setAction(this.Y);
            }
            boolean bindService = this.Y0.bindService(intent, this, GmsClientSupervisor.d());
            this.d1 = bindService;
            if (!bindService) {
                this.c1 = null;
                this.b1.o1(new ConnectionResult(16));
            }
            B("Finished connect.");
        } catch (SecurityException e) {
            this.d1 = false;
            this.c1 = null;
            throw e;
        }
    }

    @Override // com.google.android.gms.common.api.Api.Client
    @InterfaceC5670cr1
    public final Feature[] k() {
        return new Feature[0];
    }

    @Override // com.google.android.gms.common.api.Api.Client
    public final boolean l() {
        return false;
    }

    @Override // com.google.android.gms.common.api.Api.Client
    public final boolean m() {
        return false;
    }

    @Override // com.google.android.gms.common.api.Api.Client
    @InterfaceC11300zs1
    public final IBinder n() {
        return null;
    }

    @Override // com.google.android.gms.common.api.Api.Client
    @InterfaceC5670cr1
    public final Set<Scope> o() {
        return Collections.EMPTY_SET;
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(@InterfaceC5670cr1 ComponentName componentName, @InterfaceC5670cr1 final IBinder iBinder) {
        this.a1.post(new Runnable() { // from class: com.google.android.gms.common.api.internal.zacg
            @Override // java.lang.Runnable
            public final void run() {
                NonGmsServiceBrokerClient.this.y(iBinder);
            }
        });
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(@InterfaceC5670cr1 ComponentName componentName) {
        this.a1.post(new Runnable() { // from class: com.google.android.gms.common.api.internal.zacf
            @Override // java.lang.Runnable
            public final void run() {
                NonGmsServiceBrokerClient.this.f();
            }
        });
    }

    @Override // com.google.android.gms.common.api.Api.Client
    public final void p(@InterfaceC11300zs1 IAccountAccessor iAccountAccessor, @InterfaceC11300zs1 Set<Scope> set) {
    }

    @Override // com.google.android.gms.common.api.Api.Client
    public final void q(@InterfaceC5670cr1 BaseGmsClient.SignOutCallbacks signOutCallbacks) {
    }

    @Override // com.google.android.gms.common.api.Api.Client
    public final int s() {
        return 0;
    }

    @Override // com.google.android.gms.common.api.Api.Client
    @InterfaceC5670cr1
    public final Feature[] t() {
        return new Feature[0];
    }

    @Override // com.google.android.gms.common.api.Api.Client
    @InterfaceC11300zs1
    public final String v() {
        return this.e1;
    }

    @Override // com.google.android.gms.common.api.Api.Client
    @InterfaceC5670cr1
    public final Intent w() {
        return new Intent();
    }

    @InterfaceC11300zs1
    @KeepForSdk
    @InterfaceC10697xN2
    public IBinder x() {
        A();
        return this.c1;
    }

    public final /* synthetic */ void y(IBinder iBinder) {
        this.d1 = false;
        this.c1 = iBinder;
        B("Connected.");
        this.Z0.O0(new Bundle());
    }

    public final void z(@InterfaceC11300zs1 String str) {
        this.f1 = str;
    }

    /* JADX WARN: Code restructure failed: missing block: B:7:0x001e, code lost:
        if (r6 != null) goto L6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public NonGmsServiceBrokerClient(Context context, Looper looper, @InterfaceC11300zs1 String str, @InterfaceC11300zs1 String str2, @InterfaceC11300zs1 ComponentName componentName, ConnectionCallbacks connectionCallbacks, OnConnectionFailedListener onConnectionFailedListener) {
        this.d1 = false;
        this.e1 = null;
        this.Y0 = context;
        this.a1 = new com.google.android.gms.internal.base.zaq(looper);
        this.Z0 = connectionCallbacks;
        this.b1 = onConnectionFailedListener;
        if (str != null && str2 != null) {
            if (componentName == null) {
                componentName = null;
                this.X = str;
                this.Y = str2;
                this.Z = componentName;
                return;
            }
            throw new AssertionError("Must specify either package or component, but not both");
        }
    }

    @KeepForSdk
    public NonGmsServiceBrokerClient(@InterfaceC5670cr1 Context context, @InterfaceC5670cr1 Looper looper, @InterfaceC5670cr1 String str, @InterfaceC5670cr1 String str2, @InterfaceC5670cr1 ConnectionCallbacks connectionCallbacks, @InterfaceC5670cr1 OnConnectionFailedListener onConnectionFailedListener) {
        this(context, looper, str, str2, null, connectionCallbacks, onConnectionFailedListener);
    }
}
