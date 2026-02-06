package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.text.TextUtils;

/* loaded from: classes2.dex */
public final class zzeui implements zzetu {
    public final String a;
    public final int b;
    public final int c;
    public final int d;
    public final boolean e;
    public final int f;

    public zzeui(String str, int i, int i2, int i3, boolean z, int i4) {
        this.a = str;
        this.b = i;
        this.c = i2;
        this.d = i3;
        this.e = z;
        this.f = i4;
    }

    @Override // com.google.android.gms.internal.ads.zzetu
    public final /* synthetic */ void b(Object obj) {
    }

    @Override // com.google.android.gms.internal.ads.zzetu
    public final /* bridge */ /* synthetic */ void c(Object obj) {
        Bundle bundle = ((zzcuv) obj).a;
        String str = this.a;
        boolean z = true;
        zzfdd.f(bundle, "carrier", str, !TextUtils.isEmpty(str));
        int i = this.b;
        if (i == -2) {
            z = false;
        }
        zzfdd.e(bundle, "cnt", i, z);
        bundle.putInt("gnt", this.c);
        bundle.putInt("pt", this.d);
        Bundle a = zzfdd.a(bundle, "device");
        bundle.putBundle("device", a);
        Bundle a2 = zzfdd.a(a, "network");
        a.putBundle("network", a2);
        a2.putInt("active_network_state", this.f);
        a2.putBoolean("active_network_metered", this.e);
    }
}
