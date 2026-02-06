package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.PendingResult;
import com.google.android.gms.common.api.Status;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.concurrent.TimeUnit;
import o.ActivityC4864Yy0;
import o.InterfaceC5670cr1;

/* loaded from: classes2.dex */
public class zaag extends GoogleApiClient {
    public final String e = "Method is not supported by connectionless client. APIs supporting connectionless client must not call this method.";

    public zaag(String str) {
    }

    @Override // com.google.android.gms.common.api.GoogleApiClient
    public final void A() {
        throw new UnsupportedOperationException(this.e);
    }

    @Override // com.google.android.gms.common.api.GoogleApiClient
    public final void B(@InterfaceC5670cr1 GoogleApiClient.ConnectionCallbacks connectionCallbacks) {
        throw new UnsupportedOperationException(this.e);
    }

    @Override // com.google.android.gms.common.api.GoogleApiClient
    public final void C(@InterfaceC5670cr1 GoogleApiClient.OnConnectionFailedListener onConnectionFailedListener) {
        throw new UnsupportedOperationException(this.e);
    }

    @Override // com.google.android.gms.common.api.GoogleApiClient
    public final void E(@InterfaceC5670cr1 ActivityC4864Yy0 activityC4864Yy0) {
        throw new UnsupportedOperationException(this.e);
    }

    @Override // com.google.android.gms.common.api.GoogleApiClient
    public final void F(@InterfaceC5670cr1 GoogleApiClient.ConnectionCallbacks connectionCallbacks) {
        throw new UnsupportedOperationException(this.e);
    }

    @Override // com.google.android.gms.common.api.GoogleApiClient
    public final void G(@InterfaceC5670cr1 GoogleApiClient.OnConnectionFailedListener onConnectionFailedListener) {
        throw new UnsupportedOperationException(this.e);
    }

    @Override // com.google.android.gms.common.api.GoogleApiClient
    public final ConnectionResult d() {
        throw new UnsupportedOperationException(this.e);
    }

    @Override // com.google.android.gms.common.api.GoogleApiClient
    public final ConnectionResult e(long j, @InterfaceC5670cr1 TimeUnit timeUnit) {
        throw new UnsupportedOperationException(this.e);
    }

    @Override // com.google.android.gms.common.api.GoogleApiClient
    public final PendingResult<Status> f() {
        throw new UnsupportedOperationException(this.e);
    }

    @Override // com.google.android.gms.common.api.GoogleApiClient
    public final void g() {
        throw new UnsupportedOperationException(this.e);
    }

    @Override // com.google.android.gms.common.api.GoogleApiClient
    public final void i() {
        throw new UnsupportedOperationException(this.e);
    }

    @Override // com.google.android.gms.common.api.GoogleApiClient
    public final void j(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        throw new UnsupportedOperationException(this.e);
    }

    @Override // com.google.android.gms.common.api.GoogleApiClient
    @InterfaceC5670cr1
    public final ConnectionResult p(@InterfaceC5670cr1 Api<?> api) {
        throw new UnsupportedOperationException(this.e);
    }

    @Override // com.google.android.gms.common.api.GoogleApiClient
    public final boolean t(@InterfaceC5670cr1 Api<?> api) {
        throw new UnsupportedOperationException(this.e);
    }

    @Override // com.google.android.gms.common.api.GoogleApiClient
    public final boolean u() {
        throw new UnsupportedOperationException(this.e);
    }

    @Override // com.google.android.gms.common.api.GoogleApiClient
    public final boolean v() {
        throw new UnsupportedOperationException(this.e);
    }

    @Override // com.google.android.gms.common.api.GoogleApiClient
    public final boolean w(@InterfaceC5670cr1 GoogleApiClient.ConnectionCallbacks connectionCallbacks) {
        throw new UnsupportedOperationException(this.e);
    }

    @Override // com.google.android.gms.common.api.GoogleApiClient
    public final boolean x(@InterfaceC5670cr1 GoogleApiClient.OnConnectionFailedListener onConnectionFailedListener) {
        throw new UnsupportedOperationException(this.e);
    }
}
