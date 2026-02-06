package com.google.firebase.analytics.connector.internal;

import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.google.firebase.analytics.connector.AnalyticsConnector;
import java.util.HashSet;
import java.util.Set;

/* loaded from: classes3.dex */
public final class zze implements zza {
    public Set<String> a;
    public AnalyticsConnector.AnalyticsConnectorListener b;
    public AppMeasurementSdk c;
    public zzd d;

    public zze(AppMeasurementSdk appMeasurementSdk, AnalyticsConnector.AnalyticsConnectorListener analyticsConnectorListener) {
        this.b = analyticsConnectorListener;
        this.c = appMeasurementSdk;
        zzd zzdVar = new zzd(this);
        this.d = zzdVar;
        this.c.s(zzdVar);
        this.a = new HashSet();
    }

    @Override // com.google.firebase.analytics.connector.internal.zza
    public final AnalyticsConnector.AnalyticsConnectorListener a() {
        return this.b;
    }

    @Override // com.google.firebase.analytics.connector.internal.zza
    public final void b() {
        this.a.clear();
    }

    @Override // com.google.firebase.analytics.connector.internal.zza
    public final void c(Set<String> set) {
        this.a.clear();
        Set<String> set2 = this.a;
        HashSet hashSet = new HashSet();
        for (String str : set) {
            if (hashSet.size() >= 50) {
                break;
            } else if (zzb.j(str) && zzb.k(str)) {
                String g = zzb.g(str);
                Preconditions.r(g);
                hashSet.add(g);
            }
        }
        set2.addAll(hashSet);
    }
}
