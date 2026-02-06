package com.google.android.gms.internal.measurement;

/* loaded from: classes3.dex */
public final class zzow implements zzox {
    public static final zzgn<Boolean> a;
    public static final zzgn<Boolean> b;
    public static final zzgn<Boolean> c;
    public static final zzgn<Long> d;

    static {
        zzgv e = new zzgv(zzgk.a("com.google.android.gms.measurement")).f().e();
        a = e.d("measurement.sdk.collection.enable_extend_user_property_size", true);
        b = e.d("measurement.sdk.collection.last_deep_link_referrer2", true);
        c = e.d("measurement.sdk.collection.last_deep_link_referrer_campaign2", false);
        d = e.b("measurement.id.sdk.collection.last_deep_link_referrer2", 0L);
    }

    @Override // com.google.android.gms.internal.measurement.zzox
    public final boolean a() {
        return c.e().booleanValue();
    }
}
