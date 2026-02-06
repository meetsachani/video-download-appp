package com.google.android.gms.common.api;

import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.internal.BasePendingResult;
import o.InterfaceC11300zs1;

/* loaded from: classes2.dex */
final class zah<R extends Result> extends BasePendingResult<R> {
    public zah(@InterfaceC11300zs1 GoogleApiClient googleApiClient) {
        super(googleApiClient);
    }

    @Override // com.google.android.gms.common.api.internal.BasePendingResult
    public final R k(Status status) {
        throw new UnsupportedOperationException("Creating failed results is not supported");
    }
}
