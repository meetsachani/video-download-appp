package com.google.android.gms.common.api;

import android.os.Looper;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.internal.BasePendingResult;

/* loaded from: classes2.dex */
final class zaf<R extends Result> extends BasePendingResult<R> {
    public final R r;

    public zaf(R r) {
        super(Looper.getMainLooper());
        this.r = r;
    }

    @Override // com.google.android.gms.common.api.internal.BasePendingResult
    public final R k(Status status) {
        if (status.E0() == this.r.h().E0()) {
            return this.r;
        }
        throw new UnsupportedOperationException("Creating failed results is not supported");
    }
}
