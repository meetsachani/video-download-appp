package com.google.android.gms.dynamic;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.FrameLayout;

/* loaded from: classes2.dex */
final class zad implements zah {
    public final /* synthetic */ FrameLayout a;
    public final /* synthetic */ LayoutInflater b;
    public final /* synthetic */ ViewGroup c;
    public final /* synthetic */ Bundle d;
    public final /* synthetic */ DeferredLifecycleHelper e;

    public zad(DeferredLifecycleHelper deferredLifecycleHelper, FrameLayout frameLayout, LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.e = deferredLifecycleHelper;
        this.a = frameLayout;
        this.b = layoutInflater;
        this.c = viewGroup;
        this.d = bundle;
    }

    @Override // com.google.android.gms.dynamic.zah
    public final void a(LifecycleDelegate lifecycleDelegate) {
        LifecycleDelegate lifecycleDelegate2;
        this.a.removeAllViews();
        FrameLayout frameLayout = this.a;
        lifecycleDelegate2 = this.e.a;
        frameLayout.addView(lifecycleDelegate2.c(this.b, this.c, this.d));
    }

    @Override // com.google.android.gms.dynamic.zah
    public final int d() {
        return 2;
    }
}
