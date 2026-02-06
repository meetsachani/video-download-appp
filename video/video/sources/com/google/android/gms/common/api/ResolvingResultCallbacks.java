package com.google.android.gms.common.api;

import android.app.Activity;
import android.content.IntentSender;
import android.util.Log;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.internal.Preconditions;
import o.InterfaceC5670cr1;

/* loaded from: classes2.dex */
public abstract class ResolvingResultCallbacks<R extends Result> extends ResultCallbacks<R> {
    public final Activity a;
    public final int b;

    public ResolvingResultCallbacks(@InterfaceC5670cr1 Activity activity, int i) {
        Preconditions.s(activity, "Activity must not be null");
        this.a = activity;
        this.b = i;
    }

    @Override // com.google.android.gms.common.api.ResultCallbacks
    @KeepForSdk
    public final void b(@InterfaceC5670cr1 Status status) {
        if (status.H0()) {
            try {
                status.U0(this.a, this.b);
                return;
            } catch (IntentSender.SendIntentException e) {
                Log.e("ResolvingResultCallback", "Failed to start resolution", e);
                d(new Status(8));
                return;
            }
        }
        d(status);
    }

    @Override // com.google.android.gms.common.api.ResultCallbacks
    public abstract void c(@InterfaceC5670cr1 R r);

    public abstract void d(@InterfaceC5670cr1 Status status);
}
