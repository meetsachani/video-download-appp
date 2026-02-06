package com.google.android.gms.internal.measurement;

import android.os.RemoteException;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.measurement.zzdf;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class zzdj extends zzdf.zza {
    public final /* synthetic */ String Z0;
    public final /* synthetic */ String a1;
    public final /* synthetic */ zzcs b1;
    public final /* synthetic */ zzdf c1;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzdj(zzdf zzdfVar, String str, String str2, zzcs zzcsVar) {
        super(zzdfVar);
        this.c1 = zzdfVar;
        this.Z0 = str;
        this.a1 = str2;
        this.b1 = zzcsVar;
    }

    @Override // com.google.android.gms.internal.measurement.zzdf.zza
    public final void a() throws RemoteException {
        zzcu zzcuVar;
        zzcuVar = this.c1.i;
        ((zzcu) Preconditions.r(zzcuVar)).getConditionalUserProperties(this.Z0, this.a1, this.b1);
    }

    @Override // com.google.android.gms.internal.measurement.zzdf.zza
    public final void b() {
        this.b1.v0(null);
    }
}
