package com.google.android.gms.internal.ads;

import android.os.Bundle;

/* loaded from: classes2.dex */
public final class zzeof implements zzetu {
    public final double a;
    public final boolean b;

    public zzeof(double d, boolean z) {
        this.a = d;
        this.b = z;
    }

    @Override // com.google.android.gms.internal.ads.zzetu
    public final /* synthetic */ void b(Object obj) {
    }

    @Override // com.google.android.gms.internal.ads.zzetu
    public final /* bridge */ /* synthetic */ void c(Object obj) {
        Bundle bundle = ((zzcuv) obj).a;
        Bundle a = zzfdd.a(bundle, "device");
        bundle.putBundle("device", a);
        Bundle a2 = zzfdd.a(a, "battery");
        a.putBundle("battery", a2);
        a2.putBoolean("is_charging", this.b);
        a2.putDouble("battery_level", this.a);
    }
}
