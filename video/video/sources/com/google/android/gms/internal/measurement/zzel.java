package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.measurement.zzdf;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class zzel extends zzdf.zza {
    public final /* synthetic */ Long Z0;
    public final /* synthetic */ String a1;
    public final /* synthetic */ String b1;
    public final /* synthetic */ Bundle c1;
    public final /* synthetic */ boolean d1;
    public final /* synthetic */ boolean e1;
    public final /* synthetic */ zzdf f1;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzel(zzdf zzdfVar, Long l, String str, String str2, Bundle bundle, boolean z, boolean z2) {
        super(zzdfVar);
        this.f1 = zzdfVar;
        this.Z0 = l;
        this.a1 = str;
        this.b1 = str2;
        this.c1 = bundle;
        this.d1 = z;
        this.e1 = z2;
    }

    @Override // com.google.android.gms.internal.measurement.zzdf.zza
    public final void a() throws RemoteException {
        long longValue;
        zzcu zzcuVar;
        Long l = this.Z0;
        if (l == null) {
            longValue = this.X;
        } else {
            longValue = l.longValue();
        }
        long j = longValue;
        zzcuVar = this.f1.i;
        ((zzcu) Preconditions.r(zzcuVar)).logEvent(this.a1, this.b1, this.c1, this.d1, this.e1, j);
    }
}
