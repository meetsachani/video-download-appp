package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.measurement.api.AppMeasurementSdk;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class zzjm implements Runnable {
    public final /* synthetic */ Bundle X;
    public final /* synthetic */ zziq Y;

    public zzjm(zziq zziqVar, Bundle bundle) {
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
        String string = bundle.getString("name");
        String string2 = bundle.getString("origin");
        Preconditions.l(string);
        Preconditions.l(string2);
        Preconditions.r(bundle.get("value"));
        if (!zziqVar.a.p()) {
            zziqVar.j().K().a("Conditional property not set since app measurement is disabled");
            return;
        }
        zznc zzncVar = new zznc(string, bundle.getLong(AppMeasurementSdk.ConditionalUserProperty.f309o), bundle.get("value"), string2);
        try {
            zzbg G = zziqVar.i().G(bundle.getString("app_id"), bundle.getString(AppMeasurementSdk.ConditionalUserProperty.h), bundle.getBundle(AppMeasurementSdk.ConditionalUserProperty.i), string2, 0L, true, true);
            zziqVar.t().H(new zzad(bundle.getString("app_id"), string2, zzncVar, bundle.getLong(AppMeasurementSdk.ConditionalUserProperty.m), false, bundle.getString(AppMeasurementSdk.ConditionalUserProperty.d), zziqVar.i().G(bundle.getString("app_id"), bundle.getString(AppMeasurementSdk.ConditionalUserProperty.f), bundle.getBundle(AppMeasurementSdk.ConditionalUserProperty.g), string2, 0L, true, true), bundle.getLong(AppMeasurementSdk.ConditionalUserProperty.e), G, bundle.getLong(AppMeasurementSdk.ConditionalUserProperty.j), zziqVar.i().G(bundle.getString("app_id"), bundle.getString(AppMeasurementSdk.ConditionalUserProperty.k), bundle.getBundle(AppMeasurementSdk.ConditionalUserProperty.l), string2, 0L, true, true)));
        } catch (IllegalArgumentException unused) {
        }
    }
}
