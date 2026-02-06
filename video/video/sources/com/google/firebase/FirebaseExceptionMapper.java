package com.google.firebase;

import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.StatusExceptionMapper;
import o.InterfaceC5670cr1;

@KeepForSdk
/* loaded from: classes3.dex */
public class FirebaseExceptionMapper implements StatusExceptionMapper {
    @Override // com.google.android.gms.common.api.internal.StatusExceptionMapper
    @InterfaceC5670cr1
    public final Exception a(@InterfaceC5670cr1 Status status) {
        if (status.E0() == 8) {
            return new FirebaseException(status.Z0());
        }
        return new FirebaseApiNotAvailableException(status.Z0());
    }
}
