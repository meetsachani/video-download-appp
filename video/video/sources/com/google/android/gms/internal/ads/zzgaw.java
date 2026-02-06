package com.google.android.gms.internal.ads;

import o.C10866y50;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class zzgaw {
    public static long a(double d) {
        zzfvc.f(b(d), "not a normal value");
        int exponent = Math.getExponent(d);
        long doubleToRawLongBits = Double.doubleToRawLongBits(d) & C10866y50.a;
        if (exponent == -1023) {
            return doubleToRawLongBits + doubleToRawLongBits;
        }
        return doubleToRawLongBits | C10866y50.f;
    }

    public static boolean b(double d) {
        if (Math.getExponent(d) <= 1023) {
            return true;
        }
        return false;
    }
}
