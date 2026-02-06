package com.google.android.gms.internal.ads;

import android.os.Bundle;
import o.InterfaceC11300zs1;

/* loaded from: classes2.dex */
public final class zzerl implements zzetu {
    @InterfaceC11300zs1
    public final Boolean a;

    public zzerl(@InterfaceC11300zs1 Boolean bool) {
        this.a = bool;
    }

    @Override // com.google.android.gms.internal.ads.zzetu
    public final /* synthetic */ void b(Object obj) {
    }

    @Override // com.google.android.gms.internal.ads.zzetu
    public final /* bridge */ /* synthetic */ void c(Object obj) {
        Bundle bundle = ((zzcuv) obj).a;
        Boolean bool = this.a;
        if (bool == null) {
            bundle.putInt("lft", -1);
        } else if (bool.booleanValue()) {
            bundle.putInt("lft", 1);
        } else {
            bundle.putInt("lft", 0);
        }
    }
}
