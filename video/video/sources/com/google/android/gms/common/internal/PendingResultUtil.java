package com.google.android.gms.common.internal;

import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.api.PendingResult;
import com.google.android.gms.common.api.Response;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import o.InterfaceC11300zs1;
import o.InterfaceC5670cr1;

@KeepForSdk
/* loaded from: classes2.dex */
public class PendingResultUtil {
    public static final zas a = new zao();

    @KeepForSdk
    /* loaded from: classes2.dex */
    public interface ResultConverter<R extends Result, T> {
        @InterfaceC11300zs1
        @KeepForSdk
        T a(@InterfaceC5670cr1 R r);
    }

    @InterfaceC5670cr1
    @KeepForSdk
    public static <R extends Result, T extends Response<R>> Task<T> a(@InterfaceC5670cr1 PendingResult<R> pendingResult, @InterfaceC5670cr1 T t) {
        return b(pendingResult, new zaq(t));
    }

    @InterfaceC5670cr1
    @KeepForSdk
    public static <R extends Result, T> Task<T> b(@InterfaceC5670cr1 PendingResult<R> pendingResult, @InterfaceC5670cr1 ResultConverter<R, T> resultConverter) {
        zas zasVar = a;
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        pendingResult.c(new zap(pendingResult, taskCompletionSource, resultConverter, zasVar));
        return taskCompletionSource.a();
    }

    @InterfaceC5670cr1
    @KeepForSdk
    public static <R extends Result> Task<Void> c(@InterfaceC5670cr1 PendingResult<R> pendingResult) {
        return b(pendingResult, new zar());
    }
}
