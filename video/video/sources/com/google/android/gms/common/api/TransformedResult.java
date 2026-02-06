package com.google.android.gms.common.api;

import com.google.android.gms.common.api.Result;
import o.InterfaceC5670cr1;

/* loaded from: classes2.dex */
public abstract class TransformedResult<R extends Result> {
    public abstract void b(@InterfaceC5670cr1 ResultCallbacks<? super R> resultCallbacks);

    @InterfaceC5670cr1
    public abstract <S extends Result> TransformedResult<S> c(@InterfaceC5670cr1 ResultTransform<? super R, ? extends S> resultTransform);
}
