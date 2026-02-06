package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;
import o.InterfaceC10571ws1;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class zzduf implements zzgcu {
    public final /* synthetic */ zzduh a;

    public zzduf(zzduh zzduhVar) {
        this.a = zzduhVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgcu
    public final void a(Throwable th) {
        long j;
        zzcaf zzcafVar;
        synchronized (this) {
            zzduh zzduhVar = this.a;
            zzduhVar.c = true;
            long b = com.google.android.gms.ads.internal.zzv.d().b();
            j = zzduhVar.d;
            zzduhVar.v("com.google.android.gms.ads.MobileAds", false, "Internal Error.", (int) (b - j));
            zzcafVar = zzduhVar.e;
            zzcafVar.d(new Exception());
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgcu
    public final /* bridge */ /* synthetic */ void c(@InterfaceC10571ws1 Object obj) {
        long j;
        Executor executor;
        final String str = (String) obj;
        synchronized (this) {
            zzduh zzduhVar = this.a;
            zzduhVar.c = true;
            long b = com.google.android.gms.ads.internal.zzv.d().b();
            j = zzduhVar.d;
            zzduhVar.v("com.google.android.gms.ads.MobileAds", true, "", (int) (b - j));
            executor = zzduhVar.i;
            executor.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzdue
                @Override // java.lang.Runnable
                public final void run() {
                    zzduh.o(zzduf.this.a, str);
                }
            });
        }
    }
}
