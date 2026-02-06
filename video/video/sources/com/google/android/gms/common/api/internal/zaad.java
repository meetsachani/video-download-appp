package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.api.ApiException;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.WeakHashMap;
import o.InterfaceC11300zs1;

/* loaded from: classes2.dex */
public final class zaad {
    public final Map<BasePendingResult<?>, Boolean> a = Collections.synchronizedMap(new WeakHashMap());
    public final Map<TaskCompletionSource<?>, Boolean> b = Collections.synchronizedMap(new WeakHashMap());

    public final void c(BasePendingResult<? extends Result> basePendingResult, boolean z) {
        this.a.put(basePendingResult, Boolean.valueOf(z));
        basePendingResult.c(new zaab(this, basePendingResult));
    }

    public final <TResult> void d(TaskCompletionSource<TResult> taskCompletionSource, boolean z) {
        this.b.put(taskCompletionSource, Boolean.valueOf(z));
        taskCompletionSource.a().e(new zaac(this, taskCompletionSource));
    }

    public final void e(int i, @InterfaceC11300zs1 String str) {
        StringBuilder sb = new StringBuilder("The connection to Google Play services was lost");
        if (i == 1) {
            sb.append(" due to service disconnection.");
        } else if (i == 3) {
            sb.append(" due to dead object exception.");
        }
        if (str != null) {
            sb.append(" Last reason for disconnect: ");
            sb.append(str);
        }
        h(true, new Status(20, sb.toString()));
    }

    public final void f() {
        h(false, GoogleApiManager.m1);
    }

    public final boolean g() {
        if (this.a.isEmpty() && this.b.isEmpty()) {
            return false;
        }
        return true;
    }

    public final void h(boolean z, Status status) {
        HashMap hashMap;
        HashMap hashMap2;
        synchronized (this.a) {
            hashMap = new HashMap(this.a);
        }
        synchronized (this.b) {
            hashMap2 = new HashMap(this.b);
        }
        for (Map.Entry entry : hashMap.entrySet()) {
            if (z || ((Boolean) entry.getValue()).booleanValue()) {
                ((BasePendingResult) entry.getKey()).l(status);
            }
        }
        for (Map.Entry entry2 : hashMap2.entrySet()) {
            if (z || ((Boolean) entry2.getValue()).booleanValue()) {
                ((TaskCompletionSource) entry2.getKey()).d(new ApiException(status));
            }
        }
    }
}
