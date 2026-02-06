package com.google.android.gms.common.api.internal;

import android.content.Context;
import android.os.Looper;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.Api.ApiOptions;
import com.google.android.gms.common.api.GoogleApi;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.internal.BaseImplementation;
import o.InterfaceC10810xr1;
import o.InterfaceC5670cr1;

/* loaded from: classes2.dex */
public final class zabv<O extends Api.ApiOptions> extends zaag {
    @InterfaceC10810xr1
    public final GoogleApi<O> f;

    public zabv(GoogleApi<O> googleApi) {
        super("Method is not supported by connectionless client. APIs supporting connectionless client must not call this method.");
        this.f = googleApi;
    }

    @Override // com.google.android.gms.common.api.GoogleApiClient
    public final void H(zada zadaVar) {
    }

    @Override // com.google.android.gms.common.api.GoogleApiClient
    public final void I(zada zadaVar) {
    }

    @Override // com.google.android.gms.common.api.GoogleApiClient
    public final <A extends Api.AnyClient, R extends Result, T extends BaseImplementation.ApiMethodImpl<R, A>> T l(@InterfaceC5670cr1 T t) {
        return (T) this.f.i(t);
    }

    @Override // com.google.android.gms.common.api.GoogleApiClient
    public final <A extends Api.AnyClient, T extends BaseImplementation.ApiMethodImpl<? extends Result, A>> T m(@InterfaceC5670cr1 T t) {
        return (T) this.f.o(t);
    }

    @Override // com.google.android.gms.common.api.GoogleApiClient
    public final Context q() {
        return this.f.r();
    }

    @Override // com.google.android.gms.common.api.GoogleApiClient
    public final Looper r() {
        return this.f.u();
    }
}
