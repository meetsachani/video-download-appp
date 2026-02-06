package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import com.google.android.gms.ads.MobileAds;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import o.InterfaceC11300zs1;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class zzazm implements Application.ActivityLifecycleCallbacks {
    @InterfaceC11300zs1
    public Activity X;
    public Context Y;
    public Runnable c1;
    public long e1;
    public final Object Z = new Object();
    public boolean Y0 = true;
    public boolean Z0 = false;
    public final List a1 = new ArrayList();
    public final List b1 = new ArrayList();
    public boolean d1 = false;

    @InterfaceC11300zs1
    public final Activity a() {
        return this.X;
    }

    @InterfaceC11300zs1
    public final Context b() {
        return this.Y;
    }

    public final void f(zzazn zzaznVar) {
        synchronized (this.Z) {
            this.a1.add(zzaznVar);
        }
    }

    public final void g(Application application, Context context) {
        if (!this.d1) {
            application.registerActivityLifecycleCallbacks(this);
            if (context instanceof Activity) {
                k((Activity) context);
            }
            this.Y = application;
            this.e1 = ((Long) com.google.android.gms.ads.internal.client.zzbd.c().b(zzbcv.g1)).longValue();
            this.d1 = true;
        }
    }

    public final void h(zzazn zzaznVar) {
        synchronized (this.Z) {
            this.a1.remove(zzaznVar);
        }
    }

    public final void k(Activity activity) {
        synchronized (this.Z) {
            try {
                if (!activity.getClass().getName().startsWith(MobileAds.a)) {
                    this.X = activity;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
        synchronized (this.Z) {
            try {
                Activity activity2 = this.X;
                if (activity2 == null) {
                    return;
                }
                if (activity2.equals(activity)) {
                    this.X = null;
                }
                Iterator it = this.b1.iterator();
                while (it.hasNext()) {
                    try {
                        if (((zzbab) it.next()).a()) {
                            it.remove();
                        }
                    } catch (Exception e) {
                        com.google.android.gms.ads.internal.zzv.t().x(e, "AppActivityTracker.ActivityListener.onActivityDestroyed");
                        int i = com.google.android.gms.ads.internal.util.zze.b;
                        com.google.android.gms.ads.internal.util.client.zzo.e("", e);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
        k(activity);
        synchronized (this.Z) {
            for (zzbab zzbabVar : this.b1) {
                try {
                    zzbabVar.b();
                } catch (Exception e) {
                    com.google.android.gms.ads.internal.zzv.t().x(e, "AppActivityTracker.ActivityListener.onActivityPaused");
                    int i = com.google.android.gms.ads.internal.util.zze.b;
                    com.google.android.gms.ads.internal.util.client.zzo.e("", e);
                }
            }
        }
        this.Z0 = true;
        Runnable runnable = this.c1;
        if (runnable != null) {
            com.google.android.gms.ads.internal.util.zzs.l.removeCallbacks(runnable);
        }
        zzfrl zzfrlVar = com.google.android.gms.ads.internal.util.zzs.l;
        zzazl zzazlVar = new zzazl(this);
        this.c1 = zzazlVar;
        zzfrlVar.postDelayed(zzazlVar, this.e1);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
        k(activity);
        this.Z0 = false;
        boolean z = this.Y0;
        this.Y0 = true;
        Runnable runnable = this.c1;
        if (runnable != null) {
            com.google.android.gms.ads.internal.util.zzs.l.removeCallbacks(runnable);
        }
        synchronized (this.Z) {
            for (zzbab zzbabVar : this.b1) {
                try {
                    zzbabVar.c();
                } catch (Exception e) {
                    com.google.android.gms.ads.internal.zzv.t().x(e, "AppActivityTracker.ActivityListener.onActivityResumed");
                    int i = com.google.android.gms.ads.internal.util.zze.b;
                    com.google.android.gms.ads.internal.util.client.zzo.e("", e);
                }
            }
            if (!z) {
                for (zzazn zzaznVar : this.a1) {
                    try {
                        zzaznVar.O0(true);
                    } catch (Exception e2) {
                        int i2 = com.google.android.gms.ads.internal.util.zze.b;
                        com.google.android.gms.ads.internal.util.client.zzo.e("", e2);
                    }
                }
            } else {
                int i3 = com.google.android.gms.ads.internal.util.zze.b;
                com.google.android.gms.ads.internal.util.client.zzo.b("App is still foreground.");
            }
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
        k(activity);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
    }
}
