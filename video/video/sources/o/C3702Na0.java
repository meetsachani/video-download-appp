package o;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;

/* renamed from: o.Na0  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C3702Na0 implements Application.ActivityLifecycleCallbacks {
    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityCreated(Activity activity, Bundle bundle) {
        C6562gT0.p(activity, androidx.appcompat.widget.b.r);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityDestroyed(Activity activity) {
        C6562gT0.p(activity, androidx.appcompat.widget.b.r);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPaused(Activity activity) {
        C6562gT0.p(activity, androidx.appcompat.widget.b.r);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityResumed(Activity activity) {
        C6562gT0.p(activity, androidx.appcompat.widget.b.r);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        C6562gT0.p(activity, androidx.appcompat.widget.b.r);
        C6562gT0.p(bundle, "outState");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStarted(Activity activity) {
        C6562gT0.p(activity, androidx.appcompat.widget.b.r);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStopped(Activity activity) {
        C6562gT0.p(activity, androidx.appcompat.widget.b.r);
    }
}
