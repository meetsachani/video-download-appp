package com.google.android.gms.ads;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import o.InterfaceC5670cr1;

/* loaded from: classes2.dex */
public final class AdInspectorError extends AdError {
    public static final int f = 0;
    public static final int g = 1;
    public static final int h = 2;
    public static final int i = 3;

    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: classes2.dex */
    public @interface AdInspectorErrorCode {
    }

    public AdInspectorError(int i2, @InterfaceC5670cr1 String str, @InterfaceC5670cr1 String str2) {
        super(i2, str, str2);
    }

    @Override // com.google.android.gms.ads.AdError
    public int b() {
        return super.b();
    }
}
