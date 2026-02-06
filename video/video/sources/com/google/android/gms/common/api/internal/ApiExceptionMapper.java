package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.ApiExceptionUtil;
import o.InterfaceC5670cr1;

@KeepForSdk
/* loaded from: classes2.dex */
public class ApiExceptionMapper implements StatusExceptionMapper {
    @Override // com.google.android.gms.common.api.internal.StatusExceptionMapper
    @InterfaceC5670cr1
    public final Exception a(@InterfaceC5670cr1 Status status) {
        return ApiExceptionUtil.a(status);
    }
}
