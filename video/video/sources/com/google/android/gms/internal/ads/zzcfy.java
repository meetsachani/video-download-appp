package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import java.util.Map;

/* loaded from: classes2.dex */
final class zzcfy implements zzbjw {
    public final /* synthetic */ zzcga a;

    public zzcfy(zzcga zzcgaVar) {
        this.a = zzcgaVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbjw
    public final /* bridge */ /* synthetic */ void a(Object obj, Map map) {
        int i;
        zzcfb zzcfbVar = (zzcfb) obj;
        if (map != null) {
            String str = (String) map.get("height");
            if (!TextUtils.isEmpty(str)) {
                try {
                    int parseInt = Integer.parseInt(str);
                    zzcga zzcgaVar = this.a;
                    synchronized (zzcgaVar) {
                        i = zzcgaVar.F1;
                        if (i != parseInt) {
                            zzcgaVar.F1 = parseInt;
                            zzcgaVar.requestLayout();
                        }
                    }
                } catch (Exception e) {
                    int i2 = com.google.android.gms.ads.internal.util.zze.b;
                    com.google.android.gms.ads.internal.util.client.zzo.h("Exception occurred while getting webview content height", e);
                }
            }
        }
    }
}
