package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;

/* loaded from: classes2.dex */
final class zzaze implements zzazg {
    public final /* synthetic */ Activity a;
    public final /* synthetic */ Bundle b;

    public zzaze(zzazh zzazhVar, Activity activity, Bundle bundle) {
        this.a = activity;
        this.b = bundle;
    }

    @Override // com.google.android.gms.internal.ads.zzazg
    public final void a(Application.ActivityLifecycleCallbacks activityLifecycleCallbacks) {
        activityLifecycleCallbacks.onActivitySaveInstanceState(this.a, this.b);
    }
}
