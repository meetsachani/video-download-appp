package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.Executor;

/* loaded from: classes2.dex */
public final class zzedu implements zzedl {
    public final Context a;
    public final zzcod b;
    public final Executor c;

    public zzedu(Context context, zzcod zzcodVar, Executor executor) {
        this.a = context;
        this.b = zzcodVar;
        this.c = executor;
    }

    @Override // com.google.android.gms.internal.ads.zzedl
    public final void a(zzfcg zzfcgVar, zzfbu zzfbuVar, zzedi zzediVar) throws zzfcw {
        zzfcp zzfcpVar = zzfcgVar.a.a;
        String jSONObject = zzfbuVar.v.toString();
        ((zzfdn) zzediVar.b).q(this.a, zzfcpVar.d, jSONObject, (zzbpr) zzediVar.c);
    }

    @Override // com.google.android.gms.internal.ads.zzedl
    public final /* bridge */ /* synthetic */ Object b(zzfcg zzfcgVar, zzfbu zzfbuVar, zzedi zzediVar) throws zzfcw, zzegy {
        zzcoa a = this.b.a(new zzcrn(zzfcgVar, zzfbuVar, zzediVar.a), new zzdfa(new zzedt(this, zzediVar, zzfbuVar), null), new zzcob(zzfbuVar.a0));
        a.c().c1(new zzcmd((zzfdn) zzediVar.b), this.c);
        ((zzeew) zzediVar.c).X7(a.g());
        return a.h();
    }
}
