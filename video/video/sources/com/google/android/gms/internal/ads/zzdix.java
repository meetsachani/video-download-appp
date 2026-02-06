package com.google.android.gms.internal.ads;

import o.C9654t62;
import o.InterfaceC11300zs1;

/* loaded from: classes2.dex */
public final class zzdix {
    public zzbhh a;
    public zzbhe b;
    public zzbhu c;
    public zzbhr d;
    public zzbmp e;
    public final C9654t62 f = new C9654t62();
    public final C9654t62 g = new C9654t62();

    public final zzdix a(zzbhe zzbheVar) {
        this.b = zzbheVar;
        return this;
    }

    public final zzdix b(zzbhh zzbhhVar) {
        this.a = zzbhhVar;
        return this;
    }

    public final zzdix c(String str, zzbhn zzbhnVar, @InterfaceC11300zs1 zzbhk zzbhkVar) {
        this.f.put(str, zzbhnVar);
        if (zzbhkVar != null) {
            this.g.put(str, zzbhkVar);
        }
        return this;
    }

    public final zzdix d(zzbmp zzbmpVar) {
        this.e = zzbmpVar;
        return this;
    }

    public final zzdix e(zzbhr zzbhrVar) {
        this.d = zzbhrVar;
        return this;
    }

    public final zzdix f(zzbhu zzbhuVar) {
        this.c = zzbhuVar;
        return this;
    }

    public final zzdiz g() {
        return new zzdiz(this);
    }
}
