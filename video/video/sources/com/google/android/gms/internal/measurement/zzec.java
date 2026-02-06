package com.google.android.gms.internal.measurement;

import android.os.RemoteException;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.internal.measurement.zzdf;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class zzec extends zzdf.zza {
    public final /* synthetic */ String a1;
    public final /* synthetic */ Object b1;
    public final /* synthetic */ zzdf e1;
    public final /* synthetic */ int Z0 = 5;
    public final /* synthetic */ Object c1 = null;
    public final /* synthetic */ Object d1 = null;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzec(zzdf zzdfVar, boolean z, int i, String str, Object obj, Object obj2, Object obj3) {
        super(false);
        this.e1 = zzdfVar;
        this.a1 = str;
        this.b1 = obj;
    }

    @Override // com.google.android.gms.internal.measurement.zzdf.zza
    public final void a() throws RemoteException {
        zzcu zzcuVar;
        zzcuVar = this.e1.i;
        ((zzcu) Preconditions.r(zzcuVar)).logHealthData(this.Z0, this.a1, ObjectWrapper.V3(this.b1), ObjectWrapper.V3(null), ObjectWrapper.V3(null));
    }
}
