package com.google.android.gms.internal.consent_sdk;

import android.app.Application;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class zzai {
    public Application a;

    private zzai() {
        throw null;
    }

    public final zza a() {
        zzdq.b(this.a, Application.class);
        return new zzah(this.a);
    }

    public final zzai b(Application application) {
        application.getClass();
        this.a = application;
        return this;
    }

    public /* synthetic */ zzai(zzal zzalVar) {
    }
}
