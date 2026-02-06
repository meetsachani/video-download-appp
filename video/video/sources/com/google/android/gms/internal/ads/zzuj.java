package com.google.android.gms.internal.ads;

import android.os.Handler;
import java.io.IOException;
import java.util.HashMap;
import o.InterfaceC11300zs1;
import o.InterfaceC2591Bt;

/* loaded from: classes2.dex */
public abstract class zzuj extends zzua {
    public final HashMap h = new HashMap();
    @InterfaceC11300zs1
    public Handler i;
    @InterfaceC11300zs1
    public zzhg j;

    public int A(Object obj, int i) {
        return 0;
    }

    public long B(Object obj, long j, @InterfaceC11300zs1 zzvb zzvbVar) {
        return j;
    }

    @Override // com.google.android.gms.internal.ads.zzvd
    @InterfaceC2591Bt
    public void C() throws IOException {
        for (zzui zzuiVar : this.h.values()) {
            zzuiVar.a.C();
        }
    }

    @InterfaceC11300zs1
    public zzvb D(Object obj, zzvb zzvbVar) {
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzua
    @InterfaceC2591Bt
    public final void s() {
        for (zzui zzuiVar : this.h.values()) {
            zzuiVar.a.i(zzuiVar.b);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzua
    @InterfaceC2591Bt
    public final void t() {
        for (zzui zzuiVar : this.h.values()) {
            zzuiVar.a.e(zzuiVar.b);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzua
    @InterfaceC2591Bt
    public void u(@InterfaceC11300zs1 zzhg zzhgVar) {
        this.j = zzhgVar;
        this.i = zzeu.T(null);
    }

    @Override // com.google.android.gms.internal.ads.zzua
    @InterfaceC2591Bt
    public void w() {
        HashMap hashMap = this.h;
        for (zzui zzuiVar : hashMap.values()) {
            zzvd zzvdVar = zzuiVar.a;
            zzvdVar.a(zzuiVar.b);
            zzuh zzuhVar = zzuiVar.c;
            zzvdVar.f(zzuhVar);
            zzvdVar.d(zzuhVar);
        }
        hashMap.clear();
    }

    public abstract void y(Object obj, zzvd zzvdVar, zzbl zzblVar);

    public final void z(final Object obj, zzvd zzvdVar) {
        HashMap hashMap = this.h;
        zzdc.d(!hashMap.containsKey(obj));
        zzvc zzvcVar = new zzvc() { // from class: com.google.android.gms.internal.ads.zzug
            @Override // com.google.android.gms.internal.ads.zzvc
            public final void a(zzvd zzvdVar2, zzbl zzblVar) {
                zzuj.this.y(obj, zzvdVar2, zzblVar);
            }
        };
        zzuh zzuhVar = new zzuh(this, obj);
        hashMap.put(obj, new zzui(zzvdVar, zzvcVar, zzuhVar));
        Handler handler = this.i;
        handler.getClass();
        zzvdVar.l(handler, zzuhVar);
        Handler handler2 = this.i;
        handler2.getClass();
        zzvdVar.b(handler2, zzuhVar);
        zzvdVar.h(zzvcVar, this.j, m());
        if (!x()) {
            zzvdVar.i(zzvcVar);
        }
    }
}
