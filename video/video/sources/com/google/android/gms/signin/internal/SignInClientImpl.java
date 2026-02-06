package com.google.android.gms.signin.internal;

import android.accounts.Account;
import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.auth.api.signin.internal.Storage;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.GooglePlayServicesUtilLight;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.internal.BaseGmsClient;
import com.google.android.gms.common.internal.ClientSettings;
import com.google.android.gms.common.internal.GmsClient;
import com.google.android.gms.common.internal.IAccountAccessor;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.zat;
import o.InterfaceC11300zs1;
import o.InterfaceC5670cr1;

@KeepForSdk
/* loaded from: classes3.dex */
public class SignInClientImpl extends GmsClient<zaf> implements com.google.android.gms.signin.zae {
    public static final /* synthetic */ int N1 = 0;
    public final boolean J1;
    public final ClientSettings K1;
    public final Bundle L1;
    @InterfaceC11300zs1
    public final Integer M1;

    public SignInClientImpl(@InterfaceC5670cr1 Context context, @InterfaceC5670cr1 Looper looper, boolean z, @InterfaceC5670cr1 ClientSettings clientSettings, @InterfaceC5670cr1 Bundle bundle, @InterfaceC5670cr1 GoogleApiClient.ConnectionCallbacks connectionCallbacks, @InterfaceC5670cr1 GoogleApiClient.OnConnectionFailedListener onConnectionFailedListener) {
        super(context, looper, 44, clientSettings, connectionCallbacks, onConnectionFailedListener);
        this.J1 = true;
        this.K1 = clientSettings;
        this.L1 = bundle;
        this.M1 = clientSettings.l();
    }

    @InterfaceC5670cr1
    @KeepForSdk
    public static Bundle t0(@InterfaceC5670cr1 ClientSettings clientSettings) {
        clientSettings.k();
        Integer l = clientSettings.l();
        Bundle bundle = new Bundle();
        bundle.putParcelable("com.google.android.gms.signin.internal.clientRequestedAccount", clientSettings.b());
        if (l != null) {
            bundle.putInt("com.google.android.gms.common.internal.ClientSettings.sessionId", l.intValue());
        }
        bundle.putBoolean("com.google.android.gms.signin.internal.offlineAccessRequested", false);
        bundle.putBoolean("com.google.android.gms.signin.internal.idTokenRequested", false);
        bundle.putString("com.google.android.gms.signin.internal.serverClientId", null);
        bundle.putBoolean("com.google.android.gms.signin.internal.usePromptModeForAuthCode", true);
        bundle.putBoolean("com.google.android.gms.signin.internal.forceCodeForRefreshToken", false);
        bundle.putString("com.google.android.gms.signin.internal.hostedDomain", null);
        bundle.putString("com.google.android.gms.signin.internal.logSessionId", null);
        bundle.putBoolean("com.google.android.gms.signin.internal.waitForAccessTokenRefresh", false);
        return bundle;
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient
    @InterfaceC5670cr1
    public final Bundle H() {
        if (!F().getPackageName().equals(this.K1.h())) {
            this.L1.putString("com.google.android.gms.signin.internal.realClientPackageName", this.K1.h());
        }
        return this.L1;
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient
    @InterfaceC5670cr1
    public final String M() {
        return "com.google.android.gms.signin.internal.ISignInService";
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient
    @InterfaceC5670cr1
    public final String N() {
        return "com.google.android.gms.signin.service.START";
    }

    @Override // com.google.android.gms.signin.zae
    public final void d() {
        try {
            ((zaf) L()).r4(((Integer) Preconditions.r(this.M1)).intValue());
        } catch (RemoteException unused) {
            Log.w("SignInClientImpl", "Remote service probably died when clearAccountFromSessionStore is called");
        }
    }

    @Override // com.google.android.gms.signin.zae
    public final void f() {
        j(new BaseGmsClient.LegacyClientCallbackAdapter());
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient, com.google.android.gms.common.api.Api.Client
    public final boolean m() {
        return this.J1;
    }

    @Override // com.google.android.gms.signin.zae
    public final void r(zae zaeVar) {
        GoogleSignInAccount googleSignInAccount;
        Preconditions.s(zaeVar, "Expecting a valid ISignInCallbacks");
        try {
            Account d = this.K1.d();
            if ("<<default account>>".equals(d.name)) {
                googleSignInAccount = Storage.b(F()).c();
            } else {
                googleSignInAccount = null;
            }
            ((zaf) L()).B5(new zai(1, new zat(d, ((Integer) Preconditions.r(this.M1)).intValue(), googleSignInAccount)), zaeVar);
        } catch (RemoteException e) {
            Log.w("SignInClientImpl", "Remote service probably died when signIn is called");
            try {
                zaeVar.f2(new zak(1, new ConnectionResult(8, null), null));
            } catch (RemoteException unused) {
                Log.wtf("SignInClientImpl", "ISignInCallbacks#onSignInComplete should be executed from the same process, unexpected RemoteException.", e);
            }
        }
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient, com.google.android.gms.common.api.Api.Client
    public final int s() {
        return GooglePlayServicesUtilLight.a;
    }

    @Override // com.google.android.gms.signin.zae
    public final void u(@InterfaceC5670cr1 IAccountAccessor iAccountAccessor, boolean z) {
        try {
            ((zaf) L()).h5(iAccountAccessor, ((Integer) Preconditions.r(this.M1)).intValue(), z);
        } catch (RemoteException unused) {
            Log.w("SignInClientImpl", "Remote service probably died when saveDefaultAccount is called");
        }
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient
    @InterfaceC5670cr1
    public final /* synthetic */ IInterface z(@InterfaceC5670cr1 IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.signin.internal.ISignInService");
        if (queryLocalInterface instanceof zaf) {
            return (zaf) queryLocalInterface;
        }
        return new zaf(iBinder);
    }
}
