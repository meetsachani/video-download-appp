package com.google.android.gms.internal.ads;

import java.util.concurrent.atomic.AtomicReference;
import o.C6515gH1;

/* loaded from: classes2.dex */
public final /* synthetic */ class zzfdk {
    public static /* synthetic */ boolean a(AtomicReference atomicReference, Object obj, Object obj2) {
        while (!C6515gH1.a(atomicReference, null, obj2)) {
            if (atomicReference.get() != null) {
                return false;
            }
        }
        return true;
    }
}
