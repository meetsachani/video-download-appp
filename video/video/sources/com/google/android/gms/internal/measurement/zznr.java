package com.google.android.gms.internal.measurement;

/* loaded from: classes3.dex */
public final class zznr implements zzno {
    public static final zzgn<Boolean> a;
    public static final zzgn<Boolean> b;
    public static final zzgn<Boolean> c;
    public static final zzgn<Boolean> d;
    public static final zzgn<Boolean> e;
    public static final zzgn<Boolean> f;
    public static final zzgn<Long> g;

    static {
        zzgv e2 = new zzgv(zzgk.a("com.google.android.gms.measurement")).f().e();
        a = e2.d("measurement.dma_consent.client", false);
        b = e2.d("measurement.dma_consent.client_bow_check", false);
        c = e2.d("measurement.dma_consent.service", false);
        d = e2.d("measurement.dma_consent.service_gcs_v2", false);
        e = e2.d("measurement.dma_consent.service_npa_remote_default", false);
        f = e2.d("measurement.dma_consent.service_split_batch_on_consent", false);
        g = e2.b("measurement.id.dma_consent.service", 0L);
    }

    @Override // com.google.android.gms.internal.measurement.zzno
    public final boolean a() {
        return true;
    }

    @Override // com.google.android.gms.internal.measurement.zzno
    public final boolean b() {
        return a.e().booleanValue();
    }

    @Override // com.google.android.gms.internal.measurement.zzno
    public final boolean c() {
        return b.e().booleanValue();
    }

    @Override // com.google.android.gms.internal.measurement.zzno
    public final boolean d() {
        return d.e().booleanValue();
    }

    @Override // com.google.android.gms.internal.measurement.zzno
    public final boolean e() {
        return e.e().booleanValue();
    }

    @Override // com.google.android.gms.internal.measurement.zzno
    public final boolean f() {
        return c.e().booleanValue();
    }

    @Override // com.google.android.gms.internal.measurement.zzno
    public final boolean g() {
        return f.e().booleanValue();
    }
}
