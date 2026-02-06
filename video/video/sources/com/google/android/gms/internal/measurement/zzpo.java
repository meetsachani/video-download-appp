package com.google.android.gms.internal.measurement;

/* loaded from: classes3.dex */
public final class zzpo implements zzpp {
    public static final zzgn<Boolean> a;
    public static final zzgn<Long> b;

    static {
        zzgv e = new zzgv(zzgk.a("com.google.android.gms.measurement")).f().e();
        a = e.d("measurement.remove_app_background.client", false);
        b = e.b("measurement.id.remove_app_background.client", 0L);
    }

    @Override // com.google.android.gms.internal.measurement.zzpp
    public final boolean a() {
        return true;
    }

    @Override // com.google.android.gms.internal.measurement.zzpp
    public final boolean b() {
        return a.e().booleanValue();
    }
}
