package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.measurement.zzdf;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class zzdk extends zzdf.zza {
    public final /* synthetic */ String Z0;
    public final /* synthetic */ String a1;
    public final /* synthetic */ Bundle b1;
    public final /* synthetic */ zzdf c1;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzdk(zzdf zzdfVar, String str, String str2, Bundle bundle) {
        super(zzdfVar);
        this.c1 = zzdfVar;
        this.Z0 = str;
        this.a1 = str2;
        this.b1 = bundle;
    }

    @Override // com.google.android.gms.internal.measurement.zzdf.zza
    public final void a() throws RemoteException {
        zzcu zzcuVar;
        zzcuVar = this.c1.i;
        ((zzcu) Preconditions.r(zzcuVar)).clearConditionalUserProperty(this.Z0, this.a1, this.b1);
    }
}
