package com.google.android.gms.internal.measurement;

/* loaded from: classes3.dex */
public final class zzpz implements zzpw {
    public static final zzgn<Boolean> a;
    public static final zzgn<Boolean> b;
    public static final zzgn<Boolean> c;
    public static final zzgn<Boolean> d;
    public static final zzgn<Boolean> e;
    public static final zzgn<Long> f;

    static {
        zzgv e2 = new zzgv(zzgk.a("com.google.android.gms.measurement")).f().e();
        a = e2.d("measurement.client.sessions.background_sessions_enabled", true);
        b = e2.d("measurement.client.sessions.enable_fix_background_engagement", false);
        c = e2.d("measurement.client.sessions.immediate_start_enabled_foreground", true);
        d = e2.d("measurement.client.sessions.remove_expired_session_properties_enabled", true);
        e = e2.d("measurement.client.sessions.session_id_enabled", true);
        f = e2.b("measurement.id.client.sessions.enable_fix_background_engagement", 0L);
    }

    @Override // com.google.android.gms.internal.measurement.zzpw
    public final boolean a() {
        return b.e().booleanValue();
    }
}
