package com.google.android.gms.internal.measurement;

import android.os.RemoteException;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.measurement.zzdf;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class zzee extends zzdf.zza {
    public final /* synthetic */ zzdf.zzc Z0;
    public final /* synthetic */ zzdf a1;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzee(zzdf zzdfVar, zzdf.zzc zzcVar) {
        super(zzdfVar);
        this.a1 = zzdfVar;
        this.Z0 = zzcVar;
    }

    @Override // com.google.android.gms.internal.measurement.zzdf.zza
    public final void a() throws RemoteException {
        zzcu zzcuVar;
        zzcuVar = this.a1.i;
        ((zzcu) Preconditions.r(zzcuVar)).setEventInterceptor(this.Z0);
    }
}
