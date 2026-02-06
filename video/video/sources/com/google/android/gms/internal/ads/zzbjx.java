package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import com.google.android.gms.common.internal.Preconditions;
import java.util.Map;

/* loaded from: classes2.dex */
public final class zzbjx implements zzbjw {
    public final zzdvc a;

    public zzbjx(zzdvc zzdvcVar) {
        Preconditions.s(zzdvcVar, "The Inspector Manager must not be null");
        this.a = zzdvcVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbjw
    public final void a(Object obj, Map map) {
        if (map != null && map.containsKey("persistentData") && !TextUtils.isEmpty((CharSequence) map.get("persistentData"))) {
            this.a.k((String) map.get("persistentData"));
        }
    }
}
