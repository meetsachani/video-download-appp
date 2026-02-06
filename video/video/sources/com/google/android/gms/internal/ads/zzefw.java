package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.ArrayList;
import java.util.concurrent.Executor;

/* loaded from: classes2.dex */
public final class zzefw implements zzedl {
    public final Context a;
    public final zzdgw b;
    public final Executor c;

    public zzefw(Context context, zzdgw zzdgwVar, Executor executor) {
        this.a = context;
        this.b = zzdgwVar;
        this.c = executor;
    }

    public static final boolean c(zzfcg zzfcgVar, int i) {
        return zzfcgVar.a.a.g.contains(Integer.toString(i));
    }

    @Override // com.google.android.gms.internal.ads.zzedl
    public final void a(zzfcg zzfcgVar, zzfbu zzfbuVar, zzedi zzediVar) throws zzfcw {
        zzfdn zzfdnVar = (zzfdn) zzediVar.b;
        zzfcp zzfcpVar = zzfcgVar.a.a;
        String jSONObject = zzfbuVar.v.toString();
        String m = com.google.android.gms.ads.internal.util.zzbs.m(zzfbuVar.s);
        zzbfv zzbfvVar = zzfcpVar.i;
        ArrayList arrayList = zzfcpVar.g;
        zzfdnVar.u(this.a, zzfcpVar.d, jSONObject, m, (zzbpr) zzediVar.c, zzbfvVar, arrayList);
    }

    @Override // com.google.android.gms.internal.ads.zzedl
    public final /* bridge */ /* synthetic */ Object b(zzfcg zzfcgVar, zzfbu zzfbuVar, zzedi zzediVar) throws zzfcw, zzegy {
        zzdio I;
        zzfdn zzfdnVar = (zzfdn) zzediVar.b;
        zzbpw d = zzfdnVar.d();
        zzbpx e = zzfdnVar.e();
        zzbqa i = zzfdnVar.i();
        if (i != null && c(zzfcgVar, 6)) {
            I = zzdio.g0(i);
        } else if (d != null && c(zzfcgVar, 6)) {
            I = zzdio.J(d);
        } else if (d != null && c(zzfcgVar, 2)) {
            I = zzdio.H(d);
        } else if (e != null && c(zzfcgVar, 6)) {
            I = zzdio.K(e);
        } else if (e != null && c(zzfcgVar, 1)) {
            I = zzdio.I(e);
        } else {
            throw new zzegy(1, "No native ad mappers");
        }
        if (I != null) {
            zzfcp zzfcpVar = zzfcgVar.a.a;
            if (zzfcpVar.g.contains(Integer.toString(I.P()))) {
                zzdiq d2 = this.b.d(new zzcrn(zzfcgVar, zzfbuVar, zzediVar.a), new zzdja(I), new zzdkt(e, d, i));
                ((zzeew) zzediVar.c).X7(d2.g());
                d2.c().c1(new zzcmd(zzfdnVar), this.c);
                return d2.h();
            }
        }
        throw new zzegy(1, "No corresponding native ad listener");
    }
}
