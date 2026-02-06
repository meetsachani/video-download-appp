package com.google.android.gms.common.api.internal;

import android.os.RemoteException;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.Api.AnyClient;
import com.google.android.gms.common.api.internal.ListenerHolder;
import com.google.android.gms.tasks.TaskCompletionSource;
import o.InterfaceC5670cr1;

@KeepForSdk
/* loaded from: classes2.dex */
public abstract class UnregisterListenerMethod<A extends Api.AnyClient, L> {
    public final ListenerHolder.ListenerKey<L> a;

    @KeepForSdk
    public UnregisterListenerMethod(@InterfaceC5670cr1 ListenerHolder.ListenerKey<L> listenerKey) {
        this.a = listenerKey;
    }

    @InterfaceC5670cr1
    @KeepForSdk
    public ListenerHolder.ListenerKey<L> a() {
        return this.a;
    }

    @KeepForSdk
    public abstract void b(@InterfaceC5670cr1 A a, @InterfaceC5670cr1 TaskCompletionSource<Boolean> taskCompletionSource) throws RemoteException;
}
