package com.google.android.gms.internal.ads;

import com.google.firebase.analytics.FirebaseAnalytics;
import o.C10901yE;
import o.C8192n71;

/* loaded from: classes2.dex */
public final class zzcnx {
    public final zzdsd a;
    public final zzfcg b;

    public zzcnx(zzdsd zzdsdVar, zzfcg zzfcgVar) {
        this.a = zzdsdVar;
        this.b = zzfcgVar;
    }

    public final void a(long j, int i) {
        String str;
        zzdsc a = this.a.a();
        a.d(this.b.b.b);
        a.b("action", "ad_closed");
        a.b("show_time", String.valueOf(j));
        a.b(FirebaseAnalytics.Param.b, "app_open_ad");
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 != 1) {
                if (i2 != 2) {
                    if (i2 != 3) {
                        if (i2 != 4) {
                            str = "u";
                        } else {
                            str = "ac";
                        }
                    } else {
                        str = "cb";
                    }
                } else {
                    str = C8192n71.f;
                }
            } else {
                str = "bb";
            }
        } else {
            str = C10901yE.i;
        }
        a.b("acr", str);
        a.j();
    }
}
