package com.google.android.gms.internal.measurement;

import android.app.Activity;
import android.os.RemoteException;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.internal.measurement.zzdf;

/* loaded from: classes3.dex */
final class zzep extends zzdf.zza {
    public final /* synthetic */ Activity Z0;
    public final /* synthetic */ zzdf.zzd a1;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzep(zzdf.zzd zzdVar, Activity activity) {
        super(zzdf.this);
        this.a1 = zzdVar;
        this.Z0 = activity;
    }

    @Override // com.google.android.gms.internal.measurement.zzdf.zza
    public final void a() throws RemoteException {
        zzcu zzcuVar;
        zzcuVar = zzdf.this.i;
        ((zzcu) Preconditions.r(zzcuVar)).onActivityResumed(ObjectWrapper.V3(this.Z0), this.Y);
    }
}
