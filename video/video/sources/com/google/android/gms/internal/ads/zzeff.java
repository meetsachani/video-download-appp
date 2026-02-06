package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.AdFormat;
import com.google.android.gms.dynamic.ObjectWrapper;
import o.InterfaceC11300zs1;

/* loaded from: classes2.dex */
final class zzeff implements zzdgi {
    public final zzfbu a;
    public final zzbrk b;
    public final AdFormat c;
    @InterfaceC11300zs1
    public zzcwl d = null;

    public zzeff(zzfbu zzfbuVar, zzbrk zzbrkVar, AdFormat adFormat) {
        this.a = zzfbuVar;
        this.b = zzbrkVar;
        this.c = adFormat;
    }

    @Override // com.google.android.gms.internal.ads.zzdgi
    @InterfaceC11300zs1
    public final zzfbu a() {
        return this.a;
    }

    @Override // com.google.android.gms.internal.ads.zzdgi
    public final void b(boolean z, Context context, @InterfaceC11300zs1 zzcwg zzcwgVar) throws zzdgh {
        boolean F0;
        try {
            AdFormat adFormat = AdFormat.BANNER;
            int ordinal = this.c.ordinal();
            if (ordinal != 1) {
                if (ordinal != 2) {
                    if (ordinal == 5) {
                        F0 = this.b.O(ObjectWrapper.V3(context));
                    }
                    throw new zzdgh("Adapter failed to show.");
                }
                F0 = this.b.m4(ObjectWrapper.V3(context));
            } else {
                F0 = this.b.F0(ObjectWrapper.V3(context));
            }
            if (F0) {
                zzcwl zzcwlVar = this.d;
                if (zzcwlVar != null) {
                    if (!((Boolean) com.google.android.gms.ads.internal.client.zzbd.c().b(zzbcv.I1)).booleanValue() && this.a.Y == 2) {
                        zzcwlVar.a();
                        return;
                    }
                    return;
                }
                return;
            }
            throw new zzdgh("Adapter failed to show.");
        } catch (Throwable th) {
            throw new zzdgh(th);
        }
    }

    public final void c(zzcwl zzcwlVar) {
        this.d = zzcwlVar;
    }
}
