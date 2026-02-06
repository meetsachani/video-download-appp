package com.google.android.gms.common.api.internal;

import android.content.Context;
import com.google.android.gms.common.GoogleApiAvailabilityLight;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class zaak implements Runnable {
    public final /* synthetic */ zaaw X;

    public zaak(zaaw zaawVar) {
        this.X = zaawVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        GoogleApiAvailabilityLight googleApiAvailabilityLight;
        Context context;
        zaaw zaawVar = this.X;
        googleApiAvailabilityLight = zaawVar.d;
        context = zaawVar.c;
        googleApiAvailabilityLight.a(context);
    }
}
