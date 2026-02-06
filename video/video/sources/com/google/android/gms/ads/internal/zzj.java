package com.google.android.gms.ads.internal;

import com.google.android.gms.internal.ads.zzfnx;
import com.google.android.gms.internal.ads.zzfoy;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class zzj implements zzfoy {
    public final /* synthetic */ zzk a;

    public zzj(zzk zzkVar) {
        this.a = zzkVar;
    }

    @Override // com.google.android.gms.internal.ads.zzfoy
    public final void a(int i, long j, String str) {
        zzfnx zzfnxVar;
        zzfnxVar = this.a.c1;
        zzfnxVar.e(i, System.currentTimeMillis() - j, str);
    }

    @Override // com.google.android.gms.internal.ads.zzfoy
    public final void b(int i, long j) {
        zzfnx zzfnxVar;
        zzfnxVar = this.a.c1;
        zzfnxVar.d(i, System.currentTimeMillis() - j);
    }
}
