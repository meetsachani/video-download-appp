package com.google.android.gms.common.api;

import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.internal.BasePendingResult;

/* loaded from: classes2.dex */
final class zag<R extends Result> extends BasePendingResult<R> {
    public final R r;

    public zag(GoogleApiClient googleApiClient, R r) {
        super(googleApiClient);
        this.r = r;
    }

    @Override // com.google.android.gms.common.api.internal.BasePendingResult
    public final R k(Status status) {
        return this.r;
    }
}
