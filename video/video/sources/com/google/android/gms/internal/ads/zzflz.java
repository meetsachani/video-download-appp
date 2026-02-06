package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.app.ActivityManager;
import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import o.InterfaceC5670cr1;

/* loaded from: classes2.dex */
public class zzflz implements Application.ActivityLifecycleCallbacks {
    public boolean X;
    public boolean Y;
    public zzfly Z;

    public final void a(boolean z) {
        if (this.Y != z) {
            this.Y = z;
            if (this.X) {
                b(z);
                zzfly zzflyVar = this.Z;
                if (zzflyVar != null) {
                    zzflyVar.a(z);
                }
            }
        }
    }

    public void b(boolean z) {
    }

    public boolean c() {
        return false;
    }

    public final void d(@InterfaceC5670cr1 Context context) {
        if (context instanceof Application) {
            ((Application) context).registerActivityLifecycleCallbacks(this);
        }
    }

    public final void e(zzfly zzflyVar) {
        this.Z = zzflyVar;
    }

    public final void f() {
        this.X = true;
        boolean h = h();
        this.Y = h;
        b(h);
    }

    public final void g() {
        this.X = false;
        this.Z = null;
    }

    public final boolean h() {
        ActivityManager.RunningAppProcessInfo runningAppProcessInfo = new ActivityManager.RunningAppProcessInfo();
        ActivityManager.getMyMemoryState(runningAppProcessInfo);
        if (runningAppProcessInfo.importance != 100 && !c()) {
            return false;
        }
        return true;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
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
        a(true);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
        a(h());
    }
}
