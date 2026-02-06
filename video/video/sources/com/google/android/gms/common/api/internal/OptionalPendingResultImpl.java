package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.api.OptionalPendingResult;
import com.google.android.gms.common.api.PendingResult;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.ResultCallback;
import com.google.android.gms.common.api.ResultTransform;
import com.google.android.gms.common.api.TransformedResult;
import java.util.concurrent.TimeUnit;
import o.InterfaceC5670cr1;

@KeepForSdk
/* loaded from: classes2.dex */
public final class OptionalPendingResultImpl<R extends Result> extends OptionalPendingResult<R> {
    public final BasePendingResult<R> a;

    public OptionalPendingResultImpl(@InterfaceC5670cr1 PendingResult<R> pendingResult) {
        this.a = (BasePendingResult) pendingResult;
    }

    @Override // com.google.android.gms.common.api.PendingResult
    public final void c(@InterfaceC5670cr1 PendingResult.StatusListener statusListener) {
        this.a.c(statusListener);
    }

    @Override // com.google.android.gms.common.api.PendingResult
    @InterfaceC5670cr1
    public final R d() {
        return this.a.d();
    }

    @Override // com.google.android.gms.common.api.PendingResult
    @InterfaceC5670cr1
    public final R e(long j, @InterfaceC5670cr1 TimeUnit timeUnit) {
        return this.a.e(j, timeUnit);
    }

    @Override // com.google.android.gms.common.api.PendingResult
    public final void f() {
        this.a.f();
    }

    @Override // com.google.android.gms.common.api.PendingResult
    public final boolean g() {
        return this.a.g();
    }

    @Override // com.google.android.gms.common.api.PendingResult
    public final void h(@InterfaceC5670cr1 ResultCallback<? super R> resultCallback) {
        this.a.h(resultCallback);
    }

    @Override // com.google.android.gms.common.api.PendingResult
    public final void i(@InterfaceC5670cr1 ResultCallback<? super R> resultCallback, long j, @InterfaceC5670cr1 TimeUnit timeUnit) {
        this.a.i(resultCallback, j, timeUnit);
    }

    @Override // com.google.android.gms.common.api.PendingResult
    @InterfaceC5670cr1
    public final <S extends Result> TransformedResult<S> j(@InterfaceC5670cr1 ResultTransform<? super R, ? extends S> resultTransform) {
        return this.a.j(resultTransform);
    }

    @Override // com.google.android.gms.common.api.OptionalPendingResult
    @InterfaceC5670cr1
    public final R k() {
        if (this.a.m()) {
            return this.a.e(0L, TimeUnit.MILLISECONDS);
        }
        throw new IllegalStateException("Result is not available. Check that isDone() returns true before calling get().");
    }

    @Override // com.google.android.gms.common.api.OptionalPendingResult
    public final boolean l() {
        return this.a.m();
    }
}
