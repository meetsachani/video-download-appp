package o;

import java.util.concurrent.locks.LockSupport;

@InterfaceC5601ca0
/* renamed from: o.hx1  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C6920hx1 {
    public static final long a = 2147483647999999999L;

    public static void a(@MB Object obj, long j) {
        LockSupport.parkNanos(obj, Math.min(j, (long) a));
    }
}
