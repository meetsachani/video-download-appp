package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.ads.AdFormat;
import com.google.android.gms.dynamic.ObjectWrapper;

/* loaded from: classes2.dex */
public final class zzedy implements zzedl {
    public final Context a;
    public final zzcod b;

    public zzedy(Context context, zzcod zzcodVar) {
        this.a = context;
        this.b = zzcodVar;
    }

    @Override // com.google.android.gms.internal.ads.zzedl
    public final void a(zzfcg zzfcgVar, zzfbu zzfbuVar, zzedi zzediVar) throws zzfcw {
        try {
            zzbrk zzbrkVar = (zzbrk) zzediVar.b;
            zzbrkVar.M0(zzfbuVar.Z);
            zzbrkVar.t4(zzfbuVar.U, zzfbuVar.v.toString(), zzfcgVar.a.a.d, ObjectWrapper.V3(this.a), new zzedw(zzediVar, null), (zzbpr) zzediVar.c);
        } catch (RemoteException e) {
            com.google.android.gms.ads.internal.util.zze.l("Remote exception loading an app open RTB ad", e);
            throw new zzfcw(e);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzedl
    public final /* bridge */ /* synthetic */ Object b(zzfcg zzfcgVar, zzfbu zzfbuVar, zzedi zzediVar) throws zzfcw, zzegy {
        zzeff zzeffVar = new zzeff(zzfbuVar, (zzbrk) zzediVar.b, AdFormat.APP_OPEN_AD);
        zzcoa a = this.b.a(new zzcrn(zzfcgVar, zzfbuVar, zzediVar.a), new zzdfa(zzeffVar, null), new zzcob(zzfbuVar.a0));
        zzeffVar.c(a.b());
        ((zzeew) zzediVar.c).X7(a.f());
        return a.h();
    }
}
