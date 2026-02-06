package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.app.Application;

/* loaded from: classes2.dex */
final class zzavy implements zzawc {
    public final /* synthetic */ Activity a;

    public zzavy(zzawd zzawdVar, Activity activity) {
        this.a = activity;
    }

    @Override // com.google.android.gms.internal.ads.zzawc
    public final void a(Application.ActivityLifecycleCallbacks activityLifecycleCallbacks) {
        activityLifecycleCallbacks.onActivityPaused(this.a);
    }
}
