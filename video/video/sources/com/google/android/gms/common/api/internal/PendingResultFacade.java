package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.api.PendingResult;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.ResultCallback;
import com.google.android.gms.common.api.ResultTransform;
import com.google.android.gms.common.api.TransformedResult;
import java.util.concurrent.TimeUnit;
import o.InterfaceC5670cr1;

@KeepForSdk
/* loaded from: classes2.dex */
public abstract class PendingResultFacade<A extends Result, B extends Result> extends PendingResult<B> {
    @Override // com.google.android.gms.common.api.PendingResult
    public final void c(@InterfaceC5670cr1 PendingResult.StatusListener statusListener) {
        throw null;
    }

    @Override // com.google.android.gms.common.api.PendingResult
    @InterfaceC5670cr1
    public final B d() {
        throw null;
    }

    @Override // com.google.android.gms.common.api.PendingResult
    @InterfaceC5670cr1
    public final B e(long j, @InterfaceC5670cr1 TimeUnit timeUnit) {
        throw null;
    }

    @Override // com.google.android.gms.common.api.PendingResult
    public final void f() {
        throw null;
    }

    @Override // com.google.android.gms.common.api.PendingResult
    public final boolean g() {
        throw null;
    }

    @Override // com.google.android.gms.common.api.PendingResult
    public final void h(@InterfaceC5670cr1 ResultCallback<? super B> resultCallback) {
        throw null;
    }

    @Override // com.google.android.gms.common.api.PendingResult
    public final void i(@InterfaceC5670cr1 ResultCallback<? super B> resultCallback, long j, @InterfaceC5670cr1 TimeUnit timeUnit) {
        throw null;
    }

    @Override // com.google.android.gms.common.api.PendingResult
    @InterfaceC5670cr1
    public final <S extends Result> TransformedResult<S> j(@InterfaceC5670cr1 ResultTransform<? super B, ? extends S> resultTransform) {
        throw null;
    }
}
