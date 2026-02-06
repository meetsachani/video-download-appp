package com.google.android.gms.common.internal;

import android.app.PendingIntent;
import android.os.Bundle;
import com.google.android.gms.common.ConnectionResult;
import o.InterfaceC11300zs1;
import o.InterfaceC9817tn;

/* loaded from: classes2.dex */
abstract class zza extends zzc {
    public final int d;
    @InterfaceC11300zs1
    public final Bundle e;
    public final /* synthetic */ BaseGmsClient f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @InterfaceC9817tn
    public zza(BaseGmsClient baseGmsClient, @InterfaceC11300zs1 int i, Bundle bundle) {
        super(baseGmsClient, Boolean.TRUE);
        this.f = baseGmsClient;
        this.d = i;
        this.e = bundle;
    }

    @Override // com.google.android.gms.common.internal.zzc
    public final /* bridge */ /* synthetic */ void a(Object obj) {
        PendingIntent pendingIntent = null;
        if (this.d != 0) {
            this.f.p0(1, null);
            Bundle bundle = this.e;
            if (bundle != null) {
                pendingIntent = (PendingIntent) bundle.getParcelable(BaseGmsClient.B1);
            }
            f(new ConnectionResult(this.d, pendingIntent));
        } else if (!g()) {
            this.f.p0(1, null);
            f(new ConnectionResult(8, null));
        }
    }

    @Override // com.google.android.gms.common.internal.zzc
    public final void b() {
    }

    public abstract void f(ConnectionResult connectionResult);

    public abstract boolean g();
}
