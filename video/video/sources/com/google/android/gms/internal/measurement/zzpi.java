package com.google.android.gms.internal.measurement;

/* loaded from: classes3.dex */
public final class zzpi implements zzpj {
    public static final zzgn<Boolean> a;
    public static final zzgn<Boolean> b;
    public static final zzgn<Boolean> c;
    public static final zzgn<Boolean> d;
    public static final zzgn<Boolean> e;
    public static final zzgn<Long> f;

    static {
        zzgv e2 = new zzgv(zzgk.a("com.google.android.gms.measurement")).f().e();
        a = e2.d("measurement.rb.attribution.client2", false);
        b = e2.d("measurement.rb.attribution.followup1.service", false);
        c = e2.d("measurement.rb.attribution.service", false);
        d = e2.d("measurement.rb.attribution.enable_trigger_redaction", true);
        e = e2.d("measurement.rb.attribution.uuid_generation", true);
        f = e2.b("measurement.id.rb.attribution.service", 0L);
    }

    @Override // com.google.android.gms.internal.measurement.zzpj
    public final boolean a() {
        return true;
    }

    @Override // com.google.android.gms.internal.measurement.zzpj
    public final boolean b() {
        return a.e().booleanValue();
    }

    @Override // com.google.android.gms.internal.measurement.zzpj
    public final boolean c() {
        return b.e().booleanValue();
    }

    @Override // com.google.android.gms.internal.measurement.zzpj
    public final boolean d() {
        return d.e().booleanValue();
    }

    @Override // com.google.android.gms.internal.measurement.zzpj
    public final boolean e() {
        return e.e().booleanValue();
    }

    @Override // com.google.android.gms.internal.measurement.zzpj
    public final boolean f() {
        return c.e().booleanValue();
    }
}
