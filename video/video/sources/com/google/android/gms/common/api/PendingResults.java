package com.google.android.gms.common.api;

import android.os.Looper;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.api.internal.OptionalPendingResultImpl;
import com.google.android.gms.common.api.internal.StatusPendingResult;
import com.google.android.gms.common.internal.Preconditions;
import o.InterfaceC5670cr1;

/* loaded from: classes2.dex */
public final class PendingResults {
    @KeepForSdk
    private PendingResults() {
    }

    @InterfaceC5670cr1
    public static PendingResult<Status> a() {
        StatusPendingResult statusPendingResult = new StatusPendingResult(Looper.getMainLooper());
        statusPendingResult.f();
        return statusPendingResult;
    }

    @InterfaceC5670cr1
    public static <R extends Result> PendingResult<R> b(@InterfaceC5670cr1 R r) {
        boolean z;
        Preconditions.s(r, "Result must not be null");
        if (r.h().E0() == 16) {
            z = true;
        } else {
            z = false;
        }
        Preconditions.b(z, "Status code must be CommonStatusCodes.CANCELED");
        zaf zafVar = new zaf(r);
        zafVar.f();
        return zafVar;
    }

    @InterfaceC5670cr1
    @KeepForSdk
    public static <R extends Result> PendingResult<R> c(@InterfaceC5670cr1 R r, @InterfaceC5670cr1 GoogleApiClient googleApiClient) {
        Preconditions.s(r, "Result must not be null");
        Preconditions.b(!r.h().S0(), "Status code must not be SUCCESS");
        zag zagVar = new zag(googleApiClient, r);
        zagVar.o(r);
        return zagVar;
    }

    @InterfaceC5670cr1
    @KeepForSdk
    public static <R extends Result> OptionalPendingResult<R> d(@InterfaceC5670cr1 R r) {
        Preconditions.s(r, "Result must not be null");
        zah zahVar = new zah(null);
        zahVar.o(r);
        return new OptionalPendingResultImpl(zahVar);
    }

    @InterfaceC5670cr1
    @KeepForSdk
    public static <R extends Result> OptionalPendingResult<R> e(@InterfaceC5670cr1 R r, @InterfaceC5670cr1 GoogleApiClient googleApiClient) {
        Preconditions.s(r, "Result must not be null");
        zah zahVar = new zah(googleApiClient);
        zahVar.o(r);
        return new OptionalPendingResultImpl(zahVar);
    }

    @InterfaceC5670cr1
    @KeepForSdk
    public static PendingResult<Status> f(@InterfaceC5670cr1 Status status) {
        Preconditions.s(status, "Result must not be null");
        StatusPendingResult statusPendingResult = new StatusPendingResult(Looper.getMainLooper());
        statusPendingResult.o(status);
        return statusPendingResult;
    }

    @InterfaceC5670cr1
    @KeepForSdk
    public static PendingResult<Status> g(@InterfaceC5670cr1 Status status, @InterfaceC5670cr1 GoogleApiClient googleApiClient) {
        Preconditions.s(status, "Result must not be null");
        StatusPendingResult statusPendingResult = new StatusPendingResult(googleApiClient);
        statusPendingResult.o(status);
        return statusPendingResult;
    }
}
