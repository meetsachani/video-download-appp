package com.google.android.gms.internal.measurement;

/* loaded from: classes3.dex */
public final class zzpc implements zzpd {
    public static final zzgn<Boolean> a;
    public static final zzgn<Double> b;
    public static final zzgn<Long> c;
    public static final zzgn<Long> d;
    public static final zzgn<String> e;

    static {
        zzgv e2 = new zzgv(zzgk.a("com.google.android.gms.measurement")).f().e();
        a = e2.d("measurement.test.boolean_flag", false);
        b = e2.a("measurement.test.double_flag", -3.0d);
        c = e2.b("measurement.test.int_flag", -2L);
        d = e2.b("measurement.test.long_flag", -1L);
        e = e2.c("measurement.test.string_flag", "---");
    }

    @Override // com.google.android.gms.internal.measurement.zzpd
    public final double a() {
        return b.e().doubleValue();
    }

    @Override // com.google.android.gms.internal.measurement.zzpd
    public final long b() {
        return c.e().longValue();
    }

    @Override // com.google.android.gms.internal.measurement.zzpd
    public final long c() {
        return d.e().longValue();
    }

    @Override // com.google.android.gms.internal.measurement.zzpd
    public final boolean d() {
        return a.e().booleanValue();
    }

    @Override // com.google.android.gms.internal.measurement.zzpd
    public final String f() {
        return e.e();
    }
}
