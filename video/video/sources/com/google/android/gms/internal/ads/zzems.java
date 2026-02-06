package com.google.android.gms.internal.ads;

import android.os.Bundle;
import o.InterfaceC5056aJ2;

/* loaded from: classes2.dex */
public final class zzems implements zzetu {
    public final Bundle a;

    @InterfaceC5056aJ2
    public zzems(Bundle bundle) {
        this.a = bundle;
    }

    @Override // com.google.android.gms.internal.ads.zzetu
    public final /* synthetic */ void b(Object obj) {
    }

    @Override // com.google.android.gms.internal.ads.zzetu
    public final /* bridge */ /* synthetic */ void c(Object obj) {
        Bundle bundle = this.a;
        zzcuv zzcuvVar = (zzcuv) obj;
        if (!bundle.isEmpty()) {
            zzcuvVar.a.putBundle("installed_adapter_data", bundle);
        }
    }
}
