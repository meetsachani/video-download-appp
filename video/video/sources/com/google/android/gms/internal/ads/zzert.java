package com.google.android.gms.internal.ads;

import android.os.Bundle;

/* loaded from: classes2.dex */
public final class zzert implements zzetu {
    public final Bundle a;

    public zzert(Bundle bundle) {
        this.a = bundle;
    }

    @Override // com.google.android.gms.internal.ads.zzetu
    public final /* synthetic */ void b(Object obj) {
    }

    @Override // com.google.android.gms.internal.ads.zzetu
    public final /* bridge */ /* synthetic */ void c(Object obj) {
        Bundle bundle = ((zzcuv) obj).a;
        Bundle a = zzfdd.a(bundle, "device");
        a.putBundle("android_mem_info", this.a);
        bundle.putBundle("device", a);
    }
}
