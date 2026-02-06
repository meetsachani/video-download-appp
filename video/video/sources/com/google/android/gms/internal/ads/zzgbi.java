package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
public final class zzgbi {
    public static byte a(long j) {
        boolean z;
        if ((j >> 8) == 0) {
            z = true;
        } else {
            z = false;
        }
        zzfvc.h(z, "out of range: %s", j);
        return (byte) j;
    }
}
