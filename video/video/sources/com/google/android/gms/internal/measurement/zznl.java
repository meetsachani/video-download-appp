package com.google.android.gms.internal.measurement;

/* loaded from: classes3.dex */
public final class zznl implements zzni {
    public static final zzgn<Boolean> a;
    public static final zzgn<Boolean> b;
    public static final zzgn<Boolean> c;
    public static final zzgn<Long> d;

    static {
        zzgv e = new zzgv(zzgk.a("com.google.android.gms.measurement")).f().e();
        a = e.d("measurement.client.consent_state_v1", true);
        b = e.d("measurement.client.3p_consent_state_v1", true);
        c = e.d("measurement.service.consent_state_v1_W36", true);
        d = e.b("measurement.service.storage_consent_support_version", 203600L);
    }

    @Override // com.google.android.gms.internal.measurement.zzni
    public final long a() {
        return d.e().longValue();
    }
}
