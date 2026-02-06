package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.ads.dynamite.ModuleDescriptor;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import o.InterfaceC10571ws1;

/* loaded from: classes2.dex */
public abstract class zzchb implements zzcla {
    @InterfaceC10571ws1
    public static zzchb a;

    public static synchronized zzchb e(Context context, @InterfaceC10571ws1 zzbpl zzbplVar, int i, boolean z, int i2, zzcih zzcihVar) {
        synchronized (zzchb.class) {
            try {
                zzchb zzchbVar = a;
                if (zzchbVar != null) {
                    return zzchbVar;
                }
                long a2 = com.google.android.gms.ads.internal.zzv.d().a();
                zzbcv.a(context);
                if (((Boolean) zzben.e.e()).booleanValue()) {
                    zzbcf.d(context);
                }
                zzfdl d = zzfdl.d(context);
                VersionInfoParcel c = d.c(ModuleDescriptor.MODULE_VERSION, false, i2);
                d.f(zzbplVar);
                zzciw zzciwVar = new zzciw(null);
                zzchc zzchcVar = new zzchc();
                zzchcVar.f(c);
                zzchcVar.e(context);
                zzchcVar.d(a2);
                zzciwVar.b(new zzche(zzchcVar, null));
                zzciwVar.c(new zzcjq(zzcihVar));
                zzchb a3 = zzciwVar.a();
                if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.c().b(zzbcv.Id)).booleanValue()) {
                    com.google.android.gms.ads.internal.zzv.u().b(zzffn.c(), a3.n());
                    com.google.android.gms.ads.internal.zzv.u().c();
                }
                com.google.android.gms.ads.internal.zzv.t().v(context, c);
                com.google.android.gms.ads.internal.zzv.g().i(context);
                com.google.android.gms.ads.internal.zzv.v().S(context);
                com.google.android.gms.ads.internal.zzv.v().R(context);
                com.google.android.gms.ads.internal.util.zzd.a(context);
                com.google.android.gms.ads.internal.zzv.f().d(context);
                com.google.android.gms.ads.internal.zzv.B().b(context);
                ((com.google.android.gms.ads.internal.util.zzcb) ((zzcil) a3).l0.b()).c();
                zzbyk.b(context);
                if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.c().b(zzbcv.s6)).booleanValue()) {
                    if (!((Boolean) com.google.android.gms.ads.internal.client.zzbd.c().b(zzbcv.M0)).booleanValue()) {
                        new zzebg(context, c, new zzbbt(new zzbbz(context)), new zzeal(new zzeah(context), (zzgdj) ((zzcil) a3).g.b())).b(com.google.android.gms.ads.internal.zzv.t().j().M());
                    }
                }
                a = a3;
                return a3;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static zzchb f(Context context, @InterfaceC10571ws1 zzbpl zzbplVar, int i) {
        return e(context, zzbplVar, ModuleDescriptor.MODULE_VERSION, false, i, new zzcih());
    }

    public abstract zzfde A();

    public abstract zzfdo B();

    public abstract zzfhq C();

    public abstract zzfka D();

    @Override // com.google.android.gms.internal.ads.zzcla
    public final zzbzc F() {
        return d();
    }

    @Override // com.google.android.gms.internal.ads.zzcla
    public final zzeuy a(zzbvl zzbvlVar, int i) {
        return v(new zzewb(zzbvlVar, i));
    }

    public abstract Executor b();

    public abstract ScheduledExecutorService c();

    public abstract zzbzc d();

    public abstract zzckb g();

    public abstract zzcoc h();

    public abstract zzcpt i();

    public abstract zzcyq j();

    public abstract zzdfz k();

    public abstract zzdgv l();

    public abstract zzdol m();

    public abstract zzdsd n();

    public abstract zzdtn o();

    public abstract zzdvc p();

    public abstract zzdvz q();

    public abstract zzece r();

    public abstract com.google.android.gms.ads.nonagon.signalgeneration.zzv s();

    public abstract com.google.android.gms.ads.nonagon.signalgeneration.zzab t();

    public abstract com.google.android.gms.ads.nonagon.signalgeneration.zzau u();

    public abstract zzeuy v(zzewb zzewbVar);

    public abstract zzewu w();

    public abstract zzeyi x();

    public abstract zzezz y();

    public abstract zzfbn z();
}
