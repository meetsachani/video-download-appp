package com.google.android.gms.common.api.internal;

import android.os.RemoteException;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.internal.TaskApiCall;
import com.google.android.gms.tasks.TaskCompletionSource;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class zacv extends TaskApiCall {
    public final /* synthetic */ TaskApiCall.Builder d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zacv(TaskApiCall.Builder builder, Feature[] featureArr, boolean z, int i) {
        super(featureArr, z, i);
        this.d = builder;
    }

    @Override // com.google.android.gms.common.api.internal.TaskApiCall
    public final void b(Api.AnyClient anyClient, TaskCompletionSource taskCompletionSource) throws RemoteException {
        RemoteCall remoteCall;
        remoteCall = this.d.a;
        remoteCall.accept(anyClient, taskCompletionSource);
    }
}
