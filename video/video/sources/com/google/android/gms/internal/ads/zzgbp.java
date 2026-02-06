package com.google.android.gms.internal.ads;

import o.C8038mT2;
import sun.misc.Unsafe;

/* loaded from: classes2.dex */
public final /* synthetic */ class zzgbp {
    public static /* synthetic */ boolean a(Unsafe unsafe, Object obj, long j, Object obj2, Object obj3) {
        while (!C8038mT2.a(unsafe, obj, j, obj2, obj3)) {
            if (unsafe.getObject(obj, j) != obj2) {
                return false;
            }
        }
        return true;
    }
}
