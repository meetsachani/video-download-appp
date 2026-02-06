package com.google.android.gms.internal.measurement;

/* loaded from: classes3.dex */
public final class zzod implements zzoa {
    public static final zzgn<Boolean> a;
    public static final zzgn<Boolean> b;
    public static final zzgn<Boolean> c;
    public static final zzgn<Boolean> d;

    static {
        zzgv e = new zzgv(zzgk.a("com.google.android.gms.measurement")).f().e();
        a = e.d("measurement.service.audience.fix_skip_audience_with_failed_filters", true);
        b = e.d("measurement.audience.refresh_event_count_filters_timestamp", false);
        c = e.d("measurement.audience.use_bundle_end_timestamp_for_non_sequence_property_filters", false);
        d = e.d("measurement.audience.use_bundle_timestamp_for_event_count_filters", false);
    }

    @Override // com.google.android.gms.internal.measurement.zzoa
    public final boolean a() {
        return true;
    }

    @Override // com.google.android.gms.internal.measurement.zzoa
    public final boolean b() {
        return b.e().booleanValue();
    }

    @Override // com.google.android.gms.internal.measurement.zzoa
    public final boolean c() {
        return c.e().booleanValue();
    }

    @Override // com.google.android.gms.internal.measurement.zzoa
    public final boolean f() {
        return d.e().booleanValue();
    }
}
