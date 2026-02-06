package com.google.android.gms.common.internal;

import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.internal.OnConnectionFailedListener;
import com.google.android.gms.common.internal.BaseGmsClient;
import o.InterfaceC5670cr1;

/* loaded from: classes2.dex */
final class zai implements BaseGmsClient.BaseOnConnectionFailedListener {
    public final /* synthetic */ OnConnectionFailedListener X;

    public zai(OnConnectionFailedListener onConnectionFailedListener) {
        this.X = onConnectionFailedListener;
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient.BaseOnConnectionFailedListener
    public final void o1(@InterfaceC5670cr1 ConnectionResult connectionResult) {
        this.X.o1(connectionResult);
    }
}
