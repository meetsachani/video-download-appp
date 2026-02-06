package com.google.android.gms.common.api.internal;

import android.util.Log;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.Api;
import java.util.Map;

/* loaded from: classes2.dex */
final class zabt implements Runnable {
    public final /* synthetic */ ConnectionResult X;
    public final /* synthetic */ zabu Y;

    public zabt(zabu zabuVar, ConnectionResult connectionResult) {
        this.Y = zabuVar;
        this.X = connectionResult;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Map map;
        ApiKey apiKey;
        Api.Client client;
        Api.Client client2;
        Api.Client client3;
        Api.Client client4;
        zabu zabuVar = this.Y;
        map = zabuVar.f.g1;
        apiKey = zabuVar.b;
        zabq zabqVar = (zabq) map.get(apiKey);
        if (zabqVar == null) {
            return;
        }
        if (this.X.H0()) {
            this.Y.e = true;
            client = this.Y.a;
            if (client.m()) {
                this.Y.h();
                return;
            }
            try {
                zabu zabuVar2 = this.Y;
                client3 = zabuVar2.a;
                client4 = zabuVar2.a;
                client3.p(null, client4.o());
                return;
            } catch (SecurityException e) {
                Log.e("GoogleApiManager", "Failed to get service from broker. ", e);
                client2 = this.Y.a;
                client2.g("Failed to get service from broker.");
                zabqVar.E(new ConnectionResult(10), null);
                return;
            }
        }
        zabqVar.E(this.X, null);
    }
}
