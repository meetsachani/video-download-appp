package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import com.google.android.gms.internal.measurement.zzpm;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class zzmb implements Runnable {
    public long X;
    public long Y;
    public final /* synthetic */ zzmc Z;

    public zzmb(zzmc zzmcVar, long j, long j2) {
        this.Z = zzmcVar;
        this.X = j;
        this.Y = j2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.Z.b.l().D(new Runnable() { // from class: com.google.android.gms.measurement.internal.zzme
            @Override // java.lang.Runnable
            public final void run() {
                zzmb zzmbVar = zzmb.this;
                zzmc zzmcVar = zzmbVar.Z;
                long j = zzmbVar.X;
                long j2 = zzmbVar.Y;
                zzmcVar.b.n();
                zzmcVar.b.j().F().a("Application going to the background");
                zzmcVar.b.h().s.a(true);
                zzmcVar.b.D(true);
                if (!zzmcVar.b.d().Q()) {
                    zzmcVar.b.f.e(j2);
                    zzmcVar.b.E(false, false, j2);
                }
                if (zzpm.a() && zzmcVar.b.d().s(zzbi.K0)) {
                    zzmcVar.b.j().J().b("Application backgrounded at: timestamp_millis", Long.valueOf(j));
                } else {
                    zzmcVar.b.r().V("auto", "_ab", j, new Bundle());
                }
            }
        });
    }
}
