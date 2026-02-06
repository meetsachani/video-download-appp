package com.google.android.gms.common.api;

import com.google.android.gms.common.internal.Preconditions;
import java.util.concurrent.TimeUnit;
import o.InterfaceC5670cr1;

/* loaded from: classes2.dex */
public final class BatchResult implements Result {
    public final Status X;
    public final PendingResult<?>[] Y;

    public BatchResult(Status status, PendingResult<?>[] pendingResultArr) {
        this.X = status;
        this.Y = pendingResultArr;
    }

    @InterfaceC5670cr1
    public <R extends Result> R a(@InterfaceC5670cr1 BatchResultToken<R> batchResultToken) {
        boolean z;
        if (batchResultToken.a < this.Y.length) {
            z = true;
        } else {
            z = false;
        }
        Preconditions.b(z, "The result token does not belong to this batch");
        return (R) this.Y[batchResultToken.a].e(0L, TimeUnit.MILLISECONDS);
    }

    @Override // com.google.android.gms.common.api.Result
    @InterfaceC5670cr1
    public Status h() {
        return this.X;
    }
}
