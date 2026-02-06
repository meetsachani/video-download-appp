package com.google.android.gms.common.internal;

import android.os.Bundle;
import com.google.android.gms.common.api.internal.ConnectionCallbacks;
import com.google.android.gms.common.internal.BaseGmsClient;
import o.InterfaceC11300zs1;

/* loaded from: classes2.dex */
final class zah implements BaseGmsClient.BaseConnectionCallbacks {
    public final /* synthetic */ ConnectionCallbacks X;

    public zah(ConnectionCallbacks connectionCallbacks) {
        this.X = connectionCallbacks;
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient.BaseConnectionCallbacks
    public final void O0(@InterfaceC11300zs1 Bundle bundle) {
        this.X.O0(bundle);
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient.BaseConnectionCallbacks
    public final void g1(int i) {
        this.X.g1(i);
    }
}
