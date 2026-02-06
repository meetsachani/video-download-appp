package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.dynamic.ObjectWrapper;
import java.util.ArrayList;

/* loaded from: classes2.dex */
public final class zzega implements zzedl {
    public final Context a;
    public final zzdgw b;
    public zzbqa c;
    public final VersionInfoParcel d;

    public zzega(Context context, zzdgw zzdgwVar, VersionInfoParcel versionInfoParcel) {
        this.a = context;
        this.b = zzdgwVar;
        this.d = versionInfoParcel;
    }

    @Override // com.google.android.gms.internal.ads.zzedl
    public final void a(zzfcg zzfcgVar, zzfbu zzfbuVar, zzedi zzediVar) throws zzfcw {
        try {
            zzbrk zzbrkVar = (zzbrk) zzediVar.b;
            zzbrkVar.M0(zzfbuVar.Z);
            if (this.d.Z < ((Integer) com.google.android.gms.ads.internal.client.zzbd.c().b(zzbcv.T1)).intValue()) {
                zzbrkVar.P5(zzfbuVar.U, zzfbuVar.v.toString(), zzfcgVar.a.a.d, ObjectWrapper.V3(this.a), new zzefy(this, zzediVar, null), (zzbpr) zzediVar.c);
                return;
            }
            String str = zzfbuVar.U;
            String jSONObject = zzfbuVar.v.toString();
            zzfcp zzfcpVar = zzfcgVar.a.a;
            zzbrkVar.w2(str, jSONObject, zzfcpVar.d, ObjectWrapper.V3(this.a), new zzefy(this, zzediVar, null), (zzbpr) zzediVar.c, zzfcpVar.i);
        } catch (RemoteException e) {
            throw new zzfcw(e);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzedl
    public final /* bridge */ /* synthetic */ Object b(zzfcg zzfcgVar, zzfbu zzfbuVar, zzedi zzediVar) throws zzfcw, zzegy {
        ArrayList arrayList = zzfcgVar.a.a.g;
        if (arrayList.contains(Integer.toString(6))) {
            zzdio g0 = zzdio.g0(this.c);
            if (arrayList.contains(Integer.toString(g0.P()))) {
                zzdiq d = this.b.d(new zzcrn(zzfcgVar, zzfbuVar, zzediVar.a), new zzdja(g0), new zzdkt(null, null, this.c));
                ((zzeew) zzediVar.c).X7(d.f());
                return d.h();
            }
            throw new zzegy(1, "No corresponding native ad listener");
        }
        throw new zzegy(2, "Unified must be used for RTB.");
    }
}
