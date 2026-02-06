package o;

import sun.misc.Unsafe;

/* renamed from: o.mT2  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final /* synthetic */ class C8038mT2 {
    public static /* synthetic */ boolean a(Unsafe unsafe, Object obj, long j, Object obj2, Object obj3) {
        while (!unsafe.compareAndSwapObject(obj, j, obj2, obj3)) {
            if (unsafe.getObject(obj, j) != obj2) {
                return false;
            }
        }
        return true;
    }
}
