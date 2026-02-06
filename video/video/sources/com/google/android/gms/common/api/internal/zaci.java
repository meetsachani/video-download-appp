package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.api.Api;
import o.InterfaceC5670cr1;

/* loaded from: classes2.dex */
public final class zaci {
    public final RegisterListenerMethod<Api.AnyClient, ?> a;
    public final UnregisterListenerMethod<Api.AnyClient, ?> b;
    public final Runnable c;

    public zaci(@InterfaceC5670cr1 RegisterListenerMethod<Api.AnyClient, ?> registerListenerMethod, @InterfaceC5670cr1 UnregisterListenerMethod<Api.AnyClient, ?> unregisterListenerMethod, @InterfaceC5670cr1 Runnable runnable) {
        this.a = registerListenerMethod;
        this.b = unregisterListenerMethod;
        this.c = runnable;
    }
}
