package com.google.android.gms.common.api.internal;

import android.os.Bundle;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.internal.BaseImplementation;
import java.util.Collections;
import o.InterfaceC10810xr1;
import o.InterfaceC11300zs1;

/* loaded from: classes2.dex */
public final class zaax implements zabf {
    @InterfaceC10810xr1
    public final zabi a;

    public zaax(zabi zabiVar) {
        this.a = zabiVar;
    }

    @Override // com.google.android.gms.common.api.internal.zabf
    public final void a(@InterfaceC11300zs1 Bundle bundle) {
    }

    @Override // com.google.android.gms.common.api.internal.zabf
    public final void b() {
        for (Api.Client client : this.a.a1.values()) {
            client.c();
        }
        this.a.i1.s = Collections.EMPTY_SET;
    }

    @Override // com.google.android.gms.common.api.internal.zabf
    public final void c() {
        this.a.d();
    }

    @Override // com.google.android.gms.common.api.internal.zabf
    public final void d(ConnectionResult connectionResult, Api<?> api, boolean z) {
    }

    @Override // com.google.android.gms.common.api.internal.zabf
    public final void e(int i) {
    }

    @Override // com.google.android.gms.common.api.internal.zabf
    public final <A extends Api.AnyClient, R extends Result, T extends BaseImplementation.ApiMethodImpl<R, A>> T f(T t) {
        this.a.i1.k.add(t);
        return t;
    }

    @Override // com.google.android.gms.common.api.internal.zabf
    public final boolean g() {
        return true;
    }

    @Override // com.google.android.gms.common.api.internal.zabf
    public final <A extends Api.AnyClient, T extends BaseImplementation.ApiMethodImpl<? extends Result, A>> T h(T t) {
        throw new IllegalStateException("GoogleApiClient is not connected yet.");
    }
}
