package o;

import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;

@Deprecated
/* renamed from: o.pk2  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class C8830pk2 implements LD {
    @Override // o.LD
    public long a() {
        return System.currentTimeMillis();
    }

    @Override // o.LD
    public long b() {
        return SystemClock.elapsedRealtime();
    }

    @Override // o.LD
    public long c() {
        return SystemClock.uptimeMillis();
    }

    @Override // o.LD
    public InterfaceC5285bG0 d(Looper looper, @InterfaceC11300zs1 Handler.Callback callback) {
        return new C9322rk2(new Handler(looper, callback));
    }

    @Override // o.LD
    public long nanoTime() {
        return System.nanoTime();
    }

    @Override // o.LD
    public void e() {
    }
}
