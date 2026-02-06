package com.google.android.gms.common.api;

import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.api.Result;
import java.util.concurrent.TimeUnit;
import o.InterfaceC5670cr1;

@KeepForSdk
/* loaded from: classes2.dex */
public abstract class PendingResult<R extends Result> {

    @KeepForSdk
    /* loaded from: classes2.dex */
    public interface StatusListener {
        @KeepForSdk
        void a(@InterfaceC5670cr1 Status status);
    }

    @KeepForSdk
    public void c(@InterfaceC5670cr1 StatusListener statusListener) {
        throw new UnsupportedOperationException();
    }

    @InterfaceC5670cr1
    public abstract R d();

    @InterfaceC5670cr1
    public abstract R e(long j, @InterfaceC5670cr1 TimeUnit timeUnit);

    public abstract void f();

    public abstract boolean g();

    public abstract void h(@InterfaceC5670cr1 ResultCallback<? super R> resultCallback);

    public abstract void i(@InterfaceC5670cr1 ResultCallback<? super R> resultCallback, long j, @InterfaceC5670cr1 TimeUnit timeUnit);

    @InterfaceC5670cr1
    public <S extends Result> TransformedResult<S> j(@InterfaceC5670cr1 ResultTransform<? super R, ? extends S> resultTransform) {
        throw new UnsupportedOperationException();
    }
}
