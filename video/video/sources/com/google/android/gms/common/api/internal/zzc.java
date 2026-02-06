package com.google.android.gms.common.api.internal;

import android.os.Bundle;

/* loaded from: classes2.dex */
final class zzc implements Runnable {
    public final /* synthetic */ LifecycleCallback X;
    public final /* synthetic */ String Y;
    public final /* synthetic */ zzd Z;

    public zzc(zzd zzdVar, LifecycleCallback lifecycleCallback, String str) {
        this.Z = zzdVar;
        this.X = lifecycleCallback;
        this.Y = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        Bundle bundle;
        Bundle bundle2;
        Bundle bundle3;
        zzd zzdVar = this.Z;
        i = zzdVar.i2;
        if (i > 0) {
            LifecycleCallback lifecycleCallback = this.X;
            bundle = zzdVar.j2;
            if (bundle != null) {
                String str = this.Y;
                bundle3 = zzdVar.j2;
                bundle2 = bundle3.getBundle(str);
            } else {
                bundle2 = null;
            }
            lifecycleCallback.g(bundle2);
        }
        i2 = this.Z.i2;
        if (i2 >= 2) {
            this.X.k();
        }
        i3 = this.Z.i2;
        if (i3 >= 3) {
            this.X.i();
        }
        i4 = this.Z.i2;
        if (i4 >= 4) {
            this.X.l();
        }
        i5 = this.Z.i2;
        if (i5 >= 5) {
            this.X.h();
        }
    }
}
