package com.google.android.gms.internal.measurement;

/* loaded from: classes3.dex */
public final class zzqg implements zzqh {
    public static final zzgn<Boolean> a = new zzgv(zzgk.a("com.google.android.gms.measurement")).f().e().d("measurement.integration.disable_firebase_instance_id", false);

    @Override // com.google.android.gms.internal.measurement.zzqh
    public final boolean a() {
        return true;
    }

    @Override // com.google.android.gms.internal.measurement.zzqh
    public final boolean b() {
        return a.e().booleanValue();
    }
}
