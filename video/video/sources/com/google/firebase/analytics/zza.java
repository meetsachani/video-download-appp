package com.google.firebase.analytics;

import com.google.android.gms.internal.measurement.zzdf;
import java.util.concurrent.Callable;
import o.InterfaceC11300zs1;

/* loaded from: classes3.dex */
final class zza implements Callable<String> {
    public final /* synthetic */ FirebaseAnalytics a;

    public zza(FirebaseAnalytics firebaseAnalytics) {
        this.a = firebaseAnalytics;
    }

    @Override // java.util.concurrent.Callable
    @InterfaceC11300zs1
    public final /* synthetic */ String call() throws Exception {
        zzdf zzdfVar;
        zzdfVar = this.a.a;
        return zzdfVar.T();
    }
}
