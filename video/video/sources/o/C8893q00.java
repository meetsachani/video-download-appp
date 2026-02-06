package o;

import android.os.Handler;
import android.os.Looper;

/* renamed from: o.q00  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C8893q00 implements InterfaceC9020qW1 {
    public final Handler a;

    public C8893q00() {
        this.a = SF0.a(Looper.getMainLooper());
    }

    @Override // o.InterfaceC9020qW1
    public void a(Runnable runnable) {
        this.a.removeCallbacks(runnable);
    }

    @Override // o.InterfaceC9020qW1
    public void b(long delayInMillis, Runnable runnable) {
        this.a.postDelayed(runnable, delayInMillis);
    }

    public Handler c() {
        return this.a;
    }

    public C8893q00(Handler handler) {
        this.a = handler;
    }
}
