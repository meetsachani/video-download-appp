package com.google.android.gms.internal.measurement;

/* loaded from: classes3.dex */
public final class zznm implements zznn {
    public static final zzgn<Boolean> a;
    public static final zzgn<Long> b;

    static {
        zzgv e = new zzgv(zzgk.a("com.google.android.gms.measurement")).f().e();
        a = e.d("measurement.service.deferred_first_open", false);
        b = e.b("measurement.id.service.deferred_first_open", 0L);
    }

    @Override // com.google.android.gms.internal.measurement.zznn
    public final boolean a() {
        return true;
    }

    @Override // com.google.android.gms.internal.measurement.zznn
    public final boolean b() {
        return a.e().booleanValue();
    }
}
