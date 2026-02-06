package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.measurement.zzfp;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Callable;
import o.InterfaceC5299bJ2;

/* loaded from: classes3.dex */
public final class zzb {
    @InterfaceC5299bJ2
    public final zzf a;
    @InterfaceC5299bJ2
    public zzh b;
    @InterfaceC5299bJ2
    public zzac c;
    public final zzaa d;

    public zzb() {
        this(new zzf());
    }

    public final zzac a() {
        return this.c;
    }

    public final void b(zzfp.zzc zzcVar) throws zzc {
        zzal zzalVar;
        try {
            this.b = this.a.b.d();
            if (!(this.a.a(this.b, (zzfp.zzd[]) zzcVar.H().toArray(new zzfp.zzd[0])) instanceof zzaj)) {
                for (zzfp.zzb zzbVar : zzcVar.F().H()) {
                    List<zzfp.zzd> H = zzbVar.H();
                    String G = zzbVar.G();
                    for (zzfp.zzd zzdVar : H) {
                        zzaq a = this.a.a(this.b, zzdVar);
                        if (a instanceof zzap) {
                            zzh zzhVar = this.b;
                            if (!zzhVar.g(G)) {
                                zzalVar = null;
                            } else {
                                zzaq c = zzhVar.c(G);
                                if (c instanceof zzal) {
                                    zzalVar = (zzal) c;
                                } else {
                                    throw new IllegalStateException("Invalid function name: " + G);
                                }
                            }
                            if (zzalVar != null) {
                                zzalVar.a(this.b, Collections.singletonList(a));
                            } else {
                                throw new IllegalStateException("Rule function is undefined: " + G);
                            }
                        } else {
                            throw new IllegalArgumentException("Invalid rule definition");
                        }
                    }
                }
                return;
            }
            throw new IllegalStateException("Program loading failed");
        } catch (Throwable th) {
            throw new zzc(th);
        }
    }

    public final void c(String str, Callable<? extends zzal> callable) {
        this.a.b(str, callable);
    }

    public final boolean d(zzad zzadVar) throws zzc {
        try {
            this.c.b(zzadVar);
            this.a.c.h("runtime.counter", new zzai(Double.valueOf(0.0d)));
            this.d.b(this.b.d(), this.c);
            if (!g()) {
                if (!f()) {
                    return false;
                }
                return true;
            }
            return true;
        } catch (Throwable th) {
            throw new zzc(th);
        }
    }

    public final /* synthetic */ zzal e() throws Exception {
        return new zzw(this.d);
    }

    public final boolean f() {
        if (!this.c.f().isEmpty()) {
            return true;
        }
        return false;
    }

    public final boolean g() {
        if (!this.c.d().equals(this.c.a())) {
            return true;
        }
        return false;
    }

    public zzb(zzf zzfVar) {
        this.a = zzfVar;
        this.b = zzfVar.b.d();
        this.c = new zzac();
        this.d = new zzaa();
        zzfVar.b("internal.registerCallback", new Callable() { // from class: com.google.android.gms.internal.measurement.zza
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return zzb.this.e();
            }
        });
        zzfVar.b("internal.eventLogger", new Callable() { // from class: com.google.android.gms.internal.measurement.zzd
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return new zzk(zzb.this.c);
            }
        });
    }
}
