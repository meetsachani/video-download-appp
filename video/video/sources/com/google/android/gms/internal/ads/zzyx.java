package com.google.android.gms.internal.ads;

import o.InterfaceC11300zs1;
import o.InterfaceC2591Bt;

/* loaded from: classes2.dex */
public abstract class zzyx {
    @InterfaceC11300zs1
    public zzyw a;
    @InterfaceC11300zs1
    public zzzf b;

    @InterfaceC11300zs1
    public zzlx b() {
        throw null;
    }

    @InterfaceC2591Bt
    public void c() {
        this.a = null;
        this.b = null;
    }

    public void d(zze zzeVar) {
        throw null;
    }

    public boolean e() {
        throw null;
    }

    public abstract zzyy f(zzly[] zzlyVarArr, zzxe zzxeVar, zzvb zzvbVar, zzbl zzblVar) throws zzik;

    public abstract void g(@InterfaceC11300zs1 Object obj);

    public final zzzf h() {
        zzzf zzzfVar = this.b;
        zzdc.b(zzzfVar);
        return zzzfVar;
    }

    @InterfaceC2591Bt
    public final void i(zzyw zzywVar, zzzf zzzfVar) {
        this.a = zzywVar;
        this.b = zzzfVar;
    }

    public final void j() {
        zzyw zzywVar = this.a;
        if (zzywVar != null) {
            zzywVar.l();
        }
    }
}
