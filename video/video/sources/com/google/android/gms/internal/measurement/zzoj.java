package com.google.android.gms.internal.measurement;

/* loaded from: classes3.dex */
public final class zzoj implements zzog {
    public static final zzgn<Boolean> a;
    public static final zzgn<Boolean> b;
    public static final zzgn<Boolean> c;

    static {
        zzgv e = new zzgv(zzgk.a("com.google.android.gms.measurement")).f().e();
        a = e.d("measurement.client.sessions.check_on_reset_and_enable2", true);
        b = e.d("measurement.client.sessions.check_on_startup", true);
        c = e.d("measurement.client.sessions.start_session_before_view_screen", true);
    }

    @Override // com.google.android.gms.internal.measurement.zzog
    public final boolean a() {
        return true;
    }

    @Override // com.google.android.gms.internal.measurement.zzog
    public final boolean b() {
        return a.e().booleanValue();
    }
}
