package com.google.android.gms.internal.ads;

import android.os.Bundle;
import o.InterfaceC11300zs1;

/* loaded from: classes2.dex */
public final class zzemz implements zzetu {
    @InterfaceC11300zs1
    public final String a;
    public final boolean b;

    public zzemz(@InterfaceC11300zs1 String str, boolean z) {
        this.a = str;
        this.b = z;
    }

    @Override // com.google.android.gms.internal.ads.zzetu
    public final /* synthetic */ void b(Object obj) {
    }

    @Override // com.google.android.gms.internal.ads.zzetu
    public final /* bridge */ /* synthetic */ void c(Object obj) {
        String str = this.a;
        zzcuv zzcuvVar = (zzcuv) obj;
        if (str != null) {
            Bundle a = zzfdd.a(zzcuvVar.a, "pii");
            a.putString("afai", str);
            a.putBoolean("is_afai_lat", this.b);
        }
    }
}
