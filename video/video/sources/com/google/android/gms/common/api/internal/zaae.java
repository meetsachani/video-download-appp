package com.google.android.gms.common.api.internal;

import android.app.Activity;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.GoogleApiAvailability;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.VisibleForTesting;
import o.C3228Ie;
import o.InterfaceC10389w71;

/* loaded from: classes2.dex */
public final class zaae extends zap {
    public final C3228Ie<ApiKey<?>> a1;
    public final GoogleApiManager b1;

    @VisibleForTesting
    public zaae(LifecycleFragment lifecycleFragment, GoogleApiManager googleApiManager, GoogleApiAvailability googleApiAvailability) {
        super(lifecycleFragment, googleApiAvailability);
        this.a1 = new C3228Ie<>();
        this.b1 = googleApiManager;
        this.X.a("ConnectionlessLifecycleHelper", this);
    }

    @InterfaceC10389w71
    public static void v(Activity activity, GoogleApiManager googleApiManager, ApiKey<?> apiKey) {
        LifecycleFragment c = LifecycleCallback.c(activity);
        zaae zaaeVar = (zaae) c.c("ConnectionlessLifecycleHelper", zaae.class);
        if (zaaeVar == null) {
            zaaeVar = new zaae(c, googleApiManager, GoogleApiAvailability.x());
        }
        Preconditions.s(apiKey, "ApiKey cannot be null");
        zaaeVar.a1.add(apiKey);
        googleApiManager.d(zaaeVar);
    }

    @Override // com.google.android.gms.common.api.internal.LifecycleCallback
    public final void i() {
        super.i();
        w();
    }

    @Override // com.google.android.gms.common.api.internal.zap, com.google.android.gms.common.api.internal.LifecycleCallback
    public final void k() {
        super.k();
        w();
    }

    @Override // com.google.android.gms.common.api.internal.zap, com.google.android.gms.common.api.internal.LifecycleCallback
    public final void l() {
        super.l();
        this.b1.e(this);
    }

    @Override // com.google.android.gms.common.api.internal.zap
    public final void n(ConnectionResult connectionResult, int i) {
        this.b1.M(connectionResult, i);
    }

    @Override // com.google.android.gms.common.api.internal.zap
    public final void o() {
        this.b1.b();
    }

    public final C3228Ie<ApiKey<?>> u() {
        return this.a1;
    }

    public final void w() {
        if (!this.a1.isEmpty()) {
            this.b1.d(this);
        }
    }
}
