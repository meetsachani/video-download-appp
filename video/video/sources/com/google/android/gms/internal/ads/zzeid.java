package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.Executor;

/* loaded from: classes2.dex */
public final class zzeid implements zzedl {
    public final Context a;
    public final Executor b;
    public final zzdom c;

    public zzeid(Context context, Executor executor, zzdom zzdomVar) {
        this.a = context;
        this.b = executor;
        this.c = zzdomVar;
    }

    public static /* bridge */ /* synthetic */ Executor c(zzeid zzeidVar) {
        return zzeidVar.b;
    }

    public static final void e(zzfcg zzfcgVar, zzfbu zzfbuVar, zzedi zzediVar) {
        try {
            ((zzfdn) zzediVar.b).p(zzfcgVar.a.a.d, zzfbuVar.v.toString());
        } catch (Exception e) {
            String str = zzediVar.a;
            int i = com.google.android.gms.ads.internal.util.zze.b;
            com.google.android.gms.ads.internal.util.client.zzo.h("Fail to load ad from adapter ".concat(String.valueOf(str)), e);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzedl
    public final void a(zzfcg zzfcgVar, zzfbu zzfbuVar, zzedi zzediVar) throws zzfcw {
        zzfdn zzfdnVar = (zzfdn) zzediVar.b;
        if (!zzfdnVar.c()) {
            zzeia zzeiaVar = new zzeia(this, zzfcgVar, zzfbuVar, zzediVar);
            zzcxd zzcxdVar = zzediVar.c;
            ((zzeex) zzcxdVar).Y7(zzeiaVar);
            Context context = this.a;
            zzfcp zzfcpVar = zzfcgVar.a.a;
            String jSONObject = zzfbuVar.v.toString();
            zzfdnVar.m(context, zzfcpVar.d, null, (zzbwi) zzcxdVar, jSONObject);
            return;
        }
        e(zzfcgVar, zzfbuVar, zzediVar);
    }

    @Override // com.google.android.gms.internal.ads.zzedl
    public final /* bridge */ /* synthetic */ Object b(zzfcg zzfcgVar, zzfbu zzfbuVar, zzedi zzediVar) throws zzfcw, zzegy {
        zzdoi f = this.c.f(new zzcrn(zzfcgVar, zzfbuVar, zzediVar.a), new zzdoj(new zzeib(this, zzediVar, zzfbuVar)));
        f.c().c1(new zzcmd((zzfdn) zzediVar.b), this.b);
        zzcxa d = f.d();
        zzcvr a = f.a();
        ((zzeex) zzediVar.c).X7(new zzeic(this, f.h(), a, d, f.i()));
        return f.k();
    }
}
