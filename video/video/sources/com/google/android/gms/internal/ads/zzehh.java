package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.Executor;

/* loaded from: classes2.dex */
public final class zzehh implements zzedl {
    public final Context a;
    public final Executor b;
    public final zzdom c;

    public zzehh(Context context, Executor executor, zzdom zzdomVar) {
        this.a = context;
        this.b = executor;
        this.c = zzdomVar;
    }

    @Override // com.google.android.gms.internal.ads.zzedl
    public final void a(zzfcg zzfcgVar, zzfbu zzfbuVar, zzedi zzediVar) throws zzfcw {
        try {
            zzfcp zzfcpVar = zzfcgVar.a.a;
            if (zzfcpVar.f280o.a == 3) {
                ((zzfdn) zzediVar.b).w(this.a, zzfcpVar.d, zzfbuVar.v.toString(), (zzbpr) zzediVar.c);
            } else {
                ((zzfdn) zzediVar.b).v(this.a, zzfcpVar.d, zzfbuVar.v.toString(), (zzbpr) zzediVar.c);
            }
        } catch (Exception e) {
            String str = zzediVar.a;
            int i = com.google.android.gms.ads.internal.util.zze.b;
            com.google.android.gms.ads.internal.util.client.zzo.h("Fail to load ad from adapter ".concat(String.valueOf(str)), e);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzedl
    public final /* bridge */ /* synthetic */ Object b(zzfcg zzfcgVar, zzfbu zzfbuVar, zzedi zzediVar) throws zzfcw, zzegy {
        zzdoi f = this.c.f(new zzcrn(zzfcgVar, zzfbuVar, zzediVar.a), new zzdoj(new zzehg(this, zzediVar, zzfbuVar)));
        f.c().c1(new zzcmd((zzfdn) zzediVar.b), this.b);
        ((zzeew) zzediVar.c).X7(f.n());
        return f.k();
    }
}
