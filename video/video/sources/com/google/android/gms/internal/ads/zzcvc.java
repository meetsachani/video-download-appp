package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import o.InterfaceC11300zs1;

/* loaded from: classes2.dex */
public final class zzcvc {
    public final Context a;
    public final zzfcp b;
    public final Bundle c;
    @InterfaceC11300zs1
    public final zzfch d;
    @InterfaceC11300zs1
    public final zzcut e;
    @InterfaceC11300zs1
    public final zzedk f;
    public final int g;

    public /* synthetic */ zzcvc(zzcva zzcvaVar, zzcvb zzcvbVar) {
        this.a = zzcva.b(zzcvaVar);
        this.b = zzcva.o(zzcvaVar);
        this.c = zzcva.c(zzcvaVar);
        this.d = zzcva.n(zzcvaVar);
        this.e = zzcva.d(zzcvaVar);
        this.f = zzcva.m(zzcvaVar);
        this.g = zzcva.a(zzcvaVar);
    }

    public final int a() {
        return this.g;
    }

    public final Context b(Context context) {
        return this.a;
    }

    @InterfaceC11300zs1
    public final Bundle c() {
        return this.c;
    }

    @InterfaceC11300zs1
    public final zzcut d() {
        return this.e;
    }

    public final zzcva e() {
        zzcva zzcvaVar = new zzcva();
        zzcvaVar.f(this.a);
        zzcvaVar.k(this.b);
        zzcvaVar.g(this.c);
        zzcvaVar.h(this.e);
        zzcvaVar.e(this.f);
        return zzcvaVar;
    }

    public final zzedk f(String str) {
        zzedk zzedkVar = this.f;
        if (zzedkVar != null) {
            return zzedkVar;
        }
        return new zzedk(str);
    }

    @InterfaceC11300zs1
    public final zzfch g() {
        return this.d;
    }

    public final zzfcp h() {
        return this.b;
    }
}
