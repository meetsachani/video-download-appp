package com.google.android.gms.ads.nonagon.util.logging.csi;

import android.net.Uri;
import com.google.android.gms.internal.ads.zzbep;
import java.util.Map;
import o.InterfaceC5670cr1;

/* loaded from: classes2.dex */
public class CsiUrlBuilder {
    public final String a = (String) zzbep.a.e();

    @InterfaceC5670cr1
    public String a(@InterfaceC5670cr1 Map<String, String> map) {
        Uri.Builder buildUpon = Uri.parse(this.a).buildUpon();
        for (Map.Entry<String, String> entry : map.entrySet()) {
            buildUpon.appendQueryParameter(entry.getKey(), entry.getValue());
        }
        return buildUpon.build().toString();
    }
}
