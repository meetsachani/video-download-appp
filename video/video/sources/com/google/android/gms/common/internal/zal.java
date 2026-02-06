package com.google.android.gms.common.internal;

import android.content.Context;
import android.util.SparseIntArray;
import com.google.android.gms.common.GoogleApiAvailability;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.google.android.gms.common.api.Api;
import o.InterfaceC5670cr1;

/* loaded from: classes2.dex */
public final class zal {
    public final SparseIntArray a;
    public GoogleApiAvailabilityLight b;

    public zal() {
        this(GoogleApiAvailability.x());
    }

    public final int a(Context context, int i) {
        return this.a.get(i, -1);
    }

    public final int b(@InterfaceC5670cr1 Context context, @InterfaceC5670cr1 Api.Client client) {
        Preconditions.r(context);
        Preconditions.r(client);
        int i = 0;
        if (!client.l()) {
            return 0;
        }
        int s = client.s();
        int a = a(context, s);
        if (a != -1) {
            return a;
        }
        int i2 = 0;
        while (true) {
            if (i2 < this.a.size()) {
                int keyAt = this.a.keyAt(i2);
                if (keyAt > s && this.a.get(keyAt) == 0) {
                    break;
                }
                i2++;
            } else {
                i = -1;
                break;
            }
        }
        if (i == -1) {
            i = this.b.k(context, s);
        }
        this.a.put(s, i);
        return i;
    }

    public final void c() {
        this.a.clear();
    }

    public zal(@InterfaceC5670cr1 GoogleApiAvailabilityLight googleApiAvailabilityLight) {
        this.a = new SparseIntArray();
        Preconditions.r(googleApiAvailabilityLight);
        this.b = googleApiAvailabilityLight;
    }
}
