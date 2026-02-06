package com.google.android.gms.internal.measurement;

/* loaded from: classes3.dex */
public final class zznx implements zznu {
    public static final zzgn<Boolean> a = new zzgv(zzgk.a("com.google.android.gms.measurement")).f().e().d("measurement.client.firebase_feature_rollout.v1.enable", true);

    @Override // com.google.android.gms.internal.measurement.zznu
    public final boolean a() {
        return true;
    }

    @Override // com.google.android.gms.internal.measurement.zznu
    public final boolean b() {
        return a.e().booleanValue();
    }
}
