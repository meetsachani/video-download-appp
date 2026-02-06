package com.google.android.gms.common.api.internal;

import android.os.Bundle;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.internal.BaseImplementation;
import o.InterfaceC11300zs1;

/* loaded from: classes2.dex */
public interface zabf {
    void a(@InterfaceC11300zs1 Bundle bundle);

    void b();

    void c();

    void d(ConnectionResult connectionResult, Api<?> api, boolean z);

    void e(int i);

    <A extends Api.AnyClient, R extends Result, T extends BaseImplementation.ApiMethodImpl<R, A>> T f(T t);

    boolean g();

    <A extends Api.AnyClient, T extends BaseImplementation.ApiMethodImpl<? extends Result, A>> T h(T t);
}
