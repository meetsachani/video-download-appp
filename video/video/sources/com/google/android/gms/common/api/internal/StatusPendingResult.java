package com.google.android.gms.common.api.internal;

import android.os.Looper;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.Status;
import o.InterfaceC5670cr1;

@KeepForSdk
/* loaded from: classes2.dex */
public class StatusPendingResult extends BasePendingResult<Status> {
    @Deprecated
    public StatusPendingResult(@InterfaceC5670cr1 Looper looper) {
        super(looper);
    }

    @Override // com.google.android.gms.common.api.internal.BasePendingResult
    @InterfaceC5670cr1
    public final /* bridge */ /* synthetic */ Status k(@InterfaceC5670cr1 Status status) {
        return status;
    }

    @KeepForSdk
    public StatusPendingResult(@InterfaceC5670cr1 GoogleApiClient googleApiClient) {
        super(googleApiClient);
    }
}
