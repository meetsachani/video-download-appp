package com.google.android.gms.internal.measurement;

/* loaded from: classes3.dex */
public final class zzpt implements zzpq {
    public static final zzgn<Boolean> a = new zzgv(zzgk.a("com.google.android.gms.measurement")).f().e().d("measurement.sessionid.enable_client_session_id", true);

    @Override // com.google.android.gms.internal.measurement.zzpq
    public final boolean a() {
        return true;
    }

    @Override // com.google.android.gms.internal.measurement.zzpq
    public final boolean b() {
        return a.e().booleanValue();
    }
}
