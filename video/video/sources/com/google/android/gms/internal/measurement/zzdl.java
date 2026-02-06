package com.google.android.gms.internal.measurement;

import android.app.Activity;
import android.os.RemoteException;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.internal.measurement.zzdf;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class zzdl extends zzdf.zza {
    public final /* synthetic */ Activity Z0;
    public final /* synthetic */ String a1;
    public final /* synthetic */ String b1;
    public final /* synthetic */ zzdf c1;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzdl(zzdf zzdfVar, Activity activity, String str, String str2) {
        super(zzdfVar);
        this.c1 = zzdfVar;
        this.Z0 = activity;
        this.a1 = str;
        this.b1 = str2;
    }

    @Override // com.google.android.gms.internal.measurement.zzdf.zza
    public final void a() throws RemoteException {
        zzcu zzcuVar;
        zzcuVar = this.c1.i;
        ((zzcu) Preconditions.r(zzcuVar)).setCurrentScreen(ObjectWrapper.V3(this.Z0), this.a1, this.b1, this.X);
    }
}
