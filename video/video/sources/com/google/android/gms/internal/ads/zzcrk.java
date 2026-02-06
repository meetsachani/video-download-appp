package com.google.android.gms.internal.ads;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class zzcrk implements zzgcu {
    public final /* synthetic */ zzgcu a;
    public final /* synthetic */ zzcrm b;

    public zzcrk(zzcrm zzcrmVar, zzgcu zzgcuVar) {
        this.a = zzgcuVar;
        this.b = zzcrmVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgcu
    public final void a(Throwable th) {
        this.a.a(th);
        zzcaa.f.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcrg
            @Override // java.lang.Runnable
            public final void run() {
                zzcrm.this.d = false;
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzgcu
    public final /* bridge */ /* synthetic */ void c(Object obj) {
        zzcrm.c(this.b, ((zzcrf) obj).a, this.a);
    }
}
