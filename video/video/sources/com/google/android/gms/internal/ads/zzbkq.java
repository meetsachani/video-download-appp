package com.google.android.gms.internal.ads;

import com.google.android.gms.common.internal.Preconditions;
import java.util.Map;

/* loaded from: classes2.dex */
public final class zzbkq implements zzbjw {
    public final zzdvc a;

    public zzbkq(zzdvc zzdvcVar) {
        Preconditions.s(zzdvcVar, "The Inspector Manager must not be null");
        this.a = zzdvcVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbjw
    public final void a(Object obj, Map map) {
        if (map != null && map.containsKey("extras")) {
            long j = Long.MAX_VALUE;
            if (map.containsKey("expires")) {
                try {
                    j = Long.parseLong((String) map.get("expires"));
                } catch (NumberFormatException unused) {
                }
            }
            this.a.j((String) map.get("extras"), j);
        }
    }
}
