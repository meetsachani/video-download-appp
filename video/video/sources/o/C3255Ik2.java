package o;

import android.os.SystemClock;
import java.util.concurrent.TimeUnit;

/* renamed from: o.Ik2  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C3255Ik2 implements InterfaceC4540Vo2 {
    @Override // o.InterfaceC4540Vo2
    public long a() {
        return TimeUnit.NANOSECONDS.toMicros(SystemClock.elapsedRealtimeNanos());
    }

    @Override // o.InterfaceC4540Vo2
    public long b() {
        return TimeUnit.NANOSECONDS.toMicros(System.nanoTime());
    }
}
