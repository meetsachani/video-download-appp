package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.measurement.api.AppMeasurementSdk;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class zzjl implements Runnable {
    public final /* synthetic */ Bundle X;
    public final /* synthetic */ zziq Y;

    public zzjl(zziq zziqVar, Bundle bundle) {
        this.Y = zziqVar;
        this.X = bundle;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zziq zziqVar = this.Y;
        Bundle bundle = this.X;
        zziqVar.n();
        zziqVar.v();
        Preconditions.r(bundle);
        String l = Preconditions.l(bundle.getString("name"));
        if (!zziqVar.a.p()) {
            zziqVar.j().K().a("Conditional property not cleared since app measurement is disabled");
            return;
        }
        try {
            zziqVar.t().H(new zzad(bundle.getString("app_id"), "", new zznc(l, 0L, null, ""), bundle.getLong(AppMeasurementSdk.ConditionalUserProperty.m), bundle.getBoolean(AppMeasurementSdk.ConditionalUserProperty.n), bundle.getString(AppMeasurementSdk.ConditionalUserProperty.d), null, bundle.getLong(AppMeasurementSdk.ConditionalUserProperty.e), null, bundle.getLong(AppMeasurementSdk.ConditionalUserProperty.j), zziqVar.i().G(bundle.getString("app_id"), bundle.getString(AppMeasurementSdk.ConditionalUserProperty.k), bundle.getBundle(AppMeasurementSdk.ConditionalUserProperty.l), "", bundle.getLong(AppMeasurementSdk.ConditionalUserProperty.m), true, true)));
        } catch (IllegalArgumentException unused) {
        }
    }
}
