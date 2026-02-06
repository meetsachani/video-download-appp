package com.google.android.gms.internal.measurement;

/* loaded from: classes3.dex */
final class zzbn implements zzbm {
    public final zzh a;
    public final String b;

    public zzbn(zzh zzhVar, String str) {
        this.a = zzhVar;
        this.b = str;
    }

    @Override // com.google.android.gms.internal.measurement.zzbm
    public final zzh a(zzaq zzaqVar) {
        zzh d = this.a.d();
        d.e(this.b, zzaqVar);
        return d;
    }
}
