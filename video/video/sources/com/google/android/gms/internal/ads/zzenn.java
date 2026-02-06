package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.text.TextUtils;
import o.InterfaceC11300zs1;
import o.InterfaceC5056aJ2;

/* loaded from: classes2.dex */
public final class zzenn implements zzetu {
    @InterfaceC11300zs1
    @InterfaceC5056aJ2
    public final String a;
    @InterfaceC5056aJ2
    public final int b;

    public zzenn(@InterfaceC11300zs1 String str, int i) {
        this.a = str;
        this.b = i;
    }

    @Override // com.google.android.gms.internal.ads.zzetu
    public final /* synthetic */ void b(Object obj) {
    }

    @Override // com.google.android.gms.internal.ads.zzetu
    public final /* bridge */ /* synthetic */ void c(Object obj) {
        int i;
        Bundle bundle = ((zzcuv) obj).a;
        String str = this.a;
        if (!TextUtils.isEmpty(str) && (i = this.b) != -1) {
            Bundle a = zzfdd.a(bundle, "pii");
            bundle.putBundle("pii", a);
            a.putString("pvid", str);
            a.putInt("pvid_s", i);
        }
    }
}
