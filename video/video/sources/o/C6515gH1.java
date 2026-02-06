package o;

import java.util.concurrent.atomic.AtomicReference;

/* renamed from: o.gH1  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C6515gH1 {
    public static /* synthetic */ boolean a(AtomicReference atomicReference, Object obj, Object obj2) {
        while (!atomicReference.compareAndSet(obj, obj2)) {
            if (atomicReference.get() != obj) {
                return false;
            }
        }
        return true;
    }
}
