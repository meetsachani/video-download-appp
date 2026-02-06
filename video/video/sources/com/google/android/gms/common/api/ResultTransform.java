package com.google.android.gms.common.api;

import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.internal.zacp;
import o.InterfaceC10697xN2;
import o.InterfaceC11300zs1;
import o.InterfaceC5670cr1;

/* loaded from: classes2.dex */
public abstract class ResultTransform<R extends Result, S extends Result> {
    @InterfaceC5670cr1
    public final PendingResult<S> a(@InterfaceC5670cr1 Status status) {
        return new zacp(status);
    }

    @InterfaceC5670cr1
    public Status b(@InterfaceC5670cr1 Status status) {
        return status;
    }

    @InterfaceC11300zs1
    @InterfaceC10697xN2
    public abstract PendingResult<S> c(@InterfaceC5670cr1 R r);
}
