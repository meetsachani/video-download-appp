package com.google.android.gms.internal.measurement;

import android.os.RemoteException;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.measurement.zzdf;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class zzei extends zzdf.zza {
    public final /* synthetic */ zzcs Z0;
    public final /* synthetic */ int a1;
    public final /* synthetic */ zzdf b1;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzei(zzdf zzdfVar, zzcs zzcsVar, int i) {
        super(zzdfVar);
        this.b1 = zzdfVar;
        this.Z0 = zzcsVar;
        this.a1 = i;
    }

    @Override // com.google.android.gms.internal.measurement.zzdf.zza
    public final void a() throws RemoteException {
        zzcu zzcuVar;
        zzcuVar = this.b1.i;
        ((zzcu) Preconditions.r(zzcuVar)).getTestFlag(this.Z0, this.a1);
    }

    @Override // com.google.android.gms.internal.measurement.zzdf.zza
    public final void b() {
        this.Z0.v0(null);
    }
}
