package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.internal.Preconditions;

/* loaded from: classes2.dex */
final class zam {
    public final int a;
    public final ConnectionResult b;

    public zam(ConnectionResult connectionResult, int i) {
        Preconditions.r(connectionResult);
        this.b = connectionResult;
        this.a = i;
    }

    public final int a() {
        return this.a;
    }

    public final ConnectionResult b() {
        return this.b;
    }
}
