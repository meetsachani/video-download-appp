package com.google.android.gms.internal.ads;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import o.P2;

/* loaded from: classes2.dex */
public final /* synthetic */ class zzgbo {
    public static /* synthetic */ boolean a(AtomicReferenceFieldUpdater atomicReferenceFieldUpdater, Object obj, Object obj2, Object obj3) {
        while (!P2.a(atomicReferenceFieldUpdater, obj, obj2, obj3)) {
            if (atomicReferenceFieldUpdater.get(obj) != obj2) {
                return false;
            }
        }
        return true;
    }
}
