package com.google.firebase.inject;

import com.google.firebase.annotations.DeferredApi;
import o.InterfaceC5670cr1;

/* loaded from: classes3.dex */
public interface Deferred<T> {

    /* loaded from: classes3.dex */
    public interface DeferredHandler<T> {
        @DeferredApi
        void a(Provider<T> provider);
    }

    void a(@InterfaceC5670cr1 DeferredHandler<T> deferredHandler);
}
