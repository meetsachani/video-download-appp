package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.api.ApiException;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import o.InterfaceC5670cr1;

/* loaded from: classes2.dex */
final class zacx implements Continuation<Boolean, Void> {
    @Override // com.google.android.gms.tasks.Continuation
    public final /* bridge */ /* synthetic */ Void a(@InterfaceC5670cr1 Task<Boolean> task) throws Exception {
        if (task.r().booleanValue()) {
            return null;
        }
        throw new ApiException(new Status(13, "listener already unregistered"));
    }
}
