package com.google.android.gms.internal.common;

import o.InterfaceC6181ey;
import org.jspecify.nullness.NullMarked;

@NullMarked
/* loaded from: classes2.dex */
public final class zzah {
    @InterfaceC6181ey
    public static Object[] a(Object[] objArr, int i) {
        for (int i2 = 0; i2 < i; i2++) {
            if (objArr[i2] == null) {
                throw new NullPointerException("at index " + i2);
            }
        }
        return objArr;
    }
}
