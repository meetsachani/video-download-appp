package com.google.android.gms.ads.identifier;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.RemoteException;
import android.os.SystemClock;
import android.util.Log;
import com.google.android.gms.common.BlockingServiceConnection;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.google.android.gms.common.GooglePlayServicesNotAvailableException;
import com.google.android.gms.common.GooglePlayServicesRepairableException;
import com.google.android.gms.common.GooglePlayServicesUtilLight;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.annotation.KeepForSdkWithMembers;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.ShowFirstParty;
import com.google.android.gms.common.stats.ConnectionTracker;
import com.google.android.gms.common.util.VisibleForTesting;
import com.google.android.gms.internal.ads_identifier.zze;
import com.google.android.gms.internal.ads_identifier.zzf;
import java.io.IOException;
import java.util.HashMap;
import java.util.concurrent.TimeUnit;
import o.InterfaceC11300zs1;
import o.InterfaceC5670cr1;
import o.InterfaceC5940dy1;
import o.InterfaceC8223nF0;

@KeepForSdk
@InterfaceC5940dy1
/* loaded from: classes2.dex */
public class AdvertisingIdClient {
    @InterfaceC11300zs1
    @InterfaceC8223nF0("this")
    public BlockingServiceConnection a;
    @InterfaceC11300zs1
    @InterfaceC8223nF0("this")
    public zzf b;
    @InterfaceC8223nF0("this")
    public boolean c;
    public final Object d;
    @InterfaceC11300zs1
    @InterfaceC8223nF0("mAutoDisconnectTaskLock")
    public zzb e;
    @InterfaceC8223nF0("this")
    public final Context f;
    public final long g;

    @KeepForSdkWithMembers
    /* loaded from: classes2.dex */
    public static final class Info {
        @InterfaceC11300zs1
        public final String a;
        public final boolean b;

        @Deprecated
        public Info(@InterfaceC11300zs1 String str, boolean z) {
            this.a = str;
            this.b = z;
        }

        @InterfaceC11300zs1
        public String a() {
            return this.a;
        }

        public boolean b() {
            return this.b;
        }

        @InterfaceC5670cr1
        public String toString() {
            String str = this.a;
            boolean z = this.b;
            StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 7);
            sb.append("{");
            sb.append(str);
            sb.append("}");
            sb.append(z);
            return sb.toString();
        }
    }

    @KeepForSdk
    public AdvertisingIdClient(@InterfaceC5670cr1 Context context) {
        this(context, 30000L, false, false);
    }

    @InterfaceC5670cr1
    @KeepForSdk
    public static Info a(@InterfaceC5670cr1 Context context) throws IOException, IllegalStateException, GooglePlayServicesNotAvailableException, GooglePlayServicesRepairableException {
        AdvertisingIdClient advertisingIdClient = new AdvertisingIdClient(context, -1L, true, false);
        try {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            advertisingIdClient.g(false);
            Info i = advertisingIdClient.i(-1);
            advertisingIdClient.h(i, true, 0.0f, SystemClock.elapsedRealtime() - elapsedRealtime, "", null);
            return i;
        } finally {
        }
    }

    @KeepForSdk
    public static boolean c(@InterfaceC5670cr1 Context context) throws IOException, GooglePlayServicesNotAvailableException, GooglePlayServicesRepairableException {
        boolean f;
        AdvertisingIdClient advertisingIdClient = new AdvertisingIdClient(context, -1L, false, false);
        try {
            advertisingIdClient.g(false);
            Preconditions.q("Calling this from your main thread can lead to deadlock");
            synchronized (advertisingIdClient) {
                if (!advertisingIdClient.c) {
                    synchronized (advertisingIdClient.d) {
                        zzb zzbVar = advertisingIdClient.e;
                        if (zzbVar == null || !zzbVar.Y0) {
                            throw new IOException("AdvertisingIdClient is not connected.");
                        }
                    }
                    try {
                        advertisingIdClient.g(false);
                        if (!advertisingIdClient.c) {
                            throw new IOException("AdvertisingIdClient cannot reconnect.");
                        }
                    } catch (Exception e) {
                        throw new IOException("AdvertisingIdClient cannot reconnect.", e);
                    }
                }
                Preconditions.r(advertisingIdClient.a);
                Preconditions.r(advertisingIdClient.b);
                try {
                    f = advertisingIdClient.b.f();
                } catch (RemoteException e2) {
                    Log.i("AdvertisingIdClient", "GMS remote exception ", e2);
                    throw new IOException("Remote exception");
                }
            }
            advertisingIdClient.j();
            advertisingIdClient.f();
            return f;
        } catch (Throwable th) {
            advertisingIdClient.f();
            throw th;
        }
    }

    @ShowFirstParty
    @KeepForSdk
    public static void d(boolean z) {
    }

    @InterfaceC5670cr1
    @KeepForSdk
    public Info b() throws IOException {
        return i(-1);
    }

    @KeepForSdk
    public void e() throws IOException, IllegalStateException, GooglePlayServicesNotAvailableException, GooglePlayServicesRepairableException {
        g(true);
    }

    public final void f() {
        Preconditions.q("Calling this from your main thread can lead to deadlock");
        synchronized (this) {
            try {
                if (this.f != null && this.a != null) {
                    if (this.c) {
                        ConnectionTracker.b().c(this.f, this.a);
                    }
                    this.c = false;
                    this.b = null;
                    this.a = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void finalize() throws Throwable {
        f();
        super.finalize();
    }

    @VisibleForTesting
    public final void g(boolean z) throws IOException, IllegalStateException, GooglePlayServicesNotAvailableException, GooglePlayServicesRepairableException {
        Preconditions.q("Calling this from your main thread can lead to deadlock");
        synchronized (this) {
            try {
                if (this.c) {
                    f();
                }
                Context context = this.f;
                try {
                    context.getPackageManager().getPackageInfo("com.android.vending", 0);
                    int k = GoogleApiAvailabilityLight.i().k(context, GooglePlayServicesUtilLight.a);
                    if (k != 0 && k != 2) {
                        throw new IOException("Google Play services not available");
                    }
                    BlockingServiceConnection blockingServiceConnection = new BlockingServiceConnection();
                    Intent intent = new Intent("com.google.android.gms.ads.identifier.service.START");
                    intent.setPackage("com.google.android.gms");
                    if (ConnectionTracker.b().a(context, intent, blockingServiceConnection, 1)) {
                        this.a = blockingServiceConnection;
                        try {
                            this.b = zze.O0(blockingServiceConnection.b(10000L, TimeUnit.MILLISECONDS));
                            this.c = true;
                            if (z) {
                                j();
                            }
                        } catch (InterruptedException unused) {
                            throw new IOException("Interrupted exception");
                        } catch (Throwable th) {
                            throw new IOException(th);
                        }
                    } else {
                        throw new IOException("Connection failure");
                    }
                } catch (PackageManager.NameNotFoundException unused2) {
                    throw new GooglePlayServicesNotAvailableException(9);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @VisibleForTesting
    public final boolean h(@InterfaceC11300zs1 Info info, boolean z, float f, long j, String str, @InterfaceC11300zs1 Throwable th) {
        if (Math.random() <= 0.0d) {
            HashMap hashMap = new HashMap();
            String str2 = "1";
            hashMap.put("app_context", "1");
            if (info != null) {
                if (true != info.b()) {
                    str2 = "0";
                }
                hashMap.put("limit_ad_tracking", str2);
                String a = info.a();
                if (a != null) {
                    hashMap.put("ad_id_size", Integer.toString(a.length()));
                }
            }
            if (th != null) {
                hashMap.put("error", th.getClass().getName());
            }
            hashMap.put("tag", "AdvertisingIdClient");
            hashMap.put("time_spent", Long.toString(j));
            new zza(this, hashMap).start();
            return true;
        }
        return false;
    }

    public final Info i(int i) throws IOException {
        Info info;
        Preconditions.q("Calling this from your main thread can lead to deadlock");
        synchronized (this) {
            try {
                if (!this.c) {
                    synchronized (this.d) {
                        zzb zzbVar = this.e;
                        if (zzbVar == null || !zzbVar.Y0) {
                            throw new IOException("AdvertisingIdClient is not connected.");
                        }
                    }
                    try {
                        g(false);
                        if (!this.c) {
                            throw new IOException("AdvertisingIdClient cannot reconnect.");
                        }
                    } catch (Exception e) {
                        throw new IOException("AdvertisingIdClient cannot reconnect.", e);
                    }
                }
                Preconditions.r(this.a);
                Preconditions.r(this.b);
                try {
                    info = new Info(this.b.c(), this.b.a2(true));
                } catch (RemoteException e2) {
                    Log.i("AdvertisingIdClient", "GMS remote exception ", e2);
                    throw new IOException("Remote exception");
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        j();
        return info;
    }

    public final void j() {
        synchronized (this.d) {
            zzb zzbVar = this.e;
            if (zzbVar != null) {
                zzbVar.Z.countDown();
                try {
                    this.e.join();
                } catch (InterruptedException unused) {
                }
            }
            long j = this.g;
            if (j > 0) {
                this.e = new zzb(this, j);
            }
        }
    }

    @VisibleForTesting
    public AdvertisingIdClient(@InterfaceC5670cr1 Context context, long j, boolean z, boolean z2) {
        Context applicationContext;
        this.d = new Object();
        Preconditions.r(context);
        if (z && (applicationContext = context.getApplicationContext()) != null) {
            context = applicationContext;
        }
        this.f = context;
        this.c = false;
        this.g = j;
    }
}
