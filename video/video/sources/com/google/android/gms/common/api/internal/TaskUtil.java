package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.api.ApiException;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import o.InterfaceC11300zs1;
import o.InterfaceC5670cr1;

@KeepForSdk
/* loaded from: classes2.dex */
public class TaskUtil {
    @KeepForSdk
    public static void a(@InterfaceC5670cr1 Status status, @InterfaceC5670cr1 TaskCompletionSource<Void> taskCompletionSource) {
        b(status, null, taskCompletionSource);
    }

    @KeepForSdk
    public static <TResult> void b(@InterfaceC5670cr1 Status status, @InterfaceC11300zs1 TResult tresult, @InterfaceC5670cr1 TaskCompletionSource<TResult> taskCompletionSource) {
        if (status.S0()) {
            taskCompletionSource.c(tresult);
        } else {
            taskCompletionSource.b(new ApiException(status));
        }
    }

    @InterfaceC5670cr1
    @KeepForSdk
    @Deprecated
    public static Task<Void> c(@InterfaceC5670cr1 Task<Boolean> task) {
        return task.m(new zacx());
    }

    @KeepForSdk
    public static <ResultT> boolean d(@InterfaceC5670cr1 Status status, @InterfaceC11300zs1 ResultT resultt, @InterfaceC5670cr1 TaskCompletionSource<ResultT> taskCompletionSource) {
        if (status.S0()) {
            return taskCompletionSource.e(resultt);
        }
        return taskCompletionSource.d(new ApiException(status));
    }
}
