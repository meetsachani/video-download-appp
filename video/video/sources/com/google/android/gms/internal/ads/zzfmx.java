package com.google.android.gms.internal.ads;

import android.text.TextUtils;

/* loaded from: classes2.dex */
public final class zzfmx {
    public static void a() {
        if (zzfkz.b()) {
            return;
        }
        throw new IllegalStateException("Method called before OM SDK activation");
    }

    public static void b(String str, String str2) {
        if (!TextUtils.isEmpty(str)) {
            return;
        }
        throw new IllegalArgumentException(str2);
    }

    public static void c(Object obj, String str) {
        if (obj != null) {
            return;
        }
        throw new IllegalArgumentException(str);
    }

    public static void d(String str, int i, String str2) {
        if (str.length() <= 256) {
            return;
        }
        throw new IllegalArgumentException("CustomReferenceData is greater than 256 characters");
    }
}
