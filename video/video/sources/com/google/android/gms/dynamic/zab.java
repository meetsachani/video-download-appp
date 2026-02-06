package com.google.android.gms.dynamic;

import android.app.Activity;
import android.os.Bundle;

/* loaded from: classes2.dex */
final class zab implements zah {
    public final /* synthetic */ Activity a;
    public final /* synthetic */ Bundle b;
    public final /* synthetic */ Bundle c;
    public final /* synthetic */ DeferredLifecycleHelper d;

    public zab(DeferredLifecycleHelper deferredLifecycleHelper, Activity activity, Bundle bundle, Bundle bundle2) {
        this.d = deferredLifecycleHelper;
        this.a = activity;
        this.b = bundle;
        this.c = bundle2;
    }

    @Override // com.google.android.gms.dynamic.zah
    public final void a(LifecycleDelegate lifecycleDelegate) {
        LifecycleDelegate lifecycleDelegate2;
        lifecycleDelegate2 = this.d.a;
        lifecycleDelegate2.b(this.a, this.b, this.c);
    }

    @Override // com.google.android.gms.dynamic.zah
    public final int d() {
        return 0;
    }
}
