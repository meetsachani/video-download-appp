package com.google.android.gms.internal.ads;

import o.InterfaceC11300zs1;
import o.InterfaceC8710pF0;

/* loaded from: classes2.dex */
public final class zzbih {
    public final com.google.android.gms.ads.formats.zzg a;
    @InterfaceC11300zs1
    public final com.google.android.gms.ads.formats.zzf b;
    @InterfaceC8710pF0("this")
    @InterfaceC11300zs1
    public zzbhb c;

    public zzbih(com.google.android.gms.ads.formats.zzg zzgVar, @InterfaceC11300zs1 com.google.android.gms.ads.formats.zzf zzfVar) {
        this.a = zzgVar;
        this.b = zzfVar;
    }

    @InterfaceC11300zs1
    public final zzbhk c() {
        if (this.b == null) {
            return null;
        }
        return new zzbie(this, null);
    }

    public final zzbhn d() {
        return new zzbif(this, null);
    }

    public final synchronized zzbhb f(zzbha zzbhaVar) {
        zzbhb zzbhbVar = this.c;
        if (zzbhbVar != null) {
            return zzbhbVar;
        }
        zzbhb zzbhbVar2 = new zzbhb(zzbhaVar);
        this.c = zzbhbVar2;
        return zzbhbVar2;
    }
}
