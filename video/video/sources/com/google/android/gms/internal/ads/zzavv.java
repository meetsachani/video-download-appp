package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;

/* loaded from: classes2.dex */
final class zzavv implements zzawc {
    public final /* synthetic */ Activity a;
    public final /* synthetic */ Bundle b;

    public zzavv(zzawd zzawdVar, Activity activity, Bundle bundle) {
        this.a = activity;
        this.b = bundle;
    }

    @Override // com.google.android.gms.internal.ads.zzawc
    public final void a(Application.ActivityLifecycleCallbacks activityLifecycleCallbacks) {
        activityLifecycleCallbacks.onActivityCreated(this.a, this.b);
    }
}
