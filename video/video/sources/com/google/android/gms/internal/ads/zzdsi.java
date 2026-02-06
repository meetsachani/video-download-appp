package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.nonagon.util.logging.csi.CsiParamDefaults;
import com.google.android.gms.ads.nonagon.util.logging.csi.CsiUrlBuilder;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Executor;

/* loaded from: classes2.dex */
public final class zzdsi extends zzdsm {
    public final CsiParamDefaults k;

    public zzdsi(Executor executor, com.google.android.gms.ads.internal.util.client.zzu zzuVar, CsiParamDefaults csiParamDefaults, CsiUrlBuilder csiUrlBuilder, Context context) {
        super(executor, zzuVar, csiUrlBuilder, context);
        this.k = csiParamDefaults;
        csiParamDefaults.a(this.a);
    }

    public final Map i() {
        return new HashMap(this.a);
    }
}
