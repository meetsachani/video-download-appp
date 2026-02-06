package com.google.android.gms.common.api.internal;

import android.content.Context;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.google.android.gms.common.api.Api;
import java.util.ArrayList;
import java.util.Map;
import o.InterfaceC10697xN2;
import o.InterfaceC8223nF0;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class zaao extends zaav {
    public final Map<Api.Client, zaal> Y;
    public final /* synthetic */ zaaw Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zaao(zaaw zaawVar, Map<Api.Client, zaal> map) {
        super(zaawVar, null);
        this.Z = zaawVar;
        this.Y = map;
    }

    @Override // com.google.android.gms.common.api.internal.zaav
    @InterfaceC10697xN2
    @InterfaceC8223nF0("mLock")
    public final void a() {
        GoogleApiAvailabilityLight googleApiAvailabilityLight;
        Context context;
        boolean z;
        Context context2;
        zabi zabiVar;
        com.google.android.gms.signin.zae zaeVar;
        com.google.android.gms.signin.zae zaeVar2;
        zabi zabiVar2;
        Context context3;
        boolean z2;
        googleApiAvailabilityLight = this.Z.d;
        com.google.android.gms.common.internal.zal zalVar = new com.google.android.gms.common.internal.zal(googleApiAvailabilityLight);
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (Api.Client client : this.Y.keySet()) {
            if (client.l()) {
                z2 = this.Y.get(client).c;
                if (!z2) {
                    arrayList.add(client);
                }
            }
            arrayList2.add(client);
        }
        int i = -1;
        int i2 = 0;
        if (arrayList.isEmpty()) {
            int size = arrayList2.size();
            while (i2 < size) {
                context3 = this.Z.c;
                i = zalVar.b(context3, (Api.Client) arrayList2.get(i2));
                i2++;
                if (i == 0) {
                    break;
                }
            }
        } else {
            int size2 = arrayList.size();
            while (i2 < size2) {
                context = this.Z.c;
                i = zalVar.b(context, (Api.Client) arrayList.get(i2));
                i2++;
                if (i != 0) {
                    break;
                }
            }
        }
        if (i != 0) {
            ConnectionResult connectionResult = new ConnectionResult(i, null);
            zaaw zaawVar = this.Z;
            zabiVar2 = zaawVar.a;
            zabiVar2.s(new zaam(this, zaawVar, connectionResult));
            return;
        }
        zaaw zaawVar2 = this.Z;
        z = zaawVar2.m;
        if (z) {
            zaeVar = zaawVar2.k;
            if (zaeVar != null) {
                zaeVar2 = zaawVar2.k;
                zaeVar2.f();
            }
        }
        for (Api.Client client2 : this.Y.keySet()) {
            zaal zaalVar = this.Y.get(client2);
            if (client2.l()) {
                context2 = this.Z.c;
                if (zalVar.b(context2, client2) != 0) {
                    zaaw zaawVar3 = this.Z;
                    zabiVar = zaawVar3.a;
                    zabiVar.s(new zaan(this, zaawVar3, zaalVar));
                }
            }
            client2.j(zaalVar);
        }
    }
}
