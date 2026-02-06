package com.google.android.gms.internal.ads;

import o.InterfaceC11300zs1;

/* loaded from: classes2.dex */
public final class zzcqp {
    public final zzcyq a;
    @InterfaceC11300zs1
    public final zzdaw b;

    public zzcqp(zzcyq zzcyqVar, @InterfaceC11300zs1 zzdaw zzdawVar) {
        this.a = zzcyqVar;
        this.b = zzdawVar;
    }

    public final zzcyq a() {
        return this.a;
    }

    @InterfaceC11300zs1
    public final zzdaw b() {
        return this.b;
    }

    public final zzddq c() {
        zzdaw zzdawVar = this.b;
        if (zzdawVar != null) {
            return new zzddq(zzdawVar, zzcaa.g);
        }
        return new zzddq(new zzcqo(this), zzcaa.g);
    }
}
