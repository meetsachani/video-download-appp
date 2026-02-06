package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;

/* loaded from: classes2.dex */
final class zzayz implements zzazg {
    public final /* synthetic */ Activity a;
    public final /* synthetic */ Bundle b;

    public zzayz(zzazh zzazhVar, Activity activity, Bundle bundle) {
        this.a = activity;
        this.b = bundle;
    }

    @Override // com.google.android.gms.internal.ads.zzazg
    public final void a(Application.ActivityLifecycleCallbacks activityLifecycleCallbacks) {
        activityLifecycleCallbacks.onActivityCreated(this.a, this.b);
    }
}
