package com.google.android.gms.common;

import com.google.android.gms.common.annotation.KeepName;
import o.InterfaceC5670cr1;

@KeepName
/* loaded from: classes2.dex */
public class GooglePlayServicesManifestException extends IllegalStateException {
    public final int X;

    public GooglePlayServicesManifestException(int i, @InterfaceC5670cr1 String str) {
        super(str);
        this.X = i;
    }

    public int a() {
        return this.X;
    }

    public int b() {
        return GoogleApiAvailabilityLight.a;
    }
}
