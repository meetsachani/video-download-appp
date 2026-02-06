package com.google.android.gms.common.internal;

import android.os.Bundle;
import com.google.android.gms.common.ConnectionResult;
import o.InterfaceC11300zs1;
import o.InterfaceC9817tn;

/* loaded from: classes2.dex */
public final class zzg extends zza {
    public final /* synthetic */ BaseGmsClient g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @InterfaceC9817tn
    public zzg(BaseGmsClient baseGmsClient, @InterfaceC11300zs1 int i, Bundle bundle) {
        super(baseGmsClient, i, null);
        this.g = baseGmsClient;
    }

    @Override // com.google.android.gms.common.internal.zza
    public final void f(ConnectionResult connectionResult) {
        if (this.g.A() && BaseGmsClient.o0(this.g)) {
            BaseGmsClient.k0(this.g, 16);
            return;
        }
        this.g.k1.a(connectionResult);
        this.g.T(connectionResult);
    }

    @Override // com.google.android.gms.common.internal.zza
    public final boolean g() {
        this.g.k1.a(ConnectionResult.y1);
        return true;
    }
}
