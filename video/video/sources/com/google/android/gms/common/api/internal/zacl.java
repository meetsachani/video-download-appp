package com.google.android.gms.common.api.internal;

import android.os.RemoteException;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.internal.ListenerHolder;
import com.google.android.gms.common.api.internal.RegistrationMethods;
import com.google.android.gms.tasks.TaskCompletionSource;

/* loaded from: classes2.dex */
final class zacl extends UnregisterListenerMethod {
    public final /* synthetic */ RegistrationMethods.Builder b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zacl(RegistrationMethods.Builder builder, ListenerHolder.ListenerKey listenerKey) {
        super(listenerKey);
        this.b = builder;
    }

    @Override // com.google.android.gms.common.api.internal.UnregisterListenerMethod
    public final void b(Api.AnyClient anyClient, TaskCompletionSource<Boolean> taskCompletionSource) throws RemoteException {
        RemoteCall remoteCall;
        remoteCall = this.b.b;
        remoteCall.accept(anyClient, taskCompletionSource);
    }
}
