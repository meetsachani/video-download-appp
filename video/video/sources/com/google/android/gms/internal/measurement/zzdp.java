package com.google.android.gms.internal.measurement;

import android.os.RemoteException;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.measurement.zzdf;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class zzdp extends zzdf.zza {
    public final /* synthetic */ zzdf Z0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzdp(zzdf zzdfVar) {
        super(zzdfVar);
        this.Z0 = zzdfVar;
    }

    @Override // com.google.android.gms.internal.measurement.zzdf.zza
    public final void a() throws RemoteException {
        zzcu zzcuVar;
        zzcuVar = this.Z0.i;
        ((zzcu) Preconditions.r(zzcuVar)).resetAnalyticsData(this.X);
    }
}
