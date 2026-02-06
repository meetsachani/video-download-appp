package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.internal.BaseImplementation;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.concurrent.TimeUnit;
import o.InterfaceC11300zs1;
import o.InterfaceC5670cr1;

/* loaded from: classes2.dex */
public interface zaca {
    ConnectionResult f();

    void g();

    void h();

    void i();

    void j();

    boolean k(SignInConnectionListener signInConnectionListener);

    void l(String str, @InterfaceC11300zs1 FileDescriptor fileDescriptor, PrintWriter printWriter, @InterfaceC11300zs1 String[] strArr);

    @InterfaceC11300zs1
    ConnectionResult m(@InterfaceC5670cr1 Api<?> api);

    boolean n();

    ConnectionResult o(long j, TimeUnit timeUnit);

    <A extends Api.AnyClient, R extends Result, T extends BaseImplementation.ApiMethodImpl<R, A>> T p(@InterfaceC5670cr1 T t);

    boolean q();

    <A extends Api.AnyClient, T extends BaseImplementation.ApiMethodImpl<? extends Result, A>> T r(@InterfaceC5670cr1 T t);
}
