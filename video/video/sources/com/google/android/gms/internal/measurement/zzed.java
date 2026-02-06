package com.google.android.gms.internal.measurement;

import android.os.RemoteException;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.measurement.zzdf;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class zzed extends zzdf.zza {
    public final /* synthetic */ String Z0;
    public final /* synthetic */ zzcs a1;
    public final /* synthetic */ zzdf b1;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzed(zzdf zzdfVar, String str, zzcs zzcsVar) {
        super(zzdfVar);
        this.b1 = zzdfVar;
        this.Z0 = str;
        this.a1 = zzcsVar;
    }

    @Override // com.google.android.gms.internal.measurement.zzdf.zza
    public final void a() throws RemoteException {
        zzcu zzcuVar;
        zzcuVar = this.b1.i;
        ((zzcu) Preconditions.r(zzcuVar)).getMaxUserProperties(this.Z0, this.a1);
    }

    @Override // com.google.android.gms.internal.measurement.zzdf.zza
    public final void b() {
        this.a1.v0(null);
    }
}
