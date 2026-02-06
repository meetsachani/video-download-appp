package com.google.android.gms.internal.ads;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.common.util.PlatformVersion;
import com.google.android.gms.common.wrappers.Wrappers;
import java.util.ArrayList;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import o.InterfaceC11300zs1;
import o.InterfaceC5940dy1;
import o.InterfaceC8710pF0;
import o.InterfaceFutureC8411o11;

@InterfaceC5940dy1
/* loaded from: classes2.dex */
public final class zzbzn {
    public final Object a = new Object();
    public final com.google.android.gms.ads.internal.util.zzj b;
    public final zzbzr c;
    public boolean d;
    public Context e;
    public VersionInfoParcel f;
    public String g;
    @InterfaceC11300zs1
    public zzbda h;
    @InterfaceC11300zs1
    public Boolean i;
    public final AtomicInteger j;
    public final AtomicInteger k;
    public final zzbzl l;
    public final Object m;
    @InterfaceC8710pF0("grantedPermissionLock")
    public InterfaceFutureC8411o11 n;

    /* renamed from: o  reason: collision with root package name */
    public final AtomicBoolean f234o;

    public zzbzn() {
        com.google.android.gms.ads.internal.util.zzj zzjVar = new com.google.android.gms.ads.internal.util.zzj();
        this.b = zzjVar;
        this.c = new zzbzr(com.google.android.gms.ads.internal.client.zzbb.d(), zzjVar);
        this.d = false;
        this.h = null;
        this.i = null;
        this.j = new AtomicInteger(0);
        this.k = new AtomicInteger(0);
        this.l = new zzbzl(null);
        this.m = new Object();
        this.f234o = new AtomicBoolean();
    }

    public static /* synthetic */ ArrayList p(zzbzn zzbznVar) {
        Context a = zzbvv.a(zzbznVar.e);
        ArrayList arrayList = new ArrayList();
        try {
            PackageInfo f = Wrappers.a(a).f(a.getApplicationInfo().packageName, 4096);
            if (f.requestedPermissions != null && f.requestedPermissionsFlags != null) {
                int i = 0;
                while (true) {
                    String[] strArr = f.requestedPermissions;
                    if (i >= strArr.length) {
                        break;
                    }
                    if ((f.requestedPermissionsFlags[i] & 2) != 0) {
                        arrayList.add(strArr[i]);
                    }
                    i++;
                }
            }
        } catch (PackageManager.NameNotFoundException unused) {
        }
        return arrayList;
    }

    public final void A(String str) {
        this.g = str;
    }

    public final boolean a(Context context) {
        if (PlatformVersion.n()) {
            if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.c().b(zzbcv.I8)).booleanValue()) {
                return this.f234o.get();
            }
        }
        NetworkInfo activeNetworkInfo = ((ConnectivityManager) context.getSystemService("connectivity")).getActiveNetworkInfo();
        if (activeNetworkInfo != null && activeNetworkInfo.isConnected()) {
            return true;
        }
        return false;
    }

    public final int b() {
        return this.k.get();
    }

    public final int c() {
        return this.j.get();
    }

    @InterfaceC11300zs1
    public final Context e() {
        return this.e;
    }

    @InterfaceC11300zs1
    public final Resources f() {
        if (this.f.Y0) {
            return this.e.getResources();
        }
        try {
            if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.c().b(zzbcv.ib)).booleanValue()) {
                return com.google.android.gms.ads.internal.util.client.zzs.a(this.e).getResources();
            }
            com.google.android.gms.ads.internal.util.client.zzs.a(this.e).getResources();
            return null;
        } catch (com.google.android.gms.ads.internal.util.client.zzr e) {
            int i = com.google.android.gms.ads.internal.util.zze.b;
            com.google.android.gms.ads.internal.util.client.zzo.h("Cannot load resource from dynamite apk or local jar", e);
            return null;
        }
    }

    @InterfaceC11300zs1
    public final zzbda h() {
        zzbda zzbdaVar;
        synchronized (this.a) {
            zzbdaVar = this.h;
        }
        return zzbdaVar;
    }

    public final zzbzr i() {
        return this.c;
    }

    public final com.google.android.gms.ads.internal.util.zzg j() {
        com.google.android.gms.ads.internal.util.zzj zzjVar;
        synchronized (this.a) {
            zzjVar = this.b;
        }
        return zzjVar;
    }

    public final InterfaceFutureC8411o11 l() {
        if (this.e != null) {
            if (!((Boolean) com.google.android.gms.ads.internal.client.zzbd.c().b(zzbcv.g3)).booleanValue()) {
                synchronized (this.m) {
                    try {
                        InterfaceFutureC8411o11 interfaceFutureC8411o11 = this.n;
                        if (interfaceFutureC8411o11 != null) {
                            return interfaceFutureC8411o11;
                        }
                        InterfaceFutureC8411o11 I2 = zzcaa.a.I2(new Callable() { // from class: com.google.android.gms.internal.ads.zzbzi
                            @Override // java.util.concurrent.Callable
                            public final Object call() {
                                return zzbzn.p(zzbzn.this);
                            }
                        });
                        this.n = I2;
                        return I2;
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }
        }
        return zzgcy.h(new ArrayList());
    }

    public final Boolean m() {
        Boolean bool;
        synchronized (this.a) {
            bool = this.i;
        }
        return bool;
    }

    public final String o() {
        return this.g;
    }

    public final void r() {
        this.l.a();
    }

    public final void s() {
        this.j.decrementAndGet();
    }

    public final void t() {
        this.k.incrementAndGet();
    }

    public final void u() {
        this.j.incrementAndGet();
    }

    @TargetApi(23)
    public final void v(Context context, VersionInfoParcel versionInfoParcel) {
        zzbda zzbdaVar;
        synchronized (this.a) {
            try {
                if (!this.d) {
                    this.e = context.getApplicationContext();
                    this.f = versionInfoParcel;
                    com.google.android.gms.ads.internal.zzv.f().c(this.c);
                    this.b.g0(this.e);
                    zzbui.d(this.e, this.f);
                    com.google.android.gms.ads.internal.zzv.i();
                    if (!((Boolean) com.google.android.gms.ads.internal.client.zzbd.c().b(zzbcv.j2)).booleanValue()) {
                        com.google.android.gms.ads.internal.util.zze.k("CsiReporterFactory: CSI is not enabled. No CSI reporter created.");
                        zzbdaVar = null;
                    } else {
                        zzbdaVar = new zzbda();
                    }
                    this.h = zzbdaVar;
                    if (zzbdaVar != null) {
                        zzcad.a(new zzbzj(this).b(), "AppState.registerCsiReporter");
                    }
                    Context context2 = this.e;
                    if (PlatformVersion.n()) {
                        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.c().b(zzbcv.I8)).booleanValue()) {
                            try {
                                ((ConnectivityManager) context2.getSystemService("connectivity")).registerDefaultNetworkCallback(new zzbzk(this));
                            } catch (RuntimeException e) {
                                int i = com.google.android.gms.ads.internal.util.zze.b;
                                com.google.android.gms.ads.internal.util.client.zzo.h("Failed to register network callback", e);
                                this.f234o.set(true);
                            }
                        }
                    }
                    this.d = true;
                    l();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        com.google.android.gms.ads.internal.zzv.v().I(context, versionInfoParcel.X);
    }

    public final void w(Throwable th, String str) {
        zzbui.d(this.e, this.f).a(th, str, ((Double) zzbfe.f.e()).floatValue());
    }

    public final void x(Throwable th, String str) {
        zzbui.d(this.e, this.f).b(th, str);
    }

    public final void y(Throwable th, String str) {
        zzbui.f(this.e, this.f).b(th, str);
    }

    public final void z(Boolean bool) {
        synchronized (this.a) {
            this.i = bool;
        }
    }
}
