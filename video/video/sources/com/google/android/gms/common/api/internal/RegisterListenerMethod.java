package com.google.android.gms.common.api.internal;

import android.os.RemoteException;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.Api.AnyClient;
import com.google.android.gms.common.api.internal.ListenerHolder;
import com.google.android.gms.tasks.TaskCompletionSource;
import o.InterfaceC11300zs1;
import o.InterfaceC5670cr1;

@KeepForSdk
/* loaded from: classes2.dex */
public abstract class RegisterListenerMethod<A extends Api.AnyClient, L> {
    public final ListenerHolder<L> a;
    @InterfaceC11300zs1
    public final Feature[] b;
    public final boolean c;
    public final int d;

    @KeepForSdk
    public RegisterListenerMethod(@InterfaceC5670cr1 ListenerHolder<L> listenerHolder, @InterfaceC11300zs1 Feature[] featureArr, boolean z, int i) {
        this.a = listenerHolder;
        this.b = featureArr;
        this.c = z;
        this.d = i;
    }

    @KeepForSdk
    public void a() {
        this.a.a();
    }

    @InterfaceC11300zs1
    @KeepForSdk
    public ListenerHolder.ListenerKey<L> b() {
        return this.a.b();
    }

    @InterfaceC11300zs1
    @KeepForSdk
    public Feature[] c() {
        return this.b;
    }

    @KeepForSdk
    public abstract void d(@InterfaceC5670cr1 A a, @InterfaceC5670cr1 TaskCompletionSource<Void> taskCompletionSource) throws RemoteException;

    public final int e() {
        return this.d;
    }

    public final boolean f() {
        return this.c;
    }

    @KeepForSdk
    public RegisterListenerMethod(@InterfaceC5670cr1 ListenerHolder<L> listenerHolder) {
        this(listenerHolder, null, false, 0);
    }

    @KeepForSdk
    public RegisterListenerMethod(@InterfaceC5670cr1 ListenerHolder<L> listenerHolder, @InterfaceC5670cr1 Feature[] featureArr, boolean z) {
        this(listenerHolder, featureArr, z, 0);
    }
}
