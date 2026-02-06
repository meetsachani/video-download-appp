package com.google.android.gms.ads.internal.util;

import android.content.Context;
import com.google.android.gms.internal.ads.zzapq;
import com.google.android.gms.internal.ads.zzapu;
import com.google.android.gms.internal.ads.zzapx;
import com.google.android.gms.internal.ads.zzaqd;
import com.google.android.gms.internal.ads.zzaqi;
import com.google.android.gms.internal.ads.zzaqj;
import com.google.android.gms.internal.ads.zzaqq;
import com.google.android.gms.internal.ads.zzaqv;
import com.google.android.gms.internal.ads.zzbcv;
import com.google.android.gms.internal.ads.zzblt;
import com.google.android.gms.internal.ads.zzfqh;
import com.google.android.gms.internal.ads.zzfqi;
import java.io.File;
import java.util.regex.Pattern;

/* loaded from: classes2.dex */
public final class zzaz extends zzaqj {
    public final Context c;

    public zzaz(Context context, zzaqi zzaqiVar) {
        super(zzaqiVar);
        this.c = context;
    }

    public static zzapx b(Context context) {
        zzapx zzapxVar = new zzapx(new zzaqq(new File(zzfqi.a(zzfqh.a(), context.getCacheDir(), "admob_volley")), 20971520), new zzaz(context, new zzaqv(null, null)), 4);
        zzapxVar.d();
        return zzapxVar;
    }

    @Override // com.google.android.gms.internal.ads.zzaqj, com.google.android.gms.internal.ads.zzapn
    public final zzapq a(zzapu zzapuVar) throws zzaqd {
        if (zzapuVar.a() == 0) {
            if (Pattern.matches((String) com.google.android.gms.ads.internal.client.zzbd.c().b(zzbcv.H4), zzapuVar.p())) {
                Context context = this.c;
                com.google.android.gms.ads.internal.client.zzbb.b();
                if (com.google.android.gms.ads.internal.util.client.zzf.y(context, 13400000)) {
                    zzapq a = new zzblt(context).a(zzapuVar);
                    if (a != null) {
                        zze.k("Got gmscore asset response: ".concat(String.valueOf(zzapuVar.p())));
                        return a;
                    }
                    zze.k("Failed to get gmscore asset response: ".concat(String.valueOf(zzapuVar.p())));
                }
            }
        }
        return super.a(zzapuVar);
    }
}
