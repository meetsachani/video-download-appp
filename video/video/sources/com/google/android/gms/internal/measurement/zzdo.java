package com.google.android.gms.internal.measurement;

import android.os.RemoteException;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.measurement.zzdf;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class zzdo extends zzdf.zza {
    public final /* synthetic */ Boolean Z0;
    public final /* synthetic */ zzdf a1;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzdo(zzdf zzdfVar, Boolean bool) {
        super(zzdfVar);
        this.a1 = zzdfVar;
        this.Z0 = bool;
    }

    @Override // com.google.android.gms.internal.measurement.zzdf.zza
    public final void a() throws RemoteException {
        zzcu zzcuVar;
        zzcu zzcuVar2;
        if (this.Z0 != null) {
            zzcuVar2 = this.a1.i;
            ((zzcu) Preconditions.r(zzcuVar2)).setMeasurementEnabled(this.Z0.booleanValue(), this.X);
            return;
        }
        zzcuVar = this.a1.i;
        ((zzcu) Preconditions.r(zzcuVar)).clearMeasurementEnabled(this.X);
    }
}
