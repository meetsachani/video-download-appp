package com.google.android.gms.common.internal;

import android.os.Bundle;
import android.os.IBinder;
import android.util.Log;
import o.InterfaceC11300zs1;
import o.InterfaceC5056aJ2;
import o.InterfaceC5670cr1;
import o.InterfaceC9817tn;

@InterfaceC5056aJ2
/* loaded from: classes2.dex */
public final class zzd extends zzac {
    @InterfaceC11300zs1
    public BaseGmsClient X;
    public final int Y;

    public zzd(@InterfaceC5670cr1 BaseGmsClient baseGmsClient, int i) {
        this.X = baseGmsClient;
        this.Y = i;
    }

    @Override // com.google.android.gms.common.internal.IGmsCallbacks
    @InterfaceC9817tn
    public final void L5(int i, @InterfaceC11300zs1 Bundle bundle) {
        Log.wtf("GmsClient", "received deprecated onAccountValidationComplete callback, ignoring", new Exception());
    }

    @Override // com.google.android.gms.common.internal.IGmsCallbacks
    @InterfaceC9817tn
    public final void Y2(int i, @InterfaceC5670cr1 IBinder iBinder, @InterfaceC11300zs1 Bundle bundle) {
        Preconditions.s(this.X, "onPostInitComplete can be called only once per call to getRemoteService");
        this.X.V(i, iBinder, bundle, this.Y);
        this.X = null;
    }

    @Override // com.google.android.gms.common.internal.IGmsCallbacks
    @InterfaceC9817tn
    public final void z7(int i, @InterfaceC5670cr1 IBinder iBinder, @InterfaceC5670cr1 zzk zzkVar) {
        BaseGmsClient baseGmsClient = this.X;
        Preconditions.s(baseGmsClient, "onPostInitCompleteWithConnectionInfo can be called only once per call togetRemoteService");
        Preconditions.r(zzkVar);
        BaseGmsClient.j0(baseGmsClient, zzkVar);
        Y2(i, iBinder, zzkVar.X);
    }
}
