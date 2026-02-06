package org.chromium.support_lib_boundary;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import o.InterfaceC11300zs1;
import o.InterfaceC5670cr1;

/* loaded from: classes4.dex */
public interface WebMessagePayloadBoundaryInterface extends FeatureFlagHolderBoundaryInterface {

    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: classes4.dex */
    public @interface WebMessagePayloadType {
        public static final int TYPE_ARRAY_BUFFER = 1;
        public static final int TYPE_STRING = 0;
    }

    @InterfaceC5670cr1
    byte[] getAsArrayBuffer();

    @InterfaceC11300zs1
    String getAsString();

    int getType();
}
