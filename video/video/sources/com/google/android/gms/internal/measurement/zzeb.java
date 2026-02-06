package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.measurement.zzdf;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class zzeb extends zzdf.zza {
    public final /* synthetic */ Bundle Z0;
    public final /* synthetic */ zzcs a1;
    public final /* synthetic */ zzdf b1;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzeb(zzdf zzdfVar, Bundle bundle, zzcs zzcsVar) {
        super(zzdfVar);
        this.b1 = zzdfVar;
        this.Z0 = bundle;
        this.a1 = zzcsVar;
    }

    @Override // com.google.android.gms.internal.measurement.zzdf.zza
    public final void a() throws RemoteException {
        zzcu zzcuVar;
        zzcuVar = this.b1.i;
        ((zzcu) Preconditions.r(zzcuVar)).performAction(this.Z0, this.a1, this.X);
    }

    @Override // com.google.android.gms.internal.measurement.zzdf.zza
    public final void b() {
        this.a1.v0(null);
    }
}
