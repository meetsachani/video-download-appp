package com.google.android.gms.common.api.internal;

import android.os.Bundle;

/* loaded from: classes2.dex */
final class zza implements Runnable {
    public final /* synthetic */ LifecycleCallback X;
    public final /* synthetic */ String Y;
    public final /* synthetic */ zzb Z;

    public zza(zzb zzbVar, LifecycleCallback lifecycleCallback, String str) {
        this.Z = zzbVar;
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
        zzb zzbVar = this.Z;
        i = zzbVar.Y;
        if (i > 0) {
            LifecycleCallback lifecycleCallback = this.X;
            bundle = zzbVar.Z;
            if (bundle != null) {
                String str = this.Y;
                bundle3 = zzbVar.Z;
                bundle2 = bundle3.getBundle(str);
            } else {
                bundle2 = null;
            }
            lifecycleCallback.g(bundle2);
        }
        i2 = this.Z.Y;
        if (i2 >= 2) {
            this.X.k();
        }
        i3 = this.Z.Y;
        if (i3 >= 3) {
            this.X.i();
        }
        i4 = this.Z.Y;
        if (i4 >= 4) {
            this.X.l();
        }
        i5 = this.Z.Y;
        if (i5 >= 5) {
            this.X.h();
        }
    }
}
