package com.google.android.gms.common.api.internal;

import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.ClientSettings;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.signin.SignInOptions;
import java.util.Set;
import o.InterfaceC10697xN2;
import o.InterfaceC11300zs1;
import o.InterfaceC5670cr1;
import o.InterfaceC9817tn;

/* loaded from: classes2.dex */
public final class zact extends com.google.android.gms.signin.internal.zac implements GoogleApiClient.ConnectionCallbacks, GoogleApiClient.OnConnectionFailedListener {
    public static final Api.AbstractClientBuilder<? extends com.google.android.gms.signin.zae, SignInOptions> c1 = com.google.android.gms.signin.zad.c;
    public final Context X;
    public final Handler Y;
    public final Set<Scope> Y0;
    public final Api.AbstractClientBuilder<? extends com.google.android.gms.signin.zae, SignInOptions> Z;
    public final ClientSettings Z0;
    public com.google.android.gms.signin.zae a1;
    public zacs b1;

    @InterfaceC10697xN2
    public zact(Context context, Handler handler, @InterfaceC5670cr1 ClientSettings clientSettings) {
        Api.AbstractClientBuilder<? extends com.google.android.gms.signin.zae, SignInOptions> abstractClientBuilder = c1;
        this.X = context;
        this.Y = handler;
        this.Z0 = (ClientSettings) Preconditions.s(clientSettings, "ClientSettings must not be null");
        this.Y0 = clientSettings.i();
        this.Z = abstractClientBuilder;
    }

    public static /* bridge */ /* synthetic */ void B5(zact zactVar, com.google.android.gms.signin.internal.zak zakVar) {
        ConnectionResult m0 = zakVar.m0();
        if (m0.H0()) {
            com.google.android.gms.common.internal.zav zavVar = (com.google.android.gms.common.internal.zav) Preconditions.r(zakVar.B0());
            ConnectionResult m02 = zavVar.m0();
            if (!m02.H0()) {
                String valueOf = String.valueOf(m02);
                Log.wtf("SignInCoordinator", "Sign-in succeeded with resolve account failure: ".concat(valueOf), new Exception());
                zactVar.b1.c(m02);
                zactVar.a1.c();
                return;
            }
            zactVar.b1.b(zavVar.B0(), zactVar.Y0);
        } else {
            zactVar.b1.c(m0);
        }
        zactVar.a1.c();
    }

    @Override // com.google.android.gms.common.api.internal.ConnectionCallbacks
    @InterfaceC10697xN2
    public final void O0(@InterfaceC11300zs1 Bundle bundle) {
        this.a1.r(this);
    }

    public final void S7() {
        com.google.android.gms.signin.zae zaeVar = this.a1;
        if (zaeVar != null) {
            zaeVar.c();
        }
    }

    @Override // com.google.android.gms.signin.internal.zac, com.google.android.gms.signin.internal.zae
    @InterfaceC9817tn
    public final void f2(com.google.android.gms.signin.internal.zak zakVar) {
        this.Y.post(new zacr(this, zakVar));
    }

    @Override // com.google.android.gms.common.api.internal.ConnectionCallbacks
    @InterfaceC10697xN2
    public final void g1(int i) {
        this.a1.c();
    }

    @Override // com.google.android.gms.common.api.internal.OnConnectionFailedListener
    @InterfaceC10697xN2
    public final void o1(@InterfaceC5670cr1 ConnectionResult connectionResult) {
        this.b1.c(connectionResult);
    }

    @InterfaceC10697xN2
    public final void s7(zacs zacsVar) {
        com.google.android.gms.signin.zae zaeVar = this.a1;
        if (zaeVar != null) {
            zaeVar.c();
        }
        this.Z0.o(Integer.valueOf(System.identityHashCode(this)));
        Api.AbstractClientBuilder<? extends com.google.android.gms.signin.zae, SignInOptions> abstractClientBuilder = this.Z;
        Context context = this.X;
        Looper looper = this.Y.getLooper();
        ClientSettings clientSettings = this.Z0;
        this.a1 = abstractClientBuilder.c(context, looper, clientSettings, clientSettings.k(), this, this);
        this.b1 = zacsVar;
        Set<Scope> set = this.Y0;
        if (set != null && !set.isEmpty()) {
            this.a1.f();
        } else {
            this.Y.post(new zacq(this));
        }
    }
}
