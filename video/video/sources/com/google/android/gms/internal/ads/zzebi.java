package com.google.android.gms.internal.ads;

import android.app.Activity;
import o.InterfaceC11300zs1;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class zzebi extends zzecf {
    public Activity a;
    public com.google.android.gms.ads.internal.overlay.zzm b;
    public String c;
    public String d;

    @Override // com.google.android.gms.internal.ads.zzecf
    public final zzecf a(Activity activity) {
        if (activity != null) {
            this.a = activity;
            return this;
        }
        throw new NullPointerException("Null activity");
    }

    @Override // com.google.android.gms.internal.ads.zzecf
    public final zzecf b(@InterfaceC11300zs1 com.google.android.gms.ads.internal.overlay.zzm zzmVar) {
        this.b = zzmVar;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzecf
    public final zzecf c(@InterfaceC11300zs1 String str) {
        this.c = str;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzecf
    public final zzecf d(@InterfaceC11300zs1 String str) {
        this.d = str;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzecf
    public final zzecg e() {
        Activity activity = this.a;
        if (activity != null) {
            return new zzebk(activity, this.b, this.c, this.d, null);
        }
        throw new IllegalStateException("Missing required properties: activity");
    }
}
