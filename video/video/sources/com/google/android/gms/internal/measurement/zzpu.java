package com.google.android.gms.internal.measurement;

/* loaded from: classes3.dex */
public final class zzpu implements zzpv {
    public static final zzgn<Boolean> a;
    public static final zzgn<Boolean> b;
    public static final zzgn<Boolean> c;
    public static final zzgn<Boolean> d;

    static {
        zzgv e = new zzgv(zzgk.a("com.google.android.gms.measurement")).f().e();
        a = e.d("measurement.collection.enable_session_stitching_token.client.dev", true);
        b = e.d("measurement.collection.enable_session_stitching_token.first_open_fix", true);
        c = e.d("measurement.session_stitching_token_enabled", false);
        d = e.d("measurement.link_sst_to_sid", true);
    }

    @Override // com.google.android.gms.internal.measurement.zzpv
    public final boolean a() {
        return true;
    }

    @Override // com.google.android.gms.internal.measurement.zzpv
    public final boolean b() {
        return a.e().booleanValue();
    }

    @Override // com.google.android.gms.internal.measurement.zzpv
    public final boolean c() {
        return b.e().booleanValue();
    }

    @Override // com.google.android.gms.internal.measurement.zzpv
    public final boolean f() {
        return c.e().booleanValue();
    }
}
