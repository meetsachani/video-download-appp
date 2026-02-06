package com.google.android.gms.internal.ads;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class zzfda implements zzgcu {
    public final /* synthetic */ zzfdb a;
    public final /* synthetic */ int b;

    public zzfda(zzfdb zzfdbVar, int i) {
        this.b = i;
        this.a = zzfdbVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgcu
    public final void a(Throwable th) {
        com.google.android.gms.ads.internal.zzv.t().x(th, "BufferingUrlPinger.attributionReportingManager");
    }

    @Override // com.google.android.gms.internal.ads.zzgcu
    public final /* bridge */ /* synthetic */ void c(Object obj) {
        this.a.b((String) obj, this.b, null);
    }
}
