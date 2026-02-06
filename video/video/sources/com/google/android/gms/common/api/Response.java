package com.google.android.gms.common.api;

import com.google.android.gms.common.api.Result;
import o.InterfaceC5670cr1;

/* loaded from: classes2.dex */
public class Response<T extends Result> {
    public Result X;

    public Response() {
    }

    @InterfaceC5670cr1
    public T d() {
        return (T) this.X;
    }

    public void f(@InterfaceC5670cr1 T t) {
        this.X = t;
    }

    public Response(@InterfaceC5670cr1 T t) {
        this.X = t;
    }
}
