package com.google.android.gms.internal.ads;

import o.EG0;

/* loaded from: classes2.dex */
final class zzfxu {
    public static int a(int i) {
        return (int) (Integer.rotateLeft((int) (i * EG0.a), 15) * EG0.b);
    }

    public static int b(Object obj) {
        int hashCode;
        if (obj == null) {
            hashCode = 0;
        } else {
            hashCode = obj.hashCode();
        }
        return a(hashCode);
    }
}
