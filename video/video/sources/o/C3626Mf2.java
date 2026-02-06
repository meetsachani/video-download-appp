package o;

import java.util.concurrent.atomic.AtomicReferenceArray;

/* renamed from: o.Mf2  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final /* synthetic */ class C3626Mf2 {
    public static /* synthetic */ boolean a(AtomicReferenceArray atomicReferenceArray, int i, Object obj, Object obj2) {
        while (!atomicReferenceArray.compareAndSet(i, obj, obj2)) {
            if (atomicReferenceArray.get(i) != obj) {
                return false;
            }
        }
        return true;
    }
}
