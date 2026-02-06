package com.google.android.gms.common.api;

import android.util.Log;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.api.Result;
import o.InterfaceC5670cr1;

/* loaded from: classes2.dex */
public abstract class ResultCallbacks<R extends Result> implements ResultCallback<R> {
    @Override // com.google.android.gms.common.api.ResultCallback
    @KeepForSdk
    public final void a(@InterfaceC5670cr1 R r) {
        Status h = r.h();
        if (h.S0()) {
            c(r);
            return;
        }
        b(h);
        if (r instanceof Releasable) {
            try {
                ((Releasable) r).g();
            } catch (RuntimeException e) {
                Log.w("ResultCallbacks", "Unable to release ".concat(String.valueOf(r)), e);
            }
        }
    }

    public abstract void b(@InterfaceC5670cr1 Status status);

    public abstract void c(@InterfaceC5670cr1 R r);
}
