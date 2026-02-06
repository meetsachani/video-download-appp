package com.google.android.gms.common.internal;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.internal.BaseGmsClient;
import o.InterfaceC11300zs1;
import o.InterfaceC9817tn;

/* loaded from: classes2.dex */
public final class zzf extends zza {
    @InterfaceC11300zs1
    public final IBinder g;
    public final /* synthetic */ BaseGmsClient h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @InterfaceC9817tn
    public zzf(BaseGmsClient baseGmsClient, @InterfaceC11300zs1 int i, @InterfaceC11300zs1 IBinder iBinder, Bundle bundle) {
        super(baseGmsClient, i, bundle);
        this.h = baseGmsClient;
        this.g = iBinder;
    }

    @Override // com.google.android.gms.common.internal.zza
    public final void f(ConnectionResult connectionResult) {
        if (this.h.q1 != null) {
            this.h.q1.o1(connectionResult);
        }
        this.h.T(connectionResult);
    }

    @Override // com.google.android.gms.common.internal.zza
    public final boolean g() {
        BaseGmsClient.BaseConnectionCallbacks baseConnectionCallbacks;
        BaseGmsClient.BaseConnectionCallbacks baseConnectionCallbacks2;
        try {
            IBinder iBinder = this.g;
            Preconditions.r(iBinder);
            String interfaceDescriptor = iBinder.getInterfaceDescriptor();
            if (!this.h.M().equals(interfaceDescriptor)) {
                String M = this.h.M();
                Log.w("GmsClient", "service descriptor mismatch: " + M + " vs. " + interfaceDescriptor);
                return false;
            }
            IInterface z = this.h.z(this.g);
            if (z != null && (BaseGmsClient.n0(this.h, 2, 4, z) || BaseGmsClient.n0(this.h, 3, 4, z))) {
                this.h.u1 = null;
                BaseGmsClient baseGmsClient = this.h;
                Bundle E = baseGmsClient.E();
                baseConnectionCallbacks = baseGmsClient.p1;
                if (baseConnectionCallbacks != null) {
                    baseConnectionCallbacks2 = this.h.p1;
                    baseConnectionCallbacks2.O0(E);
                    return true;
                }
                return true;
            }
            return false;
        } catch (RemoteException unused) {
            Log.w("GmsClient", "service probably died");
            return false;
        }
    }
}
