package com.google.android.gms.internal.ads;

import com.google.android.gms.common.util.CollectionUtils;
import java.util.Map;

/* loaded from: classes2.dex */
public final class zzbkd implements zzbjw {
    public static final Map d = CollectionUtils.g(new String[]{"resize", "playVideo", "storePicture", "createCalendarEvent", "setOrientationProperties", "closeResizedAd", "unload"}, new Integer[]{1, 2, 3, 4, 5, 6, 7});
    public final com.google.android.gms.ads.internal.zzb a;
    public final zzbsj b;
    public final zzbsq c;

    public zzbkd(com.google.android.gms.ads.internal.zzb zzbVar, zzbsj zzbsjVar, zzbsq zzbsqVar) {
        this.a = zzbVar;
        this.b = zzbsjVar;
        this.c = zzbsqVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbjw
    public final /* bridge */ /* synthetic */ void a(Object obj, Map map) {
        zzcfb zzcfbVar = (zzcfb) obj;
        int intValue = ((Integer) d.get((String) map.get("a"))).intValue();
        int i = 6;
        boolean z = true;
        if (intValue != 5) {
            if (intValue != 7) {
                com.google.android.gms.ads.internal.zzb zzbVar = this.a;
                if (zzbVar.c()) {
                    if (intValue != 1) {
                        if (intValue != 3) {
                            if (intValue != 4) {
                                if (intValue != 5) {
                                    if (intValue != 6) {
                                        if (intValue != 7) {
                                            int i2 = com.google.android.gms.ads.internal.util.zze.b;
                                            com.google.android.gms.ads.internal.util.client.zzo.f("Unknown MRAID command called.");
                                            return;
                                        }
                                    } else {
                                        this.b.i(true);
                                        return;
                                    }
                                }
                            } else {
                                new zzbsg(zzcfbVar, map).j();
                                return;
                            }
                        } else {
                            new zzbsm(zzcfbVar, map).i();
                            return;
                        }
                    } else {
                        this.b.j(map);
                        return;
                    }
                } else {
                    zzbVar.b(null);
                    return;
                }
            }
            this.c.c();
            return;
        }
        String str = (String) map.get("forceOrientation");
        if (map.containsKey("allowOrientationChange")) {
            z = Boolean.parseBoolean((String) map.get("allowOrientationChange"));
        }
        if (zzcfbVar == null) {
            int i3 = com.google.android.gms.ads.internal.util.zze.b;
            com.google.android.gms.ads.internal.util.client.zzo.g("AdWebView is null");
            return;
        }
        if ("portrait".equalsIgnoreCase(str)) {
            i = 7;
        } else if (!"landscape".equalsIgnoreCase(str)) {
            if (z) {
                i = -1;
            } else {
                i = 14;
            }
        }
        zzcfbVar.E(i);
    }
}
