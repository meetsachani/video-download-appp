package com.google.android.gms.internal.ads;

import android.os.Looper;
import android.os.SystemClock;
import java.io.IOException;
import java.util.concurrent.ExecutorService;
import o.C10323vs;
import o.InterfaceC11300zs1;

/* loaded from: classes2.dex */
public final class zzzu {
    public static final zzzn d = new zzzn(2, C10323vs.b, null);
    public static final zzzn e = new zzzn(3, C10323vs.b, null);
    public final zzaac a = zzaaa.a(zzeu.f("ExoPlayer:Loader:ProgressiveMediaPeriod"), new zzdk() { // from class: com.google.android.gms.internal.ads.zzzl
        @Override // com.google.android.gms.internal.ads.zzdk
        public final void b(Object obj) {
            ((ExecutorService) obj).shutdown();
        }
    });
    @InterfaceC11300zs1
    public zzzo b;
    @InterfaceC11300zs1
    public IOException c;

    public zzzu(String str) {
    }

    public static zzzn b(boolean z, long j) {
        return new zzzn(z ? 1 : 0, j, null);
    }

    public final long a(zzzp zzzpVar, zzzm zzzmVar, int i) {
        Looper myLooper = Looper.myLooper();
        zzdc.b(myLooper);
        this.c = null;
        long elapsedRealtime = SystemClock.elapsedRealtime();
        new zzzo(this, myLooper, zzzpVar, zzzmVar, i, elapsedRealtime).c(0L);
        return elapsedRealtime;
    }

    public final void g() {
        zzzo zzzoVar = this.b;
        zzdc.b(zzzoVar);
        zzzoVar.a(false);
    }

    public final void h() {
        this.c = null;
    }

    public final void i(int i) throws IOException {
        IOException iOException = this.c;
        if (iOException == null) {
            zzzo zzzoVar = this.b;
            if (zzzoVar != null) {
                zzzoVar.b(i);
                return;
            }
            return;
        }
        throw iOException;
    }

    public final void j(@InterfaceC11300zs1 zzzq zzzqVar) {
        zzzo zzzoVar = this.b;
        if (zzzoVar != null) {
            zzzoVar.a(true);
        }
        zzaac zzaacVar = this.a;
        zzaacVar.execute(new zzzr(zzzqVar));
        zzaacVar.a();
    }

    public final boolean k() {
        return this.c != null;
    }

    public final boolean l() {
        return this.b != null;
    }
}
