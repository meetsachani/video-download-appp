package com.google.android.gms.internal.measurement;

import android.app.Activity;
import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.internal.measurement.zzdf;

/* loaded from: classes3.dex */
final class zzeo extends zzdf.zza {
    public final /* synthetic */ Bundle Z0;
    public final /* synthetic */ Activity a1;
    public final /* synthetic */ zzdf.zzd b1;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzeo(zzdf.zzd zzdVar, Bundle bundle, Activity activity) {
        super(zzdf.this);
        this.b1 = zzdVar;
        this.Z0 = bundle;
        this.a1 = activity;
    }

    @Override // com.google.android.gms.internal.measurement.zzdf.zza
    public final void a() throws RemoteException {
        Bundle bundle;
        zzcu zzcuVar;
        if (this.Z0 != null) {
            bundle = new Bundle();
            if (this.Z0.containsKey("com.google.app_measurement.screen_service")) {
                Object obj = this.Z0.get("com.google.app_measurement.screen_service");
                if (obj instanceof Bundle) {
                    bundle.putBundle("com.google.app_measurement.screen_service", (Bundle) obj);
                }
            }
        } else {
            bundle = null;
        }
        zzcuVar = zzdf.this.i;
        ((zzcu) Preconditions.r(zzcuVar)).onActivityCreated(ObjectWrapper.V3(this.a1), bundle, this.Y);
    }
}
