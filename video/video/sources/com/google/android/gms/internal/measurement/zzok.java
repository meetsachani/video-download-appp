package com.google.android.gms.internal.measurement;

/* loaded from: classes3.dex */
public final class zzok implements zzol {
    public static final zzgn<Boolean> a;
    public static final zzgn<Boolean> b;
    public static final zzgn<Long> c;

    static {
        zzgv e = new zzgv(zzgk.a("com.google.android.gms.measurement")).f().e();
        a = e.d("measurement.gbraid_campaign.gbraid.client.dev", false);
        b = e.d("measurement.gbraid_campaign.gbraid.service", false);
        c = e.b("measurement.id.gbraid_campaign.service", 0L);
    }

    @Override // com.google.android.gms.internal.measurement.zzol
    public final boolean a() {
        return true;
    }

    @Override // com.google.android.gms.internal.measurement.zzol
    public final boolean b() {
        return a.e().booleanValue();
    }

    @Override // com.google.android.gms.internal.measurement.zzol
    public final boolean c() {
        return b.e().booleanValue();
    }
}
