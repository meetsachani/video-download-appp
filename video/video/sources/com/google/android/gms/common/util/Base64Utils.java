package com.google.android.gms.common.util;

import android.util.Base64;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.errorprone.annotations.ResultIgnorabilityUnspecified;
import o.InterfaceC5670cr1;

@KeepForSdk
/* loaded from: classes2.dex */
public final class Base64Utils {
    @InterfaceC5670cr1
    @KeepForSdk
    public static byte[] a(@InterfaceC5670cr1 String str) {
        if (str == null) {
            return null;
        }
        return Base64.decode(str, 0);
    }

    @InterfaceC5670cr1
    @KeepForSdk
    public static byte[] b(@InterfaceC5670cr1 String str) {
        if (str == null) {
            return null;
        }
        return Base64.decode(str, 10);
    }

    @ResultIgnorabilityUnspecified
    @InterfaceC5670cr1
    @KeepForSdk
    public static byte[] c(@InterfaceC5670cr1 String str) {
        if (str == null) {
            return null;
        }
        return Base64.decode(str, 11);
    }

    @InterfaceC5670cr1
    @KeepForSdk
    public static String d(@InterfaceC5670cr1 byte[] bArr) {
        if (bArr == null) {
            return null;
        }
        return Base64.encodeToString(bArr, 0);
    }

    @InterfaceC5670cr1
    @KeepForSdk
    public static String e(@InterfaceC5670cr1 byte[] bArr) {
        if (bArr == null) {
            return null;
        }
        return Base64.encodeToString(bArr, 10);
    }

    @InterfaceC5670cr1
    @KeepForSdk
    public static String f(@InterfaceC5670cr1 byte[] bArr) {
        if (bArr == null) {
            return null;
        }
        return Base64.encodeToString(bArr, 11);
    }
}
