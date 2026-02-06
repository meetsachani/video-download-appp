package com.google.android.gms.common.api.internal;

import android.os.Handler;
import android.util.Log;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.BaseGmsClient;
import com.google.android.gms.common.internal.IAccountAccessor;
import java.util.Map;
import java.util.Set;
import o.InterfaceC10697xN2;
import o.InterfaceC11300zs1;
import o.InterfaceC5670cr1;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class zabu implements BaseGmsClient.ConnectionProgressReportCallbacks, zacs {
    public final Api.Client a;
    public final ApiKey<?> b;
    @InterfaceC11300zs1
    public IAccountAccessor c = null;
    @InterfaceC11300zs1
    public Set<Scope> d = null;
    public boolean e = false;
    public final /* synthetic */ GoogleApiManager f;

    public zabu(GoogleApiManager googleApiManager, Api.Client client, ApiKey<?> apiKey) {
        this.f = googleApiManager;
        this.a = client;
        this.b = apiKey;
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient.ConnectionProgressReportCallbacks
    public final void a(@InterfaceC5670cr1 ConnectionResult connectionResult) {
        Handler handler;
        handler = this.f.k1;
        handler.post(new zabt(this, connectionResult));
    }

    @Override // com.google.android.gms.common.api.internal.zacs
    @InterfaceC10697xN2
    public final void b(@InterfaceC11300zs1 IAccountAccessor iAccountAccessor, @InterfaceC11300zs1 Set<Scope> set) {
        if (iAccountAccessor != null && set != null) {
            this.c = iAccountAccessor;
            this.d = set;
            h();
            return;
        }
        Log.wtf("GoogleApiManager", "Received null response from onSignInSuccess", new Exception());
        c(new ConnectionResult(4));
    }

    @Override // com.google.android.gms.common.api.internal.zacs
    @InterfaceC10697xN2
    public final void c(ConnectionResult connectionResult) {
        Map map;
        map = this.f.g1;
        zabq zabqVar = (zabq) map.get(this.b);
        if (zabqVar != null) {
            zabqVar.F(connectionResult);
        }
    }

    @InterfaceC10697xN2
    public final void h() {
        IAccountAccessor iAccountAccessor;
        if (this.e && (iAccountAccessor = this.c) != null) {
            this.a.p(iAccountAccessor, this.d);
        }
    }
}
