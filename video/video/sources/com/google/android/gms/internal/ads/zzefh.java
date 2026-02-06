package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import java.util.concurrent.Executor;

/* loaded from: classes2.dex */
public final class zzefh implements zzedl {
    public final Context a;
    public final zzdga b;
    public final VersionInfoParcel c;
    public final Executor d;

    public zzefh(Context context, VersionInfoParcel versionInfoParcel, zzdga zzdgaVar, Executor executor) {
        this.a = context;
        this.c = versionInfoParcel;
        this.b = zzdgaVar;
        this.d = executor;
    }

    @Override // com.google.android.gms.internal.ads.zzedl
    public final void a(zzfcg zzfcgVar, zzfbu zzfbuVar, zzedi zzediVar) throws zzfcw {
        zzfdn zzfdnVar = (zzfdn) zzediVar.b;
        zzfcp zzfcpVar = zzfcgVar.a.a;
        String jSONObject = zzfbuVar.v.toString();
        String m = com.google.android.gms.ads.internal.util.zzbs.m(zzfbuVar.s);
        zzfdnVar.t(this.a, zzfcpVar.d, jSONObject, m, (zzbpr) zzediVar.c);
    }

    @Override // com.google.android.gms.internal.ads.zzedl
    public final /* bridge */ /* synthetic */ Object b(zzfcg zzfcgVar, zzfbu zzfbuVar, zzedi zzediVar) throws zzfcw, zzegy {
        zzdex c = this.b.c(new zzcrn(zzfcgVar, zzfbuVar, zzediVar.a), new zzdfa(new zzefg(this, zzediVar, zzfbuVar), null));
        c.c().c1(new zzcmd((zzfdn) zzediVar.b), this.d);
        ((zzeew) zzediVar.c).X7(c.g());
        return c.i();
    }
}
