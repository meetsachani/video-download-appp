package com.google.android.gms.internal.measurement;

import android.os.RemoteException;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.measurement.zzdf;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class zzdz extends zzdf.zza {
    public final /* synthetic */ String Z0;
    public final /* synthetic */ String a1;
    public final /* synthetic */ boolean b1;
    public final /* synthetic */ zzcs c1;
    public final /* synthetic */ zzdf d1;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzdz(zzdf zzdfVar, String str, String str2, boolean z, zzcs zzcsVar) {
        super(zzdfVar);
        this.d1 = zzdfVar;
        this.Z0 = str;
        this.a1 = str2;
        this.b1 = z;
        this.c1 = zzcsVar;
    }

    @Override // com.google.android.gms.internal.measurement.zzdf.zza
    public final void a() throws RemoteException {
        zzcu zzcuVar;
        zzcuVar = this.d1.i;
        ((zzcu) Preconditions.r(zzcuVar)).getUserProperties(this.Z0, this.a1, this.b1, this.c1);
    }

    @Override // com.google.android.gms.internal.measurement.zzdf.zza
    public final void b() {
        this.c1.v0(null);
    }
}
