package com.google.android.gms.internal.ads;

import o.InterfaceC11300zs1;

/* loaded from: classes2.dex */
public final class zzera implements zzetu {
    @InterfaceC11300zs1
    public final Integer a;

    public zzera(@InterfaceC11300zs1 Integer num) {
        this.a = num;
    }

    @Override // com.google.android.gms.internal.ads.zzetu
    public final /* synthetic */ void b(Object obj) {
    }

    @Override // com.google.android.gms.internal.ads.zzetu
    public final /* bridge */ /* synthetic */ void c(Object obj) {
        Integer num = this.a;
        zzcuv zzcuvVar = (zzcuv) obj;
        if (num != null) {
            zzcuvVar.a.putInt("dspct", Math.min(num.intValue(), 20));
        }
    }
}
