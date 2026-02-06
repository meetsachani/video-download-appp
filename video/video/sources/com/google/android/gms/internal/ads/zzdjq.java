package com.google.android.gms.internal.ads;

import android.view.View;
import o.InterfaceC11300zs1;

/* loaded from: classes2.dex */
public final class zzdjq {
    public final zzdsd a;

    public zzdjq(zzdsd zzdsdVar) {
        this.a = zzdsdVar;
    }

    public final void a(@InterfaceC11300zs1 View view, zzfbu zzfbuVar) {
        String str;
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.c().b(zzbcv.fd)).booleanValue() && view != null) {
            if (true != com.google.android.gms.ads.internal.util.zzac.a(view)) {
                str = "0";
            } else {
                str = "1";
            }
            zzdsc a = this.a.a();
            a.b("action", "hcp");
            a.b("hcp", str);
            a.c(zzfbuVar);
            a.j();
        }
    }
}
