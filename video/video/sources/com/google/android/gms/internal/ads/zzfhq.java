package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Binder;
import android.os.Build;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.TimeUnit;
import o.InterfaceC11300zs1;
import o.InterfaceC5056aJ2;
import o.InterfaceC8710pF0;

/* loaded from: classes2.dex */
public final class zzfhq implements Runnable {
    @InterfaceC5056aJ2
    public static final Object e1 = new Object();
    public static final Object f1 = new Object();
    public static final Object g1 = new Object();
    @InterfaceC8710pF0("enabledLock")
    @InterfaceC5056aJ2
    public static Boolean h1;
    public final Context X;
    public final VersionInfoParcel Y;
    public int Z0;
    public final zzdpq a1;
    public final List b1;
    public final zzbvt d1;
    @InterfaceC8710pF0("protoLock")
    public final zzfhv Z = zzfhz.s2();
    public String Y0 = "";
    @InterfaceC8710pF0("initLock")
    public boolean c1 = false;

    public zzfhq(Context context, VersionInfoParcel versionInfoParcel, zzdpq zzdpqVar, zzdzz zzdzzVar, zzbvt zzbvtVar) {
        this.X = context;
        this.Y = versionInfoParcel;
        this.a1 = zzdpqVar;
        this.d1 = zzbvtVar;
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.c().b(zzbcv.f9)).booleanValue()) {
            this.b1 = com.google.android.gms.ads.internal.util.zzs.J();
        } else {
            this.b1 = zzfyc.F();
        }
    }

    public static boolean a() {
        boolean booleanValue;
        boolean z;
        synchronized (e1) {
            try {
                if (h1 == null) {
                    if (!((Boolean) zzbeo.b.e()).booleanValue()) {
                        h1 = Boolean.FALSE;
                    } else {
                        if (Math.random() < ((Double) zzbeo.a.e()).doubleValue()) {
                            z = true;
                        } else {
                            z = false;
                        }
                        h1 = Boolean.valueOf(z);
                    }
                }
                booleanValue = h1.booleanValue();
            } catch (Throwable th) {
                throw th;
            }
        }
        return booleanValue;
    }

    public static /* synthetic */ void b(zzfhq zzfhqVar, zzfhg zzfhgVar) {
        synchronized (g1) {
            try {
                if (!zzfhqVar.c1) {
                    zzfhqVar.c1 = true;
                    if (a()) {
                        try {
                            com.google.android.gms.ads.internal.zzv.v();
                            zzfhqVar.Y0 = com.google.android.gms.ads.internal.util.zzs.W(zzfhqVar.X);
                        } catch (RemoteException | RuntimeException e) {
                            com.google.android.gms.ads.internal.zzv.t().x(e, "CuiMonitor.gettingAppIdFromManifest");
                        }
                        zzfhqVar.Z0 = GoogleApiAvailabilityLight.i().b(zzfhqVar.X);
                        int intValue = ((Integer) com.google.android.gms.ads.internal.client.zzbd.c().b(zzbcv.a9)).intValue();
                        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.c().b(zzbcv.hc)).booleanValue()) {
                            long j = intValue;
                            zzcaa.d.scheduleWithFixedDelay(zzfhqVar, j, j, TimeUnit.MILLISECONDS);
                        } else {
                            long j2 = intValue;
                            zzcaa.d.scheduleAtFixedRate(zzfhqVar, j2, j2, TimeUnit.MILLISECONDS);
                        }
                    }
                }
            } finally {
            }
        }
        if (a() && zzfhgVar != null) {
            synchronized (f1) {
                try {
                    zzfhv zzfhvVar = zzfhqVar.Z;
                    if (zzfhvVar.a() < ((Integer) com.google.android.gms.ads.internal.client.zzbd.c().b(zzbcv.b9)).intValue()) {
                        zzfhr s2 = zzfhu.s2();
                        s2.u2(zzfhgVar.m());
                        s2.q2(zzfhgVar.l());
                        s2.e2(zzfhgVar.b());
                        s2.w2(3);
                        s2.n2(zzfhqVar.Y.X);
                        s2.Z1(zzfhqVar.Y0);
                        s2.j2(Build.VERSION.RELEASE);
                        s2.r2(Build.VERSION.SDK_INT);
                        s2.v2(zzfhgVar.o());
                        s2.h2(zzfhgVar.a());
                        s2.c2(zzfhqVar.Z0);
                        s2.t2(zzfhgVar.n());
                        s2.a2(zzfhgVar.e());
                        s2.d2(zzfhgVar.g());
                        s2.f2(zzfhgVar.h());
                        s2.g2(zzfhqVar.a1.b(zzfhgVar.h()));
                        s2.k2(zzfhgVar.i());
                        s2.m2(zzfhgVar.d());
                        s2.b2(zzfhgVar.f());
                        s2.s2(zzfhgVar.k());
                        s2.o2(zzfhgVar.j());
                        s2.p2(zzfhgVar.c());
                        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.c().b(zzbcv.f9)).booleanValue()) {
                            s2.Y1(zzfhqVar.b1);
                        }
                        zzfhw s22 = zzfhx.s2();
                        s22.Y1(s2);
                        zzfhvVar.Y1(s22);
                    }
                } finally {
                }
            }
        }
    }

    public final void c(@InterfaceC11300zs1 final zzfhg zzfhgVar) {
        zzcaa.a.f0(new Runnable() { // from class: com.google.android.gms.internal.ads.zzfhp
            @Override // java.lang.Runnable
            public final void run() {
                zzfhq.b(zzfhq.this, zzfhgVar);
            }
        });
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte[] b1;
        if (a()) {
            Object obj = f1;
            synchronized (obj) {
                try {
                    if (this.Z.a() == 0) {
                        return;
                    }
                    try {
                        synchronized (obj) {
                            zzfhv zzfhvVar = this.Z;
                            b1 = ((zzfhz) zzfhvVar.V1()).b1();
                            zzfhvVar.Z1();
                        }
                        new zzdzy(this.X, this.Y.X, this.d1, Binder.getCallingUid()).b(new zzdzw((String) com.google.android.gms.ads.internal.client.zzbd.c().b(zzbcv.Z8), 60000, new HashMap(), b1, "application/x-protobuf", false));
                    } catch (Exception e) {
                        if ((e instanceof zzdwf) && ((zzdwf) e).a() == 3) {
                            return;
                        }
                        com.google.android.gms.ads.internal.zzv.t().w(e, "CuiMonitor.sendCuiPing");
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }
}
