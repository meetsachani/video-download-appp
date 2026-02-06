package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.api.Api;

/* loaded from: classes2.dex */
final class zabo implements Runnable {
    public final /* synthetic */ zabp X;

    public zabo(zabp zabpVar) {
        this.X = zabpVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Api.Client client;
        Api.Client client2;
        zabq zabqVar = this.X.a;
        client = zabqVar.Y;
        client2 = zabqVar.Y;
        client.g(client2.getClass().getName().concat(" disconnecting because it was signed out."));
    }
}
