package com.google.android.gms.internal.measurement;

/* loaded from: classes3.dex */
public final class zzov implements zzos {
    public static final zzgn<Boolean> a;
    public static final zzgn<Boolean> b;
    public static final zzgn<Long> c;

    static {
        zzgv e = new zzgv(zzgk.a("com.google.android.gms.measurement")).f().e();
        a = e.d("measurement.item_scoped_custom_parameters.client", true);
        b = e.d("measurement.item_scoped_custom_parameters.service", false);
        c = e.b("measurement.id.item_scoped_custom_parameters.service", 0L);
    }

    @Override // com.google.android.gms.internal.measurement.zzos
    public final boolean a() {
        return true;
    }

    @Override // com.google.android.gms.internal.measurement.zzos
    public final boolean b() {
        return a.e().booleanValue();
    }

    @Override // com.google.android.gms.internal.measurement.zzos
    public final boolean c() {
        return b.e().booleanValue();
    }
}
