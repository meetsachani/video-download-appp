package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import java.lang.ref.WeakReference;

/* loaded from: classes2.dex */
final class zzawd implements Application.ActivityLifecycleCallbacks {
    public final Application X;
    public final WeakReference Y;
    public boolean Z = false;

    public zzawd(Application application, Application.ActivityLifecycleCallbacks activityLifecycleCallbacks) {
        this.Y = new WeakReference(activityLifecycleCallbacks);
        this.X = application;
    }

    public final void a(zzawc zzawcVar) {
        try {
            Application.ActivityLifecycleCallbacks activityLifecycleCallbacks = (Application.ActivityLifecycleCallbacks) this.Y.get();
            if (activityLifecycleCallbacks != null) {
                zzawcVar.a(activityLifecycleCallbacks);
            } else if (!this.Z) {
                this.X.unregisterActivityLifecycleCallbacks(this);
                this.Z = true;
            }
        } catch (Exception unused) {
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
        a(new zzavv(this, activity, bundle));
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
        a(new zzawb(this, activity));
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
        a(new zzavy(this, activity));
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
        a(new zzavx(this, activity));
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        a(new zzawa(this, activity, bundle));
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
        a(new zzavw(this, activity));
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
        a(new zzavz(this, activity));
    }
}
