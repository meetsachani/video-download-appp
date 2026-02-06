package com.google.android.gms.common.internal;

import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.api.ApiException;
import com.google.android.gms.common.api.ResolvableApiException;
import com.google.android.gms.common.api.Status;
import o.InterfaceC5670cr1;

@KeepForSdk
/* loaded from: classes2.dex */
public class ApiExceptionUtil {
    @InterfaceC5670cr1
    @KeepForSdk
    public static ApiException a(@InterfaceC5670cr1 Status status) {
        if (status.H0()) {
            return new ResolvableApiException(status);
        }
        return new ApiException(status);
    }
}
