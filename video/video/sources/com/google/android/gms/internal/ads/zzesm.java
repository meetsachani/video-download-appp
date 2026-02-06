package com.google.android.gms.internal.ads;

import android.os.Bundle;
import o.InterfaceC11300zs1;

/* loaded from: classes2.dex */
public final class zzesm implements zzetu {
    @InterfaceC11300zs1
    public final Bundle a;

    public zzesm(@InterfaceC11300zs1 Bundle bundle) {
        this.a = bundle;
    }

    @Override // com.google.android.gms.internal.ads.zzetu
    public final /* bridge */ /* synthetic */ void b(Object obj) {
        Bundle bundle = this.a;
        zzcuv zzcuvVar = (zzcuv) obj;
        if (bundle != null) {
            zzcuvVar.b.putAll(bundle);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzetu
    public final /* bridge */ /* synthetic */ void c(Object obj) {
        Bundle bundle = this.a;
        zzcuv zzcuvVar = (zzcuv) obj;
        if (bundle != null) {
            zzcuvVar.a.putAll(bundle);
        }
    }
}
