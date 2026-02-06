package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.measurement.zzfp;
import java.util.concurrent.Callable;
import o.InterfaceC5299bJ2;

/* loaded from: classes3.dex */
public final class zzf {
    @InterfaceC5299bJ2
    public final zzbb a;
    @InterfaceC5299bJ2
    public final zzh b;
    @InterfaceC5299bJ2
    public final zzh c;
    @InterfaceC5299bJ2
    public final zzl d;

    public zzf() {
        zzbb zzbbVar = new zzbb();
        this.a = zzbbVar;
        zzh zzhVar = new zzh(null, zzbbVar);
        this.c = zzhVar;
        this.b = zzhVar.d();
        zzl zzlVar = new zzl();
        this.d = zzlVar;
        zzhVar.h("require", new zzz(zzlVar));
        zzlVar.b("internal.platform", new Callable() { // from class: com.google.android.gms.internal.measurement.zze
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return new zzy();
            }
        });
        zzhVar.h("runtime.counter", new zzai(Double.valueOf(0.0d)));
    }

    public final zzaq a(zzh zzhVar, zzfp.zzd... zzdVarArr) {
        zzaq zzaqVar = zzaq.i;
        for (zzfp.zzd zzdVar : zzdVarArr) {
            zzaqVar = zzj.a(zzdVar);
            zzg.b(this.c);
            if ((zzaqVar instanceof zzat) || (zzaqVar instanceof zzar)) {
                zzaqVar = this.a.a(zzhVar, zzaqVar);
            }
        }
        return zzaqVar;
    }

    public final void b(String str, Callable<? extends zzal> callable) {
        this.d.b(str, callable);
    }
}
