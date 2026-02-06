package com.google.android.gms.internal.measurement;

/* loaded from: classes3.dex */
public final class zzpn implements zzpk {
    public static final zzgn<Boolean> a;
    public static final zzgn<Boolean> b;
    public static final zzgn<Boolean> c;
    public static final zzgn<Boolean> d;
    public static final zzgn<Boolean> e;
    public static final zzgn<Boolean> f;
    public static final zzgn<Boolean> g;
    public static final zzgn<Boolean> h;
    public static final zzgn<Boolean> i;
    public static final zzgn<Boolean> j;
    public static final zzgn<Boolean> k;
    public static final zzgn<Boolean> l;
    public static final zzgn<Boolean> m;
    public static final zzgn<Boolean> n;

    static {
        zzgv e2 = new zzgv(zzgk.a("com.google.android.gms.measurement")).f().e();
        a = e2.d("measurement.redaction.app_instance_id", true);
        b = e2.d("measurement.redaction.client_ephemeral_aiid_generation", true);
        c = e2.d("measurement.redaction.config_redacted_fields", true);
        d = e2.d("measurement.redaction.device_info", true);
        e = e2.d("measurement.redaction.e_tag", true);
        f = e2.d("measurement.redaction.enhanced_uid", true);
        g = e2.d("measurement.redaction.populate_ephemeral_app_instance_id", true);
        h = e2.d("measurement.redaction.google_signals", true);
        i = e2.d("measurement.redaction.no_aiid_in_config_request", true);
        j = e2.d("measurement.redaction.retain_major_os_version", true);
        k = e2.d("measurement.redaction.scion_payload_generator", true);
        l = e2.d("measurement.redaction.upload_redacted_fields", true);
        m = e2.d("measurement.redaction.upload_subdomain_override", true);
        n = e2.d("measurement.redaction.user_id", true);
    }

    @Override // com.google.android.gms.internal.measurement.zzpk
    public final boolean a() {
        return j.e().booleanValue();
    }

    @Override // com.google.android.gms.internal.measurement.zzpk
    public final boolean b() {
        return k.e().booleanValue();
    }
}
