package com.google.android.gms.internal.measurement;

/* loaded from: classes3.dex */
public final class zzpb implements zzoy {
    public static final zzgn<Long> a;
    public static final zzgn<Boolean> b;
    public static final zzgn<Boolean> c;

    static {
        zzgv e = new zzgv(zzgk.a("com.google.android.gms.measurement")).f().e();
        a = e.b("measurement.id.lifecycle.app_in_background_parameter", 0L);
        b = e.d("measurement.lifecycle.app_backgrounded_tracking", true);
        c = e.d("measurement.lifecycle.app_in_background_parameter", false);
    }

    @Override // com.google.android.gms.internal.measurement.zzoy
    public final boolean a() {
        return c.e().booleanValue();
    }
}
