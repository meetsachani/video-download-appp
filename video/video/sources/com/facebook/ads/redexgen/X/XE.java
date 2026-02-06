package com.facebook.ads.redexgen.X;

import com.facebook.ads.AdError;
import com.facebook.ads.internal.protocol.AdErrorType;

/* loaded from: assets/audience_network/classes2.dex */
public abstract class XE {
    public static AdError A00(C1145Vm c1145Vm) {
        if (c1145Vm.A03().isPublicError()) {
            return new AdError(c1145Vm.A03().getErrorCode(), c1145Vm.A04());
        }
        return new AdError(AdErrorType.UNKNOWN_ERROR.getErrorCode(), AdErrorType.UNKNOWN_ERROR.getDefaultErrorMessage());
    }
}
