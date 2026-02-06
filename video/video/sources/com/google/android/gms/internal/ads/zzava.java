package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
final class zzava implements zzfoy {
    public final /* synthetic */ zzfnx a;

    public zzava(zzfnx zzfnxVar) {
        this.a = zzfnxVar;
    }

    @Override // com.google.android.gms.internal.ads.zzfoy
    public final void a(int i, long j, String str) {
        this.a.e(i, System.currentTimeMillis() - j, str);
    }

    @Override // com.google.android.gms.internal.ads.zzfoy
    public final void b(int i, long j) {
        this.a.d(i, System.currentTimeMillis() - j);
    }
}
