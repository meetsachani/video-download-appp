package com.google.android.gms.common.api;

import com.google.android.gms.common.Feature;
import com.google.android.gms.common.annotation.KeepForSdk;
import o.InterfaceC5670cr1;

/* loaded from: classes2.dex */
public final class UnsupportedApiCallException extends UnsupportedOperationException {
    public final Feature X;

    @KeepForSdk
    public UnsupportedApiCallException(@InterfaceC5670cr1 Feature feature) {
        this.X = feature;
    }

    @Override // java.lang.Throwable
    @InterfaceC5670cr1
    public String getMessage() {
        return "Missing ".concat(String.valueOf(this.X));
    }
}
