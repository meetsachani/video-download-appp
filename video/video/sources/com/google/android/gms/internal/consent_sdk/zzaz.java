package com.google.android.gms.internal.consent_sdk;

import android.app.Activity;
import android.app.Application;
import android.app.Dialog;
import android.os.Bundle;
import java.util.concurrent.atomic.AtomicReference;
import o.InterfaceC11300zs1;

/* loaded from: classes3.dex */
public final class zzaz implements Application.ActivityLifecycleCallbacks {
    public final Activity X;
    public final /* synthetic */ zzbc Y;

    public zzaz(zzbc zzbcVar, Activity activity) {
        this.Y = zzbcVar;
        this.X = activity;
    }

    public static /* bridge */ /* synthetic */ void a(zzaz zzazVar) {
        zzazVar.b();
    }

    public final void b() {
        Application application;
        application = this.Y.a;
        application.unregisterActivityLifecycleCallbacks(this);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, @InterfaceC11300zs1 Bundle bundle) {
        Dialog dialog;
        Dialog dialog2;
        zzbx zzbxVar;
        AtomicReference atomicReference;
        Dialog dialog3;
        Dialog dialog4;
        Application application;
        AtomicReference atomicReference2;
        zzbx zzbxVar2;
        zzbc zzbcVar = this.Y;
        dialog = zzbcVar.f;
        if (dialog != null && zzbcVar.l) {
            dialog2 = zzbcVar.f;
            dialog2.setOwnerActivity(activity);
            zzbxVar = zzbcVar.b;
            if (zzbxVar != null) {
                zzbxVar2 = zzbcVar.b;
                zzbxVar2.a(activity);
            }
            atomicReference = zzbcVar.k;
            zzaz zzazVar = (zzaz) atomicReference.getAndSet(null);
            if (zzazVar != null) {
                zzazVar.b();
                zzaz zzazVar2 = new zzaz(zzbcVar, activity);
                application = zzbcVar.a;
                application.registerActivityLifecycleCallbacks(zzazVar2);
                atomicReference2 = zzbcVar.k;
                atomicReference2.set(zzazVar2);
            }
            dialog3 = zzbcVar.f;
            if (dialog3 != null) {
                dialog4 = zzbcVar.f;
                dialog4.show();
            }
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
        Dialog dialog;
        Dialog dialog2;
        if (activity != this.X) {
            return;
        }
        if (activity.isChangingConfigurations()) {
            zzbc zzbcVar = this.Y;
            if (zzbcVar.l) {
                dialog = zzbcVar.f;
                if (dialog != null) {
                    dialog2 = zzbcVar.f;
                    dialog2.dismiss();
                    return;
                }
            }
        }
        this.Y.i(new zzg(3, "Activity is destroyed."));
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
    }
}
