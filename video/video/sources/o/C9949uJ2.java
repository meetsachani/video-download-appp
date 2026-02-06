package o;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.PowerManager;

@Deprecated
/* renamed from: o.uJ2  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C9949uJ2 {
    public static final String e = "WakeLockManager";
    public static final String f = "ExoPlayer:WakeLockManager";
    @InterfaceC11300zs1
    public final PowerManager a;
    @InterfaceC11300zs1
    public PowerManager.WakeLock b;
    public boolean c;
    public boolean d;

    public C9949uJ2(Context context) {
        this.a = (PowerManager) context.getApplicationContext().getSystemService("power");
    }

    public void a(boolean z) {
        if (z && this.b == null) {
            PowerManager powerManager = this.a;
            if (powerManager == null) {
                I31.n(e, "PowerManager is null, therefore not creating the WakeLock.");
                return;
            }
            PowerManager.WakeLock newWakeLock = powerManager.newWakeLock(1, f);
            this.b = newWakeLock;
            newWakeLock.setReferenceCounted(false);
        }
        this.c = z;
        c();
    }

    public void b(boolean z) {
        this.d = z;
        c();
    }

    @SuppressLint({"WakelockTimeout"})
    public final void c() {
        PowerManager.WakeLock wakeLock = this.b;
        if (wakeLock == null) {
            return;
        }
        if (this.c && this.d) {
            wakeLock.acquire();
        } else {
            wakeLock.release();
        }
    }
}
