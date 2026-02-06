package com.google.android.gms.internal.ads;

import android.os.SystemClock;
import o.C5594cY;
import o.C6566gU0;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class zzrd implements zzql {
    public final /* synthetic */ zzri a;

    public /* synthetic */ zzrd(zzri zzriVar, zzrh zzrhVar) {
        this.a = zzriVar;
    }

    @Override // com.google.android.gms.internal.ads.zzql
    public final void a(long j) {
        zzqf zzqfVar;
        zzqf zzqfVar2;
        zzqa zzqaVar;
        zzri zzriVar = this.a;
        zzqfVar = zzriVar.l;
        if (zzqfVar != null) {
            zzqfVar2 = zzriVar.l;
            zzqaVar = ((zzrm) zzqfVar2).a.x2;
            zzqaVar.v(j);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzql
    public final void d(int i, long j) {
        zzqf zzqfVar;
        long j2;
        zzqf zzqfVar2;
        zzqa zzqaVar;
        zzri zzriVar = this.a;
        zzqfVar = zzriVar.l;
        if (zzqfVar != null) {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            j2 = zzriVar.R;
            zzqfVar2 = zzriVar.l;
            zzqaVar = ((zzrm) zzqfVar2).a.x2;
            zzqaVar.x(i, j, elapsedRealtime - j2);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzql
    public final void e(long j, long j2, long j3, long j4) {
        long J;
        long K;
        zzri zzriVar = this.a;
        J = zzriVar.J();
        K = zzriVar.K();
        zzdx.f(C5594cY.B0, "Spurious audio timestamp (frame position mismatch): " + j + C6566gU0.h + j2 + C6566gU0.h + j3 + C6566gU0.h + j4 + C6566gU0.h + J + C6566gU0.h + K);
    }

    @Override // com.google.android.gms.internal.ads.zzql
    public final void f(long j, long j2, long j3, long j4) {
        long J;
        long K;
        zzri zzriVar = this.a;
        J = zzriVar.J();
        K = zzriVar.K();
        zzdx.f(C5594cY.B0, "Spurious audio timestamp (system clock mismatch): " + j + C6566gU0.h + j2 + C6566gU0.h + j3 + C6566gU0.h + j4 + C6566gU0.h + J + C6566gU0.h + K);
    }

    @Override // com.google.android.gms.internal.ads.zzql
    public final void s(long j) {
        zzdx.f(C5594cY.B0, "Ignoring impossibly large audio latency: " + j);
    }
}
