package com.google.android.gms.common.api.internal;

import android.app.Activity;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.GoogleApiAvailability;
import com.google.android.gms.common.api.ApiException;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.util.concurrent.CancellationException;
import o.InterfaceC5670cr1;

/* loaded from: classes2.dex */
public final class zacc extends zap {
    public TaskCompletionSource<Void> a1;

    public zacc(LifecycleFragment lifecycleFragment) {
        super(lifecycleFragment, GoogleApiAvailability.x());
        this.a1 = new TaskCompletionSource<>();
        this.X.a("GmsAvailabilityHelper", this);
    }

    public static zacc u(@InterfaceC5670cr1 Activity activity) {
        LifecycleFragment c = LifecycleCallback.c(activity);
        zacc zaccVar = (zacc) c.c("GmsAvailabilityHelper", zacc.class);
        if (zaccVar != null) {
            if (zaccVar.a1.a().u()) {
                zaccVar.a1 = new TaskCompletionSource<>();
            }
            return zaccVar;
        }
        return new zacc(c);
    }

    @Override // com.google.android.gms.common.api.internal.LifecycleCallback
    public final void h() {
        super.h();
        this.a1.d(new CancellationException("Host activity was destroyed before Google Play services could be made available."));
    }

    @Override // com.google.android.gms.common.api.internal.zap
    public final void n(ConnectionResult connectionResult, int i) {
        String B0 = connectionResult.B0();
        if (B0 == null) {
            B0 = "Error connecting to Google Play services";
        }
        this.a1.b(new ApiException(new Status(connectionResult, B0, connectionResult.m0())));
    }

    @Override // com.google.android.gms.common.api.internal.zap
    public final void o() {
        Activity g = this.X.g();
        if (g == null) {
            this.a1.d(new ApiException(new Status(8)));
            return;
        }
        int j = this.Z0.j(g);
        if (j == 0) {
            this.a1.e(null);
        } else if (!this.a1.a().u()) {
            t(new ConnectionResult(j, null), 0);
        }
    }

    public final Task<Void> v() {
        return this.a1.a();
    }
}
