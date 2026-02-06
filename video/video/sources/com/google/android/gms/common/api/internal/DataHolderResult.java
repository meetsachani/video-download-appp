package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.api.Releasable;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.data.DataHolder;
import o.InterfaceC5670cr1;

@KeepForSdk
/* loaded from: classes2.dex */
public abstract class DataHolderResult implements Result, Releasable {
    @InterfaceC5670cr1
    @KeepForSdk
    public final Status X;
    @InterfaceC5670cr1
    @KeepForSdk
    public final DataHolder Y;

    @KeepForSdk
    public DataHolderResult(@InterfaceC5670cr1 DataHolder dataHolder, @InterfaceC5670cr1 Status status) {
        this.X = status;
        this.Y = dataHolder;
    }

    @Override // com.google.android.gms.common.api.Releasable
    @KeepForSdk
    public void g() {
        DataHolder dataHolder = this.Y;
        if (dataHolder != null) {
            dataHolder.close();
        }
    }

    @Override // com.google.android.gms.common.api.Result
    @InterfaceC5670cr1
    @KeepForSdk
    public Status h() {
        return this.X;
    }

    @KeepForSdk
    public DataHolderResult(@InterfaceC5670cr1 DataHolder dataHolder) {
        this(dataHolder, new Status(dataHolder.O0()));
    }
}
