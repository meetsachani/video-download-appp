package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import o.InterfaceC11300zs1;

/* loaded from: classes2.dex */
public final class zzcva {
    public Context a;
    public zzfcp b;
    public Bundle c;
    @InterfaceC11300zs1
    public zzfch d;
    @InterfaceC11300zs1
    public zzcut e;
    @InterfaceC11300zs1
    public zzedk f;
    public int g = 0;

    public static /* bridge */ /* synthetic */ int a(zzcva zzcvaVar) {
        return zzcvaVar.g;
    }

    public static /* bridge */ /* synthetic */ Context b(zzcva zzcvaVar) {
        return zzcvaVar.a;
    }

    public static /* bridge */ /* synthetic */ Bundle c(zzcva zzcvaVar) {
        return zzcvaVar.c;
    }

    public static /* bridge */ /* synthetic */ zzcut d(zzcva zzcvaVar) {
        return zzcvaVar.e;
    }

    public static /* bridge */ /* synthetic */ zzedk m(zzcva zzcvaVar) {
        return zzcvaVar.f;
    }

    public static /* bridge */ /* synthetic */ zzfch n(zzcva zzcvaVar) {
        return zzcvaVar.d;
    }

    public static /* bridge */ /* synthetic */ zzfcp o(zzcva zzcvaVar) {
        return zzcvaVar.b;
    }

    public final zzcva e(@InterfaceC11300zs1 zzedk zzedkVar) {
        this.f = zzedkVar;
        return this;
    }

    public final zzcva f(Context context) {
        this.a = context;
        return this;
    }

    public final zzcva g(Bundle bundle) {
        this.c = bundle;
        return this;
    }

    public final zzcva h(@InterfaceC11300zs1 zzcut zzcutVar) {
        this.e = zzcutVar;
        return this;
    }

    public final zzcva i(int i) {
        this.g = i;
        return this;
    }

    public final zzcva j(zzfch zzfchVar) {
        this.d = zzfchVar;
        return this;
    }

    public final zzcva k(zzfcp zzfcpVar) {
        this.b = zzfcpVar;
        return this;
    }

    public final zzcvc l() {
        return new zzcvc(this, null);
    }
}
