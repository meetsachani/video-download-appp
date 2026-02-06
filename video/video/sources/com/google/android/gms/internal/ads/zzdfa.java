package com.google.android.gms.internal.ads;

import android.view.View;
import java.util.Collections;
import java.util.Set;
import java.util.concurrent.Executor;
import o.InterfaceC11300zs1;

/* loaded from: classes2.dex */
public class zzdfa {
    public final zzdgi a;
    @InterfaceC11300zs1
    public final zzcfb b;

    public zzdfa(zzdgi zzdgiVar, @InterfaceC11300zs1 zzcfb zzcfbVar) {
        this.a = zzdgiVar;
        this.b = zzcfbVar;
    }

    @InterfaceC11300zs1
    public final View a() {
        zzcfb zzcfbVar = this.b;
        if (zzcfbVar == null) {
            return null;
        }
        return zzcfbVar.N();
    }

    @InterfaceC11300zs1
    public final View b() {
        zzcfb zzcfbVar = this.b;
        if (zzcfbVar != null) {
            return zzcfbVar.N();
        }
        return null;
    }

    @InterfaceC11300zs1
    public final zzcfb c() {
        return this.b;
    }

    public final zzddq d(Executor executor) {
        final zzcfb zzcfbVar = this.b;
        return new zzddq(new zzdan() { // from class: com.google.android.gms.internal.ads.zzdez
            @Override // com.google.android.gms.internal.ads.zzdan
            public final void a() {
                com.google.android.gms.ads.internal.overlay.zzm J;
                zzcfb zzcfbVar2 = zzcfb.this;
                if (zzcfbVar2 != null && (J = zzcfbVar2.J()) != null) {
                    J.b();
                }
            }
        }, executor);
    }

    public final zzdgi e() {
        return this.a;
    }

    public Set f(zzcuo zzcuoVar) {
        return Collections.singleton(new zzddq(zzcuoVar, zzcaa.g));
    }

    public Set g(zzcuo zzcuoVar) {
        return Collections.singleton(new zzddq(zzcuoVar, zzcaa.g));
    }
}
