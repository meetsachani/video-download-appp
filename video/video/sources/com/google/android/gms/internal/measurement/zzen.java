package com.google.android.gms.internal.measurement;

import android.os.RemoteException;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.internal.measurement.zzdf;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class zzen extends zzdf.zza {
    public final /* synthetic */ String Z0;
    public final /* synthetic */ String a1;
    public final /* synthetic */ Object b1;
    public final /* synthetic */ boolean c1;
    public final /* synthetic */ zzdf d1;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzen(zzdf zzdfVar, String str, String str2, Object obj, boolean z) {
        super(zzdfVar);
        this.d1 = zzdfVar;
        this.Z0 = str;
        this.a1 = str2;
        this.b1 = obj;
        this.c1 = z;
    }

    @Override // com.google.android.gms.internal.measurement.zzdf.zza
    public final void a() throws RemoteException {
        zzcu zzcuVar;
        zzcuVar = this.d1.i;
        ((zzcu) Preconditions.r(zzcuVar)).setUserProperty(this.Z0, this.a1, ObjectWrapper.V3(this.b1), this.c1, this.X);
    }
}
