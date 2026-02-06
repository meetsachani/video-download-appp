package com.google.android.gms.internal.ads;

import android.os.Bundle;
import o.InterfaceC11300zs1;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class zzeqq implements zzetu {
    public final String a;
    public final String b;
    @InterfaceC11300zs1
    public final Bundle c;

    public /* synthetic */ zzeqq(String str, String str2, Bundle bundle, zzeqr zzeqrVar) {
        this.a = str;
        this.b = str2;
        this.c = bundle;
    }

    @Override // com.google.android.gms.internal.ads.zzetu
    public final /* synthetic */ void b(Object obj) {
    }

    @Override // com.google.android.gms.internal.ads.zzetu
    public final /* bridge */ /* synthetic */ void c(Object obj) {
        Bundle bundle = ((zzcuv) obj).a;
        bundle.putString("consent_string", this.a);
        bundle.putString("fc_consent", this.b);
        Bundle bundle2 = this.c;
        if (bundle2 != null) {
            bundle.putBundle("iab_consent_info", bundle2);
        }
    }
}
