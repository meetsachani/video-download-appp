package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.ads.AdFormat;
import com.google.android.gms.dynamic.ObjectWrapper;

/* loaded from: classes2.dex */
public final class zzehl implements zzedl {
    public final Context a;
    public final zzdom b;

    public zzehl(Context context, zzdom zzdomVar) {
        this.a = context;
        this.b = zzdomVar;
    }

    @Override // com.google.android.gms.internal.ads.zzedl
    public final void a(zzfcg zzfcgVar, zzfbu zzfbuVar, zzedi zzediVar) throws zzfcw {
        try {
            zzbrk zzbrkVar = (zzbrk) zzediVar.b;
            zzbrkVar.M0(zzfbuVar.Z);
            zzfcp zzfcpVar = zzfcgVar.a.a;
            if (zzfcpVar.f280o.a == 3) {
                zzbrkVar.N2(zzfbuVar.U, zzfbuVar.v.toString(), zzfcpVar.d, ObjectWrapper.V3(this.a), new zzehj(this, zzediVar, null), (zzbpr) zzediVar.c);
            } else {
                zzbrkVar.w6(zzfbuVar.U, zzfbuVar.v.toString(), zzfcpVar.d, ObjectWrapper.V3(this.a), new zzehj(this, zzediVar, null), (zzbpr) zzediVar.c);
            }
        } catch (RemoteException e) {
            com.google.android.gms.ads.internal.util.zze.l("Remote exception loading a rewarded RTB ad", e);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzedl
    public final /* bridge */ /* synthetic */ Object b(zzfcg zzfcgVar, zzfbu zzfbuVar, zzedi zzediVar) throws zzfcw, zzegy {
        zzeff zzeffVar = new zzeff(zzfbuVar, (zzbrk) zzediVar.b, AdFormat.REWARDED);
        zzdoi f = this.b.f(new zzcrn(zzfcgVar, zzfbuVar, zzediVar.a), new zzdoj(zzeffVar));
        zzeffVar.c(f.b());
        ((zzeew) zzediVar.c).X7(f.o());
        return f.k();
    }
}
