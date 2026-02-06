package com.google.android.gms.dynamic;

import android.os.Bundle;

/* loaded from: classes2.dex */
final class zac implements zah {
    public final /* synthetic */ Bundle a;
    public final /* synthetic */ DeferredLifecycleHelper b;

    public zac(DeferredLifecycleHelper deferredLifecycleHelper, Bundle bundle) {
        this.b = deferredLifecycleHelper;
        this.a = bundle;
    }

    @Override // com.google.android.gms.dynamic.zah
    public final void a(LifecycleDelegate lifecycleDelegate) {
        LifecycleDelegate lifecycleDelegate2;
        lifecycleDelegate2 = this.b.a;
        lifecycleDelegate2.onCreate(this.a);
    }

    @Override // com.google.android.gms.dynamic.zah
    public final int d() {
        return 1;
    }
}
