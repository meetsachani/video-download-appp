package com.google.android.gms.internal.measurement;

/* loaded from: classes3.dex */
public final class zzns implements zznt {
    public static final zzgn<Boolean> a;
    public static final zzgn<Boolean> b;
    public static final zzgn<Boolean> c;

    static {
        zzgv e = new zzgv(zzgk.a("com.google.android.gms.measurement")).f().e();
        a = e.d("measurement.collection.event_safelist", true);
        b = e.d("measurement.service.store_null_safelist", true);
        c = e.d("measurement.service.store_safelist", true);
    }

    @Override // com.google.android.gms.internal.measurement.zznt
    public final boolean a() {
        return true;
    }

    @Override // com.google.android.gms.internal.measurement.zznt
    public final boolean b() {
        return b.e().booleanValue();
    }

    @Override // com.google.android.gms.internal.measurement.zznt
    public final boolean c() {
        return c.e().booleanValue();
    }
}
