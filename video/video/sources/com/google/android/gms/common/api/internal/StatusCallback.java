package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.BaseImplementation;
import com.google.android.gms.common.api.internal.IStatusCallback;
import o.InterfaceC5670cr1;

@KeepForSdk
/* loaded from: classes2.dex */
public class StatusCallback extends IStatusCallback.Stub {
    @KeepForSdk
    public final BaseImplementation.ResultHolder<Status> X;

    @KeepForSdk
    public StatusCallback(@InterfaceC5670cr1 BaseImplementation.ResultHolder<Status> resultHolder) {
        this.X = resultHolder;
    }

    @Override // com.google.android.gms.common.api.internal.IStatusCallback
    @KeepForSdk
    public void F5(@InterfaceC5670cr1 Status status) {
        this.X.a(status);
    }
}
