package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
final class zzfwz {
    public static int a(int i, String str) {
        if (i >= 0) {
            return i;
        }
        throw new IllegalArgumentException(str + " cannot be negative but was: " + i);
    }

    public static void b(Object obj, Object obj2) {
        if (obj != null) {
            if (obj2 != null) {
                return;
            }
            String obj3 = obj.toString();
            throw new NullPointerException("null value in entry: " + obj3 + "=null");
        }
        throw new NullPointerException("null key in entry: null=".concat(String.valueOf(obj2)));
    }
}
