package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.app.Application;

/* loaded from: classes2.dex */
final class zzazf implements zzazg {
    public final /* synthetic */ Activity a;

    public zzazf(zzazh zzazhVar, Activity activity) {
        this.a = activity;
    }

    @Override // com.google.android.gms.internal.ads.zzazg
    public final void a(Application.ActivityLifecycleCallbacks activityLifecycleCallbacks) {
        activityLifecycleCallbacks.onActivityDestroyed(this.a);
    }
}
