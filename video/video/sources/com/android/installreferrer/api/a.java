package com.android.installreferrer.api;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import android.os.Bundle;
import android.os.IBinder;
import android.os.RemoteException;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.List;
import o.C9975uQ0;
import o.InterfaceC5539cJ0;

/* loaded from: classes.dex */
public class a extends InstallReferrerClient {
    public static final String e = "InstallReferrerClient";
    public static final int f = 80837300;
    public static final String g = "com.android.vending";
    public static final String h = "com.google.android.finsky.externalreferrer.GetInstallReferrerService";
    public static final String i = "com.google.android.finsky.BIND_GET_INSTALL_REFERRER_SERVICE";
    public int a = 0;
    public final Context b;
    public InterfaceC5539cJ0 c;
    public ServiceConnection d;

    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: classes.dex */
    public @interface b {
        public static final int f = 0;
        public static final int g = 1;
        public static final int h = 2;
        public static final int i = 3;
    }

    /* loaded from: classes.dex */
    public final class c implements ServiceConnection {
        public final InstallReferrerStateListener X;

        @Override // android.content.ServiceConnection
        public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            C9975uQ0.a(a.e, "Install Referrer service connected.");
            a.this.c = InterfaceC5539cJ0.a.O0(iBinder);
            a.this.a = 2;
            this.X.a(0);
        }

        @Override // android.content.ServiceConnection
        public void onServiceDisconnected(ComponentName componentName) {
            C9975uQ0.b(a.e, "Install Referrer service disconnected.");
            a.this.c = null;
            a.this.a = 0;
            this.X.b();
        }

        public c(InstallReferrerStateListener installReferrerStateListener) {
            if (installReferrerStateListener != null) {
                this.X = installReferrerStateListener;
                return;
            }
            throw new RuntimeException("Please specify a listener to know when setup is done.");
        }
    }

    public a(Context context) {
        this.b = context.getApplicationContext();
    }

    @Override // com.android.installreferrer.api.InstallReferrerClient
    public void a() {
        this.a = 3;
        if (this.d != null) {
            C9975uQ0.a(e, "Unbinding from service.");
            this.b.unbindService(this.d);
            this.d = null;
        }
        this.c = null;
    }

    @Override // com.android.installreferrer.api.InstallReferrerClient
    public ReferrerDetails b() throws RemoteException {
        if (c()) {
            Bundle bundle = new Bundle();
            bundle.putString("package_name", this.b.getPackageName());
            try {
                return new ReferrerDetails(this.c.G2(bundle));
            } catch (RemoteException e2) {
                C9975uQ0.b(e, "RemoteException getting install referrer information");
                this.a = 0;
                throw e2;
            }
        }
        throw new IllegalStateException("Service not connected. Please start a connection before using the service.");
    }

    @Override // com.android.installreferrer.api.InstallReferrerClient
    public boolean c() {
        if (this.a == 2 && this.c != null && this.d != null) {
            return true;
        }
        return false;
    }

    @Override // com.android.installreferrer.api.InstallReferrerClient
    public void e(InstallReferrerStateListener installReferrerStateListener) {
        ServiceInfo serviceInfo;
        if (c()) {
            C9975uQ0.a(e, "Service connection is valid. No need to re-initialize.");
            installReferrerStateListener.a(0);
            return;
        }
        int i2 = this.a;
        if (i2 == 1) {
            C9975uQ0.b(e, "Client is already in the process of connecting to the service.");
            installReferrerStateListener.a(3);
        } else if (i2 == 3) {
            C9975uQ0.b(e, "Client was already closed and can't be reused. Please create another instance.");
            installReferrerStateListener.a(3);
        } else {
            C9975uQ0.a(e, "Starting install referrer service setup.");
            this.d = new c(installReferrerStateListener);
            Intent intent = new Intent(i);
            intent.setComponent(new ComponentName("com.android.vending", h));
            List<ResolveInfo> queryIntentServices = this.b.getPackageManager().queryIntentServices(intent, 0);
            if (queryIntentServices != null && !queryIntentServices.isEmpty() && (serviceInfo = queryIntentServices.get(0).serviceInfo) != null) {
                String str = serviceInfo.packageName;
                String str2 = serviceInfo.name;
                if ("com.android.vending".equals(str) && str2 != null && h()) {
                    if (this.b.bindService(new Intent(intent), this.d, 1)) {
                        C9975uQ0.a(e, "Service was bonded successfully.");
                        return;
                    }
                    C9975uQ0.b(e, "Connection to service is blocked.");
                    this.a = 0;
                    installReferrerStateListener.a(1);
                    return;
                }
                C9975uQ0.b(e, "Play Store missing or incompatible. Version 8.3.73 or later required.");
                this.a = 0;
                installReferrerStateListener.a(2);
                return;
            }
            this.a = 0;
            C9975uQ0.a(e, "Install Referrer service unavailable on device.");
            installReferrerStateListener.a(2);
        }
    }

    public final boolean h() {
        if (this.b.getPackageManager().getPackageInfo("com.android.vending", 128).versionCode < 80837300) {
            return false;
        }
        return true;
    }
}
