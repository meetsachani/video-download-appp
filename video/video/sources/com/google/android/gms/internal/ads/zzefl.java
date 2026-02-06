package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.ads.AdFormat;
import com.google.android.gms.dynamic.ObjectWrapper;

/* loaded from: classes2.dex */
public final class zzefl implements zzedl {
    public final Context a;
    public final zzdga b;

    public zzefl(Context context, zzdga zzdgaVar) {
        this.a = context;
        this.b = zzdgaVar;
    }

    @Override // com.google.android.gms.internal.ads.zzedl
    public final void a(zzfcg zzfcgVar, zzfbu zzfbuVar, zzedi zzediVar) throws zzfcw {
        try {
            zzbrk zzbrkVar = (zzbrk) zzediVar.b;
            zzbrkVar.M0(zzfbuVar.Z);
            zzbrkVar.q2(zzfbuVar.U, zzfbuVar.v.toString(), zzfcgVar.a.a.d, ObjectWrapper.V3(this.a), new zzefj(this, zzediVar, null), (zzbpr) zzediVar.c);
        } catch (RemoteException e) {
            com.google.android.gms.ads.internal.util.zze.l("Remote exception loading a interstitial RTB ad", e);
            throw new zzfcw(e);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzedl
    public final /* bridge */ /* synthetic */ Object b(zzfcg zzfcgVar, zzfbu zzfbuVar, zzedi zzediVar) throws zzfcw, zzegy {
        zzeff zzeffVar = new zzeff(zzfbuVar, (zzbrk) zzediVar.b, AdFormat.INTERSTITIAL);
        zzdex c = this.b.c(new zzcrn(zzfcgVar, zzfbuVar, zzediVar.a), new zzdfa(zzeffVar, null));
        zzeffVar.c(c.b());
        ((zzeew) zzediVar.c).X7(c.f());
        return c.i();
    }
}
