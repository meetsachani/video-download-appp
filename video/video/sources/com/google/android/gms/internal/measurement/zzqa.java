package com.google.android.gms.internal.measurement;

/* loaded from: classes3.dex */
public final class zzqa implements zzqb {
    public static final zzgn<Boolean> a;
    public static final zzgn<Boolean> b;

    static {
        zzgv e = new zzgv(zzgk.a("com.google.android.gms.measurement")).f().e();
        a = e.d("measurement.sfmc.client", true);
        b = e.d("measurement.sfmc.service", true);
    }

    @Override // com.google.android.gms.internal.measurement.zzqb
    public final boolean a() {
        return true;
    }

    @Override // com.google.android.gms.internal.measurement.zzqb
    public final boolean b() {
        return a.e().booleanValue();
    }

    @Override // com.google.android.gms.internal.measurement.zzqb
    public final boolean c() {
        return b.e().booleanValue();
    }
}
