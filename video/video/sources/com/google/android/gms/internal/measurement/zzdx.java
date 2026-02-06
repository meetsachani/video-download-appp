package com.google.android.gms.internal.measurement;

import android.os.RemoteException;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.measurement.zzdf;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class zzdx extends zzdf.zza {
    public final /* synthetic */ zzcs Z0;
    public final /* synthetic */ zzdf a1;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzdx(zzdf zzdfVar, zzcs zzcsVar) {
        super(zzdfVar);
        this.a1 = zzdfVar;
        this.Z0 = zzcsVar;
    }

    @Override // com.google.android.gms.internal.measurement.zzdf.zza
    public final void a() throws RemoteException {
        zzcu zzcuVar;
        zzcuVar = this.a1.i;
        ((zzcu) Preconditions.r(zzcuVar)).getCurrentScreenName(this.Z0);
    }

    @Override // com.google.android.gms.internal.measurement.zzdf.zza
    public final void b() {
        this.Z0.v0(null);
    }
}
