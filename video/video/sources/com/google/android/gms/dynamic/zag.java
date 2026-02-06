package com.google.android.gms.dynamic;

/* loaded from: classes2.dex */
final class zag implements zah {
    public final /* synthetic */ DeferredLifecycleHelper a;

    public zag(DeferredLifecycleHelper deferredLifecycleHelper) {
        this.a = deferredLifecycleHelper;
    }

    @Override // com.google.android.gms.dynamic.zah
    public final void a(LifecycleDelegate lifecycleDelegate) {
        LifecycleDelegate lifecycleDelegate2;
        lifecycleDelegate2 = this.a.a;
        lifecycleDelegate2.onResume();
    }

    @Override // com.google.android.gms.dynamic.zah
    public final int d() {
        return 5;
    }
}
