package com.google.android.gms.internal.ads;

import android.view.View;
import java.lang.reflect.InvocationTargetException;

/* loaded from: classes2.dex */
public final class zzaxy extends zzayb {
    public final View h;

    public zzaxy(zzawo zzawoVar, String str, String str2, zzask zzaskVar, int i, int i2, View view) {
        super(zzawoVar, "h7NW4UTeHoapcAfHjNS1jSIEsdu+S9XbBUhqH3zqKlRoFqG3FEF52d6iyzd+cmzU", "UQVAYGHTy6RzP6i5dxbs04Nz2BVdis2XDzzm3D3JwpQ=", zzaskVar, i, 57);
        this.h = view;
    }

    @Override // com.google.android.gms.internal.ads.zzayb
    public final void a() throws IllegalAccessException, InvocationTargetException {
        View view = this.h;
        if (view != null) {
            Boolean bool = (Boolean) com.google.android.gms.ads.internal.client.zzbd.c().b(zzbcv.I3);
            Boolean bool2 = (Boolean) com.google.android.gms.ads.internal.client.zzbd.c().b(zzbcv.mb);
            zzaws zzawsVar = new zzaws((String) this.e.invoke(null, view, this.a.b().getResources().getDisplayMetrics(), bool, bool2));
            zzatf s2 = zzatg.s2();
            s2.Z1(zzawsVar.b.longValue());
            s2.b2(zzawsVar.c.longValue());
            s2.c2(zzawsVar.d.longValue());
            if (bool2.booleanValue()) {
                s2.a2(zzawsVar.f.longValue());
            }
            if (bool.booleanValue()) {
                s2.Y1(zzawsVar.e.longValue());
            }
            this.d.w2((zzatg) s2.V1());
        }
    }
}
