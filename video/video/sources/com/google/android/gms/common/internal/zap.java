package com.google.android.gms.common.internal;

import com.google.android.gms.common.api.PendingResult;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.PendingResultUtil;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.util.concurrent.TimeUnit;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class zap implements PendingResult.StatusListener {
    public final /* synthetic */ PendingResult a;
    public final /* synthetic */ TaskCompletionSource b;
    public final /* synthetic */ PendingResultUtil.ResultConverter c;
    public final /* synthetic */ zas d;

    public zap(PendingResult pendingResult, TaskCompletionSource taskCompletionSource, PendingResultUtil.ResultConverter resultConverter, zas zasVar) {
        this.a = pendingResult;
        this.b = taskCompletionSource;
        this.c = resultConverter;
        this.d = zasVar;
    }

    @Override // com.google.android.gms.common.api.PendingResult.StatusListener
    public final void a(Status status) {
        if (status.S0()) {
            this.b.c(this.c.a(this.a.e(0L, TimeUnit.MILLISECONDS)));
            return;
        }
        this.b.b(ApiExceptionUtil.a(status));
    }
}
