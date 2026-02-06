package com.google.android.gms.internal.ads;

import android.os.Bundle;

/* loaded from: classes2.dex */
public final class zzetc implements zzetu {
    public final String a;
    public final Bundle b;

    public zzetc(String str, Bundle bundle) {
        this.a = str;
        this.b = bundle;
    }

    @Override // com.google.android.gms.internal.ads.zzetu
    public final /* synthetic */ void b(Object obj) {
    }

    @Override // com.google.android.gms.internal.ads.zzetu
    public final /* bridge */ /* synthetic */ void c(Object obj) {
        Bundle bundle = ((zzcuv) obj).a;
        bundle.putString("rtb", this.a);
        Bundle bundle2 = this.b;
        if (!bundle2.isEmpty()) {
            bundle.putBundle("adapter_initialization_status", bundle2);
        }
    }
}
