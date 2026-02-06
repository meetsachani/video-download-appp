package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import java.lang.ref.WeakReference;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class zzazh implements Application.ActivityLifecycleCallbacks {
    public final Application X;
    public final WeakReference Y;
    public boolean Z = false;

    public zzazh(Application application, Application.ActivityLifecycleCallbacks activityLifecycleCallbacks) {
        this.Y = new WeakReference(activityLifecycleCallbacks);
        this.X = application;
    }

    public final void a(zzazg zzazgVar) {
        try {
            Application.ActivityLifecycleCallbacks activityLifecycleCallbacks = (Application.ActivityLifecycleCallbacks) this.Y.get();
            if (activityLifecycleCallbacks != null) {
                zzazgVar.a(activityLifecycleCallbacks);
            } else if (!this.Z) {
                this.X.unregisterActivityLifecycleCallbacks(this);
                this.Z = true;
            }
        } catch (Exception e) {
            int i = com.google.android.gms.ads.internal.util.zze.b;
            com.google.android.gms.ads.internal.util.client.zzo.e("Error while dispatching lifecycle callback.", e);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
        a(new zzayz(this, activity, bundle));
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
        a(new zzazf(this, activity));
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
        a(new zzazc(this, activity));
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
        a(new zzazb(this, activity));
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        a(new zzaze(this, activity, bundle));
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
        a(new zzaza(this, activity));
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
        a(new zzazd(this, activity));
    }
}
