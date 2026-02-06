package com.google.android.gms.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.client.zzbd;
import com.google.android.gms.internal.ads.zzbcv;
import java.util.List;
import o.InterfaceC11300zs1;
import o.InterfaceC5670cr1;

/* loaded from: classes2.dex */
public class MediationUtils {
    public static final double a = 0.5d;
    public static final double b = 0.7d;

    /* JADX WARN: Removed duplicated region for block: B:38:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00c7 A[ADDED_TO_REGION, SYNTHETIC] */
    @InterfaceC11300zs1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static AdSize a(@InterfaceC5670cr1 Context context, @InterfaceC5670cr1 AdSize adSize, @InterfaceC5670cr1 List<AdSize> list) {
        AdSize adSize2 = null;
        if (list != null && adSize != null) {
            if (!adSize.v() && !adSize.w()) {
                float f = context.getResources().getDisplayMetrics().density;
                adSize = new AdSize(Math.round(adSize.k(context) / f), Math.round(adSize.d(context) / f));
            }
            for (AdSize adSize3 : list) {
                if (adSize3 != null) {
                    int j = adSize.j();
                    int j2 = adSize3.j();
                    int c = adSize.c();
                    int c2 = adSize3.c();
                    if (j * 0.5d <= j2 && j >= j2) {
                        if (adSize.w()) {
                            int o2 = adSize.o();
                            if (((Integer) zzbd.c().b(zzbcv.g8)).intValue() <= j2) {
                                if (((Integer) zzbd.c().b(zzbcv.h8)).intValue() <= c2 && o2 >= c2) {
                                    if (adSize2 == null || adSize2.j() * adSize2.c() <= adSize3.j() * adSize3.c()) {
                                        adSize2 = adSize3;
                                    }
                                }
                            }
                        } else if (adSize.v()) {
                            if (adSize.p() >= c2) {
                                if (adSize2 == null) {
                                }
                                adSize2 = adSize3;
                            }
                        } else if (c * 0.7d <= c2 && c >= c2) {
                            if (adSize2 == null) {
                            }
                            adSize2 = adSize3;
                        }
                    }
                }
            }
        }
        return adSize2;
    }
}
