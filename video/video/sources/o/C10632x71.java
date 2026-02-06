package o;

import android.os.Handler;
import android.os.Looper;

/* renamed from: o.x71  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C10632x71 {
    public static volatile Handler a;

    public static Handler a() {
        if (a != null) {
            return a;
        }
        synchronized (C10632x71.class) {
            try {
                if (a == null) {
                    a = SF0.a(Looper.getMainLooper());
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return a;
    }
}
