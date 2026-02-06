package com.google.android.gms.internal.measurement;

/* loaded from: classes3.dex */
public final class zzqf implements zzqc {
    public static final zzgn<Boolean> a;
    public static final zzgn<Boolean> b;

    static {
        zzgv e = new zzgv(zzgk.a("com.google.android.gms.measurement")).f().e();
        a = e.d("measurement.sgtm.client.dev", false);
        b = e.d("measurement.sgtm.service", false);
    }

    @Override // com.google.android.gms.internal.measurement.zzqc
    public final boolean a() {
        return true;
    }

    @Override // com.google.android.gms.internal.measurement.zzqc
    public final boolean b() {
        return a.e().booleanValue();
    }

    @Override // com.google.android.gms.internal.measurement.zzqc
    public final boolean c() {
        return b.e().booleanValue();
    }
}
